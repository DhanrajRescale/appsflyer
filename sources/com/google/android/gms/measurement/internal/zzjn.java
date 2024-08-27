package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjn implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjy zze;

    public zzjn(zzjy zzjyVar, boolean z10, zzq zzqVar, boolean z11, zzaw zzawVar, String str) {
        this.zze = zzjyVar;
        this.zza = zzqVar;
        this.zzb = z11;
        this.zzc = zzawVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzaw zzawVar;
        zzjy zzjyVar = this.zze;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            a.r(zzjyVar.zzt, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjy zzjyVar2 = this.zze;
        if (this.zzb) {
            zzawVar = null;
        } else {
            zzawVar = this.zzc;
        }
        zzjyVar2.zzD(zzekVar, zzawVar, this.zza);
        this.zze.zzQ();
    }
}
