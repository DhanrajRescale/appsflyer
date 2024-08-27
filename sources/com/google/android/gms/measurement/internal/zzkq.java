package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkq extends zzap {
    final /* synthetic */ zzkr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkq(zzkr zzkrVar, zzgz zzgzVar) {
        super(zzgzVar);
        this.zza = zzkrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zza();
        a.y(this.zza.zzt, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzX();
    }
}
