package t0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f35125a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f35126b = new x0();

    public p1(a1 a1Var) {
        this.f35125a = a1Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093 A[PHI: r8
  0x0093: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x0090, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // t0.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object U(kotlin.jvm.functions.Function1 r7, yt.a r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t0.o1
            if (r0 == 0) goto L13
            r0 = r8
            t0.o1 r0 = (t0.o1) r0
            int r1 = r0.f35105e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35105e = r1
            goto L18
        L13:
            t0.o1 r0 = new t0.o1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f35103c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f35105e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            ut.n.b(r8)
            goto L93
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.jvm.functions.Function1 r7 = r0.f35102b
            t0.p1 r2 = r0.f35101a
            ut.n.b(r8)
            goto L83
        L3a:
            ut.n.b(r8)
            t0.x0 r8 = r6.f35126b
            r0.f35101a = r6
            r0.f35102b = r7
            r0.f35105e = r4
            java.lang.Object r2 = r8.f35238a
            monitor-enter(r2)
            boolean r5 = r8.f35241d     // Catch: java.lang.Throwable -> L97
            monitor-exit(r2)
            if (r5 == 0) goto L50
            kotlin.Unit r8 = kotlin.Unit.f23355a
            goto L7f
        L50:
            qu.i r2 = new qu.i
            yt.a r5 = zt.f.b(r0)
            r2.<init>(r4, r5)
            r2.s()
            java.lang.Object r4 = r8.f35238a
            monitor-enter(r4)
            java.util.List r5 = r8.f35239b     // Catch: java.lang.Throwable -> L94
            r5.add(r2)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r4)
            x.z r4 = new x.z
            r5 = 21
            r4.<init>(r5, r8, r2)
            r2.u(r4)
            java.lang.Object r8 = r2.p()
            if (r8 != r1) goto L7a
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L7a:
            if (r8 != r1) goto L7d
            goto L7f
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f23355a
        L7f:
            if (r8 != r1) goto L82
            return r1
        L82:
            r2 = r6
        L83:
            t0.a1 r8 = r2.f35125a
            r2 = 0
            r0.f35101a = r2
            r0.f35102b = r2
            r0.f35105e = r3
            java.lang.Object r8 = r8.U(r7, r0)
            if (r8 != r1) goto L93
            return r1
        L93:
            return r8
        L94:
            r7 = move-exception
            monitor-exit(r4)
            throw r7
        L97:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.p1.U(kotlin.jvm.functions.Function1, yt.a):java.lang.Object");
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.a(this, iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.coroutines.g.a(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.b(this, iVar);
    }
}
