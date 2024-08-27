package androidx.work;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2616a;

    public j(int i10) {
        if (i10 != 1) {
            this.f2616a = new HashMap();
        } else {
            this.f2616a = new HashMap();
        }
    }

    public final k a() {
        k kVar = new k(this.f2616a);
        k.c(kVar);
        return kVar;
    }

    public final void b(Object obj, String str) {
        if (obj == null) {
            this.f2616a.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
            int i10 = 0;
            if (cls == boolean[].class) {
                HashMap hashMap = this.f2616a;
                boolean[] zArr = (boolean[]) obj;
                String str2 = k.f2620b;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i10 < zArr.length) {
                    boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    i10++;
                }
                hashMap.put(str, boolArr);
                return;
            }
            if (cls == byte[].class) {
                HashMap hashMap2 = this.f2616a;
                byte[] bArr = (byte[]) obj;
                String str3 = k.f2620b;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i10 < bArr.length) {
                    bArr2[i10] = Byte.valueOf(bArr[i10]);
                    i10++;
                }
                hashMap2.put(str, bArr2);
                return;
            }
            if (cls == int[].class) {
                HashMap hashMap3 = this.f2616a;
                int[] iArr = (int[]) obj;
                String str4 = k.f2620b;
                Integer[] numArr = new Integer[iArr.length];
                while (i10 < iArr.length) {
                    numArr[i10] = Integer.valueOf(iArr[i10]);
                    i10++;
                }
                hashMap3.put(str, numArr);
                return;
            }
            if (cls == long[].class) {
                HashMap hashMap4 = this.f2616a;
                long[] jArr = (long[]) obj;
                String str5 = k.f2620b;
                Long[] lArr = new Long[jArr.length];
                while (i10 < jArr.length) {
                    lArr[i10] = Long.valueOf(jArr[i10]);
                    i10++;
                }
                hashMap4.put(str, lArr);
                return;
            }
            if (cls == float[].class) {
                HashMap hashMap5 = this.f2616a;
                float[] fArr = (float[]) obj;
                String str6 = k.f2620b;
                Float[] fArr2 = new Float[fArr.length];
                while (i10 < fArr.length) {
                    fArr2[i10] = Float.valueOf(fArr[i10]);
                    i10++;
                }
                hashMap5.put(str, fArr2);
                return;
            }
            if (cls == double[].class) {
                HashMap hashMap6 = this.f2616a;
                double[] dArr = (double[]) obj;
                String str7 = k.f2620b;
                Double[] dArr2 = new Double[dArr.length];
                while (i10 < dArr.length) {
                    dArr2[i10] = Double.valueOf(dArr[i10]);
                    i10++;
                }
                hashMap6.put(str, dArr2);
                return;
            }
            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
        }
        this.f2616a.put(str, obj);
    }

    public final void c(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            b(entry.getValue(), (String) entry.getKey());
        }
    }
}
