package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.prod.R;
import d4.b1;
import d4.d3;
import d4.n1;
import d4.v0;
import d4.w0;
import d4.y0;
import d4.z0;
import j9.w;
import java.util.ArrayList;
import java.util.WeakHashMap;
import mo.c0;
import r3.k;
import wn.h;
import wn.i;
import wn.j;
import wn.n;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public d3 A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11104b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f11105c;

    /* renamed from: d, reason: collision with root package name */
    public View f11106d;

    /* renamed from: e, reason: collision with root package name */
    public View f11107e;

    /* renamed from: f, reason: collision with root package name */
    public int f11108f;

    /* renamed from: g, reason: collision with root package name */
    public int f11109g;

    /* renamed from: h, reason: collision with root package name */
    public int f11110h;

    /* renamed from: i, reason: collision with root package name */
    public int f11111i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f11112j;

    /* renamed from: k, reason: collision with root package name */
    public final mo.b f11113k;

    /* renamed from: l, reason: collision with root package name */
    public final io.a f11114l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11115m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11116n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f11117o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f11118p;

    /* renamed from: q, reason: collision with root package name */
    public int f11119q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11120r;

    /* renamed from: s, reason: collision with root package name */
    public ValueAnimator f11121s;

    /* renamed from: t, reason: collision with root package name */
    public long f11122t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f11123u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f11124v;

    /* renamed from: w, reason: collision with root package name */
    public int f11125w;

    /* renamed from: x, reason: collision with root package name */
    public i f11126x;

    /* renamed from: y, reason: collision with root package name */
    public int f11127y;

    /* renamed from: z, reason: collision with root package name */
    public int f11128z;

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083695), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        int i10;
        ColorStateList l12;
        ColorStateList l13;
        TextUtils.TruncateAt truncateAt;
        this.f11103a = true;
        this.f11112j = new Rect();
        this.f11125w = -1;
        this.B = 0;
        this.D = 0;
        Context context2 = getContext();
        mo.b bVar = new mo.b(this);
        this.f11113k = bVar;
        bVar.W = vn.a.f38184e;
        bVar.i(false);
        bVar.J = false;
        this.f11114l = new io.a(context2);
        int[] iArr = un.a.f37302m;
        c0.a(context2, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083695);
        c0.b(context2, attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083695, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.collapsingToolbarLayoutStyle, 2132083695);
        int i11 = obtainStyledAttributes.getInt(4, 8388691);
        if (bVar.f27877j != i11) {
            bVar.f27877j = i11;
            bVar.i(false);
        }
        bVar.l(obtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f11111i = dimensionPixelSize;
        this.f11110h = dimensionPixelSize;
        this.f11109g = dimensionPixelSize;
        this.f11108f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(8)) {
            this.f11108f = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f11110h = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f11109g = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f11111i = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.f11115m = obtainStyledAttributes.getBoolean(20, true);
        setTitle(obtainStyledAttributes.getText(18));
        bVar.n(2132083325);
        bVar.k(2132083299);
        if (obtainStyledAttributes.hasValue(10)) {
            bVar.n(obtainStyledAttributes.getResourceId(10, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            bVar.k(obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(22)) {
            int i12 = obtainStyledAttributes.getInt(22, -1);
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 3) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                } else {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                }
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            setTitleEllipsize(truncateAt);
        }
        if (obtainStyledAttributes.hasValue(11) && bVar.f27885n != (l13 = dp.b.l1(context2, obtainStyledAttributes, 11))) {
            bVar.f27885n = l13;
            bVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(2) && bVar.f27886o != (l12 = dp.b.l1(context2, obtainStyledAttributes, 2))) {
            bVar.f27886o = l12;
            bVar.i(false);
        }
        this.f11125w = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (obtainStyledAttributes.hasValue(14) && (i10 = obtainStyledAttributes.getInt(14, 1)) != bVar.n0) {
            bVar.n0 = i10;
            Bitmap bitmap = bVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.K = null;
            }
            bVar.i(false);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            bVar.V = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(21, 0));
            bVar.i(false);
        }
        this.f11122t = obtainStyledAttributes.getInt(15, 600);
        this.f11123u = dp.b.F1(context2, R.attr.motionEasingStandardInterpolator, vn.a.f38182c);
        this.f11124v = dp.b.F1(context2, R.attr.motionEasingStandardInterpolator, vn.a.f38183d);
        setContentScrim(obtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(obtainStyledAttributes.getInt(19, 0));
        this.f11104b = obtainStyledAttributes.getResourceId(23, -1);
        this.C = obtainStyledAttributes.getBoolean(13, false);
        this.E = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        eb.f fVar = new eb.f(this, 3);
        WeakHashMap weakHashMap = n1.f13788a;
        b1.u(this, fVar);
    }

    public static n b(View view) {
        n nVar = (n) view.getTag(R.id.view_offset_helper);
        if (nVar == null) {
            n nVar2 = new n(view);
            view.setTag(R.id.view_offset_helper, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public final void a() {
        if (!this.f11103a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f11105c = null;
        this.f11106d = null;
        int i10 = this.f11104b;
        if (i10 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
            this.f11105c = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.f11106d = view;
            }
        }
        if (this.f11105c == null) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
            }
            this.f11105c = viewGroup;
        }
        c();
        this.f11103a = false;
    }

    public final void c() {
        View view;
        if (!this.f11115m && (view = this.f11107e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11107e);
            }
        }
        if (this.f11115m && this.f11105c != null) {
            if (this.f11107e == null) {
                this.f11107e = new View(getContext());
            }
            if (this.f11107e.getParent() == null) {
                this.f11105c.addView(this.f11107e, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof h;
    }

    public final void d() {
        boolean z10;
        if (this.f11117o != null || this.f11118p != null) {
            if (getHeight() + this.f11127y < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f11105c == null && (drawable = this.f11117o) != null && this.f11119q > 0) {
            drawable.mutate().setAlpha(this.f11119q);
            this.f11117o.draw(canvas);
        }
        if (this.f11115m && this.f11116n) {
            ViewGroup viewGroup = this.f11105c;
            mo.b bVar = this.f11113k;
            if (viewGroup != null && this.f11117o != null && this.f11119q > 0 && this.f11128z == 1 && bVar.f27861b < bVar.f27867e) {
                int save = canvas.save();
                canvas.clipRect(this.f11117o.getBounds(), Region.Op.DIFFERENCE);
                bVar.d(canvas);
                canvas.restoreToCount(save);
            } else {
                bVar.d(canvas);
            }
        }
        if (this.f11118p != null && this.f11119q > 0) {
            d3 d3Var = this.A;
            if (d3Var != null) {
                i10 = d3Var.d();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f11118p.setBounds(0, -this.f11127y, getWidth(), i10 - this.f11127y);
                this.f11118p.mutate().setAlpha(this.f11119q);
                this.f11118p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        View view2;
        Drawable drawable = this.f11117o;
        if (drawable != null && this.f11119q > 0 && ((view2 = this.f11106d) == null || view2 == this ? view == this.f11105c : view == view2)) {
            int width = getWidth();
            int height = getHeight();
            if (this.f11128z == 1 && view != null && this.f11115m) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.f11117o.mutate().setAlpha(this.f11119q);
            this.f11117o.draw(canvas);
            z10 = true;
        } else {
            z10 = false;
        }
        if (super.drawChild(canvas, view, j10) || z10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11118p;
        boolean z11 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = drawable.setState(drawableState);
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f11117o;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        mo.b bVar = this.f11113k;
        if (bVar != null) {
            bVar.R = drawableState;
            ColorStateList colorStateList2 = bVar.f27886o;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f27885n) != null && colorStateList.isStateful())) {
                bVar.i(false);
                z11 = true;
            }
            z10 |= z11;
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (this.f11115m && (view = this.f11107e) != null) {
            WeakHashMap weakHashMap = n1.f13788a;
            int i20 = 0;
            if (y0.b(view) && this.f11107e.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f11116n = z11;
            if (z11 || z10) {
                if (w0.d(this) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view2 = this.f11106d;
                if (view2 == null) {
                    view2 = this.f11105c;
                }
                int height = ((getHeight() - b(view2).f39349b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((h) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f11107e;
                ThreadLocal threadLocal = mo.c.f27901a;
                int width = view3.getWidth();
                int height2 = view3.getHeight();
                Rect rect = this.f11112j;
                rect.set(0, 0, width, height2);
                mo.c.b(this, view3, rect);
                ViewGroup viewGroup = this.f11105c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i20 = toolbar.getTitleMarginStart();
                    i15 = toolbar.getTitleMarginEnd();
                    i16 = toolbar.getTitleMarginTop();
                    i14 = toolbar.getTitleMarginBottom();
                } else if (viewGroup instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i20 = toolbar2.getTitleMarginStart();
                    i15 = toolbar2.getTitleMarginEnd();
                    i16 = toolbar2.getTitleMarginTop();
                    i14 = toolbar2.getTitleMarginBottom();
                } else {
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                }
                int i21 = rect.left;
                if (z12) {
                    i17 = i15;
                } else {
                    i17 = i20;
                }
                int i22 = i21 + i17;
                int i23 = rect.top + height + i16;
                int i24 = rect.right;
                if (!z12) {
                    i20 = i15;
                }
                int i25 = i24 - i20;
                int i26 = (rect.bottom + height) - i14;
                mo.b bVar = this.f11113k;
                Rect rect2 = bVar.f27873h;
                if (rect2.left != i22 || rect2.top != i23 || rect2.right != i25 || rect2.bottom != i26) {
                    rect2.set(i22, i23, i25, i26);
                    bVar.S = true;
                }
                if (z12) {
                    i18 = this.f11110h;
                } else {
                    i18 = this.f11108f;
                }
                int i27 = rect.top + this.f11109g;
                int i28 = i12 - i10;
                if (z12) {
                    i19 = this.f11108f;
                } else {
                    i19 = this.f11110h;
                }
                int i29 = i28 - i19;
                int i30 = (i13 - i11) - this.f11111i;
                Rect rect3 = bVar.f27871g;
                if (rect3.left != i18 || rect3.top != i27 || rect3.right != i29 || rect3.bottom != i30) {
                    rect3.set(i18, i27, i29, i30);
                    bVar.S = true;
                }
                bVar.i(z10);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.f11105c != null && this.f11115m && TextUtils.isEmpty(this.f11113k.G)) {
            ViewGroup viewGroup = this.f11105c;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, wn.h, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.f39332a = 0;
        layoutParams.f39333b = 0.5f;
        return layoutParams;
    }

    public int getCollapsedTitleGravity() {
        return this.f11113k.f27879k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f11113k.f27883m;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f11113k.f27897w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.f11117o;
    }

    public int getExpandedTitleGravity() {
        return this.f11113k.f27877j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f11111i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f11110h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f11108f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f11109g;
    }

    public float getExpandedTitleTextSize() {
        return this.f11113k.f27881l;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f11113k.f27900z;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.f11113k.f27891q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f11113k.f27876i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f11113k.f27876i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f11113k.f27876i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f11113k.n0;
    }

    public int getScrimAlpha() {
        return this.f11119q;
    }

    public long getScrimAnimationDuration() {
        return this.f11122t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10;
        int i11 = this.f11125w;
        if (i11 >= 0) {
            return i11 + this.B + this.D;
        }
        d3 d3Var = this.A;
        if (d3Var != null) {
            i10 = d3Var.d();
        } else {
            i10 = 0;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        int d10 = v0.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + i10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f11118p;
    }

    public CharSequence getTitle() {
        if (this.f11115m) {
            return this.f11113k.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f11128z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f11113k.V;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f11113k.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f11128z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap weakHashMap = n1.f13788a;
            setFitsSystemWindows(v0.b(appBarLayout));
            if (this.f11126x == null) {
                this.f11126x = new i(this);
            }
            appBarLayout.a(this.f11126x);
            z0.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f11113k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        i iVar = this.f11126x;
        if (iVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f11080h) != null) {
            arrayList.remove(iVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d3 d3Var = this.A;
        if (d3Var != null) {
            int d10 = d3Var.d();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap weakHashMap = n1.f13788a;
                if (!v0.b(childAt) && childAt.getTop() < d10) {
                    childAt.offsetTopAndBottom(d10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            n b10 = b(getChildAt(i15));
            View view = b10.f39348a;
            b10.f39349b = view.getTop();
            b10.f39350c = view.getLeft();
        }
        e(i10, i11, i12, i13, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        d3 d3Var = this.A;
        if (d3Var != null) {
            i12 = d3Var.d();
        } else {
            i12 = 0;
        }
        if ((mode == 0 || this.C) && i12 > 0) {
            this.B = i12;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i12, 1073741824));
        }
        if (this.E) {
            mo.b bVar = this.f11113k;
            if (bVar.n0 > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i13 = bVar.f27888p;
                if (i13 > 1) {
                    TextPaint textPaint = bVar.U;
                    textPaint.setTextSize(bVar.f27881l);
                    textPaint.setTypeface(bVar.f27900z);
                    textPaint.setLetterSpacing(bVar.f27872g0);
                    int i14 = i13 - 1;
                    this.D = i14 * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.D, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f11105c;
        if (viewGroup != null) {
            View view = this.f11106d;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight = viewGroup.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f11117o;
        if (drawable != null) {
            ViewGroup viewGroup = this.f11105c;
            if (this.f11128z == 1 && viewGroup != null && this.f11115m) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f11113k.l(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f11113k.k(i10);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        mo.b bVar = this.f11113k;
        if (bVar.f27886o != colorStateList) {
            bVar.f27886o = colorStateList;
            bVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f10) {
        mo.b bVar = this.f11113k;
        if (bVar.f27883m != f10) {
            bVar.f27883m = f10;
            bVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        mo.b bVar = this.f11113k;
        if (bVar.m(typeface)) {
            bVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f11117o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f11117o = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f11105c;
                if (this.f11128z == 1 && viewGroup != null && this.f11115m) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f11117o.setCallback(this);
                this.f11117o.setAlpha(this.f11119q);
            }
            WeakHashMap weakHashMap = n1.f13788a;
            v0.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(k.getDrawable(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        mo.b bVar = this.f11113k;
        if (bVar.f27877j != i10) {
            bVar.f27877j = i10;
            bVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f11111i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f11110h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f11108f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f11109g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f11113k.n(i10);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        mo.b bVar = this.f11113k;
        if (bVar.f27885n != colorStateList) {
            bVar.f27885n = colorStateList;
            bVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f10) {
        mo.b bVar = this.f11113k;
        if (bVar.f27881l != f10) {
            bVar.f27881l = f10;
            bVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        mo.b bVar = this.f11113k;
        if (bVar.o(typeface)) {
            bVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.E = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.C = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f11113k.f27891q0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.f11113k.f27887o0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f11113k.f27889p0 = f10;
    }

    public void setMaxLines(int i10) {
        mo.b bVar = this.f11113k;
        if (i10 != bVar.n0) {
            bVar.n0 = i10;
            Bitmap bitmap = bVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.K = null;
            }
            bVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f11113k.J = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f11119q) {
            if (this.f11117o != null && (viewGroup = this.f11105c) != null) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.k(viewGroup);
            }
            this.f11119q = i10;
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f11122t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f11125w != i10) {
            this.f11125w = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        WeakHashMap weakHashMap = n1.f13788a;
        int i10 = 0;
        if (y0.c(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f11120r != z10) {
            if (z11) {
                if (z10) {
                    i10 = 255;
                }
                a();
                ValueAnimator valueAnimator = this.f11121s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f11121s = valueAnimator2;
                    if (i10 > this.f11119q) {
                        timeInterpolator = this.f11123u;
                    } else {
                        timeInterpolator = this.f11124v;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f11121s.addUpdateListener(new w(this, 3));
                } else if (valueAnimator.isRunning()) {
                    this.f11121s.cancel();
                }
                this.f11121s.setDuration(this.f11122t);
                this.f11121s.setIntValues(this.f11119q, i10);
                this.f11121s.start();
            } else {
                if (z10) {
                    i10 = 255;
                }
                setScrimAlpha(i10);
            }
            this.f11120r = z10;
        }
    }

    public void setStaticLayoutBuilderConfigurer(j jVar) {
        mo.b bVar = this.f11113k;
        if (jVar != null) {
            bVar.i(true);
        } else {
            bVar.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f11118p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f11118p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f11118p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f11118p;
                WeakHashMap weakHashMap = n1.f13788a;
                v3.c.b(drawable4, w0.d(this));
                Drawable drawable5 = this.f11118p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f11118p.setCallback(this);
                this.f11118p.setAlpha(this.f11119q);
            }
            WeakHashMap weakHashMap2 = n1.f13788a;
            v0.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(k.getDrawable(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        mo.b bVar = this.f11113k;
        if (charSequence == null || !TextUtils.equals(bVar.G, charSequence)) {
            bVar.G = charSequence;
            bVar.H = null;
            Bitmap bitmap = bVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.K = null;
            }
            bVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        boolean z10;
        this.f11128z = i10;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11113k.f27863c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f11128z == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f11117o == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            io.a aVar = this.f11114l;
            setContentScrimColor(aVar.a(aVar.f20457d, dimension));
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        mo.b bVar = this.f11113k;
        bVar.F = truncateAt;
        bVar.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f11115m) {
            this.f11115m = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        mo.b bVar = this.f11113k;
        bVar.V = timeInterpolator;
        bVar.i(false);
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
        Drawable drawable = this.f11118p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f11118p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f11117o;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f11117o.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f11117o && drawable != this.f11118p) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wn.h, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.f39332a = 0;
        layoutParams.f39333b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.f37303n);
        layoutParams.f39332a = obtainStyledAttributes.getInt(0, 0);
        layoutParams.f39333b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wn.h, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.f39332a = 0;
        layoutParams.f39333b = 0.5f;
        return layoutParams;
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, wn.h, android.widget.FrameLayout$LayoutParams] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.f39332a = 0;
        layoutParams2.f39333b = 0.5f;
        return layoutParams2;
    }
}
