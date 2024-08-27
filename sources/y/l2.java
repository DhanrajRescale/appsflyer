package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l2 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public long f40843b;

    /* renamed from: c, reason: collision with root package name */
    public int f40844c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f40845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.t f40846e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(x1.t tVar, yt.a aVar) {
        super(aVar);
        this.f40846e = tVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        l2 l2Var = new l2(this.f40846e, aVar);
        l2Var.f40845d = obj;
        return l2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0046 -> B:5:0x004c). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f40844c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            long r3 = r9.f40843b
            java.lang.Object r1 = r9.f40845d
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r10)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L4c
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            ut.n.b(r10)
            java.lang.Object r10 = r9.f40845d
            x1.m0 r10 = (x1.m0) r10
            x1.t r1 = r9.f40846e
            long r3 = r1.f39910b
            d2.j3 r1 = r10.f()
            r1.b()
            r5 = 40
            long r5 = r5 + r3
            r1 = r10
            r3 = r5
            r10 = r9
        L37:
            r10.f40845d = r1
            r10.f40843b = r3
            r10.f40844c = r2
            r5 = 0
            r6 = 3
            java.lang.Object r5 = y.i3.c(r1, r5, r10, r6)
            if (r5 != r0) goto L46
            return r0
        L46:
            r8 = r0
            r0 = r10
            r10 = r5
            r4 = r3
            r3 = r1
            r1 = r8
        L4c:
            x1.t r10 = (x1.t) r10
            long r6 = r10.f39910b
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 < 0) goto L55
            return r10
        L55:
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: y.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
