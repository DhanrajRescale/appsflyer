package x;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c1 extends g1.n implements b2.f, c2.t {

    /* renamed from: n, reason: collision with root package name */
    public boolean f39518n;

    /* renamed from: o, reason: collision with root package name */
    public a2.u f39519o;

    @Override // c2.t
    public final void C0(c2.i1 i1Var) {
        Function1 function1;
        this.f39519o = i1Var;
        if (!this.f39518n) {
            return;
        }
        Function1 function12 = null;
        if (i1Var.W0().f16417m) {
            a2.u uVar = this.f39519o;
            if (uVar != null && uVar.m()) {
                if (this.f16417m) {
                    function12 = (Function1) c(b1.f39509a);
                }
                if (function12 != null) {
                    function12.invoke(this.f39519o);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f16417m) {
            function1 = (Function1) c(b1.f39509a);
        } else {
            function1 = null;
        }
        if (function1 != null) {
            function1.invoke(null);
        }
    }
}
