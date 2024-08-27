package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36468b;

    public j(Object obj) {
        this.f36468b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r7, yt.a r8) {
        /*
            r6 = this;
            int r0 = r6.f36467a
            java.lang.Object r1 = r6.f36468b
            switch(r0) {
                case 0: goto L69;
                default: goto L7;
            }
        L7:
            boolean r0 = r8 instanceof tu.a
            if (r0 == 0) goto L1a
            r0 = r8
            tu.a r0 = (tu.a) r0
            int r2 = r0.f36403d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r0.f36403d = r2
            goto L1f
        L1a:
            tu.a r0 = new tu.a
            r0.<init>(r6, r8)
        L1f:
            java.lang.Object r8 = r0.f36401b
            zt.a r2 = zt.a.f42823a
            int r3 = r0.f36403d
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            uu.w r7 = r0.f36400a
            ut.n.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L59
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            ut.n.b(r8)
            uu.w r8 = new uu.w
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            r8.<init>(r7, r3)
            r0.f36400a = r8     // Catch: java.lang.Throwable -> L63
            r0.f36403d = r4     // Catch: java.lang.Throwable -> L63
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r1.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r2) goto L53
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L63
        L55:
            if (r7 != r2) goto L58
            goto L5e
        L58:
            r7 = r8
        L59:
            r7.releaseIntercepted()
            kotlin.Unit r2 = kotlin.Unit.f23355a
        L5e:
            return r2
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            java.lang.Object r7 = r7.a(r1, r8)
            zt.a r8 = zt.a.f42823a
            if (r7 != r8) goto L72
            goto L74
        L72:
            kotlin.Unit r7 = kotlin.Unit.f23355a
        L74:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.j.c(tu.g, yt.a):java.lang.Object");
    }

    public j(Function2 function2) {
        this.f36468b = function2;
    }
}
