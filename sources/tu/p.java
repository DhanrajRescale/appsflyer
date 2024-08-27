package tu;

/* loaded from: classes2.dex */
public final class p implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f36527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hu.c f36528b;

    public p(r rVar, g7.a0 a0Var) {
        this.f36527a = rVar;
        this.f36528b = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r9, yt.a r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof tu.o
            if (r0 == 0) goto L13
            r0 = r10
            tu.o r0 = (tu.o) r0
            int r1 = r0.f36518b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36518b = r1
            goto L18
        L13:
            tu.o r0 = new tu.o
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f36517a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36518b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f36520d
            uu.w r9 = (uu.w) r9
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f36520d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            ut.n.b(r10)
            goto La0
        L44:
            tu.g r9 = r0.f36521e
            java.lang.Object r2 = r0.f36520d
            tu.p r2 = (tu.p) r2
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            ut.n.b(r10)
            tu.f r10 = r8.f36527a     // Catch: java.lang.Throwable -> L8a
            r0.f36520d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f36521e = r9     // Catch: java.lang.Throwable -> L8a
            r0.f36518b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.c(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            uu.w r10 = new uu.w
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            r10.<init>(r9, r4)
            hu.c r9 = r2.f36528b     // Catch: java.lang.Throwable -> L82
            r0.f36520d = r10     // Catch: java.lang.Throwable -> L82
            r0.f36521e = r6     // Catch: java.lang.Throwable -> L82
            r0.f36518b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.b(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            tu.r1 r10 = new tu.r1
            r10.<init>(r9)
            hu.c r2 = r2.f36528b
            r0.f36520d = r9
            r0.f36521e = r6
            r0.f36518b = r4
            java.lang.Object r10 = hl.f.q(r10, r2, r9, r0)
            if (r10 != r1) goto La0
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.p.c(tu.g, yt.a):java.lang.Object");
    }
}
