package f8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15979a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15980b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15981c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15982d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f15979a == aVar.f15979a && this.f15980b == aVar.f15980b && this.f15981c == aVar.f15981c && this.f15982d == aVar.f15982d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z10 = this.f15980b;
        ?? r12 = this.f15979a;
        int i10 = r12;
        if (z10) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.f15981c) {
            i11 = i10 + 256;
        }
        return this.f15982d ? i11 + 4096 : i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f15979a), Boolean.valueOf(this.f15980b), Boolean.valueOf(this.f15981c), Boolean.valueOf(this.f15982d));
    }
}
