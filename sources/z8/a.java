package z8;

/* loaded from: classes.dex */
public final class a extends al.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f42175b;

    public a(int i10) {
        this.f42175b = i10;
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException("px must be > 0.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f42175b == ((a) obj).f42175b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f42175b;
    }

    public final String toString() {
        return String.valueOf(this.f42175b);
    }
}
