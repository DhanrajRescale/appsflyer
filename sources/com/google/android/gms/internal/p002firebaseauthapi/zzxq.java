package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* loaded from: classes2.dex */
final class zzxq implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;

    public zzxq(zzyh zzyhVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaco zzacoVar = (zzaco) obj;
        this.zzb.zzQ(new zzade(zzacoVar.zzc(), zzacoVar.zzb(), Long.valueOf(zzadg.zza(zzacoVar.zzb())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
