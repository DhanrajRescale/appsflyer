package b0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2935a = new d(7);

    /* renamed from: b, reason: collision with root package name */
    public static final d f2936b = new d(6);

    /* renamed from: c, reason: collision with root package name */
    public static final f f2937c = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public static final f f2938d = new f(0);

    /* renamed from: e, reason: collision with root package name */
    public static final g f2939e = new g(0);

    /* renamed from: f, reason: collision with root package name */
    public static final g f2940f = new g(3);

    /* renamed from: g, reason: collision with root package name */
    public static final g f2941g = new g(2);

    static {
        new g(1);
    }

    public static g a() {
        return f2939e;
    }

    public static g b() {
        return f2941g;
    }

    public static g c() {
        return f2940f;
    }

    public static void d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = Math.round(f10);
                f10 += i16;
            } else {
                return;
            }
        }
    }

    public static void e(int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = i10;
                i10 += i14;
            } else {
                return;
            }
        }
    }

    public static void f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = i14;
                i14 += i17;
            } else {
                return;
            }
        }
    }

    public static void g(int i10, int[] iArr, int[] iArr2, boolean z10) {
        boolean z11;
        float f10;
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            f10 = (i10 - i12) / iArr.length;
        } else {
            f10 = s0.g.f34069a;
        }
        float f11 = f10 / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f11);
                f11 += i15 + f10;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f11);
            f11 += i16 + f10;
        }
    }

    public static void h(int i10, int[] iArr, int[] iArr2, boolean z10) {
        float f10;
        if (iArr.length == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        float max = (i10 - i12) / Math.max(iArr.length - 1, 1);
        if (z10 && iArr.length == 1) {
            f10 = max;
        } else {
            f10 = s0.g.f34069a;
        }
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15 + max;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            iArr2[length2] = Math.round(f10);
            f10 += i16 + max;
        }
    }

    public static void i(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (!z10) {
            int length2 = iArr.length;
            float f10 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                iArr2[i14] = Math.round(f10);
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            iArr2[length3] = Math.round(f11);
            f11 += i16 + length;
        }
    }
}
