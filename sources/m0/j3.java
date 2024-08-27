package m0;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public float f26319a;

    /* renamed from: b, reason: collision with root package name */
    public float f26320b;

    /* renamed from: c, reason: collision with root package name */
    public float f26321c;

    /* renamed from: d, reason: collision with root package name */
    public float f26322d;

    /* renamed from: e, reason: collision with root package name */
    public final w.d f26323e;

    /* renamed from: f, reason: collision with root package name */
    public a0.j f26324f;

    /* renamed from: g, reason: collision with root package name */
    public a0.j f26325g;

    public j3(float f10, float f11, float f12, float f13) {
        this.f26319a = f10;
        this.f26320b = f11;
        this.f26321c = f12;
        this.f26322d = f13;
        this.f26323e = new w.d(new w2.e(f10), w.z1.f38741c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(a0.j r6, yt.a r7) {
        /*
            r5 = this;
            w.d r0 = r5.f26323e
            boolean r1 = r7 instanceof m0.h3
            if (r1 == 0) goto L15
            r1 = r7
            m0.h3 r1 = (m0.h3) r1
            int r2 = r1.f26237e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f26237e = r2
            goto L1a
        L15:
            m0.h3 r1 = new m0.h3
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f26235c
            zt.a r2 = zt.a.f42823a
            int r3 = r1.f26237e
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            a0.j r6 = r1.f26234b
            m0.j3 r0 = r1.f26233a
            ut.n.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L2d:
            r7 = move-exception
            goto L7b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            ut.n.b(r7)
            boolean r7 = r6 instanceof a0.n
            if (r7 == 0) goto L41
            float r7 = r5.f26320b
            goto L51
        L41:
            boolean r7 = r6 instanceof a0.h
            if (r7 == 0) goto L48
            float r7 = r5.f26321c
            goto L51
        L48:
            boolean r7 = r6 instanceof a0.d
            if (r7 == 0) goto L4f
            float r7 = r5.f26322d
            goto L51
        L4f:
            float r7 = r5.f26319a
        L51:
            r5.f26325g = r6
            t0.n1 r3 = r0.f38455e     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L72
            w2.e r3 = (w2.e) r3     // Catch: java.lang.Throwable -> L72
            float r3 = r3.f38783a     // Catch: java.lang.Throwable -> L72
            boolean r3 = w2.e.a(r3, r7)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L75
            a0.j r3 = r5.f26324f     // Catch: java.lang.Throwable -> L72
            r1.f26233a = r5     // Catch: java.lang.Throwable -> L72
            r1.f26234b = r6     // Catch: java.lang.Throwable -> L72
            r1.f26237e = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = m0.s2.a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L72
            if (r7 != r2) goto L75
            return r2
        L72:
            r7 = move-exception
            r0 = r5
            goto L7b
        L75:
            r0 = r5
        L76:
            r0.f26324f = r6
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        L7b:
            r0.f26324f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.j3.a(a0.j, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(yt.a r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m0.i3
            if (r0 == 0) goto L13
            r0 = r6
            m0.i3 r0 = (m0.i3) r0
            int r1 = r0.f26283d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26283d = r1
            goto L18
        L13:
            m0.i3 r0 = new m0.i3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f26281b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f26283d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            m0.j3 r0 = r0.f26280a
            ut.n.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r6 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            ut.n.b(r6)
            a0.j r6 = r5.f26325g
            boolean r2 = r6 instanceof a0.n
            if (r2 == 0) goto L3f
            float r6 = r5.f26320b
            goto L4f
        L3f:
            boolean r2 = r6 instanceof a0.h
            if (r2 == 0) goto L46
            float r6 = r5.f26321c
            goto L4f
        L46:
            boolean r6 = r6 instanceof a0.d
            if (r6 == 0) goto L4d
            float r6 = r5.f26322d
            goto L4f
        L4d:
            float r6 = r5.f26319a
        L4f:
            w.d r2 = r5.f26323e
            t0.n1 r4 = r2.f38455e
            java.lang.Object r4 = r4.getValue()
            w2.e r4 = (w2.e) r4
            float r4 = r4.f38783a
            boolean r4 = w2.e.a(r4, r6)
            if (r4 != 0) goto L7e
            w2.e r4 = new w2.e     // Catch: java.lang.Throwable -> L77
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77
            r0.f26280a = r5     // Catch: java.lang.Throwable -> L77
            r0.f26283d = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L77
            if (r6 != r1) goto L71
            return r1
        L71:
            r0 = r5
        L72:
            a0.j r6 = r0.f26325g
            r0.f26324f = r6
            goto L7e
        L77:
            r6 = move-exception
            r0 = r5
        L79:
            a0.j r1 = r0.f26325g
            r0.f26324f = r1
            throw r6
        L7e:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.j3.b(yt.a):java.lang.Object");
    }
}
