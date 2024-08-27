package n1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class o extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public Function1 f28159n;

    @Override // g1.n
    public final boolean F0() {
        return false;
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        a2.a1 E = l0Var.E(j10);
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new x.z(25, E, this));
        return n0;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f28159n + ')';
    }
}
