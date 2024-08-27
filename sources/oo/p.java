package oo;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class p extends n {

    /* renamed from: c, reason: collision with root package name */
    public float f30219c;

    /* renamed from: d, reason: collision with root package name */
    public float f30220d;

    /* renamed from: e, reason: collision with root package name */
    public float f30221e;

    /* renamed from: f, reason: collision with root package name */
    public Path f30222f;

    public p(t tVar) {
        super(tVar);
        this.f30219c = 300.0f;
    }

    @Override // oo.n
    public final void a(Canvas canvas, Rect rect, float f10) {
        this.f30219c = rect.width();
        e eVar = this.f30215a;
        float f11 = ((t) eVar).f30167a;
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(s0.g.f34069a, (rect.height() - ((t) eVar).f30167a) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        if (((t) eVar).f30245i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f30216b.d() && ((t) eVar).f30171e == 1) || (this.f30216b.c() && ((t) eVar).f30172f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f30216b.d() || this.f30216b.c()) {
            canvas.translate(s0.g.f34069a, ((f10 - 1.0f) * ((t) eVar).f30167a) / 2.0f);
        }
        float f12 = this.f30219c;
        canvas.clipRect((-f12) / 2.0f, (-f11) / 2.0f, f12 / 2.0f, f11 / 2.0f);
        this.f30220d = ((t) eVar).f30167a * f10;
        this.f30221e = ((t) eVar).f30168b * f10;
    }

    @Override // oo.n
    public final void b(Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (f10 == f11) {
            return;
        }
        float f12 = this.f30219c;
        float f13 = (-f12) / 2.0f;
        float f14 = ((f10 * f12) + f13) - (this.f30221e * 2.0f);
        float f15 = (f11 * f12) + f13;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i10);
        canvas.save();
        canvas.clipPath(this.f30222f);
        float f16 = this.f30220d;
        RectF rectF = new RectF(f14, (-f16) / 2.0f, f15, f16 / 2.0f);
        float f17 = this.f30221e;
        canvas.drawRoundRect(rectF, f17, f17, paint);
        canvas.restore();
    }

    @Override // oo.n
    public final void c(Canvas canvas, Paint paint) {
        int c10 = pn.e.c(((t) this.f30215a).f30170d, this.f30216b.f30214j);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(c10);
        Path path = new Path();
        this.f30222f = path;
        float f10 = this.f30219c;
        float f11 = this.f30220d;
        RectF rectF = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
        float f12 = this.f30221e;
        path.addRoundRect(rectF, f12, f12, Path.Direction.CCW);
        canvas.drawPath(this.f30222f, paint);
    }

    @Override // oo.n
    public final int d() {
        return ((t) this.f30215a).f30167a;
    }

    @Override // oo.n
    public final int e() {
        return -1;
    }
}
