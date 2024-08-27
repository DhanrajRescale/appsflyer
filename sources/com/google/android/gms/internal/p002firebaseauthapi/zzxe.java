package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxe implements zzabl {
    final /* synthetic */ zzaej zza;
    final /* synthetic */ zzaae zzb;
    final /* synthetic */ zzyh zzc;

    public zzxe(zzyh zzyhVar, zzaej zzaejVar, zzaae zzaaeVar) {
        this.zzc = zzyhVar;
        this.zza = zzaejVar;
        this.zzb = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzb.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        this.zza.zzd(((zzade) obj).zze());
        zzabmVar = this.zzc.zza;
        zzabmVar.zzs(this.zza, new zzxd(this, this));
    }
}
