package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziv implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zziy zzb;

    public zziv(zziy zziyVar, long j10) {
        this.zzb = zziyVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
