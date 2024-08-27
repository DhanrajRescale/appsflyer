package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzcc implements zzby {

    @NotNull
    public static final zzcc zza = new zzcc();

    private zzcc() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        Class<?> cls;
        if (objArr.length == 2) {
            Class<?> cls2 = objArr[0];
            if (true != (cls2 instanceof Object)) {
                cls2 = null;
            }
            if (cls2 != null) {
                if (cls2 instanceof Class) {
                    cls = cls2;
                } else {
                    cls = cls2.getClass();
                }
                Object obj = objArr[1];
                if (true != (obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                if (str != null) {
                    try {
                        zzblVar.zzc().zzf(i10, cls.getField(zzbx.zza(this, str, zzblVar.zza())));
                        return;
                    } catch (Exception e10) {
                        throw new zzt(6, 10, e10);
                    }
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
