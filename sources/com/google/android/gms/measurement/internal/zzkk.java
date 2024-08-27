package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkk {
    final /* synthetic */ zzko zza;
    private zzkj zzb;

    public zzkk(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    public final void zza(long j10) {
        Handler handler;
        this.zzb = new zzkj(this, this.zza.zzt.zzax().currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzkj zzkjVar = this.zzb;
        if (zzkjVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzkjVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
