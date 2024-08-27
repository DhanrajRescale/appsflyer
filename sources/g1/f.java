package g1;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f16396a;

    public f(float f10) {
        this.f16396a = f10;
    }

    public final int a(int i10, int i11) {
        return Math.round((1 + this.f16396a) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Float.compare(this.f16396a, ((f) obj).f16396a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16396a);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("Vertical(bias="), this.f16396a, ')');
    }
}
