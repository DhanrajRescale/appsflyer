package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzjm implements zzjb {
    private final zziw zza;

    public zzjm(zziw zziwVar) {
        this.zza = zziwVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjb
    public final byte[] zza(byte[] bArr, zzjc zzjcVar) throws GeneralSecurityException {
        byte[] zza = zzvv.zza(zzjcVar.zza().zzc(), bArr);
        byte[] zzb = zzum.zzb(bArr, zzjcVar.zzb().zzc());
        byte[] zzd = zzjj.zzd(zzjj.zzb);
        zziw zziwVar = this.zza;
        return zziwVar.zzb(null, zza, "eae_prk", zzb, "shared_secret", zzd, zziwVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzjb
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzjj.zzf)) {
            return zzjj.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
