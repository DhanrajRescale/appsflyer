package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zzhk extends zzhm {
    public /* synthetic */ zzhk(zzhj zzhjVar) {
        super(null);
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final List zza(Object obj, long j10) {
        int i10;
        zzgv zzgvVar = (zzgv) zzjp.zzf(obj, j10);
        if (!zzgvVar.zzc()) {
            int size = zzgvVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzgv zzd = zzgvVar.zzd(i10);
            zzjp.zzs(obj, j10, zzd);
            return zzd;
        }
        return zzgvVar;
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzb(Object obj, long j10) {
        ((zzgv) zzjp.zzf(obj, j10)).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzhm
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgv zzgvVar = (zzgv) zzjp.zzf(obj, j10);
        zzgv zzgvVar2 = (zzgv) zzjp.zzf(obj2, j10);
        int size = zzgvVar.size();
        int size2 = zzgvVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgvVar.zzc()) {
                zzgvVar = zzgvVar.zzd(size2 + size);
            }
            zzgvVar.addAll(zzgvVar2);
        }
        if (size > 0) {
            zzgvVar2 = zzgvVar;
        }
        zzjp.zzs(obj, j10, zzgvVar2);
    }

    private zzhk() {
        super(null);
    }
}
