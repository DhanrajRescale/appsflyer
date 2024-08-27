package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzca implements zzby {

    @NotNull
    public static final zzca zza = new zzca();

    private zzca() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                try {
                    if (obj instanceof String) {
                        obj = zzbx.zza(this, (String) obj, zzblVar.zza());
                    }
                    zzblVar.zzc().zzf(i10, zzbk.zza(obj));
                    return;
                } catch (Exception e10) {
                    throw new zzt(6, 8, e10);
                }
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
