package ko;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import to.n;

/* loaded from: classes2.dex */
public final class a extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f23282b;

    /* renamed from: h, reason: collision with root package name */
    public float f23288h;

    /* renamed from: i, reason: collision with root package name */
    public int f23289i;

    /* renamed from: j, reason: collision with root package name */
    public int f23290j;

    /* renamed from: k, reason: collision with root package name */
    public int f23291k;

    /* renamed from: l, reason: collision with root package name */
    public int f23292l;

    /* renamed from: m, reason: collision with root package name */
    public int f23293m;

    /* renamed from: o, reason: collision with root package name */
    public to.l f23295o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f23296p;

    /* renamed from: a, reason: collision with root package name */
    public final n f23281a = to.m.f36291a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f23283c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f23284d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f23285e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f23286f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final u7.e f23287g = new u7.e(this, 0);

    /* renamed from: n, reason: collision with root package name */
    public boolean f23294n = true;

    public a(to.l lVar) {
        this.f23295o = lVar;
        Paint paint = new Paint(1);
        this.f23282b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10 = this.f23294n;
        Paint paint = this.f23282b;
        Rect rect = this.f23284d;
        if (z10) {
            copyBounds(rect);
            float height = this.f23288h / rect.height();
            paint.setShader(new LinearGradient(s0.g.f34069a, rect.top, s0.g.f34069a, rect.bottom, new int[]{u3.a.b(this.f23289i, this.f23293m), u3.a.b(this.f23290j, this.f23293m), u3.a.b(u3.a.d(this.f23290j, 0), this.f23293m), u3.a.b(u3.a.d(this.f23292l, 0), this.f23293m), u3.a.b(this.f23292l, this.f23293m), u3.a.b(this.f23291k, this.f23293m)}, new float[]{s0.g.f34069a, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f23294n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f23285e;
        rectF.set(rect);
        to.c cVar = this.f23295o.f36283e;
        RectF rectF2 = this.f23286f;
        rectF2.set(getBounds());
        float min = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        to.l lVar = this.f23295o;
        rectF2.set(getBounds());
        if (lVar.e(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f23287g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f23288h > s0.g.f34069a ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        to.l lVar = this.f23295o;
        RectF rectF = this.f23286f;
        rectF.set(getBounds());
        if (lVar.e(rectF)) {
            to.c cVar = this.f23295o.f36283e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f23284d;
        copyBounds(rect);
        RectF rectF2 = this.f23285e;
        rectF2.set(rect);
        n nVar = this.f23281a;
        to.l lVar2 = this.f23295o;
        Path path = this.f23283c;
        nVar.a(lVar2, 1.0f, rectF2, null, path);
        dp.b.J1(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        to.l lVar = this.f23295o;
        RectF rectF = this.f23286f;
        rectF.set(getBounds());
        if (lVar.e(rectF)) {
            int round = Math.round(this.f23288h);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f23296p;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f23294n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f23296p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f23293m)) != this.f23293m) {
            this.f23294n = true;
            this.f23293m = colorForState;
        }
        if (this.f23294n) {
            invalidateSelf();
        }
        return this.f23294n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f23282b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23282b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
