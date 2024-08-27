package fd;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f16036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16037b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, yt.a aVar) {
        super(2, aVar);
        this.f16037b = cVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new a(this.f16037b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:15:0x0040). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r9.f16036a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            fd.c r6 = r9.f16037b
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            ut.n.b(r10)
            goto L79
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            ut.n.b(r10)
            goto L3f
        L24:
            ut.n.b(r10)
            r10 = r9
            goto L55
        L29:
            ut.n.b(r10)
            goto L3b
        L2d:
            ut.n.b(r10)
            long r7 = r6.f16040a
            r9.f16036a = r5
            java.lang.Object r10 = kp.j.K(r7, r9)
            if (r10 != r0) goto L3b
            return r0
        L3b:
            java.lang.Long r10 = r6.f16041b
            if (r10 == 0) goto L66
        L3f:
            r10 = r9
        L40:
            fd.c r1 = r10.f16037b
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f16042c
            boolean r2 = r2.get()
            if (r2 == 0) goto L79
            r10.f16036a = r4
            fd.b r1 = r1.f16043d
            java.lang.Object r1 = r1.invoke(r10)
            if (r1 != r0) goto L55
            return r0
        L55:
            fd.c r1 = r10.f16037b
            java.lang.Long r1 = r1.f16041b
            long r1 = r1.longValue()
            r10.f16036a = r3
            java.lang.Object r1 = kp.j.K(r1, r10)
            if (r1 != r0) goto L40
            return r0
        L66:
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.f16042c
            boolean r10 = r10.get()
            if (r10 == 0) goto L79
            r9.f16036a = r2
            fd.b r10 = r6.f16043d
            java.lang.Object r10 = r10.invoke(r9)
            if (r10 != r0) goto L79
            return r0
        L79:
            kotlin.Unit r10 = kotlin.Unit.f23355a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
