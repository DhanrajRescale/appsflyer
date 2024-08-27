package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzgi implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzgw zzd;

    public zzgi(zzgw zzgwVar, String str, String str2, String str3) {
        this.zzd = zzgwVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlg zzlgVar;
        zzlg zzlgVar2;
        zzlgVar = this.zzd.zza;
        zzlgVar.zzA();
        zzlgVar2 = this.zzd.zza;
        return zzlgVar2.zzi().zzv(this.zza, this.zzb, this.zzc);
    }
}
