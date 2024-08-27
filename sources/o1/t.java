package o1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f29446a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29447b;

    public t(float f10, float f11) {
        this.f29446a = f10;
        this.f29447b = f11;
    }

    public final float[] a() {
        float f10 = this.f29446a;
        float f11 = this.f29447b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f29446a, tVar.f29446a) == 0 && Float.compare(this.f29447b, tVar.f29447b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29447b) + (Float.hashCode(this.f29446a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f29446a);
        sb2.append(", y=");
        return nn.d.l(sb2, this.f29447b, ')');
    }
}
