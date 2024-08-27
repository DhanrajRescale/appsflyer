package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ap.a;
import co.c;
import dp.b;
import in.i;
import iu.j;
import mo.c0;
import pn.e;
import r3.k;
import to.h;
import to.l;
import to.w;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, w {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f11225l = {R.attr.state_checkable};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f11226m = {R.attr.state_checked};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f11227n = {com.assetgro.stockgro.prod.R.attr.state_dragged};

    /* renamed from: h, reason: collision with root package name */
    public final c f11228h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11229i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11230j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11231k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.assetgro.stockgro.prod.R.attr.materialCardViewStyle, 2132083898), attributeSet, com.assetgro.stockgro.prod.R.attr.materialCardViewStyle);
        this.f11230j = false;
        this.f11231k = false;
        this.f11229i = true;
        TypedArray f10 = c0.f(getContext(), attributeSet, un.a.A, com.assetgro.stockgro.prod.R.attr.materialCardViewStyle, 2132083898, new int[0]);
        c cVar = new c(this, attributeSet);
        this.f11228h = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        h hVar = cVar.f8293c;
        hVar.n(cardBackgroundColor);
        cVar.f8292b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.j();
        MaterialCardView materialCardView = cVar.f8291a;
        ColorStateList l12 = b.l1(materialCardView.getContext(), f10, 11);
        cVar.f8304n = l12;
        if (l12 == null) {
            cVar.f8304n = ColorStateList.valueOf(-1);
        }
        cVar.f8298h = f10.getDimensionPixelSize(12, 0);
        boolean z10 = f10.getBoolean(0, false);
        cVar.f8309s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f8302l = b.l1(materialCardView.getContext(), f10, 6);
        cVar.g(b.o1(materialCardView.getContext(), f10, 2));
        cVar.f8296f = f10.getDimensionPixelSize(5, 0);
        cVar.f8295e = f10.getDimensionPixelSize(4, 0);
        cVar.f8297g = f10.getInteger(3, 8388661);
        ColorStateList l13 = b.l1(materialCardView.getContext(), f10, 7);
        cVar.f8301k = l13;
        if (l13 == null) {
            cVar.f8301k = ColorStateList.valueOf(e.k(materialCardView, com.assetgro.stockgro.prod.R.attr.colorControlHighlight));
        }
        ColorStateList l14 = b.l1(materialCardView.getContext(), f10, 1);
        h hVar2 = cVar.f8294d;
        hVar2.n(l14 == null ? ColorStateList.valueOf(0) : l14);
        int[] iArr = ro.a.f33965a;
        RippleDrawable rippleDrawable = cVar.f8305o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f8301k);
        }
        hVar.m(materialCardView.getCardElevation());
        float f11 = cVar.f8298h;
        ColorStateList colorStateList = cVar.f8304n;
        hVar2.f36253a.f36241k = f11;
        hVar2.invalidateSelf();
        hVar2.r(colorStateList);
        materialCardView.setBackgroundInternal(cVar.d(hVar));
        Drawable c10 = materialCardView.isClickable() ? cVar.c() : hVar2;
        cVar.f8299i = c10;
        materialCardView.setForeground(cVar.d(c10));
        f10.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f11228h.f8293c.getBounds());
        return rectF;
    }

    public final void b() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.f11228h).f8305o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i10 = bounds.bottom;
            cVar.f8305o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            cVar.f8305o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f11228h.f8293c.f36253a.f36233c;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f11228h.f8294d.f36253a.f36233c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f11228h.f8300j;
    }

    public int getCheckedIconGravity() {
        return this.f11228h.f8297g;
    }

    public int getCheckedIconMargin() {
        return this.f11228h.f8295e;
    }

    public int getCheckedIconSize() {
        return this.f11228h.f8296f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f11228h.f8302l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f11228h.f8292b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f11228h.f8292b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f11228h.f8292b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f11228h.f8292b.top;
    }

    public float getProgress() {
        return this.f11228h.f8293c.f36253a.f36240j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f11228h.f8293c.i();
    }

    public ColorStateList getRippleColor() {
        return this.f11228h.f8301k;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.f11228h.f8303m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f11228h.f8304n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f11228h.f8304n;
    }

    public int getStrokeWidth() {
        return this.f11228h.f8298h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11230j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.L1(this, this.f11228h.f8293c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f11228h;
        if (cVar != null && cVar.f8309s) {
            View.mergeDrawableStates(onCreateDrawableState, f11225l);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11226m);
        }
        if (this.f11231k) {
            View.mergeDrawableStates(onCreateDrawableState, f11227n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f11228h;
        if (cVar != null && cVar.f8309s) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f11228h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f11229i) {
            c cVar = this.f11228h;
            if (!cVar.f8308r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.f8308r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f11228h.f8293c.n(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.f11228h;
        cVar.f8293c.m(cVar.f8291a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        h hVar = this.f11228h.f8294d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.n(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f11228h.f8309s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f11230j != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f11228h.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f11228h;
        if (cVar.f8297g != i10) {
            cVar.f8297g = i10;
            MaterialCardView materialCardView = cVar.f8291a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f11228h.f8295e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f11228h.f8295e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f11228h.g(j.m(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f11228h.f8296f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f11228h.f8296f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f11228h;
        cVar.f8302l = colorStateList;
        Drawable drawable = cVar.f8300j;
        if (drawable != null) {
            v3.b.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        Drawable drawable;
        super.setClickable(z10);
        c cVar = this.f11228h;
        if (cVar != null) {
            Drawable drawable2 = cVar.f8299i;
            MaterialCardView materialCardView = cVar.f8291a;
            if (materialCardView.isClickable()) {
                drawable = cVar.c();
            } else {
                drawable = cVar.f8294d;
            }
            cVar.f8299i = drawable;
            if (drawable2 != drawable) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
                } else {
                    materialCardView.setForeground(cVar.d(drawable));
                }
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.f11231k != z10) {
            this.f11231k = z10;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f11228h.k();
    }

    public void setOnCheckedChangeListener(co.a aVar) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.f11228h;
        cVar.k();
        cVar.j();
    }

    public void setProgress(float f10) {
        c cVar = this.f11228h;
        cVar.f8293c.o(f10);
        h hVar = cVar.f8294d;
        if (hVar != null) {
            hVar.o(f10);
        }
        h hVar2 = cVar.f8307q;
        if (hVar2 != null) {
            hVar2.o(f10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f10) {
        super.setRadius(f10);
        c cVar = this.f11228h;
        i f11 = cVar.f8303m.f();
        f11.c(f10);
        cVar.h(f11.a());
        cVar.f8299i.invalidateSelf();
        if (cVar.i() || (cVar.f8291a.getPreventCornerOverlap() && !cVar.f8293c.l())) {
            cVar.j();
        }
        if (cVar.i()) {
            cVar.k();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f11228h;
        cVar.f8301k = colorStateList;
        int[] iArr = ro.a.f33965a;
        RippleDrawable rippleDrawable = cVar.f8305o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateList = k.getColorStateList(getContext(), i10);
        c cVar = this.f11228h;
        cVar.f8301k = colorStateList;
        int[] iArr = ro.a.f33965a;
        RippleDrawable rippleDrawable = cVar.f8305o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // to.w
    public void setShapeAppearanceModel(@NonNull l lVar) {
        setClipToOutline(lVar.e(getBoundsAsRectF()));
        this.f11228h.h(lVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f11228h;
        if (i10 != cVar.f8298h) {
            cVar.f8298h = i10;
            h hVar = cVar.f8294d;
            ColorStateList colorStateList = cVar.f8304n;
            hVar.f36253a.f36241k = i10;
            hVar.invalidateSelf();
            hVar.r(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.f11228h;
        cVar.k();
        cVar.j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        c cVar = this.f11228h;
        if (cVar != null && cVar.f8309s && isEnabled()) {
            this.f11230j = !this.f11230j;
            refreshDrawableState();
            b();
            cVar.f(this.f11230j, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f11228h;
        if (cVar.f8304n != colorStateList) {
            cVar.f8304n = colorStateList;
            h hVar = cVar.f8294d;
            hVar.f36253a.f36241k = cVar.f8298h;
            hVar.invalidateSelf();
            hVar.r(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f11228h.f8293c.n(ColorStateList.valueOf(i10));
    }
}
