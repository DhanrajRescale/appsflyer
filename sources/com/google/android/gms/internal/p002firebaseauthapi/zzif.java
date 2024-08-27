package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzif implements zzbi {
    private final zzcl zza;
    private final zzoa zzb;
    private final zzoa zzc;

    public zzif(zzcl zzclVar) {
        zzoa zzoaVar;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzob zzb = zzkr.zza().zzb();
            zzog zza = zzko.zza(zzclVar);
            this.zzb = zzb.zza(zza, "daead", "encrypt");
            zzoaVar = zzb.zza(zza, "daead", "decrypt");
        } else {
            zzoaVar = zzko.zza;
            this.zzb = zzoaVar;
        }
        this.zzc = zzoaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzch zzchVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzbi) zzchVar.zze()).zza(copyOfRange, bArr2);
                    zzchVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException e10) {
                    logger = zzig.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (zzch zzchVar2 : this.zza.zze(zzbh.zza)) {
            try {
                byte[] zza2 = ((zzbi) zzchVar2.zze()).zza(bArr, bArr2);
                zzchVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
