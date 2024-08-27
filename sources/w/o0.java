package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public iu.w f38627a;

    /* renamed from: b, reason: collision with root package name */
    public int f38628b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f38630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f38631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0.g1 g1Var, q0 q0Var, yt.a aVar) {
        super(2, aVar);
        this.f38630d = g1Var;
        this.f38631e = q0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        o0 o0Var = new o0(this.f38630d, this.f38631e, aVar);
        o0Var.f38629c = obj;
        return o0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v1, types: [iu.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [au.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x005b -> B:7:0x003c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0077 -> B:7:0x003c). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r12.f38628b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1f
            if (r1 != r3) goto L17
            iu.w r1 = r12.f38627a
            java.lang.Object r4 = r12.f38629c
            qu.f0 r4 = (qu.f0) r4
            ut.n.b(r13)
            r13 = r4
            goto L3b
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            iu.w r1 = r12.f38627a
            java.lang.Object r4 = r12.f38629c
            qu.f0 r4 = (qu.f0) r4
            ut.n.b(r13)
            r13 = r4
            r4 = r12
            goto L56
        L2b:
            ut.n.b(r13)
            java.lang.Object r13 = r12.f38629c
            qu.f0 r13 = (qu.f0) r13
            iu.w r1 = new iu.w
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f20557a = r4
        L3b:
            r4 = r12
        L3c:
            w.a r11 = new w.a
            t0.g1 r6 = r4.f38630d
            w.q0 r7 = r4.f38631e
            r10 = 1
            r5 = r11
            r8 = r1
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.f38629c = r13
            r4.f38627a = r1
            r4.f38628b = r2
            java.lang.Object r5 = w.e.A(r11, r4)
            if (r5 != r0) goto L56
            return r0
        L56:
            float r5 = r1.f20557a
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L3c
            w.m0 r5 = new w.m0
            r6 = 0
            r5.<init>(r13, r6)
            tu.j r5 = t0.t.z0(r5)
            w.n0 r6 = new w.n0
            r7 = 0
            r6.<init>(r3, r7)
            r4.f38629c = r13
            r4.f38627a = r1
            r4.f38628b = r3
            java.lang.Object r5 = el.l.U(r5, r6, r4)
            if (r5 != r0) goto L3c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
