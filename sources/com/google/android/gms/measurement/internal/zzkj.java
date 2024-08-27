package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzql;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkj implements Runnable {
    final long zza;
    final long zzb;
    final /* synthetic */ zzkk zzc;

    public zzkj(zzkk zzkkVar, long j10, long j11) {
        this.zzc = zzkkVar;
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzki
            @Override // java.lang.Runnable
            public final void run() {
                zzkj zzkjVar = zzkj.this;
                zzkk zzkkVar = zzkjVar.zzc;
                long j10 = zzkjVar.zza;
                long j11 = zzkjVar.zzb;
                zzkkVar.zza.zzg();
                zzkkVar.zza.zzt.zzaA().zzc().zza("Application going to the background");
                zzkkVar.zza.zzt.zzm().zzm.zza(true);
                if (!zzkkVar.zza.zzt.zzf().zzu()) {
                    zzkkVar.zza.zzb.zzb(j11);
                    zzkkVar.zza.zzb.zzd(false, false, j11);
                }
                zzql.zzc();
                if (zzkkVar.zza.zzt.zzf().zzs(null, zzeh.zzaB)) {
                    zzkkVar.zza.zzt.zzaA().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
                } else {
                    zzkkVar.zza.zzt.zzq().zzH("auto", "_ab", j10, new Bundle());
                }
            }
        });
    }
}
