package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzfb implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzfc zzb;

    public zzfb(zzfc zzfcVar, boolean z10) {
        this.zzb = zzfcVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlgVar = this.zzb.zzb;
        zzlgVar.zzJ(this.zza);
    }
}
