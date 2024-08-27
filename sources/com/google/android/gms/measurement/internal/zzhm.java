package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhm implements Runnable {
    final /* synthetic */ zzij zza;

    public zzhm(zzij zzijVar) {
        this.zza = zzijVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
