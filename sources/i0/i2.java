package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f18962a;

    /* renamed from: b, reason: collision with root package name */
    public int f18963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f18964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f18966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(t0.g1 g1Var, long j10, a0.l lVar, yt.a aVar) {
        super(2, aVar);
        this.f18964c = g1Var;
        this.f18965d = j10;
        this.f18966e = lVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new i2(this.f18964c, this.f18965d, this.f18966e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r8.f18963b
            a0.l r2 = r8.f18966e
            r3 = 2
            r4 = 1
            t0.g1 r5 = r8.f18964c
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r8.f18962a
            a0.n r0 = (a0.n) r0
            ut.n.b(r9)
            goto L5f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.f18962a
            t0.g1 r1 = (t0.g1) r1
            ut.n.b(r9)
            goto L46
        L28:
            ut.n.b(r9)
            java.lang.Object r9 = r5.getValue()
            a0.n r9 = (a0.n) r9
            if (r9 == 0) goto L4a
            a0.m r1 = new a0.m
            r1.<init>(r9)
            if (r2 == 0) goto L45
            r8.f18962a = r5
            r8.f18963b = r4
            java.lang.Object r9 = r2.a(r1, r8)
            if (r9 != r0) goto L45
            return r0
        L45:
            r1 = r5
        L46:
            r9 = 0
            r1.setValue(r9)
        L4a:
            a0.n r9 = new a0.n
            long r6 = r8.f18965d
            r9.<init>(r6)
            if (r2 == 0) goto L60
            r8.f18962a = r9
            r8.f18963b = r3
            java.lang.Object r1 = r2.a(r9, r8)
            if (r1 != r0) goto L5e
            return r0
        L5e:
            r0 = r9
        L5f:
            r9 = r0
        L60:
            r5.setValue(r9)
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
