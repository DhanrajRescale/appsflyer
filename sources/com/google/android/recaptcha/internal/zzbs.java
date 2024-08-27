package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzbs implements zzby {

    @NotNull
    public static final zzbs zza = new zzbs();

    private zzbs() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof String)) {
                    obj2 = null;
                }
                String str2 = (String) obj2;
                if (str2 != null) {
                    zzblVar.zzc().zzf(i10, str.concat(str2));
                    return;
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
