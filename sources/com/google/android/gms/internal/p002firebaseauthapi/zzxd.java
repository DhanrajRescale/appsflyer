package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import zp.o;

/* loaded from: classes2.dex */
final class zzxd implements zzabl {
    final /* synthetic */ zzabl zza;
    final /* synthetic */ zzxe zzb;

    public zzxd(zzxe zzxeVar, zzabl zzablVar) {
        this.zzb = zzxeVar;
        this.zza = zzablVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabk
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabl
    public final void zzb(Object obj) {
        zzaek zzaekVar = (zzaek) obj;
        if (!TextUtils.isEmpty(zzaekVar.zzf())) {
            this.zzb.zzb.zzg(new Status(17025), new o(null, null, zzaekVar.zzd(), zzaekVar.zzf(), true));
        } else {
            this.zzb.zzc.zzQ(new zzade(zzaekVar.zze(), zzaekVar.zzc(), Long.valueOf(zzaekVar.zzb()), "Bearer"), null, "phone", Boolean.valueOf(zzaekVar.zzg()), null, this.zzb.zzb, this.zza);
        }
    }
}
