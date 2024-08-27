package q0;

import c2.j0;
import kotlin.jvm.functions.Function0;
import m0.t1;
import m0.u1;

/* loaded from: classes.dex */
public abstract class z extends g1.n implements c2.m, c2.s {

    /* renamed from: n, reason: collision with root package name */
    public final a0.k f31556n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f31557o;

    /* renamed from: p, reason: collision with root package name */
    public final float f31558p;

    /* renamed from: q, reason: collision with root package name */
    public final n1.x f31559q;

    /* renamed from: r, reason: collision with root package name */
    public final Function0 f31560r;

    /* renamed from: s, reason: collision with root package name */
    public g0 f31561s;

    /* renamed from: t, reason: collision with root package name */
    public float f31562t;

    public z(a0.k kVar, boolean z10, float f10, t1 t1Var, u1 u1Var) {
        this.f31556n = kVar;
        this.f31557o = z10;
        this.f31558p = f10;
        this.f31559q = t1Var;
        this.f31560r = u1Var;
    }

    @Override // g1.n
    public final boolean F0() {
        return false;
    }

    @Override // g1.n
    public final void I0() {
        yk.g.H(E0(), null, null, new y(this, null), 3);
    }

    public abstract void Q0(a0.n nVar);

    public abstract void R0(p1.h hVar);

    public abstract void S0(a0.n nVar);

    @Override // c2.s
    public final void e(p1.e eVar) {
        float c02;
        float f10 = this.f31558p;
        if (Float.isNaN(f10)) {
            c02 = r.a(eVar, this.f31557o, ((j0) eVar).f7740a.d());
        } else {
            c02 = ((j0) eVar).c0(f10);
        }
        this.f31562t = c02;
        j0 j0Var = (j0) eVar;
        j0Var.a();
        g0 g0Var = this.f31561s;
        if (g0Var != null) {
            g0Var.b(j0Var, this.f31562t, this.f31559q.a());
        }
        R0(j0Var);
    }
}
