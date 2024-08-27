package w2;

/* loaded from: classes.dex */
public final class l implements x2.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f38802a;

    public l(float f10) {
        this.f38802a = f10;
    }

    @Override // x2.a
    public final float a(float f10) {
        return f10 / this.f38802a;
    }

    @Override // x2.a
    public final float b(float f10) {
        return f10 * this.f38802a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.f38802a, ((l) obj).f38802a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38802a);
    }

    public final String toString() {
        return nn.d.l(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f38802a, ')');
    }
}
