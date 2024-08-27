package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.Api;
import d4.n1;
import d4.v0;
import e4.l;
import ep.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import k7.c2;
import k7.d2;
import k7.f2;
import k7.g2;
import k7.h1;
import k7.i1;
import k7.j1;
import k7.l0;
import k7.p0;
import k7.s0;
import k7.t0;
import k7.t1;
import k7.u1;
import k7.x;
import yk.g;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends i1 implements t1 {
    public final m B;
    public final int C;
    public boolean D;
    public boolean E;
    public f2 F;
    public final Rect G;
    public final c2 H;
    public final boolean I;
    public int[] J;
    public final x K;

    /* renamed from: p, reason: collision with root package name */
    public final int f2427p;

    /* renamed from: q, reason: collision with root package name */
    public final g2[] f2428q;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f2429r;

    /* renamed from: s, reason: collision with root package name */
    public final t0 f2430s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2431t;

    /* renamed from: u, reason: collision with root package name */
    public int f2432u;

    /* renamed from: v, reason: collision with root package name */
    public final l0 f2433v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2434w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2436y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2435x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2437z = -1;
    public int A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k7.l0] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2427p = -1;
        this.f2434w = false;
        m mVar = new m(1);
        this.B = mVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new c2(this);
        this.I = true;
        this.K = new x(this, 2);
        h1 I = i1.I(context, attributeSet, i10, i11);
        int i12 = I.f22392a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f2431t) {
            this.f2431t = i12;
            t0 t0Var = this.f2429r;
            this.f2429r = this.f2430s;
            this.f2430s = t0Var;
            q0();
        }
        int i13 = I.f22393b;
        c(null);
        if (i13 != this.f2427p) {
            mVar.f();
            q0();
            this.f2427p = i13;
            this.f2436y = new BitSet(this.f2427p);
            this.f2428q = new g2[this.f2427p];
            for (int i14 = 0; i14 < this.f2427p; i14++) {
                this.f2428q[i14] = new g2(this, i14);
            }
            q0();
        }
        boolean z10 = I.f22394c;
        c(null);
        f2 f2Var = this.F;
        if (f2Var != null && f2Var.f22355h != z10) {
            f2Var.f22355h = z10;
        }
        this.f2434w = z10;
        q0();
        ?? obj = new Object();
        obj.f22468a = true;
        obj.f22473f = 0;
        obj.f22474g = 0;
        this.f2433v = obj;
        this.f2429r = t0.a(this, this.f2431t);
        this.f2430s = t0.a(this, 1 - this.f2431t);
    }

    public static int j1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode);
    }

    @Override // k7.i1
    public final void D0(RecyclerView recyclerView, int i10) {
        p0 p0Var = new p0(recyclerView.getContext());
        p0Var.f22522a = i10;
        E0(p0Var);
    }

    @Override // k7.i1
    public final boolean F0() {
        return this.F == null;
    }

    public final int G0(int i10) {
        boolean z10;
        if (v() == 0) {
            if (!this.f2435x) {
                return -1;
            }
            return 1;
        }
        if (i10 < Q0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f2435x) {
            return -1;
        }
        return 1;
    }

    public final boolean H0() {
        int Q0;
        if (v() != 0 && this.C != 0 && this.f22410g) {
            if (this.f2435x) {
                Q0 = R0();
                Q0();
            } else {
                Q0 = Q0();
                R0();
            }
            m mVar = this.B;
            if (Q0 == 0 && V0() != null) {
                mVar.f();
                this.f22409f = true;
                q0();
                return true;
            }
        }
        return false;
    }

    public final int I0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        t0 t0Var = this.f2429r;
        boolean z10 = this.I;
        return g.l(u1Var, t0Var, N0(!z10), M0(!z10), this, this.I);
    }

    @Override // k7.i1
    public final int J(u6.g gVar, u1 u1Var) {
        if (this.f2431t == 0) {
            return Math.min(this.f2427p, u1Var.b());
        }
        return -1;
    }

    public final int J0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        t0 t0Var = this.f2429r;
        boolean z10 = this.I;
        return g.m(u1Var, t0Var, N0(!z10), M0(!z10), this, this.I, this.f2435x);
    }

    public final int K0(u1 u1Var) {
        if (v() == 0) {
            return 0;
        }
        t0 t0Var = this.f2429r;
        boolean z10 = this.I;
        return g.n(u1Var, t0Var, N0(!z10), M0(!z10), this, this.I);
    }

    @Override // k7.i1
    public final boolean L() {
        return this.C != 0;
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int L0(u6.g gVar, l0 l0Var, u1 u1Var) {
        int i10;
        int f10;
        int i11;
        int S0;
        int i12;
        g2 g2Var;
        ?? r62;
        int i13;
        int h10;
        int c10;
        int f11;
        int c11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 0;
        int i19 = 1;
        this.f2436y.set(0, this.f2427p, true);
        l0 l0Var2 = this.f2433v;
        if (l0Var2.f22476i) {
            if (l0Var.f22472e == 1) {
                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i10 = Integer.MIN_VALUE;
            }
        } else if (l0Var.f22472e == 1) {
            i10 = l0Var.f22474g + l0Var.f22469b;
        } else {
            i10 = l0Var.f22473f - l0Var.f22469b;
        }
        int i20 = l0Var.f22472e;
        for (int i21 = 0; i21 < this.f2427p; i21++) {
            if (!this.f2428q[i21].f22362a.isEmpty()) {
                i1(this.f2428q[i21], i20, i10);
            }
        }
        if (this.f2435x) {
            f10 = this.f2429r.e();
        } else {
            f10 = this.f2429r.f();
        }
        boolean z10 = false;
        while (true) {
            int i22 = l0Var.f22470c;
            if (i22 >= 0 && i22 < u1Var.b()) {
                i11 = i19;
            } else {
                i11 = i18;
            }
            if (i11 == 0 || (!l0Var2.f22476i && this.f2436y.isEmpty())) {
                break;
            }
            View e10 = gVar.e(l0Var.f22470c);
            l0Var.f22470c += l0Var.f22471d;
            d2 d2Var = (d2) e10.getLayoutParams();
            int e11 = d2Var.f22430a.e();
            m mVar = this.B;
            int[] iArr = (int[]) mVar.f15794b;
            if (iArr != null && e11 < iArr.length) {
                i12 = iArr[e11];
            } else {
                i12 = -1;
            }
            if (i12 == -1) {
                if (Z0(l0Var.f22472e)) {
                    i17 = this.f2427p - i19;
                    i16 = -1;
                    i15 = -1;
                } else {
                    i15 = i19;
                    i16 = this.f2427p;
                    i17 = i18;
                }
                g2 g2Var2 = null;
                if (l0Var.f22472e == i19) {
                    int f12 = this.f2429r.f();
                    int i23 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i17 != i16) {
                        g2 g2Var3 = this.f2428q[i17];
                        int f13 = g2Var3.f(f12);
                        if (f13 < i23) {
                            i23 = f13;
                            g2Var2 = g2Var3;
                        }
                        i17 += i15;
                    }
                } else {
                    int e12 = this.f2429r.e();
                    int i24 = Integer.MIN_VALUE;
                    while (i17 != i16) {
                        g2 g2Var4 = this.f2428q[i17];
                        int h11 = g2Var4.h(e12);
                        if (h11 > i24) {
                            g2Var2 = g2Var4;
                            i24 = h11;
                        }
                        i17 += i15;
                    }
                }
                g2Var = g2Var2;
                mVar.g(e11);
                ((int[]) mVar.f15794b)[e11] = g2Var.f22366e;
            } else {
                g2Var = this.f2428q[i12];
            }
            d2Var.f22329e = g2Var;
            if (l0Var.f22472e == 1) {
                r62 = 0;
                b(e10, -1, false);
            } else {
                r62 = 0;
                b(e10, 0, false);
            }
            if (this.f2431t == 1) {
                i13 = 1;
                X0(e10, i1.w(this.f2432u, this.f22415l, r62, ((ViewGroup.MarginLayoutParams) d2Var).width, r62), i1.w(this.f22418o, this.f22416m, D() + G(), ((ViewGroup.MarginLayoutParams) d2Var).height, true));
            } else {
                i13 = 1;
                X0(e10, i1.w(this.f22417n, this.f22415l, F() + E(), ((ViewGroup.MarginLayoutParams) d2Var).width, true), i1.w(this.f2432u, this.f22416m, 0, ((ViewGroup.MarginLayoutParams) d2Var).height, false));
            }
            if (l0Var.f22472e == i13) {
                c10 = g2Var.f(f10);
                h10 = this.f2429r.c(e10) + c10;
            } else {
                h10 = g2Var.h(f10);
                c10 = h10 - this.f2429r.c(e10);
            }
            if (l0Var.f22472e == 1) {
                g2 g2Var5 = d2Var.f22329e;
                g2Var5.getClass();
                d2 d2Var2 = (d2) e10.getLayoutParams();
                d2Var2.f22329e = g2Var5;
                ArrayList arrayList = g2Var5.f22362a;
                arrayList.add(e10);
                g2Var5.f22364c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    g2Var5.f22363b = Integer.MIN_VALUE;
                }
                if (d2Var2.f22430a.l() || d2Var2.f22430a.o()) {
                    g2Var5.f22365d = g2Var5.f22367f.f2429r.c(e10) + g2Var5.f22365d;
                }
            } else {
                g2 g2Var6 = d2Var.f22329e;
                g2Var6.getClass();
                d2 d2Var3 = (d2) e10.getLayoutParams();
                d2Var3.f22329e = g2Var6;
                ArrayList arrayList2 = g2Var6.f22362a;
                arrayList2.add(0, e10);
                g2Var6.f22363b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    g2Var6.f22364c = Integer.MIN_VALUE;
                }
                if (d2Var3.f22430a.l() || d2Var3.f22430a.o()) {
                    g2Var6.f22365d = g2Var6.f22367f.f2429r.c(e10) + g2Var6.f22365d;
                }
            }
            if (W0() && this.f2431t == 1) {
                c11 = this.f2430s.e() - (((this.f2427p - 1) - g2Var.f22366e) * this.f2432u);
                f11 = c11 - this.f2430s.c(e10);
            } else {
                f11 = this.f2430s.f() + (g2Var.f22366e * this.f2432u);
                c11 = this.f2430s.c(e10) + f11;
            }
            if (this.f2431t == 1) {
                i1.O(e10, f11, c10, c11, h10);
            } else {
                i1.O(e10, c10, f11, h10, c11);
            }
            i1(g2Var, l0Var2.f22472e, i10);
            b1(gVar, l0Var2);
            if (l0Var2.f22475h && e10.hasFocusable()) {
                i14 = 0;
                this.f2436y.set(g2Var.f22366e, false);
            } else {
                i14 = 0;
            }
            i18 = i14;
            i19 = 1;
            z10 = true;
        }
        int i25 = i18;
        if (!z10) {
            b1(gVar, l0Var2);
        }
        if (l0Var2.f22472e == -1) {
            S0 = this.f2429r.f() - T0(this.f2429r.f());
        } else {
            S0 = S0(this.f2429r.e()) - this.f2429r.e();
        }
        if (S0 > 0) {
            return Math.min(l0Var.f22469b, S0);
        }
        return i25;
    }

    @Override // k7.i1
    public final boolean M() {
        return this.f2434w;
    }

    public final View M0(boolean z10) {
        int f10 = this.f2429r.f();
        int e10 = this.f2429r.e();
        View view = null;
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u10 = u(v10);
            int d10 = this.f2429r.d(u10);
            int b10 = this.f2429r.b(u10);
            if (b10 > f10 && d10 < e10) {
                if (b10 > e10 && z10) {
                    if (view == null) {
                        view = u10;
                    }
                } else {
                    return u10;
                }
            }
        }
        return view;
    }

    public final View N0(boolean z10) {
        int f10 = this.f2429r.f();
        int e10 = this.f2429r.e();
        int v10 = v();
        View view = null;
        for (int i10 = 0; i10 < v10; i10++) {
            View u10 = u(i10);
            int d10 = this.f2429r.d(u10);
            if (this.f2429r.b(u10) > f10 && d10 < e10) {
                if (d10 < f10 && z10) {
                    if (view == null) {
                        view = u10;
                    }
                } else {
                    return u10;
                }
            }
        }
        return view;
    }

    public final void O0(u6.g gVar, u1 u1Var, boolean z10) {
        int e10;
        int S0 = S0(Integer.MIN_VALUE);
        if (S0 != Integer.MIN_VALUE && (e10 = this.f2429r.e() - S0) > 0) {
            int i10 = e10 - (-f1(-e10, gVar, u1Var));
            if (z10 && i10 > 0) {
                this.f2429r.k(i10);
            }
        }
    }

    public final void P0(u6.g gVar, u1 u1Var, boolean z10) {
        int f10;
        int T0 = T0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (T0 != Integer.MAX_VALUE && (f10 = T0 - this.f2429r.f()) > 0) {
            int f12 = f10 - f1(f10, gVar, u1Var);
            if (z10 && f12 > 0) {
                this.f2429r.k(-f12);
            }
        }
    }

    @Override // k7.i1
    public final void Q(int i10) {
        super.Q(i10);
        for (int i11 = 0; i11 < this.f2427p; i11++) {
            g2 g2Var = this.f2428q[i11];
            int i12 = g2Var.f22363b;
            if (i12 != Integer.MIN_VALUE) {
                g2Var.f22363b = i12 + i10;
            }
            int i13 = g2Var.f22364c;
            if (i13 != Integer.MIN_VALUE) {
                g2Var.f22364c = i13 + i10;
            }
        }
    }

    public final int Q0() {
        if (v() == 0) {
            return 0;
        }
        return i1.H(u(0));
    }

    @Override // k7.i1
    public final void R(int i10) {
        super.R(i10);
        for (int i11 = 0; i11 < this.f2427p; i11++) {
            g2 g2Var = this.f2428q[i11];
            int i12 = g2Var.f22363b;
            if (i12 != Integer.MIN_VALUE) {
                g2Var.f22363b = i12 + i10;
            }
            int i13 = g2Var.f22364c;
            if (i13 != Integer.MIN_VALUE) {
                g2Var.f22364c = i13 + i10;
            }
        }
    }

    public final int R0() {
        int v10 = v();
        if (v10 == 0) {
            return 0;
        }
        return i1.H(u(v10 - 1));
    }

    @Override // k7.i1
    public final void S() {
        this.B.f();
        for (int i10 = 0; i10 < this.f2427p; i10++) {
            this.f2428q[i10].b();
        }
    }

    public final int S0(int i10) {
        int f10 = this.f2428q[0].f(i10);
        for (int i11 = 1; i11 < this.f2427p; i11++) {
            int f11 = this.f2428q[i11].f(i10);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        return f10;
    }

    @Override // k7.i1
    public final void T(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f22405b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f2427p; i10++) {
            this.f2428q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final int T0(int i10) {
        int h10 = this.f2428q[0].h(i10);
        for (int i11 = 1; i11 < this.f2427p; i11++) {
            int h11 = this.f2428q[i11].h(i10);
            if (h11 < h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004b, code lost:
    
        if (r8.f2431t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0050, code lost:
    
        if (r8.f2431t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:
    
        if (W0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006a, code lost:
    
        if (W0() == false) goto L46;
     */
    @Override // k7.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r9, int r10, u6.g r11, k7.u1 r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U(android.view.View, int, u6.g, k7.u1):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f2435x
            if (r0 == 0) goto L9
            int r0 = r7.R0()
            goto Ld
        L9:
            int r0 = r7.Q0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            ep.m r4 = r7.B
            r4.i(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.l(r8, r5)
            r4.k(r9, r5)
            goto L3a
        L33:
            r4.l(r8, r9)
            goto L3a
        L37:
            r4.k(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f2435x
            if (r8 == 0) goto L46
            int r8 = r7.Q0()
            goto L4a
        L46:
            int r8 = r7.R0()
        L4a:
            if (r3 > r8) goto L4f
            r7.q0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0(int, int, int):void");
    }

    @Override // k7.i1
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            View N0 = N0(false);
            View M0 = M0(false);
            if (N0 != null && M0 != null) {
                int H = i1.H(N0);
                int H2 = i1.H(M0);
                if (H < H2) {
                    accessibilityEvent.setFromIndex(H);
                    accessibilityEvent.setToIndex(H2);
                } else {
                    accessibilityEvent.setFromIndex(H2);
                    accessibilityEvent.setToIndex(H);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View V0() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0():android.view.View");
    }

    @Override // k7.i1
    public final void W(u6.g gVar, u1 u1Var, e4.m mVar) {
        super.W(gVar, u1Var, mVar);
        mVar.j("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean W0() {
        if (C() == 1) {
            return true;
        }
        return false;
    }

    public final void X0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f22405b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
        d2 d2Var = (d2) view.getLayoutParams();
        int j12 = j1(i10, ((ViewGroup.MarginLayoutParams) d2Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) d2Var).rightMargin + rect.right);
        int j13 = j1(i11, ((ViewGroup.MarginLayoutParams) d2Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin + rect.bottom);
        if (A0(view, j12, j13, d2Var)) {
            view.measure(j12, j13);
        }
    }

    @Override // k7.i1
    public final void Y(u6.g gVar, u1 u1Var, View view, e4.m mVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof d2)) {
            X(view, mVar);
            return;
        }
        d2 d2Var = (d2) layoutParams;
        int i10 = -1;
        if (this.f2431t == 0) {
            g2 g2Var = d2Var.f22329e;
            if (g2Var != null) {
                i10 = g2Var.f22366e;
            }
            mVar.l(l.a(i10, 1, -1, -1, false, false));
            return;
        }
        g2 g2Var2 = d2Var.f22329e;
        if (g2Var2 != null) {
            i10 = g2Var2.f22366e;
        }
        mVar.l(l.a(-1, -1, i10, 1, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0429, code lost:
    
        if (H0() != false) goto L262;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y0(u6.g r17, k7.u1 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0(u6.g, k7.u1, boolean):void");
    }

    @Override // k7.i1
    public final void Z(int i10, int i11) {
        U0(i10, i11, 1);
    }

    public final boolean Z0(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f2431t == 0) {
            if (i10 == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.f2435x) {
                return false;
            }
            return true;
        }
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 == this.f2435x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != W0()) {
            return false;
        }
        return true;
    }

    @Override // k7.t1
    public final PointF a(int i10) {
        int G0 = G0(i10);
        PointF pointF = new PointF();
        if (G0 == 0) {
            return null;
        }
        if (this.f2431t == 0) {
            pointF.x = G0;
            pointF.y = s0.g.f34069a;
        } else {
            pointF.x = s0.g.f34069a;
            pointF.y = G0;
        }
        return pointF;
    }

    @Override // k7.i1
    public final void a0() {
        this.B.f();
        q0();
    }

    public final void a1(int i10, u1 u1Var) {
        int Q0;
        int i11;
        if (i10 > 0) {
            Q0 = R0();
            i11 = 1;
        } else {
            Q0 = Q0();
            i11 = -1;
        }
        l0 l0Var = this.f2433v;
        l0Var.f22468a = true;
        h1(Q0, u1Var);
        g1(i11);
        l0Var.f22470c = Q0 + l0Var.f22471d;
        l0Var.f22469b = Math.abs(i10);
    }

    @Override // k7.i1
    public final void b0(int i10, int i11) {
        U0(i10, i11, 8);
    }

    public final void b1(u6.g gVar, l0 l0Var) {
        int min;
        int min2;
        if (l0Var.f22468a && !l0Var.f22476i) {
            if (l0Var.f22469b == 0) {
                if (l0Var.f22472e == -1) {
                    c1(l0Var.f22474g, gVar);
                    return;
                } else {
                    d1(l0Var.f22473f, gVar);
                    return;
                }
            }
            int i10 = 1;
            if (l0Var.f22472e == -1) {
                int i11 = l0Var.f22473f;
                int h10 = this.f2428q[0].h(i11);
                while (i10 < this.f2427p) {
                    int h11 = this.f2428q[i10].h(i11);
                    if (h11 > h10) {
                        h10 = h11;
                    }
                    i10++;
                }
                int i12 = i11 - h10;
                if (i12 < 0) {
                    min2 = l0Var.f22474g;
                } else {
                    min2 = l0Var.f22474g - Math.min(i12, l0Var.f22469b);
                }
                c1(min2, gVar);
                return;
            }
            int i13 = l0Var.f22474g;
            int f10 = this.f2428q[0].f(i13);
            while (i10 < this.f2427p) {
                int f11 = this.f2428q[i10].f(i13);
                if (f11 < f10) {
                    f10 = f11;
                }
                i10++;
            }
            int i14 = f10 - l0Var.f22474g;
            if (i14 < 0) {
                min = l0Var.f22473f;
            } else {
                min = Math.min(i14, l0Var.f22469b) + l0Var.f22473f;
            }
            d1(min, gVar);
        }
    }

    @Override // k7.i1
    public final void c(String str) {
        if (this.F == null) {
            super.c(str);
        }
    }

    @Override // k7.i1
    public final void c0(int i10, int i11) {
        U0(i10, i11, 2);
    }

    public final void c1(int i10, u6.g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            View u10 = u(v10);
            if (this.f2429r.d(u10) >= i10 && this.f2429r.j(u10) >= i10) {
                d2 d2Var = (d2) u10.getLayoutParams();
                d2Var.getClass();
                if (d2Var.f22329e.f22362a.size() == 1) {
                    return;
                }
                g2 g2Var = d2Var.f22329e;
                ArrayList arrayList = g2Var.f22362a;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                d2 d2Var2 = (d2) view.getLayoutParams();
                d2Var2.f22329e = null;
                if (d2Var2.f22430a.l() || d2Var2.f22430a.o()) {
                    g2Var.f22365d -= g2Var.f22367f.f2429r.c(view);
                }
                if (size == 1) {
                    g2Var.f22363b = Integer.MIN_VALUE;
                }
                g2Var.f22364c = Integer.MIN_VALUE;
                o0(u10, gVar);
            } else {
                return;
            }
        }
    }

    @Override // k7.i1
    public final boolean d() {
        return this.f2431t == 0;
    }

    @Override // k7.i1
    public final void d0(int i10, int i11) {
        U0(i10, i11, 4);
    }

    public final void d1(int i10, u6.g gVar) {
        while (v() > 0) {
            View u10 = u(0);
            if (this.f2429r.b(u10) <= i10 && this.f2429r.i(u10) <= i10) {
                d2 d2Var = (d2) u10.getLayoutParams();
                d2Var.getClass();
                if (d2Var.f22329e.f22362a.size() == 1) {
                    return;
                }
                g2 g2Var = d2Var.f22329e;
                ArrayList arrayList = g2Var.f22362a;
                View view = (View) arrayList.remove(0);
                d2 d2Var2 = (d2) view.getLayoutParams();
                d2Var2.f22329e = null;
                if (arrayList.size() == 0) {
                    g2Var.f22364c = Integer.MIN_VALUE;
                }
                if (d2Var2.f22430a.l() || d2Var2.f22430a.o()) {
                    g2Var.f22365d -= g2Var.f22367f.f2429r.c(view);
                }
                g2Var.f22363b = Integer.MIN_VALUE;
                o0(u10, gVar);
            } else {
                return;
            }
        }
    }

    @Override // k7.i1
    public final boolean e() {
        return this.f2431t == 1;
    }

    @Override // k7.i1
    public final void e0(u6.g gVar, u1 u1Var) {
        Y0(gVar, u1Var, true);
    }

    public final void e1() {
        if (this.f2431t != 1 && W0()) {
            this.f2435x = !this.f2434w;
        } else {
            this.f2435x = this.f2434w;
        }
    }

    @Override // k7.i1
    public final boolean f(j1 j1Var) {
        return j1Var instanceof d2;
    }

    @Override // k7.i1
    public final void f0(u1 u1Var) {
        this.f2437z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final int f1(int i10, u6.g gVar, u1 u1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        a1(i10, u1Var);
        l0 l0Var = this.f2433v;
        int L0 = L0(gVar, l0Var, u1Var);
        if (l0Var.f22469b >= L0) {
            if (i10 < 0) {
                i10 = -L0;
            } else {
                i10 = L0;
            }
        }
        this.f2429r.k(-i10);
        this.D = this.f2435x;
        l0Var.f22469b = 0;
        b1(gVar, l0Var);
        return i10;
    }

    public final void g1(int i10) {
        boolean z10;
        l0 l0Var = this.f2433v;
        l0Var.f22472e = i10;
        boolean z11 = this.f2435x;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z11 != z10) {
            i11 = -1;
        }
        l0Var.f22471d = i11;
    }

    @Override // k7.i1
    public final void h(int i10, int i11, u1 u1Var, p2.m mVar) {
        l0 l0Var;
        int f10;
        int i12;
        if (this.f2431t != 0) {
            i10 = i11;
        }
        if (v() != 0 && i10 != 0) {
            a1(i10, u1Var);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f2427p) {
                this.J = new int[this.f2427p];
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.f2427p;
                l0Var = this.f2433v;
                if (i13 >= i15) {
                    break;
                }
                if (l0Var.f22471d == -1) {
                    f10 = l0Var.f22473f;
                    i12 = this.f2428q[i13].h(f10);
                } else {
                    f10 = this.f2428q[i13].f(l0Var.f22474g);
                    i12 = l0Var.f22474g;
                }
                int i16 = f10 - i12;
                if (i16 >= 0) {
                    this.J[i14] = i16;
                    i14++;
                }
                i13++;
            }
            Arrays.sort(this.J, 0, i14);
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = l0Var.f22470c;
                if (i18 >= 0 && i18 < u1Var.b()) {
                    mVar.a(l0Var.f22470c, this.J[i17]);
                    l0Var.f22470c += l0Var.f22471d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // k7.i1
    public final void h0(Parcelable parcelable) {
        if (parcelable instanceof f2) {
            f2 f2Var = (f2) parcelable;
            this.F = f2Var;
            if (this.f2437z != -1) {
                f2Var.f22351d = null;
                f2Var.f22350c = 0;
                f2Var.f22348a = -1;
                f2Var.f22349b = -1;
                f2Var.f22351d = null;
                f2Var.f22350c = 0;
                f2Var.f22352e = 0;
                f2Var.f22353f = null;
                f2Var.f22354g = null;
            }
            q0();
        }
    }

    public final void h1(int i10, u1 u1Var) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        l0 l0Var = this.f2433v;
        boolean z12 = false;
        l0Var.f22469b = 0;
        l0Var.f22470c = i10;
        p0 p0Var = this.f22408e;
        if (p0Var != null && p0Var.f22526e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (i16 = u1Var.f22586a) != -1) {
            boolean z13 = this.f2435x;
            if (i16 < i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z13 == z11) {
                i11 = this.f2429r.g();
                i12 = 0;
            } else {
                i12 = this.f2429r.g();
                i11 = 0;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null && recyclerView.f2390h) {
            l0Var.f22473f = this.f2429r.f() - i12;
            l0Var.f22474g = this.f2429r.e() + i11;
        } else {
            s0 s0Var = (s0) this.f2429r;
            int i17 = s0Var.f22566d;
            i1 i1Var = s0Var.f22577a;
            switch (i17) {
                case 0:
                    i13 = i1Var.f22417n;
                    break;
                default:
                    i13 = i1Var.f22418o;
                    break;
            }
            l0Var.f22474g = i13 + i11;
            l0Var.f22473f = -i12;
        }
        l0Var.f22475h = false;
        l0Var.f22468a = true;
        t0 t0Var = this.f2429r;
        s0 s0Var2 = (s0) t0Var;
        int i18 = s0Var2.f22566d;
        i1 i1Var2 = s0Var2.f22577a;
        switch (i18) {
            case 0:
                i14 = i1Var2.f22415l;
                break;
            default:
                i14 = i1Var2.f22416m;
                break;
        }
        if (i14 == 0) {
            s0 s0Var3 = (s0) t0Var;
            int i19 = s0Var3.f22566d;
            i1 i1Var3 = s0Var3.f22577a;
            switch (i19) {
                case 0:
                    i15 = i1Var3.f22417n;
                    break;
                default:
                    i15 = i1Var3.f22418o;
                    break;
            }
            if (i15 == 0) {
                z12 = true;
            }
        }
        l0Var.f22476i = z12;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k7.f2, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [k7.f2, android.os.Parcelable, java.lang.Object] */
    @Override // k7.i1
    public final Parcelable i0() {
        int Q0;
        View N0;
        int h10;
        int f10;
        int[] iArr;
        f2 f2Var = this.F;
        if (f2Var != null) {
            ?? obj = new Object();
            obj.f22350c = f2Var.f22350c;
            obj.f22348a = f2Var.f22348a;
            obj.f22349b = f2Var.f22349b;
            obj.f22351d = f2Var.f22351d;
            obj.f22352e = f2Var.f22352e;
            obj.f22353f = f2Var.f22353f;
            obj.f22355h = f2Var.f22355h;
            obj.f22356i = f2Var.f22356i;
            obj.f22357j = f2Var.f22357j;
            obj.f22354g = f2Var.f22354g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f22355h = this.f2434w;
        obj2.f22356i = this.D;
        obj2.f22357j = this.E;
        m mVar = this.B;
        if (mVar != null && (iArr = (int[]) mVar.f15794b) != null) {
            obj2.f22353f = iArr;
            obj2.f22352e = iArr.length;
            obj2.f22354g = (List) mVar.f15795c;
        } else {
            obj2.f22352e = 0;
        }
        int i10 = -1;
        if (v() > 0) {
            if (this.D) {
                Q0 = R0();
            } else {
                Q0 = Q0();
            }
            obj2.f22348a = Q0;
            if (this.f2435x) {
                N0 = M0(true);
            } else {
                N0 = N0(true);
            }
            if (N0 != null) {
                i10 = i1.H(N0);
            }
            obj2.f22349b = i10;
            int i11 = this.f2427p;
            obj2.f22350c = i11;
            obj2.f22351d = new int[i11];
            for (int i12 = 0; i12 < this.f2427p; i12++) {
                if (this.D) {
                    h10 = this.f2428q[i12].f(Integer.MIN_VALUE);
                    if (h10 != Integer.MIN_VALUE) {
                        f10 = this.f2429r.e();
                        h10 -= f10;
                        obj2.f22351d[i12] = h10;
                    } else {
                        obj2.f22351d[i12] = h10;
                    }
                } else {
                    h10 = this.f2428q[i12].h(Integer.MIN_VALUE);
                    if (h10 != Integer.MIN_VALUE) {
                        f10 = this.f2429r.f();
                        h10 -= f10;
                        obj2.f22351d[i12] = h10;
                    } else {
                        obj2.f22351d[i12] = h10;
                    }
                }
            }
        } else {
            obj2.f22348a = -1;
            obj2.f22349b = -1;
            obj2.f22350c = 0;
        }
        return obj2;
    }

    public final void i1(g2 g2Var, int i10, int i11) {
        int i12 = g2Var.f22365d;
        int i13 = g2Var.f22366e;
        if (i10 == -1) {
            int i14 = g2Var.f22363b;
            if (i14 == Integer.MIN_VALUE) {
                View view = (View) g2Var.f22362a.get(0);
                d2 d2Var = (d2) view.getLayoutParams();
                g2Var.f22363b = g2Var.f22367f.f2429r.d(view);
                d2Var.getClass();
                i14 = g2Var.f22363b;
            }
            if (i14 + i12 <= i11) {
                this.f2436y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = g2Var.f22364c;
        if (i15 == Integer.MIN_VALUE) {
            g2Var.a();
            i15 = g2Var.f22364c;
        }
        if (i15 - i12 >= i11) {
            this.f2436y.set(i13, false);
        }
    }

    @Override // k7.i1
    public final int j(u1 u1Var) {
        return I0(u1Var);
    }

    @Override // k7.i1
    public final void j0(int i10) {
        if (i10 == 0) {
            H0();
        }
    }

    @Override // k7.i1
    public final int k(u1 u1Var) {
        return J0(u1Var);
    }

    @Override // k7.i1
    public final int l(u1 u1Var) {
        return K0(u1Var);
    }

    @Override // k7.i1
    public final int m(u1 u1Var) {
        return I0(u1Var);
    }

    @Override // k7.i1
    public final int n(u1 u1Var) {
        return J0(u1Var);
    }

    @Override // k7.i1
    public final int o(u1 u1Var) {
        return K0(u1Var);
    }

    @Override // k7.i1
    public final j1 r() {
        if (this.f2431t == 0) {
            return new j1(-2, -1);
        }
        return new j1(-1, -2);
    }

    @Override // k7.i1
    public final j1 s(Context context, AttributeSet attributeSet) {
        return new j1(context, attributeSet);
    }

    @Override // k7.i1
    public final int s0(int i10, u6.g gVar, u1 u1Var) {
        return f1(i10, gVar, u1Var);
    }

    @Override // k7.i1
    public final j1 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new j1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new j1(layoutParams);
    }

    @Override // k7.i1
    public final void t0(int i10) {
        f2 f2Var = this.F;
        if (f2Var != null && f2Var.f22348a != i10) {
            f2Var.f22351d = null;
            f2Var.f22350c = 0;
            f2Var.f22348a = -1;
            f2Var.f22349b = -1;
        }
        this.f2437z = i10;
        this.A = Integer.MIN_VALUE;
        q0();
    }

    @Override // k7.i1
    public final int u0(int i10, u6.g gVar, u1 u1Var) {
        return f1(i10, gVar, u1Var);
    }

    @Override // k7.i1
    public final int x(u6.g gVar, u1 u1Var) {
        if (this.f2431t == 1) {
            return Math.min(this.f2427p, u1Var.b());
        }
        return -1;
    }

    @Override // k7.i1
    public final void x0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        int F = F() + E();
        int D = D() + G();
        if (this.f2431t == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f22405b;
            WeakHashMap weakHashMap = n1.f13788a;
            g11 = i1.g(i11, height, v0.d(recyclerView));
            g10 = i1.g(i10, (this.f2432u * this.f2427p) + F, v0.e(this.f22405b));
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f22405b;
            WeakHashMap weakHashMap2 = n1.f13788a;
            g10 = i1.g(i10, width, v0.e(recyclerView2));
            g11 = i1.g(i11, (this.f2432u * this.f2427p) + D, v0.d(this.f22405b));
        }
        this.f22405b.setMeasuredDimension(g10, g11);
    }
}
