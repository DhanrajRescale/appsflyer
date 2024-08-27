package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
final class zzgo implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgw zzb;

    public zzgo(zzgw zzgwVar, zzq zzqVar) {
        this.zzb = zzgwVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzb.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzb.zza;
        zzq zzqVar = this.zza;
        zzlgVar2.zzaB().zzg();
        zzlgVar2.zzB();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzb = zzai.zzb(zzqVar.zzv);
        zzai zzh = zzlgVar2.zzh(zzqVar.zza);
        zzlgVar2.zzaA().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzb);
        zzlgVar2.zzV(zzqVar.zza, zzb);
        if (zzb.zzk(zzh)) {
            zzlgVar2.zzQ(zzqVar);
        }
    }
}
