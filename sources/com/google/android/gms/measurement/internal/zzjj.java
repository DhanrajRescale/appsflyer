package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjj implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjy zzd;

    public zzjj(zzjy zzjyVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjyVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzge zzgeVar;
        zzek zzekVar;
        byte[] bArr = null;
        try {
            try {
                zzjy zzjyVar = this.zzd;
                zzekVar = zzjyVar.zzb;
                if (zzekVar == null) {
                    zzjyVar.zzt.zzaA().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzgeVar = this.zzd.zzt;
                } else {
                    bArr = zzekVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzgeVar = this.zzd.zzt;
                }
            } catch (RemoteException e10) {
                this.zzd.zzt.zzaA().zzd().zzb("Failed to send event to the service to bundle", e10);
                zzgeVar = this.zzd.zzt;
            }
            zzgeVar.zzv().zzT(this.zzc, bArr);
        } catch (Throwable th2) {
            this.zzd.zzt.zzv().zzT(this.zzc, bArr);
            throw th2;
        }
    }
}
