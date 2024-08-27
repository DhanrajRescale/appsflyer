package n1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f28138a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f28139b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f28140c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f28141d;

    public h(Path path) {
        this.f28138a = path;
    }

    public final void c() {
        this.f28138a.close();
    }

    public final m1.d d() {
        if (this.f28139b == null) {
            this.f28139b = new RectF();
        }
        RectF rectF = this.f28139b;
        Intrinsics.c(rectF);
        this.f28138a.computeBounds(rectF, true);
        return new m1.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f10, float f11) {
        this.f28138a.lineTo(f10, f11);
    }

    public final void f(float f10, float f11) {
        this.f28138a.moveTo(f10, f11);
    }

    public final boolean g(p0 p0Var, p0 p0Var2, int i10) {
        Path.Op op2;
        if (i10 == 0) {
            op2 = Path.Op.DIFFERENCE;
        } else if (i10 == 1) {
            op2 = Path.Op.INTERSECT;
        } else if (i10 == 4) {
            op2 = Path.Op.REVERSE_DIFFERENCE;
        } else if (i10 == 2) {
            op2 = Path.Op.UNION;
        } else {
            op2 = Path.Op.XOR;
        }
        if (p0Var instanceof h) {
            Path path = ((h) p0Var).f28138a;
            if (p0Var2 instanceof h) {
                return this.f28138a.op(path, ((h) p0Var2).f28138a, op2);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void h() {
        this.f28138a.reset();
    }

    public final void i(int i10) {
        Path.FillType fillType;
        if (i10 == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.f28138a.setFillType(fillType);
    }

    public final void j(long j10) {
        Matrix matrix = this.f28141d;
        if (matrix == null) {
            this.f28141d = new Matrix();
        } else {
            Intrinsics.c(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f28141d;
        Intrinsics.c(matrix2);
        matrix2.setTranslate(m1.c.d(j10), m1.c.e(j10));
        Matrix matrix3 = this.f28141d;
        Intrinsics.c(matrix3);
        this.f28138a.transform(matrix3);
    }
}
