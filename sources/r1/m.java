package r1;

/* loaded from: classes.dex */
public final class m extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32982c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32983d;

    public m(float f10, float f11) {
        super(false, false, 3);
        this.f32982c = f10;
        this.f32983d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f32982c, mVar.f32982c) == 0 && Float.compare(this.f32983d, mVar.f32983d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32983d) + (Float.hashCode(this.f32982c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f32982c);
        sb2.append(", y=");
        return nn.d.l(sb2, this.f32983d, ')');
    }
}
