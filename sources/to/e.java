package to;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l.b0;
import t0.q2;
import vt.i0;

/* loaded from: classes2.dex */
public class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36229a;

    public /* synthetic */ e(int i10) {
        this.f36229a = i10;
    }

    public static long c() {
        return n1.t.f28170b;
    }

    public static long f() {
        return n1.t.f28171c;
    }

    public static long g() {
        return n1.t.f28177i;
    }

    public static String h(f.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof f.d) {
            return "image/*";
        }
        if (input instanceof f.e) {
            return "video/*";
        }
        if (input instanceof f.c) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List i(q2 q2Var, int i10, q2 q2Var2, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        i0 i0Var;
        boolean B;
        int i11;
        boolean z14;
        int J0;
        int i12;
        int i13;
        int p10 = q2Var.p(i10);
        int i14 = i10 + p10;
        int f10 = q2Var.f(q2Var.f35144b, q2Var.o(i10));
        int f11 = q2Var.f(q2Var.f35144b, q2Var.o(i14));
        int i15 = f11 - f10;
        if (i10 >= 0 && (q2Var.f35144b[(q2Var.o(i10) * 5) + 1] & 201326592) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        q2Var2.r(p10);
        q2Var2.s(i15, q2Var2.f35161s);
        if (q2Var.f35149g < i14) {
            q2Var.v(i14);
        }
        if (q2Var.f35153k < f11) {
            q2Var.w(f11, i14);
        }
        int[] iArr = q2Var2.f35144b;
        int i16 = q2Var2.f35161s;
        int i17 = i16 * 5;
        vt.t.c(i17, i10 * 5, i14 * 5, q2Var.f35144b, iArr);
        Object[] objArr = q2Var2.f35145c;
        int i18 = q2Var2.f35151i;
        vt.t.f(q2Var.f35145c, i18, objArr, f10, f11);
        int i19 = q2Var2.f35163u;
        iArr[i17 + 2] = i19;
        int i20 = i16 - i10;
        int i21 = i16 + p10;
        int f12 = i18 - q2Var2.f(iArr, i16);
        int i22 = q2Var2.f35155m;
        int i23 = q2Var2.f35154l;
        int length = objArr.length;
        boolean z15 = z13;
        int i24 = i22;
        int i25 = i16;
        while (i25 < i21) {
            if (i25 != i16) {
                int i26 = (i25 * 5) + 2;
                iArr[i26] = iArr[i26] + i20;
            }
            int i27 = i21;
            int f13 = q2Var2.f(iArr, i25) + f12;
            if (i24 < i25) {
                i12 = i16;
                i13 = 0;
            } else {
                i12 = i16;
                i13 = q2Var2.f35153k;
            }
            iArr[(i25 * 5) + 4] = q2.h(f13, i13, i23, length);
            if (i25 == i24) {
                i24++;
            }
            i25++;
            i16 = i12;
            i21 = i27;
        }
        int i28 = i16;
        int i29 = i21;
        q2Var2.f35155m = i24;
        int H0 = dp.b.H0(q2Var.f35146d, i10, q2Var.n());
        int H02 = dp.b.H0(q2Var.f35146d, i14, q2Var.n());
        if (H0 < H02) {
            ArrayList arrayList = q2Var.f35146d;
            ArrayList arrayList2 = new ArrayList(H02 - H0);
            for (int i30 = H0; i30 < H02; i30++) {
                t0.d dVar = (t0.d) arrayList.get(i30);
                dVar.f34969a += i20;
                arrayList2.add(dVar);
            }
            q2Var2.f35146d.addAll(dp.b.H0(q2Var2.f35146d, q2Var2.f35161s, q2Var2.n()), arrayList2);
            arrayList.subList(H0, H02).clear();
            i0Var = arrayList2;
        } else {
            i0Var = i0.f38321a;
        }
        if (!i0Var.isEmpty()) {
            HashMap hashMap = q2Var.f35147e;
            HashMap hashMap2 = q2Var2.f35147e;
            if (hashMap != null && hashMap2 != null) {
                int size = i0Var.size();
                for (int i31 = 0; i31 < size; i31++) {
                }
            }
        }
        int i32 = q2Var2.f35163u;
        q2Var2.I(i19);
        int y10 = q2Var.y(q2Var.f35144b, i10);
        if (!z12) {
            i11 = 1;
            B = false;
        } else if (z10) {
            if (y10 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                q2Var.J();
                q2Var.a(y10 - q2Var.f35161s);
                q2Var.J();
            }
            q2Var.a(i10 - q2Var.f35161s);
            boolean A = q2Var.A();
            if (z14) {
                q2Var.F();
                q2Var.i();
                q2Var.F();
                q2Var.i();
            }
            B = A;
            i11 = 1;
        } else {
            B = q2Var.B(i10, p10);
            i11 = 1;
            q2Var.C(f10, i15, i10 - 1);
        }
        if (!B) {
            int i33 = q2Var2.f35157o;
            if (dp.b.G0(iArr, i28)) {
                J0 = i11;
            } else {
                J0 = dp.b.J0(iArr, i28);
            }
            q2Var2.f35157o = i33 + J0;
            if (z11) {
                q2Var2.f35161s = i29;
                q2Var2.f35151i = i18 + i15;
            }
            if (z15) {
                q2Var2.O(i19);
            }
            return i0Var;
        }
        t0.t.F("Unexpectedly removed anchors");
        throw null;
    }

    public boolean a() {
        return this instanceof f;
    }

    @Override // l.b0
    public final void b(l.o oVar, boolean z10) {
    }

    public void d(float f10, float f11, float f12, v vVar) {
        vVar.c(f10, s0.g.f34069a);
    }

    @Override // l.b0
    public final boolean e(l.o oVar) {
        return false;
    }

    public final String toString() {
        switch (this.f36229a) {
            case 12:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        this(2);
        this.f36229a = i10;
        switch (i10) {
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
            default:
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
        }
    }
}
