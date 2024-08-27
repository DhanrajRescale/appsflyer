package x;

/* loaded from: classes.dex */
public final class z0 extends g1.n implements c2.m, c2.l1 {

    /* renamed from: n, reason: collision with root package name */
    public d0.c0 f39791n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39792o;

    @Override // g1.n
    public final void K0() {
        d0.c0 c0Var = this.f39791n;
        if (c0Var != null) {
            c0Var.b();
        }
        this.f39791n = null;
    }

    @Override // c2.l1
    public final void j0() {
        iu.z zVar = new iu.z();
        c2.g.w(this, new y0(0, zVar, this));
        d0.c0 c0Var = (d0.c0) zVar.f20560a;
        if (this.f39792o) {
            d0.c0 c0Var2 = this.f39791n;
            if (c0Var2 != null) {
                c0Var2.b();
            }
            if (c0Var != null) {
                c0Var.a();
            } else {
                c0Var = null;
            }
            this.f39791n = c0Var;
        }
    }
}
