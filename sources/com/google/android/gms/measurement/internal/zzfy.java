package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfy implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzgb zza;
    private final String zzb;

    public zzfy(zzgb zzgbVar, String str) {
        this.zza = zzgbVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.zza.zzt.zzaA().zzd().zzb(this.zzb, th2);
    }
}
