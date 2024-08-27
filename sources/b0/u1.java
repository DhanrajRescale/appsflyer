package b0;

/* loaded from: classes.dex */
public final class u1 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f3019n;

    /* renamed from: o, reason: collision with root package name */
    public float f3020o;

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        int i11;
        int e10 = qVar.e(i10);
        if (!w2.e.a(this.f3020o, Float.NaN)) {
            i11 = rVar.m0(this.f3020o);
        } else {
            i11 = 0;
        }
        if (e10 < i11) {
            return i11;
        }
        return e10;
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        int j11;
        a2.n0 n0;
        int i10 = 0;
        if (!w2.e.a(this.f3019n, Float.NaN) && w2.a.j(j10) == 0) {
            j11 = o0Var.m0(this.f3019n);
            int h10 = w2.a.h(j10);
            if (j11 > h10) {
                j11 = h10;
            }
            if (j11 < 0) {
                j11 = 0;
            }
        } else {
            j11 = w2.a.j(j10);
        }
        int h11 = w2.a.h(j10);
        if (!w2.e.a(this.f3020o, Float.NaN) && w2.a.i(j10) == 0) {
            int m02 = o0Var.m0(this.f3020o);
            int g10 = w2.a.g(j10);
            if (m02 > g10) {
                m02 = g10;
            }
            if (m02 >= 0) {
                i10 = m02;
            }
        } else {
            i10 = w2.a.i(j10);
        }
        a2.a1 E = l0Var.E(hl.f.b(j11, h11, i10, w2.a.g(j10)));
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new v.f(9, E));
        return n0;
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        int i11;
        int D = qVar.D(i10);
        if (!w2.e.a(this.f3019n, Float.NaN)) {
            i11 = rVar.m0(this.f3019n);
        } else {
            i11 = 0;
        }
        if (D < i11) {
            return i11;
        }
        return D;
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        int i11;
        int W = qVar.W(i10);
        if (!w2.e.a(this.f3020o, Float.NaN)) {
            i11 = rVar.m0(this.f3020o);
        } else {
            i11 = 0;
        }
        if (W < i11) {
            return i11;
        }
        return W;
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        int i11;
        int z10 = qVar.z(i10);
        if (!w2.e.a(this.f3019n, Float.NaN)) {
            i11 = rVar.m0(this.f3019n);
        } else {
            i11 = 0;
        }
        if (z10 < i11) {
            return i11;
        }
        return z10;
    }
}
