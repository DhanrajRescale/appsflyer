package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzws implements zzabl {
    final /* synthetic */ zzabk zza;
    final /* synthetic */ zzaae zzb;
    final /* synthetic */ zzade zzc;
    final /* synthetic */ zzadq zzd;
    final /* synthetic */ zzyh zze;

    public zzws(zzyh zzyhVar, zzabk zzabkVar, zzaae zzaaeVar, zzade zzadeVar, zzadq zzadqVar) {
        this.zze = zzyhVar;
        this.zza = zzabkVar;
        this.zzb = zzaaeVar;
        this.zzc = zzadeVar;
        this.zzd = zzadqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzacu) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            zzyh.zzf(this.zze, this.zzb, this.zzc, (zzacv) zzb.get(0), this.zzd, this.zza);
        } else {
            this.zza.zza("No users");
        }
    }
}
