package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxc implements zzabl {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzaae zzc;
    final /* synthetic */ zzyh zzd;

    public zzxc(zzyh zzyhVar, String str, String str2, zzaae zzaaeVar) {
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
        zzade zzadeVar = (zzade) obj;
        zzadq zzadqVar = new zzadq();
        zzadqVar.zze(zzadeVar.zze());
        zzadqVar.zzd(this.zza);
        zzadqVar.zzg(this.zzb);
        zzyh.zze(this.zzd, this.zzc, zzadeVar, zzadqVar, this);
    }
}
