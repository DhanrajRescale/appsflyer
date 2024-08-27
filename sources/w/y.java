package w;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public double f38730a;

    /* renamed from: b, reason: collision with root package name */
    public double f38731b;

    public y(double d10, double d11) {
        this.f38730a = d10;
        this.f38731b = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Double.compare(this.f38730a, yVar.f38730a) == 0 && Double.compare(this.f38731b, yVar.f38731b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f38731b) + (Double.hashCode(this.f38730a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f38730a + ", _imaginary=" + this.f38731b + ')';
    }
}
