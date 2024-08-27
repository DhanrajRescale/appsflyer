package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d2.h3;
import d4.i;
import d4.t1;
import d4.v0;
import d4.y;
import d4.z;
import e4.k;
import ep.m;
import g7.d3;
import hl.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k7.a;
import k7.a2;
import k7.b;
import k7.b0;
import k7.c1;
import k7.d0;
import k7.d1;
import k7.e1;
import k7.f1;
import k7.i1;
import k7.i2;
import k7.j;
import k7.j1;
import k7.k0;
import k7.k1;
import k7.l1;
import k7.m1;
import k7.n1;
import k7.o1;
import k7.p0;
import k7.p1;
import k7.q1;
import k7.r1;
import k7.u1;
import k7.v1;
import k7.w0;
import k7.w1;
import k7.x0;
import k7.x1;
import k7.y1;
import k7.z0;
import kotlin.jvm.internal.Intrinsics;
import l4.d;
import okhttp3.HttpUrl;
import qu.i0;
import t.j0;
import t.o;
import u6.g;
import y3.p;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements y {
    public static boolean U0 = false;
    public static boolean V0 = false;
    public static final int[] W0 = {R.attr.nestedScrollingEnabled};
    public static final float X0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean Y0 = true;
    public static final boolean Z0 = true;

    /* renamed from: a1, reason: collision with root package name */
    public static final boolean f2376a1 = true;

    /* renamed from: b1, reason: collision with root package name */
    public static final Class[] f2377b1;

    /* renamed from: c1, reason: collision with root package name */
    public static final d f2378c1;

    /* renamed from: d1, reason: collision with root package name */
    public static final v1 f2379d1;
    public boolean A;
    public ArrayList A0;
    public final AccessibilityManager B;
    public boolean B0;
    public ArrayList C;
    public boolean C0;
    public boolean D;
    public final x0 D0;
    public boolean E;
    public boolean E0;
    public int F;
    public a2 F0;
    public int G;
    public c1 G0;
    public d1 H;
    public final int[] H0;
    public EdgeEffect I;
    public z I0;
    public EdgeEffect J;
    public final int[] J0;
    public final int[] K0;
    public final int[] L0;
    public final ArrayList M0;
    public final w0 N0;
    public boolean O0;
    public int P0;
    public int Q0;
    public final boolean R0;
    public final x0 S0;
    public final i T0;

    /* renamed from: a, reason: collision with root package name */
    public final float f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final d3 f2381b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2382c;

    /* renamed from: d, reason: collision with root package name */
    public r1 f2383d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2384e;

    /* renamed from: e0, reason: collision with root package name */
    public EdgeEffect f2385e0;

    /* renamed from: f, reason: collision with root package name */
    public final j f2386f;

    /* renamed from: f0, reason: collision with root package name */
    public EdgeEffect f2387f0;

    /* renamed from: g, reason: collision with root package name */
    public final m f2388g;

    /* renamed from: g0, reason: collision with root package name */
    public e1 f2389g0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2390h;

    /* renamed from: h0, reason: collision with root package name */
    public int f2391h0;

    /* renamed from: i, reason: collision with root package name */
    public final w0 f2392i;

    /* renamed from: i0, reason: collision with root package name */
    public int f2393i0;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f2394j;

    /* renamed from: j0, reason: collision with root package name */
    public VelocityTracker f2395j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2396k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2397k0;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f2398l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2399l0;

    /* renamed from: m, reason: collision with root package name */
    public z0 f2400m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2401m0;

    /* renamed from: n, reason: collision with root package name */
    public i1 f2402n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2403o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2404o0;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2405p;

    /* renamed from: p0, reason: collision with root package name */
    public l1 f2406p0;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2407q;

    /* renamed from: q0, reason: collision with root package name */
    public final int f2408q0;

    /* renamed from: r, reason: collision with root package name */
    public m1 f2409r;

    /* renamed from: r0, reason: collision with root package name */
    public final int f2410r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2411s;

    /* renamed from: s0, reason: collision with root package name */
    public final float f2412s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2413t;

    /* renamed from: t0, reason: collision with root package name */
    public final float f2414t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2415u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2416u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2417v;

    /* renamed from: v0, reason: collision with root package name */
    public final x1 f2418v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2419w;

    /* renamed from: w0, reason: collision with root package name */
    public d0 f2420w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2421x;

    /* renamed from: x0, reason: collision with root package name */
    public final p2.m f2422x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2423y;

    /* renamed from: y0, reason: collision with root package name */
    public final u1 f2424y0;

    /* renamed from: z, reason: collision with root package name */
    public int f2425z;

    /* renamed from: z0, reason: collision with root package name */
    public n1 f2426z0;

    /* JADX WARN: Type inference failed for: r0v9, types: [k7.v1, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f2377b1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2378c1 = new d(3);
        f2379d1 = new Object();
    }

    public RecyclerView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.assetgro.stockgro.prod.R.attr.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView H = H(viewGroup.getChildAt(i10));
            if (H != null) {
                return H;
            }
        }
        return null;
    }

    public static y1 N(View view) {
        if (view == null) {
            return null;
        }
        return ((j1) view.getLayoutParams()).f22430a;
    }

    private z getScrollingChildHelper() {
        if (this.I0 == null) {
            this.I0 = new z(this);
        }
        return this.I0;
    }

    public static void l(y1 y1Var) {
        WeakReference weakReference = y1Var.f22630b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == y1Var.f22629a) {
                    return;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            y1Var.f22630b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && i0.v(edgeEffect) != s0.g.f34069a) {
            int round = Math.round(i0.D(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f) * ((-i11) / 4.0f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 < 0 && edgeEffect2 != null && i0.v(edgeEffect2) != s0.g.f34069a) {
            float f10 = i11;
            int round2 = Math.round(i0.D(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
        return i10;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        U0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        V0 = z10;
    }

    public final void A() {
        if (this.f2385e0 != null) {
            return;
        }
        ((v1) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2385e0 = edgeEffect;
        if (this.f2390h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.J != null) {
            return;
        }
        ((v1) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.f2390h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f2400m + ", layout:" + this.f2402n + ", context:" + getContext();
    }

    public final void D(u1 u1Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2418v0.f22617c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            u1Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        u1Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View E(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.View):android.view.View");
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2407q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            m1 m1Var = (m1) arrayList.get(i10);
            if (m1Var.d(motionEvent) && action != 3) {
                this.f2409r = m1Var;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int e10 = this.f2386f.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            y1 N = N(this.f2386f.d(i12));
            if (!N.s()) {
                int e11 = N.e();
                if (e11 < i10) {
                    i10 = e11;
                }
                if (e11 > i11) {
                    i11 = e11;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final y1 I(int i10) {
        y1 y1Var = null;
        if (this.D) {
            return null;
        }
        int h10 = this.f2386f.h();
        for (int i11 = 0; i11 < h10; i11++) {
            y1 N = N(this.f2386f.g(i11));
            if (N != null && !N.l() && K(N) == i10) {
                if (this.f2386f.k(N.f22629a)) {
                    y1Var = N;
                } else {
                    return N;
                }
            }
        }
        return y1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f9, code lost:
    
        if (r1 < r14) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(int, int, int, int):boolean");
    }

    public final int K(y1 y1Var) {
        if (y1Var.g(524) || !y1Var.i()) {
            return -1;
        }
        b bVar = this.f2384e;
        int i10 = y1Var.f22631c;
        ArrayList arrayList = bVar.f22274b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f22265a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = aVar.f22266b;
                        if (i13 == i10) {
                            i10 = aVar.f22268d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (aVar.f22268d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = aVar.f22266b;
                    if (i14 <= i10) {
                        int i15 = aVar.f22268d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (aVar.f22266b <= i10) {
                i10 += aVar.f22268d;
            }
        }
        return i10;
    }

    public final long L(y1 y1Var) {
        if (this.f2400m.f22652b) {
            return y1Var.f22633e;
        }
        return y1Var.f22631c;
    }

    public final y1 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return N(view);
    }

    public final Rect O(View view) {
        j1 j1Var = (j1) view.getLayoutParams();
        boolean z10 = j1Var.f22432c;
        Rect rect = j1Var.f22431b;
        if (!z10) {
            return rect;
        }
        if (this.f2424y0.f22592g && (j1Var.f22430a.o() || j1Var.f22430a.j())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2405p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f2394j;
            rect2.set(0, 0, 0, 0);
            ((f1) arrayList.get(i10)).f(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j1Var.f22432c = false;
        return rect;
    }

    public final boolean P() {
        if (this.f2415u && !this.D && !this.f2384e.g()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        return this.F > 0;
    }

    public final void R(int i10) {
        if (this.f2402n == null) {
            return;
        }
        setScrollState(2);
        this.f2402n.t0(i10);
        awakenScrollBars();
    }

    public final void S() {
        int h10 = this.f2386f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((j1) this.f2386f.g(i10).getLayoutParams()).f22432c = true;
        }
        ArrayList arrayList = (ArrayList) this.f2382c.f36880e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            j1 j1Var = (j1) ((y1) arrayList.get(i11)).f22629a.getLayoutParams();
            if (j1Var != null) {
                j1Var.f22432c = true;
            }
        }
    }

    public final void T(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f2386f.h();
        for (int i13 = 0; i13 < h10; i13++) {
            y1 N = N(this.f2386f.g(i13));
            if (N != null && !N.s()) {
                int i14 = N.f22631c;
                u1 u1Var = this.f2424y0;
                if (i14 >= i12) {
                    if (V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + N + " now at position " + (N.f22631c - i11));
                    }
                    N.p(-i11, z10);
                    u1Var.f22591f = true;
                } else if (i14 >= i10) {
                    if (V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + N + " now REMOVED");
                    }
                    N.b(8);
                    N.p(-i11, z10);
                    N.f22631c = i10 - 1;
                    u1Var.f22591f = true;
                }
            }
        }
        g gVar = this.f2382c;
        ArrayList arrayList = (ArrayList) gVar.f36880e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y1 y1Var = (y1) arrayList.get(size);
            if (y1Var != null) {
                int i15 = y1Var.f22631c;
                if (i15 >= i12) {
                    if (V0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + y1Var + " now at position " + (y1Var.f22631c - i11));
                    }
                    y1Var.p(-i11, z10);
                } else if (i15 >= i10) {
                    y1Var.b(8);
                    gVar.i(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.F++;
    }

    public final void V(boolean z10) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.F - 1;
        this.F = i11;
        if (i11 < 1) {
            if (U0 && i11 < 0) {
                throw new IllegalStateException(nn.d.i(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.F = 0;
            if (z10) {
                int i12 = this.f2425z;
                this.f2425z = 0;
                if (i12 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    e4.b.b(obtain, i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.M0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    y1 y1Var = (y1) arrayList.get(size);
                    if (y1Var.f22629a.getParent() == this && !y1Var.s() && (i10 = y1Var.f22645q) != -1) {
                        WeakHashMap weakHashMap = d4.n1.f13788a;
                        v0.s(y1Var.f22629a, i10);
                        y1Var.f22645q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2393i0) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f2393i0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2401m0 = x10;
            this.f2397k0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.n0 = y10;
            this.f2399l0 = y10;
        }
    }

    public final void X() {
        if (!this.E0 && this.f2411s) {
            WeakHashMap weakHashMap = d4.n1.f13788a;
            v0.m(this, this.N0);
            this.E0 = true;
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.D) {
            b bVar = this.f2384e;
            bVar.l(bVar.f22274b);
            bVar.l(bVar.f22275c);
            bVar.f22278f = 0;
            if (this.E) {
                this.f2402n.a0();
            }
        }
        if (this.f2389g0 != null && this.f2402n.F0()) {
            this.f2384e.j();
        } else {
            this.f2384e.c();
        }
        if (!this.B0 && !this.C0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (this.f2415u && this.f2389g0 != null && (((z12 = this.D) || z10 || this.f2402n.f22409f) && (!z12 || this.f2400m.f22652b))) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1 u1Var = this.f2424y0;
        u1Var.f22595j = z11;
        if (z11 && z10 && !this.D && this.f2389g0 != null && this.f2402n.F0()) {
            z13 = true;
        }
        u1Var.f22596k = z13;
    }

    public final void Z(boolean z10) {
        this.E = z10 | this.E;
        this.D = true;
        int h10 = this.f2386f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            y1 N = N(this.f2386f.g(i10));
            if (N != null && !N.s()) {
                N.b(6);
            }
        }
        S();
        g gVar = this.f2382c;
        ArrayList arrayList = (ArrayList) gVar.f36880e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) arrayList.get(i11);
            if (y1Var != null) {
                y1Var.b(6);
                y1Var.a(null);
            }
        }
        z0 z0Var = ((RecyclerView) gVar.f36884i).f2400m;
        if (z0Var == null || !z0Var.f22652b) {
            gVar.h();
        }
    }

    public final void a0(y1 y1Var, v5.i iVar) {
        y1Var.f22638j &= -8193;
        boolean z10 = this.f2424y0.f22593h;
        m mVar = this.f2388g;
        if (z10 && y1Var.o() && !y1Var.l() && !y1Var.s()) {
            ((o) mVar.f15795c).g(L(y1Var), y1Var);
        }
        mVar.e(y1Var, iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            i1Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0() {
        boolean z10;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.I.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2385e0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f2385e0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2387f0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f2387f0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = d4.n1.f13788a;
            v0.k(this);
        }
    }

    public final int c0(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.I;
        float f11 = s0.g.f34069a;
        if (edgeEffect != null && i0.v(edgeEffect) != s0.g.f34069a) {
            if (canScrollHorizontally(-1)) {
                this.I.onRelease();
            } else {
                float f12 = -i0.D(this.I, -width, 1.0f - height);
                if (i0.v(this.I) == s0.g.f34069a) {
                    this.I.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f2385e0;
            if (edgeEffect2 != null && i0.v(edgeEffect2) != s0.g.f34069a) {
                if (canScrollHorizontally(1)) {
                    this.f2385e0.onRelease();
                } else {
                    float D = i0.D(this.f2385e0, width, height);
                    if (i0.v(this.f2385e0) == s0.g.f34069a) {
                        this.f2385e0.onRelease();
                    }
                    f11 = D;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof j1) && this.f2402n.f((j1) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.d()) {
            return 0;
        }
        return this.f2402n.j(this.f2424y0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.d()) {
            return 0;
        }
        return this.f2402n.k(this.f2424y0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.d()) {
            return 0;
        }
        return this.f2402n.l(this.f2424y0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.e()) {
            return 0;
        }
        return this.f2402n.m(this.f2424y0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.e()) {
            return 0;
        }
        return this.f2402n.n(this.f2424y0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        i1 i1Var = this.f2402n;
        if (i1Var == null || !i1Var.e()) {
            return 0;
        }
        return this.f2402n.o(this.f2424y0);
    }

    public final int d0(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.J;
        float f11 = s0.g.f34069a;
        if (edgeEffect != null && i0.v(edgeEffect) != s0.g.f34069a) {
            if (canScrollVertically(-1)) {
                this.J.onRelease();
            } else {
                float f12 = -i0.D(this.J, -height, width);
                if (i0.v(this.J) == s0.g.f34069a) {
                    this.J.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f2387f0;
            if (edgeEffect2 != null && i0.v(edgeEffect2) != s0.g.f34069a) {
                if (canScrollVertically(1)) {
                    this.f2387f0.onRelease();
                } else {
                    float D = i0.D(this.f2387f0, height, 1.0f - width);
                    if (i0.v(this.f2387f0) == s0.g.f34069a) {
                        this.f2387f0.onRelease();
                    }
                    f11 = D;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        i1 layoutManager = getLayoutManager();
        int i10 = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.e()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 92 && keyCode != 93) {
                if (keyCode == 122 || keyCode == 123) {
                    boolean M = layoutManager.M();
                    if (keyCode == 122) {
                        if (M) {
                            i10 = getAdapter().a();
                        }
                    } else if (!M) {
                        i10 = getAdapter().a();
                    }
                    l0(i10);
                    return true;
                }
            } else {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    k0(0, measuredHeight, false);
                } else {
                    k0(0, -measuredHeight, false);
                }
                return true;
            }
        } else if (layoutManager.d()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 92 && keyCode2 != 93) {
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean M2 = layoutManager.M();
                    if (keyCode2 == 122) {
                        if (M2) {
                            i10 = getAdapter().a();
                        }
                    } else if (!M2) {
                        i10 = getAdapter().a();
                    }
                    l0(i10);
                    return true;
                }
            } else {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    k0(measuredWidth, 0, false);
                } else {
                    k0(-measuredWidth, 0, false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        ArrayList arrayList = this.f2405p;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            ((f1) arrayList.get(i12)).i(canvas, this);
        }
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f2390h) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, s0.g.f34069a);
            EdgeEffect edgeEffect2 = this.I;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2390h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.J;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2385e0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f2390h) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.f2385e0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2387f0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2390h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2387f0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if ((!z10 && this.f2389g0 != null && arrayList.size() > 0 && this.f2389g0.f()) || z10) {
            WeakHashMap weakHashMap = d4.n1.f13788a;
            v0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0(f1 f1Var) {
        boolean z10;
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            i1Var.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2405p;
        arrayList.remove(f1Var);
        if (arrayList.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        S();
        requestLayout();
    }

    public final void f0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2394j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof j1) {
            j1 j1Var = (j1) layoutParams;
            if (!j1Var.f22432c) {
                int i10 = rect.left;
                Rect rect2 = j1Var.f22431b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        i1 i1Var = this.f2402n;
        Rect rect3 = this.f2394j;
        boolean z11 = !this.f2415u;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i1Var.p0(this, view, rect3, z11, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        if (r3 == s0.g.f34069a) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g0(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            return i1Var.r();
        }
        throw new IllegalStateException(nn.d.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            return i1Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(nn.d.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public z0 getAdapter() {
        return this.f2400m;
    }

    @Override // android.view.View
    public int getBaseline() {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            i1Var.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        c1 c1Var = this.G0;
        if (c1Var == null) {
            return super.getChildDrawingOrder(i10, i11);
        }
        k0 k0Var = (k0) ((k) c1Var).f14993a;
        View view = k0Var.f22459w;
        if (view != null) {
            int i12 = k0Var.f22460x;
            if (i12 == -1) {
                i12 = k0Var.f22454r.indexOfChild(view);
                k0Var.f22460x = i12;
            }
            if (i11 == i10 - 1) {
                return i12;
            }
            if (i11 >= i12) {
                return i11 + 1;
            }
            return i11;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2390h;
    }

    public a2 getCompatAccessibilityDelegate() {
        return this.F0;
    }

    @NonNull
    public d1 getEdgeEffectFactory() {
        return this.H;
    }

    public e1 getItemAnimator() {
        return this.f2389g0;
    }

    public int getItemDecorationCount() {
        return this.f2405p.size();
    }

    public i1 getLayoutManager() {
        return this.f2402n;
    }

    public int getMaxFlingVelocity() {
        return this.f2410r0;
    }

    public int getMinFlingVelocity() {
        return this.f2408q0;
    }

    public long getNanoTime() {
        if (f2376a1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public l1 getOnFlingListener() {
        return this.f2406p0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2416u0;
    }

    @NonNull
    public p1 getRecycledViewPool() {
        return this.f2382c.d();
    }

    public int getScrollState() {
        return this.f2391h0;
    }

    public final void h(y1 y1Var) {
        boolean z10;
        View view = y1Var.f22629a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2382c.n(M(view));
        if (y1Var.n()) {
            this.f2386f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.f2386f.a(view, -1, true);
            return;
        }
        j jVar = this.f2386f;
        int indexOfChild = jVar.f22423a.f22614a.indexOfChild(view);
        if (indexOfChild >= 0) {
            jVar.f22424b.m(indexOfChild);
            jVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        y1 y1Var;
        m0();
        U();
        int i14 = p.f41148a;
        y3.o.a("RV Scroll");
        u1 u1Var = this.f2424y0;
        D(u1Var);
        g gVar = this.f2382c;
        if (i10 != 0) {
            i12 = this.f2402n.s0(i10, gVar, u1Var);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f2402n.u0(i11, gVar, u1Var);
        } else {
            i13 = 0;
        }
        y3.o.b();
        int e10 = this.f2386f.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f2386f.d(i15);
            y1 M = M(d10);
            if (M != null && (y1Var = M.f22637i) != null) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = y1Var.f22629a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        o0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(f1 f1Var) {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            i1Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2405p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f1Var);
        S();
        requestLayout();
    }

    public final void i0(int i10) {
        if (this.f2421x) {
            return;
        }
        q0();
        i1 i1Var = this.f2402n;
        if (i1Var == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i1Var.t0(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2411s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2421x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f13868d;
    }

    public final void j(n1 n1Var) {
        if (this.A0 == null) {
            this.A0 = new ArrayList();
        }
        this.A0.add(n1Var);
    }

    public final boolean j0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float v10 = i0.v(edgeEffect) * i11;
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f2380a * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = X0;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f10)) < v10) {
            return true;
        }
        return false;
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                throw new IllegalStateException(nn.d.i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.G > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(nn.d.i(this, new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET))));
        }
    }

    public final void k0(int i10, int i11, boolean z10) {
        i1 i1Var = this.f2402n;
        if (i1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2421x) {
            return;
        }
        int i12 = 0;
        if (!i1Var.d()) {
            i10 = 0;
        }
        if (!this.f2402n.e()) {
            i11 = 0;
        }
        if (i10 != 0 || i11 != 0) {
            if (z10) {
                if (i10 != 0) {
                    i12 = 1;
                }
                if (i11 != 0) {
                    i12 |= 2;
                }
                getScrollingChildHelper().i(i12, 1);
            }
            this.f2418v0.c(i10, i11, Integer.MIN_VALUE, null);
        }
    }

    public final void l0(int i10) {
        if (this.f2421x) {
            return;
        }
        i1 i1Var = this.f2402n;
        if (i1Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            i1Var.D0(this, i10);
        }
    }

    public final void m() {
        int h10 = this.f2386f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            y1 N = N(this.f2386f.g(i10));
            if (!N.s()) {
                N.f22632d = -1;
                N.f22635g = -1;
            }
        }
        g gVar = this.f2382c;
        ArrayList arrayList = (ArrayList) gVar.f36880e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) arrayList.get(i11);
            y1Var.f22632d = -1;
            y1Var.f22635g = -1;
        }
        ArrayList arrayList2 = (ArrayList) gVar.f36878c;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            y1 y1Var2 = (y1) arrayList2.get(i12);
            y1Var2.f22632d = -1;
            y1Var2.f22635g = -1;
        }
        ArrayList arrayList3 = (ArrayList) gVar.f36879d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                y1 y1Var3 = (y1) ((ArrayList) gVar.f36879d).get(i13);
                y1Var3.f22632d = -1;
                y1Var3.f22635g = -1;
            }
        }
    }

    public final void m0() {
        int i10 = this.f2417v + 1;
        this.f2417v = i10;
        if (i10 != 1 || this.f2421x) {
            return;
        }
        this.f2419w = false;
    }

    public final void n(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.I;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.I.onRelease();
            z10 = this.I.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f2385e0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f2385e0.onRelease();
            z10 |= this.f2385e0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.J.onRelease();
            z10 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2387f0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f2387f0.onRelease();
            z10 |= this.f2387f0.isFinished();
        }
        if (z10) {
            WeakHashMap weakHashMap = d4.n1.f13788a;
            v0.k(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(int i10) {
        boolean d10 = this.f2402n.d();
        int i11 = d10;
        if (this.f2402n.e()) {
            i11 = (d10 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().i(i11, i10);
    }

    public final void o0(boolean z10) {
        if (this.f2417v < 1) {
            if (!U0) {
                this.f2417v = 1;
            } else {
                throw new IllegalStateException(nn.d.i(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z10 && !this.f2421x) {
            this.f2419w = false;
        }
        if (this.f2417v == 1) {
            if (z10 && this.f2419w && !this.f2421x && this.f2402n != null && this.f2400m != null) {
                s();
            }
            if (!this.f2421x) {
                this.f2419w = false;
            }
        }
        this.f2417v--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [k7.d0, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.F = r0
            r1 = 1
            r5.f2411s = r1
            boolean r2 = r5.f2415u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f2415u = r2
            u6.g r2 = r5.f2382c
            r2.f()
            k7.i1 r2 = r5.f2402n
            if (r2 == 0) goto L23
            r2.f22410g = r1
        L23:
            r5.E0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f2376a1
            if (r0 == 0) goto L8e
            java.lang.ThreadLocal r0 = k7.d0.f22323e
            java.lang.Object r1 = r0.get()
            k7.d0 r1 = (k7.d0) r1
            r5.f2420w0 = r1
            if (r1 != 0) goto L71
            k7.d0 r1 = new k7.d0
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22325a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f22328d = r2
            r5.f2420w0 = r1
            java.util.WeakHashMap r1 = d4.n1.f13788a
            android.view.Display r1 = d4.w0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L63
            if (r1 == 0) goto L63
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L63
            goto L65
        L63:
            r1 = 1114636288(0x42700000, float:60.0)
        L65:
            k7.d0 r2 = r5.f2420w0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f22327c = r3
            r0.set(r2)
        L71:
            k7.d0 r0 = r5.f2420w0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.U0
            java.util.ArrayList r0 = r0.f22325a
            if (r1 == 0) goto L8b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L83
            goto L8b
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8b:
            r0.add(r5)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g gVar;
        d0 d0Var;
        super.onDetachedFromWindow();
        e1 e1Var = this.f2389g0;
        if (e1Var != null) {
            e1Var.e();
        }
        q0();
        int i10 = 0;
        this.f2411s = false;
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            i1Var.f22410g = false;
            i1Var.T(this);
        }
        this.M0.clear();
        removeCallbacks(this.N0);
        this.f2388g.getClass();
        do {
        } while (i2.f22419d.c() != null);
        int i11 = 0;
        while (true) {
            gVar = this.f2382c;
            ArrayList arrayList = (ArrayList) gVar.f36880e;
            if (i11 >= arrayList.size()) {
                break;
            }
            f.z(((y1) arrayList.get(i11)).f22629a);
            i11++;
        }
        gVar.g(((RecyclerView) gVar.f36884i).f2400m, false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new t1(this, i10).iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = f.n0((View) it.next()).f20936a;
            for (int f10 = vt.y.f(arrayList2); -1 < f10; f10--) {
                ((h3) arrayList2.get(f10)).f13447a.c();
            }
        }
        if (f2376a1 && (d0Var = this.f2420w0) != null) {
            boolean remove = d0Var.f22325a.remove(this);
            if (U0 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.f2420w0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2405p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f1) arrayList.get(i10)).h(canvas, this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        if (this.f2402n != null && !this.f2421x && motionEvent.getAction() == 8) {
            int source = motionEvent.getSource() & 2;
            float f12 = s0.g.f34069a;
            if (source != 0) {
                if (this.f2402n.e()) {
                    f11 = -motionEvent.getAxisValue(9);
                } else {
                    f11 = 0.0f;
                }
                if (this.f2402n.d()) {
                    f12 = motionEvent.getAxisValue(10);
                }
                f10 = f12;
                i10 = 0;
                z10 = false;
                f12 = f11;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f10 = motionEvent.getAxisValue(26);
                if (this.f2402n.e()) {
                    float f13 = -f10;
                    f10 = 0.0f;
                    f12 = f13;
                } else if (!this.f2402n.d()) {
                    f10 = 0.0f;
                }
                i10 = 26;
                z10 = this.R0;
            } else {
                f10 = 0.0f;
                i10 = 0;
                z10 = false;
            }
            int i16 = (int) (f12 * this.f2414t0);
            int i17 = (int) (f10 * this.f2412s0);
            if (z10) {
                OverScroller overScroller = this.f2418v0.f22617c;
                k0((overScroller.getFinalX() - overScroller.getCurrX()) + i17, (overScroller.getFinalY() - overScroller.getCurrY()) + i16, true);
            } else {
                i1 i1Var = this.f2402n;
                if (i1Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f2421x) {
                    int[] iArr = this.L0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean d10 = i1Var.d();
                    boolean e10 = this.f2402n.e();
                    if (e10) {
                        i11 = (d10 ? 1 : 0) | 2;
                    } else {
                        i11 = d10 ? 1 : 0;
                    }
                    float y10 = motionEvent.getY();
                    float x10 = motionEvent.getX();
                    int c02 = i17 - c0(i17, y10);
                    int d02 = i16 - d0(i16, x10);
                    getScrollingChildHelper().i(i11, 1);
                    if (d10) {
                        i12 = c02;
                    } else {
                        i12 = 0;
                    }
                    if (e10) {
                        i13 = d02;
                    } else {
                        i13 = 0;
                    }
                    if (v(i12, i13, 1, this.L0, this.J0)) {
                        c02 -= iArr[0];
                        d02 -= iArr[1];
                    }
                    int i18 = c02;
                    int i19 = d02;
                    if (d10) {
                        i14 = i18;
                    } else {
                        i14 = 0;
                    }
                    if (e10) {
                        i15 = i19;
                    } else {
                        i15 = 0;
                    }
                    g0(i14, i15, motionEvent, 1);
                    d0 d0Var = this.f2420w0;
                    if (d0Var != null && (i18 != 0 || i19 != 0)) {
                        d0Var.a(this, i18, i19);
                    }
                    p0(1);
                }
            }
            if (i10 != 0 && !z10) {
                this.T0.a(motionEvent, i10);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ab, code lost:
    
        if (r9.f2391h0 != 2) goto L90;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = p.f41148a;
        y3.o.a("RV OnLayout");
        s();
        y3.o.b();
        this.f2415u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        i1 i1Var = this.f2402n;
        if (i1Var == null) {
            q(i10, i11);
            return;
        }
        boolean L = i1Var.L();
        g gVar = this.f2382c;
        boolean z10 = false;
        u1 u1Var = this.f2424y0;
        if (L) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2402n.g0(gVar, u1Var, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.O0 = z10;
            if (!z10 && this.f2400m != null) {
                if (u1Var.f22589d == 1) {
                    t();
                }
                this.f2402n.w0(i10, i11);
                u1Var.f22594i = true;
                u();
                this.f2402n.y0(i10, i11);
                if (this.f2402n.B0()) {
                    this.f2402n.w0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    u1Var.f22594i = true;
                    u();
                    this.f2402n.y0(i10, i11);
                }
                this.P0 = getMeasuredWidth();
                this.Q0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f2413t) {
            this.f2402n.g0(gVar, u1Var, i10, i11);
            return;
        }
        if (this.A) {
            m0();
            U();
            Y();
            V(true);
            if (u1Var.f22596k) {
                u1Var.f22592g = true;
            } else {
                this.f2384e.c();
                u1Var.f22592g = false;
            }
            this.A = false;
            o0(false);
        } else if (u1Var.f22596k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        z0 z0Var = this.f2400m;
        if (z0Var != null) {
            u1Var.f22590e = z0Var.a();
        } else {
            u1Var.f22590e = 0;
        }
        m0();
        this.f2402n.g0(gVar, u1Var, i10, i11);
        o0(false);
        u1Var.f22592g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof r1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r1 r1Var = (r1) parcelable;
        this.f2383d = r1Var;
        super.onRestoreInstanceState(r1Var.f22040a);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, k4.b, k7.r1] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        r1 r1Var = this.f2383d;
        if (r1Var != null) {
            bVar.f22558c = r1Var.f22558c;
        } else {
            i1 i1Var = this.f2402n;
            if (i1Var != null) {
                bVar.f22558c = i1Var.i0();
            } else {
                bVar.f22558c = null;
            }
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.f2387f0 = null;
            this.J = null;
            this.f2385e0 = null;
            this.I = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.f2415u && !this.D) {
            if (!this.f2384e.g()) {
                return;
            }
            b bVar = this.f2384e;
            int i10 = bVar.f22278f;
            if ((i10 & 4) != 0 && (i10 & 11) == 0) {
                int i11 = p.f41148a;
                y3.o.a("RV PartialInvalidate");
                m0();
                U();
                this.f2384e.j();
                if (!this.f2419w) {
                    int e10 = this.f2386f.e();
                    int i12 = 0;
                    while (true) {
                        if (i12 < e10) {
                            y1 N = N(this.f2386f.d(i12));
                            if (N != null && !N.s() && N.o()) {
                                s();
                                break;
                            }
                            i12++;
                        } else {
                            this.f2384e.b();
                            break;
                        }
                    }
                }
                o0(true);
                V(true);
                y3.o.b();
                return;
            }
            if (bVar.g()) {
                int i13 = p.f41148a;
                y3.o.a("RV FullInvalidate");
                s();
                y3.o.b();
                return;
            }
            return;
        }
        int i14 = p.f41148a;
        y3.o.a("RV FullInvalidate");
        s();
        y3.o.b();
    }

    public final void p0(int i10) {
        getScrollingChildHelper().j(i10);
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = d4.n1.f13788a;
        setMeasuredDimension(i1.g(i10, paddingRight, v0.e(this)), i1.g(i11, getPaddingBottom() + getPaddingTop(), v0.d(this)));
    }

    public final void q0() {
        p0 p0Var;
        setScrollState(0);
        x1 x1Var = this.f2418v0;
        x1Var.f22621g.removeCallbacks(x1Var);
        x1Var.f22617c.abortAnimation();
        i1 i1Var = this.f2402n;
        if (i1Var != null && (p0Var = i1Var.f22408e) != null) {
            p0Var.i();
        }
    }

    public final void r(View view) {
        y1 N = N(view);
        z0 z0Var = this.f2400m;
        if (z0Var != null && N != null) {
            z0Var.m(N);
        }
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k1) this.C.get(size)).b(view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        y1 N = N(view);
        if (N != null) {
            if (N.n()) {
                N.f22638j &= -257;
            } else if (!N.s()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(N);
                throw new IllegalArgumentException(nn.d.i(this, sb2));
            }
        } else if (U0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(nn.d.i(this, sb3));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        p0 p0Var = this.f2402n.f22408e;
        if ((p0Var == null || !p0Var.f22526e) && !Q() && view2 != null) {
            f0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2402n.p0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList arrayList = this.f2407q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m1) arrayList.get(i10)).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2417v == 0 && !this.f2421x) {
            super.requestLayout();
        } else {
            this.f2419w = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x0332, code lost:
    
        if (r18.f2386f.f22425c.contains(getFocusedChild()) == false) goto L217;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d8  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, v5.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        i1 i1Var = this.f2402n;
        if (i1Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2421x) {
            return;
        }
        boolean d10 = i1Var.d();
        boolean e10 = this.f2402n.e();
        if (d10 || e10) {
            if (!d10) {
                i10 = 0;
            }
            if (!e10) {
                i11 = 0;
            }
            g0(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        if (Q()) {
            int i11 = 0;
            if (accessibilityEvent != null) {
                i10 = e4.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.f2425z |= i11;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(a2 a2Var) {
        this.F0 = a2Var;
        d4.n1.n(this, a2Var);
    }

    public void setAdapter(z0 z0Var) {
        setLayoutFrozen(false);
        z0 z0Var2 = this.f2400m;
        d3 d3Var = this.f2381b;
        if (z0Var2 != null) {
            z0Var2.f22651a.unregisterObserver(d3Var);
            this.f2400m.j(this);
        }
        e1 e1Var = this.f2389g0;
        if (e1Var != null) {
            e1Var.e();
        }
        i1 i1Var = this.f2402n;
        g gVar = this.f2382c;
        if (i1Var != null) {
            i1Var.m0(gVar);
            this.f2402n.n0(gVar);
        }
        gVar.b();
        b bVar = this.f2384e;
        bVar.l(bVar.f22274b);
        bVar.l(bVar.f22275c);
        bVar.f22278f = 0;
        z0 z0Var3 = this.f2400m;
        this.f2400m = z0Var;
        if (z0Var != null) {
            z0Var.o(d3Var);
            z0Var.g(this);
        }
        i1 i1Var2 = this.f2402n;
        if (i1Var2 != null) {
            i1Var2.S();
        }
        z0 z0Var4 = this.f2400m;
        gVar.b();
        gVar.g(z0Var3, true);
        p1 d10 = gVar.d();
        if (z0Var3 != null) {
            d10.f22539b--;
        }
        if (d10.f22539b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = d10.f22538a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                o1 o1Var = (o1) sparseArray.valueAt(i10);
                Iterator it = o1Var.f22513a.iterator();
                while (it.hasNext()) {
                    f.z(((y1) it.next()).f22629a);
                }
                o1Var.f22513a.clear();
                i10++;
            }
        }
        if (z0Var4 != null) {
            d10.f22539b++;
        }
        gVar.f();
        this.f2424y0.f22591f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(c1 c1Var) {
        boolean z10;
        if (c1Var == this.G0) {
            return;
        }
        this.G0 = c1Var;
        if (c1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setChildrenDrawingOrderEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2390h) {
            this.f2387f0 = null;
            this.J = null;
            this.f2385e0 = null;
            this.I = null;
        }
        this.f2390h = z10;
        super.setClipToPadding(z10);
        if (this.f2415u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull d1 d1Var) {
        d1Var.getClass();
        this.H = d1Var;
        this.f2387f0 = null;
        this.J = null;
        this.f2385e0 = null;
        this.I = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.f2413t = z10;
    }

    public void setItemAnimator(e1 e1Var) {
        e1 e1Var2 = this.f2389g0;
        if (e1Var2 != null) {
            e1Var2.e();
            this.f2389g0.f22331a = null;
        }
        this.f2389g0 = e1Var;
        if (e1Var != null) {
            e1Var.f22331a = this.D0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        g gVar = this.f2382c;
        gVar.f36876a = i10;
        gVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(i1 i1Var) {
        x0 x0Var;
        if (i1Var == this.f2402n) {
            return;
        }
        q0();
        i1 i1Var2 = this.f2402n;
        g gVar = this.f2382c;
        if (i1Var2 != null) {
            e1 e1Var = this.f2389g0;
            if (e1Var != null) {
                e1Var.e();
            }
            this.f2402n.m0(gVar);
            this.f2402n.n0(gVar);
            gVar.b();
            if (this.f2411s) {
                i1 i1Var3 = this.f2402n;
                i1Var3.f22410g = false;
                i1Var3.T(this);
            }
            this.f2402n.z0(null);
            this.f2402n = null;
        } else {
            gVar.b();
        }
        j jVar = this.f2386f;
        jVar.f22424b.l();
        ArrayList arrayList = jVar.f22425c;
        int size = arrayList.size() - 1;
        while (true) {
            x0Var = jVar.f22423a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            x0Var.getClass();
            y1 N = N(view);
            if (N != null) {
                int i10 = N.f22644p;
                RecyclerView recyclerView = x0Var.f22614a;
                if (recyclerView.Q()) {
                    N.f22645q = i10;
                    recyclerView.M0.add(N);
                } else {
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    v0.s(N.f22629a, i10);
                }
                N.f22644p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = x0Var.f22614a;
        int childCount = recyclerView2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView2.getChildAt(i11);
            recyclerView2.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f2402n = i1Var;
        if (i1Var != null) {
            if (i1Var.f22405b == null) {
                i1Var.z0(this);
                if (this.f2411s) {
                    this.f2402n.f22410g = true;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(i1Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(nn.d.i(i1Var.f22405b, sb2));
            }
        }
        gVar.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().h(z10);
    }

    public void setOnFlingListener(l1 l1Var) {
        this.f2406p0 = l1Var;
    }

    @Deprecated
    public void setOnScrollListener(n1 n1Var) {
        this.f2426z0 = n1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2416u0 = z10;
    }

    public void setRecycledViewPool(p1 p1Var) {
        g gVar = this.f2382c;
        gVar.g(((RecyclerView) gVar.f36884i).f2400m, false);
        if (((p1) gVar.f36882g) != null) {
            r1.f22539b--;
        }
        gVar.f36882g = p1Var;
        if (p1Var != null && ((RecyclerView) gVar.f36884i).getAdapter() != null) {
            ((p1) gVar.f36882g).f22539b++;
        }
        gVar.f();
    }

    @Deprecated
    public void setRecyclerListener(q1 q1Var) {
    }

    public void setScrollState(int i10) {
        p0 p0Var;
        if (i10 == this.f2391h0) {
            return;
        }
        if (V0) {
            StringBuilder n10 = a3.a.n("setting scroll state to ", i10, " from ");
            n10.append(this.f2391h0);
            Log.d("RecyclerView", n10.toString(), new Exception());
        }
        this.f2391h0 = i10;
        if (i10 != 2) {
            x1 x1Var = this.f2418v0;
            x1Var.f22621g.removeCallbacks(x1Var);
            x1Var.f22617c.abortAnimation();
            i1 i1Var = this.f2402n;
            if (i1Var != null && (p0Var = i1Var.f22408e) != null) {
                p0Var.i();
            }
        }
        i1 i1Var2 = this.f2402n;
        if (i1Var2 != null) {
            i1Var2.j0(i10);
        }
        n1 n1Var = this.f2426z0;
        if (n1Var != null) {
            n1Var.a(this, i10);
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((n1) this.A0.get(size)).a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.f2404o0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2404o0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(w1 w1Var) {
        this.f2382c.f36883h = w1Var;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().i(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f2421x) {
            k("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.f2421x = false;
                if (this.f2419w && this.f2402n != null && this.f2400m != null) {
                    requestLayout();
                }
                this.f2419w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, s0.g.f34069a, s0.g.f34069a, 0));
            this.f2421x = true;
            this.f2423y = true;
            q0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, v5.i] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, v5.i] */
    public final void t() {
        View view;
        int c10;
        boolean z10;
        i2 i2Var;
        View E;
        u1 u1Var = this.f2424y0;
        u1Var.a(1);
        D(u1Var);
        u1Var.f22594i = false;
        m0();
        m mVar = this.f2388g;
        mVar.f();
        U();
        Y();
        y1 y1Var = null;
        if (this.f2416u0 && hasFocus() && this.f2400m != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (E = E(view)) != null) {
            y1Var = M(E);
        }
        long j10 = -1;
        if (y1Var == null) {
            u1Var.f22598m = -1L;
            u1Var.f22597l = -1;
            u1Var.f22599n = -1;
        } else {
            if (this.f2400m.f22652b) {
                j10 = y1Var.f22633e;
            }
            u1Var.f22598m = j10;
            if (this.D) {
                c10 = -1;
            } else if (y1Var.l()) {
                c10 = y1Var.f22632d;
            } else {
                c10 = y1Var.c();
            }
            u1Var.f22597l = c10;
            View view2 = y1Var.f22629a;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id2 = view2.getId();
                }
            }
            u1Var.f22599n = id2;
        }
        if (u1Var.f22595j && this.C0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1Var.f22593h = z10;
        this.C0 = false;
        this.B0 = false;
        u1Var.f22592g = u1Var.f22596k;
        u1Var.f22590e = this.f2400m.a();
        G(this.H0);
        if (u1Var.f22595j) {
            int e10 = this.f2386f.e();
            for (int i10 = 0; i10 < e10; i10++) {
                y1 N = N(this.f2386f.d(i10));
                if (!N.s() && (!N.j() || this.f2400m.f22652b)) {
                    e1 e1Var = this.f2389g0;
                    e1.b(N);
                    N.f();
                    e1Var.getClass();
                    ?? obj = new Object();
                    View view3 = N.f22629a;
                    obj.f37737a = view3.getLeft();
                    obj.f37738b = view3.getTop();
                    obj.f37739c = view3.getRight();
                    obj.f37740d = view3.getBottom();
                    mVar.e(N, obj);
                    if (u1Var.f22593h && N.o() && !N.l() && !N.s() && !N.j()) {
                        ((o) mVar.f15795c).g(L(N), N);
                    }
                }
            }
        }
        if (u1Var.f22596k) {
            int h10 = this.f2386f.h();
            for (int i11 = 0; i11 < h10; i11++) {
                y1 N2 = N(this.f2386f.g(i11));
                if (U0 && N2.f22631c == -1 && !N2.l()) {
                    throw new IllegalStateException(nn.d.i(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!N2.s() && N2.f22632d == -1) {
                    N2.f22632d = N2.f22631c;
                }
            }
            boolean z11 = u1Var.f22591f;
            u1Var.f22591f = false;
            this.f2402n.e0(this.f2382c, u1Var);
            u1Var.f22591f = z11;
            for (int i12 = 0; i12 < this.f2386f.e(); i12++) {
                y1 N3 = N(this.f2386f.d(i12));
                if (!N3.s() && ((i2Var = (i2) ((j0) mVar.f15794b).get(N3)) == null || (i2Var.f22420a & 4) == 0)) {
                    e1.b(N3);
                    boolean g10 = N3.g(UserMetadata.MAX_INTERNAL_KEY_SIZE);
                    e1 e1Var2 = this.f2389g0;
                    N3.f();
                    e1Var2.getClass();
                    ?? obj2 = new Object();
                    View view4 = N3.f22629a;
                    obj2.f37737a = view4.getLeft();
                    obj2.f37738b = view4.getTop();
                    obj2.f37739c = view4.getRight();
                    obj2.f37740d = view4.getBottom();
                    if (g10) {
                        a0(N3, obj2);
                    } else {
                        i2 i2Var2 = (i2) ((j0) mVar.f15794b).get(N3);
                        if (i2Var2 == null) {
                            i2Var2 = i2.a();
                            ((j0) mVar.f15794b).put(N3, i2Var2);
                        }
                        i2Var2.f22420a |= 2;
                        i2Var2.f22421b = obj2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        V(true);
        o0(false);
        u1Var.f22589d = 2;
    }

    public final void u() {
        boolean z10;
        m0();
        U();
        u1 u1Var = this.f2424y0;
        u1Var.a(6);
        this.f2384e.c();
        u1Var.f22590e = this.f2400m.a();
        u1Var.f22588c = 0;
        if (this.f2383d != null) {
            z0 z0Var = this.f2400m;
            int ordinal = z0Var.f22653c.ordinal();
            if (ordinal == 1 ? z0Var.a() > 0 : ordinal != 2) {
                Parcelable parcelable = this.f2383d.f22558c;
                if (parcelable != null) {
                    this.f2402n.h0(parcelable);
                }
                this.f2383d = null;
            }
        }
        u1Var.f22592g = false;
        this.f2402n.e0(this.f2382c, u1Var);
        u1Var.f22591f = false;
        if (u1Var.f22595j && this.f2389g0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1Var.f22595j = z10;
        u1Var.f22589d = 4;
        V(true);
        o0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.G++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        n1 n1Var = this.f2426z0;
        if (n1Var != null) {
            n1Var.b(this, i10, i11);
        }
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((n1) this.A0.get(size)).b(this, i10, i11);
            }
        }
        this.G--;
    }

    public final void y() {
        if (this.f2387f0 != null) {
            return;
        }
        ((v1) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2387f0 = edgeEffect;
        if (this.f2390h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.I != null) {
            return;
        }
        ((v1) this.H).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.f2390h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [k7.e1, java.lang.Object, k7.q] */
    /* JADX WARN: Type inference failed for: r1v19, types: [k7.u1, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float a10;
        float a11;
        int i11;
        char c10;
        Object[] objArr;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr2;
        int i12 = 1;
        this.f2381b = new d3(this, i12);
        this.f2382c = new g(this);
        int i13 = 0;
        this.f2388g = new m(i13);
        this.f2392i = new w0(this, i13);
        this.f2394j = new Rect();
        this.f2396k = new Rect();
        this.f2398l = new RectF();
        this.f2403o = new ArrayList();
        this.f2405p = new ArrayList();
        this.f2407q = new ArrayList();
        this.f2417v = 0;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        this.H = f2379d1;
        ?? obj = new Object();
        obj.f22331a = null;
        obj.f22332b = new ArrayList();
        obj.f22333c = 120L;
        obj.f22334d = 120L;
        obj.f22335e = 250L;
        obj.f22336f = 250L;
        obj.f22542g = true;
        obj.f22543h = new ArrayList();
        obj.f22544i = new ArrayList();
        obj.f22545j = new ArrayList();
        obj.f22546k = new ArrayList();
        obj.f22547l = new ArrayList();
        obj.f22548m = new ArrayList();
        obj.f22549n = new ArrayList();
        obj.f22550o = new ArrayList();
        obj.f22551p = new ArrayList();
        obj.f22552q = new ArrayList();
        obj.f22553r = new ArrayList();
        this.f2389g0 = obj;
        this.f2391h0 = 0;
        this.f2393i0 = -1;
        this.f2412s0 = Float.MIN_VALUE;
        this.f2414t0 = Float.MIN_VALUE;
        this.f2416u0 = true;
        this.f2418v0 = new x1(this);
        this.f2422x0 = f2376a1 ? new p2.m() : null;
        ?? obj2 = new Object();
        obj2.f22586a = -1;
        obj2.f22587b = 0;
        obj2.f22588c = 0;
        obj2.f22589d = 1;
        obj2.f22590e = 0;
        obj2.f22591f = false;
        obj2.f22592g = false;
        obj2.f22593h = false;
        obj2.f22594i = false;
        obj2.f22595j = false;
        obj2.f22596k = false;
        this.f2424y0 = obj2;
        this.B0 = false;
        this.C0 = false;
        x0 x0Var = new x0(this);
        this.D0 = x0Var;
        this.E0 = false;
        this.H0 = new int[2];
        this.J0 = new int[2];
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.M0 = new ArrayList();
        this.N0 = new w0(this, i12);
        this.P0 = 0;
        this.Q0 = 0;
        this.S0 = new x0(this);
        this.T0 = new i(getContext(), new x0(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2404o0 = viewConfiguration.getScaledTouchSlop();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            Method method = d4.r1.f13811a;
            a10 = d4.o1.a(viewConfiguration);
        } else {
            a10 = d4.r1.a(viewConfiguration, context);
        }
        this.f2412s0 = a10;
        if (i14 >= 26) {
            a11 = d4.o1.b(viewConfiguration);
        } else {
            a11 = d4.r1.a(viewConfiguration, context);
        }
        this.f2414t0 = a11;
        this.f2408q0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2410r0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2380a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2389g0.f22331a = x0Var;
        this.f2384e = new b(new x0(this));
        this.f2386f = new j(new x0(this));
        WeakHashMap weakHashMap = d4.n1.f13788a;
        if ((i14 < 26 || d4.e1.c(this) == 0) && i14 >= 26) {
            d4.e1.m(this, 8);
        }
        if (v0.c(this) == 0) {
            v0.s(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new a2(this));
        int[] iArr = j7.a.f21048a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        d4.n1.m(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2390h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                i11 = 4;
                c10 = 2;
                objArr = null;
                new b0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(nn.d.i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            i11 = 4;
            c10 = 2;
            objArr = null;
        }
        obtainStyledAttributes.recycle();
        this.R0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(i1.class);
                    try {
                        constructor = asSubclass.getConstructor(f2377b1);
                        objArr2 = new Object[i11];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr2 = objArr;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((i1) constructor.newInstance(objArr2));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e16);
                }
            }
        }
        int[] iArr2 = W0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        d4.n1.m(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.assetgro.stockgro.prod.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i1 i1Var = this.f2402n;
        if (i1Var != null) {
            return i1Var.t(layoutParams);
        }
        throw new IllegalStateException(nn.d.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
