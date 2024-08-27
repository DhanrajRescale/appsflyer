package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzgq implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgw zzc;

    public zzgq(zzgw zzgwVar, zzaw zzawVar, String str) {
        this.zzc = zzgwVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzc.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzc.zza;
        zzlgVar2.zzF(this.zza, this.zzb);
    }
}
