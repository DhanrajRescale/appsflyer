package r1;

/* loaded from: classes.dex */
public final class v extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33012c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33013d;

    public v(float f10, float f11) {
        super(false, false, 3);
        this.f33012c = f10;
        this.f33013d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f33012c, vVar.f33012c) == 0 && Float.compare(this.f33013d, vVar.f33013d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33013d) + (Float.hashCode(this.f33012c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f33012c);
        sb2.append(", dy=");
        return nn.d.l(sb2, this.f33013d, ')');
    }
}
