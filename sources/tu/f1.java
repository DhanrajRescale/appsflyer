package tu;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class f1 extends au.i implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public int f36441a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f36442b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f36443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f36444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, yt.a aVar) {
        super(3, aVar);
        this.f36444d = h1Var;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        f1 f1Var = new f1(this.f36444d, (yt.a) obj3);
        f1Var.f36442b = (g) obj;
        f1Var.f36443c = intValue;
        return f1Var.invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r10.f36441a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            tu.h1 r7 = r10.f36444d
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            tu.g r1 = r10.f36442b
            ut.n.b(r11)
            goto L79
        L26:
            tu.g r1 = r10.f36442b
            ut.n.b(r11)
            goto L6c
        L2c:
            tu.g r1 = r10.f36442b
            ut.n.b(r11)
            goto L57
        L32:
            ut.n.b(r11)
            goto L87
        L36:
            ut.n.b(r11)
            tu.g r1 = r10.f36442b
            int r11 = r10.f36443c
            if (r11 <= 0) goto L4a
            tu.z0 r11 = tu.z0.f36595a
            r10.f36441a = r6
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L4a:
            long r8 = r7.f36460a
            r10.f36442b = r1
            r10.f36441a = r5
            java.lang.Object r11 = kp.j.K(r8, r10)
            if (r11 != r0) goto L57
            return r0
        L57:
            long r5 = r7.f36461b
            r8 = 0
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L79
            tu.z0 r11 = tu.z0.f36596b
            r10.f36442b = r1
            r10.f36441a = r4
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            long r4 = r7.f36461b
            r10.f36442b = r1
            r10.f36441a = r3
            java.lang.Object r11 = kp.j.K(r4, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            tu.z0 r11 = tu.z0.f36597c
            r3 = 0
            r10.f36442b = r3
            r10.f36441a = r2
            java.lang.Object r11 = r1.a(r11, r10)
            if (r11 != r0) goto L87
            return r0
        L87:
            kotlin.Unit r11 = kotlin.Unit.f23355a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
