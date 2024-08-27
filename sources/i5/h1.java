package i5;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f19487b = new h1(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19488a;

    public h1(boolean z10) {
        this.f19488a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass() && this.f19488a == ((h1) obj).f19488a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f19488a ? 1 : 0;
    }
}
