package h2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f17816a = 0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this.f17816a != ((e) obj).f17816a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17816a);
    }

    public final String toString() {
        int i10 = this.f17816a;
        return i10 == 0 ? "Polite" : i10 == 1 ? "Assertive" : "Unknown";
    }
}
