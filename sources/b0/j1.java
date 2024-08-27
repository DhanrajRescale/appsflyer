package b0;

/* loaded from: classes.dex */
public final class j1 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public h1 f2887n;

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        float f10 = 0;
        if (Float.compare(this.f2887n.d(o0Var.getLayoutDirection()), f10) >= 0 && Float.compare(this.f2887n.c(), f10) >= 0 && Float.compare(this.f2887n.b(o0Var.getLayoutDirection()), f10) >= 0 && Float.compare(this.f2887n.a(), f10) >= 0) {
            int m02 = o0Var.m0(this.f2887n.b(o0Var.getLayoutDirection())) + o0Var.m0(this.f2887n.d(o0Var.getLayoutDirection()));
            int m03 = o0Var.m0(this.f2887n.a()) + o0Var.m0(this.f2887n.c());
            a2.a1 E = l0Var.E(hl.f.F0(-m02, -m03, j10));
            n0 = o0Var.n0(hl.f.L(E.f29a + m02, j10), hl.f.K(E.f30b + m03, j10), vt.p0.d(), new c.g(7, E, o0Var, this));
            return n0;
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
