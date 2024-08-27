package w;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f38670a;

    /* renamed from: b, reason: collision with root package name */
    public float f38671b;

    /* renamed from: c, reason: collision with root package name */
    public float f38672c;

    /* renamed from: d, reason: collision with root package name */
    public float f38673d;

    public s(float f10, float f11, float f12, float f13) {
        this.f38670a = f10;
        this.f38671b = f11;
        this.f38672c = f12;
        this.f38673d = f13;
    }

    @Override // w.t
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? s0.g.f34069a : this.f38673d : this.f38672c : this.f38671b : this.f38670a;
    }

    @Override // w.t
    public final int b() {
        return 4;
    }

    @Override // w.t
    public final t c() {
        return new s(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
    }

    @Override // w.t
    public final void d() {
        this.f38670a = s0.g.f34069a;
        this.f38671b = s0.g.f34069a;
        this.f38672c = s0.g.f34069a;
        this.f38673d = s0.g.f34069a;
    }

    @Override // w.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f38670a = f10;
            return;
        }
        if (i10 == 1) {
            this.f38671b = f10;
        } else if (i10 == 2) {
            this.f38672c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f38673d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f38670a == this.f38670a && sVar.f38671b == this.f38671b && sVar.f38672c == this.f38672c && sVar.f38673d == this.f38673d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38673d) + v.e.a(this.f38672c, v.e.a(this.f38671b, Float.hashCode(this.f38670a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f38670a + ", v2 = " + this.f38671b + ", v3 = " + this.f38672c + ", v4 = " + this.f38673d;
    }
}
