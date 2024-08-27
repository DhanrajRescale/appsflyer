package y;

import t0.o3;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public d2 f40796a;

    /* renamed from: b, reason: collision with root package name */
    public g1 f40797b;

    /* renamed from: c, reason: collision with root package name */
    public x.a2 f40798c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40799d;

    /* renamed from: e, reason: collision with root package name */
    public x0 f40800e;

    /* renamed from: f, reason: collision with root package name */
    public w1.d f40801f;

    /* renamed from: g, reason: collision with root package name */
    public final t0.n1 f40802g = t0.t.n0(Boolean.FALSE, o3.f35116a);

    public j2(d2 d2Var, g1 g1Var, x.a2 a2Var, boolean z10, x0 x0Var, w1.d dVar) {
        this.f40796a = d2Var;
        this.f40797b = g1Var;
        this.f40798c = a2Var;
        this.f40799d = z10;
        this.f40800e = x0Var;
        this.f40801f = dVar;
    }

    public final long a(q1 q1Var, long j10, int i10) {
        x.p2 p2Var = new x.p2(this, i10, q1Var, 1);
        x.a2 a2Var = this.f40798c;
        if (dp.b.h1(i10, 4)) {
            return ((m1.c) p2Var.invoke(new m1.c(j10))).f27237a;
        }
        if (a2Var != null && (this.f40796a.d() || this.f40796a.c())) {
            return a2Var.a(j10, i10, p2Var);
        }
        return ((m1.c) p2Var.invoke(new m1.c(j10))).f27237a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [iu.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r12, yt.a r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof y.e2
            if (r0 == 0) goto L13
            r0 = r14
            y.e2 r0 = (y.e2) r0
            int r1 = r0.f40676d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40676d = r1
            goto L18
        L13:
            y.e2 r0 = new y.e2
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f40674b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40676d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            iu.y r12 = r0.f40673a
            ut.n.b(r14)
            goto L55
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            ut.n.b(r14)
            iu.y r14 = new iu.y
            r14.<init>()
            r14.f20559a = r12
            y.d2 r2 = r11.f40796a
            y.g2 r10 = new y.g2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r14
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            r0.f40673a = r14
            r0.f40676d = r3
            x.s1 r12 = x.s1.f39717a
            java.lang.Object r12 = r2.b(r12, r10, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            r12 = r14
        L55:
            long r12 = r12.f20559a
            w2.o r14 = new w2.o
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: y.j2.b(long, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(float r8, yt.a r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof y.h2
            if (r0 == 0) goto L13
            r0 = r9
            y.h2 r0 = (y.h2) r0
            int r1 = r0.f40754d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40754d = r1
            goto L18
        L13:
            y.h2 r0 = new y.h2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f40752b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40754d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            y.j2 r8 = r0.f40751a
            ut.n.b(r9)
            goto L8a
        L35:
            ut.n.b(r9)
            t0.n1 r9 = r7.f40802g
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r9.setValue(r2)
            y.g1 r9 = r7.f40797b
            y.g1 r2 = y.g1.f40724b
            r5 = 0
            if (r9 != r2) goto L48
            r2 = r8
            goto L49
        L48:
            r2 = r5
        L49:
            y.g1 r6 = y.g1.f40723a
            if (r9 != r6) goto L4e
            goto L4f
        L4e:
            r8 = r5
        L4f:
            long r8 = hl.f.n(r2, r8)
            y.i2 r2 = new y.i2
            r5 = 0
            r2.<init>(r7, r5)
            x.a2 r5 = r7.f40798c
            if (r5 == 0) goto L7a
            y.d2 r6 = r7.f40796a
            boolean r6 = r6.d()
            if (r6 != 0) goto L6d
            y.d2 r6 = r7.f40796a
            boolean r6 = r6.c()
            if (r6 == 0) goto L7a
        L6d:
            r0.f40751a = r7
            r0.f40754d = r4
            java.lang.Object r8 = r5.d(r8, r2, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            r8 = r7
            goto L8a
        L7a:
            w2.o r4 = new w2.o
            r4.<init>(r8)
            r0.f40751a = r7
            r0.f40754d = r3
            java.lang.Object r8 = r2.invoke(r4, r0)
            if (r8 != r1) goto L78
            return r1
        L8a:
            t0.n1 r8 = r8.f40802g
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y.j2.c(float, yt.a):java.lang.Object");
    }

    public final long d(float f10) {
        if (f10 == s0.g.f34069a) {
            int i10 = m1.c.f27236e;
            return m1.c.f27233b;
        }
        if (this.f40797b == g1.f40724b) {
            return t0.t.g(f10, s0.g.f34069a);
        }
        return t0.t.g(s0.g.f34069a, f10);
    }
}
