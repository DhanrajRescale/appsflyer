package b0;

/* loaded from: classes.dex */
public final class h0 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public int f2869n;

    /* renamed from: o, reason: collision with root package name */
    public float f2870o;

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        int j11;
        int h10;
        int g10;
        int i10;
        a2.n0 n0;
        if (w2.a.d(j10) && this.f2869n != 1) {
            j11 = kotlin.ranges.d.f(Math.round(w2.a.h(j10) * this.f2870o), w2.a.j(j10), w2.a.h(j10));
            h10 = j11;
        } else {
            j11 = w2.a.j(j10);
            h10 = w2.a.h(j10);
        }
        if (w2.a.c(j10) && this.f2869n != 2) {
            i10 = kotlin.ranges.d.f(Math.round(w2.a.g(j10) * this.f2870o), w2.a.i(j10), w2.a.g(j10));
            g10 = i10;
        } else {
            int i11 = w2.a.i(j10);
            g10 = w2.a.g(j10);
            i10 = i11;
        }
        a2.a1 E = l0Var.E(hl.f.b(j11, h10, i10, g10));
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new v.f(6, E));
        return n0;
    }
}
