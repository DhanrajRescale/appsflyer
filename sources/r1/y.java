package r1;

/* loaded from: classes.dex */
public final class y extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33022c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33023d;

    public y(float f10, float f11) {
        super(false, true, 1);
        this.f33022c = f10;
        this.f33023d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Float.compare(this.f33022c, yVar.f33022c) == 0 && Float.compare(this.f33023d, yVar.f33023d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33023d) + (Float.hashCode(this.f33022c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f33022c);
        sb2.append(", dy=");
        return nn.d.l(sb2, this.f33023d, ')');
    }
}
