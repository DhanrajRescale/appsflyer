package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import lp.g0;

/* loaded from: classes2.dex */
final class zzxk implements zzabl {
    final /* synthetic */ zzxl zza;

    public zzxk(zzxl zzxlVar) {
        this.zza = zzxlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzc.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaem zzaemVar = (zzaem) obj;
        if (!TextUtils.isEmpty(zzaemVar.zzb()) && !TextUtils.isEmpty(zzaemVar.zzc())) {
            zzade zzadeVar = new zzade(zzaemVar.zzc(), zzaemVar.zzb(), Long.valueOf(zzadg.zza(zzaemVar.zzb())), "Bearer");
            zzxl zzxlVar = this.zza;
            zzxlVar.zzd.zzQ(zzadeVar, null, null, Boolean.FALSE, null, zzxlVar.zzc, this);
            return;
        }
        this.zza.zzc.zzh(g0.p("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
