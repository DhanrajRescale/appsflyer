package s;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f34008a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f34009b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f34010c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f34011d;

    /* renamed from: e, reason: collision with root package name */
    public float f34012e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f34015h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f34016i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f34017j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34013f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34014g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f34018k = PorterDuff.Mode.SRC_IN;

    public a(float f10, ColorStateList colorStateList) {
        this.f34008a = f10;
        Paint paint = new Paint(5);
        this.f34009b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f34015h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f34015h.getDefaultColor()));
        this.f34010c = new RectF();
        this.f34011d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f34010c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f34011d;
        rect2.set(rect);
        if (this.f34013f) {
            rect2.inset((int) Math.ceil(b.a(this.f34012e, this.f34008a, this.f34014g)), (int) Math.ceil(b.b(this.f34012e, this.f34008a, this.f34014g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f34009b;
        if (this.f34016i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f34016i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f34010c;
        float f10 = this.f34008a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f34011d, this.f34008a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f34017j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f34015h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f34015h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f34009b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f34017j;
        if (colorStateList2 != null && (mode = this.f34018k) != null) {
            this.f34016i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f34009b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34009b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34017j = colorStateList;
        this.f34016i = a(colorStateList, this.f34018k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f34018k = mode;
        this.f34016i = a(this.f34017j, mode);
        invalidateSelf();
    }
}
