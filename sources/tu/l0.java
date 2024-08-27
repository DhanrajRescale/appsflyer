package tu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class l0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f36492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f36493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f36494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f36495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b1 b1Var, f fVar, p0 p0Var, Object obj, yt.a aVar) {
        super(2, aVar);
        this.f36493b = b1Var;
        this.f36494c = fVar;
        this.f36495d = p0Var;
        this.f36496e = obj;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new l0(this.f36493b, this.f36494c, this.f36495d, this.f36496e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v3, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r8.f36492a
            r2 = 4
            r3 = 3
            r4 = 1
            tu.f r5 = r8.f36494c
            r6 = 2
            tu.p0 r7 = r8.f36495d
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            ut.n.b(r9)
            goto L53
        L23:
            ut.n.b(r9)
            goto L7b
        L27:
            ut.n.b(r9)
            tu.c1 r9 = tu.a1.f36405a
            tu.b1 r1 = r8.f36493b
            if (r1 != r9) goto L39
            r8.f36492a = r4
            java.lang.Object r9 = r5.c(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L39:
            tu.c1 r9 = tu.a1.f36406b
            r4 = 0
            if (r1 != r9) goto L5c
            r9 = r7
            uu.a r9 = (uu.a) r9
            uu.c0 r9 = r9.k()
            tu.j0 r1 = new tu.j0
            r1.<init>(r6, r4)
            r8.f36492a = r6
            java.lang.Object r9 = el.l.U(r9, r1, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            r8.f36492a = r3
            java.lang.Object r9 = r5.c(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L5c:
            r9 = r7
            uu.a r9 = (uu.a) r9
            uu.c0 r9 = r9.k()
            tu.f r9 = r1.a(r9)
            tu.f r9 = el.l.J(r9)
            tu.k0 r1 = new tu.k0
            java.lang.Object r3 = r8.f36496e
            r1.<init>(r5, r7, r3, r4)
            r8.f36492a = r2
            java.lang.Object r9 = el.l.B(r9, r1, r8)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
