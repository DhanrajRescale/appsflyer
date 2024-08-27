package o2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final n2.b f29510a = new n2.b();

    /* renamed from: b, reason: collision with root package name */
    public final n2.c f29511b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.p f29512c;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n2.c] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mt.p] */
    public m() {
        ?? obj = new Object();
        obj.f28230a = n2.a.f28222a;
        obj.f28231b = n2.a.f28223b;
        obj.f28232c = 0;
        this.f29511b = obj;
        this.f29512c = new Object();
    }

    public static void a(m mVar, q qVar, g0 g0Var, Object obj) {
        k kVar = new k(qVar);
        synchronized (mVar.f29512c) {
            try {
                if (obj == null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(o2.q r6, o2.g0 r7, o2.f r8, yt.a r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o2.l
            if (r0 == 0) goto L13
            r0 = r9
            o2.l r0 = (o2.l) r0
            int r1 = r0.f29504f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29504f = r1
            goto L18
        L13:
            o2.l r0 = new o2.l
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f29502d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f29504f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            boolean r6 = r0.f29501c
            o2.k r7 = r0.f29500b
            o2.m r8 = r0.f29499a
            ut.n.b(r9)
            goto L75
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ut.n.b(r9)
            o2.k r9 = new o2.k
            r7.getClass()
            r9.<init>(r6)
            mt.p r6 = r5.f29512c
            monitor-enter(r6)
            n2.b r7 = r5.f29510a     // Catch: java.lang.Throwable -> L56
            java.lang.Object r7 = r7.a(r9)     // Catch: java.lang.Throwable -> L56
            o2.j r7 = (o2.j) r7     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L58
            n2.c r7 = r5.f29511b     // Catch: java.lang.Throwable -> L56
            java.lang.Object r7 = r7.a(r9)     // Catch: java.lang.Throwable -> L56
            o2.j r7 = (o2.j) r7     // Catch: java.lang.Throwable -> L56
            goto L58
        L56:
            r7 = move-exception
            goto La5
        L58:
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r7.f29497a     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)
            return r7
        L5e:
            kotlin.Unit r7 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)
            r0.f29499a = r5
            r0.f29500b = r9
            r6 = 0
            r0.f29501c = r6
            r0.f29504f = r3
            java.lang.Object r7 = r8.invoke(r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            r8 = r5
            r4 = r9
            r9 = r7
            r7 = r4
        L75:
            mt.p r0 = r8.f29512c
            monitor-enter(r0)
            if (r9 != 0) goto L88
            n2.c r6 = r8.f29511b     // Catch: java.lang.Throwable -> L86
            o2.j r8 = new o2.j     // Catch: java.lang.Throwable -> L86
            r1 = 0
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L86
            r6.d(r7, r8)     // Catch: java.lang.Throwable -> L86
            goto L9f
        L86:
            r6 = move-exception
            goto La3
        L88:
            if (r6 == 0) goto L95
            n2.c r6 = r8.f29511b     // Catch: java.lang.Throwable -> L86
            o2.j r8 = new o2.j     // Catch: java.lang.Throwable -> L86
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L86
            r6.d(r7, r8)     // Catch: java.lang.Throwable -> L86
            goto L9f
        L95:
            n2.b r6 = r8.f29510a     // Catch: java.lang.Throwable -> L86
            o2.j r8 = new o2.j     // Catch: java.lang.Throwable -> L86
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L86
            r6.b(r7, r8)     // Catch: java.lang.Throwable -> L86
        L9f:
            kotlin.Unit r6 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)
            return r9
        La3:
            monitor-exit(r0)
            throw r6
        La5:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.m.b(o2.q, o2.g0, o2.f, yt.a):java.lang.Object");
    }
}
