package b0;

/* loaded from: classes.dex */
public final class i0 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2875a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2876b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2877c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2878d;

    public i0(float f10, float f11, float f12, float f13) {
        this.f2875a = f10;
        this.f2876b = f11;
        this.f2877c = f12;
        this.f2878d = f13;
    }

    @Override // b0.x1
    public final int a(w2.b bVar, w2.k kVar) {
        return bVar.m0(this.f2875a);
    }

    @Override // b0.x1
    public final int b(w2.b bVar) {
        return bVar.m0(this.f2878d);
    }

    @Override // b0.x1
    public final int c(w2.b bVar, w2.k kVar) {
        return bVar.m0(this.f2877c);
    }

    @Override // b0.x1
    public final int d(w2.b bVar) {
        return bVar.m0(this.f2876b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (w2.e.a(this.f2875a, i0Var.f2875a) && w2.e.a(this.f2876b, i0Var.f2876b) && w2.e.a(this.f2877c, i0Var.f2877c) && w2.e.a(this.f2878d, i0Var.f2878d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2878d) + v.e.a(this.f2877c, v.e.a(this.f2876b, Float.hashCode(this.f2875a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) w2.e.b(this.f2875a)) + ", top=" + ((Object) w2.e.b(this.f2876b)) + ", right=" + ((Object) w2.e.b(this.f2877c)) + ", bottom=" + ((Object) w2.e.b(this.f2878d)) + ')';
    }
}
