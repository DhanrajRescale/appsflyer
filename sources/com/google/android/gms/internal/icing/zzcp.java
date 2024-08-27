package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcp {
    static final zzcp zza = new zzcp(true);
    private static volatile boolean zzb = false;
    private static volatile zzcp zzc;
    private final Map zzd;

    public zzcp() {
        this.zzd = new HashMap();
    }

    public static zzcp zza() {
        zzcp zzcpVar = zzc;
        if (zzcpVar == null) {
            synchronized (zzcp.class) {
                try {
                    zzcpVar = zzc;
                    if (zzcpVar == null) {
                        zzcpVar = zza;
                        zzc = zzcpVar;
                    }
                } finally {
                }
            }
        }
        return zzcpVar;
    }

    public zzcp(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
