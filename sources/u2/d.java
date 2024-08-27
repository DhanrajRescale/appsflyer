package u2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f36671a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Hyphens.None";
        }
        if (a(i10, 2)) {
            return "Hyphens.Auto";
        }
        if (a(i10, Integer.MIN_VALUE)) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f36671a != ((d) obj).f36671a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36671a);
    }

    public final String toString() {
        return b(this.f36671a);
    }
}
