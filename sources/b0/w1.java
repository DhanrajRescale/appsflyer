package b0;

/* loaded from: classes.dex */
public final class w1 extends g1.n implements c2.u1 {

    /* renamed from: n, reason: collision with root package name */
    public g1.c f3031n;

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
        n1Var.f2956c = new d0(this.f3031n);
        return n1Var;
    }
}
