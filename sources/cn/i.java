package cn;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8274a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f8275b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    public float f8276c = s0.g.f34069a;

    /* renamed from: d, reason: collision with root package name */
    public float f8277d = s0.g.f34069a;

    /* renamed from: e, reason: collision with root package name */
    public final float f8278e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public final float f8279f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f8280g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f8281h = Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public float f8282i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f8283j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f8284k = s0.g.f34069a;

    /* renamed from: l, reason: collision with root package name */
    public float f8285l = s0.g.f34069a;

    /* renamed from: m, reason: collision with root package name */
    public float f8286m = s0.g.f34069a;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f8287n = new Matrix();

    /* renamed from: o, reason: collision with root package name */
    public final float[] f8288o = new float[9];

    public final void a(View view, float[] fArr) {
        Matrix matrix = this.f8287n;
        matrix.reset();
        matrix.set(this.f8274a);
        float f10 = fArr[0];
        RectF rectF = this.f8275b;
        matrix.postTranslate(-(f10 - rectF.left), -(fArr[1] - rectF.top));
        f(matrix, view, true);
    }

    public final boolean b(float f10) {
        if (this.f8275b.left <= f10 + 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean c(float f10) {
        if (this.f8275b.right >= (((int) (f10 * 100.0f)) / 100.0f) - 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean d(float f10) {
        RectF rectF = this.f8275b;
        if (rectF.top <= f10) {
            if (rectF.bottom >= ((int) (f10 * 100.0f)) / 100.0f) {
                return true;
            }
        }
        return false;
    }

    public final void e(Matrix matrix, RectF rectF) {
        float f10;
        float f11;
        float[] fArr = this.f8288o;
        matrix.getValues(fArr);
        float f12 = fArr[2];
        float f13 = fArr[0];
        float f14 = fArr[5];
        float f15 = fArr[4];
        this.f8282i = Math.min(Math.max(this.f8280g, f13), this.f8281h);
        this.f8283j = Math.min(Math.max(this.f8278e, f15), this.f8279f);
        if (rectF != null) {
            f10 = rectF.width();
            f11 = rectF.height();
        } else {
            f10 = s0.g.f34069a;
            f11 = 0.0f;
        }
        this.f8284k = Math.min(Math.max(f12, ((this.f8282i - 1.0f) * (-f10)) - this.f8285l), this.f8285l);
        float max = Math.max(Math.min(f14, ((this.f8283j - 1.0f) * f11) + this.f8286m), -this.f8286m);
        fArr[2] = this.f8284k;
        fArr[0] = this.f8282i;
        fArr[5] = max;
        fArr[4] = this.f8283j;
        matrix.setValues(fArr);
    }

    public final void f(Matrix matrix, View view, boolean z10) {
        Matrix matrix2 = this.f8274a;
        matrix2.set(matrix);
        e(matrix2, this.f8275b);
        if (z10) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }
}
