package g7;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p4 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f17006a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q4 f17008c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f17010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(q4 q4Var, int i10, Function1 function1, yt.a aVar) {
        super(2, aVar);
        this.f17008c = q4Var;
        this.f17009d = i10;
        this.f17010e = function1;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        p4 p4Var = new p4(this.f17008c, this.f17009d, this.f17010e, aVar);
        p4Var.f17007b = obj;
        return p4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p4) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qu.o1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [qu.o1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [g7.n4] */
    /* JADX WARN: Type inference failed for: r9v14, types: [g7.n4] */
    @Override // au.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            zt.a r0 = zt.a.f42823a
            int r1 = r8.f17006a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            g7.q4 r6 = r8.f17008c
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r0 = r8.f17007b
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            ut.n.b(r9)
            goto L94
        L25:
            ut.n.b(r9)
            goto L95
        L2a:
            java.lang.Object r1 = r8.f17007b
            qu.o1 r1 = (qu.o1) r1
            ut.n.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L78
        L32:
            r9 = move-exception
            goto L86
        L34:
            java.lang.Object r1 = r8.f17007b
            qu.o1 r1 = (qu.o1) r1
            ut.n.b(r9)
            goto L63
        L3c:
            ut.n.b(r9)
            java.lang.Object r9 = r8.f17007b
            qu.f0 r9 = (qu.f0) r9
            kotlin.coroutines.CoroutineContext r9 = r9.H()
            qu.c0 r1 = qu.c0.f32192b
            kotlin.coroutines.CoroutineContext$Element r9 = r9.g(r1)
            if (r9 == 0) goto L98
            qu.o1 r9 = (qu.o1) r9
            g7.n4 r1 = r6.f17023a
            r8.f17007b = r9
            r8.f17006a = r5
            int r5 = r8.f17009d
            java.lang.Object r1 = r1.b(r5, r9, r8)
            if (r1 != r0) goto L60
            return r0
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L95
            kotlin.jvm.functions.Function1 r9 = r8.f17010e     // Catch: java.lang.Throwable -> L32
            r8.f17007b = r1     // Catch: java.lang.Throwable -> L32
            r8.f17006a = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != r0) goto L78
            return r0
        L78:
            g7.n4 r9 = r6.f17023a
            r2 = 0
            r8.f17007b = r2
            r8.f17006a = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L95
            return r0
        L86:
            g7.n4 r3 = r6.f17023a
            r8.f17007b = r9
            r8.f17006a = r2
            java.lang.Object r1 = r3.a(r1, r8)
            if (r1 != r0) goto L93
            return r0
        L93:
            r0 = r9
        L94:
            throw r0
        L95:
            kotlin.Unit r9 = kotlin.Unit.f23355a
            return r9
        L98:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.p4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
