package r1;

/* loaded from: classes.dex */
public final class x extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33018c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33019d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33020e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33021f;

    public x(float f10, float f11, float f12, float f13) {
        super(true, false, 2);
        this.f33018c = f10;
        this.f33019d = f11;
        this.f33020e = f12;
        this.f33021f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f33018c, xVar.f33018c) == 0 && Float.compare(this.f33019d, xVar.f33019d) == 0 && Float.compare(this.f33020e, xVar.f33020e) == 0 && Float.compare(this.f33021f, xVar.f33021f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33021f) + v.e.a(this.f33020e, v.e.a(this.f33019d, Float.hashCode(this.f33018c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f33018c);
        sb2.append(", dy1=");
        sb2.append(this.f33019d);
        sb2.append(", dx2=");
        sb2.append(this.f33020e);
        sb2.append(", dy2=");
        return nn.d.l(sb2, this.f33021f, ')');
    }
}
