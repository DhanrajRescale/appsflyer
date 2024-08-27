package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f23714b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f23716d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Function1 function1, yt.a aVar) {
        super(aVar);
        this.f23716d = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        b0 b0Var = new b0(this.f23716d, aVar);
        b0Var.f23715c = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r6.f23714b
            r2 = 1
            if (r1 == 0) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r6.f23715c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r7)
            r3 = r1
            r1 = r0
            r0 = r6
            goto L37
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            ut.n.b(r7)
            java.lang.Object r7 = r6.f23715c
            x1.m0 r7 = (x1.m0) r7
            r1 = r7
            r7 = r6
        L25:
            x1.l r3 = x1.l.f39877a
            r7.f23715c = r1
            r7.f23714b = r2
            java.lang.Object r3 = r1.a(r3, r7)
            if (r3 != r0) goto L32
            return r0
        L32:
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L37:
            x1.k r7 = (x1.k) r7
            boolean r7 = dp.b.v1(r7)
            r7 = r7 ^ r2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            kotlin.jvm.functions.Function1 r4 = r0.f23716d
            r4.invoke(r7)
            r7 = r0
            r0 = r1
            r1 = r3
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
