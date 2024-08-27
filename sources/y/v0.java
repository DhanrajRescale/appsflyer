package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v0 extends j {
    public w0 B;
    public g1 C;
    public hu.c D;
    public hu.c E;
    public final d0 F;

    public v0(w0 w0Var, h0 h0Var, g1 g1Var, boolean z10, a0.l lVar, Function0 function0, hu.c cVar, hu.c cVar2, boolean z11) {
        super(h0Var, z10, lVar, function0, z11);
        d0 d0Var;
        this.B = w0Var;
        this.C = g1Var;
        this.D = cVar;
        this.E = cVar2;
        if (g1Var == g1.f40723a) {
            d0Var = m0.f40855b;
        } else {
            d0Var = m0.f40854a;
        }
        this.F = d0Var;
    }

    @Override // y.j
    public final Object X0(qu.f0 f0Var, long j10, au.c cVar) {
        float b10;
        hu.c cVar2 = this.E;
        g1 g1Var = this.C;
        o0 o0Var = t0.f40956a;
        if (g1Var == g1.f40723a) {
            b10 = w2.o.c(j10);
        } else {
            b10 = w2.o.b(j10);
        }
        Object b11 = cVar2.b(f0Var, new Float(b10), cVar);
        if (b11 == zt.a.f42823a) {
            return b11;
        }
        return Unit.f23355a;
    }

    public final void Y0(w0 w0Var, h0 h0Var, g1 g1Var, boolean z10, a0.l lVar, Function0 function0, hu.c cVar, hu.c cVar2, boolean z11) {
        boolean z12;
        boolean z13 = true;
        if (!Intrinsics.a(this.B, w0Var)) {
            this.B = w0Var;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.C != g1Var) {
            this.C = g1Var;
            z12 = true;
        }
        this.D = cVar;
        this.E = cVar2;
        this.f40779p = h0Var;
        if (this.f40780q != z10) {
            this.f40780q = z10;
            if (!z10) {
                W0();
            }
        } else {
            z13 = z12;
        }
        if (!Intrinsics.a(this.f40781r, lVar)) {
            W0();
            this.f40781r = lVar;
        }
        this.f40782s = function0;
        if (this.f40783t != z11) {
            this.f40783t = z11;
        } else if (!z13) {
            return;
        }
        ((x1.o0) this.f40788y).S0();
    }
}
