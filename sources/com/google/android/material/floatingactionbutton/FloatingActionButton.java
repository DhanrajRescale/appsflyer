package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d4.n1;
import d4.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jo.a;
import ko.k;
import ko.m;
import ll.o;
import m.c0;
import m.x;
import mo.c;
import mo.e0;
import o3.b;
import o3.e;
import o3.f;
import s0.g;
import t.j0;
import to.h;
import to.j;
import to.l;
import to.w;
import vn.d;

/* loaded from: classes2.dex */
public class FloatingActionButton extends e0 implements a, w, o3.a {

    /* renamed from: b */
    public ColorStateList f11349b;

    /* renamed from: c */
    public PorterDuff.Mode f11350c;

    /* renamed from: d */
    public ColorStateList f11351d;

    /* renamed from: e */
    public PorterDuff.Mode f11352e;

    /* renamed from: f */
    public ColorStateList f11353f;

    /* renamed from: g */
    public int f11354g;

    /* renamed from: h */
    public int f11355h;

    /* renamed from: i */
    public int f11356i;

    /* renamed from: j */
    public int f11357j;

    /* renamed from: k */
    public boolean f11358k;

    /* renamed from: l */
    public final Rect f11359l;

    /* renamed from: m */
    public final Rect f11360m;

    /* renamed from: n */
    public final c0 f11361n;

    /* renamed from: o */
    public final b4.a f11362o;

    /* renamed from: p */
    public m f11363p;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends b {

        /* renamed from: a */
        public Rect f11364a;

        /* renamed from: b */
        public final boolean f11365b;

        public BaseBehavior() {
            this.f11365b = true;
        }

        @Override // o3.b
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f11359l;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // o3.b
        public final void c(e eVar) {
            if (eVar.f29551h == 0) {
                eVar.f29551h = 80;
            }
        }

        @Override // o3.b
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if ((layoutParams instanceof e) && (((e) layoutParams).f29544a instanceof BottomSheetBehavior)) {
                t(view2, floatingActionButton);
                return false;
            }
            return false;
        }

        @Override // o3.b
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList k10 = coordinatorLayout.k(floatingActionButton);
            int size = k10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) k10.get(i13);
                if (view2 instanceof AppBarLayout) {
                    if (s(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof e) && (((e) layoutParams).f29544a instanceof BottomSheetBehavior) && t(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            Rect rect = floatingActionButton.f11359l;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    floatingActionButton.offsetTopAndBottom(i12);
                }
                if (i11 != 0) {
                    WeakHashMap weakHashMap2 = n1.f13788a;
                    floatingActionButton.offsetLeftAndRight(i11);
                    return true;
                }
                return true;
            }
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            boolean z10;
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f11365b || eVar.f29549f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            if (this.f11364a == null) {
                this.f11364a = new Rect();
            }
            Rect rect = this.f11364a;
            ThreadLocal threadLocal = c.f27901a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            c.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public final boolean t(View view, FloatingActionButton floatingActionButton) {
            boolean z10;
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f11365b || eVar.f29549f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
            } else {
                floatingActionButton.f();
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, un.a.f37306q);
            this.f11365b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [b4.a, java.lang.Object] */
    public FloatingActionButton(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, 2132083696), attributeSet, R.attr.floatingActionButtonStyle);
        this.f27916a = getVisibility();
        this.f11359l = new Rect();
        this.f11360m = new Rect();
        Context context2 = getContext();
        TypedArray f10 = mo.c0.f(context2, attributeSet, un.a.f37305p, R.attr.floatingActionButtonStyle, 2132083696, new int[0]);
        this.f11349b = dp.b.l1(context2, f10, 1);
        this.f11350c = pn.e.s(f10.getInt(2, -1), null);
        this.f11353f = dp.b.l1(context2, f10, 32);
        this.f11354g = f10.getInt(7, -1);
        this.f11355h = f10.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = f10.getDimensionPixelSize(3, 0);
        float dimension = f10.getDimension(4, g.f34069a);
        float dimension2 = f10.getDimension(29, g.f34069a);
        float dimension3 = f10.getDimension(31, g.f34069a);
        this.f11358k = f10.getBoolean(36, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(f10.getDimensionPixelSize(30, 0));
        d a10 = d.a(context2, f10, 35);
        d a11 = d.a(context2, f10, 28);
        j jVar = l.f36278m;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, un.a.D, R.attr.floatingActionButtonStyle, 2132083696);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        l a12 = l.b(context2, resourceId, resourceId2, jVar).a();
        boolean z10 = f10.getBoolean(5, false);
        setEnabled(f10.getBoolean(0, true));
        f10.recycle();
        c0 c0Var = new c0(this);
        this.f11361n = c0Var;
        c0Var.f(attributeSet, R.attr.floatingActionButtonStyle);
        ?? obj = new Object();
        obj.f3157a = false;
        obj.f3158b = 0;
        obj.f3159c = this;
        this.f11362o = obj;
        getImpl().n(a12);
        getImpl().g(this.f11349b, this.f11350c, this.f11353f, dimensionPixelSize);
        getImpl().f23338k = dimensionPixelSize2;
        k impl = getImpl();
        if (impl.f23335h != dimension) {
            impl.f23335h = dimension;
            impl.k(dimension, impl.f23336i, impl.f23337j);
        }
        k impl2 = getImpl();
        if (impl2.f23336i != dimension2) {
            impl2.f23336i = dimension2;
            impl2.k(impl2.f23335h, dimension2, impl2.f23337j);
        }
        k impl3 = getImpl();
        if (impl3.f23337j != dimension3) {
            impl3.f23337j = dimension3;
            impl3.k(impl3.f23335h, impl3.f23336i, dimension3);
        }
        getImpl().f23340m = a10;
        getImpl().f23341n = a11;
        getImpl().f23333f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ko.m, ko.k] */
    private k getImpl() {
        if (this.f11363p == null) {
            this.f11363p = new k(this, new o(this, 5));
        }
        return this.f11363p;
    }

    public final int c(int i10) {
        int i11 = this.f11355h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return c(1);
        }
        return c(0);
    }

    public final void d() {
        AnimatorSet c10;
        k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f23346s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f23345r == 1) {
                return;
            }
        } else if (impl.f23345r != 2) {
            return;
        }
        Animator animator = impl.f23339l;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = n1.f13788a;
        FloatingActionButton floatingActionButton2 = impl.f23346s;
        if (y0.c(floatingActionButton2) && !floatingActionButton2.isInEditMode()) {
            d dVar = impl.f23341n;
            if (dVar != null) {
                c10 = impl.b(dVar, g.f34069a, g.f34069a, g.f34069a);
            } else {
                c10 = impl.c(g.f34069a, 0.4f, 0.4f, k.C, k.D);
            }
            c10.addListener(new ko.d(impl));
            impl.getClass();
            c10.start();
            return;
        }
        floatingActionButton.a(4, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f11351d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f11352e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(x.c(colorForState, mode));
    }

    public final void f() {
        boolean z10;
        AnimatorSet c10;
        float f10;
        float f11;
        k impl = getImpl();
        boolean z11 = true;
        if (impl.f23346s.getVisibility() != 0) {
            if (impl.f23345r == 2) {
                return;
            }
        } else if (impl.f23345r != 1) {
            return;
        }
        Animator animator = impl.f23339l;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.f23340m == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        WeakHashMap weakHashMap = n1.f13788a;
        FloatingActionButton floatingActionButton = impl.f23346s;
        if (!y0.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
            z11 = false;
        }
        Matrix matrix = impl.f23351x;
        if (z11) {
            if (floatingActionButton.getVisibility() != 0) {
                float f12 = g.f34069a;
                floatingActionButton.setAlpha(g.f34069a);
                if (z10) {
                    f10 = 0.4f;
                } else {
                    f10 = 0.0f;
                }
                floatingActionButton.setScaleY(f10);
                if (z10) {
                    f11 = 0.4f;
                } else {
                    f11 = 0.0f;
                }
                floatingActionButton.setScaleX(f11);
                if (z10) {
                    f12 = 0.4f;
                }
                impl.f23343p = f12;
                impl.a(f12, matrix);
                floatingActionButton.setImageMatrix(matrix);
            }
            d dVar = impl.f23340m;
            if (dVar != null) {
                c10 = impl.b(dVar, 1.0f, 1.0f, 1.0f);
            } else {
                c10 = impl.c(1.0f, 1.0f, 1.0f, k.A, k.B);
            }
            c10.addListener(new ko.e(impl));
            impl.getClass();
            c10.start();
            return;
        }
        floatingActionButton.a(0, false);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        impl.f23343p = 1.0f;
        impl.a(1.0f, matrix);
        floatingActionButton.setImageMatrix(matrix);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f11349b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f11350c;
    }

    @Override // o3.a
    @NonNull
    public b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f23336i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f23337j;
    }

    public Drawable getContentBackground() {
        return getImpl().f23332e;
    }

    public int getCustomSize() {
        return this.f11355h;
    }

    public int getExpandedComponentIdHint() {
        return this.f11362o.f3158b;
    }

    public d getHideMotionSpec() {
        return getImpl().f23341n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f11353f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f11353f;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        l lVar = getImpl().f23328a;
        lVar.getClass();
        return lVar;
    }

    public d getShowMotionSpec() {
        return getImpl().f23340m;
    }

    public int getSize() {
        return this.f11354g;
    }

    public int getSizeDimension() {
        return c(this.f11354g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f11351d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f11352e;
    }

    public boolean getUseCompatPadding() {
        return this.f11358k;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k impl = getImpl();
        h hVar = impl.f23329b;
        FloatingActionButton floatingActionButton = impl.f23346s;
        if (hVar != null) {
            dp.b.L1(floatingActionButton, hVar);
        }
        if (!(impl instanceof m)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.f23352y == null) {
                impl.f23352y = new f(impl, 2);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f23352y);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f23346s.getViewTreeObserver();
        f fVar = impl.f23352y;
        if (fVar != null) {
            viewTreeObserver.removeOnPreDrawListener(fVar);
            impl.f23352y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f11356i = (sizeDimension - this.f11357j) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f11359l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xo.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xo.a aVar = (xo.a) parcelable;
        super.onRestoreInstanceState(aVar.f22040a);
        Bundle bundle = (Bundle) aVar.f40537c.get("expandableWidgetHelper");
        bundle.getClass();
        b4.a aVar2 = this.f11362o;
        aVar2.getClass();
        aVar2.f3157a = bundle.getBoolean("expanded", false);
        aVar2.f3158b = bundle.getInt("expandedComponentIdHint", 0);
        if (aVar2.f3157a) {
            ViewParent parent = ((View) aVar2.f3159c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i((View) aVar2.f3159c);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        xo.a aVar = new xo.a(onSaveInstanceState);
        j0 j0Var = aVar.f40537c;
        b4.a aVar2 = this.f11362o;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", aVar2.f3157a);
        bundle.putInt("expandedComponentIdHint", aVar2.f3158b);
        j0Var.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = n1.f13788a;
            if (y0.c(this)) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.f11360m;
                rect.set(0, 0, width, height);
                int i10 = rect.left;
                Rect rect2 = this.f11359l;
                rect.left = i10 + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f11349b != colorStateList) {
            this.f11349b = colorStateList;
            k impl = getImpl();
            h hVar = impl.f23329b;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            ko.a aVar = impl.f23331d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f23293m = colorStateList.getColorForState(aVar.getState(), aVar.f23293m);
                }
                aVar.f23296p = colorStateList;
                aVar.f23294n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f11350c != mode) {
            this.f11350c = mode;
            h hVar = getImpl().f23329b;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        k impl = getImpl();
        if (impl.f23335h != f10) {
            impl.f23335h = f10;
            impl.k(f10, impl.f23336i, impl.f23337j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        k impl = getImpl();
        if (impl.f23336i != f10) {
            impl.f23336i = f10;
            impl.k(impl.f23335h, f10, impl.f23337j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        k impl = getImpl();
        if (impl.f23337j != f10) {
            impl.f23337j = f10;
            impl.k(impl.f23335h, impl.f23336i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f11355h) {
                this.f11355h = i10;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h hVar = getImpl().f23329b;
        if (hVar != null) {
            hVar.m(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f23333f) {
            getImpl().f23333f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f11362o.f3158b = i10;
    }

    public void setHideMotionSpec(d dVar) {
        getImpl().f23341n = dVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(d.b(i10, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            k impl = getImpl();
            float f10 = impl.f23343p;
            impl.f23343p = f10;
            Matrix matrix = impl.f23351x;
            impl.a(f10, matrix);
            impl.f23346s.setImageMatrix(matrix);
            if (this.f11351d != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f11361n.h(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.f11357j = i10;
        k impl = getImpl();
        if (impl.f23344q != i10) {
            impl.f23344q = i10;
            float f10 = impl.f23343p;
            impl.f23343p = f10;
            Matrix matrix = impl.f23351x;
            impl.a(f10, matrix);
            impl.f23346s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        k impl = getImpl();
        impl.f23334g = z10;
        impl.q();
    }

    @Override // to.w
    public void setShapeAppearanceModel(@NonNull l lVar) {
        getImpl().n(lVar);
    }

    public void setShowMotionSpec(d dVar) {
        getImpl().f23340m = dVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(d.b(i10, getContext()));
    }

    public void setSize(int i10) {
        this.f11355h = 0;
        if (i10 != this.f11354g) {
            this.f11354g = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f11351d != colorStateList) {
            this.f11351d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f11352e != mode) {
            this.f11352e = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f11358k != z10) {
            this.f11358k = z10;
            getImpl().i();
        }
    }

    @Override // mo.e0, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f11353f != colorStateList) {
            this.f11353f = colorStateList;
            getImpl().m(this.f11353f);
        }
    }
}
