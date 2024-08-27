package r1;

/* loaded from: classes.dex */
public final class w extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33014c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33015d;

    /* renamed from: e, reason: collision with root package name */
    public final float f33016e;

    /* renamed from: f, reason: collision with root package name */
    public final float f33017f;

    public w(float f10, float f11, float f12, float f13) {
        super(false, true, 1);
        this.f33014c = f10;
        this.f33015d = f11;
        this.f33016e = f12;
        this.f33017f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f33014c, wVar.f33014c) == 0 && Float.compare(this.f33015d, wVar.f33015d) == 0 && Float.compare(this.f33016e, wVar.f33016e) == 0 && Float.compare(this.f33017f, wVar.f33017f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33017f) + v.e.a(this.f33016e, v.e.a(this.f33015d, Float.hashCode(this.f33014c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f33014c);
        sb2.append(", dy1=");
        sb2.append(this.f33015d);
        sb2.append(", dx2=");
        sb2.append(this.f33016e);
        sb2.append(", dy2=");
        return nn.d.l(sb2, this.f33017f, ')');
    }
}
