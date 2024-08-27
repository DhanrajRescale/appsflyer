package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* loaded from: classes2.dex */
public final class zzjt implements zzcb {
    private static final Object zza = new Object();
    private static final String zzb = "zzjt";
    private KeyStore zzc;

    public zzjt() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.zzc = keyStore;
        } catch (IOException | GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean zzc(String str) throws GeneralSecurityException {
        zzjt zzjtVar = new zzjt();
        synchronized (zza) {
            try {
                if (zzjtVar.zzd(str)) {
                    return false;
                }
                String zza2 = zzvu.zza("android-keystore://", str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final synchronized zzbd zza(String str) throws GeneralSecurityException {
        zzjs zzjsVar;
        zzjsVar = new zzjs(zzvu.zza("android-keystore://", str), this.zzc);
        byte[] zza2 = zzvs.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzjsVar.zza(zzjsVar.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzjsVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final synchronized boolean zzb(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzd(String str) throws GeneralSecurityException {
        String zza2;
        zza2 = zzvu.zza("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzc = keyStore;
                keyStore.load(null);
                return this.zzc.containsAlias(zza2);
            } catch (IOException e10) {
                throw new GeneralSecurityException(e10);
            }
        }
        return this.zzc.containsAlias(zza2);
    }
}
