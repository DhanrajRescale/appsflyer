package com.google.android.gms.internal.p002firebaseauthapi;

import zp.r;

/* loaded from: classes2.dex */
final class zzabc implements Runnable {
    final /* synthetic */ zzabe zza;
    final /* synthetic */ zzabd zzb;

    public zzabc(zzabd zzabdVar, zzabe zzabeVar) {
        this.zzb = zzabdVar;
        this.zza = zzabeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzl) {
            try {
                if (!this.zzb.zza.zzl.isEmpty()) {
                    this.zza.zza((r) this.zzb.zza.zzl.get(0), new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
