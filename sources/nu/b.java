package nu;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final double f29167a = 0.0d;

    /* renamed from: b, reason: collision with root package name */
    public final double f29168b = 100.0d;

    public final boolean a(Double d10) {
        double doubleValue = d10.doubleValue();
        if (doubleValue >= this.f29167a && doubleValue <= this.f29168b) {
            return true;
        }
        return false;
    }

    @Override // nu.e
    public final Comparable b() {
        return Double.valueOf(this.f29167a);
    }

    @Override // nu.e
    public final Comparable e() {
        return Double.valueOf(this.f29168b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4.f29167a > r4.f29168b) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof nu.b
            if (r0 == 0) goto L28
            double r0 = r9.f29167a
            double r2 = r9.f29168b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            r4 = r10
            nu.b r4 = (nu.b) r4
            double r5 = r4.f29167a
            double r7 = r4.f29168b
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L26
        L18:
            nu.b r10 = (nu.b) r10
            double r4 = r10.f29167a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L28
            double r0 = r10.f29168b
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L28
        L26:
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        double d10 = this.f29167a;
        double d11 = this.f29168b;
        if (d10 > d11) {
            return -1;
        }
        return (Double.hashCode(d10) * 31) + Double.hashCode(d11);
    }

    public final String toString() {
        return this.f29167a + ".." + this.f29168b;
    }
}
