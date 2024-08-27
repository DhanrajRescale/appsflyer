package zi;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f42515a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42516b;

    public p(long j10, float f10) {
        this.f42515a = j10;
        this.f42516b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f42515a == pVar.f42515a && Float.compare(this.f42516b, pVar.f42516b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42516b) + (Long.hashCode(this.f42515a) * 31);
    }

    public final String toString() {
        return "StockChartDataPoint(timestamp=" + this.f42515a + ", value=" + this.f42516b + ")";
    }
}
