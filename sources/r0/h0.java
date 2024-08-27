package r0;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f32422a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32423b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32425d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32426e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32427f;

    public h0(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f32422a = f10;
        this.f32423b = f11;
        this.f32424c = f12;
        this.f32425d = f13;
        this.f32426e = f14;
        this.f32427f = f15;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t0.l3 a(boolean r15, a0.l r16, t0.n r17, int r18) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h0.a(boolean, a0.l, t0.n, int):t0.l3");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (w2.e.a(this.f32422a, h0Var.f32422a) && w2.e.a(this.f32423b, h0Var.f32423b) && w2.e.a(this.f32424c, h0Var.f32424c) && w2.e.a(this.f32425d, h0Var.f32425d) && w2.e.a(this.f32427f, h0Var.f32427f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32427f) + v.e.a(this.f32425d, v.e.a(this.f32424c, v.e.a(this.f32423b, Float.hashCode(this.f32422a) * 31, 31), 31), 31);
    }
}
