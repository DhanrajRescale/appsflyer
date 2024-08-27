package b0;

/* loaded from: classes.dex */
public abstract class x0 extends g1.n implements c2.c0 {
    public int F(a2.r rVar, a2.q qVar, int i10) {
        return qVar.e(i10);
    }

    public abstract long Q0(a2.l0 l0Var, long j10);

    public abstract boolean R0();

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        long Q0 = Q0(l0Var, j10);
        if (R0()) {
            Q0 = hl.f.J(j10, Q0);
        }
        a2.a1 E = l0Var.E(Q0);
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new v.f(7, E));
        return n0;
    }

    @Override // c2.c0
    public int d0(a2.r rVar, a2.q qVar, int i10) {
        return qVar.D(i10);
    }

    public int l(a2.r rVar, a2.q qVar, int i10) {
        return qVar.W(i10);
    }

    @Override // c2.c0
    public int u0(a2.r rVar, a2.q qVar, int i10) {
        return qVar.z(i10);
    }
}
