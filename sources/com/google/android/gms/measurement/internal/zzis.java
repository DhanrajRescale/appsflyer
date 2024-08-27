package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzis implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zziq zzb;
    final /* synthetic */ zziq zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zziy zze;

    public zzis(zziy zziyVar, Bundle bundle, zziq zziqVar, zziq zziqVar2, long j10) {
        this.zze = zziyVar;
        this.zza = bundle;
        this.zzb = zziqVar;
        this.zzc = zziqVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziy.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
