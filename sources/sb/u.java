package sb;

/* loaded from: classes.dex */
public final class u extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34540d;

    public u(boolean z10) {
        this.f34540d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.f34540d == ((u) obj).f34540d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34540d);
    }

    public final String toString() {
        return "ShowLiveOrExpiredTrade(isExpired=" + this.f34540d + ")";
    }
}
