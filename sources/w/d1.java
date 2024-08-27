package w;

/* loaded from: classes.dex */
public final class d1 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f38461a;

    public d1(int i10) {
        this.f38461a = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d1) || ((d1) obj).f38461a != this.f38461a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f38461a;
    }

    @Override // w.n
    public final c2 a(y1 y1Var) {
        return new de.d(this.f38461a);
    }
}
