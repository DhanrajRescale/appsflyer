package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkl extends zzap {
    final /* synthetic */ zzkm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkl(zzkm zzkmVar, zzgz zzgzVar) {
        super(zzgzVar);
        this.zza = zzkmVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        zzkm zzkmVar = this.zza;
        zzkmVar.zzc.zzg();
        zzkmVar.zzd(false, false, zzkmVar.zzc.zzt.zzax().elapsedRealtime());
        zzkmVar.zzc.zzt.zzd().zzf(zzkmVar.zzc.zzt.zzax().elapsedRealtime());
    }
}
