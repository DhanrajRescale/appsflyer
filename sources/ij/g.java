package ij;

import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f20064a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f20065b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f20066c;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f20064a = forName;
        f20065b = "AES/ECB/PKCS5Padding";
        f20066c = "+puW8Vbh7E/dJ9B1";
    }

    public static String a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(message, "message");
        String key = f20066c;
        Intrinsics.checkNotNullParameter(key, "key");
        byte[] bytes = key.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Cipher cipher = Cipher.getInstance(f20065b);
            Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes2 = message.getBytes(f20064a);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            String encodeToString = Base64.encodeToString(cipher.doFinal(bytes2), 2);
            Intrinsics.c(encodeToString);
            return encodeToString;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
