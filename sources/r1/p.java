package r1;

/* loaded from: classes.dex */
public final class p extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32990c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32991d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32992e;

    /* renamed from: f, reason: collision with root package name */
    public final float f32993f;

    public p(float f10, float f11, float f12, float f13) {
        super(true, false, 2);
        this.f32990c = f10;
        this.f32991d = f11;
        this.f32992e = f12;
        this.f32993f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f32990c, pVar.f32990c) == 0 && Float.compare(this.f32991d, pVar.f32991d) == 0 && Float.compare(this.f32992e, pVar.f32992e) == 0 && Float.compare(this.f32993f, pVar.f32993f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32993f) + v.e.a(this.f32992e, v.e.a(this.f32991d, Float.hashCode(this.f32990c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f32990c);
        sb2.append(", y1=");
        sb2.append(this.f32991d);
        sb2.append(", x2=");
        sb2.append(this.f32992e);
        sb2.append(", y2=");
        return nn.d.l(sb2, this.f32993f, ')');
    }
}
