package nu;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f29169a = s0.g.f34069a;

    /* renamed from: b, reason: collision with root package name */
    public final float f29170b = s0.g.f34069a;

    @Override // nu.e
    public final Comparable b() {
        return Float.valueOf(this.f29169a);
    }

    @Override // nu.e
    public final Comparable e() {
        return Float.valueOf(this.f29170b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.f29169a > r2.f29170b) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nu.c
            if (r0 == 0) goto L28
            float r0 = r4.f29169a
            float r1 = r4.f29170b
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L18
            r2 = r5
            nu.c r2 = (nu.c) r2
            float r3 = r2.f29169a
            float r2 = r2.f29170b
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            goto L26
        L18:
            nu.c r5 = (nu.c) r5
            float r2 = r5.f29169a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            float r5 = r5.f29170b
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L28
        L26:
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        float f10 = this.f29169a;
        float f11 = this.f29170b;
        if (f10 > f11) {
            return -1;
        }
        return (Float.hashCode(f10) * 31) + Float.hashCode(f11);
    }

    public final String toString() {
        return this.f29169a + ".." + this.f29170b;
    }
}
