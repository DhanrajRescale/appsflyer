package r1;

/* loaded from: classes.dex */
public final class s extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33003c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33004d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33005e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33006f;

    /* renamed from: g, reason: collision with root package name */
    public final float f33007g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33008h;

    public s(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(true, false, 2);
        this.f33003c = f10;
        this.f33004d = f11;
        this.f33005e = f12;
        this.f33006f = f13;
        this.f33007g = f14;
        this.f33008h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f33003c, sVar.f33003c) == 0 && Float.compare(this.f33004d, sVar.f33004d) == 0 && Float.compare(this.f33005e, sVar.f33005e) == 0 && Float.compare(this.f33006f, sVar.f33006f) == 0 && Float.compare(this.f33007g, sVar.f33007g) == 0 && Float.compare(this.f33008h, sVar.f33008h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33008h) + v.e.a(this.f33007g, v.e.a(this.f33006f, v.e.a(this.f33005e, v.e.a(this.f33004d, Float.hashCode(this.f33003c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f33003c);
        sb2.append(", dy1=");
        sb2.append(this.f33004d);
        sb2.append(", dx2=");
        sb2.append(this.f33005e);
        sb2.append(", dy2=");
        sb2.append(this.f33006f);
        sb2.append(", dx3=");
        sb2.append(this.f33007g);
        sb2.append(", dy3=");
        return nn.d.l(sb2, this.f33008h, ')');
    }
}
