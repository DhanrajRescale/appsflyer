package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgh implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzgw zzb;

    public zzgh(zzgw zzgwVar, zzac zzacVar) {
        this.zzb = zzgwVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlg zzlgVar3;
        zzlgVar = this.zzb.zza;
        zzlgVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzlgVar3 = this.zzb.zza;
            zzlgVar3.zzN(this.zza);
        } else {
            zzlgVar2 = this.zzb.zza;
            zzlgVar2.zzT(this.zza);
        }
    }
}
