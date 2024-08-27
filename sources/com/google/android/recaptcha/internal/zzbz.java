package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vt.i0;
import vt.v;
import vt.x;
import vt.z;

/* loaded from: classes2.dex */
public final class zzbz implements zzby {

    @NotNull
    public static final zzbz zza = new zzbz();

    private zzbz() {
    }

    public static final List zzc(@NotNull Object obj) {
        List list;
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    Intrinsics.checkNotNullParameter(bArr, "<this>");
                    ArrayList arrayList = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i10 < length2) {
                        arrayList.add(Byte.valueOf(bArr[i10]));
                        i10++;
                    }
                    return arrayList;
                }
                return x.a(Byte.valueOf(bArr[0]));
            }
            return i0.f38321a;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    Intrinsics.checkNotNullParameter(sArr, "<this>");
                    ArrayList arrayList2 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        arrayList2.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                    return arrayList2;
                }
                list = x.a(Short.valueOf(sArr[0]));
            } else {
                list = i0.f38321a;
            }
        } else {
            if (obj instanceof int[]) {
                return v.x((int[]) obj);
            }
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                int length5 = jArr.length;
                if (length5 != 0) {
                    if (length5 != 1) {
                        Intrinsics.checkNotNullParameter(jArr, "<this>");
                        ArrayList arrayList3 = new ArrayList(jArr.length);
                        int length6 = jArr.length;
                        while (i10 < length6) {
                            arrayList3.add(Long.valueOf(jArr[i10]));
                            i10++;
                        }
                        return arrayList3;
                    }
                    list = x.a(Long.valueOf(jArr[0]));
                } else {
                    list = i0.f38321a;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                int length7 = fArr.length;
                if (length7 != 0) {
                    if (length7 != 1) {
                        Intrinsics.checkNotNullParameter(fArr, "<this>");
                        ArrayList arrayList4 = new ArrayList(fArr.length);
                        int length8 = fArr.length;
                        while (i10 < length8) {
                            arrayList4.add(Float.valueOf(fArr[i10]));
                            i10++;
                        }
                        return arrayList4;
                    }
                    list = x.a(Float.valueOf(fArr[0]));
                } else {
                    list = i0.f38321a;
                }
            } else {
                if (!(obj instanceof double[])) {
                    return null;
                }
                double[] dArr = (double[]) obj;
                Intrinsics.checkNotNullParameter(dArr, "<this>");
                int length9 = dArr.length;
                if (length9 != 0) {
                    if (length9 != 1) {
                        Intrinsics.checkNotNullParameter(dArr, "<this>");
                        ArrayList arrayList5 = new ArrayList(dArr.length);
                        int length10 = dArr.length;
                        while (i10 < length10) {
                            arrayList5.add(Double.valueOf(dArr[i10]));
                            i10++;
                        }
                        return arrayList5;
                    }
                    return x.a(Double.valueOf(dArr[0]));
                }
                return i0.f38321a;
            }
        }
        return list;
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i10, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof Object)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    zzblVar.zzc().zzf(i10, zzb(obj, obj2));
                    return;
                }
                throw new zzt(4, 5, null);
            }
            throw new zzt(4, 5, null);
        }
        throw new zzt(4, 3, null);
    }

    @NotNull
    public final Object zzb(@NotNull Object obj, @NotNull Object obj2) throws zzt {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(z.k(zzc2));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(z.k(zzc));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc != null && zzc2 != null) {
            zzbx.zzb(this, zzc.size(), zzc2.size());
            int size = zzc.size();
            Double[] dArr = new Double[size];
            for (int i10 = 0; i10 < size; i10++) {
                dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
            }
            return dArr;
        }
        throw new zzt(4, 5, null);
    }
}
