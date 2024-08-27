package k1;

import a2.a1;
import a2.l;
import a2.l0;
import a2.n0;
import a2.o0;
import a2.q;
import a2.r;
import c2.c0;
import c2.j0;
import c2.s;
import g1.n;
import n1.u;
import t0.t;
import vt.p0;

/* loaded from: classes.dex */
public final class j extends n implements c0, s {

    /* renamed from: n, reason: collision with root package name */
    public q1.b f21902n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21903o;

    /* renamed from: p, reason: collision with root package name */
    public g1.d f21904p;

    /* renamed from: q, reason: collision with root package name */
    public l f21905q;

    /* renamed from: r, reason: collision with root package name */
    public float f21906r;

    /* renamed from: s, reason: collision with root package name */
    public u f21907s;

    public static boolean R0(long j10) {
        if (!m1.f.b(j10, m1.f.f27252c)) {
            float c10 = m1.f.c(j10);
            if (!Float.isInfinite(c10) && !Float.isNaN(c10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean S0(long j10) {
        if (!m1.f.b(j10, m1.f.f27252c)) {
            float e10 = m1.f.e(j10);
            if (!Float.isInfinite(e10) && !Float.isNaN(e10)) {
                return true;
            }
        }
        return false;
    }

    @Override // c2.c0
    public final int F(r rVar, q qVar, int i10) {
        if (Q0()) {
            long T0 = T0(hl.f.c(i10, 0, 13));
            return Math.max(w2.a.i(T0), qVar.e(i10));
        }
        return qVar.e(i10);
    }

    public final boolean Q0() {
        if (this.f21903o && this.f21902n.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long T0(long j10) {
        boolean z10;
        int j11;
        int i10;
        float e10;
        float c10;
        boolean z11 = false;
        if (w2.a.d(j10) && w2.a.c(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (w2.a.f(j10) && w2.a.e(j10)) {
            z11 = true;
        }
        if ((!Q0() && z10) || z11) {
            return w2.a.a(j10, w2.a.h(j10), 0, w2.a.g(j10), 0, 10);
        }
        long h10 = this.f21902n.h();
        if (S0(h10)) {
            j11 = Math.round(m1.f.e(h10));
        } else {
            j11 = w2.a.j(j10);
        }
        if (R0(h10)) {
            i10 = Math.round(m1.f.c(h10));
        } else {
            i10 = w2.a.i(j10);
        }
        long j12 = t.j(hl.f.L(j11, j10), hl.f.K(i10, j10));
        if (Q0()) {
            if (!S0(this.f21902n.h())) {
                e10 = m1.f.e(j12);
            } else {
                e10 = m1.f.e(this.f21902n.h());
            }
            if (!R0(this.f21902n.h())) {
                c10 = m1.f.c(j12);
            } else {
                c10 = m1.f.c(this.f21902n.h());
            }
            long j13 = t.j(e10, c10);
            if (m1.f.e(j12) == s0.g.f34069a || m1.f.c(j12) == s0.g.f34069a) {
                j12 = m1.f.f27251b;
            } else {
                j12 = androidx.compose.ui.layout.a.n(j13, this.f21905q.b(j13, j12));
            }
        }
        return w2.a.a(j10, hl.f.L(Math.round(m1.f.e(j12)), j10), 0, hl.f.K(Math.round(m1.f.c(j12)), j10), 0, 10);
    }

    @Override // c2.c0
    public final n0 a(o0 o0Var, l0 l0Var, long j10) {
        n0 n0;
        a1 E = l0Var.E(T0(j10));
        n0 = o0Var.n0(E.f29a, E.f30b, p0.d(), new v.f(14, E));
        return n0;
    }

    @Override // c2.c0
    public final int d0(r rVar, q qVar, int i10) {
        if (Q0()) {
            long T0 = T0(hl.f.c(0, i10, 7));
            return Math.max(w2.a.j(T0), qVar.D(i10));
        }
        return qVar.D(i10);
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        float e10;
        float c10;
        long j10;
        long h10 = this.f21902n.h();
        if (S0(h10)) {
            e10 = m1.f.e(h10);
        } else {
            e10 = m1.f.e(((j0) eVar).f7740a.d());
        }
        if (R0(h10)) {
            c10 = m1.f.c(h10);
        } else {
            c10 = m1.f.c(((j0) eVar).f7740a.d());
        }
        long j11 = t.j(e10, c10);
        j0 j0Var = (j0) eVar;
        if (m1.f.e(j0Var.f7740a.d()) != s0.g.f34069a) {
            p1.c cVar = j0Var.f7740a;
            if (m1.f.c(cVar.d()) != s0.g.f34069a) {
                j10 = androidx.compose.ui.layout.a.n(j11, this.f21905q.b(j11, cVar.d()));
                long j12 = j10;
                g1.d dVar = this.f21904p;
                long k10 = hl.f.k(Math.round(m1.f.e(j12)), Math.round(m1.f.c(j12)));
                p1.c cVar2 = j0Var.f7740a;
                long a10 = ((g1.g) dVar).a(k10, hl.f.k(Math.round(m1.f.e(cVar2.d())), Math.round(m1.f.c(cVar2.d()))), j0Var.getLayoutDirection());
                int i10 = w2.h.f38792c;
                float f10 = (int) (a10 >> 32);
                float f11 = (int) (a10 & 4294967295L);
                j0Var.f7740a.f30501b.f30498a.d(f10, f11);
                this.f21902n.g(eVar, j12, this.f21906r, this.f21907s);
                ((j0) eVar).f7740a.f30501b.f30498a.d(-f10, -f11);
                j0Var.a();
            }
        }
        j10 = m1.f.f27251b;
        long j122 = j10;
        g1.d dVar2 = this.f21904p;
        long k102 = hl.f.k(Math.round(m1.f.e(j122)), Math.round(m1.f.c(j122)));
        p1.c cVar22 = j0Var.f7740a;
        long a102 = ((g1.g) dVar2).a(k102, hl.f.k(Math.round(m1.f.e(cVar22.d())), Math.round(m1.f.c(cVar22.d()))), j0Var.getLayoutDirection());
        int i102 = w2.h.f38792c;
        float f102 = (int) (a102 >> 32);
        float f112 = (int) (a102 & 4294967295L);
        j0Var.f7740a.f30501b.f30498a.d(f102, f112);
        this.f21902n.g(eVar, j122, this.f21906r, this.f21907s);
        ((j0) eVar).f7740a.f30501b.f30498a.d(-f102, -f112);
        j0Var.a();
    }

    @Override // c2.c0
    public final int l(r rVar, q qVar, int i10) {
        if (Q0()) {
            long T0 = T0(hl.f.c(i10, 0, 13));
            return Math.max(w2.a.i(T0), qVar.W(i10));
        }
        return qVar.W(i10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f21902n + ", sizeToIntrinsics=" + this.f21903o + ", alignment=" + this.f21904p + ", alpha=" + this.f21906r + ", colorFilter=" + this.f21907s + ')';
    }

    @Override // c2.c0
    public final int u0(r rVar, q qVar, int i10) {
        if (Q0()) {
            long T0 = T0(hl.f.c(0, i10, 7));
            return Math.max(w2.a.j(T0), qVar.z(i10));
        }
        return qVar.z(i10);
    }
}
