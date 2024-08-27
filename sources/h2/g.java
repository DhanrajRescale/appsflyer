package h2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17820b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f17821a;

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f17821a != ((g) obj).f17821a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17821a);
    }

    public final String toString() {
        int i10 = this.f17821a;
        if (a(i10, 0)) {
            return "Button";
        }
        if (a(i10, 1)) {
            return "Checkbox";
        }
        if (a(i10, 2)) {
            return "Switch";
        }
        if (a(i10, 3)) {
            return "RadioButton";
        }
        if (a(i10, 4)) {
            return "Tab";
        }
        if (a(i10, 5)) {
            return "Image";
        }
        if (a(i10, 6)) {
            return "DropdownList";
        }
        return "Unknown";
    }
}
