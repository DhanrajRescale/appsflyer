package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzkg implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzko zzb;

    public zzkg(zzko zzkoVar, long j10) {
        this.zzb = zzkoVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzko.zzl(this.zzb, this.zza);
    }
}
