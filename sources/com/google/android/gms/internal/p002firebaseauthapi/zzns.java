package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* loaded from: classes2.dex */
final class zzns implements zzcd {
    private final zzcl zza;
    private final zzoa zzb;
    private final zzoa zzc;

    public /* synthetic */ zzns(zzcl zzclVar, zznr zznrVar) {
        zzoa zzoaVar;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzob zzb = zzkr.zza().zzb();
            zzog zza = zzko.zza(zzclVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzoaVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzoaVar = zzko.zza;
            this.zzb = zzoaVar;
        }
        this.zzc = zzoaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzch zzchVar : this.zza.zze(copyOf)) {
                if (zzchVar.zzc().equals(zztv.LEGACY)) {
                    bArr3 = zzum.zzb(bArr2, zznt.zzf());
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzcd) zzchVar.zze()).zza(copyOfRange, bArr3);
                    zzchVar.zza();
                    return;
                } catch (GeneralSecurityException e10) {
                    zznt.zzd().logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
                }
            }
            for (zzch zzchVar2 : this.zza.zze(zzbh.zza)) {
                try {
                    ((zzcd) zzchVar2.zze()).zza(bArr, bArr2);
                    zzchVar2.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
