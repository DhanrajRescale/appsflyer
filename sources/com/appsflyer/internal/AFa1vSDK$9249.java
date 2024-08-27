package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.android.gms.search.SearchAuth;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
final class AFa1vSDK$9249 {
    private static byte[] AFInAppEventType = {0, 0, 0, 0, 0, 0, 0, 0};
    private static byte[] AFKeystoreWrapper = new byte[8];
    private Cipher valueOf;
    private byte[] values = new byte[16];
    private final SecureRandom AFInAppEventParameterName = new SecureRandom();

    public static AFa1vSDK$9249 AFInAppEventType(String str) {
        return new AFa1vSDK$9249(str);
    }

    private AFa1vSDK$9249(String str) {
        try {
            this.valueOf = Cipher.getInstance("AES/CBC/PKCS5Padding");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), AFInAppEventType, SearchAuth.StatusCodes.AUTH_DISABLED, 128)).getEncoded(), "AES");
            this.AFInAppEventParameterName.nextBytes(this.values);
            this.valueOf.init(1, secretKeySpec, new IvParameterSpec(this.values));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1aSDK.OTHER, "initWithPassword error", e10, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] AFKeystoreWrapper(byte[] bArr) throws Exception {
        if (bArr == null || this.valueOf == null) {
            return null;
        }
        this.AFInAppEventParameterName.nextBytes(AFKeystoreWrapper);
        byte[] doFinal = this.valueOf.doFinal(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(doFinal.length + this.values.length + AFKeystoreWrapper.length);
        allocate.put(doFinal).put(this.values).put(AFKeystoreWrapper);
        return allocate.array();
    }
}
