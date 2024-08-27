package m1;

import s0.g;
import t0.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f27233b = t.g(g.f34069a, g.f34069a);

    /* renamed from: c, reason: collision with root package name */
    public static final long f27234c = t.g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final long f27235d = t.g(Float.NaN, Float.NaN);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27236e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f27237a;

    public static long a(long j10, int i10) {
        float f10;
        int i11 = i10 & 1;
        float f11 = g.f34069a;
        if (i11 != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return t.g(f10, f11);
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static final float d(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static final float e(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static final boolean f(long j10) {
        return ((j10 >> 32) & 2147483647L) <= 2139095040 && (j10 & 2147483647L) <= 2139095040;
    }

    public static final long g(long j10, long j11) {
        boolean z10;
        if (j10 != 9205357640488583168L && j11 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return t.g(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static final long h(long j10, long j11) {
        boolean z10;
        if (j10 != 9205357640488583168L && j11 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return t.g(Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static final long i(long j10, float f10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return t.g(Float.intBitsToFloat((int) (j10 >> 32)) * f10, Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10);
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public static String j(long j10) {
        if (t.e0(j10)) {
            return "Offset(" + t.G0(d(j10)) + ", " + t.G0(e(j10)) + ')';
        }
        return "Offset.Unspecified";
    }

    public static final long k(long j10) {
        boolean z10;
        if (j10 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return t.g(-Float.intBitsToFloat((int) (j10 >> 32)), -Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        t.B0("Offset is unspecified");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this.f27237a != ((c) obj).f27237a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27237a);
    }

    public final String toString() {
        return j(this.f27237a);
    }
}
