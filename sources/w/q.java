package w;

/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f38641a;

    /* renamed from: b, reason: collision with root package name */
    public float f38642b;

    public q(float f10, float f11) {
        this.f38641a = f10;
        this.f38642b = f11;
    }

    @Override // w.t
    public final float a(int i10) {
        return i10 != 0 ? i10 != 1 ? s0.g.f34069a : this.f38642b : this.f38641a;
    }

    @Override // w.t
    public final int b() {
        return 2;
    }

    @Override // w.t
    public final t c() {
        return new q(s0.g.f34069a, s0.g.f34069a);
    }

    @Override // w.t
    public final void d() {
        this.f38641a = s0.g.f34069a;
        this.f38642b = s0.g.f34069a;
    }

    @Override // w.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f38641a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f38642b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.f38641a == this.f38641a && qVar.f38642b == this.f38642b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38642b) + (Float.hashCode(this.f38641a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f38641a + ", v2 = " + this.f38642b;
    }
}
