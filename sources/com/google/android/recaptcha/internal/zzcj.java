package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzcj implements zzby {

    @NotNull
    public static final zzcj zza = new zzcj();

    private zzcj() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length == 1) {
            zzblVar.zzc().zzf(i10, objArr[0]);
            return;
        }
        throw new zzt(4, 3, null);
    }
}
