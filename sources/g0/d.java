package g0;

import a0.l;
import h2.g;
import h2.j;
import h2.r;
import h2.t;
import h2.u;
import kotlin.jvm.functions.Function1;
import x.i0;
import x.n1;

/* loaded from: classes.dex */
public final class d extends i0 {
    public boolean F;
    public Function1 G;
    public final x.a H;

    public d(boolean z10, l lVar, n1 n1Var, boolean z11, g gVar, Function1 function1) {
        super(lVar, n1Var, z11, null, gVar, new c(function1, z10, 0));
        this.F = z10;
        this.G = function1;
        this.H = new x.a(this, 8);
    }

    @Override // x.k
    public final void T0(j jVar) {
        i2.a aVar;
        if (this.F) {
            aVar = i2.a.f19329a;
        } else {
            aVar = i2.a.f19330b;
        }
        ou.g[] gVarArr = t.f17908a;
        u uVar = r.D;
        ou.g gVar = t.f17908a[19];
        uVar.a(jVar, aVar);
    }
}
