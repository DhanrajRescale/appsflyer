package f0;

import a2.u;
import c2.b0;
import c2.i1;

/* loaded from: classes.dex */
public abstract class a extends g1.n implements b2.f, b0, c2.m {

    /* renamed from: n, reason: collision with root package name */
    public final n f15873n = new n(this);

    /* renamed from: o, reason: collision with root package name */
    public u f15874o;

    public final u Q0() {
        u uVar = this.f15874o;
        if (uVar == null || !uVar.m()) {
            return null;
        }
        return uVar;
    }

    @Override // c2.b0
    public final void g0(i1 i1Var) {
        this.f15874o = i1Var;
    }
}
