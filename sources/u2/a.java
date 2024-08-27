package u2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f36667a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (Float.compare(this.f36667a, ((a) obj).f36667a) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36667a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f36667a + ')';
    }
}
