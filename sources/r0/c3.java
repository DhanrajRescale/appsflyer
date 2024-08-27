package r0;

import kotlin.jvm.functions.Function0;
import m0.v6;
import m0.w6;

/* loaded from: classes.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0.p0 f32352a = new t0.p0(t0.o3.f35116a, m0.f32580i);

    public static final void a(g1.o oVar, n1.x0 x0Var, long j10, long j11, float f10, float f11, x.d0 d0Var, b1.c cVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        n1.x0 x0Var2;
        long j12;
        long j13;
        float f12;
        float f13;
        x.d0 d0Var2;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-513881741);
        if ((i11 & 1) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 2) != 0) {
            x0Var2 = n1.s0.f28162a;
        } else {
            x0Var2 = x0Var;
        }
        if ((i11 & 4) != 0) {
            j12 = ((l0) rVar.m(n0.f32600a)).f32544p;
        } else {
            j12 = j10;
        }
        if ((i11 & 8) != 0) {
            j13 = n0.b(j12, rVar);
        } else {
            j13 = j11;
        }
        if ((i11 & 16) != 0) {
            f12 = 0;
        } else {
            f12 = f10;
        }
        if ((i11 & 32) != 0) {
            f13 = 0;
        } else {
            f13 = f11;
        }
        if ((i11 & 64) != 0) {
            d0Var2 = null;
        } else {
            d0Var2 = d0Var;
        }
        t0.p0 p0Var = f32352a;
        float f14 = f12 + ((w2.e) rVar.m(p0Var)).f38783a;
        dp.b.q(new t0.v1[]{s0.f32699a.b(new n1.t(j13)), p0Var.b(new w2.e(f14))}, b1.d.b(rVar, -70914509, new v6(oVar2, x0Var2, j12, f14, d0Var2, f13, cVar, 1)), rVar, 48);
        rVar.s(false);
    }

    public static final void b(Function0 function0, g1.o oVar, boolean z10, n1.x0 x0Var, long j10, long j11, float f10, float f11, x.d0 d0Var, a0.l lVar, b1.c cVar, t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-789752804);
        t0.p0 p0Var = f32352a;
        float f12 = ((w2.e) rVar.m(p0Var)).f38783a + f10;
        dp.b.q(new t0.v1[]{s0.f32699a.b(new n1.t(j11)), p0Var.b(new w2.e(f12))}, b1.d.b(rVar, 1279702876, new w6(oVar, x0Var, j10, f12, d0Var, lVar, z10, function0, f11, cVar)), rVar, 48);
        rVar.s(false);
    }

    public static final g1.o c(g1.o oVar, n1.x0 x0Var, long j10, x.d0 d0Var, float f10) {
        g1.o r10 = androidx.compose.ui.graphics.a.r(oVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, f10, s0.g.f34069a, x0Var, false, 124895);
        g1.o oVar2 = g1.l.f16404b;
        if (d0Var != null) {
            oVar2 = androidx.compose.foundation.a.h(d0Var.f39525a, oVar2, d0Var.f39526b, x0Var);
        }
        return androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.e(r10.g(oVar2), j10, x0Var), x0Var);
    }

    public static final long d(long j10, float f10, t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-2079918090);
        l0 l0Var = (l0) rVar.m(n0.f32600a);
        boolean booleanValue = ((Boolean) rVar.m(n0.f32601b)).booleanValue();
        if (n1.t.d(j10, l0Var.f32544p) && booleanValue) {
            j10 = n0.e(l0Var, f10);
        }
        rVar.s(false);
        return j10;
    }
}
