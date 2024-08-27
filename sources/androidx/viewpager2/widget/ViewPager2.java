package androidx.viewpager2.widget;

import a8.b;
import a8.d;
import a8.e;
import a8.h;
import a8.i;
import a8.j;
import a8.k;
import a8.l;
import a8.m;
import a8.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.fragment.app.f0;
import androidx.fragment.app.g0;
import d4.n1;
import d4.w0;
import h.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k7.e1;
import k7.i1;
import k7.z0;
import t.o;
import y7.a;
import z7.c;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f2509a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2510b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2511c;

    /* renamed from: d, reason: collision with root package name */
    public int f2512d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2513e;

    /* renamed from: f, reason: collision with root package name */
    public final d f2514f;

    /* renamed from: g, reason: collision with root package name */
    public final h f2515g;

    /* renamed from: h, reason: collision with root package name */
    public int f2516h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f2517i;

    /* renamed from: j, reason: collision with root package name */
    public final m f2518j;

    /* renamed from: k, reason: collision with root package name */
    public final l f2519k;

    /* renamed from: l, reason: collision with root package name */
    public final a8.c f2520l;

    /* renamed from: m, reason: collision with root package name */
    public final c f2521m;

    /* renamed from: n, reason: collision with root package name */
    public final h.c f2522n;

    /* renamed from: o, reason: collision with root package name */
    public final b f2523o;

    /* renamed from: p, reason: collision with root package name */
    public e1 f2524p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2525q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2526r;

    /* renamed from: s, reason: collision with root package name */
    public int f2527s;

    /* renamed from: t, reason: collision with root package name */
    public final j f2528t;

    /* JADX WARN: Type inference failed for: r12v19, types: [a8.b, java.lang.Object] */
    public ViewPager2(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2509a = new Rect();
        this.f2510b = new Rect();
        c cVar = new c();
        this.f2511c = cVar;
        int i10 = 0;
        this.f2513e = false;
        this.f2514f = new d(this, 0);
        this.f2516h = -1;
        this.f2524p = null;
        this.f2525q = false;
        int i11 = 1;
        this.f2526r = true;
        this.f2527s = -1;
        this.f2528t = new j(this);
        m mVar = new m(this, context);
        this.f2518j = mVar;
        WeakHashMap weakHashMap = n1.f13788a;
        mVar.setId(w0.a());
        this.f2518j.setDescendantFocusability(131072);
        h hVar = new h(this);
        this.f2515g = hVar;
        this.f2518j.setLayoutManager(hVar);
        this.f2518j.setScrollingTouchSlop(1);
        int[] iArr = a.f41293a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        n1.m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f2518j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            m mVar2 = this.f2518j;
            Object obj = new Object();
            if (mVar2.C == null) {
                mVar2.C = new ArrayList();
            }
            mVar2.C.add(obj);
            a8.c cVar2 = new a8.c(this);
            this.f2520l = cVar2;
            this.f2522n = new h.c(25, this, cVar2, this.f2518j);
            l lVar = new l(this);
            this.f2519k = lVar;
            lVar.a(this.f2518j);
            this.f2518j.j(this.f2520l);
            c cVar3 = new c();
            this.f2521m = cVar3;
            this.f2520l.f254a = cVar3;
            e eVar = new e(this, i10);
            e eVar2 = new e(this, i11);
            ((List) cVar3.f42158b).add(eVar);
            ((List) this.f2521m.f42158b).add(eVar2);
            this.f2528t.j(this.f2518j);
            ((List) this.f2521m.f42158b).add(cVar);
            ?? obj2 = new Object();
            this.f2523o = obj2;
            ((List) this.f2521m.f42158b).add(obj2);
            m mVar3 = this.f2518j;
            attachViewToParent(mVar3, 0, mVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a(i iVar) {
        ((List) this.f2511c.f42158b).add(iVar);
    }

    public final void b() {
        z0 adapter;
        boolean z10;
        if (this.f2516h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f2517i;
        if (parcelable != null) {
            if (adapter instanceof z7.e) {
                z7.e eVar = (z7.e) adapter;
                o oVar = eVar.f42168g;
                if (oVar.e()) {
                    o oVar2 = eVar.f42167f;
                    if (oVar2.e()) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(eVar.getClass().getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                oVar2.g(Long.parseLong(str.substring(2)), eVar.f42166e.E(bundle, str));
                            } else if (str.startsWith("s#") && str.length() > 2) {
                                long parseLong = Long.parseLong(str.substring(2));
                                f0 f0Var = (f0) bundle.getParcelable(str);
                                if (eVar.q(parseLong)) {
                                    oVar.g(parseLong, f0Var);
                                }
                            } else {
                                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                            }
                        }
                        if (!oVar2.e()) {
                            eVar.f42173l = true;
                            eVar.f42172k = true;
                            eVar.s();
                            Handler handler = new Handler(Looper.getMainLooper());
                            q0 q0Var = new q0(eVar, 13);
                            eVar.f42165d.a(new z7.b(handler, q0Var));
                            handler.postDelayed(q0Var, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f2517i = null;
        }
        int max = Math.max(0, Math.min(this.f2516h, adapter.a() - 1));
        this.f2512d = max;
        this.f2516h = -1;
        this.f2518j.i0(max);
        this.f2528t.o();
    }

    public final void c(int i10, boolean z10) {
        if (!((a8.c) this.f2522n.f17584c).f266m) {
            d(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f2518j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f2518j.canScrollVertically(i10);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        i iVar;
        z0 adapter = getAdapter();
        boolean z11 = false;
        if (adapter == null) {
            if (this.f2516h != -1) {
                this.f2516h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.a() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i10, 0), adapter.a() - 1);
        int i13 = this.f2512d;
        if (min == i13 && this.f2520l.f259f == 0) {
            return;
        }
        if (min == i13 && z10) {
            return;
        }
        double d10 = i13;
        this.f2512d = min;
        this.f2528t.o();
        a8.c cVar = this.f2520l;
        if (cVar.f259f != 0) {
            cVar.e();
            y6.c cVar2 = cVar.f260g;
            d10 = cVar2.f41233a + cVar2.f41234b;
        }
        a8.c cVar3 = this.f2520l;
        cVar3.getClass();
        if (z10) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        cVar3.f258e = i11;
        cVar3.f266m = false;
        if (cVar3.f262i != min) {
            z11 = true;
        }
        cVar3.f262i = min;
        cVar3.c(2);
        if (z11 && (iVar = cVar3.f254a) != null) {
            iVar.c(min);
        }
        if (!z10) {
            this.f2518j.i0(min);
            return;
        }
        double d11 = min;
        if (Math.abs(d11 - d10) > 3.0d) {
            m mVar = this.f2518j;
            if (d11 > d10) {
                i12 = min - 3;
            } else {
                i12 = min + 3;
            }
            mVar.i0(i12);
            m mVar2 = this.f2518j;
            mVar2.post(new a8.o(mVar2, min));
            return;
        }
        this.f2518j.l0(min);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i10 = ((n) parcelable).f277a;
            sparseArray.put(this.f2518j.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public final void e() {
        l lVar = this.f2519k;
        if (lVar != null) {
            View e10 = lVar.e(this.f2515g);
            if (e10 == null) {
                return;
            }
            this.f2515g.getClass();
            int H = i1.H(e10);
            if (H != this.f2512d && getScrollState() == 0) {
                this.f2521m.c(H);
            }
            this.f2513e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f2528t.getClass();
        this.f2528t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public z0 getAdapter() {
        return this.f2518j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f2512d;
    }

    public int getItemDecorationCount() {
        return this.f2518j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2527s;
    }

    public int getOrientation() {
        if (this.f2515g.f2365p == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        m mVar = this.f2518j;
        if (getOrientation() == 0) {
            height = mVar.getWidth() - mVar.getPaddingLeft();
            paddingBottom = mVar.getPaddingRight();
        } else {
            height = mVar.getHeight() - mVar.getPaddingTop();
            paddingBottom = mVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f2520l.f259f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f2528t.k(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f2518j.getMeasuredWidth();
        int measuredHeight = this.f2518j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f2509a;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f2510b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f2518j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f2513e) {
            e();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f2518j, i10, i11);
        int measuredWidth = this.f2518j.getMeasuredWidth();
        int measuredHeight = this.f2518j.getMeasuredHeight();
        int measuredState = this.f2518j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f2516h = nVar.f278b;
        this.f2517i = nVar.f279c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, a8.n] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f277a = this.f2518j.getId();
        int i10 = this.f2516h;
        if (i10 == -1) {
            i10 = this.f2512d;
        }
        baseSavedState.f278b = i10;
        Parcelable parcelable = this.f2517i;
        if (parcelable != null) {
            baseSavedState.f279c = parcelable;
        } else {
            z0 adapter = this.f2518j.getAdapter();
            if (adapter instanceof z7.e) {
                z7.e eVar = (z7.e) adapter;
                eVar.getClass();
                o oVar = eVar.f42167f;
                int i11 = oVar.i();
                o oVar2 = eVar.f42168g;
                Bundle bundle = new Bundle(oVar2.i() + i11);
                for (int i12 = 0; i12 < oVar.i(); i12++) {
                    long f10 = oVar.f(i12);
                    g0 g0Var = (g0) oVar.c(f10);
                    if (g0Var != null && g0Var.isAdded()) {
                        eVar.f42166e.S(bundle, g0Var, nn.d.j("f#", f10));
                    }
                }
                for (int i13 = 0; i13 < oVar2.i(); i13++) {
                    long f11 = oVar2.f(i13);
                    if (eVar.q(f11)) {
                        bundle.putParcelable(nn.d.j("s#", f11), (Parcelable) oVar2.c(f11));
                    }
                }
                baseSavedState.f279c = bundle;
            }
        }
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        this.f2528t.getClass();
        if (i10 != 8192 && i10 != 4096) {
            return super.performAccessibilityAction(i10, bundle);
        }
        this.f2528t.m(i10, bundle);
        return true;
    }

    public void setAdapter(z0 z0Var) {
        z0 adapter = this.f2518j.getAdapter();
        this.f2528t.i(adapter);
        d dVar = this.f2514f;
        if (adapter != null) {
            adapter.f22651a.unregisterObserver(dVar);
        }
        this.f2518j.setAdapter(z0Var);
        this.f2512d = 0;
        b();
        this.f2528t.h(z0Var);
        if (z0Var != null) {
            z0Var.o(dVar);
        }
    }

    public void setCurrentItem(int i10) {
        c(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f2528t.o();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f2527s = i10;
        this.f2518j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f2515g.g1(i10);
        this.f2528t.o();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f2525q) {
                this.f2524p = this.f2518j.getItemAnimator();
                this.f2525q = true;
            }
            this.f2518j.setItemAnimator(null);
        } else if (this.f2525q) {
            this.f2518j.setItemAnimator(this.f2524p);
            this.f2524p = null;
            this.f2525q = false;
        }
        this.f2523o.getClass();
        if (kVar == null) {
            return;
        }
        this.f2523o.getClass();
        this.f2523o.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f2526r = z10;
        this.f2528t.o();
    }
}
