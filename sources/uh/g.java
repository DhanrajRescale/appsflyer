package uh;

/* loaded from: classes.dex */
public final class g extends yk.g {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37201b;

    public g(boolean z10) {
        this.f37201b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f37201b == ((g) obj).f37201b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37201b);
    }

    public final String toString() {
        return "HandleBannerDisplay(isShow=" + this.f37201b + ")";
    }
}
