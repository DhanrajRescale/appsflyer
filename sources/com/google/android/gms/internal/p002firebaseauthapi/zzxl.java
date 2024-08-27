package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxl implements zzabl {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzaae zzc;
    final /* synthetic */ zzyh zzd;

    public zzxl(zzyh zzyhVar, String str, String str2, zzaae zzaaeVar) {
        this.zzd = zzyhVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzc.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzabm zzabmVar;
        zzael zzaelVar = new zzael(((zzade) obj).zze(), this.zza, this.zzb);
        zzabmVar = this.zzd.zza;
        zzabmVar.zzt(zzaelVar, new zzxk(this));
    }
}
