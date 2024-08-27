package com.google.android.recaptcha.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import vt.g0;

/* loaded from: classes2.dex */
public final class zzbf implements zzbi {

    @NotNull
    private final zzdo zza;

    public zzbf() {
        this(1);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    @NotNull
    public final List zza() {
        return g0.R(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }

    public zzbf(int i10) {
        this.zza = zzdo.zza(i10);
    }
}
