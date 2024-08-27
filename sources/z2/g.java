package z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class g extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f41927a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f41929c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, yt.a aVar) {
        super(2, aVar);
        this.f41929c = rVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        g gVar = new g(this.f41929c, aVar);
        gVar.f41928b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0048 -> B:5:0x004b). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f41927a
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.f41928b
            qu.f0 r1 = (qu.f0) r1
            ut.n.b(r10)
            r10 = r9
            goto L4b
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            ut.n.b(r10)
            java.lang.Object r10 = r9.f41928b
            qu.f0 r10 = (qu.f0) r10
            r1 = r10
            r10 = r9
        L23:
            boolean r3 = hl.f.u0(r1)
            if (r3 == 0) goto L65
            z2.b r3 = z2.b.f41908c
            r10.f41928b = r1
            r10.f41927a = r2
            kotlin.coroutines.CoroutineContext r4 = r10.getContext()
            d2.b2 r5 = d2.b2.f13368a
            kotlin.coroutines.CoroutineContext$Element r4 = r4.g(r5)
            w.k.d(r4)
            kotlin.coroutines.CoroutineContext r4 = r10.getContext()
            t0.a1 r4 = dp.b.q1(r4)
            java.lang.Object r3 = r4.U(r3, r10)
            if (r3 != r0) goto L4b
            return r0
        L4b:
            z2.r r3 = r10.f41929c
            int[] r4 = r3.A
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r2]
            android.view.View r8 = r3.f41958l
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L61
            r4 = r4[r2]
            if (r7 == r4) goto L23
        L61:
            r3.k()
            goto L23
        L65:
            kotlin.Unit r10 = kotlin.Unit.f23355a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
