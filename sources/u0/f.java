package u0;

import t0.i1;
import t0.q2;

/* loaded from: classes.dex */
public final class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f36625c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        int i10;
        b1.e eVar = (b1.e) k0Var.b(1);
        if (eVar != null) {
            i10 = eVar.f3080a;
        } else {
            i10 = 0;
        }
        a aVar = (a) k0Var.b(0);
        if (i10 > 0) {
            fVar = new i1(fVar, i10);
        }
        aVar.a0(fVar, q2Var, xVar);
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "changes";
        }
        if (t0.t.Q(i10, 1)) {
            return "effectiveNodeIndex";
        }
        return super.c(i10);
    }
}
