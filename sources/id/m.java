package id;

/* loaded from: classes.dex */
public final class m extends zq.f {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19866e;

    public m(boolean z10) {
        this.f19866e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.f19866e == ((m) obj).f19866e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19866e);
    }

    public final String toString() {
        return "Reset(showShimmerState=" + this.f19866e + ")";
    }
}
