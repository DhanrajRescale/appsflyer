package w;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: s, reason: collision with root package name */
    public static float[] f38703s;

    /* renamed from: a, reason: collision with root package name */
    public final float f38704a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38705b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38706c;

    /* renamed from: d, reason: collision with root package name */
    public final float f38707d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38708e;

    /* renamed from: f, reason: collision with root package name */
    public final float f38709f;

    /* renamed from: g, reason: collision with root package name */
    public final float f38710g;

    /* renamed from: h, reason: collision with root package name */
    public float f38711h;

    /* renamed from: i, reason: collision with root package name */
    public float f38712i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f38713j;

    /* renamed from: k, reason: collision with root package name */
    public final float f38714k;

    /* renamed from: l, reason: collision with root package name */
    public final float f38715l;

    /* renamed from: m, reason: collision with root package name */
    public final float f38716m;

    /* renamed from: n, reason: collision with root package name */
    public final float f38717n;

    /* renamed from: o, reason: collision with root package name */
    public final float f38718o;

    /* renamed from: p, reason: collision with root package name */
    public final float f38719p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f38720q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f38721r;

    public w(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        float f16;
        float f17;
        float f18;
        float f19 = f12;
        this.f38704a = f10;
        this.f38705b = f11;
        this.f38706c = f19;
        this.f38707d = f13;
        this.f38708e = f14;
        this.f38709f = f15;
        float f20 = f14 - f19;
        float f21 = f15 - f13;
        int i13 = 1;
        if (i10 != 1 && (i10 == 4 ? f21 <= s0.g.f34069a : i10 != 5 || f21 >= s0.g.f34069a)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f38720q = z10;
        float f22 = f11 - f10;
        float f23 = 1 / f22;
        this.f38714k = f23;
        if (3 == i10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && Math.abs(f20) >= 0.001f && Math.abs(f21) >= 0.001f) {
            this.f38713j = new float[101];
            if (z10) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            this.f38715l = i11 * f20;
            if (z10) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            this.f38716m = f21 * i12;
            this.f38717n = z10 ? f14 : f19;
            if (z10) {
                f16 = f13;
            } else {
                f16 = f15;
            }
            this.f38718o = f16;
            float f24 = f13 - f15;
            int length = kq.e.C().length;
            float f25 = 0.0f;
            float f26 = 0.0f;
            float f27 = 0.0f;
            int i14 = 0;
            while (i14 < length) {
                double radians = (float) Math.toRadians((i14 * 90.0d) / (kq.e.C().length - i13));
                float sin = ((float) Math.sin(radians)) * f20;
                float cos = ((float) Math.cos(radians)) * f24;
                if (i14 > 0) {
                    f17 = f24;
                    f18 = cos;
                    f25 += (float) Math.hypot(sin - f26, cos - f27);
                    kq.e.C()[i14] = f25;
                } else {
                    f17 = f24;
                    f18 = cos;
                }
                i14++;
                f24 = f17;
                f27 = f18;
                f26 = sin;
                i13 = 1;
            }
            this.f38710g = f25;
            int length2 = kq.e.C().length;
            for (int i15 = 0; i15 < length2; i15++) {
                float[] C = kq.e.C();
                C[i15] = C[i15] / f25;
            }
            float[] fArr = this.f38713j;
            int length3 = fArr.length;
            for (int i16 = 0; i16 < length3; i16++) {
                float length4 = i16 / (fArr.length - 1);
                float[] C2 = kq.e.C();
                int length5 = C2.length;
                Intrinsics.checkNotNullParameter(C2, "<this>");
                int binarySearch = Arrays.binarySearch(C2, 0, length5, length4);
                if (binarySearch >= 0) {
                    fArr[i16] = binarySearch / (kq.e.C().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i16] = 0.0f;
                } else {
                    int i17 = -binarySearch;
                    int i18 = i17 - 2;
                    fArr[i16] = (((length4 - kq.e.C()[i18]) / (kq.e.C()[i17 - 1] - kq.e.C()[i18])) + i18) / (kq.e.C().length - 1);
                }
            }
            this.f38719p = this.f38710g * this.f38714k;
            z12 = z11;
        } else {
            float hypot = (float) Math.hypot(f21, f20);
            this.f38710g = hypot;
            this.f38719p = hypot * f23;
            this.f38717n = f20 / f22;
            this.f38718o = f21 / f22;
            this.f38713j = new float[101];
            this.f38715l = Float.NaN;
            this.f38716m = Float.NaN;
            z12 = true;
        }
        this.f38721r = z12;
    }

    public final float a() {
        float f10 = this.f38715l * this.f38712i;
        float hypot = this.f38719p / ((float) Math.hypot(f10, (-this.f38716m) * this.f38711h));
        if (this.f38720q) {
            f10 = -f10;
        }
        return f10 * hypot;
    }

    public final float b() {
        float f10 = this.f38715l * this.f38712i;
        float f11 = (-this.f38716m) * this.f38711h;
        float hypot = this.f38719p / ((float) Math.hypot(f10, f11));
        if (this.f38720q) {
            return (-f11) * hypot;
        }
        return f11 * hypot;
    }

    public final void c(float f10) {
        float f11;
        if (this.f38720q) {
            f11 = this.f38705b - f10;
        } else {
            f11 = f10 - this.f38704a;
        }
        float f12 = f11 * this.f38714k;
        float f13 = s0.g.f34069a;
        if (f12 > s0.g.f34069a) {
            f13 = 1.0f;
            if (f12 < 1.0f) {
                float[] fArr = this.f38713j;
                float length = f12 * (fArr.length - 1);
                int i10 = (int) length;
                float f14 = fArr[i10];
                f13 = nn.d.b(fArr[i10 + 1], f14, length - i10, f14);
            }
        }
        double d10 = f13 * 1.5707964f;
        this.f38711h = (float) Math.sin(d10);
        this.f38712i = (float) Math.cos(d10);
    }
}
