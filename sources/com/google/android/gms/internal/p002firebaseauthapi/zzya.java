package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzya implements zzabl {
    final /* synthetic */ zzaae zza;
    final /* synthetic */ zzyh zzb;

    public zzya(zzyh zzyhVar, zzaae zzaaeVar) {
        this.zzb = zzyhVar;
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaee zzaeeVar = (zzaee) obj;
        if (!zzaeeVar.zzm()) {
            zzyh.zzd(this.zzb, zzaeeVar, this.zza, this);
        } else {
            this.zza.zzf(new zzwn(zzaeeVar.zzg(), zzaeeVar.zzl(), zzaeeVar.zzc()));
        }
    }
}
