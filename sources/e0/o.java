package e0;

import a2.c1;

/* loaded from: classes.dex */
public final class o implements d0.o {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14765a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14766b;

    public o(j0 j0Var, int i10) {
        this.f14765a = j0Var;
        this.f14766b = i10;
    }

    @Override // d0.o
    public final int c() {
        return this.f14765a.j();
    }

    @Override // d0.o
    public final int d() {
        return Math.min(r0.j() - 1, ((k) ((l) vt.g0.C(((z) this.f14765a.i()).f14820a))).f14741a + this.f14766b);
    }

    @Override // d0.o
    public final void e() {
        c1 c1Var = (c1) this.f14765a.f14738x.getValue();
        if (c1Var != null) {
            ((androidx.compose.ui.node.a) c1Var).j();
        }
    }

    @Override // d0.o
    public final boolean f() {
        return !((z) this.f14765a.i()).f14820a.isEmpty();
    }

    @Override // d0.o
    public final int g() {
        return Math.max(0, this.f14765a.f14719e - this.f14766b);
    }
}
