package b0;

/* loaded from: classes.dex */
public final class g1 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f2864n;

    /* renamed from: o, reason: collision with root package name */
    public float f2865o;

    /* renamed from: p, reason: collision with root package name */
    public float f2866p;

    /* renamed from: q, reason: collision with root package name */
    public float f2867q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2868r;

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        int m02 = o0Var.m0(this.f2866p) + o0Var.m0(this.f2864n);
        int m03 = o0Var.m0(this.f2867q) + o0Var.m0(this.f2865o);
        a2.a1 E = l0Var.E(hl.f.F0(-m02, -m03, j10));
        n0 = o0Var.n0(hl.f.L(E.f29a + m02, j10), hl.f.K(E.f30b + m03, j10), vt.p0.d(), new c.g(6, this, E, o0Var));
        return n0;
    }
}
