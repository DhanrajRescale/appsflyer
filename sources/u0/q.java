package u0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.q2;

/* loaded from: classes.dex */
public final class q extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q f36654c = new j0(1, 2);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        Object mo2invoke = ((Function0) k0Var.b(0)).mo2invoke();
        t0.d dVar = (t0.d) k0Var.b(1);
        int a10 = k0Var.a(0);
        Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        dVar.getClass();
        q2Var.P(q2Var.c(dVar), mo2invoke);
        fVar.f(a10, mo2invoke);
        fVar.b(mo2invoke);
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
            return "factory";
        }
        if (t0.t.Q(i10, 1)) {
            return "groupAnchor";
        }
        return super.c(i10);
    }
}
