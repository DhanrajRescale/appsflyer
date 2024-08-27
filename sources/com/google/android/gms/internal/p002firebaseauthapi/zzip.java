package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
final class zzip implements zzbk {
    final zzcl zza;
    private final zzoa zzb;

    public zzip(zzcl zzclVar) {
        zzoa zzoaVar;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzoaVar = zzkr.zza().zzb().zza(zzko.zza(zzclVar), "hybrid_encrypt", "encrypt");
        } else {
            zzoaVar = zzko.zza;
        }
        this.zzb = zzoaVar;
    }
}
