package g1;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f16397a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16398b;

    public g(float f10, float f11) {
        this.f16397a = f10;
        this.f16398b = f11;
    }

    public final long a(long j10, long j11, w2.k kVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        w2.k kVar2 = w2.k.f38799a;
        float f12 = this.f16397a;
        if (kVar != kVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        return hl.f.j(Math.round((f12 + f13) * f10), Math.round((f13 + this.f16398b) * f11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f16397a, gVar.f16397a) == 0 && Float.compare(this.f16398b, gVar.f16398b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16398b) + (Float.hashCode(this.f16397a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f16397a);
        sb2.append(", verticalBias=");
        return nn.d.l(sb2, this.f16398b, ')');
    }
}
