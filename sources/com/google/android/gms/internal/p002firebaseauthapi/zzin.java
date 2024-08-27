package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzin implements zzbj {
    private final zzcl zza;
    private final zzoa zzb;

    public zzin(zzcl zzclVar) {
        zzoa zzoaVar;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzoaVar = zzkr.zza().zzb().zza(zzko.zza(zzclVar), "hybrid_decrypt", "decrypt");
        } else {
            zzoaVar = zzko.zza;
        }
        this.zzb = zzoaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzch zzchVar : this.zza.zze(copyOfRange)) {
                try {
                    byte[] zza = ((zzbj) zzchVar.zze()).zza(copyOfRange2, null);
                    zzchVar.zza();
                    int length2 = copyOfRange2.length;
                    return zza;
                } catch (GeneralSecurityException e10) {
                    logger = zzio.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (zzch zzchVar2 : this.zza.zze(zzbh.zza)) {
            try {
                byte[] zza2 = ((zzbj) zzchVar2.zze()).zza(bArr, null);
                zzchVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
