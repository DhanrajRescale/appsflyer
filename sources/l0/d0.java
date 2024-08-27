package l0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0.z0 f23737a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23738b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23739c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23740d;

    public d0(i0.z0 z0Var, long j10, int i10, boolean z10) {
        this.f23737a = z0Var;
        this.f23738b = j10;
        this.f23739c = i10;
        this.f23740d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f23737a == d0Var.f23737a && m1.c.b(this.f23738b, d0Var.f23738b) && this.f23739c == d0Var.f23739c && this.f23740d == d0Var.f23740d;
    }

    public final int hashCode() {
        int hashCode = this.f23737a.hashCode() * 31;
        int i10 = m1.c.f27236e;
        return Boolean.hashCode(this.f23740d) + ((w.k.e(this.f23739c) + v.e.c(this.f23738b, hashCode, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f23737a);
        sb2.append(", position=");
        sb2.append((Object) m1.c.j(this.f23738b));
        sb2.append(", anchor=");
        sb2.append(jr.h.C(this.f23739c));
        sb2.append(", visible=");
        return v.e.k(sb2, this.f23740d, ')');
    }
}
