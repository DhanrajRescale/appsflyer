package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ao.d;
import com.assetgro.stockgro.prod.R;
import d4.b1;
import d4.n1;
import d4.v0;
import d4.y0;
import e4.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l4.e;
import ll.o;
import o3.b;
import to.h;
import to.l;
import uo.a;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public final o f11410a;

    /* renamed from: b, reason: collision with root package name */
    public final h f11411b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f11412c;

    /* renamed from: d, reason: collision with root package name */
    public final l f11413d;

    /* renamed from: e, reason: collision with root package name */
    public final d f11414e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11415f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11416g;

    /* renamed from: h, reason: collision with root package name */
    public int f11417h;

    /* renamed from: i, reason: collision with root package name */
    public e f11418i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11419j;

    /* renamed from: k, reason: collision with root package name */
    public final float f11420k;

    /* renamed from: l, reason: collision with root package name */
    public int f11421l;

    /* renamed from: m, reason: collision with root package name */
    public int f11422m;

    /* renamed from: n, reason: collision with root package name */
    public int f11423n;

    /* renamed from: o, reason: collision with root package name */
    public WeakReference f11424o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f11425p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11426q;

    /* renamed from: r, reason: collision with root package name */
    public VelocityTracker f11427r;

    /* renamed from: s, reason: collision with root package name */
    public int f11428s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f11429t;

    /* renamed from: u, reason: collision with root package name */
    public final a f11430u;

    public SideSheetBehavior() {
        this.f11414e = new d(this);
        this.f11416g = true;
        this.f11417h = 5;
        this.f11420k = 0.1f;
        this.f11426q = -1;
        this.f11429t = new LinkedHashSet();
        this.f11430u = new a(this);
    }

    @Override // o3.b
    public final void c(o3.e eVar) {
        this.f11424o = null;
        this.f11418i = null;
    }

    @Override // o3.b
    public final void f() {
        this.f11424o = null;
        this.f11418i = null;
    }

    @Override // o3.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((view.isShown() || n1.e(view) != null) && this.f11416g) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 && (velocityTracker = this.f11427r) != null) {
                velocityTracker.recycle();
                this.f11427r = null;
            }
            if (this.f11427r == null) {
                this.f11427r = VelocityTracker.obtain();
            }
            this.f11427r.addMovement(motionEvent);
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.f11419j) {
                    this.f11419j = false;
                    return false;
                }
            } else {
                this.f11428s = (int) motionEvent.getX();
            }
            if (!this.f11419j && (eVar = this.f11418i) != null && eVar.r(motionEvent)) {
                return true;
            }
            return false;
        }
        this.f11419j = true;
        return false;
    }

    @Override // o3.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        int i12;
        View findViewById;
        int i13;
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.b(coordinatorLayout) && !v0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f11424o == null) {
            this.f11424o = new WeakReference(view);
            h hVar = this.f11411b;
            if (hVar != null) {
                v0.q(view, hVar);
                h hVar2 = this.f11411b;
                float f10 = this.f11415f;
                if (f10 == -1.0f) {
                    f10 = b1.i(view);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f11412c;
                if (colorStateList != null) {
                    b1.q(view, colorStateList);
                }
            }
            if (this.f11417h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            v();
            if (v0.c(view) == 0) {
                v0.s(view, 1);
            }
            if (n1.e(view) == null) {
                n1.o(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f11418i == null) {
            this.f11418i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11430u);
        }
        o oVar = this.f11410a;
        oVar.getClass();
        int left = view.getLeft() - ((SideSheetBehavior) oVar.f24937b).f11423n;
        coordinatorLayout.r(view, i10);
        this.f11422m = coordinatorLayout.getWidth();
        this.f11421l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f11410a.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f11423n = i11;
        int i15 = this.f11417h;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                if (i15 == 5) {
                    i14 = this.f11410a.h();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f11417h);
                }
            }
        } else {
            o oVar2 = this.f11410a;
            oVar2.getClass();
            i14 = left - (view.getLeft() - ((SideSheetBehavior) oVar2.f24937b).f11423n);
        }
        view.offsetLeftAndRight(i14);
        if (this.f11425p == null && (i12 = this.f11426q) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f11425p = new WeakReference(findViewById);
        }
        Iterator it = this.f11429t.iterator();
        while (it.hasNext()) {
            a3.a.u(it.next());
        }
        return true;
    }

    @Override // o3.b
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // o3.b
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((uo.b) parcelable).f37317c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f11417h = i10;
    }

    @Override // o3.b
    public final Parcelable o(View view) {
        return new uo.b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // o3.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11417h == 1 && actionMasked == 0) {
            return true;
        }
        if (t()) {
            this.f11418i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f11427r) != null) {
            velocityTracker.recycle();
            this.f11427r = null;
        }
        if (this.f11427r == null) {
            this.f11427r = VelocityTracker.obtain();
        }
        this.f11427r.addMovement(motionEvent);
        if (t() && actionMasked == 2 && !this.f11419j && t()) {
            float abs = Math.abs(this.f11428s - motionEvent.getX());
            e eVar = this.f11418i;
            if (abs > eVar.f23956b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f11419j;
    }

    public final void s(int i10) {
        View view;
        int i11;
        if (this.f11417h == i10) {
            return;
        }
        this.f11417h = i10;
        WeakReference weakReference = this.f11424o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f11417h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f11429t.iterator();
        if (!it.hasNext()) {
            v();
        } else {
            a3.a.u(it.next());
            throw null;
        }
    }

    public final boolean t() {
        return this.f11418i != null && (this.f11416g || this.f11417h == 1);
    }

    public final void u(View view, int i10, boolean z10) {
        int g10;
        o oVar = this.f11410a;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) oVar.f24937b;
        if (i10 != 3) {
            if (i10 == 5) {
                g10 = sideSheetBehavior.f11410a.h();
            } else {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(jr.h.n("Invalid state to get outer edge offset: ", i10));
            }
        } else {
            g10 = sideSheetBehavior.f11410a.g();
        }
        e eVar = ((SideSheetBehavior) oVar.f24937b).f11418i;
        if (eVar != null && (!z10 ? eVar.s(view, g10, view.getTop()) : eVar.q(g10, view.getTop()))) {
            s(2);
            this.f11414e.a(i10);
        } else {
            s(i10);
        }
    }

    public final void v() {
        View view;
        WeakReference weakReference = this.f11424o;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        n1.k(view, 262144);
        n1.h(view, 0);
        n1.k(view, 1048576);
        n1.h(view, 0);
        int i10 = 5;
        if (this.f11417h != 5) {
            n1.l(view, f.f14981n, new dj.e(this, i10));
        }
        int i11 = 3;
        if (this.f11417h != 3) {
            n1.l(view, f.f14979l, new dj.e(this, i11));
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        this.f11414e = new d(this);
        this.f11416g = true;
        this.f11417h = 5;
        this.f11420k = 0.1f;
        this.f11426q = -1;
        this.f11429t = new LinkedHashSet();
        this.f11430u = new a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.P);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f11412c = dp.b.l1(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f11413d = l.c(context, attributeSet, 0, 2132083837).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f11426q = resourceId;
            WeakReference weakReference = this.f11425p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11425p = null;
            WeakReference weakReference2 = this.f11424o;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        l lVar = this.f11413d;
        if (lVar != null) {
            h hVar = new h(lVar);
            this.f11411b = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f11412c;
            if (colorStateList != null) {
                this.f11411b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11411b.setTint(typedValue.data);
            }
        }
        this.f11415f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f11416g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f11410a == null) {
            this.f11410a = new o(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
