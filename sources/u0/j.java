package u0;

import kotlin.jvm.internal.Intrinsics;
import t0.q2;

/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f36633c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        boolean z10;
        int i10;
        int J0;
        boolean z11 = false;
        b1.e eVar = (b1.e) k0Var.b(0);
        t0.d dVar = (t0.d) k0Var.b(1);
        Intrinsics.d(fVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int c10 = q2Var.c(dVar);
        if (q2Var.f35161s < c10) {
            z10 = true;
        } else {
            z10 = false;
        }
        t0.t.u0(z10);
        t0.t.q0(q2Var, fVar, c10);
        int i11 = q2Var.f35161s;
        int i12 = q2Var.f35163u;
        while (i12 >= 0 && !dp.b.G0(q2Var.f35144b, q2Var.o(i12))) {
            i12 = q2Var.y(q2Var.f35144b, i12);
        }
        int i13 = i12 + 1;
        int i14 = 0;
        while (i13 < i11) {
            if (q2Var.q(i11, i13)) {
                if (dp.b.G0(q2Var.f35144b, q2Var.o(i13))) {
                    i14 = 0;
                }
                i13++;
            } else {
                if (dp.b.G0(q2Var.f35144b, q2Var.o(i13))) {
                    J0 = 1;
                } else {
                    J0 = dp.b.J0(q2Var.f35144b, q2Var.o(i13));
                }
                i14 += J0;
                i13 += q2Var.p(i13);
            }
        }
        while (true) {
            i10 = q2Var.f35161s;
            if (i10 >= c10) {
                break;
            }
            if (q2Var.q(c10, i10)) {
                int i15 = q2Var.f35161s;
                if (i15 < q2Var.f35162t && dp.b.G0(q2Var.f35144b, q2Var.o(i15))) {
                    fVar.b(q2Var.x(q2Var.f35161s));
                    i14 = 0;
                }
                q2Var.J();
            } else {
                i14 += q2Var.E();
            }
        }
        if (i10 == c10) {
            z11 = true;
        }
        t0.t.u0(z11);
        eVar.f3080a = i14;
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "effectiveNodeIndexOut";
        }
        if (t0.t.Q(i10, 1)) {
            return "anchor";
        }
        return super.c(i10);
    }
}
