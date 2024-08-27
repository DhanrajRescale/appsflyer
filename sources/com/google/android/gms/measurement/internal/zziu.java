package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziu implements Runnable {
    final /* synthetic */ zziy zza;

    public zziu(zziy zziyVar) {
        this.zza = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar;
        zziy zziyVar = this.zza;
        zziqVar = zziyVar.zzh;
        zziyVar.zza = zziqVar;
    }
}
