package m0;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26623a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26624b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26625c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26626d;

    public p1(float f10, float f11, float f12, float f13) {
        this.f26623a = f10;
        this.f26624b = f11;
        this.f26625c = f12;
        this.f26626d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        if (!w2.e.a(this.f26623a, p1Var.f26623a) || !w2.e.a(this.f26624b, p1Var.f26624b) || !w2.e.a(this.f26625c, p1Var.f26625c)) {
            return false;
        }
        return w2.e.a(this.f26626d, p1Var.f26626d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26626d) + v.e.a(this.f26625c, v.e.a(this.f26624b, Float.hashCode(this.f26623a) * 31, 31), 31);
    }
}
