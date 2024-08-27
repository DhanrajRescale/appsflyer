package k7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public j f22404a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f22405b;

    /* renamed from: c, reason: collision with root package name */
    public final ep.m f22406c;

    /* renamed from: d, reason: collision with root package name */
    public final ep.m f22407d;

    /* renamed from: e, reason: collision with root package name */
    public p0 f22408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22410g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22411h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22412i;

    /* renamed from: j, reason: collision with root package name */
    public int f22413j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22414k;

    /* renamed from: l, reason: collision with root package name */
    public int f22415l;

    /* renamed from: m, reason: collision with root package name */
    public int f22416m;

    /* renamed from: n, reason: collision with root package name */
    public int f22417n;

    /* renamed from: o, reason: collision with root package name */
    public int f22418o;

    public i1() {
        g1 g1Var = new g1(this, 0);
        g1 g1Var2 = new g1(this, 1);
        this.f22406c = new ep.m(g1Var);
        this.f22407d = new ep.m(g1Var2);
        this.f22409f = false;
        this.f22410g = false;
        this.f22411h = true;
        this.f22412i = true;
    }

    public static int A(View view) {
        Rect rect = ((j1) view.getLayoutParams()).f22431b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((j1) view.getLayoutParams()).f22430a.e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k7.h1, java.lang.Object] */
    public static h1 I(Context context, AttributeSet attributeSet, int i10, int i11) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j7.a.f21048a, i10, i11);
        obj.f22392a = obtainStyledAttributes.getInt(0, 1);
        obj.f22393b = obtainStyledAttributes.getInt(10, 1);
        obj.f22394c = obtainStyledAttributes.getBoolean(9, false);
        obj.f22395d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean N(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i10) {
                return false;
            }
            return true;
        }
        if (size < i10) {
            return false;
        }
        return true;
    }

    public static void O(View view, int i10, int i11, int i12, int i13) {
        j1 j1Var = (j1) view.getLayoutParams();
        Rect rect = j1Var.f22431b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) j1Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) j1Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) j1Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }
        return Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1d
            if (r7 < 0) goto L12
        L10:
            r5 = r3
            goto L30
        L12:
            if (r7 != r1) goto L1a
            if (r5 == r2) goto L22
            if (r5 == 0) goto L1a
            if (r5 == r3) goto L22
        L1a:
            r5 = r6
            r7 = r5
            goto L30
        L1d:
            if (r7 < 0) goto L20
            goto L10
        L20:
            if (r7 != r1) goto L24
        L22:
            r7 = r4
            goto L30
        L24:
            if (r7 != r0) goto L1a
            if (r5 == r2) goto L2e
            if (r5 != r3) goto L2b
            goto L2e
        L2b:
            r7 = r4
            r5 = r6
            goto L30
        L2e:
            r7 = r4
            r5 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.i1.w(int, int, int, int, boolean):int");
    }

    public static int z(View view) {
        Rect rect = ((j1) view.getLayoutParams()).f22431b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final boolean A0(View view, int i10, int i11, j1 j1Var) {
        if (!view.isLayoutRequested() && this.f22411h && N(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) j1Var).width) && N(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) j1Var).height)) {
            return false;
        }
        return true;
    }

    public final int B() {
        z0 z0Var;
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            z0Var = recyclerView.getAdapter();
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            return z0Var.a();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f22405b;
        WeakHashMap weakHashMap = d4.n1.f13788a;
        return d4.w0.d(recyclerView);
    }

    public final boolean C0(View view, int i10, int i11, j1 j1Var) {
        if (this.f22411h && N(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) j1Var).width) && N(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) j1Var).height)) {
            return false;
        }
        return true;
    }

    public final int D() {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void D0(RecyclerView recyclerView, int i10);

    public final int E() {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void E0(p0 p0Var) {
        p0 p0Var2 = this.f22408e;
        if (p0Var2 != null && p0Var != p0Var2 && p0Var2.f22526e) {
            p0Var2.i();
        }
        this.f22408e = p0Var;
        RecyclerView recyclerView = this.f22405b;
        x1 x1Var = recyclerView.f2418v0;
        x1Var.f22621g.removeCallbacks(x1Var);
        x1Var.f22617c.abortAnimation();
        if (p0Var.f22529h) {
            Log.w("RecyclerView", "An instance of " + p0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + p0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        p0Var.f22523b = recyclerView;
        p0Var.f22524c = this;
        int i10 = p0Var.f22522a;
        if (i10 != -1) {
            recyclerView.f2424y0.f22586a = i10;
            p0Var.f22526e = true;
            p0Var.f22525d = true;
            p0Var.f22527f = recyclerView.f2402n.q(i10);
            p0Var.f22523b.f2418v0.b();
            p0Var.f22529h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int F() {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean F0() {
        return false;
    }

    public final int G() {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(u6.g gVar, u1 u1Var) {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView == null || recyclerView.f2400m == null || !e()) {
            return 1;
        }
        return this.f22405b.f2400m.a();
    }

    public final void K(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((j1) view.getLayoutParams()).f22431b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f22405b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f22405b.f2398l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean L() {
        return false;
    }

    public boolean M() {
        return false;
    }

    public void P(View view) {
        j1 j1Var = (j1) view.getLayoutParams();
        Rect O = this.f22405b.O(view);
        int i10 = O.left + O.right;
        int i11 = O.top + O.bottom;
        int w10 = w(this.f22417n, this.f22415l, F() + E() + ((ViewGroup.MarginLayoutParams) j1Var).leftMargin + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin + i10, ((ViewGroup.MarginLayoutParams) j1Var).width, d());
        int w11 = w(this.f22418o, this.f22416m, D() + G() + ((ViewGroup.MarginLayoutParams) j1Var).topMargin + ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) j1Var).height, e());
        if (A0(view, w10, w11, j1Var)) {
            view.measure(w10, w11);
        }
    }

    public void Q(int i10) {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            int e10 = recyclerView.f2386f.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f2386f.d(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void R(int i10) {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            int e10 = recyclerView.f2386f.e();
            for (int i11 = 0; i11 < e10; i11++) {
                recyclerView.f2386f.d(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public void S() {
    }

    public void T(RecyclerView recyclerView) {
    }

    public View U(View view, int i10, u6.g gVar, u1 u1Var) {
        return null;
    }

    public void V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f22405b;
        u6.g gVar = recyclerView.f2382c;
        u1 u1Var = recyclerView.f2424y0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f22405b.canScrollVertically(-1) && !this.f22405b.canScrollHorizontally(-1) && !this.f22405b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            z0 z0Var = this.f22405b.f2400m;
            if (z0Var != null) {
                accessibilityEvent.setItemCount(z0Var.a());
            }
        }
    }

    public void W(u6.g gVar, u1 u1Var, e4.m mVar) {
        if (this.f22405b.canScrollVertically(-1) || this.f22405b.canScrollHorizontally(-1)) {
            mVar.a(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            mVar.r(true);
            mVar.i(67108864, true);
        }
        if (this.f22405b.canScrollVertically(1) || this.f22405b.canScrollHorizontally(1)) {
            mVar.a(4096);
            mVar.r(true);
            mVar.i(67108864, true);
        }
        mVar.k(e4.k.e(J(gVar, u1Var), x(gVar, u1Var), 0));
    }

    public final void X(View view, e4.m mVar) {
        y1 N = RecyclerView.N(view);
        if (N != null && !N.l() && !this.f22404a.f22425c.contains(N.f22629a)) {
            RecyclerView recyclerView = this.f22405b;
            Y(recyclerView.f2382c, recyclerView.f2424y0, view, mVar);
        }
    }

    public void Y(u6.g gVar, u1 u1Var, View view, e4.m mVar) {
        int i10;
        int i11 = 0;
        if (e()) {
            i10 = H(view);
        } else {
            i10 = 0;
        }
        if (d()) {
            i11 = H(view);
        }
        mVar.l(e4.l.a(i10, 1, i11, 1, false, false));
    }

    public void Z(int i10, int i11) {
    }

    public void a0() {
    }

    public final void b(View view, int i10, boolean z10) {
        y1 N = RecyclerView.N(view);
        if (!z10 && !N.l()) {
            this.f22405b.f2388g.n(N);
        } else {
            this.f22405b.f2388g.c(N);
        }
        j1 j1Var = (j1) view.getLayoutParams();
        if (!N.t() && !N.m()) {
            int i11 = -1;
            if (view.getParent() == this.f22405b) {
                int j10 = this.f22404a.j(view);
                if (i10 == -1) {
                    i10 = this.f22404a.e();
                }
                if (j10 != -1) {
                    if (j10 != i10) {
                        i1 i1Var = this.f22405b.f2402n;
                        View u10 = i1Var.u(j10);
                        if (u10 != null) {
                            i1Var.u(j10);
                            i1Var.f22404a.c(j10);
                            j1 j1Var2 = (j1) u10.getLayoutParams();
                            y1 N2 = RecyclerView.N(u10);
                            if (N2.l()) {
                                i1Var.f22405b.f2388g.c(N2);
                            } else {
                                i1Var.f22405b.f2388g.n(N2);
                            }
                            i1Var.f22404a.b(u10, i10, j1Var2, N2.l());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + i1Var.f22405b.toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f22405b.indexOfChild(view));
                    throw new IllegalStateException(nn.d.i(this.f22405b, sb2));
                }
            } else {
                this.f22404a.a(view, i10, false);
                j1Var.f22432c = true;
                p0 p0Var = this.f22408e;
                if (p0Var != null && p0Var.f22526e) {
                    p0Var.f22523b.getClass();
                    y1 N3 = RecyclerView.N(view);
                    if (N3 != null) {
                        i11 = N3.e();
                    }
                    if (i11 == p0Var.f22522a) {
                        p0Var.f22527f = view;
                        if (RecyclerView.V0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        } else {
            if (N.m()) {
                N.f22642n.n(N);
            } else {
                N.f22638j &= -33;
            }
            this.f22404a.b(view, i10, view.getLayoutParams(), false);
        }
        if (j1Var.f22433d) {
            if (RecyclerView.V0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + j1Var.f22430a);
            }
            N.f22629a.invalidate();
            j1Var.f22433d = false;
        }
    }

    public void b0(int i10, int i11) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i10, int i11) {
    }

    public abstract boolean d();

    public void d0(int i10, int i11) {
    }

    public boolean e() {
        return false;
    }

    public abstract void e0(u6.g gVar, u1 u1Var);

    public boolean f(j1 j1Var) {
        return j1Var != null;
    }

    public void f0(u1 u1Var) {
    }

    public void g0(u6.g gVar, u1 u1Var, int i10, int i11) {
        this.f22405b.q(i10, i11);
    }

    public void h(int i10, int i11, u1 u1Var, p2.m mVar) {
    }

    public void h0(Parcelable parcelable) {
    }

    public void i(int i10, p2.m mVar) {
    }

    public Parcelable i0() {
        return null;
    }

    public int j(u1 u1Var) {
        return 0;
    }

    public void j0(int i10) {
    }

    public int k(u1 u1Var) {
        return 0;
    }

    public boolean k0(int i10, Bundle bundle) {
        RecyclerView recyclerView = this.f22405b;
        return l0(recyclerView.f2382c, recyclerView.f2424y0, i10, bundle);
    }

    public int l(u1 u1Var) {
        return 0;
    }

    public boolean l0(u6.g gVar, u1 u1Var, int i10, Bundle bundle) {
        int i11;
        int E;
        float f10;
        if (this.f22405b == null) {
            return false;
        }
        int i12 = this.f22418o;
        int i13 = this.f22417n;
        Rect rect = new Rect();
        if (this.f22405b.getMatrix().isIdentity() && this.f22405b.getGlobalVisibleRect(rect)) {
            i12 = rect.height();
            i13 = rect.width();
        }
        if (i10 != 4096) {
            if (i10 != 8192) {
                i11 = 0;
                E = 0;
            } else {
                if (this.f22405b.canScrollVertically(-1)) {
                    i11 = -((i12 - G()) - D());
                } else {
                    i11 = 0;
                }
                if (this.f22405b.canScrollHorizontally(-1)) {
                    E = -((i13 - E()) - F());
                }
                E = 0;
            }
        } else {
            if (this.f22405b.canScrollVertically(1)) {
                i11 = (i12 - G()) - D();
            } else {
                i11 = 0;
            }
            if (this.f22405b.canScrollHorizontally(1)) {
                E = (i13 - E()) - F();
            }
            E = 0;
        }
        if (i11 == 0 && E == 0) {
            return false;
        }
        if (bundle != null) {
            f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f10 < s0.g.f34069a) {
                if (!RecyclerView.U0) {
                    return false;
                }
                throw new IllegalArgumentException(jr.h.m("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (", f10, ")"));
            }
        } else {
            f10 = 1.0f;
        }
        if (Float.compare(f10, Float.POSITIVE_INFINITY) == 0) {
            RecyclerView recyclerView = this.f22405b;
            z0 z0Var = recyclerView.f2400m;
            if (z0Var == null) {
                return false;
            }
            if (i10 != 4096) {
                if (i10 == 8192) {
                    recyclerView.l0(0);
                }
            } else {
                recyclerView.l0(z0Var.a() - 1);
            }
            return true;
        }
        if (Float.compare(1.0f, f10) != 0 && Float.compare(s0.g.f34069a, f10) != 0) {
            E = (int) (E * f10);
            i11 = (int) (i11 * f10);
        }
        this.f22405b.k0(E, i11, true);
        return true;
    }

    public int m(u1 u1Var) {
        return 0;
    }

    public final void m0(u6.g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            if (!RecyclerView.N(u(v10)).s()) {
                View u10 = u(v10);
                if (u(v10) != null) {
                    this.f22404a.l(v10);
                }
                gVar.j(u10);
            }
        }
    }

    public int n(u1 u1Var) {
        return 0;
    }

    public final void n0(u6.g gVar) {
        Cloneable cloneable;
        int size = ((ArrayList) gVar.f36878c).size();
        int i10 = size - 1;
        while (true) {
            cloneable = gVar.f36878c;
            if (i10 < 0) {
                break;
            }
            View view = ((y1) ((ArrayList) cloneable).get(i10)).f22629a;
            y1 N = RecyclerView.N(view);
            if (!N.s()) {
                N.r(false);
                if (N.n()) {
                    this.f22405b.removeDetachedView(view, false);
                }
                e1 e1Var = this.f22405b.f2389g0;
                if (e1Var != null) {
                    e1Var.d(N);
                }
                N.r(true);
                y1 N2 = RecyclerView.N(view);
                N2.f22642n = null;
                N2.f22643o = false;
                N2.f22638j &= -33;
                gVar.k(N2);
            }
            i10--;
        }
        ((ArrayList) cloneable).clear();
        ArrayList arrayList = (ArrayList) gVar.f36879d;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f22405b.invalidate();
        }
    }

    public int o(u1 u1Var) {
        return 0;
    }

    public final void o0(View view, u6.g gVar) {
        j jVar = this.f22404a;
        x0 x0Var = jVar.f22423a;
        int i10 = jVar.f22426d;
        if (i10 != 1) {
            if (i10 != 2) {
                try {
                    jVar.f22426d = 1;
                    jVar.f22427e = view;
                    int indexOfChild = x0Var.f22614a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (jVar.f22424b.i(indexOfChild)) {
                            jVar.m(view);
                        }
                        x0Var.k(indexOfChild);
                    }
                    jVar.f22426d = 0;
                    jVar.f22427e = null;
                    gVar.j(view);
                    return;
                } catch (Throwable th2) {
                    jVar.f22426d = 0;
                    jVar.f22427e = null;
                    throw th2;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void p(u6.g gVar) {
        for (int v10 = v() - 1; v10 >= 0; v10--) {
            r0(gVar, v10, u(v10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if ((r5.bottom - r1) > r13) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f22417n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f22418o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.C()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto La6
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto Lab
        L74:
            int r11 = r8.E()
            int r13 = r8.G()
            int r3 = r8.f22417n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f22418o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f22405b
            android.graphics.Rect r5 = r5.f2394j
            r8.y(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Lab
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Lab
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Lab
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto Lab
        La6:
            if (r2 != 0) goto Lac
            if (r1 == 0) goto Lab
            goto Lac
        Lab:
            return r0
        Lac:
            if (r12 == 0) goto Lb2
            r9.scrollBy(r2, r1)
            goto Lb5
        Lb2:
            r9.k0(r2, r1, r0)
        Lb5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.i1.p0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public View q(int i10) {
        int v10 = v();
        for (int i11 = 0; i11 < v10; i11++) {
            View u10 = u(i11);
            y1 N = RecyclerView.N(u10);
            if (N != null && N.e() == i10 && !N.s() && (this.f22405b.f2424y0.f22592g || !N.l())) {
                return u10;
            }
        }
        return null;
    }

    public final void q0() {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract j1 r();

    public final void r0(u6.g gVar, int i10, View view) {
        y1 N = RecyclerView.N(view);
        if (N.s()) {
            if (RecyclerView.V0) {
                Log.d("RecyclerView", "ignoring view " + N);
                return;
            }
            return;
        }
        if (N.j() && !N.l() && !this.f22405b.f2400m.f22652b) {
            if (u(i10) != null) {
                this.f22404a.l(i10);
            }
            gVar.k(N);
        } else {
            u(i10);
            this.f22404a.c(i10);
            gVar.l(view);
            this.f22405b.f2388g.n(N);
        }
    }

    public j1 s(Context context, AttributeSet attributeSet) {
        return new j1(context, attributeSet);
    }

    public abstract int s0(int i10, u6.g gVar, u1 u1Var);

    public j1 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof j1) {
            return new j1((j1) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new j1((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new j1(layoutParams);
    }

    public abstract void t0(int i10);

    public final View u(int i10) {
        j jVar = this.f22404a;
        if (jVar != null) {
            return jVar.d(i10);
        }
        return null;
    }

    public int u0(int i10, u6.g gVar, u1 u1Var) {
        return 0;
    }

    public final int v() {
        j jVar = this.f22404a;
        if (jVar != null) {
            return jVar.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        w0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void w0(int i10, int i11) {
        this.f22417n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f22415l = mode;
        if (mode == 0 && !RecyclerView.Y0) {
            this.f22417n = 0;
        }
        this.f22418o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f22416m = mode2;
        if (mode2 == 0 && !RecyclerView.Y0) {
            this.f22418o = 0;
        }
    }

    public int x(u6.g gVar, u1 u1Var) {
        RecyclerView recyclerView = this.f22405b;
        if (recyclerView == null || recyclerView.f2400m == null || !d()) {
            return 1;
        }
        return this.f22405b.f2400m.a();
    }

    public void x0(Rect rect, int i10, int i11) {
        int F = F() + E() + rect.width();
        int D = D() + G() + rect.height();
        RecyclerView recyclerView = this.f22405b;
        WeakHashMap weakHashMap = d4.n1.f13788a;
        this.f22405b.setMeasuredDimension(g(i10, F, d4.v0.e(recyclerView)), g(i11, D, d4.v0.d(this.f22405b)));
    }

    public void y(View view, Rect rect) {
        boolean z10 = RecyclerView.U0;
        j1 j1Var = (j1) view.getLayoutParams();
        Rect rect2 = j1Var.f22431b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) j1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) j1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin);
    }

    public final void y0(int i10, int i11) {
        int v10 = v();
        if (v10 == 0) {
            this.f22405b.q(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < v10; i16++) {
            View u10 = u(i16);
            Rect rect = this.f22405b.f2394j;
            y(u10, rect);
            int i17 = rect.left;
            if (i17 < i15) {
                i15 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i13) {
                i13 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i14) {
                i14 = i20;
            }
        }
        this.f22405b.f2394j.set(i15, i13, i12, i14);
        x0(this.f22405b.f2394j, i10, i11);
    }

    public final void z0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f22405b = null;
            this.f22404a = null;
            this.f22417n = 0;
            this.f22418o = 0;
        } else {
            this.f22405b = recyclerView;
            this.f22404a = recyclerView.f2386f;
            this.f22417n = recyclerView.getWidth();
            this.f22418o = recyclerView.getHeight();
        }
        this.f22415l = 1073741824;
        this.f22416m = 1073741824;
    }
}
