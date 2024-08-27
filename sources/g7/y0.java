package g7;

/* loaded from: classes.dex */
public final class y0 extends z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f17133b = new z0(true);

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f17134c = new z0(false);

    public final boolean equals(Object obj) {
        if (obj instanceof y0) {
            if (this.f17152a == ((y0) obj).f17152a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17152a);
    }

    public final String toString() {
        return v.e.k(new StringBuilder("NotLoading(endOfPaginationReached="), this.f17152a, ')');
    }
}
