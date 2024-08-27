package u0;

import t0.o2;
import t0.q2;

/* loaded from: classes.dex */
public final class r extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final r f36655c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        o2 o2Var = (o2) k0Var.b(1);
        t0.d dVar = (t0.d) k0Var.b(0);
        q2Var.d();
        dVar.getClass();
        q2Var.u(o2Var, o2Var.b(dVar));
        q2Var.j();
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "anchor";
        }
        if (t0.t.Q(i10, 1)) {
            return "from";
        }
        return super.c(i10);
    }
}
