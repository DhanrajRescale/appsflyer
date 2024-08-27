package g7;

/* loaded from: classes.dex */
public final class x0 extends z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f17118b = new z0(false);

    public final boolean equals(Object obj) {
        if (obj instanceof x0) {
            if (this.f17152a == ((x0) obj).f17152a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17152a);
    }

    public final String toString() {
        return v.e.k(new StringBuilder("Loading(endOfPaginationReached="), this.f17152a, ')');
    }
}
