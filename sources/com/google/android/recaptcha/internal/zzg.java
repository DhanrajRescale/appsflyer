package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzg {
    private zzg() {
    }

    public /* synthetic */ zzg(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public static final zzh zza(@NotNull zzmf zzmfVar) {
        zzh zzhVar = (zzh) zzh.zzd().get(zzmfVar);
        if (zzhVar == null) {
            return new zzh(zzf.zzb, zzd.zzb);
        }
        return zzhVar;
    }
}
