package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f40774a;

    /* renamed from: b, reason: collision with root package name */
    public int f40775b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f40776c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j2 f40777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(j2 j2Var, yt.a aVar) {
        super(2, aVar);
        this.f40777d = j2Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        i2 i2Var = new i2(this.f40777d, aVar);
        i2Var.f40776c = ((w2.o) obj).f38810a;
        return i2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create(new w2.o(((w2.o) obj).f38810a), (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            zt.a r6 = zt.a.f42823a
            int r0 = r11.f40775b
            r1 = 3
            r2 = 2
            r3 = 1
            y.j2 r4 = r11.f40777d
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2c
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1b
            long r0 = r11.f40774a
            long r2 = r11.f40776c
            ut.n.b(r12)
            r9 = r0
            r0 = r12
            goto L76
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L23:
            long r2 = r11.f40774a
            long r7 = r11.f40776c
            ut.n.b(r12)
            r0 = r12
            goto L5b
        L2c:
            long r7 = r11.f40776c
            ut.n.b(r12)
            r0 = r12
            goto L45
        L33:
            ut.n.b(r12)
            long r7 = r11.f40776c
            w1.d r0 = r4.f40801f
            r11.f40776c = r7
            r11.f40775b = r3
            java.lang.Object r0 = r0.b(r7, r11)
            if (r0 != r6) goto L45
            return r6
        L45:
            w2.o r0 = (w2.o) r0
            long r9 = r0.f38810a
            long r9 = w2.o.d(r7, r9)
            r11.f40776c = r7
            r11.f40774a = r9
            r11.f40775b = r2
            java.lang.Object r0 = r4.b(r9, r11)
            if (r0 != r6) goto L5a
            return r6
        L5a:
            r2 = r9
        L5b:
            w2.o r0 = (w2.o) r0
            long r9 = r0.f38810a
            w1.d r0 = r4.f40801f
            long r2 = w2.o.d(r2, r9)
            r11.f40776c = r7
            r11.f40774a = r9
            r11.f40775b = r1
            r1 = r2
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L75
            return r6
        L75:
            r2 = r7
        L76:
            w2.o r0 = (w2.o) r0
            long r0 = r0.f38810a
            long r0 = w2.o.d(r9, r0)
            long r0 = w2.o.d(r2, r0)
            w2.o r2 = new w2.o
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
