package v;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f37543a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37544b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37545c;

    public k0(float f10, float f11, long j10) {
        this.f37543a = f10;
        this.f37544b = f11;
        this.f37545c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Float.compare(this.f37543a, k0Var.f37543a) == 0 && Float.compare(this.f37544b, k0Var.f37544b) == 0 && this.f37545c == k0Var.f37545c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f37545c) + e.a(this.f37544b, Float.hashCode(this.f37543a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f37543a + ", distance=" + this.f37544b + ", duration=" + this.f37545c + ')';
    }
}
