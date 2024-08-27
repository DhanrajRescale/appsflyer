package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzr {

    @NotNull
    public static final zzq zza = new zzq(null);

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;

    @NotNull
    private final String zze;

    public zzr() {
        this(null, 0L, 0L, 7, null);
    }

    @NotNull
    public final String zza() {
        return this.zzc;
    }

    @NotNull
    public final String zzb() {
        return this.zze;
    }

    @NotNull
    public final String zzc() {
        return this.zzd;
    }

    public /* synthetic */ zzr(String str, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.zzb = "https://www.recaptcha.net/recaptcha/api3";
        this.zzc = "https://www.recaptcha.net/recaptcha/api3".concat("/mwv");
        this.zzd = "https://www.recaptcha.net/recaptcha/api3".concat("/mlg");
        this.zze = "https://www.recaptcha.net/recaptcha/api3".concat("/mal");
    }
}
