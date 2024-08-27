package i0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x1 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public x1.t f19248b;

    /* renamed from: c, reason: collision with root package name */
    public int f19249c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a2 f19251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(a2 a2Var, yt.a aVar) {
        super(aVar);
        this.f19251e = a2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        x1 x1Var = new x1(this.f19251e, aVar);
        x1Var.f19250d = obj;
        return x1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x1) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:6:0x005f). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r13.f19249c
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L22
            if (r1 != r3) goto L1a
            x1.t r1 = r13.f19248b
            java.lang.Object r2 = r13.f19250d
            x1.m0 r2 = (x1.m0) r2
            ut.n.b(r14)
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L5f
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Object r1 = r13.f19250d
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r14)
            goto L3e
        L2a:
            ut.n.b(r14)
            java.lang.Object r14 = r13.f19250d
            r1 = r14
            x1.m0 r1 = (x1.m0) r1
            r13.f19250d = r1
            r13.f19249c = r2
            r14 = 0
            java.lang.Object r14 = y.i3.c(r1, r14, r13, r3)
            if (r14 != r0) goto L3e
            return r0
        L3e:
            x1.t r14 = (x1.t) r14
            long r4 = r14.f39911c
            i0.a2 r2 = r13.f19251e
            r2.d()
            r2 = r1
            r1 = r14
            r14 = r13
        L4a:
            r14.f19250d = r2
            r14.f19248b = r1
            r14.f19249c = r3
            x1.l r4 = x1.l.f39878b
            java.lang.Object r4 = r2.a(r4, r14)
            if (r4 != r0) goto L59
            return r0
        L59:
            r12 = r0
            r0 = r14
            r14 = r4
            r4 = r2
            r2 = r1
            r1 = r12
        L5f:
            x1.k r14 = (x1.k) r14
            java.util.List r14 = r14.f39870a
            int r5 = r14.size()
            r6 = 0
        L68:
            if (r6 >= r5) goto L86
            java.lang.Object r7 = r14.get(r6)
            x1.t r7 = (x1.t) r7
            long r8 = r7.f39909a
            long r10 = r2.f39909a
            boolean r8 = x1.s.a(r8, r10)
            if (r8 == 0) goto L83
            boolean r7 = r7.f39912d
            if (r7 == 0) goto L83
            r14 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            goto L4a
        L83:
            int r6 = r6 + 1
            goto L68
        L86:
            i0.a2 r14 = r0.f19251e
            r14.c()
            kotlin.Unit r14 = kotlin.Unit.f23355a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.x1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
