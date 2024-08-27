package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d3 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f26031b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26032c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f26033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(Function0 function0, yt.a aVar) {
        super(aVar);
        this.f26033d = function0;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        d3 d3Var = new d3(this.f26033d, aVar);
        d3Var.f26032c = obj;
        return d3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d3) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r5.f26031b
            x1.l r2 = x1.l.f39877a
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r4) goto L12
            ut.n.b(r6)
            goto L41
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f26032c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r6)
            goto L35
        L22:
            ut.n.b(r6)
            java.lang.Object r6 = r5.f26032c
            r1 = r6
            x1.m0 r1 = (x1.m0) r1
            r5.f26032c = r1
            r5.f26031b = r3
            java.lang.Object r6 = y.i3.c(r1, r2, r5, r3)
            if (r6 != r0) goto L35
            return r0
        L35:
            r6 = 0
            r5.f26032c = r6
            r5.f26031b = r4
            java.lang.Object r6 = y.i3.e(r1, r2, r5)
            if (r6 != r0) goto L41
            return r0
        L41:
            x1.t r6 = (x1.t) r6
            if (r6 == 0) goto L4a
            kotlin.jvm.functions.Function0 r6 = r5.f26033d
            r6.mo2invoke()
        L4a:
            kotlin.Unit r6 = kotlin.Unit.f23355a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
