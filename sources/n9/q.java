package n9;

/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final int f28527a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        if (this.f28527a != ((q) obj).f28527a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28527a);
    }

    public final String toString() {
        return "RawRes(resId=" + this.f28527a + ')';
    }
}
