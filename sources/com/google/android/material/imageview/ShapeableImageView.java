package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import ap.a;
import dp.b;
import r3.k;
import s0.g;
import to.h;
import to.l;
import to.m;
import to.n;
import to.w;

/* loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements w {

    /* renamed from: d, reason: collision with root package name */
    public final n f11366d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f11367e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f11368f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f11369g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f11370h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f11371i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f11372j;

    /* renamed from: k, reason: collision with root package name */
    public h f11373k;

    /* renamed from: l, reason: collision with root package name */
    public l f11374l;

    /* renamed from: m, reason: collision with root package name */
    public float f11375m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f11376n;

    /* renamed from: o, reason: collision with root package name */
    public final int f11377o;

    /* renamed from: p, reason: collision with root package name */
    public final int f11378p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11379q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11380r;

    /* renamed from: s, reason: collision with root package name */
    public final int f11381s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11382t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11383u;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, 2132083955), attributeSet, 0);
        this.f11366d = m.f36291a;
        this.f11371i = new Path();
        this.f11383u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f11370h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f11367e = new RectF();
        this.f11368f = new RectF();
        this.f11376n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, un.a.O, 0, 2132083955);
        setLayerType(2, null);
        this.f11372j = b.l1(context2, obtainStyledAttributes, 9);
        this.f11375m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f11377o = dimensionPixelSize;
        this.f11378p = dimensionPixelSize;
        this.f11379q = dimensionPixelSize;
        this.f11380r = dimensionPixelSize;
        this.f11377o = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f11378p = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f11379q = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f11380r = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f11381s = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f11382t = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f11369g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f11374l = l.c(context2, attributeSet, 0, 2132083955).a();
        setOutlineProvider(new lo.a(this));
    }

    public final boolean b() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        RectF rectF = this.f11367e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        n nVar = this.f11366d;
        l lVar = this.f11374l;
        Path path = this.f11371i;
        nVar.a(lVar, 1.0f, rectF, null, path);
        Path path2 = this.f11376n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f11368f;
        rectF2.set(g.f34069a, g.f34069a, i10, i11);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f11380r;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f11382t;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (b()) {
            return this.f11377o;
        }
        return this.f11379q;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (this.f11381s != Integer.MIN_VALUE || this.f11382t != Integer.MIN_VALUE) {
            if (b() && (i11 = this.f11382t) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!b() && (i10 = this.f11381s) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f11377o;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (this.f11381s != Integer.MIN_VALUE || this.f11382t != Integer.MIN_VALUE) {
            if (b() && (i11 = this.f11381s) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!b() && (i10 = this.f11382t) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f11379q;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f11381s;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (b()) {
            return this.f11379q;
        }
        return this.f11377o;
    }

    public int getContentPaddingTop() {
        return this.f11378p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public l getShapeAppearanceModel() {
        return this.f11374l;
    }

    public ColorStateList getStrokeColor() {
        return this.f11372j;
    }

    public float getStrokeWidth() {
        return this.f11375m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f11376n, this.f11370h);
        if (this.f11372j != null) {
            Paint paint = this.f11369g;
            paint.setStrokeWidth(this.f11375m);
            int colorForState = this.f11372j.getColorForState(getDrawableState(), this.f11372j.getDefaultColor());
            if (this.f11375m > g.f34069a && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f11371i, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f11383u || !isLayoutDirectionResolved()) {
            return;
        }
        this.f11383u = true;
        if (!isPaddingRelative() && this.f11381s == Integer.MIN_VALUE && this.f11382t == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    @Override // to.w
    public void setShapeAppearanceModel(@NonNull l lVar) {
        this.f11374l = lVar;
        h hVar = this.f11373k;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f11372j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f11375m != f10) {
            this.f11375m = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
