package o1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final double f29439a;

    /* renamed from: b, reason: collision with root package name */
    public final double f29440b;

    /* renamed from: c, reason: collision with root package name */
    public final double f29441c;

    /* renamed from: d, reason: collision with root package name */
    public final double f29442d;

    /* renamed from: e, reason: collision with root package name */
    public final double f29443e;

    /* renamed from: f, reason: collision with root package name */
    public final double f29444f;

    /* renamed from: g, reason: collision with root package name */
    public final double f29445g;

    public /* synthetic */ s(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.f29439a, sVar.f29439a) == 0 && Double.compare(this.f29440b, sVar.f29440b) == 0 && Double.compare(this.f29441c, sVar.f29441c) == 0 && Double.compare(this.f29442d, sVar.f29442d) == 0 && Double.compare(this.f29443e, sVar.f29443e) == 0 && Double.compare(this.f29444f, sVar.f29444f) == 0 && Double.compare(this.f29445g, sVar.f29445g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f29445g) + nn.d.c(this.f29444f, nn.d.c(this.f29443e, nn.d.c(this.f29442d, nn.d.c(this.f29441c, nn.d.c(this.f29440b, Double.hashCode(this.f29439a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f29439a + ", a=" + this.f29440b + ", b=" + this.f29441c + ", c=" + this.f29442d + ", d=" + this.f29443e + ", e=" + this.f29444f + ", f=" + this.f29445g + ')';
    }

    public s(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f29439a = d10;
        this.f29440b = d11;
        this.f29441c = d12;
        this.f29442d = d13;
        this.f29443e = d14;
        this.f29444f = d15;
        this.f29445g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
