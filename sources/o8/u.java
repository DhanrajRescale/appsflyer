package o8;

import a2.a1;
import a2.f1;
import a2.l0;
import a2.n0;
import a2.o0;
import c2.c0;
import c2.j0;
import vt.p0;

/* loaded from: classes.dex */
public final class u extends g1.n implements c2.s, c0 {

    /* renamed from: n, reason: collision with root package name */
    public q1.b f29839n;

    /* renamed from: o, reason: collision with root package name */
    public g1.d f29840o;

    /* renamed from: p, reason: collision with root package name */
    public a2.l f29841p;

    /* renamed from: q, reason: collision with root package name */
    public float f29842q;

    /* renamed from: r, reason: collision with root package name */
    public n1.u f29843r;

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        if (this.f29839n.h() != m1.f.f27252c) {
            int e10 = qVar.e(w2.a.h(R0(hl.f.c(i10, 0, 13))));
            return Math.max(ku.c.b(m1.f.c(Q0(t0.t.j(i10, e10)))), e10);
        }
        return qVar.e(i10);
    }

    @Override // g1.n
    public final boolean F0() {
        return false;
    }

    public final long Q0(long j10) {
        if (m1.f.f(j10)) {
            int i10 = m1.f.f27253d;
            return m1.f.f27251b;
        }
        long h10 = this.f29839n.h();
        int i11 = m1.f.f27253d;
        if (h10 == m1.f.f27252c) {
            return j10;
        }
        float e10 = m1.f.e(h10);
        if (Float.isInfinite(e10) || Float.isNaN(e10)) {
            e10 = m1.f.e(j10);
        }
        float c10 = m1.f.c(h10);
        if (Float.isInfinite(c10) || Float.isNaN(c10)) {
            c10 = m1.f.c(j10);
        }
        long j11 = t0.t.j(e10, c10);
        long b10 = this.f29841p.b(j11, j10);
        float a10 = f1.a(b10);
        if (!Float.isInfinite(a10) && !Float.isNaN(a10)) {
            float b11 = f1.b(b10);
            if (!Float.isInfinite(b11) && !Float.isNaN(b11)) {
                return androidx.compose.ui.layout.a.n(j11, b10);
            }
            return j10;
        }
        return j10;
    }

    public final long R0(long j10) {
        boolean z10;
        float j11;
        int i10;
        float e10;
        boolean f10 = w2.a.f(j10);
        boolean e11 = w2.a.e(j10);
        if (f10 && e11) {
            return j10;
        }
        if (w2.a.d(j10) && w2.a.c(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        long h10 = this.f29839n.h();
        if (h10 == m1.f.f27252c) {
            if (z10) {
                return w2.a.a(j10, w2.a.h(j10), 0, w2.a.g(j10), 0, 10);
            }
            return j10;
        }
        if (z10 && (f10 || e11)) {
            j11 = w2.a.h(j10);
            i10 = w2.a.g(j10);
        } else {
            float e12 = m1.f.e(h10);
            float c10 = m1.f.c(h10);
            if (!Float.isInfinite(e12) && !Float.isNaN(e12)) {
                z8.e eVar = a0.f29785b;
                j11 = kotlin.ranges.d.e(e12, w2.a.j(j10), w2.a.h(j10));
            } else {
                j11 = w2.a.j(j10);
            }
            if (!Float.isInfinite(c10) && !Float.isNaN(c10)) {
                z8.e eVar2 = a0.f29785b;
                e10 = kotlin.ranges.d.e(c10, w2.a.i(j10), w2.a.g(j10));
                long Q0 = Q0(t0.t.j(j11, e10));
                return w2.a.a(j10, hl.f.L(ku.c.b(m1.f.e(Q0)), j10), 0, hl.f.K(ku.c.b(m1.f.c(Q0)), j10), 0, 10);
            }
            i10 = w2.a.i(j10);
        }
        e10 = i10;
        long Q02 = Q0(t0.t.j(j11, e10));
        return w2.a.a(j10, hl.f.L(ku.c.b(m1.f.e(Q02)), j10), 0, hl.f.K(ku.c.b(m1.f.c(Q02)), j10), 0, 10);
    }

    @Override // c2.c0
    public final n0 a(o0 o0Var, l0 l0Var, long j10) {
        n0 n0;
        a1 E = l0Var.E(R0(j10));
        n0 = o0Var.n0(E.f29a, E.f30b, p0.d(), new r(1, E));
        return n0;
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f29839n.h() != m1.f.f27252c) {
            int D = qVar.D(w2.a.g(R0(hl.f.c(0, i10, 7))));
            return Math.max(ku.c.b(m1.f.e(Q0(t0.t.j(D, i10)))), D);
        }
        return qVar.D(i10);
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        j0 j0Var = (j0) eVar;
        long Q0 = Q0(j0Var.f7740a.d());
        g1.d dVar = this.f29840o;
        z8.e eVar2 = a0.f29785b;
        long k10 = hl.f.k(ku.c.b(m1.f.e(Q0)), ku.c.b(m1.f.c(Q0)));
        long d10 = j0Var.f7740a.d();
        long a10 = ((g1.g) dVar).a(k10, hl.f.k(ku.c.b(m1.f.e(d10)), ku.c.b(m1.f.c(d10))), j0Var.getLayoutDirection());
        int i10 = w2.h.f38792c;
        float f10 = (int) (a10 >> 32);
        float f11 = (int) (a10 & 4294967295L);
        j0Var.f7740a.f30501b.f30498a.d(f10, f11);
        this.f29839n.g(eVar, Q0, this.f29842q, this.f29843r);
        ((j0) eVar).f7740a.f30501b.f30498a.d(-f10, -f11);
        j0Var.a();
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        if (this.f29839n.h() != m1.f.f27252c) {
            int W = qVar.W(w2.a.h(R0(hl.f.c(i10, 0, 13))));
            return Math.max(ku.c.b(m1.f.c(Q0(t0.t.j(i10, W)))), W);
        }
        return qVar.W(i10);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        if (this.f29839n.h() != m1.f.f27252c) {
            int z10 = qVar.z(w2.a.g(R0(hl.f.c(0, i10, 7))));
            return Math.max(ku.c.b(m1.f.e(Q0(t0.t.j(z10, i10)))), z10);
        }
        return qVar.z(i10);
    }
}
