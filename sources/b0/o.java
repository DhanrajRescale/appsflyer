package b0;

/* loaded from: classes.dex */
public final class o extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f2957n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2958o;

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 / this.f2957n);
        }
        return qVar.e(i10);
    }

    public final long Q0(long j10, boolean z10) {
        int round;
        int g10 = w2.a.g(j10);
        if (g10 != Integer.MAX_VALUE && (round = Math.round(g10 * this.f2957n)) > 0) {
            long k10 = hl.f.k(round, g10);
            if (!z10 || hl.f.x0(j10, k10)) {
                return k10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long R0(long j10, boolean z10) {
        int round;
        int h10 = w2.a.h(j10);
        if (h10 != Integer.MAX_VALUE && (round = Math.round(h10 / this.f2957n)) > 0) {
            long k10 = hl.f.k(h10, round);
            if (!z10 || hl.f.x0(j10, k10)) {
                return k10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long S0(long j10, boolean z10) {
        int i10 = w2.a.i(j10);
        int round = Math.round(i10 * this.f2957n);
        if (round > 0) {
            long k10 = hl.f.k(round, i10);
            if (!z10 || hl.f.x0(j10, k10)) {
                return k10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long T0(long j10, boolean z10) {
        int j11 = w2.a.j(j10);
        int round = Math.round(j11 / this.f2957n);
        if (round > 0) {
            long k10 = hl.f.k(j11, round);
            if (!z10 || hl.f.x0(j10, k10)) {
                return k10;
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (w2.j.a(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
    
        if (w2.j.a(r5, 0) == false) goto L53;
     */
    @Override // c2.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final a2.n0 a(a2.o0 r8, a2.l0 r9, long r10) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o.a(a2.o0, a2.l0, long):a2.n0");
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 * this.f2957n);
        }
        return qVar.D(i10);
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 / this.f2957n);
        }
        return qVar.W(i10);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return Math.round(i10 * this.f2957n);
        }
        return qVar.z(i10);
    }
}
