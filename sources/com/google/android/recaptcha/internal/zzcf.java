package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import vt.v;

/* loaded from: classes2.dex */
public final class zzcf implements zzby {

    @NotNull
    public static final zzcf zza = new zzcf();

    private zzcf() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        int length = objArr.length;
        if (length != 0) {
            Object obj = objArr[0];
            if (true != (obj instanceof Method)) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null) {
                Object[] array = v.y(objArr).subList(1, length).toArray(new Object[0]);
                try {
                    zzblVar.zzc().zzf(i10, method.invoke(null, Arrays.copyOf(array, array.length)));
                    return;
                } catch (Exception e10) {
                    throw new zzt(6, 15, e10);
                }
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
