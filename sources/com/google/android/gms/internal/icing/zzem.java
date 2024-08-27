package com.google.android.gms.internal.icing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzem {
    private static final zzem zza = new zzem();
    private final ConcurrentMap<Class<?>, zzep<?>> zzc = new ConcurrentHashMap();
    private final zzeq zzb = new zzdw();

    private zzem() {
    }

    public static zzem zza() {
        return zza;
    }

    public final <T> zzep<T> zzb(Class<T> cls) {
        zzdh.zzb(cls, "messageType");
        zzep<T> zzepVar = (zzep) this.zzc.get(cls);
        if (zzepVar == null) {
            zzepVar = this.zzb.zza(cls);
            zzdh.zzb(cls, "messageType");
            zzdh.zzb(zzepVar, "schema");
            zzep<T> zzepVar2 = (zzep) this.zzc.putIfAbsent(cls, zzepVar);
            if (zzepVar2 != null) {
                return zzepVar2;
            }
        }
        return zzepVar;
    }
}
