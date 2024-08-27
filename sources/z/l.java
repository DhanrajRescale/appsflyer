package z;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final float f41888a = 400;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v2, types: [iu.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(y.q1 r13, float r14, w.o r15, w.b0 r16, z.d r17, yt.a r18) {
        /*
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof z.i
            if (r2 == 0) goto L16
            r2 = r1
            z.i r2 = (z.i) r2
            int r3 = r2.f41876e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f41876e = r3
            goto L1b
        L16:
            z.i r2 = new z.i
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f41875d
            zt.a r3 = zt.a.f42823a
            int r4 = r2.f41876e
            r5 = 1
            if (r4 == 0) goto L38
            if (r4 != r5) goto L30
            float r0 = r2.f41872a
            iu.w r3 = r2.f41874c
            w.o r2 = r2.f41873b
            ut.n.b(r1)
            goto L74
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            ut.n.b(r1)
            iu.w r1 = new iu.w
            r1.<init>()
            java.lang.Object r4 = r15.b()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L51
            r4 = r5
            goto L52
        L51:
            r4 = 0
        L52:
            r4 = r4 ^ r5
            z.j r12 = new z.j
            r11 = 0
            r6 = r12
            r7 = r14
            r8 = r1
            r9 = r13
            r10 = r17
            r6.<init>(r7, r8, r9, r10, r11)
            r2.f41873b = r0
            r2.f41874c = r1
            r6 = r14
            r2.f41872a = r6
            r2.f41876e = r5
            r5 = r16
            java.lang.Object r2 = w.e.f(r15, r5, r4, r12, r2)
            if (r2 != r3) goto L71
            goto L82
        L71:
            r2 = r0
            r3 = r1
            r0 = r6
        L74:
            z.a r1 = new z.a
            float r3 = r3.f20557a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r1.<init>(r3, r2)
            r3 = r1
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l.a(y.q1, float, w.o, w.b0, z.d, yt.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r1v2, types: [iu.w, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(y.q1 r17, float r18, float r19, w.o r20, w.n r21, z.d r22, yt.a r23) {
        /*
            r0 = r18
            r1 = r23
            boolean r2 = r1 instanceof z.k
            if (r2 == 0) goto L18
            r2 = r1
            z.k r2 = (z.k) r2
            int r3 = r2.f41887f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f41887f = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            z.k r2 = new z.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f41886e
            zt.a r2 = zt.a.f42823a
            int r3 = r8.f41887f
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            float r0 = r8.f41883b
            float r2 = r8.f41882a
            iu.w r3 = r8.f41885d
            w.o r4 = r8.f41884c
            ut.n.b(r1)
            r11 = r0
            r0 = r2
            r10 = r4
            goto L96
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            ut.n.b(r1)
            iu.w r1 = new iu.w
            r1.<init>()
            java.lang.Object r3 = r20.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r7 = r3.floatValue()
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r0)
            java.lang.Object r3 = r20.b()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L68
            r3 = r4
            goto L69
        L68:
            r3 = 0
        L69:
            r6 = r3 ^ 1
            z.j r16 = new z.j
            r15 = 1
            r10 = r16
            r11 = r19
            r12 = r1
            r13 = r17
            r14 = r22
            r10.<init>(r11, r12, r13, r14, r15)
            r10 = r20
            r8.f41884c = r10
            r8.f41885d = r1
            r8.f41882a = r0
            r8.f41883b = r7
            r8.f41887f = r4
            r3 = r20
            r4 = r5
            r5 = r21
            r11 = r7
            r7 = r16
            java.lang.Object r3 = w.e.h(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto L95
            goto Lb7
        L95:
            r3 = r1
        L96:
            java.lang.Object r1 = r10.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = c(r1, r11)
            z.a r2 = new z.a
            float r3 = r3.f20557a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            w.o r0 = w.e.m(r10, r9, r1, r0)
            r2.<init>(r3, r0)
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l.b(y.q1, float, float, w.o, w.n, z.d, yt.a):java.lang.Object");
    }

    public static final float c(float f10, float f11) {
        if (f11 == s0.g.f34069a) {
            return s0.g.f34069a;
        }
        if (f11 > s0.g.f34069a) {
            return kotlin.ranges.d.c(f10, f11);
        }
        return kotlin.ranges.d.a(f10, f11);
    }
}
