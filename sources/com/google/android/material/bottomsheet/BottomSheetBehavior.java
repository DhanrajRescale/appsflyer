package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ao.a;
import ao.d;
import com.assetgro.stockgro.prod.R;
import d4.b1;
import d4.c;
import d4.n1;
import d4.v0;
import d4.y0;
import eb.f;
import j9.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l4.e;
import o3.b;
import s0.g;
import to.h;
import to.l;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends b {
    public final d A;
    public final ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public e M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f11168a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f11169a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11170b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f11171b0;

    /* renamed from: c, reason: collision with root package name */
    public final float f11172c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f11173c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f11174d;

    /* renamed from: d0, reason: collision with root package name */
    public final a f11175d0;

    /* renamed from: e, reason: collision with root package name */
    public int f11176e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11177f;

    /* renamed from: g, reason: collision with root package name */
    public int f11178g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11179h;

    /* renamed from: i, reason: collision with root package name */
    public final h f11180i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f11181j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11182k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11183l;

    /* renamed from: m, reason: collision with root package name */
    public int f11184m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11185n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11186o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11187p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11188q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f11189r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11190s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f11191t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f11192u;

    /* renamed from: v, reason: collision with root package name */
    public int f11193v;

    /* renamed from: w, reason: collision with root package name */
    public int f11194w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11195x;

    /* renamed from: y, reason: collision with root package name */
    public final l f11196y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11197z;

    public BottomSheetBehavior() {
        this.f11168a = 0;
        this.f11170b = true;
        this.f11182k = -1;
        this.f11183l = -1;
        this.A = new d(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f11173c0 = new SparseIntArray();
        this.f11175d0 = new a(this);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        if (b1.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View v10 = v(viewGroup.getChildAt(i10));
                if (v10 != null) {
                    return v10;
                }
            }
        }
        return null;
    }

    public static BottomSheetBehavior w(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof o3.e) {
            b bVar = ((o3.e) layoutParams).f29544a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static int x(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final void A(float f10) {
        if (f10 > g.f34069a && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public final void B(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.L == 5) {
                D(4);
            }
            H();
        }
    }

    public final void C(int i10) {
        if (i10 == -1) {
            if (!this.f11177f) {
                this.f11177f = true;
            } else {
                return;
            }
        } else if (this.f11177f || this.f11176e != i10) {
            this.f11177f = false;
            this.f11176e = Math.max(0, i10);
        } else {
            return;
        }
        K();
    }

    public final void D(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2) {
            if (!this.I && i10 == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
                return;
            }
            if (i10 == 6 && this.f11170b && z(i10) <= this.D) {
                i11 = 3;
            } else {
                i11 = i10;
            }
            WeakReference weakReference = this.U;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.U.get();
                b.d dVar = new b.d(this, view, i11, 9);
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested()) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.b(view)) {
                        view.post(dVar);
                        return;
                    }
                }
                dVar.run();
                return;
            }
            E(i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder("STATE_");
        if (i10 == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        throw new IllegalArgumentException(nn.d.o(sb2, str, " should not be set externally."));
    }

    public final void E(int i10) {
        View view;
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.I;
        }
        WeakReference weakReference = this.U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            J(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            J(false);
        }
        I(i10, true);
        while (true) {
            ArrayList arrayList = this.W;
            if (i11 < arrayList.size()) {
                ((ao.b) arrayList.get(i11)).onStateChanged(view, i10);
                i11++;
            } else {
                H();
                return;
            }
        }
    }

    public final boolean F(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f10 * this.Q) + view.getTop()) - this.G) / t() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void G(View view, int i10, boolean z10) {
        int z11 = z(i10);
        e eVar = this.M;
        if (eVar != null && (!z10 ? eVar.s(view, view.getLeft(), z11) : eVar.q(view.getLeft(), z11))) {
            E(2);
            I(i10, true);
            this.A.a(i10);
            return;
        }
        E(i10);
    }

    public final void H() {
        View view;
        int i10;
        boolean z10;
        c cVar;
        WeakReference weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            n1.k(view, 524288);
            n1.h(view, 0);
            n1.k(view, 262144);
            n1.h(view, 0);
            n1.k(view, 1048576);
            n1.h(view, 0);
            SparseIntArray sparseIntArray = this.f11173c0;
            int i11 = sparseIntArray.get(0, -1);
            if (i11 != -1) {
                n1.k(view, i11);
                n1.h(view, 0);
                sparseIntArray.delete(0);
            }
            int i12 = 6;
            if (!this.f11170b && this.L != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                f fVar = new f(this, i12);
                ArrayList f10 = n1.f(view);
                int i13 = 0;
                while (true) {
                    if (i13 < f10.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((e4.f) f10.get(i13)).f14989a).getLabel())) {
                            i10 = ((e4.f) f10.get(i13)).a();
                            break;
                        }
                        i13++;
                    } else {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = n1.f13791d;
                            if (i14 >= iArr.length || i15 != -1) {
                                break;
                            }
                            int i16 = iArr[i14];
                            boolean z11 = true;
                            for (int i17 = 0; i17 < f10.size(); i17++) {
                                if (((e4.f) f10.get(i17)).a() != i16) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 &= z10;
                            }
                            if (z11) {
                                i15 = i16;
                            }
                            i14++;
                        }
                        i10 = i15;
                    }
                }
                if (i10 != -1) {
                    e4.f fVar2 = new e4.f(null, i10, string, fVar, null);
                    View.AccessibilityDelegate d10 = n1.d(view);
                    if (d10 == null) {
                        cVar = null;
                    } else if (d10 instanceof d4.a) {
                        cVar = ((d4.a) d10).f13716a;
                    } else {
                        cVar = new c(d10);
                    }
                    if (cVar == null) {
                        cVar = new c();
                    }
                    n1.n(view, cVar);
                    n1.k(view, fVar2.a());
                    n1.f(view).add(fVar2);
                    n1.h(view, 0);
                }
                sparseIntArray.put(0, i10);
            }
            if (this.I) {
                int i18 = 5;
                if (this.L != 5) {
                    n1.l(view, e4.f.f14981n, new f(this, i18));
                }
            }
            int i19 = this.L;
            int i20 = 4;
            int i21 = 3;
            if (i19 != 3) {
                if (i19 != 4) {
                    if (i19 == 6) {
                        n1.l(view, e4.f.f14980m, new f(this, i20));
                        n1.l(view, e4.f.f14979l, new f(this, i21));
                        return;
                    }
                    return;
                }
                if (this.f11170b) {
                    i12 = 3;
                }
                n1.l(view, e4.f.f14979l, new f(this, i12));
                return;
            }
            if (this.f11170b) {
                i12 = 4;
            }
            n1.l(view, e4.f.f14980m, new f(this, i12));
        }
    }

    public final void I(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.L == 3 && (this.f11195x || y() == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f11197z != z11 && this.f11180i != null) {
            this.f11197z = z11;
            float f10 = g.f34069a;
            if (z10 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z11) {
                    f10 = 1.0f;
                }
                this.B.setFloatValues(1.0f - f10, f10);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            h hVar = this.f11180i;
            if (!this.f11197z) {
                f10 = 1.0f;
            }
            hVar.o(f10);
        }
    }

    public final void J(boolean z10) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f11171b0 == null) {
                this.f11171b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.U.get() && z10) {
                this.f11171b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f11171b0 = null;
        }
    }

    public final void K() {
        View view;
        if (this.U != null) {
            s();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // o3.b
    public final void c(o3.e eVar) {
        this.U = null;
        this.M = null;
    }

    @Override // o3.b
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // o3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10;
        View view2;
        e eVar;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f11169a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference weakReference = this.V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.p(view2, x10, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f11169a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.p(view, x10, this.Z)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
            }
            if (!this.N && (eVar = this.M) != null && eVar.r(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.V;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.Z - motionEvent.getY()) <= this.M.f23956b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [h.r0, java.lang.Object, mo.d0] */
    @Override // o3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean z10;
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.b(coordinatorLayout) && !v0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.U == null) {
            this.f11178g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f11185n && !this.f11177f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f11186o || this.f11187p || this.f11188q || this.f11190s || this.f11191t || this.f11192u || z10) {
                ?? obj = new Object();
                obj.f17736b = this;
                obj.f17735a = z10;
                pn.e.e(view, obj);
            }
            n1.p(view, new ao.h(view));
            this.U = new WeakReference(view);
            h hVar = this.f11180i;
            if (hVar != null) {
                v0.q(view, hVar);
                h hVar2 = this.f11180i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = b1.i(view);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f11181j;
                if (colorStateList != null) {
                    b1.q(view, colorStateList);
                }
            }
            H();
            if (v0.c(view) == 0) {
                v0.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11175d0);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i12 = this.T;
        int i13 = i12 - height;
        int i14 = this.f11194w;
        if (i13 < i14) {
            if (this.f11189r) {
                this.R = i12;
            } else {
                this.R = i12 - i14;
            }
        }
        this.D = Math.max(0, i12 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i15 = this.L;
        if (i15 == 3) {
            view.offsetTopAndBottom(y());
        } else if (i15 == 6) {
            view.offsetTopAndBottom(this.E);
        } else if (this.I && i15 == 5) {
            view.offsetTopAndBottom(this.T);
        } else if (i15 == 4) {
            view.offsetTopAndBottom(this.G);
        } else if (i15 == 1 || i15 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        I(this.L, false);
        this.V = new WeakReference(v(view));
        while (true) {
            ArrayList arrayList = this.W;
            if (i11 >= arrayList.size()) {
                return true;
            }
            ((ao.b) arrayList.get(i11)).onLayout(view);
            i11++;
        }
    }

    @Override // o3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(x(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f11182k, marginLayoutParams.width), x(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f11183l, marginLayoutParams.height));
        return true;
    }

    @Override // o3.b
    public final boolean j(View view) {
        WeakReference weakReference = this.V;
        if (weakReference == null || view != weakReference.get() || this.L == 3) {
            return false;
        }
        return true;
    }

    @Override // o3.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        View view3;
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < y()) {
                int y10 = top - y();
                iArr[1] = y10;
                int i14 = -y10;
                WeakHashMap weakHashMap = n1.f13788a;
                view.offsetTopAndBottom(i14);
                E(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap2 = n1.f13788a;
                view.offsetTopAndBottom(-i11);
                E(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i15 = this.G;
            if (i13 > i15 && !this.I) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap weakHashMap3 = n1.f13788a;
                view.offsetTopAndBottom(i17);
                E(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i11;
                WeakHashMap weakHashMap4 = n1.f13788a;
                view.offsetTopAndBottom(-i11);
                E(1);
            }
        }
        u(view.getTop());
        this.O = i11;
        this.P = true;
    }

    @Override // o3.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // o3.b
    public final void n(View view, Parcelable parcelable) {
        ao.c cVar = (ao.c) parcelable;
        int i10 = this.f11168a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f11176e = cVar.f2648d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f11170b = cVar.f2649e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = cVar.f2650f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = cVar.f2651g;
            }
        }
        int i11 = cVar.f2647c;
        if (i11 != 1 && i11 != 2) {
            this.L = i11;
        } else {
            this.L = 4;
        }
    }

    @Override // o3.b
    public final Parcelable o(View view) {
        return new ao.c(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // o3.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r2.E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r3 - r2.D) < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.G)) goto L50;
     */
    @Override // o3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.E(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.f11170b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f11172c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.F(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.f11170b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.f11170b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.G(r4, r0, r3)
            r2.P = r3
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // o3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.M;
        if (eVar != null && (this.K || i10 == 1)) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && ((this.K || this.L == 1) && actionMasked == 2 && !this.N)) {
            float abs = Math.abs(this.Z - motionEvent.getY());
            e eVar2 = this.M;
            if (abs > eVar2.f23956b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t10 = t();
        if (this.f11170b) {
            this.G = Math.max(this.T - t10, this.D);
        } else {
            this.G = this.T - t10;
        }
    }

    public final int t() {
        int i10;
        if (this.f11177f) {
            return Math.min(Math.max(this.f11178g, this.T - ((this.S * 9) / 16)), this.R) + this.f11193v;
        }
        if (!this.f11185n && !this.f11186o && (i10 = this.f11184m) > 0) {
            return Math.max(this.f11176e, i10 + this.f11179h);
        }
        return this.f11176e + this.f11193v;
    }

    public final void u(int i10) {
        float f10;
        float f11;
        View view = (View) this.U.get();
        if (view != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != y()) {
                    int i12 = this.G;
                    f10 = i12 - i10;
                    f11 = i12 - y();
                } else {
                    int i13 = this.G;
                    f10 = i13 - i10;
                    f11 = this.T - i13;
                }
                float f12 = f10 / f11;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((ao.b) arrayList.get(i14)).onSlide(view, f12);
                }
            }
        }
    }

    public final int y() {
        int i10;
        if (this.f11170b) {
            return this.D;
        }
        int i11 = this.C;
        if (this.f11189r) {
            i10 = 0;
        } else {
            i10 = this.f11194w;
        }
        return Math.max(i11, i10);
    }

    public final int z(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(jr.h.n("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.G;
        }
        return y();
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        int i10;
        this.f11168a = 0;
        this.f11170b = true;
        this.f11182k = -1;
        this.f11183l = -1;
        this.A = new d(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        int i11 = 4;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.f11173c0 = new SparseIntArray();
        this.f11175d0 = new a(this);
        this.f11179h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.f37295f);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f11181j = dp.b.l1(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f11196y = l.c(context, attributeSet, R.attr.bottomSheetStyle, 2132083694).a();
        }
        l lVar = this.f11196y;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f11180i = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f11181j;
            if (colorStateList != null) {
                this.f11180i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11180i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g.f34069a, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new w(this, i11));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f11182k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f11183l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            C(i10);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        B(obtainStyledAttributes.getBoolean(8, false));
        this.f11185n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f11170b != z10) {
            this.f11170b = z10;
            if (this.U != null) {
                s();
            }
            E((this.f11170b && this.L == 6) ? 3 : this.L);
            I(this.L, true);
            H();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f11168a = obtainStyledAttributes.getInt(10, 0);
        A(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 != null && peekValue2.type == 16) {
            int i12 = peekValue2.data;
            if (i12 >= 0) {
                this.C = i12;
                I(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.C = dimensionPixelOffset;
                I(this.L, true);
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f11174d = obtainStyledAttributes.getInt(11, 500);
        this.f11186o = obtainStyledAttributes.getBoolean(17, false);
        this.f11187p = obtainStyledAttributes.getBoolean(18, false);
        this.f11188q = obtainStyledAttributes.getBoolean(19, false);
        this.f11189r = obtainStyledAttributes.getBoolean(20, true);
        this.f11190s = obtainStyledAttributes.getBoolean(14, false);
        this.f11191t = obtainStyledAttributes.getBoolean(15, false);
        this.f11192u = obtainStyledAttributes.getBoolean(16, false);
        this.f11195x = obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.recycle();
        this.f11172c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
