package r1;

/* loaded from: classes.dex */
public final class n extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32984c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32985d;

    public n(float f10, float f11) {
        super(false, false, 3);
        this.f32984c = f10;
        this.f32985d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f32984c, nVar.f32984c) == 0 && Float.compare(this.f32985d, nVar.f32985d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32985d) + (Float.hashCode(this.f32984c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f32984c);
        sb2.append(", y=");
        return nn.d.l(sb2, this.f32985d, ')');
    }
}
