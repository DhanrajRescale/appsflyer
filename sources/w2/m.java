package w2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f38803b = {new n(0), new n(4294967296L), new n(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f38804c = yk.j.i1(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f38805a;

    public /* synthetic */ m(long j10) {
        this.f38805a = j10;
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static final long b(long j10) {
        return f38803b[(int) ((j10 & 1095216660480L) >>> 32)].f38807a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static String d(long j10) {
        long b10 = b(j10);
        if (n.a(b10, 0L)) {
            return "Unspecified";
        }
        if (n.a(b10, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (n.a(b10, 8589934592L)) {
            return c(j10) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (this.f38805a != ((m) obj).f38805a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38805a);
    }

    public final String toString() {
        return d(this.f38805a);
    }
}
