package u0;

import t0.q2;

/* loaded from: classes.dex */
public final class u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f36658c = new j0(3, 0, 2);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        fVar.c(k0Var.a(0), k0Var.a(1), k0Var.a(2));
    }

    @Override // u0.j0
    public final String b(int i10) {
        if (t0.t.P(i10, 0)) {
            return "from";
        }
        if (t0.t.P(i10, 1)) {
            return "to";
        }
        if (t0.t.P(i10, 2)) {
            return "count";
        }
        return super.b(i10);
    }
}
