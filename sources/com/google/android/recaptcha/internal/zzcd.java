package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.i0;
import vt.v;
import vt.x;
import vt.z;

/* loaded from: classes2.dex */
public final class zzcd implements zzby {

    @NotNull
    public static final zzcd zza = new zzcd();

    private zzcd() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        Class<?> cls;
        Iterable iterable;
        if (objArr.length >= 2) {
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
                    String zza2 = zzbx.zza(this, str, zzblVar.zza());
                    if (!Intrinsics.a(zza2, "forName")) {
                        Intrinsics.checkNotNullParameter(objArr, "<this>");
                        int length = objArr.length - 2;
                        if (length < 0) {
                            length = 0;
                        }
                        Intrinsics.checkNotNullParameter(objArr, "<this>");
                        if (length >= 0) {
                            if (length == 0) {
                                iterable = i0.f38321a;
                            } else {
                                int length2 = objArr.length;
                                if (length >= length2) {
                                    iterable = v.y(objArr);
                                } else if (length == 1) {
                                    iterable = x.a(objArr[length2 - 1]);
                                } else {
                                    ArrayList arrayList = new ArrayList(length);
                                    for (int i11 = length2 - length; i11 < length2; i11++) {
                                        arrayList.add(objArr[i11]);
                                    }
                                    iterable = arrayList;
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(z.k(iterable));
                            Iterator it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(zzbk.zza(it.next()));
                            }
                            Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
                            try {
                                zzblVar.zzc().zzf(i10, cls.getMethod(zza2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)));
                                return;
                            } catch (Exception e10) {
                                throw new zzt(6, 13, e10);
                            }
                        }
                        throw new IllegalArgumentException(h.o("Requested element count ", length, " is less than zero.").toString());
                    }
                    throw new zzt(6, 48, null);
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }
}
