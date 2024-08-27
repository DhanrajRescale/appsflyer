package y;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z0 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f41006b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f41007c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f41008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f41009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(CoroutineContext coroutineContext, Function2 function2, yt.a aVar) {
        super(aVar);
        this.f41008d = coroutineContext;
        this.f41009e = function2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        z0 z0Var = new z0(this.f41008d, this.f41009e, aVar);
        z0Var.f41007c = obj;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((x1.m0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0060 -> B:5:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0081 -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r8.f41006b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r8.f41007c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r9)
            goto L26
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f41007c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r9)     // Catch: java.util.concurrent.CancellationException -> L28
        L26:
            r9 = r1
            goto L3c
        L28:
            r9 = move-exception
            r5 = r1
            r1 = r8
            goto L6e
        L2c:
            java.lang.Object r1 = r8.f41007c
            x1.m0 r1 = (x1.m0) r1
            ut.n.b(r9)     // Catch: java.util.concurrent.CancellationException -> L28
            r9 = r8
            goto L55
        L35:
            ut.n.b(r9)
            java.lang.Object r9 = r8.f41007c
            x1.m0 r9 = (x1.m0) r9
        L3c:
            r1 = r8
        L3d:
            kotlin.coroutines.CoroutineContext r5 = r1.f41008d
            boolean r5 = hl.f.t0(r5)
            if (r5 == 0) goto L84
            kotlin.jvm.functions.Function2 r5 = r1.f41009e     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f41007c = r9     // Catch: java.util.concurrent.CancellationException -> L6a
            r1.f41006b = r4     // Catch: java.util.concurrent.CancellationException -> L6a
            java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6a
            if (r5 != r0) goto L52
            return r0
        L52:
            r7 = r1
            r1 = r9
            r9 = r7
        L55:
            r9.f41007c = r1     // Catch: java.util.concurrent.CancellationException -> L64
            r9.f41006b = r3     // Catch: java.util.concurrent.CancellationException -> L64
            java.lang.Object r5 = qu.i0.g(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L64
            if (r5 != r0) goto L60
            return r0
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
            goto L3d
        L64:
            r5 = move-exception
            r7 = r1
            r1 = r9
            r9 = r5
            r5 = r7
            goto L6e
        L6a:
            r5 = move-exception
            r7 = r5
            r5 = r9
            r9 = r7
        L6e:
            kotlin.coroutines.CoroutineContext r6 = r1.f41008d
            boolean r6 = hl.f.t0(r6)
            if (r6 == 0) goto L83
            r1.f41007c = r5
            r1.f41006b = r2
            java.lang.Object r9 = qu.i0.g(r5, r1)
            if (r9 != r0) goto L81
            return r0
        L81:
            r9 = r5
            goto L3d
        L83:
            throw r9
        L84:
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
