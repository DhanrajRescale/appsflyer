package n1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f28151a;

    public /* synthetic */ k0(float[] fArr) {
        this.f28151a = fArr;
    }

    public static final long a(long j10, float[] fArr) {
        float d10 = m1.c.d(j10);
        float e10 = m1.c.e(j10);
        float f10 = 1 / (((fArr[7] * e10) + (fArr[3] * d10)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = s0.g.f34069a;
        }
        return t0.t.g(((fArr[4] * e10) + (fArr[0] * d10) + fArr[12]) * f10, ((fArr[5] * e10) + (fArr[1] * d10) + fArr[13]) * f10);
    }

    public static final void b(float[] fArr, m1.b bVar) {
        long a10 = a(t0.t.g(bVar.f27229a, bVar.f27230b), fArr);
        long a11 = a(t0.t.g(bVar.f27229a, bVar.f27232d), fArr);
        long a12 = a(t0.t.g(bVar.f27231c, bVar.f27230b), fArr);
        long a13 = a(t0.t.g(bVar.f27231c, bVar.f27232d), fArr);
        bVar.f27229a = Math.min(Math.min(m1.c.d(a10), m1.c.d(a11)), Math.min(m1.c.d(a12), m1.c.d(a13)));
        bVar.f27230b = Math.min(Math.min(m1.c.e(a10), m1.c.e(a11)), Math.min(m1.c.e(a12), m1.c.e(a13)));
        bVar.f27231c = Math.max(Math.max(m1.c.d(a10), m1.c.d(a11)), Math.max(m1.c.d(a12), m1.c.d(a13)));
        bVar.f27232d = Math.max(Math.max(m1.c.e(a10), m1.c.e(a11)), Math.max(m1.c.e(a12), m1.c.e(a13)));
    }

    public static final void c(float[] fArr) {
        float f10;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = s0.g.f34069a;
                }
                fArr[(i11 * 4) + i10] = f10;
            }
        }
    }

    public static final void d(float[] fArr, float[] fArr2) {
        float k10 = androidx.compose.ui.graphics.a.k(0, 0, fArr, fArr2);
        float k11 = androidx.compose.ui.graphics.a.k(0, 1, fArr, fArr2);
        float k12 = androidx.compose.ui.graphics.a.k(0, 2, fArr, fArr2);
        float k13 = androidx.compose.ui.graphics.a.k(0, 3, fArr, fArr2);
        float k14 = androidx.compose.ui.graphics.a.k(1, 0, fArr, fArr2);
        float k15 = androidx.compose.ui.graphics.a.k(1, 1, fArr, fArr2);
        float k16 = androidx.compose.ui.graphics.a.k(1, 2, fArr, fArr2);
        float k17 = androidx.compose.ui.graphics.a.k(1, 3, fArr, fArr2);
        float k18 = androidx.compose.ui.graphics.a.k(2, 0, fArr, fArr2);
        float k19 = androidx.compose.ui.graphics.a.k(2, 1, fArr, fArr2);
        float k20 = androidx.compose.ui.graphics.a.k(2, 2, fArr, fArr2);
        float k21 = androidx.compose.ui.graphics.a.k(2, 3, fArr, fArr2);
        float k22 = androidx.compose.ui.graphics.a.k(3, 0, fArr, fArr2);
        float k23 = androidx.compose.ui.graphics.a.k(3, 1, fArr, fArr2);
        float k24 = androidx.compose.ui.graphics.a.k(3, 2, fArr, fArr2);
        float k25 = androidx.compose.ui.graphics.a.k(3, 3, fArr, fArr2);
        fArr[0] = k10;
        fArr[1] = k11;
        fArr[2] = k12;
        fArr[3] = k13;
        fArr[4] = k14;
        fArr[5] = k15;
        fArr[6] = k16;
        fArr[7] = k17;
        fArr[8] = k18;
        fArr[9] = k19;
        fArr[10] = k20;
        fArr[11] = k21;
        fArr[12] = k22;
        fArr[13] = k23;
        fArr[14] = k24;
        fArr[15] = k25;
    }

    public static void e(float[] fArr, float f10, float f11) {
        float f12 = (fArr[8] * s0.g.f34069a) + (fArr[4] * f11) + (fArr[0] * f10) + fArr[12];
        float f13 = (fArr[9] * s0.g.f34069a) + (fArr[5] * f11) + (fArr[1] * f10) + fArr[13];
        float f14 = (fArr[10] * s0.g.f34069a) + (fArr[6] * f11) + (fArr[2] * f10) + fArr[14];
        float f15 = (fArr[11] * s0.g.f34069a) + (fArr[7] * f11) + (fArr[3] * f10) + fArr[15];
        fArr[12] = f12;
        fArr[13] = f13;
        fArr[14] = f14;
        fArr[15] = f15;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        if (!Intrinsics.a(this.f28151a, ((k0) obj).f28151a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28151a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f28151a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return kotlin.text.l.b(sb2.toString());
    }
}
