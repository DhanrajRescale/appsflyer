package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import c3.e;
import c4.f;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.common.api.Api;
import d4.b1;
import d4.n1;
import d4.v0;
import d4.w0;
import d4.y0;
import e4.k;
import j9.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import ll.a;
import m.f2;
import mo.c0;
import x7.b;
import yo.c;
import yo.d;
import yo.g;
import yo.h;
import yo.j;

@b
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: q0, reason: collision with root package name */
    public static final f f11439q0 = new f(16);
    public final int A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public a I;
    public final TimeInterpolator J;

    /* renamed from: a, reason: collision with root package name */
    public int f11440a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11441b;

    /* renamed from: c, reason: collision with root package name */
    public g f11442c;

    /* renamed from: d, reason: collision with root package name */
    public final yo.f f11443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11444e;

    /* renamed from: e0, reason: collision with root package name */
    public c f11445e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f11446f;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f11447f0;

    /* renamed from: g, reason: collision with root package name */
    public final int f11448g;

    /* renamed from: g0, reason: collision with root package name */
    public nc.c f11449g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f11450h;

    /* renamed from: h0, reason: collision with root package name */
    public ValueAnimator f11451h0;

    /* renamed from: i, reason: collision with root package name */
    public final int f11452i;

    /* renamed from: i0, reason: collision with root package name */
    public ViewPager f11453i0;

    /* renamed from: j, reason: collision with root package name */
    public final int f11454j;

    /* renamed from: j0, reason: collision with root package name */
    public x7.a f11455j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f11456k;

    /* renamed from: k0, reason: collision with root package name */
    public f2 f11457k0;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f11458l;

    /* renamed from: l0, reason: collision with root package name */
    public h f11459l0;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f11460m;

    /* renamed from: m0, reason: collision with root package name */
    public yo.b f11461m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f11462n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f11463o;

    /* renamed from: o0, reason: collision with root package name */
    public int f11464o0;

    /* renamed from: p, reason: collision with root package name */
    public int f11465p;

    /* renamed from: p0, reason: collision with root package name */
    public final e f11466p0;

    /* renamed from: q, reason: collision with root package name */
    public final PorterDuff.Mode f11467q;

    /* renamed from: r, reason: collision with root package name */
    public float f11468r;

    /* renamed from: s, reason: collision with root package name */
    public final float f11469s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11470t;

    /* renamed from: u, reason: collision with root package name */
    public int f11471u;

    /* renamed from: v, reason: collision with root package name */
    public final int f11472v;

    /* renamed from: w, reason: collision with root package name */
    public final int f11473w;

    /* renamed from: x, reason: collision with root package name */
    public final int f11474x;

    /* renamed from: y, reason: collision with root package name */
    public final int f11475y;

    /* renamed from: z, reason: collision with root package name */
    public int f11476z;

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.tabStyle, 2132083700), attributeSet, R.attr.tabStyle);
        this.f11440a = -1;
        this.f11441b = new ArrayList();
        this.f11456k = -1;
        this.f11465p = 0;
        this.f11471u = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.F = -1;
        this.f11447f0 = new ArrayList();
        this.f11466p0 = new e(12, 1);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        yo.f fVar = new yo.f(this, context2);
        this.f11443d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray f10 = c0.f(context2, attributeSet, un.a.T, R.attr.tabStyle, 2132083700, 24);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            to.h hVar = new to.h();
            hVar.n(ColorStateList.valueOf(colorDrawable.getColor()));
            hVar.k(context2);
            WeakHashMap weakHashMap = n1.f13788a;
            hVar.m(b1.i(this));
            v0.q(this, hVar);
        }
        setSelectedTabIndicator(dp.b.o1(context2, f10, 5));
        setSelectedTabIndicatorColor(f10.getColor(8, 0));
        fVar.b(f10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(f10.getInt(10, 0));
        setTabIndicatorAnimationMode(f10.getInt(7, 0));
        setTabIndicatorFullWidth(f10.getBoolean(9, true));
        int dimensionPixelSize = f10.getDimensionPixelSize(16, 0);
        this.f11450h = dimensionPixelSize;
        this.f11448g = dimensionPixelSize;
        this.f11446f = dimensionPixelSize;
        this.f11444e = dimensionPixelSize;
        this.f11444e = f10.getDimensionPixelSize(19, dimensionPixelSize);
        this.f11446f = f10.getDimensionPixelSize(20, dimensionPixelSize);
        this.f11448g = f10.getDimensionPixelSize(18, dimensionPixelSize);
        this.f11450h = f10.getDimensionPixelSize(17, dimensionPixelSize);
        if (pn.e.v(context2, R.attr.isMaterial3Theme, false)) {
            this.f11452i = R.attr.textAppearanceTitleSmall;
        } else {
            this.f11452i = R.attr.textAppearanceButton;
        }
        int resourceId = f10.getResourceId(24, 2132083335);
        this.f11454j = resourceId;
        int[] iArr = g.a.f16372x;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.f11468r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f11458l = dp.b.l1(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (f10.hasValue(22)) {
                this.f11456k = f10.getResourceId(22, resourceId);
            }
            int i10 = this.f11456k;
            if (i10 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i10, iArr);
                try {
                    obtainStyledAttributes.getDimensionPixelSize(0, (int) this.f11468r);
                    ColorStateList l12 = dp.b.l1(context2, obtainStyledAttributes, 3);
                    if (l12 != null) {
                        this.f11458l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{l12.getColorForState(new int[]{android.R.attr.state_selected}, l12.getDefaultColor()), this.f11458l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (f10.hasValue(25)) {
                this.f11458l = dp.b.l1(context2, f10, 25);
            }
            if (f10.hasValue(23)) {
                this.f11458l = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{f10.getColor(23, 0), this.f11458l.getDefaultColor()});
            }
            this.f11460m = dp.b.l1(context2, f10, 3);
            this.f11467q = pn.e.s(f10.getInt(4, -1), null);
            this.f11462n = dp.b.l1(context2, f10, 21);
            this.A = f10.getInt(6, 300);
            this.J = dp.b.F1(context2, R.attr.motionEasingEmphasizedInterpolator, vn.a.f38181b);
            this.f11472v = f10.getDimensionPixelSize(14, -1);
            this.f11473w = f10.getDimensionPixelSize(13, -1);
            this.f11470t = f10.getResourceId(0, 0);
            this.f11475y = f10.getDimensionPixelSize(1, 0);
            this.C = f10.getInt(15, 1);
            this.f11476z = f10.getInt(2, 0);
            this.D = f10.getBoolean(12, false);
            this.H = f10.getBoolean(26, false);
            f10.recycle();
            Resources resources = getResources();
            this.f11469s = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f11474x = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            f();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f11441b;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            g gVar = (g) arrayList.get(i10);
            if (gVar != null && gVar.f41752a != null && !TextUtils.isEmpty(gVar.f41753b)) {
                if (!this.D) {
                    return 72;
                }
            } else {
                i10++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f11472v;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.C;
        if (i11 == 0 || i11 == 2) {
            return this.f11474x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f11443d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        boolean z10;
        boolean z11;
        yo.f fVar = this.f11443d;
        int childCount = fVar.getChildCount();
        if (i10 < childCount) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = fVar.getChildAt(i11);
                boolean z12 = true;
                if ((i11 == i10 && !childAt.isSelected()) || (i11 != i10 && childAt.isSelected())) {
                    if (i11 == i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    childAt.setSelected(z11);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                    if (childAt instanceof j) {
                        ((j) childAt).f();
                    }
                } else {
                    if (i11 == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                    if (i11 != i10) {
                        z12 = false;
                    }
                    childAt.setActivated(z12);
                }
            }
        }
    }

    public final void a(c cVar) {
        ArrayList arrayList = this.f11447f0;
        if (!arrayList.contains(cVar)) {
            arrayList.add(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        d(view);
    }

    public final void b(g gVar) {
        c(gVar, this.f11441b.isEmpty());
    }

    public final void c(g gVar, boolean z10) {
        ArrayList arrayList = this.f11441b;
        int size = arrayList.size();
        if (gVar.f41757f == this) {
            gVar.f41755d = size;
            arrayList.add(size, gVar);
            int size2 = arrayList.size();
            int i10 = -1;
            for (int i11 = size + 1; i11 < size2; i11++) {
                if (((g) arrayList.get(i11)).f41755d == this.f11440a) {
                    i10 = i11;
                }
                ((g) arrayList.get(i11)).f41755d = i11;
            }
            this.f11440a = i10;
            j jVar = gVar.f41758g;
            jVar.setSelected(false);
            jVar.setActivated(false);
            int i12 = gVar.f41755d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.C == 1 && this.f11476z == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = s0.g.f34069a;
            }
            this.f11443d.addView(jVar, i12, layoutParams);
            if (z10) {
                gVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void d(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            g j10 = j();
            CharSequence charSequence = tabItem.f11436a;
            if (charSequence != null) {
                j10.b(charSequence);
            }
            Drawable drawable = tabItem.f11437b;
            if (drawable != null) {
                j10.f41752a = drawable;
                TabLayout tabLayout = j10.f41757f;
                if (tabLayout.f11476z == 1 || tabLayout.C == 2) {
                    tabLayout.q(true);
                }
                j10.c();
            }
            int i10 = tabItem.f11438c;
            if (i10 != 0) {
                j10.f41756e = LayoutInflater.from(j10.f41758g.getContext()).inflate(i10, (ViewGroup) j10.f41758g, false);
                j10.c();
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                j10.f41754c = tabItem.getContentDescription();
                j10.c();
            }
            b(j10);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void e(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (y0.c(this)) {
                yo.f fVar = this.f11443d;
                int childCount = fVar.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (fVar.getChildAt(i11).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int g10 = g(i10, s0.g.f34069a);
                if (scrollX != g10) {
                    h();
                    this.f11451h0.setIntValues(scrollX, g10);
                    this.f11451h0.start();
                }
                ValueAnimator valueAnimator = fVar.f41750a;
                if (valueAnimator != null && valueAnimator.isRunning() && fVar.f41751b.f11440a != i10) {
                    fVar.f41750a.cancel();
                }
                fVar.d(i10, this.A, true);
                return;
            }
        }
        o(i10, s0.g.f34069a, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            int r0 = r5.C
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = r2
            goto L14
        Lb:
            int r0 = r5.f11475y
            int r3 = r5.f11444e
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            java.util.WeakHashMap r3 = d4.n1.f13788a
            yo.f r3 = r5.f11443d
            d4.w0.k(r3, r0, r2, r2, r2)
            int r0 = r5.C
            java.lang.String r2 = "TabLayout"
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 == r4) goto L27
            if (r0 == r1) goto L27
            goto L4c
        L27:
            int r0 = r5.f11476z
            if (r0 != r1) goto L30
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L30:
            r3.setGravity(r4)
            goto L4c
        L34:
            int r0 = r5.f11476z
            if (r0 == 0) goto L41
            if (r0 == r4) goto L3d
            if (r0 == r1) goto L46
            goto L4c
        L3d:
            r3.setGravity(r4)
            goto L4c
        L41:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L46:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r3.setGravity(r0)
        L4c:
            r5.q(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f():void");
    }

    public final int g(int i10, float f10) {
        yo.f fVar;
        View childAt;
        View view;
        int i11 = this.C;
        int i12 = 0;
        if ((i11 != 0 && i11 != 2) || (childAt = (fVar = this.f11443d).getChildAt(i10)) == null) {
            return 0;
        }
        int i13 = i10 + 1;
        if (i13 < fVar.getChildCount()) {
            view = fVar.getChildAt(i13);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i12 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i14 = (int) ((width + i12) * 0.5f * f10);
        WeakHashMap weakHashMap = n1.f13788a;
        if (w0.d(this) == 0) {
            return left + i14;
        }
        return left - i14;
    }

    public int getSelectedTabPosition() {
        g gVar = this.f11442c;
        if (gVar != null) {
            return gVar.f41755d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f11441b.size();
    }

    public int getTabGravity() {
        return this.f11476z;
    }

    public ColorStateList getTabIconTint() {
        return this.f11460m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.G;
    }

    public int getTabIndicatorGravity() {
        return this.B;
    }

    public int getTabMaxWidth() {
        return this.f11471u;
    }

    public int getTabMode() {
        return this.C;
    }

    public ColorStateList getTabRippleColor() {
        return this.f11462n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.f11463o;
    }

    public ColorStateList getTabTextColors() {
        return this.f11458l;
    }

    public final void h() {
        if (this.f11451h0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f11451h0 = valueAnimator;
            valueAnimator.setInterpolator(this.J);
            this.f11451h0.setDuration(this.A);
            this.f11451h0.addUpdateListener(new w(this, 6));
        }
    }

    public final g i(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return (g) this.f11441b.get(i10);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yo.g, java.lang.Object] */
    public final g j() {
        j jVar;
        g gVar = (g) f11439q0.c();
        g gVar2 = gVar;
        if (gVar == null) {
            ?? obj = new Object();
            obj.f41755d = -1;
            obj.f41759h = -1;
            gVar2 = obj;
        }
        gVar2.f41757f = this;
        e eVar = this.f11466p0;
        if (eVar != null) {
            jVar = (j) eVar.c();
        } else {
            jVar = null;
        }
        if (jVar == null) {
            jVar = new j(this, getContext());
        }
        jVar.setTab(gVar2);
        jVar.setFocusable(true);
        jVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar2.f41754c)) {
            jVar.setContentDescription(gVar2.f41753b);
        } else {
            jVar.setContentDescription(gVar2.f41754c);
        }
        gVar2.f41758g = jVar;
        int i10 = gVar2.f41759h;
        if (i10 != -1) {
            jVar.setId(i10);
        }
        return gVar2;
    }

    public final void k() {
        int currentItem;
        l();
        x7.a aVar = this.f11455j0;
        if (aVar != null) {
            int c10 = aVar.c();
            for (int i10 = 0; i10 < c10; i10++) {
                g j10 = j();
                this.f11455j0.getClass();
                j10.b(null);
                c(j10, false);
            }
            ViewPager viewPager = this.f11453i0;
            if (viewPager != null && c10 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                m(i(currentItem), true);
            }
        }
    }

    public final void l() {
        yo.f fVar = this.f11443d;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            j jVar = (j) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (jVar != null) {
                jVar.setTab(null);
                jVar.setSelected(false);
                this.f11466p0.b(jVar);
            }
            requestLayout();
        }
        Iterator it = this.f11441b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.f41757f = null;
            gVar.f41758g = null;
            gVar.f41752a = null;
            gVar.f41759h = -1;
            gVar.f41753b = null;
            gVar.f41754c = null;
            gVar.f41755d = -1;
            gVar.f41756e = null;
            f11439q0.b(gVar);
        }
        this.f11442c = null;
    }

    public final void m(g gVar, boolean z10) {
        int i10;
        g gVar2 = this.f11442c;
        ArrayList arrayList = this.f11447f0;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).c(gVar);
                }
                e(gVar.f41755d);
                return;
            }
            return;
        }
        if (gVar != null) {
            i10 = gVar.f41755d;
        } else {
            i10 = -1;
        }
        if (z10) {
            if ((gVar2 == null || gVar2.f41755d == -1) && i10 != -1) {
                o(i10, s0.g.f34069a, true, true, true);
            } else {
                e(i10);
            }
            if (i10 != -1) {
                setSelectedTabView(i10);
            }
        }
        this.f11442c = gVar;
        if (gVar2 != null && gVar2.f41757f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).a(gVar2);
            }
        }
        if (gVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((c) arrayList.get(size3)).b(gVar);
            }
        }
    }

    public final void n(x7.a aVar, boolean z10) {
        f2 f2Var;
        x7.a aVar2 = this.f11455j0;
        if (aVar2 != null && (f2Var = this.f11457k0) != null) {
            aVar2.f40073a.unregisterObserver(f2Var);
        }
        this.f11455j0 = aVar;
        if (z10 && aVar != null) {
            if (this.f11457k0 == null) {
                this.f11457k0 = new f2(this, 3);
            }
            aVar.f40073a.registerObserver(this.f11457k0);
        }
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r10 == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r6, float r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            float r0 = (float) r6
            float r0 = r0 + r7
            int r1 = java.lang.Math.round(r0)
            if (r1 < 0) goto L9f
            yo.f r2 = r5.f11443d
            int r3 = r2.getChildCount()
            if (r1 < r3) goto L12
            goto L9f
        L12:
            if (r9 == 0) goto L3b
            r2.getClass()
            int r9 = java.lang.Math.round(r0)
            com.google.android.material.tabs.TabLayout r0 = r2.f41751b
            r0.f11440a = r9
            android.animation.ValueAnimator r9 = r2.f41750a
            if (r9 == 0) goto L2e
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L2e
            android.animation.ValueAnimator r9 = r2.f41750a
            r9.cancel()
        L2e:
            android.view.View r9 = r2.getChildAt(r6)
            int r0 = r6 + 1
            android.view.View r0 = r2.getChildAt(r0)
            r2.c(r9, r0, r7)
        L3b:
            android.animation.ValueAnimator r9 = r5.f11451h0
            if (r9 == 0) goto L4a
            boolean r9 = r9.isRunning()
            if (r9 == 0) goto L4a
            android.animation.ValueAnimator r9 = r5.f11451h0
            r9.cancel()
        L4a:
            int r7 = r5.g(r6, r7)
            int r9 = r5.getScrollX()
            int r0 = r5.getSelectedTabPosition()
            r2 = 0
            r3 = 1
            if (r6 >= r0) goto L5c
            if (r7 >= r9) goto L6a
        L5c:
            int r0 = r5.getSelectedTabPosition()
            if (r6 <= r0) goto L64
            if (r7 <= r9) goto L6a
        L64:
            int r0 = r5.getSelectedTabPosition()
            if (r6 != r0) goto L6c
        L6a:
            r0 = r3
            goto L6d
        L6c:
            r0 = r2
        L6d:
            java.util.WeakHashMap r4 = d4.n1.f13788a
            int r4 = d4.w0.d(r5)
            if (r4 != r3) goto L8c
            int r0 = r5.getSelectedTabPosition()
            if (r6 >= r0) goto L7d
            if (r7 <= r9) goto L94
        L7d:
            int r0 = r5.getSelectedTabPosition()
            if (r6 <= r0) goto L85
            if (r7 >= r9) goto L94
        L85:
            int r9 = r5.getSelectedTabPosition()
            if (r6 != r9) goto L8e
            goto L94
        L8c:
            if (r0 != 0) goto L94
        L8e:
            int r9 = r5.f11464o0
            if (r9 == r3) goto L94
            if (r10 == 0) goto L9a
        L94:
            if (r6 >= 0) goto L97
            r7 = r2
        L97:
            r5.scrollTo(r7, r2)
        L9a:
            if (r8 == 0) goto L9f
            r5.setSelectedTabView(r1)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.o(int, float, boolean, boolean, boolean):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dp.b.K1(this);
        if (this.f11453i0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                p((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.n0) {
            setupWithViewPager(null);
            this.n0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        j jVar;
        Drawable drawable;
        int i10 = 0;
        while (true) {
            yo.f fVar = this.f11443d;
            if (i10 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i10);
                if ((childAt instanceof j) && (drawable = (jVar = (j) childAt).f41774i) != null) {
                    drawable.setBounds(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
                    jVar.f41774i.draw(canvas);
                }
                i10++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k.e(1, getTabCount(), 1).f14993a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int round = Math.round(pn.e.f(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int i12 = this.f11473w;
            if (i12 <= 0) {
                i12 = (int) (size - pn.e.f(56, getContext()));
            }
            this.f11471u = i12;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i13 = this.C;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(ViewPager viewPager, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.f11453i0;
        if (viewPager2 != null) {
            h hVar = this.f11459l0;
            if (hVar != null && (arrayList2 = viewPager2.f2491l0) != null) {
                arrayList2.remove(hVar);
            }
            yo.b bVar = this.f11461m0;
            if (bVar != null && (arrayList = this.f11453i0.n0) != null) {
                arrayList.remove(bVar);
            }
        }
        nc.c cVar = this.f11449g0;
        if (cVar != null) {
            this.f11447f0.remove(cVar);
            this.f11449g0 = null;
        }
        if (viewPager != null) {
            this.f11453i0 = viewPager;
            if (this.f11459l0 == null) {
                this.f11459l0 = new h(this);
            }
            h hVar2 = this.f11459l0;
            hVar2.f41762c = 0;
            hVar2.f41761b = 0;
            viewPager.b(hVar2);
            nc.c cVar2 = new nc.c(viewPager, 13);
            this.f11449g0 = cVar2;
            a(cVar2);
            x7.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                n(adapter, true);
            }
            if (this.f11461m0 == null) {
                this.f11461m0 = new yo.b(this);
            }
            yo.b bVar2 = this.f11461m0;
            bVar2.f41744a = true;
            if (viewPager.n0 == null) {
                viewPager.n0 = new ArrayList();
            }
            viewPager.n0.add(bVar2);
            o(viewPager.getCurrentItem(), s0.g.f34069a, true, true, true);
        } else {
            this.f11453i0 = null;
            n(null, false);
        }
        this.n0 = z10;
    }

    public final void q(boolean z10) {
        int i10 = 0;
        while (true) {
            yo.f fVar = this.f11443d;
            if (i10 < fVar.getChildCount()) {
                View childAt = fVar.getChildAt(i10);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.C == 1 && this.f11476z == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = s0.g.f34069a;
                }
                if (z10) {
                    childAt.requestLayout();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        dp.b.I1(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            int i10 = 0;
            while (true) {
                yo.f fVar = this.f11443d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        jVar.setOrientation(!jVar.f41776k.D ? 1 : 0);
                        TextView textView = jVar.f41772g;
                        if (textView == null && jVar.f41773h == null) {
                            jVar.g(jVar.f41767b, jVar.f41768c, true);
                        } else {
                            jVar.g(textView, jVar.f41773h, false);
                        }
                    }
                    i10++;
                } else {
                    f();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        h();
        this.f11451h0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.f11463o = mutate;
        int i10 = this.f11465p;
        if (i10 != 0) {
            v3.b.g(mutate, i10);
        } else {
            v3.b.h(mutate, null);
        }
        int i11 = this.F;
        if (i11 == -1) {
            i11 = this.f11463o.getIntrinsicHeight();
        }
        this.f11443d.b(i11);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f11465p = i10;
        Drawable drawable = this.f11463o;
        if (i10 != 0) {
            v3.b.g(drawable, i10);
        } else {
            v3.b.h(drawable, null);
        }
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this.f11443d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.F = i10;
        this.f11443d.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f11476z != i10) {
            this.f11476z = i10;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f11460m != colorStateList) {
            this.f11460m = colorStateList;
            ArrayList arrayList = this.f11441b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((g) arrayList.get(i10)).c();
            }
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(r3.k.getColorStateList(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.G = i10;
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                if (i10 == 2) {
                    this.I = new yo.a(i11);
                    return;
                }
                throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
            }
            this.I = new yo.a(0);
            return;
        }
        this.I = new a(17);
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.E = z10;
        int i10 = yo.f.f41749c;
        yo.f fVar = this.f11443d;
        fVar.a(fVar.f41751b.getSelectedTabPosition());
        WeakHashMap weakHashMap = n1.f13788a;
        v0.k(fVar);
    }

    public void setTabMode(int i10) {
        if (i10 != this.C) {
            this.C = i10;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f11462n != colorStateList) {
            this.f11462n = colorStateList;
            int i10 = 0;
            while (true) {
                yo.f fVar = this.f11443d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i11 = j.f41765l;
                        ((j) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(r3.k.getColorStateList(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f11458l != colorStateList) {
            this.f11458l = colorStateList;
            ArrayList arrayList = this.f11441b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((g) arrayList.get(i10)).c();
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(x7.a aVar) {
        n(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            int i10 = 0;
            while (true) {
                yo.f fVar = this.f11443d;
                if (i10 < fVar.getChildCount()) {
                    View childAt = fVar.getChildAt(i10);
                    if (childAt instanceof j) {
                        Context context = getContext();
                        int i11 = j.f41765l;
                        ((j) childAt).e(context);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        p(viewPager, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10) {
        d(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.f11445e0;
        if (cVar2 != null) {
            this.f11447f0.remove(cVar2);
        }
        this.f11445e0 = cVar;
        if (cVar != null) {
            a(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        d(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(iu.j.m(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
