package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgp implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgw zzc;

    public zzgp(zzgw zzgwVar, zzaw zzawVar, zzq zzqVar) {
        this.zzc = zzgwVar;
        this.zza = zzawVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
