package a1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f20a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f20a == ((a) obj).f20a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20a);
    }

    public final String toString() {
        return a3.a.i(new StringBuilder("DeltaCounter(count="), this.f20a, ')');
    }
}
