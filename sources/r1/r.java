package r1;

/* loaded from: classes.dex */
public final class r extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32996c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32997d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32998e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f32999f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33000g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33001h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33002i;

    public r(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(false, false, 3);
        this.f32996c = f10;
        this.f32997d = f11;
        this.f32998e = f12;
        this.f32999f = z10;
        this.f33000g = z11;
        this.f33001h = f13;
        this.f33002i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f32996c, rVar.f32996c) == 0 && Float.compare(this.f32997d, rVar.f32997d) == 0 && Float.compare(this.f32998e, rVar.f32998e) == 0 && this.f32999f == rVar.f32999f && this.f33000g == rVar.f33000g && Float.compare(this.f33001h, rVar.f33001h) == 0 && Float.compare(this.f33002i, rVar.f33002i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33002i) + v.e.a(this.f33001h, v.e.d(this.f33000g, v.e.d(this.f32999f, v.e.a(this.f32998e, v.e.a(this.f32997d, Float.hashCode(this.f32996c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f32996c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f32997d);
        sb2.append(", theta=");
        sb2.append(this.f32998e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f32999f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f33000g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f33001h);
        sb2.append(", arcStartDy=");
        return nn.d.l(sb2, this.f33002i, ')');
    }
}
