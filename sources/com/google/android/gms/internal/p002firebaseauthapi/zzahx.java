package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzahx {
    private static final zzahx zza = new zzahx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzaic zzb = new zzahh();

    private zzahx() {
    }

    public static zzahx zza() {
        return zza;
    }

    public final zzaib zzb(Class cls) {
        zzagq.zzc(cls, "messageType");
        zzaib zzaibVar = (zzaib) this.zzc.get(cls);
        if (zzaibVar == null) {
            zzaibVar = this.zzb.zza(cls);
            zzagq.zzc(cls, "messageType");
            zzagq.zzc(zzaibVar, "schema");
            zzaib zzaibVar2 = (zzaib) this.zzc.putIfAbsent(cls, zzaibVar);
            if (zzaibVar2 != null) {
                return zzaibVar2;
            }
        }
        return zzaibVar;
    }
}
