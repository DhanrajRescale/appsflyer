package c0;

import a2.c1;

/* loaded from: classes.dex */
public final class f implements d0.o {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f7493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7494b;

    public f(m0 m0Var, int i10) {
        this.f7493a = m0Var;
        this.f7494b = i10;
    }

    @Override // d0.o
    public final int c() {
        return ((a0) this.f7493a.g()).f7450m;
    }

    @Override // d0.o
    public final int d() {
        return Math.min(c() - 1, ((b0) ((n) vt.g0.C(((a0) this.f7493a.g()).f7447j))).f7464a + this.f7494b);
    }

    @Override // d0.o
    public final void e() {
        c1 c1Var = this.f7493a.f7539j;
        if (c1Var != null) {
            ((androidx.compose.ui.node.a) c1Var).j();
        }
    }

    @Override // d0.o
    public final boolean f() {
        return !((a0) this.f7493a.g()).f7447j.isEmpty();
    }

    @Override // d0.o
    public final int g() {
        return Math.max(0, this.f7493a.f7533d.f7488a.i() - this.f7494b);
    }
}
