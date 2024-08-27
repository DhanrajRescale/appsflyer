package r1;

/* loaded from: classes.dex */
public final class k extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32961c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32962d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32963e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32964f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32965g;

    /* renamed from: h, reason: collision with root package name */
    public final float f32966h;

    public k(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(true, false, 2);
        this.f32961c = f10;
        this.f32962d = f11;
        this.f32963e = f12;
        this.f32964f = f13;
        this.f32965g = f14;
        this.f32966h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Float.compare(this.f32961c, kVar.f32961c) == 0 && Float.compare(this.f32962d, kVar.f32962d) == 0 && Float.compare(this.f32963e, kVar.f32963e) == 0 && Float.compare(this.f32964f, kVar.f32964f) == 0 && Float.compare(this.f32965g, kVar.f32965g) == 0 && Float.compare(this.f32966h, kVar.f32966h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32966h) + v.e.a(this.f32965g, v.e.a(this.f32964f, v.e.a(this.f32963e, v.e.a(this.f32962d, Float.hashCode(this.f32961c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f32961c);
        sb2.append(", y1=");
        sb2.append(this.f32962d);
        sb2.append(", x2=");
        sb2.append(this.f32963e);
        sb2.append(", y2=");
        sb2.append(this.f32964f);
        sb2.append(", x3=");
        sb2.append(this.f32965g);
        sb2.append(", y3=");
        return nn.d.l(sb2, this.f32966h, ')');
    }
}
