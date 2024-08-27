package b5;

/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f3563a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3564b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3565c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3566d;

    static {
        boolean z10;
        p2.m mVar = new p2.m(0);
        if (mVar.f30590c <= mVar.f30591d) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        new p(mVar);
        int i10 = e5.x.f15050a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public p(p2.m mVar) {
        this.f3563a = mVar.f30589b;
        this.f3564b = mVar.f30590c;
        this.f3565c = mVar.f30591d;
        this.f3566d = (String) mVar.f30592e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f3563a == pVar.f3563a && this.f3564b == pVar.f3564b && this.f3565c == pVar.f3565c && e5.x.a(this.f3566d, pVar.f3566d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f3563a) * 31) + this.f3564b) * 31) + this.f3565c) * 31;
        String str = this.f3566d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
