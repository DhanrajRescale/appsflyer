package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f36593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36594b;

    public z(Function2 function2, g gVar) {
        this.f36593a = function2;
        this.f36594b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // tu.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, yt.a r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof tu.y
            if (r0 == 0) goto L13
            r0 = r9
            tu.y r0 = (tu.y) r0
            int r1 = r0.f36588c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36588c = r1
            goto L18
        L13:
            tu.y r0 = new tu.y
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f36587b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36588c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.z r8 = r0.f36586a
            ut.n.b(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f36590e
            tu.z r2 = r0.f36586a
            ut.n.b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L55
        L40:
            ut.n.b(r9)
            r0.f36586a = r7
            r0.f36590e = r8
            r0.f36588c = r4
            kotlin.jvm.functions.Function2 r9 = r7.f36593a
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            r2 = r9
            r9 = r8
            r8 = r7
        L55:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            tu.g r2 = r8.f36594b
            r0.f36586a = r8
            r5 = 0
            r0.f36590e = r5
            r0.f36588c = r3
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L6e
            return r1
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L73
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        L73:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.z.a(java.lang.Object, yt.a):java.lang.Object");
    }
}
