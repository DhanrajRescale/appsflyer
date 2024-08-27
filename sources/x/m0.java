package x;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import y.g3;
import y.i3;

/* loaded from: classes.dex */
public final class m0 extends k {
    public String F;
    public Function0 G;
    public Function0 H;

    @Override // x.k
    public final void T0(h2.j jVar) {
        if (this.G != null) {
            String str = this.F;
            a aVar = new a(this, 1);
            ou.g[] gVarArr = h2.t.f17908a;
            jVar.h(h2.i.f17827c, new h2.a(str, aVar));
        }
    }

    @Override // x.k
    public final Object U0(x1.z zVar, yt.a aVar) {
        l0 l0Var;
        l0 l0Var2;
        boolean z10 = this.f39606t;
        yt.a aVar2 = null;
        if (z10 && this.H != null) {
            l0Var = new l0(this, 0);
        } else {
            l0Var = null;
        }
        int i10 = 1;
        if (z10 && this.G != null) {
            l0Var2 = new l0(this, i10);
        } else {
            l0Var2 = null;
        }
        h0 h0Var = new h0(this, aVar2, i10);
        l0 l0Var3 = new l0(this, 2);
        y.o0 o0Var = i3.f40778a;
        Object P = hl.f.P(new g3(zVar, null, l0Var2, l0Var, l0Var3, h0Var), aVar);
        zt.a aVar3 = zt.a.f42823a;
        if (P != aVar3) {
            P = Unit.f23355a;
        }
        if (P == aVar3) {
            return P;
        }
        return Unit.f23355a;
    }
}
