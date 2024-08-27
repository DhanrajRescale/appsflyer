package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzjk implements zzjb {
    private final zziw zza;
    private final int zzb;

    private zzjk(zziw zziwVar, int i10) {
        this.zza = zziwVar;
        this.zzb = i10;
    }

    public static zzjk zzc(int i10) throws GeneralSecurityException {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                return new zzjk(new zziw("HmacSha512"), 3);
            }
            return new zzjk(new zziw("HmacSha384"), 2);
        }
        return new zzjk(new zziw("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjb
    public final byte[] zza(byte[] bArr, zzjc zzjcVar) throws GeneralSecurityException {
        byte[] zzf = zzut.zzf(zzut.zzg(this.zzb, zzjcVar.zza().zzc()), zzut.zzh(zzut.zzi(this.zzb), 1, bArr));
        byte[] zzb = zzum.zzb(bArr, zzjcVar.zzb().zzc());
        byte[] zzd = zzjj.zzd(zzb());
        zziw zziwVar = this.zza;
        return zziwVar.zzb(null, zzf, "eae_prk", zzb, "shared_secret", zzd, zziwVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjb
    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.zzb - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                return zzjj.zze;
            }
            return zzjj.zzd;
        }
        return zzjj.zzc;
    }
}
