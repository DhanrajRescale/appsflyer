package kb;

/* loaded from: classes.dex */
public final class k extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23042b;

    public k(boolean z10) {
        this.f23042b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f23042b == ((k) obj).f23042b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23042b);
    }

    public final String toString() {
        return "ShowNoMoreItemRemainingToView(isEndOfTheResponse=" + this.f23042b + ")";
    }
}
