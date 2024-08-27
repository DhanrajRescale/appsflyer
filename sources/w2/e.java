package w2;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38782b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f38783a;

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f38783a, ((e) obj).f38783a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (Float.compare(this.f38783a, ((e) obj).f38783a) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38783a);
    }

    public final String toString() {
        return b(this.f38783a);
    }
}
