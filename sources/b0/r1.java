package b0;

/* loaded from: classes.dex */
public final class r1 extends g1.n implements c2.c0 {

    /* renamed from: n, reason: collision with root package name */
    public float f2987n;

    /* renamed from: o, reason: collision with root package name */
    public float f2988o;

    /* renamed from: p, reason: collision with root package name */
    public float f2989p;

    /* renamed from: q, reason: collision with root package name */
    public float f2990q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2991r;

    @Override // c2.c0
    public final int F(a2.r rVar, a2.q qVar, int i10) {
        long Q0 = Q0(rVar);
        if (w2.a.e(Q0)) {
            return w2.a.g(Q0);
        }
        return hl.f.K(qVar.e(i10), Q0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Q0(w2.b r8) {
        /*
            r7 = this;
            float r0 = r7.f2989p
            r1 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = w2.e.a(r0, r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L18
            float r0 = r7.f2989p
            int r0 = r8.m0(r0)
            if (r0 >= 0) goto L19
            r0 = r3
            goto L19
        L18:
            r0 = r2
        L19:
            float r4 = r7.f2990q
            boolean r4 = w2.e.a(r4, r1)
            if (r4 != 0) goto L2b
            float r4 = r7.f2990q
            int r4 = r8.m0(r4)
            if (r4 >= 0) goto L2c
            r4 = r3
            goto L2c
        L2b:
            r4 = r2
        L2c:
            float r5 = r7.f2987n
            boolean r5 = w2.e.a(r5, r1)
            if (r5 != 0) goto L43
            float r5 = r7.f2987n
            int r5 = r8.m0(r5)
            if (r5 <= r0) goto L3d
            r5 = r0
        L3d:
            if (r5 >= 0) goto L40
            r5 = r3
        L40:
            if (r5 == r2) goto L43
            goto L44
        L43:
            r5 = r3
        L44:
            float r6 = r7.f2988o
            boolean r1 = w2.e.a(r6, r1)
            if (r1 != 0) goto L5b
            float r1 = r7.f2988o
            int r8 = r8.m0(r1)
            if (r8 <= r4) goto L55
            r8 = r4
        L55:
            if (r8 >= 0) goto L58
            r8 = r3
        L58:
            if (r8 == r2) goto L5b
            r3 = r8
        L5b:
            long r0 = hl.f.b(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r1.Q0(w2.b):long");
    }

    @Override // c2.c0
    public final a2.n0 a(a2.o0 o0Var, a2.l0 l0Var, long j10) {
        int j11;
        int h10;
        int i10;
        int g10;
        long b10;
        a2.n0 n0;
        long Q0 = Q0(o0Var);
        if (this.f2991r) {
            b10 = hl.f.J(j10, Q0);
        } else {
            if (!w2.e.a(this.f2987n, Float.NaN)) {
                j11 = w2.a.j(Q0);
            } else {
                j11 = w2.a.j(j10);
                int h11 = w2.a.h(Q0);
                if (j11 > h11) {
                    j11 = h11;
                }
            }
            if (!w2.e.a(this.f2989p, Float.NaN)) {
                h10 = w2.a.h(Q0);
            } else {
                h10 = w2.a.h(j10);
                int j12 = w2.a.j(Q0);
                if (h10 < j12) {
                    h10 = j12;
                }
            }
            if (!w2.e.a(this.f2988o, Float.NaN)) {
                i10 = w2.a.i(Q0);
            } else {
                i10 = w2.a.i(j10);
                int g11 = w2.a.g(Q0);
                if (i10 > g11) {
                    i10 = g11;
                }
            }
            if (!w2.e.a(this.f2990q, Float.NaN)) {
                g10 = w2.a.g(Q0);
            } else {
                g10 = w2.a.g(j10);
                int i11 = w2.a.i(Q0);
                if (g10 < i11) {
                    g10 = i11;
                }
            }
            b10 = hl.f.b(j11, h10, i10, g10);
        }
        a2.a1 E = l0Var.E(b10);
        n0 = o0Var.n0(E.f29a, E.f30b, vt.p0.d(), new v.f(8, E));
        return n0;
    }

    @Override // c2.c0
    public final int d0(a2.r rVar, a2.q qVar, int i10) {
        long Q0 = Q0(rVar);
        if (w2.a.f(Q0)) {
            return w2.a.h(Q0);
        }
        return hl.f.L(qVar.D(i10), Q0);
    }

    @Override // c2.c0
    public final int l(a2.r rVar, a2.q qVar, int i10) {
        long Q0 = Q0(rVar);
        if (w2.a.e(Q0)) {
            return w2.a.g(Q0);
        }
        return hl.f.K(qVar.W(i10), Q0);
    }

    @Override // c2.c0
    public final int u0(a2.r rVar, a2.q qVar, int i10) {
        long Q0 = Q0(rVar);
        if (w2.a.f(Q0)) {
            return w2.a.h(Q0);
        }
        return hl.f.L(qVar.z(i10), Q0);
    }
}
