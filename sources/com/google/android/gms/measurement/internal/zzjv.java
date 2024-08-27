package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes2.dex */
final class zzjv implements Runnable {
    final /* synthetic */ zzjx zza;

    public zzjv(zzjx zzjxVar) {
        this.zza = zzjxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy zzjyVar = this.zza.zza;
        Context zzaw = zzjyVar.zzt.zzaw();
        this.zza.zza.zzt.zzay();
        zzjy.zzo(zzjyVar, new ComponentName(zzaw, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
