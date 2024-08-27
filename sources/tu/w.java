package tu;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu.v f36570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f36571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f36572c;

    public w(iu.v vVar, g gVar, Function2 function2) {
        this.f36570a = vVar;
        this.f36571b = gVar;
        this.f36572c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // tu.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, yt.a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tu.v
            if (r0 == 0) goto L13
            r0 = r8
            tu.v r0 = (tu.v) r0
            int r1 = r0.f36562e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36562e = r1
            goto L18
        L13:
            tu.v r0 = new tu.v
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f36560c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f36562e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            ut.n.b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f36559b
            tu.w r2 = r0.f36558a
            ut.n.b(r8)
            goto L68
        L3d:
            ut.n.b(r8)
            goto L55
        L41:
            ut.n.b(r8)
            iu.v r8 = r6.f36570a
            boolean r8 = r8.f20556a
            if (r8 == 0) goto L58
            r0.f36562e = r5
            tu.g r8 = r6.f36571b
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L58:
            r0.f36558a = r6
            r0.f36559b = r7
            r0.f36562e = r4
            kotlin.jvm.functions.Function2 r8 = r6.f36572c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            iu.v r8 = r2.f36570a
            r8.f20556a = r5
            r8 = 0
            r0.f36558a = r8
            r0.f36559b = r8
            r0.f36562e = r3
            tu.g r8 = r2.f36571b
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        L87:
            kotlin.Unit r7 = kotlin.Unit.f23355a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.w.a(java.lang.Object, yt.a):java.lang.Object");
    }
}
