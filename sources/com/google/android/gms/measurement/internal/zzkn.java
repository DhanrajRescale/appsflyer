package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkn {
    final /* synthetic */ zzko zza;

    public zzkn(zzko zzkoVar) {
        this.zza = zzkoVar;
    }

    public final void zza() {
        this.zza.zzg();
        if (this.zza.zzt.zzm().zzk(this.zza.zzt.zzax().currentTimeMillis())) {
            this.zza.zzt.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                a.y(this.zza.zzt, "Detected application was in foreground");
                zzc(this.zza.zzt.zzax().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j10, boolean z10) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzt.zzm().zzk(j10)) {
            this.zza.zzt.zzm().zzg.zza(true);
            zzqr.zzc();
            if (this.zza.zzt.zzf().zzs(null, zzeh.zzan)) {
                this.zza.zzt.zzh().zzo();
            }
        }
        this.zza.zzt.zzm().zzj.zzb(j10);
        if (this.zza.zzt.zzm().zzg.zzb()) {
            zzc(j10, z10);
        }
    }

    @VisibleForTesting
    public final void zzc(long j10, boolean z10) {
        this.zza.zzg();
        if (!this.zza.zzt.zzJ()) {
            return;
        }
        this.zza.zzt.zzm().zzj.zzb(j10);
        this.zza.zzt.zzaA().zzj().zzb("Session started, time", Long.valueOf(this.zza.zzt.zzax().elapsedRealtime()));
        Long valueOf = Long.valueOf(j10 / 1000);
        this.zza.zzt.zzq().zzY("auto", "_sid", valueOf, j10);
        this.zza.zzt.zzm().zzk.zzb(valueOf.longValue());
        this.zza.zzt.zzm().zzg.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.zza.zzt.zzf().zzs(null, zzeh.zzab) && z10) {
            bundle.putLong("_aib", 1L);
        }
        this.zza.zzt.zzq().zzH("auto", "_s", j10, bundle);
        zzos.zzc();
        if (this.zza.zzt.zzf().zzs(null, zzeh.zzae)) {
            String zza = this.zza.zzt.zzm().zzp.zza();
            if (!TextUtils.isEmpty(zza)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.zza.zzt.zzq().zzH("auto", "_ssr", j10, bundle2);
            }
        }
    }
}
