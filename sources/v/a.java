package v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f37475a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37476b;

    public a(float f10, float f11) {
        this.f37475a = f10;
        this.f37476b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f37475a, aVar.f37475a) == 0 && Float.compare(this.f37476b, aVar.f37476b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f37476b) + (Float.hashCode(this.f37475a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f37475a);
        sb2.append(", velocityCoefficient=");
        return nn.d.l(sb2, this.f37476b, ')');
    }
}
