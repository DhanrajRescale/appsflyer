package r1;

/* loaded from: classes.dex */
public final class l extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f32981c;

    public l(float f10) {
        super(false, false, 3);
        this.f32981c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f32981c, ((l) obj).f32981c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32981c);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("HorizontalTo(x="), this.f32981c, ')');
    }
}
