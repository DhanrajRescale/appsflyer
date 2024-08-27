package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f36552b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f36553c;

    public /* synthetic */ u(f fVar, Function2 function2, int i10) {
        this.f36551a = i10;
        this.f36552b = fVar;
        this.f36553c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    @Override // tu.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(tu.g r8, yt.a r9) {
        /*
            r7 = this;
            int r0 = r7.f36551a
            tu.f r1 = r7.f36552b
            kotlin.jvm.functions.Function2 r2 = r7.f36553c
            switch(r0) {
                case 0: goto L6e;
                case 1: goto L1c;
                default: goto L9;
            }
        L9:
            a0.f r0 = new a0.f
            r3 = 8
            r0.<init>(r3, r8, r2)
            java.lang.Object r8 = r1.c(r0, r9)
            zt.a r9 = zt.a.f42823a
            if (r8 != r9) goto L19
            goto L1b
        L19:
            kotlin.Unit r8 = kotlin.Unit.f23355a
        L1b:
            return r8
        L1c:
            boolean r0 = r9 instanceof tu.x
            if (r0 == 0) goto L2f
            r0 = r9
            tu.x r0 = (tu.x) r0
            int r3 = r0.f36582b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2f
            int r3 = r3 - r4
            r0.f36582b = r3
            goto L34
        L2f:
            tu.x r0 = new tu.x
            r0.<init>(r7, r9)
        L34:
            java.lang.Object r9 = r0.f36581a
            zt.a r3 = zt.a.f42823a
            int r4 = r0.f36582b
            r5 = 1
            if (r4 == 0) goto L4f
            if (r4 != r5) goto L47
            tu.z r8 = r0.f36584d
            ut.n.b(r9)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L45
            goto L6a
        L45:
            r9 = move-exception
            goto L66
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            ut.n.b(r9)
            tu.z r9 = new tu.z
            r9.<init>(r2, r8)
            r0.f36584d = r9     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            r0.f36582b = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            java.lang.Object r8 = r1.c(r9, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L62
            if (r8 != r3) goto L6a
            goto L6c
        L62:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L66:
            java.lang.Object r0 = r9.f23426a
            if (r0 != r8) goto L6d
        L6a:
            kotlin.Unit r3 = kotlin.Unit.f23355a
        L6c:
            return r3
        L6d:
            throw r9
        L6e:
            iu.v r0 = new iu.v
            r0.<init>()
            tu.w r3 = new tu.w
            r3.<init>(r0, r8, r2)
            java.lang.Object r8 = r1.c(r3, r9)
            zt.a r9 = zt.a.f42823a
            if (r8 != r9) goto L81
            goto L83
        L81:
            kotlin.Unit r8 = kotlin.Unit.f23355a
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.u.c(tu.g, yt.a):java.lang.Object");
    }
}
