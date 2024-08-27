package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f40633a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f40634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1.z f40635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f40636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x1.z zVar, j jVar, yt.a aVar) {
        super(2, aVar);
        this.f40635c = zVar;
        this.f40636d = jVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        c cVar = new c(this.f40635c, this.f40636d, aVar);
        cVar.f40634b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r7.f40633a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r7.f40634b
            qu.f0 r0 = (qu.f0) r0
            ut.n.b(r8)     // Catch: java.util.concurrent.CancellationException -> L11
            goto L45
        L11:
            r8 = move-exception
            goto L3f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            ut.n.b(r8)
            java.lang.Object r8 = r7.f40634b
            qu.f0 r8 = (qu.f0) r8
            x1.z r1 = r7.f40635c     // Catch: java.util.concurrent.CancellationException -> L3d
            y.b r3 = new y.b     // Catch: java.util.concurrent.CancellationException -> L3d
            y.j r4 = r7.f40636d     // Catch: java.util.concurrent.CancellationException -> L3d
            r5 = 0
            r3.<init>(r4, r5, r8)     // Catch: java.util.concurrent.CancellationException -> L3d
            r7.f40634b = r8     // Catch: java.util.concurrent.CancellationException -> L3d
            r7.f40633a = r2     // Catch: java.util.concurrent.CancellationException -> L3d
            x1.o0 r1 = (x1.o0) r1     // Catch: java.util.concurrent.CancellationException -> L3d
            java.lang.Object r8 = r1.Q0(r3, r7)     // Catch: java.util.concurrent.CancellationException -> L3d
            if (r8 != r0) goto L45
            return r0
        L39:
            r6 = r0
            r0 = r8
            r8 = r6
            goto L3f
        L3d:
            r0 = move-exception
            goto L39
        L3f:
            boolean r0 = hl.f.u0(r0)
            if (r0 == 0) goto L48
        L45:
            kotlin.Unit r8 = kotlin.Unit.f23355a
            return r8
        L48:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
