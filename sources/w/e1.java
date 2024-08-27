package w;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public float f38473a;

    /* renamed from: b, reason: collision with root package name */
    public double f38474b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38475c;

    /* renamed from: d, reason: collision with root package name */
    public double f38476d;

    /* renamed from: e, reason: collision with root package name */
    public double f38477e;

    /* renamed from: f, reason: collision with root package name */
    public double f38478f;

    /* renamed from: g, reason: collision with root package name */
    public float f38479g;

    public final long a(float f10, float f11, long j10) {
        double cos;
        double d10;
        if (!this.f38475c) {
            if (this.f38473a != Float.MAX_VALUE) {
                float f12 = this.f38479g;
                double d11 = f12;
                double d12 = d11 * d11;
                if (f12 > 1.0f) {
                    double d13 = this.f38474b;
                    double d14 = d12 - 1;
                    this.f38476d = (Math.sqrt(d14) * d13) + ((-f12) * d13);
                    double d15 = -this.f38479g;
                    double d16 = this.f38474b;
                    this.f38477e = (d15 * d16) - (Math.sqrt(d14) * d16);
                } else if (f12 >= s0.g.f34069a && f12 < 1.0f) {
                    this.f38478f = Math.sqrt(1 - d12) * this.f38474b;
                }
                this.f38475c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f13 = f10 - this.f38473a;
        double d17 = j10 / 1000.0d;
        float f14 = this.f38479g;
        if (f14 > 1.0f) {
            double d18 = f13;
            double d19 = this.f38477e;
            double d20 = f11;
            double d21 = this.f38476d;
            double d22 = d18 - (((d19 * d18) - d20) / (d19 - d21));
            double d23 = ((d18 * d19) - d20) / (d19 - d21);
            d10 = (Math.exp(this.f38476d * d17) * d23) + (Math.exp(d19 * d17) * d22);
            double d24 = this.f38477e;
            double exp = Math.exp(d24 * d17) * d22 * d24;
            double d25 = this.f38476d;
            cos = (Math.exp(d25 * d17) * d23 * d25) + exp;
        } else if (f14 == 1.0f) {
            double d26 = this.f38474b;
            double d27 = f13;
            double d28 = (d26 * d27) + f11;
            double d29 = (d28 * d17) + d27;
            d10 = Math.exp((-d26) * d17) * d29;
            double exp2 = Math.exp((-this.f38474b) * d17) * d29;
            double d30 = this.f38474b;
            cos = (Math.exp((-d30) * d17) * d28) + (exp2 * (-d30));
        } else {
            double d31 = 1 / this.f38478f;
            double d32 = this.f38474b;
            double d33 = f13;
            double d34 = ((f14 * d32 * d33) + f11) * d31;
            double exp3 = Math.exp((-f14) * d32 * d17) * ((Math.sin(this.f38478f * d17) * d34) + (Math.cos(this.f38478f * d17) * d33));
            double d35 = this.f38474b;
            double d36 = (-d35) * exp3 * this.f38479g;
            double exp4 = Math.exp((-r7) * d35 * d17);
            double d37 = this.f38478f;
            double sin = Math.sin(d37 * d17) * (-d37) * d33;
            double d38 = this.f38478f;
            cos = (((Math.cos(d38 * d17) * d34 * d38) + sin) * exp4) + d36;
            d10 = exp3;
        }
        return (Float.floatToRawIntBits((float) cos) & 4294967295L) | (Float.floatToRawIntBits((float) (d10 + this.f38473a)) << 32);
    }
}
