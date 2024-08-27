package r0;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final z2.v f32428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32429b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32430c;

    public h1(z2.v vVar, boolean z10, boolean z11) {
        this.f32428a = vVar;
        this.f32429b = z10;
        this.f32430c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (this.f32428a == h1Var.f32428a && this.f32429b == h1Var.f32429b && this.f32430c == h1Var.f32430c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32430c) + v.e.d(this.f32429b, this.f32428a.hashCode() * 31, 31);
    }
}
