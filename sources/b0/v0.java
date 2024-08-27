package b0;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3023a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3026d;

    public v0(int i10, int i11, int i12, int i13) {
        this.f3023a = i10;
        this.f3024b = i11;
        this.f3025c = i12;
        this.f3026d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f3023a == v0Var.f3023a && this.f3024b == v0Var.f3024b && this.f3025c == v0Var.f3025c && this.f3026d == v0Var.f3026d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3023a * 31) + this.f3024b) * 31) + this.f3025c) * 31) + this.f3026d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f3023a);
        sb2.append(", top=");
        sb2.append(this.f3024b);
        sb2.append(", right=");
        sb2.append(this.f3025c);
        sb2.append(", bottom=");
        return a3.a.i(sb2, this.f3026d, ')');
    }
}
