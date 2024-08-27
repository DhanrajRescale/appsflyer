package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.appbar.AppBarLayout;
import d4.b1;
import d4.d3;
import d4.n1;
import d4.v0;
import d4.w0;
import d4.x0;
import d4.y;
import d4.y0;
import iu.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import mo.c0;
import s0.g;
import t.j0;
import to.h;
import wn.k;
import wn.l;
import wn.n;
import wn.o;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements o3.a {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f11072y = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f11073a;

    /* renamed from: b, reason: collision with root package name */
    public int f11074b;

    /* renamed from: c, reason: collision with root package name */
    public int f11075c;

    /* renamed from: d, reason: collision with root package name */
    public int f11076d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11077e;

    /* renamed from: f, reason: collision with root package name */
    public int f11078f;

    /* renamed from: g, reason: collision with root package name */
    public d3 f11079g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f11080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11081i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11082j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11083k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11084l;

    /* renamed from: m, reason: collision with root package name */
    public int f11085m;

    /* renamed from: n, reason: collision with root package name */
    public WeakReference f11086n;

    /* renamed from: o, reason: collision with root package name */
    public final ColorStateList f11087o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f11088p;

    /* renamed from: q, reason: collision with root package name */
    public final wn.a f11089q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f11090r;

    /* renamed from: s, reason: collision with root package name */
    public final long f11091s;

    /* renamed from: t, reason: collision with root package name */
    public final TimeInterpolator f11092t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f11093u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f11094v;

    /* renamed from: w, reason: collision with root package name */
    public final float f11095w;

    /* renamed from: x, reason: collision with root package name */
    public Behavior f11096x;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends k {

        /* renamed from: j, reason: collision with root package name */
        public int f11097j;

        /* renamed from: k, reason: collision with root package name */
        public int f11098k;

        /* renamed from: l, reason: collision with root package name */
        public ValueAnimator f11099l;

        /* renamed from: m, reason: collision with root package name */
        public f f11100m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f11101n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f11102o;

        public BaseBehavior() {
            this.f39338f = -1;
            this.f39340h = -1;
        }

        public static void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View view;
            boolean z11;
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 < childCount) {
                    view = appBarLayout.getChildAt(i12);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    } else {
                        i12++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i13 = ((wn.f) view.getLayoutParams()).f39329a;
                if ((i13 & 1) != 0) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    int d10 = v0.d(view);
                    z11 = true;
                    if (i11 > 0) {
                    }
                }
            }
            z11 = false;
            if (appBarLayout.f11084l) {
                z11 = appBarLayout.h(z(coordinatorLayout));
            }
            boolean g10 = appBarLayout.g(z11);
            if (!z10) {
                if (g10) {
                    List list = (List) ((j0) coordinatorLayout.f1472b.f11783c).get(appBarLayout);
                    ArrayList arrayList = coordinatorLayout.f1474d;
                    arrayList.clear();
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    int size = arrayList.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        o3.b bVar = ((o3.e) ((View) arrayList.get(i14)).getLayoutParams()).f29544a;
                        if (bVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) bVar).f39345f == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        public static void y(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                        return;
                    }
                    return;
                }
                if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        public static View z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof y) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                int i13 = i11;
                int i14 = i12;
                if (i13 != i14) {
                    iArr[1] = v(coordinatorLayout, appBarLayout, u() - i10, i13, i14);
                }
            }
            if (appBarLayout.f11084l) {
                appBarLayout.g(appBarLayout.h(view));
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.appbar.f, k4.b] */
        public final f B(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z10;
            boolean z11;
            int s7 = s();
            int childCount = appBarLayout.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + s7;
                if (childAt.getTop() + s7 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = k4.b.f22039b;
                    }
                    ?? bVar = new k4.b(parcelable);
                    if (s7 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f11147d = z10;
                    if (!z10 && (-s7) >= appBarLayout.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f11146c = z11;
                    bVar.f11148e = i10;
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (bottom == appBarLayout.getTopInset() + v0.d(childAt)) {
                        z12 = true;
                    }
                    bVar.f11150g = z12;
                    bVar.f11149f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.getTopInset();
            int u10 = u() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = appBarLayout.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    wn.f fVar = (wn.f) childAt.getLayoutParams();
                    if ((fVar.f39329a & 32) == 32) {
                        top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    int i11 = -u10;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = appBarLayout.getChildAt(i10);
                wn.f fVar2 = (wn.f) childAt2.getLayoutParams();
                int i12 = fVar2.f39329a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap weakHashMap = n1.f13788a;
                        if (v0.b(appBarLayout) && v0.b(childAt2)) {
                            i13 -= appBarLayout.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        WeakHashMap weakHashMap2 = n1.f13788a;
                        i14 += v0.d(childAt2);
                    } else if ((i12 & 5) == 5) {
                        WeakHashMap weakHashMap3 = n1.f13788a;
                        int d10 = v0.d(childAt2) + i14;
                        if (u10 < d10) {
                            i13 = d10;
                        } else {
                            i14 = d10;
                        }
                    }
                    if ((i12 & 32) == 32) {
                        i13 += ((LinearLayout.LayoutParams) fVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) fVar2).bottomMargin;
                    }
                    if (u10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    x(coordinatorLayout, appBarLayout, hl.f.F(i13 + paddingTop, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            n1.k(coordinatorLayout, e4.f.f14977j.a());
            boolean z10 = false;
            n1.h(coordinatorLayout, 0);
            n1.k(coordinatorLayout, e4.f.f14978k.a());
            n1.h(coordinatorLayout, 0);
            if (appBarLayout.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    view = coordinatorLayout.getChildAt(i10);
                    if (((o3.e) view.getLayoutParams()).f29544a instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i10++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                if (((wn.f) appBarLayout.getChildAt(i11).getLayoutParams()).f39329a != 0) {
                    if (n1.d(coordinatorLayout) == null) {
                        n1.n(coordinatorLayout, new b(this));
                    }
                    boolean z11 = true;
                    if (u() != (-appBarLayout.getTotalScrollRange())) {
                        n1.l(coordinatorLayout, e4.f.f14977j, new d(appBarLayout, false));
                        z10 = true;
                    }
                    if (u() != 0) {
                        if (view2.canScrollVertically(-1)) {
                            int i12 = -appBarLayout.getDownNestedPreScrollRange();
                            if (i12 != 0) {
                                n1.l(coordinatorLayout, e4.f.f14978k, new c(this, coordinatorLayout, appBarLayout, view2, i12));
                            }
                        } else {
                            n1.l(coordinatorLayout, e4.f.f14978k, new d(appBarLayout, true));
                        }
                        this.f11102o = z11;
                        return;
                    }
                    z11 = z10;
                    this.f11102o = z11;
                    return;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r7v12, types: [wn.b] */
        @Override // wn.m, o3.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            f fVar = this.f11100m;
            if (fVar != null && (pendingAction & 8) == 0) {
                if (fVar.f11146c) {
                    w(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (fVar.f11147d) {
                    w(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(fVar.f11148e);
                    int i11 = -childAt.getBottom();
                    if (this.f11100m.f11150g) {
                        WeakHashMap weakHashMap = n1.f13788a;
                        round = appBarLayout.getTopInset() + v0.d(childAt) + i11;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f11100m.f11149f) + i11;
                    }
                    w(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        x(coordinatorLayout, appBarLayout, i12);
                    } else {
                        w(coordinatorLayout, appBarLayout, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        x(coordinatorLayout, appBarLayout, 0);
                    } else {
                        w(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f11078f = 0;
            this.f11100m = null;
            int F = hl.f.F(s(), -appBarLayout.getTotalScrollRange(), 0);
            n nVar = this.f39346a;
            if (nVar != null) {
                nVar.b(F);
            } else {
                this.f39347b = F;
            }
            E(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.e(s());
            D(coordinatorLayout, appBarLayout);
            final View z11 = z(coordinatorLayout);
            if (z11 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    z11.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: wn.b
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = z11;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.y(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    z11.setOnKeyListener(new View.OnKeyListener() { // from class: wn.c
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.y(keyEvent, z11, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // o3.b
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((o3.e) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // o3.b
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            A(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        @Override // o3.b
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = v(coordinatorLayout, appBarLayout, u() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                D(coordinatorLayout, appBarLayout);
            }
        }

        @Override // o3.b
        public final void n(View view, Parcelable parcelable) {
            if (parcelable instanceof f) {
                this.f11100m = (f) parcelable;
            } else {
                this.f11100m = null;
            }
        }

        @Override // o3.b
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            f B = B(absSavedState, (AppBarLayout) view);
            if (B != null) {
                return B;
            }
            return absSavedState;
        }

        @Override // o3.b
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            boolean z10;
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if ((i10 & 2) != 0 && (appBarLayout.f11084l || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (valueAnimator = this.f11099l) != null) {
                valueAnimator.cancel();
            }
            this.f11101n = null;
            this.f11098k = i11;
            return z10;
        }

        @Override // o3.b
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f11098k == 0 || i10 == 1) {
                C(coordinatorLayout, appBarLayout);
                if (appBarLayout.f11084l) {
                    appBarLayout.g(appBarLayout.h(view2));
                }
            }
            this.f11101n = new WeakReference(view2);
        }

        @Override // wn.k
        public final int u() {
            return s() + this.f11097j;
        }

        @Override // wn.k
        public final int v(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            boolean z10;
            int i14;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int u10 = u();
            int i15 = 0;
            if (i11 != 0 && u10 >= i11 && u10 <= i12) {
                int F = hl.f.F(i10, i11, i12);
                if (u10 != F) {
                    if (appBarLayout.f11077e) {
                        int abs = Math.abs(F);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            wn.f fVar = (wn.f) childAt.getLayoutParams();
                            Interpolator interpolator = fVar.f39331c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i17 = fVar.f39329a;
                                    if ((i17 & 1) != 0) {
                                        i14 = childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                                        if ((i17 & 2) != 0) {
                                            WeakHashMap weakHashMap = n1.f13788a;
                                            i14 -= v0.d(childAt);
                                        }
                                    } else {
                                        i14 = 0;
                                    }
                                    WeakHashMap weakHashMap2 = n1.f13788a;
                                    if (v0.b(childAt)) {
                                        i14 -= appBarLayout.getTopInset();
                                    }
                                    if (i14 > 0) {
                                        float f10 = i14;
                                        i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(F);
                                    }
                                }
                            } else {
                                i16++;
                            }
                        }
                    }
                    i13 = F;
                    n nVar = this.f39346a;
                    if (nVar != null) {
                        z10 = nVar.b(i13);
                    } else {
                        this.f39347b = i13;
                        z10 = false;
                    }
                    int i18 = u10 - F;
                    this.f11097j = F - i13;
                    int i19 = 1;
                    if (z10) {
                        for (int i20 = 0; i20 < appBarLayout.getChildCount(); i20++) {
                            wn.f fVar2 = (wn.f) appBarLayout.getChildAt(i20).getLayoutParams();
                            wn.e eVar = fVar2.f39330b;
                            if (eVar != null && (fVar2.f39329a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i20);
                                float s7 = s();
                                Rect rect = (Rect) eVar.f39327b;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((Rect) eVar.f39327b).top - Math.abs(s7);
                                if (abs2 <= g.f34069a) {
                                    float E = 1.0f - hl.f.E(Math.abs(abs2 / ((Rect) eVar.f39327b).height()), g.f34069a, 1.0f);
                                    float height = (-abs2) - ((((Rect) eVar.f39327b).height() * 0.3f) * (1.0f - (E * E)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect((Rect) eVar.f39328c);
                                    ((Rect) eVar.f39328c).offset(0, (int) (-height));
                                    Rect rect2 = (Rect) eVar.f39328c;
                                    WeakHashMap weakHashMap3 = n1.f13788a;
                                    x0.c(childAt2, rect2);
                                } else {
                                    WeakHashMap weakHashMap4 = n1.f13788a;
                                    x0.c(childAt2, null);
                                    childAt2.setTranslationY(g.f34069a);
                                }
                            }
                        }
                    }
                    if (!z10 && appBarLayout.f11077e) {
                        coordinatorLayout.i(appBarLayout);
                    }
                    appBarLayout.e(s());
                    if (F < u10) {
                        i19 = -1;
                    }
                    E(coordinatorLayout, appBarLayout, F, i19, false);
                    i15 = i18;
                }
            } else {
                this.f11097j = 0;
            }
            D(coordinatorLayout, appBarLayout);
            return i15;
        }

        public final void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int height;
            int abs = Math.abs(u() - i10);
            float abs2 = Math.abs(g.f34069a);
            if (abs2 > g.f34069a) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int u10 = u();
            if (u10 == i10) {
                ValueAnimator valueAnimator = this.f11099l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f11099l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f11099l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11099l = valueAnimator3;
                valueAnimator3.setInterpolator(vn.a.f38184e);
                this.f11099l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f11099l.setDuration(Math.min(height, 600));
            this.f11099l.setIntValues(u10, i10);
            this.f11099l.start();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            this.f39338f = -1;
            this.f39340h = -1;
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends l {
        public ScrollingViewBehavior() {
        }

        public static AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // o3.b
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // o3.b
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            o3.b bVar = ((o3.e) view2.getLayoutParams()).f29544a;
            if (bVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) bVar).f11097j) + this.f39344e) - u(view2);
                WeakHashMap weakHashMap = n1.f13788a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f11084l) {
                    appBarLayout.g(appBarLayout.h(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // o3.b
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                n1.k(coordinatorLayout, e4.f.f14977j.a());
                n1.h(coordinatorLayout, 0);
                n1.k(coordinatorLayout, e4.f.f14978k.a());
                n1.h(coordinatorLayout, 0);
                n1.n(coordinatorLayout, null);
            }
        }

        @Override // o3.b
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout v10 = v(coordinatorLayout.k(view));
            if (v10 != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f39342c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    v10.f(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.M);
            this.f39345f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [wn.a] */
    /* JADX WARN: Type inference failed for: r0v31, types: [wn.a] */
    public AppBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.appBarLayoutStyle, 2132083692), attributeSet, R.attr.appBarLayoutStyle);
        int i10;
        this.f11074b = -1;
        this.f11075c = -1;
        this.f11076d = -1;
        final int i11 = 0;
        this.f11078f = 0;
        this.f11090r = new ArrayList();
        Context context2 = getContext();
        final int i12 = 1;
        setOrientation(1);
        int i13 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray f10 = c0.f(context3, attributeSet, o.f39352a, R.attr.appBarLayoutStyle, 2132083692, new int[0]);
        try {
            if (f10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, f10.getResourceId(0, 0)));
            }
            f10.recycle();
            TypedArray f11 = c0.f(context2, attributeSet, un.a.f37290a, R.attr.appBarLayoutStyle, 2132083692, new int[0]);
            Drawable drawable = f11.getDrawable(0);
            WeakHashMap weakHashMap = n1.f13788a;
            v0.q(this, drawable);
            ColorStateList l12 = dp.b.l1(context2, f11, 6);
            this.f11087o = l12;
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                final h hVar = new h();
                hVar.n(ColorStateList.valueOf(colorDrawable.getColor()));
                if (l12 != null) {
                    if (this.f11083k) {
                        i10 = 255;
                    } else {
                        i10 = 0;
                    }
                    hVar.setAlpha(i10);
                    hVar.n(l12);
                    this.f11089q = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wn.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppBarLayout f39317b;

                        {
                            this.f39317b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i14 = i11;
                            to.h hVar2 = hVar;
                            AppBarLayout appBarLayout = this.f39317b;
                            switch (i14) {
                                case 0:
                                    int i15 = AppBarLayout.f11072y;
                                    appBarLayout.getClass();
                                    int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    hVar2.setAlpha(floatValue);
                                    Iterator it = appBarLayout.f11090r.iterator();
                                    while (it.hasNext()) {
                                        a3.a.u(it.next());
                                        ColorStateList colorStateList = hVar2.f36253a.f36233c;
                                        if (colorStateList != null) {
                                            colorStateList.withAlpha(floatValue).getDefaultColor();
                                            throw null;
                                        }
                                    }
                                    return;
                                default:
                                    int i16 = AppBarLayout.f11072y;
                                    appBarLayout.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    hVar2.m(floatValue2);
                                    Drawable drawable2 = appBarLayout.f11094v;
                                    if (drawable2 instanceof to.h) {
                                        ((to.h) drawable2).m(floatValue2);
                                    }
                                    Iterator it2 = appBarLayout.f11090r.iterator();
                                    if (!it2.hasNext()) {
                                        return;
                                    }
                                    a3.a.u(it2.next());
                                    throw null;
                            }
                        }
                    };
                } else {
                    hVar.k(context2);
                    this.f11089q = new ValueAnimator.AnimatorUpdateListener(this) { // from class: wn.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AppBarLayout f39317b;

                        {
                            this.f39317b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i14 = i12;
                            to.h hVar2 = hVar;
                            AppBarLayout appBarLayout = this.f39317b;
                            switch (i14) {
                                case 0:
                                    int i15 = AppBarLayout.f11072y;
                                    appBarLayout.getClass();
                                    int floatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    hVar2.setAlpha(floatValue);
                                    Iterator it = appBarLayout.f11090r.iterator();
                                    while (it.hasNext()) {
                                        a3.a.u(it.next());
                                        ColorStateList colorStateList = hVar2.f36253a.f36233c;
                                        if (colorStateList != null) {
                                            colorStateList.withAlpha(floatValue).getDefaultColor();
                                            throw null;
                                        }
                                    }
                                    return;
                                default:
                                    int i16 = AppBarLayout.f11072y;
                                    appBarLayout.getClass();
                                    float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    hVar2.m(floatValue2);
                                    Drawable drawable2 = appBarLayout.f11094v;
                                    if (drawable2 instanceof to.h) {
                                        ((to.h) drawable2).m(floatValue2);
                                    }
                                    Iterator it2 = appBarLayout.f11090r.iterator();
                                    if (!it2.hasNext()) {
                                        return;
                                    }
                                    a3.a.u(it2.next());
                                    throw null;
                            }
                        }
                    };
                }
                v0.q(this, hVar);
            }
            this.f11091s = dp.b.E1(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f11092t = dp.b.F1(context2, R.attr.motionEasingStandardInterpolator, vn.a.f38180a);
            if (f11.hasValue(4)) {
                f(f11.getBoolean(4, false), false, false);
            }
            if (f11.hasValue(3)) {
                o.a(this, f11.getDimensionPixelSize(3, 0));
            }
            int i14 = 2;
            if (i13 >= 26) {
                if (f11.hasValue(2)) {
                    setKeyboardNavigationCluster(f11.getBoolean(2, false));
                }
                if (f11.hasValue(1)) {
                    setTouchscreenBlocksFocus(f11.getBoolean(1, false));
                }
            }
            this.f11095w = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f11084l = f11.getBoolean(5, false);
            this.f11085m = f11.getResourceId(7, -1);
            setStatusBarForeground(f11.getDrawable(8));
            f11.recycle();
            b1.u(this, new eb.f(this, i14));
        } catch (Throwable th2) {
            f10.recycle();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wn.f, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [wn.f, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wn.f, android.widget.LinearLayout$LayoutParams] */
    public static wn.f c(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ?? layoutParams2 = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
            layoutParams2.f39329a = 1;
            return layoutParams2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? layoutParams3 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams3.f39329a = 1;
            return layoutParams3;
        }
        ?? layoutParams4 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams4.f39329a = 1;
        return layoutParams4;
    }

    public final void a(wn.g gVar) {
        if (this.f11080h == null) {
            this.f11080h = new ArrayList();
        }
        if (gVar != null && !this.f11080h.contains(gVar)) {
            this.f11080h.add(gVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wn.f, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wn.f generateLayoutParams(AttributeSet attributeSet) {
        wn.e eVar;
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.f39329a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.f37291b);
        layoutParams.f39329a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            eVar = null;
        } else {
            eVar = new wn.e(0);
        }
        layoutParams.f39330b = eVar;
        if (obtainStyledAttributes.hasValue(2)) {
            layoutParams.f39331c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wn.f;
    }

    public final void d() {
        f fVar;
        Behavior behavior = this.f11096x;
        if (behavior != null && this.f11074b != -1 && this.f11078f == 0) {
            fVar = behavior.B(k4.b.f22039b, this);
        } else {
            fVar = null;
        }
        this.f11074b = -1;
        this.f11075c = -1;
        this.f11076d = -1;
        if (fVar != null) {
            Behavior behavior2 = this.f11096x;
            if (behavior2.f11100m == null) {
                behavior2.f11100m = fVar;
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f11094v != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(g.f34069a, -this.f11073a);
            this.f11094v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11094v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(int i10) {
        this.f11073a = i10;
        if (!willNotDraw()) {
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
        ArrayList arrayList = this.f11080h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                wn.d dVar = (wn.d) this.f11080h.get(i11);
                if (dVar != null) {
                    dVar.a(this, i10);
                }
            }
        }
    }

    public final void f(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i12 = 0;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i10 | i11;
        if (z12) {
            i12 = 8;
        }
        this.f11078f = i13 | i12;
        requestLayout();
    }

    public final boolean g(boolean z10) {
        float f10;
        float f11;
        if ((!this.f11081i) && this.f11083k != z10) {
            this.f11083k = z10;
            refreshDrawableState();
            if (!this.f11084l || !(getBackground() instanceof h)) {
                return true;
            }
            ColorStateList colorStateList = this.f11087o;
            float f12 = g.f34069a;
            if (colorStateList != null) {
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 255.0f;
                }
                if (z10) {
                    f12 = 255.0f;
                }
                j(f11, f12);
                return true;
            }
            float f13 = this.f11095w;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = f13;
            }
            if (z10) {
                f12 = f13;
            }
            j(f10, f12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, wn.f, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f39329a = 1;
        return layoutParams;
    }

    @Override // o3.a
    @NonNull
    public o3.b getBehavior() {
        Behavior behavior = new Behavior();
        this.f11096x = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f11075c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            wn.f r4 = (wn.f) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f39329a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = d4.n1.f13788a
            int r4 = d4.v0.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = d4.n1.f13788a
            int r4 = d4.v0.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = d4.n1.f13788a
            boolean r3 = d4.v0.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f11075c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f11076d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                wn.f fVar = (wn.f) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = fVar.f39329a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    i12 -= v0.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f11076d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f11085m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap weakHashMap = n1.f13788a;
        int d10 = v0.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = v0.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f11078f;
    }

    public Drawable getStatusBarForeground() {
        return this.f11094v;
    }

    @Deprecated
    public float getTargetElevation() {
        return g.f34069a;
    }

    public final int getTopInset() {
        d3 d3Var = this.f11079g;
        if (d3Var != null) {
            return d3Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f11074b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                wn.f fVar = (wn.f) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = fVar.f39329a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (v0.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap weakHashMap2 = n1.f13788a;
                    i12 -= v0.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f11074b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f11086n == null && (i10 = this.f11085m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f11085m);
            }
            if (view2 != null) {
                this.f11086n = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f11086n;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        if (v0.b(childAt)) {
            return false;
        }
        return true;
    }

    public final void j(float f10, float f11) {
        ValueAnimator valueAnimator = this.f11088p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f11088p = ofFloat;
        ofFloat.setDuration(this.f11091s);
        this.f11088p.setInterpolator(this.f11092t);
        wn.a aVar = this.f11089q;
        if (aVar != null) {
            this.f11088p.addUpdateListener(aVar);
        }
        this.f11088p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp.b.K1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f11093u == null) {
            this.f11093u = new int[4];
        }
        int[] iArr = this.f11093u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f11082j;
        if (z10) {
            i11 = R.attr.state_liftable;
        } else {
            i11 = -2130969871;
        }
        iArr[0] = i11;
        if (z10 && this.f11083k) {
            i12 = R.attr.state_lifted;
        } else {
            i12 = -2130969872;
        }
        iArr[1] = i12;
        if (z10) {
            i13 = R.attr.state_collapsible;
        } else {
            i13 = -2130969867;
        }
        iArr[2] = i13;
        if (z10 && this.f11083k) {
            i14 = R.attr.state_collapsed;
        } else {
            i14 = -2130969866;
        }
        iArr[3] = i14;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f11086n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11086n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap weakHashMap = n1.f13788a;
        boolean z11 = true;
        if (v0.b(this) && i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        d();
        this.f11077e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((wn.f) getChildAt(i14).getLayoutParams()).f39331c != null) {
                this.f11077e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.f11094v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f11081i) {
            if (!this.f11084l) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((wn.f) getChildAt(i15).getLayoutParams()).f39329a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            break;
                        } else {
                            i15++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
            }
            if (this.f11082j != z11) {
                this.f11082j = z11;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (v0.b(this) && i()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = hl.f.F(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        dp.b.I1(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap weakHashMap = n1.f13788a;
        f(z10, y0.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f11084l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f11085m = -1;
        if (view == null) {
            WeakReference weakReference = this.f11086n;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11086n = null;
            return;
        }
        this.f11086n = new WeakReference(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f11085m = i10;
        WeakReference weakReference = this.f11086n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11086n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f11081i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f11094v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f11094v = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f11094v.setState(getDrawableState());
                }
                Drawable drawable4 = this.f11094v;
                WeakHashMap weakHashMap = n1.f13788a;
                v3.c.b(drawable4, w0.d(this));
                Drawable drawable5 = this.f11094v;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f11094v.setCallback(this);
            }
            if (this.f11094v != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(true ^ z11);
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(j.m(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        o.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f11094v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f11094v) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wn.f, android.widget.LinearLayout$LayoutParams] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.f39329a = 1;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return c(layoutParams);
    }
}
