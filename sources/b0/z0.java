package b0;

/* loaded from: classes.dex */
public final class z0 extends g1.n implements c2.u1 {

    /* renamed from: n, reason: collision with root package name */
    public float f3064n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3065o;

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
        n1Var.f2954a = this.f3064n;
        n1Var.f2955b = this.f3065o;
        return n1Var;
    }
}
