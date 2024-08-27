package m0;

import java.util.List;

/* loaded from: classes.dex */
public final class s6 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s6 f26794a = new Object();

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        float f10;
        a2.n0 n0;
        if (list.size() == 1) {
            a2.a1 E = ((a2.l0) vt.g0.u(list)).E(j10);
            int f11 = E.f(a2.d.f47a);
            int f12 = E.f(a2.d.f48b);
            if (f11 != Integer.MIN_VALUE) {
                if (f12 != Integer.MIN_VALUE) {
                    if (f11 == f12) {
                        f10 = t6.f26856h;
                    } else {
                        f10 = t6.f26857i;
                    }
                    int max = Math.max(o0Var.m0(f10), E.f30b);
                    n0 = o0Var.n0(w2.a.h(j10), max, vt.p0.d(), new x.q(max, E));
                    return n0;
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
    }
}
