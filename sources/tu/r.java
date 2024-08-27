package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f36540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f36541b;

    public r(Function2 function2, f fVar) {
        this.f36540a = function2;
        this.f36541b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r7, yt.a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tu.q
            if (r0 == 0) goto L13
            r0 = r8
            tu.q r0 = (tu.q) r0
            int r1 = r0.f36533b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36533b = r1
            goto L18
        L13:
            tu.q r0 = new tu.q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f36532a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36533b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ut.n.b(r8)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            uu.w r7 = r0.f36537f
            tu.g r2 = r0.f36536e
            tu.r r4 = r0.f36535d
            ut.n.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5e
        L3c:
            r8 = move-exception
            goto L7a
        L3e:
            ut.n.b(r8)
            uu.w r8 = new uu.w
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r8.<init>(r7, r2)
            kotlin.jvm.functions.Function2 r2 = r6.f36540a     // Catch: java.lang.Throwable -> L76
            r0.f36535d = r6     // Catch: java.lang.Throwable -> L76
            r0.f36536e = r7     // Catch: java.lang.Throwable -> L76
            r0.f36537f = r8     // Catch: java.lang.Throwable -> L76
            r0.f36533b = r4     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L76
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
            r2 = r7
            r7 = r8
        L5e:
            r7.releaseIntercepted()
            tu.f r7 = r4.f36541b
            r8 = 0
            r0.f36535d = r8
            r0.f36536e = r8
            r0.f36537f = r8
            r0.f36533b = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L76:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7a:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.r.c(tu.g, yt.a):java.lang.Object");
    }
}
