package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzf = zzalVar.zzf(zzapVar.zzi());
            if (zzf instanceof zzai) {
                return ((zzai) zzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzapVar.zzi()));
        }
        if ("hasOwnProperty".equals(zzapVar.zzi())) {
            zzh.zzh("hasOwnProperty", 1, list);
            if (zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi())) {
                return zzap.zzk;
            }
            return zzap.zzl;
        }
        throw new IllegalArgumentException(String.format("Object has no function %s", zzapVar.zzi()));
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
