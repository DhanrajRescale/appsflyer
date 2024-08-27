package r7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f33433g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final v4.b f33434h = new v4.b();

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f33435i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final d f33436a;

    /* renamed from: b, reason: collision with root package name */
    public float f33437b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f33438c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f33439d;

    /* renamed from: e, reason: collision with root package name */
    public float f33440e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f33441f;

    public e(Context context) {
        context.getClass();
        this.f33438c = context.getResources();
        d dVar = new d();
        this.f33436a = dVar;
        dVar.f33420i = f33435i;
        dVar.a(0);
        dVar.f33419h = 2.5f;
        dVar.f33413b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        ofFloat.addUpdateListener(new b(0, this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f33433g);
        ofFloat.addListener(new c(this, dVar));
        this.f33439d = ofFloat;
    }

    public static void d(float f10, d dVar) {
        if (f10 > 0.75f) {
            float f11 = (f10 - 0.75f) / 0.25f;
            int[] iArr = dVar.f33420i;
            int i10 = dVar.f33421j;
            int i11 = iArr[i10];
            int i12 = iArr[(i10 + 1) % iArr.length];
            dVar.f33432u = ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r1) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r3) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r4) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r2))));
            return;
        }
        dVar.f33432u = dVar.f33420i[dVar.f33421j];
    }

    public final void a(float f10, d dVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f33441f) {
            d(f10, dVar);
            float floor = (float) (Math.floor(dVar.f33424m / 0.8f) + 1.0d);
            float f12 = dVar.f33422k;
            float f13 = dVar.f33423l;
            dVar.f33416e = (((f13 - 0.01f) - f12) * f10) + f12;
            dVar.f33417f = f13;
            float f14 = dVar.f33424m;
            dVar.f33418g = nn.d.b(floor, f14, f10, f14);
            return;
        }
        if (f10 != 1.0f || z10) {
            float f15 = dVar.f33424m;
            v4.b bVar = f33434h;
            if (f10 < 0.5f) {
                interpolation = dVar.f33422k;
                f11 = (bVar.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f16 = dVar.f33422k + 0.79f;
                interpolation = f16 - (((1.0f - bVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = f16;
            }
            float f17 = (0.20999998f * f10) + f15;
            float f18 = (f10 + this.f33440e) * 216.0f;
            dVar.f33416e = interpolation;
            dVar.f33417f = f11;
            dVar.f33418g = f17;
            this.f33437b = f18;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f33438c.getDisplayMetrics().density;
        float f15 = f11 * f14;
        d dVar = this.f33436a;
        dVar.f33419h = f15;
        dVar.f33413b.setStrokeWidth(f15);
        dVar.f33428q = f10 * f14;
        dVar.a(0);
        dVar.f33429r = (int) (f12 * f14);
        dVar.f33430s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f33437b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f33436a;
        RectF rectF = dVar.f33412a;
        float f10 = dVar.f33428q;
        float f11 = (dVar.f33419h / 2.0f) + f10;
        if (f10 <= s0.g.f34069a) {
            f11 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f33429r * dVar.f33427p) / 2.0f, dVar.f33419h / 2.0f);
        }
        rectF.set(bounds.centerX() - f11, bounds.centerY() - f11, bounds.centerX() + f11, bounds.centerY() + f11);
        float f12 = dVar.f33416e;
        float f13 = dVar.f33418g;
        float f14 = (f12 + f13) * 360.0f;
        float f15 = ((dVar.f33417f + f13) * 360.0f) - f14;
        Paint paint = dVar.f33413b;
        paint.setColor(dVar.f33432u);
        paint.setAlpha(dVar.f33431t);
        float f16 = dVar.f33419h / 2.0f;
        rectF.inset(f16, f16);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f33415d);
        float f17 = -f16;
        rectF.inset(f17, f17);
        canvas.drawArc(rectF, f14, f15, false, paint);
        if (dVar.f33425n) {
            Path path = dVar.f33426o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f33426o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f18 = (dVar.f33429r * dVar.f33427p) / 2.0f;
            dVar.f33426o.moveTo(s0.g.f34069a, s0.g.f34069a);
            dVar.f33426o.lineTo(dVar.f33429r * dVar.f33427p, s0.g.f34069a);
            Path path3 = dVar.f33426o;
            float f19 = dVar.f33429r;
            float f20 = dVar.f33427p;
            path3.lineTo((f19 * f20) / 2.0f, dVar.f33430s * f20);
            dVar.f33426o.offset((rectF.centerX() + min) - f18, (dVar.f33419h / 2.0f) + rectF.centerY());
            dVar.f33426o.close();
            Paint paint2 = dVar.f33414c;
            paint2.setColor(dVar.f33432u);
            paint2.setAlpha(dVar.f33431t);
            canvas.save();
            canvas.rotate(f14 + f15, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f33426o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f33436a.f33431t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f33439d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f33436a.f33431t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33436a.f33413b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f33439d.cancel();
        d dVar = this.f33436a;
        float f10 = dVar.f33416e;
        dVar.f33422k = f10;
        float f11 = dVar.f33417f;
        dVar.f33423l = f11;
        dVar.f33424m = dVar.f33418g;
        if (f11 != f10) {
            this.f33441f = true;
            this.f33439d.setDuration(666L);
            this.f33439d.start();
            return;
        }
        dVar.a(0);
        dVar.f33422k = s0.g.f34069a;
        dVar.f33423l = s0.g.f34069a;
        dVar.f33424m = s0.g.f34069a;
        dVar.f33416e = s0.g.f34069a;
        dVar.f33417f = s0.g.f34069a;
        dVar.f33418g = s0.g.f34069a;
        this.f33439d.setDuration(1332L);
        this.f33439d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f33439d.cancel();
        this.f33437b = s0.g.f34069a;
        d dVar = this.f33436a;
        if (dVar.f33425n) {
            dVar.f33425n = false;
        }
        dVar.a(0);
        dVar.f33422k = s0.g.f34069a;
        dVar.f33423l = s0.g.f34069a;
        dVar.f33424m = s0.g.f34069a;
        dVar.f33416e = s0.g.f34069a;
        dVar.f33417f = s0.g.f34069a;
        dVar.f33418g = s0.g.f34069a;
        invalidateSelf();
    }
}
