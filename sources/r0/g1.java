package r0;

/* loaded from: classes.dex */
public final class g1 extends g1.n implements c2.m, c2.c0 {
    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        boolean z10;
        int i10;
        int i11;
        a2.n0 n0;
        long j11 = b1.f32336b;
        a2.a1 E = l0Var.E(j10);
        if (this.f16417m && ((Boolean) c2.g.p(this, b1.f32335a)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = Math.max(E.f29a, o0Var.m0(w2.g.b(j11)));
        } else {
            i10 = E.f29a;
        }
        if (z10) {
            i11 = Math.max(E.f30b, o0Var.m0(w2.g.a(j11)));
        } else {
            i11 = E.f30b;
        }
        n0 = o0Var.n0(i10, i11, vt.p0.d(), new b0.s0(i10, E, i11, 2));
        return n0;
    }
}
