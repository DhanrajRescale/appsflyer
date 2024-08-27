package c2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 extends a {
    @Override // c2.a
    public final long b(i1 i1Var, long j10) {
        v0 U0 = i1Var.U0();
        Intrinsics.c(U0);
        long j11 = U0.f7861l;
        int i10 = w2.h.f38792c;
        return m1.c.h(t0.t.g((int) (j11 >> 32), (int) (j11 & 4294967295L)), j10);
    }

    @Override // c2.a
    public final Map c(i1 i1Var) {
        v0 U0 = i1Var.U0();
        Intrinsics.c(U0);
        return U0.F0().c();
    }

    @Override // c2.a
    public final int d(i1 i1Var, a2.a aVar) {
        v0 U0 = i1Var.U0();
        Intrinsics.c(U0);
        return U0.f(aVar);
    }
}
