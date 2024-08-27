package b0;

/* loaded from: classes.dex */
public final class j0 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2883a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f2884b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f2885c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2886d = 0;

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        return this.f2883a;
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        return this.f2886d;
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        return this.f2885c;
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        return this.f2884b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f2883a == j0Var.f2883a && this.f2884b == j0Var.f2884b && this.f2885c == j0Var.f2885c && this.f2886d == j0Var.f2886d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2883a * 31) + this.f2884b) * 31) + this.f2885c) * 31) + this.f2886d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f2883a);
        sb2.append(", top=");
        sb2.append(this.f2884b);
        sb2.append(", right=");
        sb2.append(this.f2885c);
        sb2.append(", bottom=");
        return a3.a.i(sb2, this.f2886d, ')');
    }
}
