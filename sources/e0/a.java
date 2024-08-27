package e0;

import java.util.concurrent.CancellationException;
import y.g1;

/* loaded from: classes.dex */
public final class a implements w1.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f14643a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f14644b;

    public a(j0 j0Var) {
        g1 g1Var = g1.f40724b;
        this.f14643a = j0Var;
        this.f14644b = g1Var;
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        float e10;
        float d10;
        if (dp.b.h1(i10, 1)) {
            j0 j0Var = this.f14643a;
            if (Math.abs(j0Var.f14718d.b()) > 0.0d) {
                float b10 = j0Var.f14718d.b() * j0Var.k();
                float f10 = ((((z) j0Var.i()).f14821b + ((z) j0Var.i()).f14822c) * (-Math.signum(j0Var.f14718d.b()))) + b10;
                if (j0Var.f14718d.b() > s0.g.f34069a) {
                    f10 = b10;
                    b10 = f10;
                }
                g1 g1Var = g1.f40724b;
                g1 g1Var2 = this.f14644b;
                if (g1Var2 == g1Var) {
                    e10 = m1.c.d(j10);
                } else {
                    e10 = m1.c.e(j10);
                }
                float f11 = -j0Var.e(-kotlin.ranges.d.e(e10, b10, f10));
                if (g1Var2 == g1Var) {
                    d10 = f11;
                } else {
                    d10 = m1.c.d(j10);
                }
                if (g1Var2 != g1.f40723a) {
                    f11 = m1.c.e(j10);
                }
                return t0.t.g(d10, f11);
            }
        }
        int i11 = m1.c.f27236e;
        return m1.c.f27233b;
    }

    @Override // w1.a
    public final Object f(long j10, long j11, yt.a aVar) {
        long a10;
        if (this.f14644b == g1.f40723a) {
            a10 = w2.o.a(j11, s0.g.f34069a, s0.g.f34069a, 2);
        } else {
            a10 = w2.o.a(j11, s0.g.f34069a, s0.g.f34069a, 1);
        }
        return new w2.o(a10);
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        if (dp.b.h1(i10, 2)) {
            int i11 = m1.c.f27236e;
            if (!m1.c.b(j11, m1.c.f27233b)) {
                throw new CancellationException();
            }
        }
        int i12 = m1.c.f27236e;
        return m1.c.f27233b;
    }
}
