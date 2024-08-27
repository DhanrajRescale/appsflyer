package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgs implements Runnable {
    final /* synthetic */ zzlj zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgw zzc;

    public zzgs(zzgw zzgwVar, zzlj zzljVar, zzq zzqVar) {
        this.zzc = zzgwVar;
        this.zza = zzljVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlg zzlgVar3;
        zzlgVar = this.zzc.zza;
        zzlgVar.zzA();
        if (this.zza.zza() == null) {
            zzlgVar3 = this.zzc.zza;
            zzlgVar3.zzP(this.zza.zzb, this.zzb);
        } else {
            zzlgVar2 = this.zzc.zza;
            zzlgVar2.zzW(this.zza, this.zzb);
        }
    }
}
