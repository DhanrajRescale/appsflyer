package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import b7.w;
import d4.n1;
import d4.v0;
import e4.f;
import e4.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import jr.h;
import k7.f0;
import k7.i1;
import k7.j1;
import k7.n0;
import k7.u1;
import k7.z0;
import m.o3;
import p2.m;
import u6.g;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final o3 K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o3();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        w1(i1.I(context, attributeSet, i10, i11).f22393b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final boolean F0() {
        return this.f2375z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void H0(u1 u1Var, n0 n0Var, m mVar) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = n0Var.f22495d) >= 0 && i10 < u1Var.b() && i11 > 0; i12++) {
            mVar.a(n0Var.f22495d, Math.max(0, n0Var.f22498g));
            this.K.getClass();
            i11--;
            n0Var.f22495d += n0Var.f22496e;
        }
    }

    @Override // k7.i1
    public final int J(g gVar, u1 u1Var) {
        if (this.f2365p == 0) {
            return Math.min(this.F, B());
        }
        if (u1Var.b() < 1) {
            return 0;
        }
        return s1(u1Var.b() - 1, gVar, u1Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == r5) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        if (r13 == r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x001e, code lost:
    
        if (r22.f22404a.k(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r23, int r24, u6.g r25, k7.u1 r26) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U(android.view.View, int, u6.g, k7.u1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View U0(g gVar, u1 u1Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int v10 = v();
        int i12 = 1;
        if (z11) {
            i11 = v() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = v10;
            i11 = 0;
        }
        int b10 = u1Var.b();
        M0();
        int f10 = this.f2367r.f();
        int e10 = this.f2367r.e();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View u10 = u(i11);
            int H = i1.H(u10);
            if (H >= 0 && H < b10 && t1(H, gVar, u1Var) == 0) {
                if (((j1) u10.getLayoutParams()).f22430a.l()) {
                    if (view2 == null) {
                        view2 = u10;
                    }
                } else {
                    if (this.f2367r.d(u10) < e10 && this.f2367r.b(u10) >= f10) {
                        return u10;
                    }
                    if (view == null) {
                        view = u10;
                    }
                }
            }
            i11 += i12;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final void W(g gVar, u1 u1Var, e4.m mVar) {
        super.W(gVar, u1Var, mVar);
        mVar.j(GridView.class.getName());
        z0 z0Var = this.f22405b.f2400m;
        if (z0Var != null && z0Var.a() > 1) {
            mVar.b(f.f14988u);
        }
    }

    @Override // k7.i1
    public final void Y(g gVar, u1 u1Var, View view, e4.m mVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof f0)) {
            X(view, mVar);
            return;
        }
        f0 f0Var = (f0) layoutParams;
        int s12 = s1(f0Var.f22430a.e(), gVar, u1Var);
        if (this.f2365p == 0) {
            mVar.l(l.a(f0Var.f22346e, f0Var.f22347f, s12, 1, false, false));
        } else {
            mVar.l(l.a(s12, 1, f0Var.f22346e, f0Var.f22347f, false, false));
        }
    }

    @Override // k7.i1
    public final void Z(int i10, int i11) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f25673e).clear();
    }

    @Override // k7.i1
    public final void a0() {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f25673e).clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        r22.f22484b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(u6.g r19, k7.u1 r20, k7.n0 r21, k7.m0 r22) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a1(u6.g, k7.u1, k7.n0, k7.m0):void");
    }

    @Override // k7.i1
    public final void b0(int i10, int i11) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f25673e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(g gVar, u1 u1Var, w wVar, int i10) {
        boolean z10;
        x1();
        if (u1Var.b() > 0 && !u1Var.f22592g) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int t12 = t1(wVar.f4041b, gVar, u1Var);
            if (z10) {
                while (t12 > 0) {
                    int i11 = wVar.f4041b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    wVar.f4041b = i12;
                    t12 = t1(i12, gVar, u1Var);
                }
            } else {
                int b10 = u1Var.b() - 1;
                int i13 = wVar.f4041b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int t13 = t1(i14, gVar, u1Var);
                    if (t13 <= t12) {
                        break;
                    }
                    i13 = i14;
                    t12 = t13;
                }
                wVar.f4041b = i13;
            }
        }
        m1();
    }

    @Override // k7.i1
    public final void c0(int i10, int i11) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f25673e).clear();
    }

    @Override // k7.i1
    public final void d0(int i10, int i11) {
        o3 o3Var = this.K;
        o3Var.d();
        ((SparseIntArray) o3Var.f25673e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final void e0(g gVar, u1 u1Var) {
        boolean z10 = u1Var.f22592g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z10) {
            int v10 = v();
            for (int i10 = 0; i10 < v10; i10++) {
                f0 f0Var = (f0) u(i10).getLayoutParams();
                int e10 = f0Var.f22430a.e();
                sparseIntArray2.put(e10, f0Var.f22347f);
                sparseIntArray.put(e10, f0Var.f22346e);
            }
        }
        super.e0(gVar, u1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // k7.i1
    public final boolean f(j1 j1Var) {
        return j1Var instanceof f0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final void f0(u1 u1Var) {
        View q10;
        super.f0(u1Var);
        this.E = false;
        int i10 = this.M;
        if (i10 != -1 && (q10 = q(i10)) != null) {
            q10.sendAccessibilityEvent(67108864);
            this.M = -1;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void h1(boolean z10) {
        if (!z10) {
            super.h1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int k(u1 u1Var) {
        return J0(u1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.k0(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int l(u1 u1Var) {
        return K0(u1Var);
    }

    public final void l1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 > 0 && i12 - i13 < i15) {
                i11 = i14 + 1;
                i13 -= i12;
            } else {
                i11 = i14;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final void m1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int n(u1 u1Var) {
        return J0(u1Var);
    }

    public final int n1(int i10) {
        if (this.f2365p == 0) {
            RecyclerView recyclerView = this.f22405b;
            return s1(i10, recyclerView.f2382c, recyclerView.f2424y0);
        }
        RecyclerView recyclerView2 = this.f22405b;
        return t1(i10, recyclerView2.f2382c, recyclerView2.f2424y0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int o(u1 u1Var) {
        return K0(u1Var);
    }

    public final int o1(int i10) {
        if (this.f2365p == 1) {
            RecyclerView recyclerView = this.f22405b;
            return s1(i10, recyclerView.f2382c, recyclerView.f2424y0);
        }
        RecyclerView recyclerView2 = this.f22405b;
        return t1(i10, recyclerView2.f2382c, recyclerView2.f2424y0);
    }

    public final HashSet p1(int i10) {
        return q1(o1(i10), i10);
    }

    public final HashSet q1(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f22405b;
        int u12 = u1(i11, recyclerView.f2382c, recyclerView.f2424y0);
        for (int i12 = i10; i12 < i10 + u12; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final j1 r() {
        if (this.f2365p == 0) {
            return new f0(-2, -1);
        }
        return new f0(-1, -2);
    }

    public final int r1(int i10, int i11) {
        if (this.f2365p == 1 && Z0()) {
            int[] iArr = this.G;
            int i12 = this.F;
            return iArr[i12 - i10] - iArr[(i12 - i10) - i11];
        }
        int[] iArr2 = this.G;
        return iArr2[i11 + i10] - iArr2[i10];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k7.f0, k7.j1] */
    @Override // k7.i1
    public final j1 s(Context context, AttributeSet attributeSet) {
        ?? j1Var = new j1(context, attributeSet);
        j1Var.f22346e = -1;
        j1Var.f22347f = 0;
        return j1Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int s0(int i10, g gVar, u1 u1Var) {
        x1();
        m1();
        return super.s0(i10, gVar, u1Var);
    }

    public final int s1(int i10, g gVar, u1 u1Var) {
        boolean z10 = u1Var.f22592g;
        o3 o3Var = this.K;
        if (!z10) {
            return o3Var.a(i10, this.F);
        }
        int c10 = gVar.c(i10);
        if (c10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return o3Var.a(c10, this.F);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k7.f0, k7.j1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k7.f0, k7.j1] */
    @Override // k7.i1
    public final j1 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? j1Var = new j1((ViewGroup.MarginLayoutParams) layoutParams);
            j1Var.f22346e = -1;
            j1Var.f22347f = 0;
            return j1Var;
        }
        ?? j1Var2 = new j1(layoutParams);
        j1Var2.f22346e = -1;
        j1Var2.f22347f = 0;
        return j1Var2;
    }

    public final int t1(int i10, g gVar, u1 u1Var) {
        boolean z10 = u1Var.f22592g;
        o3 o3Var = this.K;
        if (!z10) {
            return o3Var.b(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int c10 = gVar.c(i10);
        if (c10 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return o3Var.b(c10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, k7.i1
    public final int u0(int i10, g gVar, u1 u1Var) {
        x1();
        m1();
        return super.u0(i10, gVar, u1Var);
    }

    public final int u1(int i10, g gVar, u1 u1Var) {
        boolean z10 = u1Var.f22592g;
        o3 o3Var = this.K;
        if (!z10) {
            o3Var.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (gVar.c(i10) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        o3Var.getClass();
        return 1;
    }

    public final void v1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        boolean A0;
        f0 f0Var = (f0) view.getLayoutParams();
        Rect rect = f0Var.f22431b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) f0Var).topMargin + ((ViewGroup.MarginLayoutParams) f0Var).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) f0Var).leftMargin + ((ViewGroup.MarginLayoutParams) f0Var).rightMargin;
        int r12 = r1(f0Var.f22346e, f0Var.f22347f);
        if (this.f2365p == 1) {
            i12 = i1.w(r12, i10, i14, ((ViewGroup.MarginLayoutParams) f0Var).width, false);
            i11 = i1.w(this.f2367r.g(), this.f22416m, i13, ((ViewGroup.MarginLayoutParams) f0Var).height, true);
        } else {
            int w10 = i1.w(r12, i10, i13, ((ViewGroup.MarginLayoutParams) f0Var).height, false);
            int w11 = i1.w(this.f2367r.g(), this.f22415l, i14, ((ViewGroup.MarginLayoutParams) f0Var).width, true);
            i11 = w10;
            i12 = w11;
        }
        j1 j1Var = (j1) view.getLayoutParams();
        if (z10) {
            A0 = C0(view, i12, i11, j1Var);
        } else {
            A0 = A0(view, i12, i11, j1Var);
        }
        if (A0) {
            view.measure(i12, i11);
        }
    }

    public final void w1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 >= 1) {
            this.F = i10;
            this.K.d();
            q0();
            return;
        }
        throw new IllegalArgumentException(h.n("Span count should be at least 1. Provided ", i10));
    }

    @Override // k7.i1
    public final int x(g gVar, u1 u1Var) {
        if (this.f2365p == 1) {
            return Math.min(this.F, B());
        }
        if (u1Var.b() < 1) {
            return 0;
        }
        return s1(u1Var.b() - 1, gVar, u1Var) + 1;
    }

    @Override // k7.i1
    public final void x0(Rect rect, int i10, int i11) {
        int g10;
        int g11;
        if (this.G == null) {
            super.x0(rect, i10, i11);
        }
        int F = F() + E();
        int D = D() + G();
        if (this.f2365p == 1) {
            int height = rect.height() + D;
            RecyclerView recyclerView = this.f22405b;
            WeakHashMap weakHashMap = n1.f13788a;
            g11 = i1.g(i11, height, v0.d(recyclerView));
            int[] iArr = this.G;
            g10 = i1.g(i10, iArr[iArr.length - 1] + F, v0.e(this.f22405b));
        } else {
            int width = rect.width() + F;
            RecyclerView recyclerView2 = this.f22405b;
            WeakHashMap weakHashMap2 = n1.f13788a;
            g10 = i1.g(i10, width, v0.e(recyclerView2));
            int[] iArr2 = this.G;
            g11 = i1.g(i11, iArr2[iArr2.length - 1] + D, v0.d(this.f22405b));
        }
        this.f22405b.setMeasuredDimension(g10, g11);
    }

    public final void x1() {
        int D;
        int G;
        if (this.f2365p == 1) {
            D = this.f22417n - F();
            G = E();
        } else {
            D = this.f22418o - D();
            G = G();
        }
        l1(D - G);
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new o3();
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        w1(i10);
    }
}
