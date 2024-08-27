package com.google.android.gms.internal.icing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdz {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzdy zzdyVar = (zzdy) obj;
        if (!zzdyVar.isEmpty()) {
            Iterator it = zzdyVar.entrySet().iterator();
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
}
