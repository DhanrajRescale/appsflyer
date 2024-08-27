package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b7.w;
import e4.f;
import jr.h;
import k7.h1;
import k7.i1;
import k7.j1;
import k7.m0;
import k7.n0;
import k7.o0;
import k7.p0;
import k7.s0;
import k7.t0;
import k7.t1;
import k7.u1;
import k7.z0;
import p2.m;
import yk.g;

/* loaded from: classes.dex */
public class LinearLayoutManager extends i1 implements t1 {
    public final w A;
    public final m0 B;
    public final int C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f2365p;

    /* renamed from: q, reason: collision with root package name */
    public n0 f2366q;

    /* renamed from: r, reason: collision with root package name */
    public s0 f2367r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2368s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2369t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2370u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2371v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2372w;

    /* renamed from: x, reason: collision with root package name */
    public int f2373x;

    /* renamed from: y, reason: collision with root package name */
    public int f2374y;

    /* renamed from: z, reason: collision with root package name */
    public o0 f2375z;

    /* JADX WARN: Type inference failed for: r2v1, types: [k7.m0, java.lang.Object] */
    public LinearLayoutManager(int i10) {
        this.f2365p = 1;
        this.f2369t = false;
        this.f2370u = false;
        this.f2371v = false;
        this.f2372w = true;
        this.f2373x = -1;
        this.f2374y = Integer.MIN_VALUE;
        this.f2375z = null;
        this.A = new w();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        g1(i10);
        c(null);
        if (this.f2369t) {
            this.f2369t = false;
            q0();
        }
    }

    @Override // k7.i1
    public final boolean B0() {
        if (this.f22416m == 1073741824 || this.f22415l == 1073741824) {
            return false;
        }
        int v10 = v();
        for (int i10 = 0; i10 < v10; i10++) {
            ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // k7.i1
    public void D0(RecyclerView recyclerView, int i10) {
        p0 p0Var = new p0(recyclerView.getContext());
        p0Var.f22522a = i10;
        E0(p0Var);
    }

    @Override // k7.i1
    public boolean F0() {
        return this.f2375z == null && this.f2368s == this.f2371v;
    }

    public void G0(u1 u1Var, int[] iArr) {
        int i10;
        int i11;
        if (u1Var.f22586a != -1) {
            i10 = this.f2367r.g();
        } else {
            i10 = 0;
        }
        if (this.f2366q.f22497f == -1) {
            i11 = 0;
        } else {
            i11 = i10;
            i10 = 0;
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public void H0(u1 u1Var, n0 n0Var, m mVar) {
        int i10 = n0Var.f22495d;
        if (i10 >= 0 && i10 < u1Var.b()) {
            mVar.a(i10, Math.max(0, n0Var.f22498g));
        }
    }

    public final int I0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        M0();
        s0 s0Var = this.f2367r;
        boolean z10 = !this.f2372w;
        return g.l(u1Var, s0Var, P0(z10), O0(z10), this, this.f2372w);
    }

    public final int J0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        M0();
        s0 s0Var = this.f2367r;
        boolean z10 = !this.f2372w;
        return g.m(u1Var, s0Var, P0(z10), O0(z10), this, this.f2372w, this.f2370u);
    }

    public final int K0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        M0();
        s0 s0Var = this.f2367r;
        boolean z10 = !this.f2372w;
        return g.n(u1Var, s0Var, P0(z10), O0(z10), this, this.f2372w);
    }

    @Override // k7.i1
    public final boolean L() {
        return true;
    }

    public final int L0(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130 && this.f2365p == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.f2365p == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.f2365p == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.f2365p == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.f2365p != 1 && Z0()) {
                return -1;
            }
            return 1;
        }
        if (this.f2365p == 1 || !Z0()) {
            return -1;
        }
        return 1;
    }

    @Override // k7.i1
    public final boolean M() {
        return this.f2369t;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k7.n0, java.lang.Object] */
    public final void M0() {
        if (this.f2366q == null) {
            ?? obj = new Object();
            obj.f22492a = true;
            obj.f22499h = 0;
            obj.f22500i = 0;
            obj.f22502k = null;
            this.f2366q = obj;
        }
    }

    public final int N0(u6.g gVar, n0 n0Var, u1 u1Var, boolean z10) {
        int i10;
        int i11 = n0Var.f22494c;
        int i12 = n0Var.f22498g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                n0Var.f22498g = i12 + i11;
            }
            c1(gVar, n0Var);
        }
        int i13 = n0Var.f22494c + n0Var.f22499h;
        while (true) {
            if ((!n0Var.f22503l && i13 <= 0) || (i10 = n0Var.f22495d) < 0 || i10 >= u1Var.b()) {
                break;
            }
            m0 m0Var = this.B;
            m0Var.f22483a = 0;
            m0Var.f22484b = false;
            m0Var.f22485c = false;
            m0Var.f22486d = false;
            a1(gVar, u1Var, n0Var, m0Var);
            if (!m0Var.f22484b) {
                int i14 = n0Var.f22493b;
                int i15 = m0Var.f22483a;
                n0Var.f22493b = (n0Var.f22497f * i15) + i14;
                if (!m0Var.f22485c || n0Var.f22502k != null || !u1Var.f22592g) {
                    n0Var.f22494c -= i15;
                    i13 -= i15;
                }
                int i16 = n0Var.f22498g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    n0Var.f22498g = i17;
                    int i18 = n0Var.f22494c;
                    if (i18 < 0) {
                        n0Var.f22498g = i17 + i18;
                    }
                    c1(gVar, n0Var);
                }
                if (z10 && m0Var.f22486d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - n0Var.f22494c;
    }

    public final View O0(boolean z10) {
        if (this.f2370u) {
            return T0(0, v(), z10, true);
        }
        return T0(v() - 1, -1, z10, true);
    }

    public final View P0(boolean z10) {
        if (this.f2370u) {
            return T0(v() - 1, -1, z10, true);
        }
        return T0(0, v(), z10, true);
    }

    public final int Q0() {
        View T0 = T0(0, v(), false, true);
        if (T0 == null) {
            return -1;
        }
        return i1.H(T0);
    }

    public final int R0() {
        View T0 = T0(v() - 1, -1, false, true);
        if (T0 == null) {
            return -1;
        }
        return i1.H(T0);
    }

    public final View S0(int i10, int i11) {
        int i12;
        int i13;
        M0();
        if (i11 > i10 || i11 < i10) {
            if (this.f2367r.d(u(i10)) < this.f2367r.f()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            if (this.f2365p == 0) {
                return this.f22406c.h(i10, i11, i12, i13);
            }
            return this.f22407d.h(i10, i11, i12, i13);
        }
        return u(i10);
    }

    @Override // k7.i1
    public final void T(RecyclerView recyclerView) {
    }

    public final View T0(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        M0();
        int i13 = 320;
        if (z10) {
            i12 = 24579;
        } else {
            i12 = 320;
        }
        if (!z11) {
            i13 = 0;
        }
        if (this.f2365p == 0) {
            return this.f22406c.h(i10, i11, i12, i13);
        }
        return this.f22407d.h(i10, i11, i12, i13);
    }

    @Override // k7.i1
    public View U(View view, int i10, u6.g gVar, u1 u1Var) {
        int L0;
        View S0;
        View X0;
        e1();
        if (v() == 0 || (L0 = L0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        M0();
        i1(L0, (int) (this.f2367r.g() * 0.33333334f), false, u1Var);
        n0 n0Var = this.f2366q;
        n0Var.f22498g = Integer.MIN_VALUE;
        n0Var.f22492a = false;
        N0(gVar, n0Var, u1Var, true);
        if (L0 == -1) {
            if (this.f2370u) {
                S0 = S0(v() - 1, -1);
            } else {
                S0 = S0(0, v());
            }
        } else if (this.f2370u) {
            S0 = S0(0, v());
        } else {
            S0 = S0(v() - 1, -1);
        }
        if (L0 == -1) {
            X0 = Y0();
        } else {
            X0 = X0();
        }
        if (X0.hasFocusable()) {
            if (S0 == null) {
                return null;
            }
            return X0;
        }
        return S0;
    }

    public View U0(u6.g gVar, u1 u1Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        M0();
        int v10 = v();
        if (z11) {
            i11 = v() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = v10;
            i11 = 0;
            i12 = 1;
        }
        int b10 = u1Var.b();
        int f10 = this.f2367r.f();
        int e10 = this.f2367r.e();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i10) {
            View u10 = u(i11);
            int H = i1.H(u10);
            int d10 = this.f2367r.d(u10);
            int b11 = this.f2367r.b(u10);
            if (H >= 0 && H < b10) {
                if (((j1) u10.getLayoutParams()).f22430a.l()) {
                    if (view3 == null) {
                        view3 = u10;
                    }
                } else {
                    if (b11 <= f10 && d10 < f10) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (d10 >= e10 && b11 > e10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z12 && !z13) {
                        return u10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = u10;
                        }
                        view2 = u10;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = u10;
                        }
                        view2 = u10;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // k7.i1
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(Q0());
            accessibilityEvent.setToIndex(R0());
        }
    }

    public final int V0(int i10, u6.g gVar, u1 u1Var, boolean z10) {
        int e10;
        int e11 = this.f2367r.e() - i10;
        if (e11 > 0) {
            int i11 = -f1(-e11, gVar, u1Var);
            int i12 = i10 + i11;
            if (z10 && (e10 = this.f2367r.e() - i12) > 0) {
                this.f2367r.k(e10);
                return e10 + i11;
            }
            return i11;
        }
        return 0;
    }

    @Override // k7.i1
    public void W(u6.g gVar, u1 u1Var, e4.m mVar) {
        super.W(gVar, u1Var, mVar);
        z0 z0Var = this.f22405b.f2400m;
        if (z0Var != null && z0Var.a() > 0) {
            mVar.b(f.f14982o);
        }
    }

    public final int W0(int i10, u6.g gVar, u1 u1Var, boolean z10) {
        int f10;
        int f11 = i10 - this.f2367r.f();
        if (f11 > 0) {
            int i11 = -f1(f11, gVar, u1Var);
            int i12 = i10 + i11;
            if (z10 && (f10 = i12 - this.f2367r.f()) > 0) {
                this.f2367r.k(-f10);
                return i11 - f10;
            }
            return i11;
        }
        return 0;
    }

    public final View X0() {
        int v10;
        if (this.f2370u) {
            v10 = 0;
        } else {
            v10 = v() - 1;
        }
        return u(v10);
    }

    public final View Y0() {
        int i10;
        if (this.f2370u) {
            i10 = v() - 1;
        } else {
            i10 = 0;
        }
        return u(i10);
    }

    public final boolean Z0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    @Override // k7.t1
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < i1.H(u(0))) {
            z10 = true;
        }
        if (z10 != this.f2370u) {
            i11 = -1;
        }
        if (this.f2365p == 0) {
            return new PointF(i11, s0.g.f34069a);
        }
        return new PointF(s0.g.f34069a, i11);
    }

    public void a1(u6.g gVar, u1 u1Var, n0 n0Var, m0 m0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        View b10 = n0Var.b(gVar);
        if (b10 == null) {
            m0Var.f22484b = true;
            return;
        }
        j1 j1Var = (j1) b10.getLayoutParams();
        if (n0Var.f22502k == null) {
            boolean z12 = this.f2370u;
            if (n0Var.f22497f == -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z12 == z11) {
                b(b10, -1, false);
            } else {
                b(b10, 0, false);
            }
        } else {
            boolean z13 = this.f2370u;
            if (n0Var.f22497f == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z13 == z10) {
                b(b10, -1, true);
            } else {
                b(b10, 0, true);
            }
        }
        P(b10);
        m0Var.f22483a = this.f2367r.c(b10);
        if (this.f2365p == 1) {
            if (Z0()) {
                i13 = this.f22417n - F();
                i10 = i13 - this.f2367r.l(b10);
            } else {
                i10 = E();
                i13 = this.f2367r.l(b10) + i10;
            }
            if (n0Var.f22497f == -1) {
                i11 = n0Var.f22493b;
                i12 = i11 - m0Var.f22483a;
            } else {
                i12 = n0Var.f22493b;
                i11 = m0Var.f22483a + i12;
            }
        } else {
            int G = G();
            int l10 = this.f2367r.l(b10) + G;
            if (n0Var.f22497f == -1) {
                int i14 = n0Var.f22493b;
                int i15 = i14 - m0Var.f22483a;
                i13 = i14;
                i11 = l10;
                i10 = i15;
                i12 = G;
            } else {
                int i16 = n0Var.f22493b;
                int i17 = m0Var.f22483a + i16;
                i10 = i16;
                i11 = l10;
                i12 = G;
                i13 = i17;
            }
        }
        i1.O(b10, i10, i12, i13, i11);
        if (j1Var.f22430a.l() || j1Var.f22430a.o()) {
            m0Var.f22485c = true;
        }
        m0Var.f22486d = b10.hasFocusable();
    }

    public void b1(u6.g gVar, u1 u1Var, w wVar, int i10) {
    }

    @Override // k7.i1
    public final void c(String str) {
        if (this.f2375z == null) {
            super.c(str);
        }
    }

    public final void c1(u6.g gVar, n0 n0Var) {
        int i10;
        if (n0Var.f22492a && !n0Var.f22503l) {
            int i11 = n0Var.f22498g;
            int i12 = n0Var.f22500i;
            if (n0Var.f22497f == -1) {
                int v10 = v();
                if (i11 >= 0) {
                    s0 s0Var = this.f2367r;
                    int i13 = s0Var.f22566d;
                    i1 i1Var = s0Var.f22577a;
                    switch (i13) {
                        case 0:
                            i10 = i1Var.f22417n;
                            break;
                        default:
                            i10 = i1Var.f22418o;
                            break;
                    }
                    int i14 = (i10 - i11) + i12;
                    if (this.f2370u) {
                        for (int i15 = 0; i15 < v10; i15++) {
                            View u10 = u(i15);
                            if (this.f2367r.d(u10) < i14 || this.f2367r.j(u10) < i14) {
                                d1(gVar, 0, i15);
                                return;
                            }
                        }
                        return;
                    }
                    int i16 = v10 - 1;
                    for (int i17 = i16; i17 >= 0; i17--) {
                        View u11 = u(i17);
                        if (this.f2367r.d(u11) < i14 || this.f2367r.j(u11) < i14) {
                            d1(gVar, i16, i17);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i11 >= 0) {
                int i18 = i11 - i12;
                int v11 = v();
                if (this.f2370u) {
                    int i19 = v11 - 1;
                    for (int i20 = i19; i20 >= 0; i20--) {
                        View u12 = u(i20);
                        if (this.f2367r.b(u12) > i18 || this.f2367r.i(u12) > i18) {
                            d1(gVar, i19, i20);
                            return;
                        }
                    }
                    return;
                }
                for (int i21 = 0; i21 < v11; i21++) {
                    View u13 = u(i21);
                    if (this.f2367r.b(u13) > i18 || this.f2367r.i(u13) > i18) {
                        d1(gVar, 0, i21);
                        return;
                    }
                }
            }
        }
    }

    @Override // k7.i1
    public final boolean d() {
        return this.f2365p == 0;
    }

    public final void d1(u6.g gVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                View u10 = u(i12);
                if (u(i12) != null) {
                    this.f22404a.l(i12);
                }
                gVar.j(u10);
            }
            return;
        }
        while (i10 > i11) {
            View u11 = u(i10);
            if (u(i10) != null) {
                this.f22404a.l(i10);
            }
            gVar.j(u11);
            i10--;
        }
    }

    @Override // k7.i1
    public final boolean e() {
        return this.f2365p == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03be  */
    @Override // k7.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(u6.g r18, k7.u1 r19) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.e0(u6.g, k7.u1):void");
    }

    public final void e1() {
        if (this.f2365p != 1 && Z0()) {
            this.f2370u = !this.f2369t;
        } else {
            this.f2370u = this.f2369t;
        }
    }

    @Override // k7.i1
    public void f0(u1 u1Var) {
        this.f2375z = null;
        this.f2373x = -1;
        this.f2374y = Integer.MIN_VALUE;
        this.A.f();
    }

    public final int f1(int i10, u6.g gVar, u1 u1Var) {
        int i11;
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        M0();
        this.f2366q.f22492a = true;
        if (i10 > 0) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        int abs = Math.abs(i10);
        i1(i11, abs, true, u1Var);
        n0 n0Var = this.f2366q;
        int N0 = N0(gVar, n0Var, u1Var, false) + n0Var.f22498g;
        if (N0 < 0) {
            return 0;
        }
        if (abs > N0) {
            i10 = i11 * N0;
        }
        this.f2367r.k(-i10);
        this.f2366q.f22501j = i10;
        return i10;
    }

    public final void g1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(h.n("invalid orientation:", i10));
        }
        c(null);
        if (i10 != this.f2365p || this.f2367r == null) {
            s0 a10 = t0.a(this, i10);
            this.f2367r = a10;
            this.A.f4045f = a10;
            this.f2365p = i10;
            q0();
        }
    }

    @Override // k7.i1
    public final void h(int i10, int i11, u1 u1Var, m mVar) {
        int i12;
        if (this.f2365p != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            M0();
            if (i10 > 0) {
                i12 = 1;
            } else {
                i12 = -1;
            }
            i1(i12, Math.abs(i10), true, u1Var);
            H0(u1Var, this.f2366q, mVar);
        }
    }

    @Override // k7.i1
    public final void h0(Parcelable parcelable) {
        if (parcelable instanceof o0) {
            o0 o0Var = (o0) parcelable;
            this.f2375z = o0Var;
            if (this.f2373x != -1) {
                o0Var.f22510a = -1;
            }
            q0();
        }
    }

    public void h1(boolean z10) {
        c(null);
        if (this.f2371v == z10) {
            return;
        }
        this.f2371v = z10;
        q0();
    }

    @Override // k7.i1
    public final void i(int i10, m mVar) {
        boolean z10;
        int i11;
        o0 o0Var = this.f2375z;
        int i12 = -1;
        if (o0Var != null && (i11 = o0Var.f22510a) >= 0) {
            z10 = o0Var.f22512c;
        } else {
            e1();
            z10 = this.f2370u;
            i11 = this.f2373x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            mVar.a(i11, 0);
            i11 += i12;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, k7.o0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, java.lang.Object, k7.o0] */
    @Override // k7.i1
    public final Parcelable i0() {
        o0 o0Var = this.f2375z;
        if (o0Var != null) {
            ?? obj = new Object();
            obj.f22510a = o0Var.f22510a;
            obj.f22511b = o0Var.f22511b;
            obj.f22512c = o0Var.f22512c;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            M0();
            boolean z10 = this.f2368s ^ this.f2370u;
            obj2.f22512c = z10;
            if (z10) {
                View X0 = X0();
                obj2.f22511b = this.f2367r.e() - this.f2367r.b(X0);
                obj2.f22510a = i1.H(X0);
            } else {
                View Y0 = Y0();
                obj2.f22510a = i1.H(Y0);
                obj2.f22511b = this.f2367r.d(Y0) - this.f2367r.f();
            }
        } else {
            obj2.f22510a = -1;
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i1(int r7, int r8, boolean r9, k7.u1 r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.i1(int, int, boolean, k7.u1):void");
    }

    @Override // k7.i1
    public final int j(u1 u1Var) {
        return I0(u1Var);
    }

    public final void j1(int i10, int i11) {
        int i12;
        this.f2366q.f22494c = this.f2367r.e() - i11;
        n0 n0Var = this.f2366q;
        if (this.f2370u) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        n0Var.f22496e = i12;
        n0Var.f22495d = i10;
        n0Var.f22497f = 1;
        n0Var.f22493b = i11;
        n0Var.f22498g = Integer.MIN_VALUE;
    }

    @Override // k7.i1
    public int k(u1 u1Var) {
        return J0(u1Var);
    }

    @Override // k7.i1
    public boolean k0(int i10, Bundle bundle) {
        int min;
        if (super.k0(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f2365p == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.f22405b;
                min = Math.min(i11, J(recyclerView.f2382c, recyclerView.f2424y0) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.f22405b;
                min = Math.min(i12, x(recyclerView2.f2382c, recyclerView2.f2424y0) - 1);
            }
            if (min >= 0) {
                this.f2373x = min;
                this.f2374y = 0;
                o0 o0Var = this.f2375z;
                if (o0Var != null) {
                    o0Var.f22510a = -1;
                }
                q0();
                return true;
            }
        }
        return false;
    }

    public final void k1(int i10, int i11) {
        int i12;
        this.f2366q.f22494c = i11 - this.f2367r.f();
        n0 n0Var = this.f2366q;
        n0Var.f22495d = i10;
        if (this.f2370u) {
            i12 = 1;
        } else {
            i12 = -1;
        }
        n0Var.f22496e = i12;
        n0Var.f22497f = -1;
        n0Var.f22493b = i11;
        n0Var.f22498g = Integer.MIN_VALUE;
    }

    @Override // k7.i1
    public int l(u1 u1Var) {
        return K0(u1Var);
    }

    @Override // k7.i1
    public final int m(u1 u1Var) {
        return I0(u1Var);
    }

    @Override // k7.i1
    public int n(u1 u1Var) {
        return J0(u1Var);
    }

    @Override // k7.i1
    public int o(u1 u1Var) {
        return K0(u1Var);
    }

    @Override // k7.i1
    public final View q(int i10) {
        int v10 = v();
        if (v10 == 0) {
            return null;
        }
        int H = i10 - i1.H(u(0));
        if (H >= 0 && H < v10) {
            View u10 = u(H);
            if (i1.H(u10) == i10) {
                return u10;
            }
        }
        return super.q(i10);
    }

    @Override // k7.i1
    public j1 r() {
        return new j1(-2, -2);
    }

    @Override // k7.i1
    public int s0(int i10, u6.g gVar, u1 u1Var) {
        if (this.f2365p == 1) {
            return 0;
        }
        return f1(i10, gVar, u1Var);
    }

    @Override // k7.i1
    public final void t0(int i10) {
        this.f2373x = i10;
        this.f2374y = Integer.MIN_VALUE;
        o0 o0Var = this.f2375z;
        if (o0Var != null) {
            o0Var.f22510a = -1;
        }
        q0();
    }

    @Override // k7.i1
    public int u0(int i10, u6.g gVar, u1 u1Var) {
        if (this.f2365p == 0) {
            return 0;
        }
        return f1(i10, gVar, u1Var);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [k7.m0, java.lang.Object] */
    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2365p = 1;
        this.f2369t = false;
        this.f2370u = false;
        this.f2371v = false;
        this.f2372w = true;
        this.f2373x = -1;
        this.f2374y = Integer.MIN_VALUE;
        this.f2375z = null;
        this.A = new w();
        this.B = new Object();
        this.C = 2;
        this.D = new int[2];
        h1 I = i1.I(context, attributeSet, i10, i11);
        g1(I.f22392a);
        boolean z10 = I.f22394c;
        c(null);
        if (z10 != this.f2369t) {
            this.f2369t = z10;
            q0();
        }
        h1(I.f22395d);
    }
}
