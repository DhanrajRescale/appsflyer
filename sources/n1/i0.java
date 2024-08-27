package n1;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28143b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f28144a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        if (this.f28144a != ((i0) obj).f28144a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28144a);
    }

    public final String toString() {
        int i10 = this.f28144a;
        if (a(i10, 0)) {
            return "Argb8888";
        }
        if (a(i10, 1)) {
            return "Alpha8";
        }
        if (a(i10, 2)) {
            return "Rgb565";
        }
        if (a(i10, 3)) {
            return "F16";
        }
        if (a(i10, 4)) {
            return "Gpu";
        }
        return "Unknown";
    }
}
