package r1;

/* loaded from: classes.dex */
public final class t extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f33009c;

    public t(float f10) {
        super(false, false, 3);
        this.f33009c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f33009c, ((t) obj).f33009c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33009c);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("RelativeHorizontalTo(dx="), this.f33009c, ')');
    }
}
