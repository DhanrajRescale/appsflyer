package w2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final long f38808b = hl.f.n(s0.g.f34069a, s0.g.f34069a);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f38809c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f38810a;

    public /* synthetic */ o(long j10) {
        this.f38810a = j10;
    }

    public static long a(long j10, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = b(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = c(j10);
        }
        return hl.f.n(f10, f11);
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final long d(long j10, long j11) {
        return hl.f.n(b(j10) - b(j11), c(j10) - c(j11));
    }

    public static final long e(long j10, long j11) {
        return hl.f.n(b(j11) + b(j10), c(j11) + c(j10));
    }

    public static String f(long j10) {
        return "(" + b(j10) + ", " + c(j10) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (this.f38810a != ((o) obj).f38810a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38810a);
    }

    public final String toString() {
        return f(this.f38810a);
    }
}
