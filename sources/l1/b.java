package l1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23883b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f23884a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static String b(int i10) {
        if (a(i10, 1)) {
            return "Next";
        }
        if (a(i10, 2)) {
            return "Previous";
        }
        if (a(i10, 3)) {
            return "Left";
        }
        if (a(i10, 4)) {
            return "Right";
        }
        if (a(i10, 5)) {
            return "Up";
        }
        if (a(i10, 6)) {
            return "Down";
        }
        if (a(i10, 7)) {
            return "Enter";
        }
        if (a(i10, 8)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.f23884a != ((b) obj).f23884a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23884a);
    }

    public final String toString() {
        return b(this.f23884a);
    }
}
