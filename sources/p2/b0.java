package p2;

/* loaded from: classes.dex */
public final class b0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f30520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30521b;

    public b0(int i10, int i11) {
        this.f30520a = i10;
        this.f30521b = i11;
    }

    @Override // p2.i
    public final void a(k kVar) {
        int f10 = kotlin.ranges.d.f(this.f30520a, 0, kVar.f30582a.a());
        int f11 = kotlin.ranges.d.f(this.f30521b, 0, kVar.f30582a.a());
        if (f10 < f11) {
            kVar.f(f10, f11);
        } else {
            kVar.f(f11, f10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f30520a == b0Var.f30520a && this.f30521b == b0Var.f30521b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f30520a * 31) + this.f30521b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f30520a);
        sb2.append(", end=");
        return a3.a.i(sb2, this.f30521b, ')');
    }
}
