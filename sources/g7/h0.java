package g7;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f16803a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public final yu.d f16804b = yu.e.a();

    /* renamed from: c, reason: collision with root package name */
    public int f16805c = -1;

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x0048, B:12:0x0064, B:14:0x006a, B:16:0x0072, B:18:0x0081, B:19:0x0084), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(yt.a r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof g7.f0
            if (r0 == 0) goto L13
            r0 = r9
            g7.f0 r0 = (g7.f0) r0
            int r1 = r0.f16745e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16745e = r1
            goto L18
        L13:
            g7.f0 r0 = new g7.f0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f16743c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f16745e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yu.d r1 = r0.f16742b
            g7.h0 r0 = r0.f16741a
            ut.n.b(r9)
            goto L48
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L34:
            ut.n.b(r9)
            r0.f16741a = r8
            yu.d r9 = r8.f16804b
            r0.f16742b = r9
            r0.f16745e = r3
            java.lang.Object r0 = r9.b(r4, r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = r8
            r1 = r9
        L48:
            g7.i0 r9 = r0.f16803a     // Catch: java.lang.Throwable -> L7f
            java.util.List r9 = r9.b()     // Catch: java.lang.Throwable -> L7f
            int r0 = r0.f16805c     // Catch: java.lang.Throwable -> L7f
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L7f
            int r0 = r0 - r2
            int r0 = r0 + r3
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7f
            int r3 = vt.z.k(r9)     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L7f
            r3 = 0
        L64:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L85
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L7f
            int r6 = r3 + 1
            if (r3 < 0) goto L81
            g7.j1 r5 = (g7.j1) r5     // Catch: java.lang.Throwable -> L7f
            kotlin.collections.IndexedValue r7 = new kotlin.collections.IndexedValue     // Catch: java.lang.Throwable -> L7f
            int r3 = r3 + r0
            r7.<init>(r3, r5)     // Catch: java.lang.Throwable -> L7f
            r2.add(r7)     // Catch: java.lang.Throwable -> L7f
            r3 = r6
            goto L64
        L7f:
            r9 = move-exception
            goto L89
        L81:
            vt.y.j()     // Catch: java.lang.Throwable -> L7f
            throw r4     // Catch: java.lang.Throwable -> L7f
        L85:
            r1.a(r4)
            return r2
        L89:
            r1.a(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h0.a(yt.a):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.collections.IndexedValue r6, yt.a r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof g7.g0
            if (r0 == 0) goto L13
            r0 = r7
            g7.g0 r0 = (g7.g0) r0
            int r1 = r0.f16783f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16783f = r1
            goto L18
        L13:
            g7.g0 r0 = new g7.g0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f16781d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f16783f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            yu.d r6 = r0.f16780c
            kotlin.collections.IndexedValue r1 = r0.f16779b
            g7.h0 r0 = r0.f16778a
            ut.n.b(r7)
            r7 = r6
            r6 = r1
            goto L4d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ut.n.b(r7)
            r0.f16778a = r5
            r0.f16779b = r6
            yu.d r7 = r5.f16804b
            r0.f16780c = r7
            r0.f16783f = r4
            java.lang.Object r0 = r7.b(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            int r1 = r6.f23356a     // Catch: java.lang.Throwable -> L62
            r0.f16805c = r1     // Catch: java.lang.Throwable -> L62
            g7.i0 r0 = r0.f16803a     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r6.f23357b     // Catch: java.lang.Throwable -> L62
            g7.j1 r6 = (g7.j1) r6     // Catch: java.lang.Throwable -> L62
            r0.a(r6)     // Catch: java.lang.Throwable -> L62
            kotlin.Unit r6 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L62
            r7.a(r3)
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        L62:
            r6 = move-exception
            r7.a(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h0.b(kotlin.collections.IndexedValue, yt.a):java.lang.Object");
    }
}
