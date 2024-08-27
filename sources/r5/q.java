package r5;

import b5.g1;
import b5.h1;
import b5.i1;

/* loaded from: classes.dex */
public final class q extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public final b5.k0 f33272b;

    public q(b5.k0 k0Var) {
        this.f33272b = k0Var;
    }

    @Override // b5.i1
    public final int b(Object obj) {
        if (obj == p.f33257e) {
            return 0;
        }
        return -1;
    }

    @Override // b5.i1
    public final g1 g(int i10, g1 g1Var, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = p.f33257e;
        }
        g1Var.j(num, obj, 0, -9223372036854775807L, 0L, b5.b.f3203g, true);
        return g1Var;
    }

    @Override // b5.i1
    public final int i() {
        return 1;
    }

    @Override // b5.i1
    public final Object m(int i10) {
        return p.f33257e;
    }

    @Override // b5.i1
    public final h1 n(int i10, h1 h1Var, long j10) {
        h1Var.b(h1.f3323r, this.f33272b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        h1Var.f3343l = true;
        return h1Var;
    }

    @Override // b5.i1
    public final int p() {
        return 1;
    }
}
