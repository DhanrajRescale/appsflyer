package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgg implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgw zzc;

    public zzgg(zzgw zzgwVar, zzac zzacVar, zzq zzqVar) {
        this.zzc = zzgwVar;
        this.zza = zzacVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlg zzlgVar3;
        zzlgVar = this.zzc.zza;
        zzlgVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlgVar3 = this.zzc.zza;
            zzlgVar3.zzO(this.zza, this.zzb);
        } else {
            zzlgVar2 = this.zzc.zza;
            zzlgVar2.zzU(this.zza, this.zzb);
        }
    }
}
