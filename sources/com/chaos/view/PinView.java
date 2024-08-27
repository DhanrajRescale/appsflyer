package com.chaos.view;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import d4.n1;
import d4.w0;
import j9.w;
import java.util.WeakHashMap;
import m.z;
import s0.g;
import t3.i;
import t3.p;
import wk.b;
import wk.c;

/* loaded from: classes.dex */
public class PinView extends z {
    public static final InputFilter[] H = new InputFilter[0];
    public static final int[] I = {R.attr.state_selected};
    public boolean A;
    public float B;
    public int C;
    public int D;
    public int E;
    public Drawable F;
    public boolean G;

    /* renamed from: g, reason: collision with root package name */
    public final int f10843g;

    /* renamed from: h, reason: collision with root package name */
    public int f10844h;

    /* renamed from: i, reason: collision with root package name */
    public int f10845i;

    /* renamed from: j, reason: collision with root package name */
    public int f10846j;

    /* renamed from: k, reason: collision with root package name */
    public int f10847k;

    /* renamed from: l, reason: collision with root package name */
    public int f10848l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f10849m;

    /* renamed from: n, reason: collision with root package name */
    public final TextPaint f10850n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f10851o;

    /* renamed from: p, reason: collision with root package name */
    public int f10852p;

    /* renamed from: q, reason: collision with root package name */
    public int f10853q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f10854r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f10855s;

    /* renamed from: t, reason: collision with root package name */
    public final RectF f10856t;

    /* renamed from: u, reason: collision with root package name */
    public final Path f10857u;

    /* renamed from: v, reason: collision with root package name */
    public final PointF f10858v;

    /* renamed from: w, reason: collision with root package name */
    public final ValueAnimator f10859w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10860x;

    /* renamed from: y, reason: collision with root package name */
    public b f10861y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10862z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, android.view.ActionMode$Callback] */
    public PinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.assetgro.stockgro.prod.R.attr.pinViewStyle);
        TextPaint textPaint = new TextPaint();
        this.f10850n = textPaint;
        this.f10852p = -16777216;
        this.f10854r = new Rect();
        this.f10855s = new RectF();
        this.f10856t = new RectF();
        this.f10857u = new Path();
        this.f10858v = new PointF();
        this.f10860x = false;
        Resources resources = getResources();
        int i10 = 1;
        Paint paint = new Paint(1);
        this.f10849m = paint;
        paint.setStyle(Paint.Style.STROKE);
        textPaint.set(getPaint());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c.f39145a, com.assetgro.stockgro.prod.R.attr.pinViewStyle, 0);
        this.f10843g = obtainStyledAttributes.getInt(12, 0);
        this.f10844h = obtainStyledAttributes.getInt(5, 4);
        this.f10846j = (int) obtainStyledAttributes.getDimension(6, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.pv_pin_view_item_size));
        this.f10845i = (int) obtainStyledAttributes.getDimension(9, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.pv_pin_view_item_size));
        this.f10848l = obtainStyledAttributes.getDimensionPixelSize(8, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.pv_pin_view_item_spacing));
        this.f10847k = (int) obtainStyledAttributes.getDimension(7, g.f34069a);
        this.f10853q = (int) obtainStyledAttributes.getDimension(11, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.pv_pin_view_item_line_width));
        this.f10851o = obtainStyledAttributes.getColorStateList(10);
        this.f10862z = obtainStyledAttributes.getBoolean(1, true);
        this.D = obtainStyledAttributes.getColor(2, getCurrentTextColor());
        this.C = obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.pv_pin_view_cursor_width));
        this.F = obtainStyledAttributes.getDrawable(0);
        this.G = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        ColorStateList colorStateList = this.f10851o;
        if (colorStateList != null) {
            this.f10852p = colorStateList.getDefaultColor();
        }
        j();
        c();
        setMaxLength(this.f10844h);
        paint.setStrokeWidth(this.f10853q);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 1.0f);
        this.f10859w = ofFloat;
        ofFloat.setDuration(150L);
        this.f10859w.setInterpolator(new DecelerateInterpolator());
        this.f10859w.addUpdateListener(new w(this, i10));
        super.setCursorVisible(false);
        setCustomSelectionActionModeCallback(new Object());
        setLongClickable(false);
    }

    private void setMaxLength(int i10) {
        if (i10 >= 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        } else {
            setFilters(H);
        }
    }

    public final void c() {
        int i10 = this.f10843g;
        if (i10 == 1) {
            if (this.f10847k > this.f10853q / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than lineWidth when viewType is line");
            }
        } else if (i10 == 0) {
            if (this.f10847k > this.f10845i / 2.0f) {
                throw new IllegalArgumentException("The itemRadius can not be greater than itemWidth");
            }
        }
    }

    public final void d(Canvas canvas, TextPaint textPaint, CharSequence charSequence, int i10) {
        int i11 = i10 + 1;
        textPaint.getTextBounds(charSequence.toString(), i10, i11, this.f10854r);
        PointF pointF = this.f10858v;
        canvas.drawText(charSequence, i10, i11, (pointF.x - (Math.abs(r1.width()) / 2.0f)) - r1.left, ((Math.abs(r1.height()) / 2.0f) + pointF.y) - r1.bottom, textPaint);
    }

    @Override // m.z, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.f10851o;
        if (colorStateList == null || colorStateList.isStateful()) {
            i();
        }
    }

    public final TextPaint e(int i10) {
        if (this.f10860x && i10 == getText().length() - 1) {
            TextPaint textPaint = this.f10850n;
            textPaint.setColor(getPaint().getColor());
            return textPaint;
        }
        return getPaint();
    }

    public final void f(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            invalidate();
        }
    }

    public final void g() {
        if (isCursorVisible() && isFocused()) {
            if (this.f10861y == null) {
                this.f10861y = new b(this);
            }
            removeCallbacks(this.f10861y);
            this.A = false;
            postDelayed(this.f10861y, 500L);
            return;
        }
        b bVar = this.f10861y;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
    }

    public int getCurrentLineColor() {
        return this.f10852p;
    }

    public int getCursorColor() {
        return this.D;
    }

    public int getCursorWidth() {
        return this.C;
    }

    public int getItemCount() {
        return this.f10844h;
    }

    public int getItemHeight() {
        return this.f10846j;
    }

    public int getItemRadius() {
        return this.f10847k;
    }

    public int getItemSpacing() {
        return this.f10848l;
    }

    public int getItemWidth() {
        return this.f10845i;
    }

    public ColorStateList getLineColors() {
        return this.f10851o;
    }

    public int getLineWidth() {
        return this.f10853q;
    }

    public final void h() {
        RectF rectF = this.f10855s;
        this.f10858v.set((Math.abs(rectF.width()) / 2.0f) + rectF.left, (Math.abs(rectF.height()) / 2.0f) + rectF.top);
    }

    public final void i() {
        int currentTextColor;
        ColorStateList colorStateList = this.f10851o;
        if (colorStateList != null) {
            currentTextColor = colorStateList.getColorForState(getDrawableState(), 0);
        } else {
            currentTextColor = getCurrentTextColor();
        }
        if (currentTextColor != this.f10852p) {
            this.f10852p = currentTextColor;
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final boolean isCursorVisible() {
        return this.f10862z;
    }

    @Override // android.widget.TextView
    public final boolean isSuggestionsEnabled() {
        return false;
    }

    public final void j() {
        float textSize;
        float f10 = ((int) ((2.0f * getResources().getDisplayMetrics().density) + 0.5f)) * 2;
        if (this.f10846j - getTextSize() > f10) {
            textSize = getTextSize() + f10;
        } else {
            textSize = getTextSize();
        }
        this.B = textSize;
    }

    public final void k(int i10) {
        float f10 = this.f10853q / 2.0f;
        int scrollX = getScrollX();
        WeakHashMap weakHashMap = n1.f13788a;
        int f11 = w0.f(this) + scrollX;
        int i11 = this.f10848l;
        int i12 = this.f10845i;
        float f12 = ((i11 + i12) * i10) + f11 + f10;
        if (i11 == 0 && i10 > 0) {
            f12 -= this.f10853q * i10;
        }
        float paddingTop = getPaddingTop() + getScrollY() + f10;
        this.f10855s.set(f12, paddingTop, (i12 + f12) - this.f10853q, (this.f10846j + paddingTop) - this.f10853q);
    }

    public final void l(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f10848l != 0) {
            z12 = true;
            z11 = true;
        } else {
            if (i10 == 0 && i10 != this.f10844h - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == this.f10844h - 1 && i10 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z10;
        }
        RectF rectF = this.f10855s;
        int i11 = this.f10847k;
        m(rectF, i11, i11, z12, z11);
    }

    public final void m(RectF rectF, float f10, float f11, boolean z10, boolean z11) {
        Path path = this.f10857u;
        path.reset();
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = (rectF.right - f12) - (f10 * 2.0f);
        float f15 = (rectF.bottom - f13) - (2.0f * f11);
        path.moveTo(f12, f13 + f11);
        if (z10) {
            float f16 = -f11;
            path.rQuadTo(g.f34069a, f16, f10, f16);
        } else {
            path.rLineTo(g.f34069a, -f11);
            path.rLineTo(f10, g.f34069a);
        }
        path.rLineTo(f14, g.f34069a);
        if (z11) {
            path.rQuadTo(f10, g.f34069a, f10, f11);
        } else {
            path.rLineTo(f10, g.f34069a);
            path.rLineTo(g.f34069a, f11);
        }
        path.rLineTo(g.f34069a, f15);
        if (z11) {
            path.rQuadTo(g.f34069a, f11, -f10, f11);
        } else {
            path.rLineTo(g.f34069a, f11);
            path.rLineTo(-f10, g.f34069a);
        }
        path.rLineTo(-f14, g.f34069a);
        if (z10) {
            float f17 = -f10;
            path.rQuadTo(f17, g.f34069a, f17, -f11);
        } else {
            path.rLineTo(-f10, g.f34069a);
            path.rLineTo(g.f34069a, -f11);
        }
        path.rLineTo(g.f34069a, -f15);
        path.close();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f10861y;
        if (bVar != null) {
            bVar.f39143a = false;
            g();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f10861y;
        if (bVar != null) {
            if (!bVar.f39143a) {
                bVar.f39144b.removeCallbacks(bVar);
                bVar.f39143a = true;
            }
            f(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int[] iArr;
        int i10;
        Path path;
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        canvas.save();
        Paint paint = this.f10849m;
        paint.setColor(this.f10852p);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f10853q);
        getPaint().setColor(getCurrentTextColor());
        int length = getText().length();
        int i14 = 0;
        while (true) {
            int i15 = this.f10844h;
            iArr = I;
            i10 = this.f10843g;
            path = this.f10857u;
            if (i14 >= i15) {
                break;
            }
            if (isFocused() && length == i14) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ColorStateList colorStateList = this.f10851o;
                if (colorStateList != null) {
                    i12 = colorStateList.getColorForState(iArr, this.f10852p);
                } else {
                    i12 = this.f10852p;
                }
            } else {
                i12 = this.f10852p;
            }
            paint.setColor(i12);
            k(i14);
            h();
            canvas.save();
            if (i10 == 0) {
                l(i14);
                canvas.clipPath(path);
            }
            Drawable drawable = this.F;
            RectF rectF = this.f10855s;
            if (drawable != null) {
                float f10 = this.f10853q / 2.0f;
                this.F.setBounds(Math.round(rectF.left - f10), Math.round(rectF.top - f10), Math.round(rectF.right + f10), Math.round(rectF.bottom + f10));
                Drawable drawable2 = this.F;
                if (!z10) {
                    iArr = getDrawableState();
                }
                drawable2.setState(iArr);
                this.F.draw(canvas);
            }
            canvas.restore();
            PointF pointF = this.f10858v;
            if (z10 && this.A) {
                float f11 = pointF.x;
                float f12 = pointF.y - (this.B / 2.0f);
                int color = paint.getColor();
                float strokeWidth = paint.getStrokeWidth();
                paint.setColor(this.D);
                paint.setStrokeWidth(this.C);
                i13 = length;
                canvas.drawLine(f11, f12, f11, f12 + this.B, paint);
                paint.setColor(color);
                paint.setStrokeWidth(strokeWidth);
            } else {
                i13 = length;
            }
            if (i10 == 0) {
                if (!this.G || i14 >= getText().length()) {
                    canvas.drawPath(path, paint);
                }
            } else if (i10 == 1 && (!this.G || i14 >= getText().length())) {
                if (this.f10848l == 0) {
                    int i16 = this.f10844h;
                    z11 = true;
                    if (i16 > 1) {
                        if (i14 == 0) {
                            z12 = true;
                        } else if (i14 == i16 - 1) {
                            z13 = true;
                            z12 = false;
                            paint.setStyle(Paint.Style.FILL);
                            paint.setStrokeWidth(this.f10853q / 10.0f);
                            float f13 = this.f10853q / 2.0f;
                            RectF rectF2 = this.f10856t;
                            float f14 = rectF.left - f13;
                            float f15 = rectF.bottom;
                            rectF2.set(f14, f15 - f13, rectF.right + f13, f15 + f13);
                            float f16 = this.f10847k;
                            m(rectF2, f16, f16, z12, z13);
                            canvas.drawPath(path, paint);
                        } else {
                            z12 = false;
                        }
                        z13 = false;
                        paint.setStyle(Paint.Style.FILL);
                        paint.setStrokeWidth(this.f10853q / 10.0f);
                        float f132 = this.f10853q / 2.0f;
                        RectF rectF22 = this.f10856t;
                        float f142 = rectF.left - f132;
                        float f152 = rectF.bottom;
                        rectF22.set(f142, f152 - f132, rectF.right + f132, f152 + f132);
                        float f162 = this.f10847k;
                        m(rectF22, f162, f162, z12, z13);
                        canvas.drawPath(path, paint);
                    }
                } else {
                    z11 = true;
                }
                z12 = z11;
                z13 = z12;
                paint.setStyle(Paint.Style.FILL);
                paint.setStrokeWidth(this.f10853q / 10.0f);
                float f1322 = this.f10853q / 2.0f;
                RectF rectF222 = this.f10856t;
                float f1422 = rectF.left - f1322;
                float f1522 = rectF.bottom;
                rectF222.set(f1422, f1522 - f1322, rectF.right + f1322, f1522 + f1322);
                float f1622 = this.f10847k;
                m(rectF222, f1622, f1622, z12, z13);
                canvas.drawPath(path, paint);
            }
            if (getText().length() > i14) {
                int inputType = getInputType() & 4095;
                if (inputType != 129 && inputType != 225 && inputType != 18) {
                    d(canvas, e(i14), getText(), i14);
                } else {
                    TextPaint e10 = e(i14);
                    canvas.drawCircle(pointF.x, pointF.y, e10.getTextSize() / 2.0f, e10);
                }
            } else if (!TextUtils.isEmpty(getHint()) && getHint().length() == this.f10844h) {
                TextPaint e11 = e(i14);
                e11.setColor(getCurrentHintTextColor());
                d(canvas, e11, getHint(), i14);
            }
            i14++;
            length = i13;
        }
        if (isFocused() && getText().length() != this.f10844h && i10 == 0) {
            int length2 = getText().length();
            k(length2);
            h();
            l(length2);
            ColorStateList colorStateList2 = this.f10851o;
            if (colorStateList2 != null) {
                i11 = colorStateList2.getColorForState(iArr, this.f10852p);
            } else {
                i11 = this.f10852p;
            }
            paint.setColor(i11);
            if (!this.G || length2 >= getText().length()) {
                canvas.drawPath(path, paint);
            }
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            setSelection(getText().length());
            g();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = this.f10846j;
        if (mode != 1073741824) {
            int i13 = this.f10844h;
            int i14 = (i13 * this.f10845i) + ((i13 - 1) * this.f10848l);
            WeakHashMap weakHashMap = n1.f13788a;
            size = w0.f(this) + w0.e(this) + i14;
            if (this.f10848l == 0) {
                size -= (this.f10844h - 1) * this.f10853q;
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingTop() + i12 + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScreenStateChanged(int i10) {
        b bVar;
        super.onScreenStateChanged(i10);
        if (i10 != 0) {
            if (i10 == 1 && (bVar = this.f10861y) != null) {
                bVar.f39143a = false;
                g();
                return;
            }
            return;
        }
        b bVar2 = this.f10861y;
        if (bVar2 != null) {
            if (!bVar2.f39143a) {
                bVar2.f39144b.removeCallbacks(bVar2);
                bVar2.f39143a = true;
            }
            f(false);
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (i11 != getText().length()) {
            setSelection(getText().length());
        }
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ValueAnimator valueAnimator;
        if (i10 != charSequence.length()) {
            setSelection(getText().length());
        }
        g();
        if (this.f10860x && i12 - i11 > 0 && (valueAnimator = this.f10859w) != null) {
            valueAnimator.end();
            this.f10859w.start();
        }
    }

    public void setAnimationEnable(boolean z10) {
        this.f10860x = z10;
    }

    public void setCursorColor(int i10) {
        this.D = i10;
        if (isCursorVisible()) {
            f(true);
        }
    }

    @Override // android.widget.TextView
    public void setCursorVisible(boolean z10) {
        if (this.f10862z != z10) {
            this.f10862z = z10;
            f(z10);
            g();
        }
    }

    public void setCursorWidth(int i10) {
        this.C = i10;
        if (isCursorVisible()) {
            f(true);
        }
    }

    public void setHideLineWhenFilled(boolean z10) {
        this.G = z10;
    }

    public void setItemBackground(Drawable drawable) {
        this.E = 0;
        this.F = drawable;
        invalidate();
    }

    public void setItemBackgroundColor(int i10) {
        Drawable drawable = this.F;
        if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable.mutate()).setColor(i10);
            this.E = 0;
        } else {
            setItemBackground(new ColorDrawable(i10));
        }
    }

    public void setItemBackgroundResources(int i10) {
        if (i10 != 0 && this.E != i10) {
            return;
        }
        Resources resources = getResources();
        Resources.Theme theme = getContext().getTheme();
        ThreadLocal threadLocal = p.f35324a;
        Drawable a10 = i.a(resources, i10, theme);
        this.F = a10;
        setItemBackground(a10);
        this.E = i10;
    }

    public void setItemCount(int i10) {
        this.f10844h = i10;
        setMaxLength(i10);
        requestLayout();
    }

    public void setItemHeight(int i10) {
        this.f10846j = i10;
        j();
        requestLayout();
    }

    public void setItemRadius(int i10) {
        this.f10847k = i10;
        c();
        requestLayout();
    }

    public void setItemSpacing(int i10) {
        this.f10848l = i10;
        requestLayout();
    }

    public void setItemWidth(int i10) {
        this.f10845i = i10;
        c();
        requestLayout();
    }

    public void setLineColor(int i10) {
        this.f10851o = ColorStateList.valueOf(i10);
        i();
    }

    public void setLineWidth(int i10) {
        this.f10853q = i10;
        c();
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        super.setTextSize(f10);
        j();
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        super.setTypeface(typeface, i10);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        TextPaint textPaint = this.f10850n;
        if (textPaint != null) {
            textPaint.set(getPaint());
        }
    }

    public void setLineColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.f10851o = colorStateList;
        i();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        j();
    }
}
