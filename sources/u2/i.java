package u2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f36683a;

    public /* synthetic */ i(int i10) {
        this.f36683a = i10;
    }

    public static final /* synthetic */ i a(int i10) {
        return new i(i10);
    }

    public static final boolean b(int i10, int i11) {
        return i10 == i11;
    }

    public static String c(int i10) {
        if (b(i10, 1)) {
            return "Left";
        }
        if (b(i10, 2)) {
            return "Right";
        }
        if (b(i10, 3)) {
            return "Center";
        }
        if (b(i10, 4)) {
            return "Justify";
        }
        if (b(i10, 5)) {
            return "Start";
        }
        if (b(i10, 6)) {
            return "End";
        }
        if (b(i10, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (this.f36683a != ((i) obj).f36683a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36683a);
    }

    public final String toString() {
        return c(this.f36683a);
    }
}
