package com.google.android.gms.internal.p002firebaseauthapi;

import lp.g0;
import zp.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzyc implements zzabl {
    final /* synthetic */ x zza;
    final /* synthetic */ zzaae zzb;
    final /* synthetic */ zzyh zzc;

    public zzyc(zzyh zzyhVar, x xVar, zzaae zzaaeVar) {
        this.zzc = zzyhVar;
        this.zza = xVar;
        this.zzb = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zzb.zzh(g0.p(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final void zzb(Object obj) {
        zzade zzadeVar = (zzade) obj;
        zzadq zzadqVar = new zzadq();
        zzadqVar.zze(zzadeVar.zze());
        x xVar = this.zza;
        if (xVar.f42788c || xVar.f42786a != null) {
            zzadqVar.zzc(xVar.f42786a);
        }
        x xVar2 = this.zza;
        if (xVar2.f42789d || xVar2.f42790e != null) {
            zzadqVar.zzh(xVar2.f42787b);
        }
        zzyh.zze(this.zzc, this.zzb, zzadeVar, zzadqVar, this);
    }
}
