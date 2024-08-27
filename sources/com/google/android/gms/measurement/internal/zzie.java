package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzie implements Runnable {
    final /* synthetic */ zzai zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzai zzf;
    final /* synthetic */ zzij zzg;

    public zzie(zzij zzijVar, zzai zzaiVar, long j10, int i10, long j11, boolean z10, zzai zzaiVar2) {
        this.zzg = zzijVar;
        this.zza = zzaiVar;
        this.zzb = j10;
        this.zzc = i10;
        this.zzd = j11;
        this.zze = z10;
        this.zzf = zzaiVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzg.zzV(this.zza);
        this.zzg.zzL(this.zzb, false);
        zzij.zzw(this.zzg, this.zza, this.zzc, this.zzd, true, this.zze);
        zzqr.zzc();
        if (this.zzg.zzt.zzf().zzs(null, zzeh.zzan)) {
            zzij.zzv(this.zzg, this.zza, this.zzf);
        }
    }
}
