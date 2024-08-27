package u2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f36688a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Ltr";
        }
        if (a(i10, 2)) {
            return "Rtl";
        }
        if (a(i10, 3)) {
            return "Content";
        }
        if (a(i10, 4)) {
            return "ContentOrLtr";
        }
        if (a(i10, 5)) {
            return "ContentOrRtl";
        }
        if (a(i10, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (this.f36688a != ((k) obj).f36688a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36688a);
    }

    public final String toString() {
        return b(this.f36688a);
    }
}
