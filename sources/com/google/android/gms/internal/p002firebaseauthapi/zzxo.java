package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* loaded from: classes2.dex */
final class zzxo implements zzabl {
    final /* synthetic */ zzxp zza;

    public zzxo(zzxp zzxpVar) {
        this.zza = zzxpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzacn zzacnVar = (zzacn) obj;
        zzade zzadeVar = new zzade(zzacnVar.zzc(), zzacnVar.zzb(), Long.valueOf(zzadg.zza(zzacnVar.zzb())), "Bearer");
        zzxp zzxpVar = this.zza;
        zzxpVar.zzb.zzQ(zzadeVar, null, null, Boolean.FALSE, null, zzxpVar.zza, this);
    }
}
