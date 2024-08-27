package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzfz {
    static final zzfz zza = new zzfz(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzfz() {
        this.zzd = new HashMap();
    }

    public final zzgm zza(zzhy zzhyVar, int i10) {
        return (zzgm) this.zzd.get(new zzfy(zzhyVar, i10));
    }

    public zzfz(boolean z10) {
        this.zzd = Collections.emptyMap();
    }
}
