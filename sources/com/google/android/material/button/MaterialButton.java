package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import bo.a;
import bo.c;
import d4.n1;
import d4.w0;
import dp.b;
import h4.q;
import in.i;
import iu.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ll.o;
import m.t;
import mo.c0;
import pn.e;
import r3.k;
import s0.g;
import to.l;
import to.w;

/* loaded from: classes2.dex */
public class MaterialButton extends t implements Checkable, w {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f11198r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f11199s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f11200d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f11201e;

    /* renamed from: f, reason: collision with root package name */
    public a f11202f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f11203g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f11204h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f11205i;

    /* renamed from: j, reason: collision with root package name */
    public String f11206j;

    /* renamed from: k, reason: collision with root package name */
    public int f11207k;

    /* renamed from: l, reason: collision with root package name */
    public int f11208l;

    /* renamed from: m, reason: collision with root package name */
    public int f11209m;

    /* renamed from: n, reason: collision with root package name */
    public int f11210n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11211o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11212p;

    /* renamed from: q, reason: collision with root package name */
    public int f11213q;

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        super(ap.a.a(context, attributeSet, com.assetgro.stockgro.prod.R.attr.materialButtonStyle, 2132083886), attributeSet, com.assetgro.stockgro.prod.R.attr.materialButtonStyle);
        this.f11201e = new LinkedHashSet();
        this.f11211o = false;
        this.f11212p = false;
        Context context2 = getContext();
        TypedArray f10 = c0.f(context2, attributeSet, un.a.f37312w, com.assetgro.stockgro.prod.R.attr.materialButtonStyle, 2132083886, new int[0]);
        this.f11210n = f10.getDimensionPixelSize(12, 0);
        int i10 = f10.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f11203g = e.s(i10, mode);
        this.f11204h = b.l1(getContext(), f10, 14);
        this.f11205i = b.o1(getContext(), f10, 10);
        this.f11213q = f10.getInteger(11, 1);
        this.f11207k = f10.getDimensionPixelSize(13, 0);
        c cVar = new c(this, l.c(context2, attributeSet, com.assetgro.stockgro.prod.R.attr.materialButtonStyle, 2132083886).a());
        this.f11200d = cVar;
        cVar.f7211c = f10.getDimensionPixelOffset(1, 0);
        cVar.f7212d = f10.getDimensionPixelOffset(2, 0);
        cVar.f7213e = f10.getDimensionPixelOffset(3, 0);
        cVar.f7214f = f10.getDimensionPixelOffset(4, 0);
        if (f10.hasValue(8)) {
            int dimensionPixelSize = f10.getDimensionPixelSize(8, -1);
            cVar.f7215g = dimensionPixelSize;
            i f11 = cVar.f7210b.f();
            f11.c(dimensionPixelSize);
            cVar.c(f11.a());
            cVar.f7224p = true;
        }
        cVar.f7216h = f10.getDimensionPixelSize(20, 0);
        cVar.f7217i = e.s(f10.getInt(7, -1), mode);
        cVar.f7218j = b.l1(getContext(), f10, 6);
        cVar.f7219k = b.l1(getContext(), f10, 19);
        cVar.f7220l = b.l1(getContext(), f10, 16);
        cVar.f7225q = f10.getBoolean(5, false);
        cVar.f7228t = f10.getDimensionPixelSize(9, 0);
        cVar.f7226r = f10.getBoolean(21, true);
        WeakHashMap weakHashMap = n1.f13788a;
        int f12 = w0.f(this);
        int paddingTop = getPaddingTop();
        int e10 = w0.e(this);
        int paddingBottom = getPaddingBottom();
        if (f10.hasValue(0)) {
            cVar.f7223o = true;
            setSupportBackgroundTintList(cVar.f7218j);
            setSupportBackgroundTintMode(cVar.f7217i);
        } else {
            cVar.e();
        }
        w0.k(this, f12 + cVar.f7211c, paddingTop + cVar.f7213e, e10 + cVar.f7212d, paddingBottom + cVar.f7214f);
        f10.recycle();
        setCompoundDrawablePadding(this.f11210n);
        d(this.f11205i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = g.f34069a;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public final boolean a() {
        c cVar = this.f11200d;
        if (cVar != null && cVar.f7225q) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        c cVar = this.f11200d;
        if (cVar != null && !cVar.f7223o) {
            return true;
        }
        return false;
    }

    public final void c() {
        int i10 = this.f11213q;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        }
        if (z10) {
            q.e(this, this.f11205i, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 16 || i10 == 32) {
                q.e(this, null, this.f11205i, null, null);
                return;
            }
            return;
        }
        q.e(this, null, null, this.f11205i, null);
    }

    public final void d(boolean z10) {
        Drawable drawable = this.f11205i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f11205i = mutate;
            v3.b.h(mutate, this.f11204h);
            PorterDuff.Mode mode = this.f11203g;
            if (mode != null) {
                v3.b.i(this.f11205i, mode);
            }
            int i10 = this.f11207k;
            if (i10 == 0) {
                i10 = this.f11205i.getIntrinsicWidth();
            }
            int i11 = this.f11207k;
            if (i11 == 0) {
                i11 = this.f11205i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11205i;
            int i12 = this.f11208l;
            int i13 = this.f11209m;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f11205i.setVisible(true, z10);
        }
        if (z10) {
            c();
            return;
        }
        Drawable[] a10 = q.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f11213q;
        if (((i14 == 1 || i14 == 2) && drawable3 != this.f11205i) || (((i14 == 3 || i14 == 4) && drawable5 != this.f11205i) || ((i14 == 16 || i14 == 32) && drawable4 != this.f11205i))) {
            c();
        }
    }

    public final void e(int i10, int i11) {
        boolean z10;
        boolean z11;
        if (this.f11205i != null && getLayout() != null) {
            int i12 = this.f11213q;
            boolean z12 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && i12 != 3 && i12 != 4) {
                if (i12 == 16 || i12 == 32) {
                    this.f11208l = 0;
                    if (i12 == 16) {
                        this.f11209m = 0;
                        d(false);
                        return;
                    }
                    int i13 = this.f11207k;
                    if (i13 == 0) {
                        i13 = this.f11205i.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f11210n) - getPaddingBottom()) / 2);
                    if (this.f11209m != max) {
                        this.f11209m = max;
                        d(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f11209m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f11213q;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f11207k;
                if (i15 == 0) {
                    i15 = this.f11205i.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap weakHashMap = n1.f13788a;
                int e10 = (((textLayoutWidth - w0.e(this)) - i15) - this.f11210n) - w0.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (w0.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f11213q != 4) {
                    z12 = false;
                }
                if (z11 != z12) {
                    e10 = -e10;
                }
                if (this.f11208l != e10) {
                    this.f11208l = e10;
                    d(false);
                    return;
                }
                return;
            }
            this.f11208l = 0;
            d(false);
        }
    }

    @NonNull
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f11206j)) {
            return this.f11206j;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f11200d.f7215g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11205i;
    }

    public int getIconGravity() {
        return this.f11213q;
    }

    public int getIconPadding() {
        return this.f11210n;
    }

    public int getIconSize() {
        return this.f11207k;
    }

    public ColorStateList getIconTint() {
        return this.f11204h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11203g;
    }

    public int getInsetBottom() {
        return this.f11200d.f7214f;
    }

    public int getInsetTop() {
        return this.f11200d.f7213e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f11200d.f7220l;
        }
        return null;
    }

    @NonNull
    public l getShapeAppearanceModel() {
        if (b()) {
            return this.f11200d.f7210b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f11200d.f7219k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f11200d.f7216h;
        }
        return 0;
    }

    @Override // m.t
    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.f11200d.f7218j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // m.t
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.f11200d.f7217i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11211o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            b.L1(this, this.f11200d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f11198r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f11199s);
        }
        return onCreateDrawableState;
    }

    @Override // m.t, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // m.t, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.t, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bo.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bo.b bVar = (bo.b) parcelable;
        super.onRestoreInstanceState(bVar.f22040a);
        setChecked(bVar.f7208c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, k4.b, bo.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new k4.b(super.onSaveInstanceState());
        bVar.f7208c = this.f11211o;
        return bVar;
    }

    @Override // m.t, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f11200d.f7226r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f11205i != null) {
            if (this.f11205i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f11206j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // m.t, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (b()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f11200d;
                cVar.f7223o = true;
                ColorStateList colorStateList = cVar.f7218j;
                MaterialButton materialButton = cVar.f7209a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f7217i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.t, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = j.m(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (b()) {
            this.f11200d.f7225q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f11211o != z10) {
            this.f11211o = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f11211o;
                if (!materialButtonToggleGroup.f11220f) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (this.f11212p) {
                return;
            }
            this.f11212p = true;
            Iterator it = this.f11201e.iterator();
            if (!it.hasNext()) {
                this.f11212p = false;
            } else {
                a3.a.u(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (b()) {
            c cVar = this.f11200d;
            if (!cVar.f7224p || cVar.f7215g != i10) {
                cVar.f7215g = i10;
                cVar.f7224p = true;
                i f10 = cVar.f7210b.f();
                f10.c(i10);
                cVar.c(f10.a());
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (b()) {
            this.f11200d.b(false).m(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11205i != drawable) {
            this.f11205i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f11213q != i10) {
            this.f11213q = i10;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f11210n != i10) {
            this.f11210n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = j.m(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.f11207k != i10) {
                this.f11207k = i10;
                d(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11204h != colorStateList) {
            this.f11204h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11203g != mode) {
            this.f11203g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(k.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f11200d;
        cVar.d(cVar.f7213e, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f11200d;
        cVar.d(i10, cVar.f7214f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f11202f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        a aVar = this.f11202f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((o) aVar).f24937b).invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.f7220l != colorStateList) {
                cVar.f7220l = colorStateList;
                MaterialButton materialButton = cVar.f7209a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ro.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (b()) {
            setRippleColor(k.getColorStateList(getContext(), i10));
        }
    }

    @Override // to.w
    public void setShapeAppearanceModel(@NonNull l lVar) {
        if (b()) {
            this.f11200d.c(lVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (b()) {
            c cVar = this.f11200d;
            cVar.f7222n = z10;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.f7219k != colorStateList) {
                cVar.f7219k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (b()) {
            setStrokeColor(k.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.f7216h != i10) {
                cVar.f7216h = i10;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // m.t
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.f7218j != colorStateList) {
                cVar.f7218j = colorStateList;
                if (cVar.b(false) != null) {
                    v3.b.h(cVar.b(false), cVar.f7218j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // m.t
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            c cVar = this.f11200d;
            if (cVar.f7217i != mode) {
                cVar.f7217i = mode;
                if (cVar.b(false) != null && cVar.f7217i != null) {
                    v3.b.i(cVar.b(false), cVar.f7217i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f11200d.f7226r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11211o);
    }
}
