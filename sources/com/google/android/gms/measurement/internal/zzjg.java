package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.p002firebaseauthapi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjg implements Runnable {
    final /* synthetic */ zziq zza;
    final /* synthetic */ zzjy zzb;

    public zzjg(zzjy zzjyVar, zziq zziqVar) {
        this.zzb = zzjyVar;
        this.zza = zziqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzek zzekVar;
        zzjy zzjyVar = this.zzb;
        zzekVar = zzjyVar.zzb;
        if (zzekVar == null) {
            a.r(zzjyVar.zzt, "Failed to send current screen to service");
            return;
        }
        try {
            zziq zziqVar = this.zza;
            if (zziqVar == null) {
                zzekVar.zzq(0L, null, null, zzjyVar.zzt.zzaw().getPackageName());
            } else {
                zzekVar.zzq(zziqVar.zzc, zziqVar.zza, zziqVar.zzb, zzjyVar.zzt.zzaw().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send current screen to the service", e10);
        }
    }
}
