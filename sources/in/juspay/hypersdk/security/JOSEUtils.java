package in.juspay.hypersdk.security;

import a3.a;
import da.e;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JOSEUtils {
    public static RSAPublicKey JWKtoRSAPublicKey(JSONObject jSONObject) {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, Base64Codec.decode(jSONObject.getString("n"))), new BigInteger(1, Base64Codec.decode(jSONObject.getString("e")))));
    }

    public static void assertIfMatches(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        throw new Exception("Assert failed, org=" + str + ", expected=" + str2);
    }

    public static void assertIfSupportedEncAlg(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1868738169:
                if (str.equals("RSA1_5")) {
                    c10 = 0;
                    break;
                }
                break;
            case -890830960:
                if (str.equals("RSA-OAEP-256")) {
                    c10 = 1;
                    break;
                }
                break;
            case -565207670:
                if (str.equals("RSA-OAEP")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                throw new Exception("Not supported signing alg ".concat(str));
        }
    }

    public static void assertIfSupportedSigningAlg(String str) {
        str.getClass();
        if (!str.equals("RS256") && !str.equals("RS512")) {
            throw new Exception("Not supported signing alg ".concat(str));
        }
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                for (byte[] bArr2 : bArr) {
                    if (bArr2 != null) {
                        byteArrayOutputStream.write(bArr2);
                    }
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    public static String constructPayload(HashMap<String, Object> hashMap) {
        if (!hashMap.containsKey("headers") || !hashMap.containsKey("encryptedKey") || !hashMap.containsKey("iv") || !hashMap.containsKey("cipherText") || !hashMap.containsKey("authTag")) {
            return null;
        }
        String str = (String) hashMap.get("headers");
        String str2 = (String) hashMap.get("encryptedKey");
        String str3 = (String) hashMap.get("iv");
        byte[] bArr = (byte[]) hashMap.get("cipherText");
        String str4 = (String) hashMap.get("authTag");
        if (str == null || str2 == null || str3 == null || bArr == null || str4 == null) {
            return null;
        }
        return str + "." + str2 + "." + str3 + "." + Base64Codec.encodeToString(bArr, true) + "." + str4;
    }

    public static String extractKey(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str2);
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        throw new Exception(a.f("JWS Sign - header missing ", str));
    }

    public static String getJavaAlg(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1868738169:
                if (str.equals("RSA1_5")) {
                    c10 = 0;
                    break;
                }
                break;
            case -890830960:
                if (str.equals("RSA-OAEP-256")) {
                    c10 = 1;
                    break;
                }
                break;
            case -565207670:
                if (str.equals("RSA-OAEP")) {
                    c10 = 2;
                    break;
                }
                break;
            case 78251122:
                if (str.equals("RS256")) {
                    c10 = 3;
                    break;
                }
                break;
            case 78253877:
                if (str.equals("RS512")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "RSA/ECB/PKCS1Padding";
            case 1:
                return "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            case 2:
                return "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
            case 3:
                return "SHA256withRSA";
            case 4:
                return "SHA512withRSA";
            default:
                throw new Exception("Not supported signing alg ".concat(str));
        }
    }

    public static JSONObject jweDecrypt(String str, PrivateKey privateKey) {
        GCMParameterSpec gCMParameterSpec;
        String[] split = str.split("\\.");
        String str2 = new String(Base64Codec.decode(split[0]));
        String extractKey = extractKey("alg", str2);
        assertIfSupportedEncAlg(extractKey);
        assertIfMatches(extractKey("enc", str2), "A256GCM");
        new SecureRandom().nextBytes(new byte[2048]);
        String str3 = split[1];
        Cipher cipher = Cipher.getInstance(getJavaAlg(extractKey));
        cipher.init(2, privateKey);
        SecretKeySpec secretKeySpec = new SecretKeySpec(cipher.doFinal(Base64Codec.decode(str3)), "AES");
        byte[] bytes = Base64Codec.encodeToString(str2.getBytes(StandardCharsets.UTF_8), true).getBytes(StandardCharsets.US_ASCII);
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(secretKeySpec.getEncoded(), "AES");
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            gCMParameterSpec = new GCMParameterSpec(128, Base64Codec.decode(split[2]));
        } catch (Exception unused) {
            gCMParameterSpec = new GCMParameterSpec(128, Base64Codec.decode(split[2]));
        }
        cipher2.init(2, secretKeySpec2, gCMParameterSpec);
        cipher2.updateAAD(bytes);
        byte[] doFinal = cipher2.doFinal(concat(Base64Codec.decode(split[3]), Base64Codec.decode(split[4])));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headers", str2);
        jSONObject.put(PaymentConstants.PAYLOAD, new String(doFinal));
        return jSONObject;
    }

    public static String jweEncrypt(String str, String str2, byte[] bArr) {
        return constructPayload(jweEncrypt(str.getBytes(StandardCharsets.UTF_8), str2, (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr))));
    }

    public static String jwsSign(String str, String str2, PrivateKey privateKey) {
        StringBuilder sb2 = new StringBuilder();
        Charset charset = StandardCharsets.UTF_8;
        sb2.append(Base64Codec.encodeToString(str2.getBytes(charset), true));
        sb2.append(".");
        sb2.append(Base64Codec.encodeToString(str.getBytes(charset), true));
        String sb3 = sb2.toString();
        String extractKey = extractKey("alg", str2);
        assertIfSupportedSigningAlg(extractKey);
        Signature signature = Signature.getInstance(getJavaAlg(extractKey));
        signature.initSign(privateKey);
        signature.update(sb3.getBytes(charset));
        byte[] sign = signature.sign();
        StringBuilder r10 = e.r(sb3, ".");
        r10.append(Base64Codec.encodeToString(sign, true));
        return r10.toString();
    }

    public static boolean jwsVerify(String str, byte[] bArr) {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        String[] split = str.split("\\.");
        if (split.length != 3) {
            throw new Exception("JWS Verify - mandatory params missing " + split.length);
        }
        String str2 = split[0] + "." + split[1];
        String extractKey = extractKey("alg", new String(Base64Codec.decode(split[0])));
        assertIfSupportedSigningAlg(extractKey);
        Signature signature = Signature.getInstance(getJavaAlg(extractKey));
        signature.initVerify(rSAPublicKey);
        signature.update(str2.getBytes(StandardCharsets.UTF_8));
        return signature.verify(Base64Codec.decode(split[2]));
    }

    public static byte[] subArray(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static HashMap<String, Object> jweEncrypt(byte[] bArr, String str, RSAPublicKey rSAPublicKey) {
        GCMParameterSpec gCMParameterSpec;
        byte[] iv2;
        String extractKey = extractKey("alg", str);
        assertIfSupportedEncAlg(extractKey);
        assertIfMatches(extractKey("enc", str), "A256GCM");
        byte[] bArr2 = new byte[32];
        new SecureRandom().nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        Cipher cipher = Cipher.getInstance(getJavaAlg(extractKey));
        cipher.init(1, rSAPublicKey);
        String encodeToString = Base64Codec.encodeToString(cipher.doFinal(secretKeySpec.getEncoded()), true);
        byte[] bytes = Base64Codec.encodeToString(str.getBytes(StandardCharsets.UTF_8), true).getBytes(StandardCharsets.US_ASCII);
        byte[] bArr3 = new byte[12];
        new SecureRandom().nextBytes(bArr3);
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        } catch (Exception unused) {
            gCMParameterSpec = new GCMParameterSpec(128, bArr3);
        }
        cipher2.init(1, secretKeySpec, gCMParameterSpec);
        cipher2.updateAAD(bytes);
        byte[] doFinal = cipher2.doFinal(bArr);
        int length = doFinal.length - 16;
        byte[] subArray = subArray(doFinal, 0, length);
        byte[] subArray2 = subArray(doFinal, length, 16);
        try {
            iv2 = ((GCMParameterSpec) cipher2.getParameters().getParameterSpec(GCMParameterSpec.class)).getIV();
        } catch (Exception unused2) {
            iv2 = ((GCMParameterSpec) cipher2.getParameters().getParameterSpec(GCMParameterSpec.class)).getIV();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("encryptedKey", encodeToString);
        hashMap.put("iv", Base64Codec.encodeToString(iv2, true));
        hashMap.put("cipherText", subArray);
        hashMap.put("authTag", Base64Codec.encodeToString(subArray2, true));
        hashMap.put("headers", Base64Codec.encodeToString(str.getBytes(StandardCharsets.UTF_8), true));
        return hashMap;
    }
}
