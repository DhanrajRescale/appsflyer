package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public su.b f16815a;

    /* renamed from: b, reason: collision with root package name */
    public int f16816b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu.g f16818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f16819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(tu.g gVar, Function2 function2, yt.a aVar) {
        super(2, aVar);
        this.f16818d = gVar;
        this.f16819e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        h4 h4Var = new h4(this.f16818d, this.f16819e, aVar);
        h4Var.f16817c = obj;
        return h4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v12, types: [qu.o1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [qu.o1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:7:0x004c). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r10.f16816b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            su.b r1 = r10.f16815a
            java.lang.Object r5 = r10.f16817c
            qu.o1 r5 = (qu.o1) r5
            ut.n.b(r11)
            r11 = r5
            r5 = r1
            goto L4b
        L19:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L21:
            su.b r1 = r10.f16815a
            java.lang.Object r5 = r10.f16817c
            qu.o1 r5 = (qu.o1) r5
            ut.n.b(r11)
            r6 = r5
            r5 = r10
            goto L5f
        L2d:
            ut.n.b(r11)
            java.lang.Object r11 = r10.f16817c
            qu.f0 r11 = (qu.f0) r11
            r1 = 0
            r5 = 6
            su.c r1 = hl.f.a(r1, r2, r5)
            g7.g4 r5 = new g7.g4
            kotlin.jvm.functions.Function2 r6 = r10.f16819e
            r5.<init>(r1, r6, r2)
            r6 = 3
            qu.h2 r11 = yk.g.H(r11, r2, r2, r5, r6)
            su.b r5 = new su.b
            r5.<init>(r1)
        L4b:
            r1 = r10
        L4c:
            r1.f16817c = r11
            r1.f16815a = r5
            r1.f16816b = r4
            java.lang.Object r6 = r5.b(r1)
            if (r6 != r0) goto L59
            return r0
        L59:
            r8 = r6
            r6 = r11
            r11 = r8
            r9 = r5
            r5 = r1
            r1 = r9
        L5f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L7f
            java.lang.Object r11 = r1.c()
            r5.f16817c = r6
            r5.f16815a = r1
            r5.f16816b = r3
            tu.g r7 = r5.f16818d
            java.lang.Object r11 = r7.a(r11, r5)
            if (r11 != r0) goto L7a
            return r0
        L7a:
            r11 = r6
            r8 = r5
            r5 = r1
            r1 = r8
            goto L4c
        L7f:
            r6.a(r2)
            kotlin.Unit r11 = kotlin.Unit.f23355a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.h4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
