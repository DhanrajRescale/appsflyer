package x1;

import d2.j3;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 implements w2.b, yt.a {

    /* renamed from: a, reason: collision with root package name */
    public final yt.a f39886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f39887b;

    /* renamed from: c, reason: collision with root package name */
    public qu.h f39888c;

    /* renamed from: d, reason: collision with root package name */
    public l f39889d = l.f39878b;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.k f39890e = kotlin.coroutines.k.f23369a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f39891f;

    public m0(o0 o0Var, qu.i iVar) {
        this.f39891f = o0Var;
        this.f39886a = iVar;
        this.f39887b = o0Var;
    }

    @Override // w2.b
    public final long H(float f10) {
        return this.f39887b.H(f10);
    }

    @Override // w2.b
    public final float N(int i10) {
        return this.f39887b.N(i10);
    }

    @Override // w2.b
    public final float P(float f10) {
        return this.f39887b.P(f10);
    }

    @Override // w2.b
    public final float Y() {
        return this.f39887b.Y();
    }

    public final Object a(l lVar, au.a frame) {
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        this.f39889d = lVar;
        this.f39888c = iVar;
        Object p10 = iVar.p();
        if (p10 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p10;
    }

    @Override // w2.b
    public final float b() {
        return this.f39887b.b();
    }

    public final long c() {
        o0 o0Var = this.f39891f;
        o0Var.getClass();
        long s02 = o0Var.s0(c2.g.y(o0Var).f1419t.d());
        long j10 = o0Var.f39904t;
        return t0.t.j(Math.max(s0.g.f34069a, m1.f.e(s02) - ((int) (j10 >> 32))) / 2.0f, Math.max(s0.g.f34069a, m1.f.c(s02) - ((int) (j10 & 4294967295L))) / 2.0f);
    }

    @Override // w2.b
    public final float c0(float f10) {
        return this.f39887b.b() * f10;
    }

    public final j3 f() {
        o0 o0Var = this.f39891f;
        o0Var.getClass();
        return c2.g.y(o0Var).f1419t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [qu.o1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [qu.o1] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(long r7, kotlin.jvm.functions.Function2 r9, yt.a r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof x1.j0
            if (r0 == 0) goto L13
            r0 = r10
            x1.j0 r0 = (x1.j0) r0
            int r1 = r0.f39869d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39869d = r1
            goto L18
        L13:
            x1.j0 r0 = new x1.j0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f39867b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f39869d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qu.h2 r7 = r0.f39866a
            ut.n.b(r10)     // Catch: java.lang.Throwable -> L29
            goto L6a
        L29:
            r8 = move-exception
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            ut.n.b(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4e
            qu.h r10 = r6.f39888c
            if (r10 == 0) goto L4e
            ut.l$a r2 = ut.l.INSTANCE
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r7)
            ut.m r2 = ut.n.a(r2)
            r10.resumeWith(r2)
        L4e:
            x1.o0 r10 = r6.f39891f
            qu.f0 r10 = r10.E0()
            x1.k0 r2 = new x1.k0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            qu.h2 r7 = yk.g.H(r10, r4, r4, r2, r7)
            r0.f39866a = r7     // Catch: java.lang.Throwable -> L29
            r0.f39869d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L6a
            return r1
        L6a:
            x1.b r8 = x1.b.f39826a
            r7.a(r8)
            return r10
        L70:
            x1.b r9 = x1.b.f39826a
            r7.a(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m0.g(long, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f39890e;
    }

    @Override // w2.b
    public final int h0(long j10) {
        return this.f39887b.h0(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(long r5, y.l2 r7, yt.a r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x1.l0
            if (r0 == 0) goto L13
            r0 = r8
            x1.l0 r0 = (x1.l0) r0
            int r1 = r0.f39883c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39883c = r1
            goto L18
        L13:
            x1.l0 r0 = new x1.l0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f39881a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f39883c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r8)
            r0.f39883c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r8 = r4.g(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            if (r8 != r1) goto L3c
            return r1
        L3b:
            r8 = 0
        L3c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.m0.i(long, y.l2, yt.a):java.lang.Object");
    }

    @Override // w2.b
    public final int m0(float f10) {
        return this.f39887b.m0(f10);
    }

    @Override // w2.b
    public final long o(float f10) {
        return this.f39887b.o(f10);
    }

    @Override // w2.b
    public final long p(long j10) {
        return this.f39887b.p(j10);
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        o0 o0Var = this.f39891f;
        synchronized (o0Var.f39901q) {
            o0Var.f39901q.m(this);
            Unit unit = Unit.f23355a;
        }
        this.f39886a.resumeWith(obj);
    }

    @Override // w2.b
    public final long s0(long j10) {
        return this.f39887b.s0(j10);
    }

    @Override // w2.b
    public final float x(long j10) {
        return this.f39887b.x(j10);
    }

    @Override // w2.b
    public final float x0(long j10) {
        return this.f39887b.x0(j10);
    }
}
