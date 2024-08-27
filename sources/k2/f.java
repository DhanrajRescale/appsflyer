package k2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f21921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21922b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21923c;

    public f(int i10, int i11, boolean z10) {
        this.f21921a = i10;
        this.f21922b = i11;
        this.f21923c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21921a == fVar.f21921a && this.f21922b == fVar.f21922b && this.f21923c == fVar.f21923c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21923c) + da.e.f(this.f21922b, Integer.hashCode(this.f21921a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f21921a);
        sb2.append(", end=");
        sb2.append(this.f21922b);
        sb2.append(", isRtl=");
        return v.e.k(sb2, this.f21923c, ')');
    }
}
