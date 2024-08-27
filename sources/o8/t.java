package o8;

import a2.a1;
import a2.l0;
import a2.n0;
import a2.o0;
import tu.k1;
import tu.l1;
import vt.p0;

/* loaded from: classes.dex */
public final class t implements z8.h, a2.y {

    /* renamed from: b, reason: collision with root package name */
    public final k1 f29838b = l1.a(new w2.a(a0.f29784a));

    @Override // a2.y
    public final n0 a(o0 o0Var, l0 l0Var, long j10) {
        n0 n0;
        this.f29838b.m(new w2.a(j10));
        a1 E = l0Var.E(j10);
        n0 = o0Var.n0(E.f29a, E.f30b, p0.d(), new r(0, E));
        return n0;
    }

    @Override // z8.h
    public final Object d(n8.l lVar) {
        return el.l.T(new g7.x(this.f29838b, 3), lVar);
    }
}
