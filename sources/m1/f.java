package m1;

import s0.g;
import t0.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final long f27251b = t.j(g.f34069a, g.f34069a);

    /* renamed from: c, reason: collision with root package name */
    public static final long f27252c = t.j(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27253d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f27254a;

    public static boolean a(long j10, Object obj) {
        if (!(obj instanceof f) || j10 != ((f) obj).f27254a) {
            return false;
        }
        return true;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final float c(long j10) {
        if (j10 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        t.B0("Size is unspecified");
        throw null;
    }

    public static final float d(long j10) {
        if (j10 != 9205357640488583168L) {
            return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
        }
        t.B0("Size is unspecified");
        throw null;
    }

    public static final float e(long j10) {
        if (j10 != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        t.B0("Size is unspecified");
        throw null;
    }

    public static final boolean f(long j10) {
        if (j10 != 9205357640488583168L) {
            if (Float.intBitsToFloat((int) (j10 >> 32)) > g.f34069a && Float.intBitsToFloat((int) (j10 & 4294967295L)) > g.f34069a) {
                return false;
            }
            return true;
        }
        t.B0("Size is unspecified");
        throw null;
    }

    public static String g(long j10) {
        if (j10 != 9205357640488583168L) {
            return "Size(" + t.G0(e(j10)) + ", " + t.G0(c(j10)) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        return a(this.f27254a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f27254a);
    }

    public final String toString() {
        return g(this.f27254a);
    }
}
