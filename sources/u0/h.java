package u0;

import t0.c1;
import t0.q2;

/* loaded from: classes.dex */
public final class h extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f36629c = new j0(0, 4, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        c1 c1Var = (c1) k0Var.b(2);
        t0.v vVar = (t0.v) k0Var.b(1);
        vVar.k(c1Var);
        t0.t.G("Could not resolve state for movable content");
        throw null;
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "resolvedState";
        }
        if (t0.t.Q(i10, 1)) {
            return "resolvedCompositionContext";
        }
        if (t0.t.Q(i10, 2)) {
            return "from";
        }
        if (t0.t.Q(i10, 3)) {
            return "to";
        }
        return super.c(i10);
    }
}
