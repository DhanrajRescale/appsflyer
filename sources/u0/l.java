package u0;

import kotlin.jvm.functions.Function1;
import t0.q2;

/* loaded from: classes.dex */
public final class l extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f36641c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        ((Function1) k0Var.b(0)).invoke((t0.u) k0Var.b(1));
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "anchor";
        }
        if (t0.t.Q(i10, 1)) {
            return "composition";
        }
        return super.c(i10);
    }
}
