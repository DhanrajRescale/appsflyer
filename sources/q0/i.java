package q0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f31500a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31501b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31502c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31503d;

    public i(float f10, float f11, float f12, float f13) {
        this.f31500a = f10;
        this.f31501b = f11;
        this.f31502c = f12;
        this.f31503d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f31500a == iVar.f31500a && this.f31501b == iVar.f31501b && this.f31502c == iVar.f31502c && this.f31503d == iVar.f31503d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31503d) + v.e.a(this.f31502c, v.e.a(this.f31501b, Float.hashCode(this.f31500a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.f31500a);
        sb2.append(", focusedAlpha=");
        sb2.append(this.f31501b);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.f31502c);
        sb2.append(", pressedAlpha=");
        return nn.d.l(sb2, this.f31503d, ')');
    }
}
