package y;

/* loaded from: classes.dex */
public final class d0 implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40656a;

    public /* synthetic */ d0(int i10) {
        this.f40656a = i10;
    }

    public final float a(long j10) {
        switch (this.f40656a) {
            case 0:
                return m1.c.c(j10);
            case 1:
                return Math.abs(m1.c.d(j10));
            default:
                return Math.abs(m1.c.e(j10));
        }
    }

    public final long b(long j10, float f10) {
        switch (this.f40656a) {
            case 0:
                float a10 = a(j10);
                int i10 = m1.c.f27236e;
                if (j10 != 9205357640488583168L) {
                    return m1.c.g(j10, m1.c.i(t0.t.g(Float.intBitsToFloat((int) (j10 >> 32)) / a10, Float.intBitsToFloat((int) (4294967295L & j10)) / a10), f10));
                }
                t0.t.B0("Offset is unspecified");
                throw null;
            case 1:
                return t0.t.g(m1.c.d(j10) - (Math.signum(m1.c.d(j10)) * f10), m1.c.e(j10));
            default:
                return t0.t.g(m1.c.d(j10), m1.c.e(j10) - (Math.signum(m1.c.e(j10)) * f10));
        }
    }
}
