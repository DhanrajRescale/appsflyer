package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzcq {

    @NotNull
    public static final zzcp zza = new zzcp(null);
    private int zzb;

    public zzcq(short s7, short s10) {
        this.zzb = Math.abs((int) s7);
    }

    public final short zza() {
        int i10 = ((this.zzb * 4391) + 277) % 32779;
        this.zzb = i10;
        return (short) (i10 % 255);
    }
}
