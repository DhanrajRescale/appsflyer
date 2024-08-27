package qu;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w1 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public c2 f32290b;

    /* renamed from: c, reason: collision with root package name */
    public vu.p f32291c;

    /* renamed from: d, reason: collision with root package name */
    public int f32292d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1 f32294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(yt.a aVar, x1 x1Var) {
        super(aVar);
        this.f32294f = x1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        w1 w1Var = new w1(aVar, this.f32294f);
        w1Var.f32293e = obj;
        return w1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0064 -> B:6:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0078 -> B:6:0x007b). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f32292d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            vu.p r1 = r7.f32291c
            qu.c2 r3 = r7.f32290b
            java.lang.Object r4 = r7.f32293e
            pu.i r4 = (pu.i) r4
            ut.n.b(r8)
            r8 = r7
            goto L7b
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            ut.n.b(r8)
            goto L80
        L25:
            ut.n.b(r8)
            java.lang.Object r8 = r7.f32293e
            pu.i r8 = (pu.i) r8
            qu.x1 r1 = r7.f32294f
            java.lang.Object r1 = r1.P()
            boolean r4 = r1 instanceof qu.n
            if (r4 == 0) goto L40
            qu.n r1 = (qu.n) r1
            qu.o r1 = r1.f32242e
            r7.f32292d = r3
            r8.b(r1, r7)
            return r0
        L40:
            boolean r3 = r1 instanceof qu.i1
            if (r3 == 0) goto L80
            qu.i1 r1 = (qu.i1) r1
            qu.c2 r1 = r1.d()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.h()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.d(r3, r4)
            vu.p r3 = (vu.p) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5c:
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r1, r3)
            if (r5 != 0) goto L80
            boolean r5 = r1 instanceof qu.n
            if (r5 == 0) goto L7b
            r5 = r1
            qu.n r5 = (qu.n) r5
            r8.f32293e = r4
            r8.f32290b = r3
            r8.f32291c = r1
            r8.f32292d = r2
            qu.o r5 = r5.f32242e
            r4.b(r5, r8)
            zt.a r5 = zt.a.f42823a
            if (r5 != r0) goto L7b
            return r0
        L7b:
            vu.p r1 = r1.i()
            goto L5c
        L80:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qu.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
