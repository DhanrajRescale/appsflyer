package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzq zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzjy zze;

    public zzjq(zzjy zzjyVar, String str, String str2, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzjyVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzqVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzge zzgeVar;
        zzek zzekVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzjy zzjyVar = this.zze;
                zzekVar = zzjyVar.zzb;
                if (zzekVar == null) {
                    zzjyVar.zzt.zzaA().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzgeVar = this.zze.zzt;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlo.zzH(zzekVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzgeVar = this.zze.zzt;
                }
            } catch (RemoteException e10) {
                this.zze.zzt.zzaA().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e10);
                zzgeVar = this.zze.zzt;
            }
            zzgeVar.zzv().zzR(this.zzd, arrayList);
        } catch (Throwable th2) {
            this.zze.zzt.zzv().zzR(this.zzd, arrayList);
            throw th2;
        }
    }
}
