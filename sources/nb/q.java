package nb;

/* loaded from: classes.dex */
public final class q extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final int f28592b;

    public q(int i10) {
        this.f28592b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f28592b == ((q) obj).f28592b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28592b);
    }

    public final String toString() {
        return nn.d.m(new StringBuilder("UpdateFavoriteFeedCount(count="), this.f28592b, ")");
    }
}
