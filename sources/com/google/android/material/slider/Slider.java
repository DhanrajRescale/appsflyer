package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import in.i;
import java.util.Iterator;
import r3.k;
import s0.g;
import to.h;
import vl.b;
import vo.c;
import vo.d;

/* loaded from: classes2.dex */
public class Slider extends c {
    public Slider(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, g.f34069a));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f38207f0;
    }

    public int getFocusedThumbIndex() {
        return this.f38209g0;
    }

    public int getHaloRadius() {
        return this.D;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f38226p0;
    }

    public int getLabelBehavior() {
        return this.f38245z;
    }

    public float getStepSize() {
        return this.f38211h0;
    }

    public float getThumbElevation() {
        return this.f38236u0.f36253a.f36244n;
    }

    public int getThumbRadius() {
        return this.C;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f38236u0.f36253a.f36234d;
    }

    public float getThumbStrokeWidth() {
        return this.f38236u0.f36253a.f36241k;
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f38236u0.f36253a.f36233c;
    }

    public int getTickActiveRadius() {
        return this.f38217k0;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f38228q0;
    }

    public int getTickInactiveRadius() {
        return this.f38219l0;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f38230r0;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f38230r0.equals(this.f38228q0)) {
            return this.f38228q0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f38232s0;
    }

    public int getTrackHeight() {
        return this.A;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f38234t0;
    }

    public int getTrackSidePadding() {
        return this.B;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f38234t0.equals(this.f38232s0)) {
            return this.f38232s0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f38221m0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // vo.c
    public float getValueFrom() {
        return this.I;
    }

    @Override // vo.c
    public float getValueTo() {
        return this.J;
    }

    public void setCustomThumbDrawable(int i10) {
        setCustomThumbDrawable(getResources().getDrawable(i10));
    }

    @Override // vo.c, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setFocusedThumbIndex(int i10) {
        if (i10 >= 0 && i10 < this.f38205e0.size()) {
            this.f38209g0 = i10;
            this.f38208g.w(i10);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    @Override // vo.c
    public void setHaloRadius(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            Drawable background = getBackground();
            if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
                ((RippleDrawable) background).setRadius(this.D);
            } else {
                postInvalidate();
            }
        }
    }

    public void setHaloRadiusResource(int i10) {
        setHaloRadius(getResources().getDimensionPixelSize(i10));
    }

    @Override // vo.c
    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f38226p0)) {
            this.f38226p0 = colorStateList;
            Drawable background = getBackground();
            if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
                ((RippleDrawable) background).setColor(colorStateList);
                return;
            }
            Paint paint = this.f38203d;
            paint.setColor(f(colorStateList));
            paint.setAlpha(63);
            invalidate();
        }
    }

    @Override // vo.c
    public void setLabelBehavior(int i10) {
        if (this.f38245z != i10) {
            this.f38245z = i10;
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(d dVar) {
    }

    public void setStepSize(float f10) {
        if (f10 >= g.f34069a) {
            if (this.f38211h0 != f10) {
                this.f38211h0 = f10;
                this.f38224o0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f10), Float.valueOf(this.I), Float.valueOf(this.J)));
    }

    @Override // vo.c
    public void setThumbElevation(float f10) {
        this.f38236u0.m(f10);
    }

    public void setThumbElevationResource(int i10) {
        setThumbElevation(getResources().getDimension(i10));
    }

    @Override // vo.c
    public void setThumbRadius(int i10) {
        if (i10 != this.C) {
            this.C = i10;
            h hVar = this.f38236u0;
            i iVar = new i(1);
            float f10 = this.C;
            b c12 = dp.b.c1(0);
            iVar.f20162a = c12;
            i.b(c12);
            iVar.f20163b = c12;
            i.b(c12);
            iVar.f20164c = c12;
            i.b(c12);
            iVar.f20165d = c12;
            i.b(c12);
            iVar.c(f10);
            hVar.setShapeAppearanceModel(iVar.a());
            int i11 = this.C * 2;
            hVar.setBounds(0, 0, i11, i11);
            Drawable drawable = this.f38238v0;
            if (drawable != null) {
                a(drawable);
            }
            Iterator it = this.f38240w0.iterator();
            while (it.hasNext()) {
                a((Drawable) it.next());
            }
            u();
        }
    }

    public void setThumbRadiusResource(int i10) {
        setThumbRadius(getResources().getDimensionPixelSize(i10));
    }

    @Override // vo.c
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f38236u0.r(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeColor(k.getColorStateList(getContext(), i10));
        }
    }

    @Override // vo.c
    public void setThumbStrokeWidth(float f10) {
        h hVar = this.f38236u0;
        hVar.f36253a.f36241k = f10;
        hVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i10) {
        if (i10 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i10));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        h hVar = this.f38236u0;
        if (!colorStateList.equals(hVar.f36253a.f36233c)) {
            hVar.n(colorStateList);
            invalidate();
        }
    }

    @Override // vo.c
    public void setTickActiveRadius(int i10) {
        if (this.f38217k0 != i10) {
            this.f38217k0 = i10;
            this.f38206f.setStrokeWidth(i10 * 2);
            u();
        }
    }

    @Override // vo.c
    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f38228q0)) {
            this.f38228q0 = colorStateList;
            this.f38206f.setColor(f(colorStateList));
            invalidate();
        }
    }

    @Override // vo.c
    public void setTickInactiveRadius(int i10) {
        if (this.f38219l0 != i10) {
            this.f38219l0 = i10;
            this.f38204e.setStrokeWidth(i10 * 2);
            u();
        }
    }

    @Override // vo.c
    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f38230r0)) {
            this.f38230r0 = colorStateList;
            this.f38204e.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z10) {
        if (this.f38215j0 != z10) {
            this.f38215j0 = z10;
            postInvalidate();
        }
    }

    @Override // vo.c
    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f38232s0)) {
            this.f38232s0 = colorStateList;
            this.f38201b.setColor(f(colorStateList));
            invalidate();
        }
    }

    @Override // vo.c
    public void setTrackHeight(int i10) {
        if (this.A != i10) {
            this.A = i10;
            this.f38200a.setStrokeWidth(i10);
            this.f38201b.setStrokeWidth(this.A);
            u();
        }
    }

    @Override // vo.c
    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f38234t0)) {
            this.f38234t0 = colorStateList;
            this.f38200a.setColor(f(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f10) {
        setValues(Float.valueOf(f10));
    }

    public void setValueFrom(float f10) {
        this.I = f10;
        this.f38224o0 = true;
        postInvalidate();
    }

    public void setValueTo(float f10) {
        this.J = f10;
        this.f38224o0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        a(newDrawable);
        this.f38238v0 = newDrawable;
        this.f38240w0.clear();
        postInvalidate();
    }
}
