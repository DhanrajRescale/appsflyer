package n1;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f28130a;

    /* renamed from: b, reason: collision with root package name */
    public int f28131b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f28132c;

    /* renamed from: d, reason: collision with root package name */
    public u f28133d;

    /* renamed from: e, reason: collision with root package name */
    public q0 f28134e;

    public f(Paint paint) {
        this.f28130a = paint;
    }

    public final int a() {
        if (!this.f28130a.isFilterBitmap()) {
            return 0;
        }
        return 1;
    }

    public final int b() {
        int i10;
        Paint.Cap strokeCap = this.f28130a.getStrokeCap();
        if (strokeCap == null) {
            i10 = -1;
        } else {
            i10 = g.f28135a[strokeCap.ordinal()];
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 != 3) {
            return 0;
        }
        return 2;
    }

    public final int c() {
        int i10;
        Paint.Join strokeJoin = this.f28130a.getStrokeJoin();
        if (strokeJoin == null) {
            i10 = -1;
        } else {
            i10 = g.f28136b[strokeJoin.ordinal()];
        }
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 != 3) {
            return 0;
        }
        return 1;
    }

    public final void d(float f10) {
        this.f28130a.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public final void e(int i10) {
        if (!s0.b(this.f28131b, i10)) {
            this.f28131b = i10;
            int i11 = Build.VERSION.SDK_INT;
            Paint paint = this.f28130a;
            if (i11 >= 29) {
                c1.f28126a.a(paint, i10);
            } else {
                paint.setXfermode(new PorterDuffXfermode(androidx.compose.ui.graphics.a.A(i10)));
            }
        }
    }

    public final void f(long j10) {
        this.f28130a.setColor(androidx.compose.ui.graphics.a.y(j10));
    }

    public final void g(u uVar) {
        ColorFilter colorFilter;
        this.f28133d = uVar;
        if (uVar != null) {
            colorFilter = uVar.f28180a;
        } else {
            colorFilter = null;
        }
        this.f28130a.setColorFilter(colorFilter);
    }

    public final void h(int i10) {
        this.f28130a.setFilterBitmap(!s0.d(i10, 0));
    }

    public final void i(q0 q0Var) {
        PathEffect pathEffect;
        i iVar = (i) q0Var;
        if (iVar != null) {
            pathEffect = iVar.f28142a;
        } else {
            pathEffect = null;
        }
        this.f28130a.setPathEffect(pathEffect);
        this.f28134e = q0Var;
    }

    public final void j(Shader shader) {
        this.f28132c = shader;
        this.f28130a.setShader(shader);
    }

    public final void k(int i10) {
        Paint.Cap cap;
        if (s0.e(i10, 2)) {
            cap = Paint.Cap.SQUARE;
        } else if (s0.e(i10, 1)) {
            cap = Paint.Cap.ROUND;
        } else if (s0.e(i10, 0)) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        this.f28130a.setStrokeCap(cap);
    }

    public final void l(int i10) {
        Paint.Join join;
        if (s0.f(i10, 0)) {
            join = Paint.Join.MITER;
        } else if (s0.f(i10, 2)) {
            join = Paint.Join.BEVEL;
        } else if (s0.f(i10, 1)) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        this.f28130a.setStrokeJoin(join);
    }

    public final void m(float f10) {
        this.f28130a.setStrokeWidth(f10);
    }

    public final void n(int i10) {
        Paint.Style style;
        if (i10 == 1) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        this.f28130a.setStyle(style);
    }
}
