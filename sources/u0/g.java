package u0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t0.q2;

/* loaded from: classes.dex */
public final class g extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g f36627c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        int i10 = ((b1.e) k0Var.b(0)).f3080a;
        List list = (List) k0Var.b(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int i12 = i10 + i11;
            fVar.a(i12, obj);
            fVar.f(i12, obj);
        }
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "effectiveNodeIndex";
        }
        if (t0.t.Q(i10, 1)) {
            return "nodes";
        }
        return super.c(i10);
    }
}
