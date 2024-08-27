package x;

/* loaded from: classes.dex */
public final class p0 extends g1.n implements c2.s {

    /* renamed from: n, reason: collision with root package name */
    public final a0.k f39670n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39671o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f39672p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39673q;

    public p0(a0.k kVar) {
        this.f39670n = kVar;
    }

    @Override // g1.n
    public final void I0() {
        yk.g.H(E0(), null, null, new o0(this, null), 3);
    }

    @Override // c2.s
    public final void e(p1.e eVar) {
        c2.j0 j0Var = (c2.j0) eVar;
        j0Var.a();
        boolean z10 = this.f39671o;
        p1.c cVar = j0Var.f7740a;
        if (z10) {
            p1.h.U(j0Var, n1.t.c(n1.t.f28170b, 0.3f), 0L, cVar.d(), s0.g.f34069a, null, 0, 122);
        } else if (this.f39672p || this.f39673q) {
            p1.h.U(j0Var, n1.t.c(n1.t.f28170b, 0.1f), 0L, cVar.d(), s0.g.f34069a, null, 0, 122);
        }
    }
}
