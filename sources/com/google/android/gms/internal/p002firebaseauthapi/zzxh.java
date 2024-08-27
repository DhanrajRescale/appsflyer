package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxh implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;

    public zzxh(zzyh zzyhVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzade zzadeVar = (zzade) obj;
        zzadq zzadqVar = new zzadq();
        zzadqVar.zze(zzadeVar.zze());
        zzadqVar.zzd(null);
        zzadqVar.zzg(null);
        zzyh.zze(this.zzb, this.zza, zzadeVar, zzadqVar, this);
    }
}
