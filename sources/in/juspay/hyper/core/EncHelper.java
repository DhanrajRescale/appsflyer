package in.juspay.hyper.core;

import androidx.annotation.NonNull;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.PrivateKey;

/* loaded from: classes2.dex */
public class EncHelper {
    @NonNull
    public static String bytesToHexString(@NonNull byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    @NonNull
    public static KeyStore getAndroidKeyStore() throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        return keyStore;
    }

    @NonNull
    public static KeyPair getKeyPair(String str) throws Exception {
        KeyStore androidKeyStore = getAndroidKeyStore();
        return new KeyPair(androidKeyStore.getCertificate(str).getPublicKey(), (PrivateKey) androidKeyStore.getKey(str, null));
    }
}
