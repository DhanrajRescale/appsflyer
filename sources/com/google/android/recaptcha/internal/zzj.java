package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzj {

    @NotNull
    public static final zzj zza = new zzj();

    @NotNull
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzj() {
    }

    public static final void zza(int i10, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i10);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzi();
        }
        zzi zziVar = (zzi) obj;
        zziVar.zzg(zziVar.zzb() + 1);
        zziVar.zzf(zziVar.zzd() + j10);
        zziVar.zze(Math.max(j10, zziVar.zzc()));
        concurrentHashMap.put(valueOf, zziVar);
    }
}
