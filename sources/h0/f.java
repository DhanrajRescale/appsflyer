package h0;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f17800a;

    public f(float f10) {
        this.f17800a = f10;
        if (f10 >= s0.g.f34069a && f10 <= 100.0f) {
        } else {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // h0.b
    public final float a(long j10, w2.b bVar) {
        return (this.f17800a / 100.0f) * m1.f.d(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f17800a, ((f) obj).f17800a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17800a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f17800a + "%)";
    }
}
