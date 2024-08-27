package r1;

/* loaded from: classes.dex */
public final class q extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32994c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32995d;

    public q(float f10, float f11) {
        super(false, true, 1);
        this.f32994c = f10;
        this.f32995d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f32994c, qVar.f32994c) == 0 && Float.compare(this.f32995d, qVar.f32995d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32995d) + (Float.hashCode(this.f32994c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f32994c);
        sb2.append(", y=");
        return nn.d.l(sb2, this.f32995d, ')');
    }
}
