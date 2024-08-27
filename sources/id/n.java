package id;

/* loaded from: classes.dex */
public final class n extends zq.f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19867e;

    public n(boolean z10) {
        this.f19867e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f19867e == ((n) obj).f19867e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19867e);
    }

    public final String toString() {
        return "ShowLoader(isLoading=" + this.f19867e + ")";
    }
}
