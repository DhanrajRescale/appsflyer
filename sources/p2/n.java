package p2;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f30593b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f30594a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 0)) {
            return "None";
        }
        if (a(i10, 1)) {
            return "Default";
        }
        if (a(i10, 2)) {
            return "Go";
        }
        if (a(i10, 3)) {
            return "Search";
        }
        if (a(i10, 4)) {
            return "Send";
        }
        if (a(i10, 5)) {
            return "Previous";
        }
        if (a(i10, 6)) {
            return "Next";
        }
        if (a(i10, 7)) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f30594a != ((n) obj).f30594a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30594a);
    }

    public final String toString() {
        return b(this.f30594a);
    }
}
