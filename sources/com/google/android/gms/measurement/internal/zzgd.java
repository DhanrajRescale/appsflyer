package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgd implements Runnable {
    final /* synthetic */ zzhh zza;
    final /* synthetic */ zzge zzb;

    public zzgd(zzge zzgeVar, zzhh zzhhVar) {
        this.zzb = zzgeVar;
        this.zza = zzhhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzge.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
