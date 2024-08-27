package n1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f28123a = d.f28127a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f28124b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f28125c;

    @Override // n1.r
    public final void a(h0 h0Var, long j10, f fVar) {
        this.f28123a.drawBitmap(androidx.compose.ui.graphics.a.m(h0Var), m1.c.d(j10), m1.c.e(j10), fVar.f28130a);
    }

    @Override // n1.r
    public final void b(float f10, float f11) {
        this.f28123a.scale(f10, f11);
    }

    @Override // n1.r
    public final void c(float f10) {
        this.f28123a.rotate(f10);
    }

    @Override // n1.r
    public final void d(long j10, long j11, f fVar) {
        this.f28123a.drawLine(m1.c.d(j10), m1.c.e(j10), m1.c.d(j11), m1.c.e(j11), fVar.f28130a);
    }

    @Override // n1.r
    public final void e(float f10, float f11, float f12, float f13, float f14, float f15, f fVar) {
        this.f28123a.drawRoundRect(f10, f11, f12, f13, f14, f15, fVar.f28130a);
    }

    @Override // n1.r
    public final void f(float f10, float f11, float f12, float f13, float f14, float f15, f fVar) {
        this.f28123a.drawArc(f10, f11, f12, f13, f14, f15, false, fVar.f28130a);
    }

    @Override // n1.r
    public final void g(h0 h0Var, long j10, long j11, long j12, long j13, f fVar) {
        if (this.f28124b == null) {
            this.f28124b = new Rect();
            this.f28125c = new Rect();
        }
        Canvas canvas = this.f28123a;
        Bitmap m10 = androidx.compose.ui.graphics.a.m(h0Var);
        Rect rect = this.f28124b;
        Intrinsics.c(rect);
        int i10 = w2.h.f38792c;
        int i11 = (int) (j10 >> 32);
        rect.left = i11;
        int i12 = (int) (j10 & 4294967295L);
        rect.top = i12;
        rect.right = i11 + ((int) (j11 >> 32));
        rect.bottom = i12 + ((int) (j11 & 4294967295L));
        Unit unit = Unit.f23355a;
        Rect rect2 = this.f28125c;
        Intrinsics.c(rect2);
        int i13 = (int) (j12 >> 32);
        rect2.left = i13;
        int i14 = (int) (j12 & 4294967295L);
        rect2.top = i14;
        rect2.right = i13 + ((int) (j13 >> 32));
        rect2.bottom = i14 + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(m10, rect, rect2, fVar.f28130a);
    }

    @Override // n1.r
    public final void h() {
        this.f28123a.save();
    }

    @Override // n1.r
    public final void i(float f10, float f11, float f12, float f13, f fVar) {
        this.f28123a.drawRect(f10, f11, f12, f13, fVar.f28130a);
    }

    @Override // n1.r
    public final void j() {
        s0.a(this.f28123a, false);
    }

    @Override // n1.r
    public final void k(float f10, long j10, f fVar) {
        this.f28123a.drawCircle(m1.c.d(j10), m1.c.e(j10), f10, fVar.f28130a);
    }

    @Override // n1.r
    public final void l(float[] fArr) {
        float f10;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = s0.g.f34069a;
                }
                if (fArr[(i10 * 4) + i11] != f10) {
                    Matrix matrix = new Matrix();
                    androidx.compose.ui.graphics.a.u(matrix, fArr);
                    this.f28123a.concat(matrix);
                    return;
                }
            }
        }
    }

    @Override // n1.r
    public final void n(m1.d dVar, f fVar) {
        this.f28123a.saveLayer(dVar.f27239a, dVar.f27240b, dVar.f27241c, dVar.f27242d, fVar.f28130a, 31);
    }

    @Override // n1.r
    public final void o(p0 p0Var, f fVar) {
        Canvas canvas = this.f28123a;
        if (p0Var instanceof h) {
            canvas.drawPath(((h) p0Var).f28138a, fVar.f28130a);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // n1.r
    public final void q(float f10, float f11, float f12, float f13, int i10) {
        Region.Op op2;
        Canvas canvas = this.f28123a;
        if (i10 == 0) {
            op2 = Region.Op.DIFFERENCE;
        } else {
            op2 = Region.Op.INTERSECT;
        }
        canvas.clipRect(f10, f11, f12, f13, op2);
    }

    @Override // n1.r
    public final void r(float f10, float f11) {
        this.f28123a.translate(f10, f11);
    }

    @Override // n1.r
    public final void s() {
        this.f28123a.restore();
    }

    @Override // n1.r
    public final void t() {
        s0.a(this.f28123a, true);
    }

    @Override // n1.r
    public final void u(p0 p0Var, int i10) {
        Region.Op op2;
        Canvas canvas = this.f28123a;
        if (p0Var instanceof h) {
            Path path = ((h) p0Var).f28138a;
            if (i10 == 0) {
                op2 = Region.Op.DIFFERENCE;
            } else {
                op2 = Region.Op.INTERSECT;
            }
            canvas.clipPath(path, op2);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final Canvas v() {
        return this.f28123a;
    }

    public final void w(Canvas canvas) {
        this.f28123a = canvas;
    }
}
