package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjh implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjy zzc;

    public zzjh(zzjy zzjyVar, zzq zzqVar, Bundle bundle) {
        this.zzc = zzjyVar;
        this.zza = zzqVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzjy zzjyVar = this.zzc;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            a.r(zzjyVar.zzt, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzekVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzt.zzaA().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
