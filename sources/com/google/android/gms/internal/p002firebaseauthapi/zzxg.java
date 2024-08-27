package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxg implements zzabl {
    final /* synthetic */ zzaec zza;
    final /* synthetic */ zzaae zzb;
    final /* synthetic */ zzyh zzc;

    public zzxg(zzyh zzyhVar, zzaec zzaecVar, zzaae zzaaeVar) {
        this.zzc = zzyhVar;
        this.zza = zzaecVar;
        this.zzb = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzb.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        this.zza.zzd(true);
        this.zza.zzc(((zzade) obj).zze());
        zzabmVar = this.zzc.zza;
        zzabmVar.zzp(this.zza, new zzxf(this, this));
    }
}
