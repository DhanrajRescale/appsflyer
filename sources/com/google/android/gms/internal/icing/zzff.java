package com.google.android.gms.internal.icing;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzff extends zzfd<zzfe, zzfe> {
    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ void zza(Object obj, zzfe zzfeVar) {
        ((zzda) obj).zzc = zzfeVar;
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ zzfe zzb(Object obj) {
        return ((zzda) obj).zzc;
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final void zzc(Object obj) {
        zzfe zzfeVar = ((zzda) obj).zzc;
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ zzfe zzd(zzfe zzfeVar, zzfe zzfeVar2) {
        zzfe zzfeVar3 = zzfeVar2;
        if (zzfeVar3.equals(zzfe.zza())) {
            return zzfeVar;
        }
        return zzfe.zzb(zzfeVar, zzfeVar3);
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ int zze(zzfe zzfeVar) {
        return zzfeVar.zzc();
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ int zzf(zzfe zzfeVar) {
        return zzfeVar.zzd();
    }

    @Override // com.google.android.gms.internal.icing.zzfd
    public final /* bridge */ /* synthetic */ void zzg(zzfe zzfeVar, zzcn zzcnVar) throws IOException {
    }
}
