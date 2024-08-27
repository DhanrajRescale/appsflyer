package t5;

import java.util.List;
import lp.j1;
import lp.l0;
import lp.o0;
import yk.j;

/* loaded from: classes.dex */
public final class b implements s6.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f35342a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f35343b;

    public b(long j10, j1 j1Var) {
        this.f35342a = j10;
        this.f35343b = j1Var;
    }

    @Override // s6.b
    public final int a(long j10) {
        return this.f35342a > j10 ? 0 : -1;
    }

    @Override // s6.b
    public final long b(int i10) {
        boolean z10;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.E0(z10);
        return this.f35342a;
    }

    @Override // s6.b
    public final List c(long j10) {
        if (j10 >= this.f35342a) {
            return this.f35343b;
        }
        l0 l0Var = o0.f25025b;
        return j1.f24998e;
    }

    @Override // s6.b
    public final int d() {
        return 1;
    }
}
