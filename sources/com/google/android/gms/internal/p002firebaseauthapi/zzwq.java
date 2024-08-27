package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;
import zp.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzwq implements zzabl {
    final /* synthetic */ f zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzaae zzc;
    final /* synthetic */ zzyh zzd;

    public zzwq(zzyh zzyhVar, f fVar, String str, zzaae zzaaeVar) {
        this.zzd = zzyhVar;
        this.zza = fVar;
        this.zzb = str;
        this.zzc = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzc.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzP(new zzacl(this.zza, ((zzade) obj).zze(), this.zzb), this.zzc);
    }
}
