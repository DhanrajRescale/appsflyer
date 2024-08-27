package b0;

/* loaded from: classes.dex */
public final class q0 extends g1.n implements c2.u1 {

    /* renamed from: n, reason: collision with root package name */
    public g1.b f2980n;

    @Override // c2.u1
    public final Object L(w2.b bVar, Object obj) {
        n1 n1Var;
        if (obj instanceof n1) {
            n1Var = (n1) obj;
        } else {
            n1Var = null;
        }
        if (n1Var == null) {
            n1Var = new n1();
        }
        n1Var.f2956c = new c0(this.f2980n);
        return n1Var;
    }
}
