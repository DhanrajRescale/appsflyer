package r1;

/* loaded from: classes.dex */
public final class i extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32946c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32947d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32948e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f32949f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32950g;

    /* renamed from: h, reason: collision with root package name */
    public final float f32951h;

    /* renamed from: i, reason: collision with root package name */
    public final float f32952i;

    public i(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(false, false, 3);
        this.f32946c = f10;
        this.f32947d = f11;
        this.f32948e = f12;
        this.f32949f = z10;
        this.f32950g = z11;
        this.f32951h = f13;
        this.f32952i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f32946c, iVar.f32946c) == 0 && Float.compare(this.f32947d, iVar.f32947d) == 0 && Float.compare(this.f32948e, iVar.f32948e) == 0 && this.f32949f == iVar.f32949f && this.f32950g == iVar.f32950g && Float.compare(this.f32951h, iVar.f32951h) == 0 && Float.compare(this.f32952i, iVar.f32952i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32952i) + v.e.a(this.f32951h, v.e.d(this.f32950g, v.e.d(this.f32949f, v.e.a(this.f32948e, v.e.a(this.f32947d, Float.hashCode(this.f32946c) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f32946c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f32947d);
        sb2.append(", theta=");
        sb2.append(this.f32948e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f32949f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f32950g);
        sb2.append(", arcStartX=");
        sb2.append(this.f32951h);
        sb2.append(", arcStartY=");
        return nn.d.l(sb2, this.f32952i, ')');
    }
}
