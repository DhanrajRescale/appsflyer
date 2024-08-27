package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import lp.g0;

/* loaded from: classes2.dex */
final class zzxi implements zzabl {
    final /* synthetic */ zzabl zza;
    final /* synthetic */ zzade zzb;
    final /* synthetic */ zzxj zzc;

    public zzxi(zzxj zzxjVar, zzabl zzablVar, zzade zzadeVar) {
        this.zzc = zzxjVar;
        this.zza = zzablVar;
        this.zzb = zzadeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzc.zzb.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzacu) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            zzacv zzacvVar = (zzacv) zzb.get(0);
            zzadq zzadqVar = new zzadq();
            zzadqVar.zze(this.zzb.zze());
            zzadqVar.zzb(this.zzc.zza);
            zzxj zzxjVar = this.zzc;
            zzyh.zzf(zzxjVar.zzc, zzxjVar.zzb, this.zzb, zzacvVar, zzadqVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
