package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r2 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f40916b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f40917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f40918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu.c f40919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f40920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k1 f40921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(qu.f0 f0Var, hu.c cVar, Function1 function1, k1 k1Var, yt.a aVar) {
        super(aVar);
        this.f40918d = f0Var;
        this.f40919e = cVar;
        this.f40920f = function1;
        this.f40921g = k1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        r2 r2Var = new r2(this.f40918d, this.f40919e, this.f40920f, this.f40921g, aVar);
        r2Var.f40917c = obj;
        return r2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r2) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0065  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f40916b
            qu.f0 r2 = r9.f40918d
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            y.k1 r7 = r9.f40921g
            if (r1 == 0) goto L26
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            ut.n.b(r10)
            goto L61
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f40917c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r10)
            goto L41
        L26:
            ut.n.b(r10)
            java.lang.Object r10 = r9.f40917c
            r1 = r10
            x1.m0 r1 = (x1.m0) r1
            y.n2 r10 = new y.n2
            r10.<init>(r7, r4)
            yk.g.H(r2, r4, r4, r10, r3)
            r9.f40917c = r1
            r9.f40916b = r6
            java.lang.Object r10 = y.i3.c(r1, r4, r9, r3)
            if (r10 != r0) goto L41
            return r0
        L41:
            x1.t r10 = (x1.t) r10
            r10.a()
            y.o0 r6 = y.i3.f40778a
            hu.c r8 = r9.f40919e
            if (r8 == r6) goto L54
            y.o2 r6 = new y.o2
            r6.<init>(r8, r7, r10, r4)
            yk.g.H(r2, r4, r4, r6, r3)
        L54:
            r9.f40917c = r4
            r9.f40916b = r5
            x1.l r10 = x1.l.f39878b
            java.lang.Object r10 = y.i3.e(r1, r10, r9)
            if (r10 != r0) goto L61
            return r0
        L61:
            x1.t r10 = (x1.t) r10
            if (r10 != 0) goto L6e
            y.p2 r10 = new y.p2
            r10.<init>(r7, r4)
            yk.g.H(r2, r4, r4, r10, r3)
            goto L87
        L6e:
            r10.a()
            y.q2 r0 = new y.q2
            r0.<init>(r7, r4)
            yk.g.H(r2, r4, r4, r0, r3)
            kotlin.jvm.functions.Function1 r0 = r9.f40920f
            if (r0 == 0) goto L87
            m1.c r1 = new m1.c
            long r2 = r10.f39911c
            r1.<init>(r2)
            r0.invoke(r1)
        L87:
            kotlin.Unit r10 = kotlin.Unit.f23355a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
