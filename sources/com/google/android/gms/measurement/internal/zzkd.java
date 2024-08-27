package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzkd implements Runnable {
    final /* synthetic */ zzlg zza;
    final /* synthetic */ Runnable zzb;

    public zzkd(zzkf zzkfVar, zzlg zzlgVar, Runnable runnable) {
        this.zza = zzlgVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzX();
    }
}
