package r1;

/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33024c;

    public z(float f10) {
        super(false, false, 3);
        this.f33024c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Float.compare(this.f33024c, ((z) obj).f33024c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33024c);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("RelativeVerticalTo(dy="), this.f33024c, ')');
    }
}
