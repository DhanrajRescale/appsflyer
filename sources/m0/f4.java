package m0;

/* loaded from: classes.dex */
public final class f4 implements w1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f26165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.g1 f26166b;

    public f4(y yVar, y.g1 g1Var) {
        this.f26165a = yVar;
        this.f26166b = g1Var;
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        float e10;
        float i11;
        float f10;
        y.g1 g1Var = y.g1.f40724b;
        y.g1 g1Var2 = this.f26166b;
        if (g1Var2 == g1Var) {
            e10 = m1.c.d(j10);
        } else {
            e10 = m1.c.e(j10);
        }
        float f11 = s0.g.f34069a;
        if (e10 < s0.g.f34069a && dp.b.h1(i10, 1)) {
            y yVar = this.f26165a;
            float f12 = yVar.f(e10);
            t0.k1 k1Var = yVar.f27123j;
            if (Float.isNaN(k1Var.i())) {
                i11 = 0.0f;
            } else {
                i11 = k1Var.i();
            }
            k1Var.j(f12);
            float f13 = f12 - i11;
            if (g1Var2 == g1Var) {
                f10 = f13;
            } else {
                f10 = 0.0f;
            }
            if (g1Var2 == y.g1.f40723a) {
                f11 = f13;
            }
            return t0.t.g(f10, f11);
        }
        return m1.c.f27233b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(long r7, yt.a r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof m0.e4
            if (r0 == 0) goto L13
            r0 = r9
            m0.e4 r0 = (m0.e4) r0
            int r1 = r0.f26101d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26101d = r1
            goto L18
        L13:
            m0.e4 r0 = new m0.e4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f26099b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f26101d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            long r7 = r0.f26098a
            ut.n.b(r9)
            goto L78
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ut.n.b(r9)
            y.g1 r9 = y.g1.f40724b
            y.g1 r2 = r6.f26166b
            if (r2 != r9) goto L3f
            float r9 = w2.o.b(r7)
            goto L43
        L3f:
            float r9 = w2.o.c(r7)
        L43:
            m0.y r2 = r6.f26165a
            float r4 = r2.g()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L76
            m0.y3 r5 = r2.d()
            java.util.Map r5 = r5.f27137a
            java.util.Collection r5 = r5.values()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Float r5 = vt.g0.G(r5)
            if (r5 == 0) goto L65
            float r5 = r5.floatValue()
            goto L67
        L65:
            r5 = 2143289344(0x7fc00000, float:NaN)
        L67:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L76
            r0.f26098a = r7
            r0.f26101d = r3
            java.lang.Object r9 = r2.j(r9, r0)
            if (r9 != r1) goto L78
            return r1
        L76:
            long r7 = w2.o.f38808b
        L78:
            w2.o r9 = new w2.o
            r9.<init>(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f4.O(long, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r3, long r5, yt.a r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof m0.d4
            if (r3 == 0) goto L13
            r3 = r7
            m0.d4 r3 = (m0.d4) r3
            int r4 = r3.f26037d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f26037d = r4
            goto L18
        L13:
            m0.d4 r3 = new m0.d4
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f26035b
            zt.a r7 = zt.a.f42823a
            int r0 = r3.f26037d
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f26034a
            ut.n.b(r4)
            goto L50
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            ut.n.b(r4)
            y.g1 r4 = y.g1.f40724b
            y.g1 r0 = r2.f26166b
            if (r0 != r4) goto L3f
            float r4 = w2.o.b(r5)
            goto L43
        L3f:
            float r4 = w2.o.c(r5)
        L43:
            r3.f26034a = r5
            r3.f26037d = r1
            m0.y r0 = r2.f26165a
            java.lang.Object r3 = r0.j(r4, r3)
            if (r3 != r7) goto L50
            return r7
        L50:
            w2.o r3 = new w2.o
            r3.<init>(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.f4.f(long, long, yt.a):java.lang.Object");
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        float e10;
        float i11;
        float f10;
        if (dp.b.h1(i10, 1)) {
            y.g1 g1Var = y.g1.f40724b;
            y.g1 g1Var2 = this.f26166b;
            if (g1Var2 == g1Var) {
                e10 = m1.c.d(j11);
            } else {
                e10 = m1.c.e(j11);
            }
            y yVar = this.f26165a;
            float f11 = yVar.f(e10);
            t0.k1 k1Var = yVar.f27123j;
            boolean isNaN = Float.isNaN(k1Var.i());
            float f12 = s0.g.f34069a;
            if (isNaN) {
                i11 = 0.0f;
            } else {
                i11 = k1Var.i();
            }
            k1Var.j(f11);
            float f13 = f11 - i11;
            if (g1Var2 == g1Var) {
                f10 = f13;
            } else {
                f10 = 0.0f;
            }
            if (g1Var2 == y.g1.f40723a) {
                f12 = f13;
            }
            return t0.t.g(f10, f12);
        }
        return m1.c.f27233b;
    }
}
