package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzahk {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzahj zzahjVar = (zzahj) obj;
        if (!zzahjVar.isEmpty()) {
            Iterator it = zzahjVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        if (!((zzahj) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzahj zzahjVar = (zzahj) obj;
        zzahj zzahjVar2 = (zzahj) obj2;
        if (!zzahjVar2.isEmpty()) {
            if (!zzahjVar.zze()) {
                zzahjVar = zzahjVar.zzb();
            }
            zzahjVar.zzd(zzahjVar2);
        }
        return zzahjVar;
    }
}
