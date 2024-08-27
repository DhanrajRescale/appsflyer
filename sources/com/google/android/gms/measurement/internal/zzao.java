package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao implements Runnable {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzap zzb;

    public zzao(zzap zzapVar, zzgz zzgzVar) {
        this.zzb = zzapVar;
        this.zza = zzgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzay();
        if (zzab.zza()) {
            this.zza.zzaB().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
