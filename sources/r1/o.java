package r1;

/* loaded from: classes.dex */
public final class o extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32986c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32987d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32988e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32989f;

    public o(float f10, float f11, float f12, float f13) {
        super(false, true, 1);
        this.f32986c = f10;
        this.f32987d = f11;
        this.f32988e = f12;
        this.f32989f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f32986c, oVar.f32986c) == 0 && Float.compare(this.f32987d, oVar.f32987d) == 0 && Float.compare(this.f32988e, oVar.f32988e) == 0 && Float.compare(this.f32989f, oVar.f32989f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32989f) + v.e.a(this.f32988e, v.e.a(this.f32987d, Float.hashCode(this.f32986c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f32986c);
        sb2.append(", y1=");
        sb2.append(this.f32987d);
        sb2.append(", x2=");
        sb2.append(this.f32988e);
        sb2.append(", y2=");
        return nn.d.l(sb2, this.f32989f, ')');
    }
}
