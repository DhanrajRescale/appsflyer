package g1;

import a2.a1;
import a2.l0;
import a2.n0;
import a2.o0;
import c2.c0;
import vt.p0;
import x.z;

/* loaded from: classes.dex */
public final class t extends n implements c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f16427n;

    @Override // c2.c0
    public final n0 a(o0 o0Var, l0 l0Var, long j10) {
        n0 n0;
        a1 E = l0Var.E(j10);
        n0 = o0Var.n0(E.f29a, E.f30b, p0.d(), new z(24, E, this));
        return n0;
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("ZIndexModifier(zIndex="), this.f16427n, ')');
    }
}
