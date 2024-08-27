package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxv implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;

    public zzxv(zzyh zzyhVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        zzade zzadeVar = (zzade) obj;
        zzact zzactVar = new zzact(zzadeVar.zze());
        zzabmVar = this.zzb.zza;
        zzabmVar.zze(zzactVar, new zzxu(this, this, zzadeVar));
    }
}
