package oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class f extends n {

    /* renamed from: c, reason: collision with root package name */
    public int f30173c;

    /* renamed from: d, reason: collision with root package name */
    public float f30174d;

    /* renamed from: e, reason: collision with root package name */
    public float f30175e;

    /* renamed from: f, reason: collision with root package name */
    public float f30176f;

    public f(i iVar) {
        super(iVar);
        this.f30173c = 1;
    }

    @Override // oo.n
    public final void a(Canvas canvas, Rect rect, float f10) {
        int i10;
        float width = rect.width() / g();
        float height = rect.height() / g();
        e eVar = this.f30215a;
        float f11 = (((i) eVar).f30192g / 2.0f) + ((i) eVar).f30193h;
        canvas.translate((f11 * width) + rect.left, (f11 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        if (((i) eVar).f30194i == 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        this.f30173c = i10;
        this.f30174d = ((i) eVar).f30167a * f10;
        this.f30175e = ((i) eVar).f30168b * f10;
        this.f30176f = (((i) eVar).f30192g - ((i) eVar).f30167a) / 2.0f;
        if ((this.f30216b.d() && ((i) eVar).f30171e == 2) || (this.f30216b.c() && ((i) eVar).f30172f == 1)) {
            this.f30176f = (((1.0f - f10) * ((i) eVar).f30167a) / 2.0f) + this.f30176f;
        } else if ((this.f30216b.d() && ((i) eVar).f30171e == 1) || (this.f30216b.c() && ((i) eVar).f30172f == 2)) {
            this.f30176f -= ((1.0f - f10) * ((i) eVar).f30167a) / 2.0f;
        }
    }

    @Override // oo.n
    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        float f12;
        if (f10 == f11) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f30174d);
        float f13 = this.f30173c;
        float f14 = f10 * 360.0f * f13;
        if (f11 >= f10) {
            f12 = f11 - f10;
        } else {
            f12 = (1.0f + f11) - f10;
        }
        float f15 = f12 * 360.0f * f13;
        float f16 = this.f30176f;
        float f17 = -f16;
        canvas.drawArc(new RectF(f17, f17, f16, f16), f14, f15, false, paint);
        if (this.f30175e > s0.g.f34069a && Math.abs(f15) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            f(canvas, paint, this.f30174d, this.f30175e, f14);
            f(canvas, paint, this.f30174d, this.f30175e, f14 + f15);
        }
    }

    @Override // oo.n
    public final void c(Canvas canvas, Paint paint) {
        int c10 = pn.e.c(((i) this.f30215a).f30170d, this.f30216b.f30214j);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(c10);
        paint.setStrokeWidth(this.f30174d);
        float f10 = this.f30176f;
        canvas.drawArc(new RectF(-f10, -f10, f10, f10), s0.g.f34069a, 360.0f, false, paint);
    }

    @Override // oo.n
    public final int d() {
        return g();
    }

    @Override // oo.n
    public final int e() {
        return g();
    }

    public final void f(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        canvas.save();
        canvas.rotate(f12);
        float f13 = this.f30176f;
        float f14 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f13 - f14, f11, f13 + f14, -f11), f11, f11, paint);
        canvas.restore();
    }

    public final int g() {
        e eVar = this.f30215a;
        return (((i) eVar).f30193h * 2) + ((i) eVar).f30192g;
    }
}
