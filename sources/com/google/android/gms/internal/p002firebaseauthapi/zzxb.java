package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxb implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;

    public zzxb(zzyh zzyhVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaek zzaekVar = (zzaek) obj;
        this.zzb.zzQ(new zzade(zzaekVar.zze(), zzaekVar.zzc(), Long.valueOf(zzaekVar.zzb()), "Bearer"), null, null, Boolean.valueOf(zzaekVar.zzg()), null, this.zza, this);
    }
}
