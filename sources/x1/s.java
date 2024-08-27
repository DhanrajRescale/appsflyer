package x1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f39908a;

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (this.f39908a != ((s) obj).f39908a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39908a);
    }

    public final String toString() {
        return b(this.f39908a);
    }
}
