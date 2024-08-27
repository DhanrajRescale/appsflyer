package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziw implements Runnable {
    final /* synthetic */ zziq zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zziy zzc;

    public zziw(zziy zziyVar, zziq zziqVar, long j10) {
        this.zzc = zziyVar;
        this.zza = zziqVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zziy zziyVar = this.zzc;
        zziyVar.zza = null;
        zziyVar.zzt.zzt().zzG(null);
    }
}
