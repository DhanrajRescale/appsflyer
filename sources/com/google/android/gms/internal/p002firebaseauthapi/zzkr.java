package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzkr {
    private static final zzkr zza = new zzkr();
    private static final zzkq zzb = new zzkq(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzkr zza() {
        return zza;
    }

    public final zzob zzb() {
        zzob zzobVar = (zzob) this.zzc.get();
        if (zzobVar == null) {
            return zzb;
        }
        return zzobVar;
    }
}
