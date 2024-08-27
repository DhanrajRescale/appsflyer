package w;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: a, reason: collision with root package name */
    public float f38635a;

    public p(float f10) {
        this.f38635a = f10;
    }

    @Override // w.t
    public final float a(int i10) {
        return i10 == 0 ? this.f38635a : s0.g.f34069a;
    }

    @Override // w.t
    public final int b() {
        return 1;
    }

    @Override // w.t
    public final t c() {
        return new p(s0.g.f34069a);
    }

    @Override // w.t
    public final void d() {
        this.f38635a = s0.g.f34069a;
    }

    @Override // w.t
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f38635a = f10;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof p) && ((p) obj).f38635a == this.f38635a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38635a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f38635a;
    }
}
