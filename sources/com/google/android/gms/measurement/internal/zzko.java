package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class zzko extends zzf {
    protected final zzkn zza;
    protected final zzkm zzb;
    protected final zzkk zzc;
    private Handler zzd;

    public zzko(zzge zzgeVar) {
        super(zzgeVar);
        this.zza = new zzkn(this);
        this.zzb = new zzkm(this);
        this.zzc = new zzkk(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzko zzkoVar, long j10) {
        zzkoVar.zzg();
        zzkoVar.zzm();
        zzkoVar.zzt.zzaA().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkoVar.zzc.zza(j10);
        if (zzkoVar.zzt.zzf().zzu()) {
            zzkoVar.zzb.zzb(j10);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(zzko zzkoVar, long j10) {
        zzkoVar.zzg();
        zzkoVar.zzm();
        zzkoVar.zzt.zzaA().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkoVar.zzt.zzf().zzu() || zzkoVar.zzt.zzm().zzm.zzb()) {
            zzkoVar.zzb.zzc(j10);
        }
        zzkoVar.zzc.zzb();
        zzkn zzknVar = zzkoVar.zza;
        zzknVar.zza.zzg();
        if (!zzknVar.zza.zzt.zzJ()) {
            return;
        }
        zzknVar.zzb(zzknVar.zza.zzt.zzax().currentTimeMillis(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }
}
