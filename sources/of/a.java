package of;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.assetgro.stockgro.ui.main.lvl.licensing.util.Base64DecoderException;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f29973c = {MetadataMasks.ComponentParamMask, 74, 71, -80, MetadataMasks.ConfigurablePathSegmentMask, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: a, reason: collision with root package name */
    public final Cipher f29974a;

    /* renamed from: b, reason: collision with root package name */
    public final Cipher f29975b;

    public a(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, UserMetadata.MAX_ATTRIBUTE_SIZE, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f29974a = cipher;
            byte[] bArr2 = f29973c;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            Cipher cipher2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f29975b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("Invalid environment", e10);
        }
    }

    public final String a(String str, String str2) {
        try {
            String str3 = new String(this.f29975b.doFinal(pf.a.a(str)), StandardCharsets.UTF_8);
            if (str3.indexOf("com.google.android.vending.licensing.AESObfuscator-1|".concat(str2)) == 0) {
                return str3.substring(53 + str2.length());
            }
            throw new Exception("Header not found (invalid data or key):".concat(str));
        } catch (Base64DecoderException e10) {
            throw new Exception(e10.getMessage() + ":" + str);
        } catch (BadPaddingException e11) {
            throw new Exception(e11.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e12) {
            throw new Exception(e12.getMessage() + ":" + str);
        }
    }
}
