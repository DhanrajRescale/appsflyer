package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t0.l3;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public su.b f38505a;

    /* renamed from: b, reason: collision with root package name */
    public int f38506b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su.g f38508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f38509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f38510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f38511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(su.g gVar, d dVar, l3 l3Var, l3 l3Var2, yt.a aVar) {
        super(2, aVar);
        this.f38508d = gVar;
        this.f38509e = dVar;
        this.f38510f = l3Var;
        this.f38511g = l3Var2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h hVar = new h(this.f38508d, this.f38509e, this.f38510f, this.f38511g, aVar);
        hVar.f38507c = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f38506b
            r3 = 1
            if (r2 == 0) goto L20
            if (r2 != r3) goto L18
            su.b r2 = r0.f38505a
            java.lang.Object r4 = r0.f38507c
            qu.f0 r4 = (qu.f0) r4
            ut.n.b(r18)
            r6 = r18
            r5 = r0
            goto L40
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            ut.n.b(r18)
            java.lang.Object r2 = r0.f38507c
            qu.f0 r2 = (qu.f0) r2
            su.g r4 = r0.f38508d
            su.b r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L33:
            r5.f38507c = r4
            r5.f38505a = r2
            r5.f38506b = r3
            java.lang.Object r6 = r2.b(r5)
            if (r6 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r2.c()
            su.g r7 = r5.f38508d
            java.lang.Object r7 = r7.i()
            boolean r8 = r7 instanceof su.i
            r9 = 0
            if (r8 != 0) goto L58
            goto L59
        L58:
            r7 = r9
        L59:
            if (r7 != 0) goto L5d
            r11 = r6
            goto L5e
        L5d:
            r11 = r7
        L5e:
            w.g r6 = new w.g
            w.d r12 = r5.f38509e
            t0.l3 r13 = r5.f38510f
            t0.l3 r14 = r5.f38511g
            r15 = 0
            r10 = r6
            r10.<init>(r11, r12, r13, r14, r15)
            r7 = 3
            yk.g.H(r4, r9, r9, r6, r7)
            goto L33
        L70:
            kotlin.Unit r1 = kotlin.Unit.f23355a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
