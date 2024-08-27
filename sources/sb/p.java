package sb;

/* loaded from: classes.dex */
public final class p extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34535d;

    public p(boolean z10) {
        this.f34535d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f34535d == ((p) obj).f34535d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34535d);
    }

    public final String toString() {
        return "NoInternet(isPopup=" + this.f34535d + ")";
    }
}
