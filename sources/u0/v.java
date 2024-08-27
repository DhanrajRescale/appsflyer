package u0;

import t0.q2;

/* loaded from: classes.dex */
public final class v extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final v f36659c = new j0(1, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        t0.d dVar = (t0.d) k0Var.b(0);
        int a10 = k0Var.a(0);
        fVar.e();
        dVar.getClass();
        fVar.a(a10, q2Var.x(q2Var.c(dVar)));
    }

    @Override // u0.j0
    public final String b(int i10) {
        if (t0.t.P(i10, 0)) {
            return "insertIndex";
        }
        return super.b(i10);
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "groupAnchor";
        }
        return super.c(i10);
    }
}
