package n1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final List f28146c;

    /* renamed from: d, reason: collision with root package name */
    public final List f28147d = null;

    /* renamed from: e, reason: collision with root package name */
    public final long f28148e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28149f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28150g;

    public j0(List list, long j10, long j11, int i10) {
        this.f28146c = list;
        this.f28148e = j10;
        this.f28149f = j11;
        this.f28150g = i10;
    }

    @Override // n1.v0
    public final Shader b(long j10) {
        float d10;
        float e10;
        float d11;
        float e11;
        int i10;
        List list;
        List list2;
        int[] iArr;
        int i11;
        float[] fArr;
        float f10;
        float f11;
        float f12;
        Shader.TileMode tileMode;
        long j11 = this.f28148e;
        if (m1.c.d(j11) == Float.POSITIVE_INFINITY) {
            d10 = m1.f.e(j10);
        } else {
            d10 = m1.c.d(j11);
        }
        if (m1.c.e(j11) == Float.POSITIVE_INFINITY) {
            e10 = m1.f.c(j10);
        } else {
            e10 = m1.c.e(j11);
        }
        long j12 = this.f28149f;
        if (m1.c.d(j12) == Float.POSITIVE_INFINITY) {
            d11 = m1.f.e(j10);
        } else {
            d11 = m1.c.d(j12);
        }
        if (m1.c.e(j12) == Float.POSITIVE_INFINITY) {
            e11 = m1.f.c(j10);
        } else {
            e11 = m1.c.e(j12);
        }
        long g10 = t0.t.g(d10, e10);
        long g11 = t0.t.g(d11, e11);
        List list3 = this.f28146c;
        List list4 = this.f28147d;
        if (list4 == null) {
            if (list3.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list3.size() != list4.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            list = list3;
            i10 = 0;
        } else {
            int f13 = vt.y.f(list3);
            int i12 = 1;
            i10 = 0;
            while (i12 < f13) {
                List list5 = list3;
                if (t.e(((t) list3.get(i12)).f28179a) == s0.g.f34069a) {
                    i10++;
                }
                i12++;
                list3 = list5;
            }
            list = list3;
        }
        float d12 = m1.c.d(g10);
        float e12 = m1.c.e(g10);
        float d13 = m1.c.d(g11);
        float e13 = m1.c.e(g11);
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr2 = new int[size];
            int i13 = 0;
            while (true) {
                list2 = list;
                if (i13 >= size) {
                    break;
                }
                iArr2[i13] = androidx.compose.ui.graphics.a.y(((t) list2.get(i13)).f28179a);
                i13++;
                list = list2;
            }
            iArr = iArr2;
        } else {
            list2 = list;
            int[] iArr3 = new int[list2.size() + i10];
            int f14 = vt.y.f(list2);
            int size2 = list2.size();
            int i14 = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                long j13 = ((t) list2.get(i15)).f28179a;
                if (t.e(j13) == s0.g.f34069a) {
                    if (i15 == 0) {
                        i11 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.y(t.c(((t) list2.get(1)).f28179a, s0.g.f34069a));
                    } else if (i15 == f14) {
                        i11 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.y(t.c(((t) list2.get(i15 - 1)).f28179a, s0.g.f34069a));
                    } else {
                        int i16 = i14 + 1;
                        iArr3[i14] = androidx.compose.ui.graphics.a.y(t.c(((t) list2.get(i15 - 1)).f28179a, s0.g.f34069a));
                        i14 += 2;
                        iArr3[i16] = androidx.compose.ui.graphics.a.y(t.c(((t) list2.get(i15 + 1)).f28179a, s0.g.f34069a));
                    }
                    i14 = i11;
                } else {
                    iArr3[i14] = androidx.compose.ui.graphics.a.y(j13);
                    i14++;
                }
            }
            iArr = iArr3;
        }
        if (i10 == 0) {
            if (list4 != null) {
                Intrinsics.checkNotNullParameter(list4, "<this>");
                fArr = new float[list4.size()];
                Iterator it = list4.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    fArr[i17] = ((Number) it.next()).floatValue();
                    i17++;
                }
            } else {
                fArr = null;
            }
        } else {
            fArr = new float[list2.size() + i10];
            if (list4 != null) {
                f10 = ((Number) list4.get(0)).floatValue();
            } else {
                f10 = 0.0f;
            }
            fArr[0] = f10;
            int f15 = vt.y.f(list2);
            int i18 = 1;
            for (int i19 = 1; i19 < f15; i19++) {
                long j14 = ((t) list2.get(i19)).f28179a;
                if (list4 != null) {
                    f12 = ((Number) list4.get(i19)).floatValue();
                } else {
                    f12 = i19 / vt.y.f(list2);
                }
                int i20 = i18 + 1;
                fArr[i18] = f12;
                if (t.e(j14) == s0.g.f34069a) {
                    i18 += 2;
                    fArr[i20] = f12;
                } else {
                    i18 = i20;
                }
            }
            if (list4 != null) {
                f11 = ((Number) list4.get(vt.y.f(list2))).floatValue();
            } else {
                f11 = 1.0f;
            }
            fArr[i18] = f11;
        }
        float[] fArr2 = fArr;
        int i21 = this.f28150g;
        if (s0.g(i21, 0)) {
            tileMode = Shader.TileMode.CLAMP;
        } else if (s0.g(i21, 1)) {
            tileMode = Shader.TileMode.REPEAT;
        } else if (s0.g(i21, 2)) {
            tileMode = Shader.TileMode.MIRROR;
        } else if (s0.g(i21, 3)) {
            if (Build.VERSION.SDK_INT >= 31) {
                tileMode = a1.f28116a.b();
            } else {
                tileMode = Shader.TileMode.CLAMP;
            }
        } else {
            tileMode = Shader.TileMode.CLAMP;
        }
        return new LinearGradient(d12, e12, d13, e13, iArr, fArr2, tileMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (Intrinsics.a(this.f28146c, j0Var.f28146c) && Intrinsics.a(this.f28147d, j0Var.f28147d) && m1.c.b(this.f28148e, j0Var.f28148e) && m1.c.b(this.f28149f, j0Var.f28149f) && s0.g(this.f28150g, j0Var.f28150g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f28146c.hashCode() * 31;
        List list = this.f28147d;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = (hashCode + i10) * 31;
        int i12 = m1.c.f27236e;
        return Integer.hashCode(this.f28150g) + v.e.c(this.f28149f, v.e.c(this.f28148e, i11, 31), 31);
    }

    public final String toString() {
        String str;
        String str2;
        long j10 = this.f28148e;
        boolean Z = t0.t.Z(j10);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (Z) {
            str = "start=" + ((Object) m1.c.j(j10)) + ", ";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        long j11 = this.f28149f;
        if (t0.t.Z(j11)) {
            str3 = "end=" + ((Object) m1.c.j(j11)) + ", ";
        }
        StringBuilder sb2 = new StringBuilder("LinearGradient(colors=");
        sb2.append(this.f28146c);
        sb2.append(", stops=");
        sb2.append(this.f28147d);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(str3);
        sb2.append("tileMode=");
        int i10 = this.f28150g;
        if (s0.g(i10, 0)) {
            str2 = "Clamp";
        } else if (s0.g(i10, 1)) {
            str2 = "Repeated";
        } else if (s0.g(i10, 2)) {
            str2 = "Mirror";
        } else if (s0.g(i10, 3)) {
            str2 = "Decal";
        } else {
            str2 = "Unknown";
        }
        sb2.append((Object) str2);
        sb2.append(')');
        return sb2.toString();
    }
}
