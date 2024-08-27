package p4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public double f30663a;

    /* renamed from: b, reason: collision with root package name */
    public double f30664b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30665c;

    /* renamed from: d, reason: collision with root package name */
    public double f30666d;

    /* renamed from: e, reason: collision with root package name */
    public double f30667e;

    /* renamed from: f, reason: collision with root package name */
    public double f30668f;

    /* renamed from: g, reason: collision with root package name */
    public double f30669g;

    /* renamed from: h, reason: collision with root package name */
    public double f30670h;

    /* renamed from: i, reason: collision with root package name */
    public double f30671i;

    /* renamed from: j, reason: collision with root package name */
    public final e f30672j;

    /* JADX WARN: Type inference failed for: r0v5, types: [p4.e, java.lang.Object] */
    public l() {
        this.f30663a = Math.sqrt(1500.0d);
        this.f30664b = 0.5d;
        this.f30665c = false;
        this.f30671i = Double.MAX_VALUE;
        this.f30672j = new Object();
    }

    public final void a() {
        this.f30664b = 1.0f;
        this.f30665c = false;
    }

    public final void b(float f10) {
        if (f10 > s0.g.f34069a) {
            this.f30663a = Math.sqrt(f10);
            this.f30665c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e c(double d10, double d11, long j10) {
        double cos;
        double d12;
        if (!this.f30665c) {
            if (this.f30671i != Double.MAX_VALUE) {
                double d13 = this.f30664b;
                if (d13 > 1.0d) {
                    double d14 = this.f30663a;
                    this.f30668f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                    double d15 = this.f30664b;
                    double d16 = this.f30663a;
                    this.f30669g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
                } else if (d13 >= 0.0d && d13 < 1.0d) {
                    this.f30670h = Math.sqrt(1.0d - (d13 * d13)) * this.f30663a;
                }
                this.f30665c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d17 = j10 / 1000.0d;
        double d18 = d10 - this.f30671i;
        double d19 = this.f30664b;
        if (d19 > 1.0d) {
            double d20 = this.f30669g;
            double d21 = this.f30668f;
            double d22 = d18 - (((d20 * d18) - d11) / (d20 - d21));
            double d23 = ((d18 * d20) - d11) / (d20 - d21);
            d12 = (Math.pow(2.718281828459045d, this.f30668f * d17) * d23) + (Math.pow(2.718281828459045d, d20 * d17) * d22);
            double d24 = this.f30669g;
            double pow = Math.pow(2.718281828459045d, d24 * d17) * d22 * d24;
            double d25 = this.f30668f;
            cos = (Math.pow(2.718281828459045d, d25 * d17) * d23 * d25) + pow;
        } else if (d19 == 1.0d) {
            double d26 = this.f30663a;
            double d27 = (d26 * d18) + d11;
            double d28 = (d27 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d26) * d17) * d28;
            double pow3 = Math.pow(2.718281828459045d, (-this.f30663a) * d17) * d28;
            double d29 = this.f30663a;
            cos = (Math.pow(2.718281828459045d, (-d29) * d17) * d27) + (pow3 * (-d29));
            d12 = pow2;
        } else {
            double d30 = 1.0d / this.f30670h;
            double d31 = this.f30663a;
            double d32 = ((d19 * d31 * d18) + d11) * d30;
            double sin = ((Math.sin(this.f30670h * d17) * d32) + (Math.cos(this.f30670h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d31 * d17);
            double d33 = this.f30663a;
            double d34 = this.f30664b;
            double d35 = (-d33) * sin * d34;
            double pow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d17);
            double d36 = this.f30670h;
            double sin2 = Math.sin(d36 * d17) * (-d36) * d18;
            double d37 = this.f30670h;
            cos = (((Math.cos(d37 * d17) * d32 * d37) + sin2) * pow4) + d35;
            d12 = sin;
        }
        float f10 = (float) (d12 + this.f30671i);
        e eVar = this.f30672j;
        eVar.f30635a = f10;
        eVar.f30636b = (float) cos;
        return eVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [p4.e, java.lang.Object] */
    public l(float f10) {
        this.f30663a = Math.sqrt(1500.0d);
        this.f30664b = 0.5d;
        this.f30665c = false;
        this.f30672j = new Object();
        this.f30671i = f10;
    }
}
