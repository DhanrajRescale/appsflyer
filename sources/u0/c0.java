package u0;

import t0.i2;
import t0.q2;
import t0.x1;

/* loaded from: classes.dex */
public final class c0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f36620c = new j0(1, 0, 2);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        boolean z10;
        int i10;
        int i11;
        boolean z11 = false;
        int a10 = k0Var.a(0);
        int i12 = q2Var.f35163u;
        int G = q2Var.G(q2Var.f35144b, q2Var.o(i12));
        int f10 = q2Var.f(q2Var.f35144b, q2Var.o(i12 + 1));
        for (int max = Math.max(G, f10 - a10); max < f10; max++) {
            Object obj = q2Var.f35145c[q2Var.g(max)];
            if (obj instanceof i2) {
                i2 i2Var = (i2) obj;
                t0.d dVar = i2Var.f35057b;
                if (dVar != null && dVar.a()) {
                    i10 = q2Var.c(dVar);
                    i11 = q2Var.H(i10);
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                xVar.d(i2Var.f35056a, max, i10, i11);
            } else if (obj instanceof x1) {
                ((x1) obj).c();
            }
        }
        if (a10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t0.t.u0(z10);
        int i13 = q2Var.f35163u;
        int G2 = q2Var.G(q2Var.f35144b, q2Var.o(i13));
        int f11 = q2Var.f(q2Var.f35144b, q2Var.o(i13 + 1)) - a10;
        if (f11 >= G2) {
            z11 = true;
        }
        t0.t.u0(z11);
        q2Var.C(f11, a10, i13);
        int i14 = q2Var.f35151i;
        if (i14 >= G2) {
            q2Var.f35151i = i14 - a10;
        }
    }

    @Override // u0.j0
    public final String b(int i10) {
        if (t0.t.P(i10, 0)) {
            return "count";
        }
        return super.b(i10);
    }
}
