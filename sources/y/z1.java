package y;

/* loaded from: classes.dex */
public final class z1 implements w1.a {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f41010a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41011b;

    public z1(j2 j2Var, boolean z10) {
        this.f41010a = j2Var;
        this.f41011b = z10;
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        if (dp.b.h1(i10, 2)) {
            this.f41010a.f40802g.setValue(Boolean.TRUE);
        }
        return m1.c.f27233b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r3, long r5, yt.a r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof y.y1
            if (r3 == 0) goto L13
            r3 = r7
            y.y1 r3 = (y.y1) r3
            int r4 = r3.f41003e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f41003e = r4
            goto L18
        L13:
            y.y1 r3 = new y.y1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f41001c
            zt.a r7 = zt.a.f42823a
            int r0 = r3.f41003e
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f41000b
            y.z1 r3 = r3.f40999a
            ut.n.b(r4)
            goto L4a
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            ut.n.b(r4)
            boolean r4 = r2.f41011b
            if (r4 == 0) goto L53
            r3.f40999a = r2
            r3.f41000b = r5
            r3.f41003e = r1
            y.j2 r4 = r2.f41010a
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L49
            return r7
        L49:
            r3 = r2
        L4a:
            w2.o r4 = (w2.o) r4
            long r0 = r4.f38810a
            long r4 = w2.o.d(r5, r0)
            goto L56
        L53:
            long r4 = w2.o.f38808b
            r3 = r2
        L56:
            w2.o r6 = new w2.o
            r6.<init>(r4)
            y.j2 r3 = r3.f41010a
            t0.n1 r3 = r3.f40802g
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y.z1.f(long, long, yt.a):java.lang.Object");
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        float e10;
        if (this.f41011b) {
            j2 j2Var = this.f41010a;
            if (j2Var.f40796a.a()) {
                return m1.c.f27233b;
            }
            d2 d2Var = j2Var.f40796a;
            if (j2Var.f40797b == g1.f40724b) {
                e10 = m1.c.d(j11);
            } else {
                e10 = m1.c.e(j11);
            }
            if (j2Var.f40799d) {
                e10 *= -1;
            }
            float e11 = d2Var.e(e10);
            if (j2Var.f40799d) {
                e11 *= -1;
            }
            return j2Var.d(e11);
        }
        return m1.c.f27233b;
    }
}
