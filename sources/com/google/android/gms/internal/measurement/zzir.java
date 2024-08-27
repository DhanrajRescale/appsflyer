package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class zzir {
    public static zzim zza(zzim zzimVar) {
        if (!(zzimVar instanceof zzip) && !(zzimVar instanceof zzin)) {
            if (zzimVar instanceof Serializable) {
                return new zzin(zzimVar);
            }
            return new zzip(zzimVar);
        }
        return zzimVar;
    }

    public static zzim zzb(Object obj) {
        return new zziq(obj);
    }
}
