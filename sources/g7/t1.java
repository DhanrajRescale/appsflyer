package g7;

/* loaded from: classes.dex */
public final class t1 implements tu.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f17063b;

    public /* synthetic */ t1(j4 j4Var, int i10) {
        this.f17062a = i10;
        this.f17063b = j4Var;
    }

    @Override // tu.g
    public final /* bridge */ /* synthetic */ Object a(Object obj, yt.a aVar) {
        switch (this.f17062a) {
            case 0:
                return b((j1) obj, aVar);
            default:
                return b((j1) obj, aVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:3|(2:5|(7:7|8|9|(1:(1:12)(2:18|19))(3:20|21|(1:23))|13|14|15))|25|8|9|(0)(0)|13|14|15) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(g7.j1 r6, yt.a r7) {
        /*
            r5 = this;
            int r0 = r5.f17062a
            g7.j4 r1 = r5.f17063b
            switch(r0) {
                case 0: goto L47;
                default: goto L7;
            }
        L7:
            boolean r0 = r7 instanceof g7.g2
            if (r0 == 0) goto L1a
            r0 = r7
            g7.g2 r0 = (g7.g2) r0
            int r2 = r0.f16793c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r0.f16793c = r2
            goto L1f
        L1a:
            g7.g2 r0 = new g7.g2
            r0.<init>(r5, r7)
        L1f:
            java.lang.Object r7 = r0.f16791a
            zt.a r2 = zt.a.f42823a
            int r3 = r0.f16793c
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            ut.n.b(r7)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L44
            goto L44
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            ut.n.b(r7)
            r0.f16793c = r4     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L44
            su.p r7 = r1.f16853a     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L44
            java.lang.Object r6 = r7.h(r6, r0)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L44
            if (r6 != r2) goto L44
            goto L46
        L44:
            kotlin.Unit r2 = kotlin.Unit.f23355a
        L46:
            return r2
        L47:
            su.p r0 = r1.f16853a
            java.lang.Object r6 = r0.h(r6, r7)
            zt.a r7 = zt.a.f42823a
            if (r6 != r7) goto L52
            goto L54
        L52:
            kotlin.Unit r6 = kotlin.Unit.f23355a
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.t1.b(g7.j1, yt.a):java.lang.Object");
    }
}
