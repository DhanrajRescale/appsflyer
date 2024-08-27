package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes2.dex */
final class zzxu implements zzabl {
    final /* synthetic */ zzabl zza;
    final /* synthetic */ zzade zzb;
    final /* synthetic */ zzxv zzc;

    public zzxu(zzxv zzxvVar, zzabl zzablVar, zzade zzadeVar) {
        this.zzc = zzxvVar;
        this.zza = zzablVar;
        this.zzb = zzadeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzacu) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            this.zzc.zza.zzk(this.zzb, (zzacv) zzb.get(0));
        } else {
            this.zza.zza("No users");
        }
    }
}
