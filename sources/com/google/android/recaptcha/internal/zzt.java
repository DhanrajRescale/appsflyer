package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzt extends Exception {
    private final Throwable zza;

    @NotNull
    private final zzmi zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzt(@NotNull int i10, @NotNull int i11, Throwable th2) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th2;
        zzmi zzf = zzmj.zzf();
        zzf.zze(i11);
        zzf.zzp(i10);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zzmi zza() {
        return this.zzb;
    }
}
