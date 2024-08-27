package b5;

/* loaded from: classes.dex */
public abstract class i implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f3349a = new h1();

    public final long a() {
        i5.g0 g0Var = (i5.g0) this;
        i1 w10 = g0Var.w();
        if (w10.q()) {
            return -9223372036854775807L;
        }
        return e5.x.P(w10.n(g0Var.s(), this.f3349a, 0L).f3345n);
    }

    public final boolean b(int i10) {
        i5.g0 g0Var = (i5.g0) this;
        g0Var.X();
        return g0Var.M.f3673a.f3586a.get(i10);
    }

    public final boolean c() {
        i5.g0 g0Var = (i5.g0) this;
        i1 w10 = g0Var.w();
        if (!w10.q() && w10.n(g0Var.s(), this.f3349a, 0L).f3340i) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        i5.g0 g0Var = (i5.g0) this;
        i1 w10 = g0Var.w();
        if (!w10.q() && w10.n(g0Var.s(), this.f3349a, 0L).a()) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        i5.g0 g0Var = (i5.g0) this;
        i1 w10 = g0Var.w();
        if (!w10.q() && w10.n(g0Var.s(), this.f3349a, 0L).f3339h) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        i5.g0 g0Var = (i5.g0) this;
        if (g0Var.B() == 3 && g0Var.A()) {
            g0Var.X();
            if (g0Var.f19459g0.f19374m == 0) {
                return true;
            }
        }
        return false;
    }

    public abstract void g(int i10, long j10, boolean z10);

    public final void h(int i10, long j10) {
        g(((i5.g0) this).s(), j10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r10 = this;
            r0 = r10
            i5.g0 r0 = (i5.g0) r0
            b5.i1 r1 = r0.w()
            boolean r1 = r1.q()
            if (r1 != 0) goto L8d
            boolean r1 = r0.E()
            if (r1 == 0) goto L15
            goto L8d
        L15:
            b5.i1 r1 = r0.w()
            boolean r2 = r1.q()
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            goto L3c
        L23:
            int r2 = r0.s()
            r0.X()
            int r6 = r0.E
            if (r6 != r4) goto L2f
            r6 = r5
        L2f:
            r0.X()
            boolean r7 = r0.F
            int r1 = r1.e(r2, r6, r7)
            if (r1 == r3) goto L3c
            r1 = r4
            goto L3d
        L3c:
            r1 = r5
        L3d:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L7a
            b5.i1 r1 = r0.w()
            boolean r2 = r1.q()
            if (r2 == 0) goto L50
            r1 = r3
            goto L65
        L50:
            int r2 = r0.s()
            r0.X()
            int r8 = r0.E
            if (r8 != r4) goto L5c
            r8 = r5
        L5c:
            r0.X()
            boolean r9 = r0.F
            int r1 = r1.e(r2, r8, r9)
        L65:
            if (r1 != r3) goto L68
            goto L8d
        L68:
            int r2 = r0.s()
            if (r1 != r2) goto L76
            int r0 = r0.s()
            r10.g(r0, r6, r4)
            goto L8d
        L76:
            r10.g(r1, r6, r5)
            goto L8d
        L7a:
            boolean r1 = r10.d()
            if (r1 == 0) goto L8d
            boolean r1 = r10.c()
            if (r1 == 0) goto L8d
            int r0 = r0.s()
            r10.g(r0, r6, r5)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i.i():void");
    }

    public final void j(int i10, long j10) {
        i5.g0 g0Var = (i5.g0) this;
        long u10 = g0Var.u() + j10;
        long z10 = g0Var.z();
        if (z10 != -9223372036854775807L) {
            u10 = Math.min(u10, z10);
        }
        h(i10, Math.max(u10, 0L));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r10 = this;
            r0 = r10
            i5.g0 r0 = (i5.g0) r0
            b5.i1 r1 = r0.w()
            boolean r1 = r1.q()
            if (r1 != 0) goto Ld1
            boolean r1 = r0.E()
            if (r1 == 0) goto L15
            goto Ld1
        L15:
            b5.i1 r1 = r0.w()
            boolean r2 = r1.q()
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            goto L3c
        L23:
            int r2 = r0.s()
            r0.X()
            int r6 = r0.E
            if (r6 != r4) goto L2f
            r6 = r5
        L2f:
            r0.X()
            boolean r7 = r0.F
            int r1 = r1.l(r2, r6, r7)
            if (r1 == r3) goto L3c
            r1 = r4
            goto L3d
        L3c:
            r1 = r5
        L3d:
            boolean r2 = r10.d()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L86
            boolean r2 = r10.e()
            if (r2 != 0) goto L86
            if (r1 == 0) goto Ld1
            b5.i1 r1 = r0.w()
            boolean r2 = r1.q()
            if (r2 == 0) goto L5c
            r1 = r3
            goto L71
        L5c:
            int r2 = r0.s()
            r0.X()
            int r8 = r0.E
            if (r8 != r4) goto L68
            r8 = r5
        L68:
            r0.X()
            boolean r9 = r0.F
            int r1 = r1.l(r2, r8, r9)
        L71:
            if (r1 != r3) goto L74
            goto Ld1
        L74:
            int r2 = r0.s()
            if (r1 != r2) goto L82
            int r0 = r0.s()
            r10.g(r0, r6, r4)
            goto Ld1
        L82:
            r10.g(r1, r6, r5)
            goto Ld1
        L86:
            if (r1 == 0) goto Lcb
            long r1 = r0.u()
            r0.X()
            r8 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto Lcb
            b5.i1 r1 = r0.w()
            boolean r2 = r1.q()
            if (r2 == 0) goto La1
            r1 = r3
            goto Lb6
        La1:
            int r2 = r0.s()
            r0.X()
            int r8 = r0.E
            if (r8 != r4) goto Lad
            r8 = r5
        Lad:
            r0.X()
            boolean r9 = r0.F
            int r1 = r1.l(r2, r8, r9)
        Lb6:
            if (r1 != r3) goto Lb9
            goto Ld1
        Lb9:
            int r2 = r0.s()
            if (r1 != r2) goto Lc7
            int r0 = r0.s()
            r10.g(r0, r6, r4)
            goto Ld1
        Lc7:
            r10.g(r1, r6, r5)
            goto Ld1
        Lcb:
            r0 = 0
            r2 = 7
            r10.h(r2, r0)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i.k():void");
    }
}
