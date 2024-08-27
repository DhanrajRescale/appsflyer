package c2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d0 extends i1 {
    public static final n1.f X;
    public c0 I;
    public v0 J;

    static {
        n1.f g10 = androidx.compose.ui.graphics.a.g();
        int i10 = n1.t.f28178j;
        g10.f(n1.t.f28175g);
        g10.m(1.0f);
        g10.n(1);
        X = g10;
    }

    public d0(androidx.compose.ui.node.a aVar, c0 c0Var) {
        super(aVar);
        w wVar;
        this.I = c0Var;
        if (aVar.f1402c != null) {
            wVar = new w(this);
        } else {
            wVar = null;
        }
        this.J = wVar;
    }

    @Override // a2.q
    public final int D(int i10) {
        c0 c0Var = this.I;
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        return c0Var.d0(this, i1Var, i10);
    }

    @Override // a2.l0
    public final a2.a1 E(long j10) {
        q0(j10);
        c0 c0Var = this.I;
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        j1(c0Var.a(this, i1Var, j10));
        e1();
        return this;
    }

    @Override // c2.i1
    public final void R0() {
        if (this.J == null) {
            this.J = new w(this);
        }
    }

    @Override // c2.i1
    public final v0 U0() {
        return this.J;
    }

    @Override // a2.q
    public final int W(int i10) {
        c0 c0Var = this.I;
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        return c0Var.l(this, i1Var, i10);
    }

    @Override // c2.i1
    public final g1.n W0() {
        return ((g1.n) this.I).f16405a;
    }

    @Override // a2.q
    public final int e(int i10) {
        c0 c0Var = this.I;
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        return c0Var.F(this, i1Var, i10);
    }

    @Override // c2.i1
    public final void g1(n1.r rVar) {
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        i1Var.O0(rVar);
        if (((d2.a0) k0.a(this.f7721k)).getShowLayoutBounds()) {
            P0(rVar, X);
        }
    }

    @Override // a2.a1
    public final void j0(long j10, float f10, Function1 function1) {
        h1(j10, f10, function1);
        if (this.f7851f) {
            return;
        }
        f1();
        F0().d();
    }

    @Override // c2.u0
    public final int u0(a2.a aVar) {
        v0 v0Var = this.J;
        if (v0Var != null) {
            Integer num = (Integer) v0Var.f7865p.get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        return g.c(this, aVar);
    }

    @Override // a2.q
    public final int z(int i10) {
        c0 c0Var = this.I;
        i1 i1Var = this.f7722l;
        Intrinsics.c(i1Var);
        return c0Var.u0(this, i1Var, i10);
    }
}
