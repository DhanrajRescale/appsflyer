package i5;

/* loaded from: classes.dex */
public final class e1 extends r5.l {

    /* renamed from: c, reason: collision with root package name */
    public final Object f19406c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19407d;

    public e1(f1 f1Var, b5.i1 i1Var) {
        super(i1Var);
        this.f19406c = new b5.h1();
    }

    @Override // r5.l, b5.i1
    public final b5.g1 g(int i10, b5.g1 g1Var, boolean z10) {
        b5.i1 i1Var = this.f33206b;
        b5.g1 g10 = i1Var.g(i10, g1Var, z10);
        if (i1Var.n(g10.f3318c, (b5.h1) this.f19406c, 0L).a()) {
            g10.j(g1Var.f3316a, g1Var.f3317b, g1Var.f3318c, g1Var.f3319d, g1Var.f3320e, b5.b.f3203g, true);
        } else {
            g10.f3321f = true;
        }
        return g10;
    }

    @Override // r5.l, b5.i1
    public final b5.h1 n(int i10, b5.h1 h1Var, long j10) {
        return this.f33206b.n(i10, h1Var, j10);
    }
}
