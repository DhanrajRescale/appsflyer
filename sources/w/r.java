package w;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f38660a;

    /* renamed from: b, reason: collision with root package name */
    public float f38661b;

    /* renamed from: c, reason: collision with root package name */
    public float f38662c;

    public r(float f10, float f11, float f12) {
        this.f38660a = f10;
        this.f38661b = f11;
        this.f38662c = f12;
    }

    @Override // w.t
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? s0.g.f34069a : this.f38662c : this.f38661b : this.f38660a;
    }

    @Override // w.t
    public final int b() {
        return 3;
    }

    @Override // w.t
    public final t c() {
        return new r(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
    }

    @Override // w.t
    public final void d() {
        this.f38660a = s0.g.f34069a;
        this.f38661b = s0.g.f34069a;
        this.f38662c = s0.g.f34069a;
    }

    @Override // w.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f38660a = f10;
        } else if (i10 == 1) {
            this.f38661b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f38662c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.f38660a == this.f38660a && rVar.f38661b == this.f38661b && rVar.f38662c == this.f38662c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38662c) + v.e.a(this.f38661b, Float.hashCode(this.f38660a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f38660a + ", v2 = " + this.f38661b + ", v3 = " + this.f38662c;
    }
}
