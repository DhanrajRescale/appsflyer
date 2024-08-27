package h0;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f17799a;

    public e(float f10) {
        this.f17799a = f10;
    }

    @Override // h0.b
    public final float a(long j10, w2.b bVar) {
        return bVar.c0(this.f17799a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && w2.e.a(this.f17799a, ((e) obj).f17799a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f17799a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f17799a + ".dp)";
    }
}
