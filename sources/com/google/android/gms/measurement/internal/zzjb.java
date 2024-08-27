package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjb implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlj zzc;
    final /* synthetic */ zzjy zzd;

    public zzjb(zzjy zzjyVar, zzq zzqVar, boolean z10, zzlj zzljVar) {
        this.zzd = zzjyVar;
        this.zza = zzqVar;
        this.zzb = z10;
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzlj zzljVar;
        zzjy zzjyVar = this.zzd;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            a.r(zzjyVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjy zzjyVar2 = this.zzd;
        if (this.zzb) {
            zzljVar = null;
        } else {
            zzljVar = this.zzc;
        }
        zzjyVar2.zzD(zzekVar, zzljVar, this.zza);
        this.zzd.zzQ();
    }
}
