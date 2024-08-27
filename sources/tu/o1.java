package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o1 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f36525a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f36526b;

    public o1(Function2 function2, g gVar) {
        this.f36525a = gVar;
        this.f36526b = function2;
    }

    @Override // tu.g
    public final Object a(Object obj, yt.a aVar) {
        return this.f36525a.a(obj, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uu.w] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(yt.a r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof tu.n1
            if (r0 == 0) goto L13
            r0 = r7
            tu.n1 r0 = (tu.n1) r0
            int r1 = r0.f36516e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36516e = r1
            goto L18
        L13:
            tu.n1 r0 = new tu.n1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f36514c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36516e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ut.n.b(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            uu.w r2 = r0.f36513b
            tu.o1 r4 = r0.f36512a
            ut.n.b(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r7 = move-exception
            goto L79
        L3c:
            ut.n.b(r7)
            uu.w r2 = new uu.w
            tu.g r7 = r6.f36525a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f36526b     // Catch: java.lang.Throwable -> L3a
            r0.f36512a = r6     // Catch: java.lang.Throwable -> L3a
            r0.f36513b = r2     // Catch: java.lang.Throwable -> L3a
            r0.f36516e = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 != r1) goto L59
            return r1
        L59:
            r4 = r6
        L5a:
            r2.releaseIntercepted()
            tu.g r7 = r4.f36525a
            boolean r2 = r7 instanceof tu.o1
            if (r2 == 0) goto L76
            tu.o1 r7 = (tu.o1) r7
            r2 = 0
            r0.f36512a = r2
            r0.f36513b = r2
            r0.f36516e = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L76:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L79:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.o1.b(yt.a):java.lang.Object");
    }
}
