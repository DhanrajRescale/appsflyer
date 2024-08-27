package a2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final c2.v0 f103a;

    public k0(c2.v0 v0Var) {
        this.f103a = v0Var;
    }

    @Override // a2.u
    public final long F(long j10) {
        return m1.c.h(this.f103a.f7860k.F(j10), a());
    }

    @Override // a2.u
    public final u G() {
        c2.v0 U0;
        if (m()) {
            c2.i1 i1Var = this.f103a.f7860k.f7721k.f1422w.f7656c.f7723m;
            if (i1Var == null || (U0 = i1Var.U0()) == null) {
                return null;
            }
            return U0.f7863n;
        }
        t0.t.C0("LayoutCoordinate operations are only valid when isAttached is true");
        throw null;
    }

    @Override // a2.u
    public final void I(u uVar, float[] fArr) {
        this.f103a.f7860k.I(uVar, fArr);
    }

    @Override // a2.u
    public final long M(long j10) {
        return this.f103a.f7860k.M(m1.c.h(j10, a()));
    }

    @Override // a2.u
    public final long O(u uVar, long j10) {
        boolean z10 = uVar instanceof k0;
        c2.v0 v0Var = this.f103a;
        if (z10) {
            c2.v0 v0Var2 = ((k0) uVar).f103a;
            v0Var2.f7860k.d1();
            c2.v0 U0 = v0Var.f7860k.S0(v0Var2.f7860k).U0();
            if (U0 != null) {
                long M0 = v0Var2.M0(U0);
                long j11 = hl.f.j(Math.round(m1.c.d(j10)), Math.round(m1.c.e(j10)));
                long j12 = hl.f.j(((int) (M0 >> 32)) + ((int) (j11 >> 32)), ((int) (M0 & 4294967295L)) + ((int) (j11 & 4294967295L)));
                long M02 = v0Var.M0(U0);
                long j13 = hl.f.j(((int) (j12 >> 32)) - ((int) (M02 >> 32)), ((int) (j12 & 4294967295L)) - ((int) (M02 & 4294967295L)));
                return t0.t.g((int) (j13 >> 32), (int) (j13 & 4294967295L));
            }
            c2.v0 g10 = androidx.compose.ui.layout.a.g(v0Var2);
            long M03 = v0Var2.M0(g10);
            long j14 = g10.f7861l;
            long j15 = hl.f.j(((int) (M03 >> 32)) + ((int) (j14 >> 32)), ((int) (M03 & 4294967295L)) + ((int) (j14 & 4294967295L)));
            long j16 = hl.f.j(Math.round(m1.c.d(j10)), Math.round(m1.c.e(j10)));
            long j17 = hl.f.j(((int) (j15 >> 32)) + ((int) (j16 >> 32)), ((int) (j15 & 4294967295L)) + ((int) (j16 & 4294967295L)));
            long M04 = v0Var.M0(androidx.compose.ui.layout.a.g(v0Var));
            long j18 = androidx.compose.ui.layout.a.g(v0Var).f7861l;
            long j19 = hl.f.j(((int) (M04 >> 32)) + ((int) (j18 >> 32)), ((int) (M04 & 4294967295L)) + ((int) (j18 & 4294967295L)));
            long j20 = hl.f.j(((int) (j17 >> 32)) - ((int) (j19 >> 32)), ((int) (j17 & 4294967295L)) - ((int) (j19 & 4294967295L)));
            c2.i1 i1Var = androidx.compose.ui.layout.a.g(v0Var).f7860k.f7723m;
            Intrinsics.c(i1Var);
            c2.i1 i1Var2 = g10.f7860k.f7723m;
            Intrinsics.c(i1Var2);
            return i1Var.O(i1Var2, t0.t.g((int) (j20 >> 32), (int) (j20 & 4294967295L)));
        }
        c2.v0 g11 = androidx.compose.ui.layout.a.g(v0Var);
        long O = O(g11.f7863n, j10);
        c2.i1 i1Var3 = g11.f7860k;
        i1Var3.getClass();
        int i10 = m1.c.f27236e;
        return m1.c.h(O, i1Var3.O(uVar, m1.c.f27233b));
    }

    public final long a() {
        c2.v0 v0Var = this.f103a;
        c2.v0 g10 = androidx.compose.ui.layout.a.g(v0Var);
        int i10 = m1.c.f27236e;
        long j10 = m1.c.f27233b;
        return m1.c.g(O(g10.f7863n, j10), v0Var.f7860k.O(g10.f7860k, j10));
    }

    @Override // a2.u
    public final long g(long j10) {
        return this.f103a.f7860k.g(m1.c.h(j10, a()));
    }

    @Override // a2.u
    public final m1.d i(u uVar, boolean z10) {
        return this.f103a.f7860k.i(uVar, z10);
    }

    @Override // a2.u
    public final boolean m() {
        return this.f103a.f7860k.W0().f16417m;
    }

    @Override // a2.u
    public final void n(float[] fArr) {
        this.f103a.f7860k.n(fArr);
    }

    @Override // a2.u
    public final long q() {
        c2.v0 v0Var = this.f103a;
        return hl.f.k(v0Var.f29a, v0Var.f30b);
    }
}
