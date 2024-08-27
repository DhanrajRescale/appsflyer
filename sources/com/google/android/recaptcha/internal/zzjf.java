package com.google.android.recaptcha.internal;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class zzjf {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i10, int i11);

    public abstract void zzi(Object obj, int i10, long j10);

    public abstract void zzj(Object obj, int i10, Object obj2);

    public abstract void zzk(Object obj, int i10, zzez zzezVar);

    public abstract void zzl(Object obj, int i10, long j10);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzjx zzjxVar) throws IOException;

    public abstract void zzq(Object obj, zzjx zzjxVar) throws IOException;

    public final boolean zzr(Object obj, zzik zzikVar) throws IOException {
        int zzd = zzikVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzh(obj, i10, zzikVar.zzf());
                                return true;
                            }
                            throw zzgy.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i12 = i10 << 3;
                    while (zzikVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzikVar)) {
                    }
                    if ((4 | i12) == zzikVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i10, zzf);
                        return true;
                    }
                    throw zzgy.zzb();
                }
                zzk(obj, i10, zzikVar.zzp());
                return true;
            }
            zzi(obj, i10, zzikVar.zzk());
            return true;
        }
        zzl(obj, i10, zzikVar.zzl());
        return true;
    }

    public abstract boolean zzs(zzik zzikVar);
}
