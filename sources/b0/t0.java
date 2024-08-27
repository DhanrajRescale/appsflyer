package b0;

import kotlin.jvm.internal.Intrinsics;
import t0.o3;

/* loaded from: classes.dex */
public final class t0 implements a2.y, b2.d, b2.g {

    /* renamed from: b, reason: collision with root package name */
    public final x1 f3005b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.n1 f3006c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.n1 f3007d;

    public t0(x1 x1Var) {
        this.f3005b = x1Var;
        o3 o3Var = o3.f35116a;
        this.f3006c = t0.t.n0(x1Var, o3Var);
        this.f3007d = t0.t.n0(x1Var, o3Var);
    }

    @Override // a2.y
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        a2.n0 n0;
        t0.n1 n1Var = this.f3006c;
        int a10 = ((x1) n1Var.getValue()).a(o0Var, o0Var.getLayoutDirection());
        int d10 = ((x1) n1Var.getValue()).d(o0Var);
        int c10 = ((x1) n1Var.getValue()).c(o0Var, o0Var.getLayoutDirection()) + a10;
        int b10 = ((x1) n1Var.getValue()).b(o0Var) + d10;
        a2.a1 E = l0Var.E(hl.f.F0(-c10, -b10, j10));
        n0 = o0Var.n0(hl.f.L(E.f29a + c10, j10), hl.f.K(E.f30b + b10, j10), vt.p0.d(), new s0(E, a10, d10));
        return n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        return Intrinsics.a(((t0) obj).f3005b, this.f3005b);
    }

    @Override // b2.d
    public final void f(b2.h hVar) {
        x1 x1Var = (x1) hVar.c(a2.f2821a);
        x1 x1Var2 = this.f3005b;
        this.f3006c.setValue(new f0(x1Var2, x1Var));
        this.f3007d.setValue(new t1(x1Var, x1Var2));
    }

    @Override // b2.g
    public final b2.i getKey() {
        return a2.f2821a;
    }

    @Override // b2.g
    public final Object getValue() {
        return (x1) this.f3007d.getValue();
    }

    public final int hashCode() {
        return this.f3005b.hashCode();
    }
}
