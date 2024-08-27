package u0;

import kotlin.jvm.internal.Intrinsics;
import t0.q2;

/* loaded from: classes.dex */
public final class k extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k f36636c = new j0(0, 1, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        for (Object obj : (Object[]) k0Var.b(0)) {
            fVar.b(obj);
        }
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "nodes";
        }
        return super.c(i10);
    }
}
