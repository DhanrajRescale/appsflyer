package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxp implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;
    final /* synthetic */ zzacp zzc;

    public zzxp(zzyh zzyhVar, zzacp zzacpVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zzc = zzacpVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        this.zzc.zzc(((zzade) obj).zze());
        zzabmVar = this.zzb.zza;
        zzabmVar.zzu(this.zzc, new zzxo(this));
    }
}
