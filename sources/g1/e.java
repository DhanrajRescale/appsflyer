package g1;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f16395a;

    public e(float f10) {
        this.f16395a = f10;
    }

    public final int a(int i10, int i11, w2.k kVar) {
        float f10 = (i11 - i10) / 2.0f;
        w2.k kVar2 = w2.k.f38799a;
        float f11 = this.f16395a;
        if (kVar != kVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Float.compare(this.f16395a, ((e) obj).f16395a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16395a);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("Horizontal(bias="), this.f16395a, ')');
    }
}
