package cn;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public final i f8259c;

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8257a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f8258b = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public float[] f8260d = new float[1];

    /* renamed from: e, reason: collision with root package name */
    public final Matrix f8261e = new Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final float[] f8262f = new float[2];

    /* renamed from: g, reason: collision with root package name */
    public final Matrix f8263g = new Matrix();

    public g(i iVar) {
        new Matrix();
        this.f8259c = iVar;
    }

    public final c a(float f10, float f11) {
        float[] fArr = this.f8262f;
        fArr[0] = f10;
        fArr[1] = f11;
        e(fArr);
        double d10 = fArr[0];
        double d11 = fArr[1];
        c cVar = (c) c.f8243d.b();
        cVar.f8244b = d10;
        cVar.f8245c = d11;
        return cVar;
    }

    public final void b(float f10, float f11, c cVar) {
        float[] fArr = this.f8262f;
        fArr[0] = f10;
        fArr[1] = f11;
        d(fArr);
        cVar.f8244b = fArr[0];
        cVar.f8245c = fArr[1];
    }

    public final void c(Path path) {
        path.transform(this.f8257a);
        path.transform(this.f8259c.f8274a);
        path.transform(this.f8258b);
    }

    public final void d(float[] fArr) {
        Matrix matrix = this.f8261e;
        matrix.reset();
        this.f8258b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f8259c.f8274a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f8257a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public final void e(float[] fArr) {
        this.f8257a.mapPoints(fArr);
        this.f8259c.f8274a.mapPoints(fArr);
        this.f8258b.mapPoints(fArr);
    }

    public final void f() {
        Matrix matrix = this.f8258b;
        matrix.reset();
        i iVar = this.f8259c;
        RectF rectF = iVar.f8275b;
        float f10 = rectF.left;
        float f11 = iVar.f8277d;
        matrix.postTranslate(f10, f11 - (f11 - rectF.bottom));
    }

    public final void g(float f10, float f11, float f12, float f13) {
        i iVar = this.f8259c;
        float width = iVar.f8275b.width() / f11;
        float height = iVar.f8275b.height() / f12;
        if (Float.isInfinite(width)) {
            width = 0.0f;
        }
        if (Float.isInfinite(height)) {
            height = 0.0f;
        }
        Matrix matrix = this.f8257a;
        matrix.reset();
        matrix.postTranslate(-f10, -f13);
        matrix.postScale(width, -height);
    }
}
