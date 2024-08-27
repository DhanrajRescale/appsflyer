package in.juspay.hypersdk.security;

import androidx.annotation.Keep;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.EncHelper;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.crypto.spec.SecretKeySpec;

@Keep
/* loaded from: classes2.dex */
public class EncryptionHelper extends EncHelper {
    private static final String LOG_TAG = "EncryptionHelper";
    private static final String algorithm = "AES";
    private static final byte[] logsEntryRequirement = {-52, 51, -68, -121, -44, -114, -59, -20, -79, 22, 34, -77, -48, -75, 45, 93};

    public static byte[] decryptThenGunzip(byte[] bArr, String str) {
        try {
            return gunzipContent(v1Decrypt(bArr));
        } catch (Exception e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception in decrypting", e10);
            throw new RuntimeException(e10);
        }
    }

    private static Key generateKey() {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(logsEntryRequirement);
            try {
                int available = byteArrayInputStream.available();
                byte[] bArr = new byte[available];
                int i10 = 0;
                do {
                    i10 += byteArrayInputStream.read(bArr);
                } while (i10 < available);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, algorithm);
                byteArrayInputStream.close();
                return secretKeySpec;
            } finally {
            }
        } catch (IOException e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, PaymentConstants.Category.SDK, LogSubCategory.Action.SYSTEM, "generate_key", null, e10);
            return null;
        }
    }

    @Keep
    public static String getSHA256Hash(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            String bytesToHexString = EncHelper.bytesToHexString(messageDigest.digest());
            JuspayLogger.d(LOG_TAG, "result is " + bytesToHexString);
            return bytesToHexString;
        } catch (NoSuchAlgorithmException e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception caught trying to SHA-256 hash", e10);
            return null;
        }
    }

    public static byte[] gunzipContent(byte[] bArr) {
        byte[] bArr2 = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, UserMetadata.MAX_ATTRIBUTE_SIZE);
                    while (true) {
                        try {
                            int read = gZIPInputStream.read(bArr2);
                            if (read == -1) {
                                gZIPInputStream.close();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                byteArrayInputStream.close();
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } catch (Throwable th2) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (IOException e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Error while gunzipping", e10);
            throw new RuntimeException(e10);
        }
    }

    public static byte[] gzipThenEncrypt(byte[] bArr, RSAPublicKey rSAPublicKey) {
        try {
            String constructPayload = JOSEUtils.constructPayload(JOSEUtils.jweEncrypt(Utils.gzipContent(bArr), "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}", rSAPublicKey));
            if (constructPayload != null) {
                return constructPayload.getBytes(StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception while GZipping and encrypting", e10);
            return null;
        }
    }

    public static byte[] gzipThenEncryptExp(byte[] bArr, RSAPublicKey rSAPublicKey, Map<String, String> map) {
        try {
            HashMap<String, Object> jweEncrypt = JOSEUtils.jweEncrypt(Utils.gzipContent(bArr), "{\"alg\":\"RSA-OAEP-256\",\"enc\":\"A256GCM\"}", rSAPublicKey);
            if (jweEncrypt.containsKey("headers") && jweEncrypt.containsKey("encryptedKey") && jweEncrypt.containsKey("iv") && jweEncrypt.containsKey("cipherText") && jweEncrypt.containsKey("authTag")) {
                String str = (String) jweEncrypt.get("headers");
                String str2 = (String) jweEncrypt.get("encryptedKey");
                String str3 = (String) jweEncrypt.get("iv");
                byte[] bArr2 = (byte[]) jweEncrypt.get("cipherText");
                String str4 = (String) jweEncrypt.get("authTag");
                if (str != null && str2 != null && str3 != null && bArr2 != null && str4 != null) {
                    map.put("protectedHeaders", str);
                    map.put("encryptedKey", str2);
                    map.put("iv", str3);
                    map.put("authTag", str4);
                    return bArr2;
                }
            }
            return null;
        } catch (Exception e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception while GZipping and encrypting", e10);
            return null;
        }
    }

    public static String md5(InputStream inputStream) {
        try {
            DigestInputStream digestInputStream = new DigestInputStream(inputStream, MessageDigest.getInstance("MD5"));
            do {
                try {
                } catch (Throwable th2) {
                    try {
                        digestInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } while (digestInputStream.read() != -1);
            byte[] digest = digestInputStream.getMessageDigest().digest();
            digestInputStream.close();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b10 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            return sb2.toString();
        } catch (IOException e10) {
            e = e10;
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception trying to get md5sum from input stream", e);
            return null;
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception trying to get md5sum from input stream", e);
            return null;
        }
    }

    public static byte[] v1Decrypt(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 8];
        int length = bArr.length;
        byte[] bArr3 = {bArr[9], bArr[19], bArr[29], bArr[39], bArr[49], bArr[59], bArr[69], bArr[79]};
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 % 10 != 9 || i10 >= 8) {
                bArr2[i11] = (byte) (bArr[i12] ^ bArr3[i11 % 8]);
                i11++;
            } else {
                i10++;
            }
        }
        return bArr2;
    }

    public static byte[] v1Encrypt(byte[] bArr) {
        byte[] gzipContent = Utils.gzipContent(bArr);
        byte[] bArr2 = new byte[8];
        new SecureRandom().nextBytes(bArr2);
        int length = gzipContent.length;
        int i10 = length + 8;
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i11 < length && i13 < i10; i13++) {
            if (i13 % 10 != 9 || i12 >= 8) {
                bArr3[i13] = (byte) (gzipContent[i11] ^ bArr2[i11 % 8]);
                i11++;
            } else {
                bArr3[i13] = bArr2[i12];
                i12++;
            }
        }
        return bArr3;
    }

    public static String md5(String str) {
        return md5(str.getBytes());
    }

    public static String md5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b10 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            return sb2.toString();
        } catch (NoSuchAlgorithmException e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.HELPER, "Exception trying to calculate md5sum from given string", e10);
            return null;
        }
    }
}
