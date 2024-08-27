package w1;

import b2.j;
import g1.n;
import kotlin.Pair;
import qu.f0;
import t0.t;

/* loaded from: classes.dex */
public final class g extends n implements b2.f, a {

    /* renamed from: n, reason: collision with root package name */
    public a f38771n;

    /* renamed from: o, reason: collision with root package name */
    public d f38772o;

    /* renamed from: p, reason: collision with root package name */
    public final j f38773p;

    public g(a aVar, d dVar) {
        this.f38771n = aVar;
        this.f38772o = dVar == null ? new d() : dVar;
        this.f38773p = t.i0(new Pair(i.f38775a, this));
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        long j11;
        a R0 = R0();
        if (R0 != null) {
            j11 = R0.I(i10, j10);
        } else {
            int i11 = m1.c.f27236e;
            j11 = m1.c.f27233b;
        }
        return m1.c.h(j11, this.f38771n.I(i10, m1.c.g(j10, j11)));
    }

    @Override // g1.n
    public final void I0() {
        d dVar = this.f38772o;
        dVar.f38757a = this;
        dVar.f38758b = new x.a(this, 25);
        dVar.f38759c = E0();
    }

    @Override // g1.n
    public final void J0() {
        d dVar = this.f38772o;
        if (dVar.f38757a == this) {
            dVar.f38757a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(long r9, yt.a r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof w1.f
            if (r0 == 0) goto L13
            r0 = r11
            w1.f r0 = (w1.f) r0
            int r1 = r0.f38770e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38770e = r1
            goto L18
        L13:
            w1.f r0 = new w1.f
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f38768c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f38770e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r9 = r0.f38767b
            ut.n.b(r11)
            goto L73
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            long r9 = r0.f38767b
            w1.g r2 = r0.f38766a
            ut.n.b(r11)
            goto L53
        L3c:
            ut.n.b(r11)
            w1.a r11 = r8.R0()
            if (r11 == 0) goto L5b
            r0.f38766a = r8
            r0.f38767b = r9
            r0.f38770e = r4
            java.lang.Object r11 = r11.O(r9, r0)
            if (r11 != r1) goto L52
            return r1
        L52:
            r2 = r8
        L53:
            w2.o r11 = (w2.o) r11
            long r4 = r11.f38810a
        L57:
            r6 = r9
            r9 = r4
            r4 = r6
            goto L5f
        L5b:
            long r4 = w2.o.f38808b
            r2 = r8
            goto L57
        L5f:
            w1.a r11 = r2.f38771n
            long r4 = w2.o.d(r4, r9)
            r2 = 0
            r0.f38766a = r2
            r0.f38767b = r9
            r0.f38770e = r3
            java.lang.Object r11 = r11.O(r4, r0)
            if (r11 != r1) goto L73
            return r1
        L73:
            w2.o r11 = (w2.o) r11
            long r0 = r11.f38810a
            long r9 = w2.o.e(r9, r0)
            w2.o r11 = new w2.o
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g.O(long, yt.a):java.lang.Object");
    }

    public final f0 Q0() {
        g gVar;
        if (this.f16417m) {
            gVar = (g) c(i.f38775a);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            return gVar.Q0();
        }
        f0 f0Var = this.f38772o.f38759c;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final a R0() {
        if (this.f16417m) {
            return (a) c(i.f38775a);
        }
        return null;
    }

    @Override // b2.f
    public final kp.j V() {
        return this.f38773p;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(long r16, long r18, yt.a r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof w1.e
            if (r2 == 0) goto L16
            r2 = r1
            w1.e r2 = (w1.e) r2
            int r3 = r2.f38765f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f38765f = r3
            goto L1b
        L16:
            w1.e r2 = new w1.e
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f38763d
            zt.a r9 = zt.a.f42823a
            int r3 = r2.f38765f
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L43
            if (r3 == r4) goto L37
            if (r3 != r10) goto L2f
            long r2 = r2.f38761b
            ut.n.b(r1)
            goto L86
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            long r3 = r2.f38762c
            long r5 = r2.f38761b
            w1.g r7 = r2.f38760a
            ut.n.b(r1)
            r13 = r3
            r11 = r5
            goto L61
        L43:
            ut.n.b(r1)
            w1.a r3 = r0.f38771n
            r2.f38760a = r0
            r11 = r16
            r2.f38761b = r11
            r13 = r18
            r2.f38762c = r13
            r2.f38765f = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.f(r4, r6, r8)
            if (r1 != r9) goto L60
            return r9
        L60:
            r7 = r0
        L61:
            w2.o r1 = (w2.o) r1
            long r4 = r1.f38810a
            w1.a r3 = r7.R0()
            if (r3 == 0) goto L8c
            long r6 = w2.o.e(r11, r4)
            long r11 = w2.o.d(r13, r4)
            r1 = 0
            r2.f38760a = r1
            r2.f38761b = r4
            r2.f38765f = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.f(r4, r6, r8)
            if (r1 != r9) goto L85
            return r9
        L85:
            r2 = r13
        L86:
            w2.o r1 = (w2.o) r1
            long r4 = r1.f38810a
            r13 = r2
            goto L8f
        L8c:
            r13 = r4
            long r4 = w2.o.f38808b
        L8f:
            long r1 = w2.o.e(r13, r4)
            w2.o r3 = new w2.o
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g.f(long, long, yt.a):java.lang.Object");
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        long j12;
        long l02 = this.f38771n.l0(i10, j10, j11);
        a R0 = R0();
        if (R0 != null) {
            j12 = R0.l0(i10, m1.c.h(j10, l02), m1.c.g(j11, l02));
        } else {
            int i11 = m1.c.f27236e;
            j12 = m1.c.f27233b;
        }
        return m1.c.h(l02, j12);
    }
}
