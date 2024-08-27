package x1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f39843a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        if (this.f39843a != ((e0) obj).f39843a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39843a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f39843a + ')';
    }
}
