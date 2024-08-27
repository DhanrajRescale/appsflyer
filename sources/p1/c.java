package p1;

import android.graphics.Paint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n1.h0;
import n1.p;
import n1.p0;
import n1.q0;
import n1.r;
import n1.s0;
import n1.t;
import n1.u;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final a f30500a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30501b;

    /* renamed from: c, reason: collision with root package name */
    public n1.f f30502c;

    /* renamed from: d, reason: collision with root package name */
    public n1.f f30503d;

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [n1.r, java.lang.Object] */
    public c() {
        w2.c cVar = f.f30505a;
        w2.k kVar = w2.k.f38799a;
        ?? obj = new Object();
        long j10 = m1.f.f27251b;
        ?? obj2 = new Object();
        obj2.f30494a = cVar;
        obj2.f30495b = kVar;
        obj2.f30496c = obj;
        obj2.f30497d = j10;
        this.f30500a = obj2;
        this.f30501b = new b(this);
    }

    public static n1.f a(c cVar, long j10, i iVar, float f10, u uVar, int i10) {
        h.S.getClass();
        int i11 = g.f30508c;
        n1.f f11 = cVar.f(iVar);
        if (f10 != 1.0f) {
            j10 = t.c(j10, t.e(j10) * f10);
        }
        if (!t.d(androidx.compose.ui.graphics.a.c(f11.f28130a.getColor()), j10)) {
            f11.f(j10);
        }
        if (f11.f28132c != null) {
            f11.j(null);
        }
        if (!Intrinsics.a(f11.f28133d, uVar)) {
            f11.g(uVar);
        }
        if (!s0.b(f11.f28131b, i10)) {
            f11.e(i10);
        }
        if (!s0.d(f11.a(), i11)) {
            f11.h(i11);
        }
        return f11;
    }

    public static n1.f e(c cVar, p pVar, i iVar, float f10, u uVar, int i10) {
        h.S.getClass();
        return cVar.c(pVar, iVar, f10, uVar, i10, g.f30508c);
    }

    @Override // p1.h
    public final void B(long j10, long j11, long j12, long j13, i iVar, float f10, u uVar, int i10) {
        this.f30500a.f30496c.e(m1.c.d(j11), m1.c.e(j11), m1.f.e(j12) + m1.c.d(j11), m1.f.c(j12) + m1.c.e(j11), m1.a.b(j13), m1.a.c(j13), a(this, j10, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void Q(p pVar, long j10, long j11, float f10, int i10, q0 q0Var, float f11, u uVar, int i11) {
        r rVar = this.f30500a.f30496c;
        h.S.getClass();
        int i12 = g.f30508c;
        n1.f fVar = this.f30503d;
        if (fVar == null) {
            fVar = androidx.compose.ui.graphics.a.g();
            fVar.n(1);
            this.f30503d = fVar;
        }
        if (pVar != null) {
            pVar.a(f11, d(), fVar);
        } else if (fVar.f28130a.getAlpha() / 255.0f != f11) {
            fVar.d(f11);
        }
        if (!Intrinsics.a(fVar.f28133d, uVar)) {
            fVar.g(uVar);
        }
        if (!s0.b(fVar.f28131b, i11)) {
            fVar.e(i11);
        }
        Paint paint = fVar.f28130a;
        if (paint.getStrokeWidth() != f10) {
            fVar.m(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            fVar.f28130a.setStrokeMiter(4.0f);
        }
        if (!s0.e(fVar.b(), i10)) {
            fVar.k(i10);
        }
        if (!s0.f(fVar.c(), 0)) {
            fVar.l(0);
        }
        if (!Intrinsics.a(fVar.f28134e, q0Var)) {
            fVar.i(q0Var);
        }
        if (!s0.d(fVar.a(), i12)) {
            fVar.h(i12);
        }
        rVar.d(j10, j11, fVar);
    }

    @Override // p1.h
    public final void X(long j10, long j11, long j12, float f10, int i10, q0 q0Var, float f11, u uVar, int i11) {
        long c10;
        r rVar = this.f30500a.f30496c;
        h.S.getClass();
        int i12 = g.f30508c;
        n1.f fVar = this.f30503d;
        if (fVar == null) {
            fVar = androidx.compose.ui.graphics.a.g();
            fVar.n(1);
            this.f30503d = fVar;
        }
        if (f11 == 1.0f) {
            c10 = j10;
        } else {
            c10 = t.c(j10, t.e(j10) * f11);
        }
        if (!t.d(androidx.compose.ui.graphics.a.c(fVar.f28130a.getColor()), c10)) {
            fVar.f(c10);
        }
        if (fVar.f28132c != null) {
            fVar.j(null);
        }
        if (!Intrinsics.a(fVar.f28133d, uVar)) {
            fVar.g(uVar);
        }
        if (!s0.b(fVar.f28131b, i11)) {
            fVar.e(i11);
        }
        Paint paint = fVar.f28130a;
        if (paint.getStrokeWidth() != f10) {
            fVar.m(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            fVar.f28130a.setStrokeMiter(4.0f);
        }
        if (!s0.e(fVar.b(), i10)) {
            fVar.k(i10);
        }
        if (!s0.f(fVar.c(), 0)) {
            fVar.l(0);
        }
        if (!Intrinsics.a(fVar.f28134e, q0Var)) {
            fVar.i(q0Var);
        }
        if (!s0.d(fVar.a(), i12)) {
            fVar.h(i12);
        }
        rVar.d(j11, j12, fVar);
    }

    @Override // w2.b
    public final float Y() {
        return this.f30500a.f30494a.Y();
    }

    @Override // w2.b
    public final float b() {
        return this.f30500a.f30494a.b();
    }

    public final n1.f c(p pVar, i iVar, float f10, u uVar, int i10, int i11) {
        n1.f f11 = f(iVar);
        if (pVar != null) {
            pVar.a(f10, d(), f11);
        } else {
            if (f11.f28132c != null) {
                f11.j(null);
            }
            long c10 = androidx.compose.ui.graphics.a.c(f11.f28130a.getColor());
            long j10 = t.f28170b;
            if (!t.d(c10, j10)) {
                f11.f(j10);
            }
            if (f11.f28130a.getAlpha() / 255.0f != f10) {
                f11.d(f10);
            }
        }
        if (!Intrinsics.a(f11.f28133d, uVar)) {
            f11.g(uVar);
        }
        if (!s0.b(f11.f28131b, i10)) {
            f11.e(i10);
        }
        if (!s0.d(f11.a(), i11)) {
            f11.h(i11);
        }
        return f11;
    }

    @Override // p1.h
    public final void e0(p pVar, long j10, long j11, long j12, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.e(m1.c.d(j10), m1.c.e(j10), m1.c.d(j10) + m1.f.e(j11), m1.c.e(j10) + m1.f.c(j11), m1.a.b(j12), m1.a.c(j12), e(this, pVar, iVar, f10, uVar, i10));
    }

    public final n1.f f(i iVar) {
        if (Intrinsics.a(iVar, k.f30509a)) {
            n1.f fVar = this.f30502c;
            if (fVar == null) {
                n1.f g10 = androidx.compose.ui.graphics.a.g();
                g10.n(0);
                this.f30502c = g10;
                return g10;
            }
            return fVar;
        }
        if (iVar instanceof m) {
            n1.f fVar2 = this.f30503d;
            if (fVar2 == null) {
                fVar2 = androidx.compose.ui.graphics.a.g();
                fVar2.n(1);
                this.f30503d = fVar2;
            }
            Paint paint = fVar2.f28130a;
            float strokeWidth = paint.getStrokeWidth();
            m mVar = (m) iVar;
            float f10 = mVar.f30511a;
            if (strokeWidth != f10) {
                fVar2.m(f10);
            }
            int b10 = fVar2.b();
            int i10 = mVar.f30513c;
            if (!s0.e(b10, i10)) {
                fVar2.k(i10);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f11 = mVar.f30512b;
            if (strokeMiter != f11) {
                fVar2.f28130a.setStrokeMiter(f11);
            }
            int c10 = fVar2.c();
            int i11 = mVar.f30514d;
            if (!s0.f(c10, i11)) {
                fVar2.l(i11);
            }
            q0 q0Var = fVar2.f28134e;
            q0 q0Var2 = mVar.f30515e;
            if (!Intrinsics.a(q0Var, q0Var2)) {
                fVar2.i(q0Var2);
            }
            return fVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p1.h
    public final b f0() {
        return this.f30501b;
    }

    @Override // p1.h
    public final w2.k getLayoutDirection() {
        return this.f30500a.f30495b;
    }

    @Override // p1.h
    public final void i0(long j10, float f10, float f11, long j11, long j12, float f12, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.f(m1.c.d(j11), m1.c.e(j11), m1.f.e(j12) + m1.c.d(j11), m1.f.c(j12) + m1.c.e(j11), f10, f11, a(this, j10, iVar, f12, uVar, i10));
    }

    @Override // p1.h
    public final void k0(p0 p0Var, p pVar, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.o(p0Var, e(this, pVar, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void s(p0 p0Var, long j10, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.o(p0Var, a(this, j10, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void t(h0 h0Var, long j10, long j11, long j12, long j13, float f10, i iVar, u uVar, int i10, int i11) {
        this.f30500a.f30496c.g(h0Var, j10, j11, j12, j13, c(null, iVar, f10, uVar, i10, i11));
    }

    @Override // p1.h
    public final void t0(p pVar, long j10, long j11, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.i(m1.c.d(j10), m1.c.e(j10), m1.f.e(j11) + m1.c.d(j10), m1.f.c(j11) + m1.c.e(j10), e(this, pVar, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void v(h0 h0Var, long j10, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.a(h0Var, j10, e(this, null, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void w(long j10, long j11, long j12, float f10, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.i(m1.c.d(j11), m1.c.e(j11), m1.f.e(j12) + m1.c.d(j11), m1.f.c(j12) + m1.c.e(j11), a(this, j10, iVar, f10, uVar, i10));
    }

    @Override // p1.h
    public final void y(long j10, float f10, long j11, float f11, i iVar, u uVar, int i10) {
        this.f30500a.f30496c.k(f10, j11, a(this, j10, iVar, f11, uVar, i10));
    }
}
