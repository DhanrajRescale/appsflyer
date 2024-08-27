package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxj implements zzabl {
    final /* synthetic */ String zza;
    final /* synthetic */ zzaae zzb;
    final /* synthetic */ zzyh zzc;

    public zzxj(zzyh zzyhVar, String str, zzaae zzaaeVar) {
        this.zzc = zzyhVar;
        this.zza = str;
        this.zzb = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzb.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        zzade zzadeVar = (zzade) obj;
        zzact zzactVar = new zzact(zzadeVar.zze());
        zzabmVar = this.zzc.zza;
        zzabmVar.zze(zzactVar, new zzxi(this, this, zzadeVar));
    }
}
