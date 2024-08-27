package z2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f41973a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f41974b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41975c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41976d;

    public u(boolean z10, boolean z11, boolean z12, v vVar, boolean z13, boolean z14) {
        this.f41973a = z10;
        this.f41974b = z11;
        this.f41975c = z12;
        this.f41976d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f41973a == uVar.f41973a && this.f41974b == uVar.f41974b && this.f41975c == uVar.f41975c && this.f41976d == uVar.f41976d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.f41974b;
        return Boolean.hashCode(false) + v.e.d(this.f41976d, v.e.d(true, (v.f41977a.hashCode() + v.e.d(this.f41975c, v.e.d(z10, v.e.d(this.f41973a, Boolean.hashCode(z10) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public u(boolean z10, int i10) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0, (i10 & 4) != 0, v.f41977a, true, (i10 & 8) != 0);
    }
}
