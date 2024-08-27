package w2;

import com.google.android.gms.common.api.Api;
import t.k0;
import t0.t;

/* loaded from: classes.dex */
public interface b {
    default long H(float f10) {
        return o(P(f10));
    }

    default float N(int i10) {
        return i10 / b();
    }

    default float P(float f10) {
        return f10 / b();
    }

    float Y();

    float b();

    default float c0(float f10) {
        return b() * f10;
    }

    default int h0(long j10) {
        return Math.round(x0(j10));
    }

    default int m0(float f10) {
        float c02 = c0(f10);
        if (Float.isInfinite(c02)) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return Math.round(c02);
    }

    default long o(float f10) {
        boolean z10;
        float Y;
        k0 k0Var = x2.b.f39943a;
        if (Y() >= x2.b.f39945c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return yk.j.i1(4294967296L, f10 / Y());
        }
        x2.a a10 = x2.b.a(Y());
        if (a10 != null) {
            Y = a10.a(f10);
        } else {
            Y = f10 / Y();
        }
        return yk.j.i1(4294967296L, Y);
    }

    default long p(long j10) {
        if (j10 != 9205357640488583168L) {
            return hl.f.g(P(m1.f.e(j10)), P(m1.f.c(j10)));
        }
        int i10 = g.f38789d;
        return g.f38788c;
    }

    default long s0(long j10) {
        if (j10 != 9205357640488583168L) {
            return t.j(c0(g.b(j10)), c0(g.a(j10)));
        }
        return m1.f.f27252c;
    }

    default float x(long j10) {
        float c10;
        float Y;
        if (n.a(m.b(j10), 4294967296L)) {
            k0 k0Var = x2.b.f39943a;
            if (Y() >= x2.b.f39945c) {
                x2.a a10 = x2.b.a(Y());
                c10 = m.c(j10);
                if (a10 == null) {
                    Y = Y();
                } else {
                    return a10.b(c10);
                }
            } else {
                c10 = m.c(j10);
                Y = Y();
            }
            return Y * c10;
        }
        yk.j.B1("Only Sp can convert to Px");
        throw null;
    }

    default float x0(long j10) {
        if (n.a(m.b(j10), 4294967296L)) {
            return c0(x(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }
}
