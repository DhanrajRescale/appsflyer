package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkw implements Runnable {
    final /* synthetic */ zzlh zza;
    final /* synthetic */ zzlg zzb;

    public zzkw(zzlg zzlgVar, zzlh zzlhVar) {
        this.zzb = zzlgVar;
        this.zza = zzlhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
