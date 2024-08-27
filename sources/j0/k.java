package j0;

import c2.i1;
import c2.t;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class k extends g1.n implements c2.m, t, l {

    /* renamed from: n, reason: collision with root package name */
    public m f20596n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f20597o = t0.t.n0(null, o3.f35116a);

    public k(m mVar) {
        this.f20596n = mVar;
    }

    @Override // c2.t
    public final void C0(i1 i1Var) {
        this.f20597o.setValue(i1Var);
    }

    @Override // g1.n
    public final void I0() {
        m mVar = this.f20596n;
        if (mVar.f20598a == null) {
            mVar.f20598a = this;
            return;
        }
        throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
    }

    @Override // g1.n
    public final void J0() {
        this.f20596n.i(this);
    }
}
