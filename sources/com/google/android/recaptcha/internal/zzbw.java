package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzbw implements zzby {

    @NotNull
    public static final zzbw zza = new zzbw();

    private zzbw() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        Object array;
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof Integer)) {
                    obj2 = null;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    int intValue = num.intValue();
                    try {
                        if (obj instanceof Integer) {
                            array = Integer.valueOf(((Number) obj).intValue() / intValue);
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            ArrayList arrayList = new ArrayList(iArr.length);
                            for (int i11 : iArr) {
                                arrayList.add(Integer.valueOf(i11 / intValue));
                            }
                            array = arrayList.toArray(new Integer[0]);
                        } else {
                            throw new zzt(4, 5, null);
                        }
                        zzblVar.zzc().zzf(i10, array);
                        return;
                    } catch (ArithmeticException e10) {
                        throw new zzt(4, 6, e10);
                    }
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
