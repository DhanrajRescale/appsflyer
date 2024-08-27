package w2;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final float f38777a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38778b;

    public c(float f10, float f11) {
        this.f38777a = f10;
        this.f38778b = f11;
    }

    @Override // w2.b
    public final float Y() {
        return this.f38778b;
    }

    @Override // w2.b
    public final float b() {
        return this.f38777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f38777a, cVar.f38777a) == 0 && Float.compare(this.f38778b, cVar.f38778b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38778b) + (Float.hashCode(this.f38777a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f38777a);
        sb2.append(", fontScale=");
        return nn.d.l(sb2, this.f38778b, ')');
    }
}
