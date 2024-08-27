package x1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f39874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39875b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f39876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j10, m0 m0Var, yt.a aVar) {
        super(2, aVar);
        this.f39875b = j10;
        this.f39876c = m0Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new k0(this.f39875b, this.f39876c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r10.f39874a
            r2 = 1
            long r4 = r10.f39875b
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L20
            if (r1 == r7) goto L1c
            if (r1 != r6) goto L14
            ut.n.b(r11)
            goto L37
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            ut.n.b(r11)
            goto L2e
        L20:
            ut.n.b(r11)
            long r8 = r4 - r2
            r10.f39874a = r7
            java.lang.Object r11 = kp.j.K(r8, r10)
            if (r11 != r0) goto L2e
            return r0
        L2e:
            r10.f39874a = r6
            java.lang.Object r11 = kp.j.K(r2, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            x1.m0 r11 = r10.f39876c
            qu.h r11 = r11.f39888c
            if (r11 == 0) goto L4b
            ut.l$a r0 = ut.l.INSTANCE
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r0.<init>(r4)
            ut.m r0 = ut.n.a(r0)
            r11.resumeWith(r0)
        L4b:
            kotlin.Unit r11 = kotlin.Unit.f23355a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
