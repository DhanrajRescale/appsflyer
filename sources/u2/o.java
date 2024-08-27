package u2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f36692c = new o(1.0f, s0.g.f34069a);

    /* renamed from: a, reason: collision with root package name */
    public final float f36693a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36694b;

    public o(float f10, float f11) {
        this.f36693a = f10;
        this.f36694b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f36693a == oVar.f36693a && this.f36694b == oVar.f36694b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36694b) + (Float.hashCode(this.f36693a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f36693a);
        sb2.append(", skewX=");
        return nn.d.l(sb2, this.f36694b, ')');
    }
}
