package r1;

/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33010c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33011d;

    public u(float f10, float f11) {
        super(false, false, 3);
        this.f33010c = f10;
        this.f33011d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f33010c, uVar.f33010c) == 0 && Float.compare(this.f33011d, uVar.f33011d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33011d) + (Float.hashCode(this.f33010c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f33010c);
        sb2.append(", dy=");
        return nn.d.l(sb2, this.f33011d, ')');
    }
}
