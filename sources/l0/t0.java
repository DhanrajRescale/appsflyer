package l0;

import i0.a2;
import i0.q1;
import i0.s2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f23825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23826b;

    public t0(v0 v0Var, boolean z10) {
        this.f23825a = v0Var;
        this.f23826b = z10;
    }

    @Override // i0.a2
    public final void a() {
    }

    @Override // i0.a2
    public final void b(long j10) {
    }

    @Override // i0.a2
    public final void c() {
        v0 v0Var = this.f23825a;
        v0.b(v0Var, null);
        v0.a(v0Var, null);
        v0Var.r(true);
    }

    @Override // i0.a2
    public final void d() {
        i0.z0 z0Var;
        s2 d10;
        boolean z10 = this.f23826b;
        if (z10) {
            z0Var = i0.z0.f19289b;
        } else {
            z0Var = i0.z0.f19290c;
        }
        v0 v0Var = this.f23825a;
        v0.b(v0Var, z0Var);
        long j10 = v0Var.j(z10);
        float f10 = e0.f23744a;
        long g10 = t0.t.g(m1.c.d(j10), m1.c.e(j10) - 1.0f);
        q1 q1Var = v0Var.f23839d;
        if (q1Var != null && (d10 = q1Var.d()) != null) {
            long e10 = d10.e(g10);
            v0Var.f23846k = e10;
            v0Var.f23850o.setValue(new m1.c(e10));
            v0Var.f23848m = m1.c.f27233b;
            v0Var.f23851p = -1;
            q1 q1Var2 = v0Var.f23839d;
            if (q1Var2 != null) {
                q1Var2.f19150q.setValue(Boolean.TRUE);
            }
            v0Var.r(false);
        }
    }

    @Override // i0.a2
    public final void e(long j10) {
        v0 v0Var = this.f23825a;
        long h10 = m1.c.h(v0Var.f23848m, j10);
        v0Var.f23848m = h10;
        v0Var.f23850o.setValue(new m1.c(m1.c.h(v0Var.f23846k, h10)));
        p2.c0 k10 = v0Var.k();
        m1.c i10 = v0Var.i();
        Intrinsics.c(i10);
        v0.c(v0Var, k10, i10.f27237a, false, this.f23826b, s.f23822d, true);
        v0Var.r(false);
    }

    @Override // i0.a2
    public final void onStop() {
        v0 v0Var = this.f23825a;
        v0.b(v0Var, null);
        v0.a(v0Var, null);
        v0Var.r(true);
    }
}
