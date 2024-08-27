package r1;

/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32840c;

    public a0(float f10) {
        super(false, false, 3);
        this.f32840c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Float.compare(this.f32840c, ((a0) obj).f32840c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32840c);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("VerticalTo(y="), this.f32840c, ')');
    }
}
