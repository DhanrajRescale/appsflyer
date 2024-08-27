package p0;

import i0.g2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.t;

/* loaded from: classes.dex */
public final class l implements w1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f30471a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f30472b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30473c;

    public l(g2 g2Var, j jVar, boolean z10) {
        this.f30471a = g2Var;
        this.f30472b = jVar;
        this.f30473c = z10;
    }

    @Override // w1.a
    public final long I(int i10, long j10) {
        if (!this.f30473c) {
            int i11 = m1.c.f27236e;
            return m1.c.f27233b;
        }
        if (dp.b.h1(i10, 1) && m1.c.e(j10) < s0.g.f34069a) {
            return t.g(s0.g.f34069a, ((Number) this.f30471a.invoke(Float.valueOf(m1.c.e(j10)))).floatValue());
        }
        int i12 = m1.c.f27236e;
        return m1.c.f27233b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // w1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(long r5, yt.a r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p0.k
            if (r0 == 0) goto L13
            r0 = r7
            p0.k r0 = (p0.k) r0
            int r1 = r0.f30470c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30470c = r1
            goto L18
        L13:
            p0.k r0 = new p0.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f30468a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f30470c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r7)
            float r5 = w2.o.c(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.f30470c = r3
            kotlin.jvm.functions.Function2 r5 = r4.f30472b
            java.lang.Object r7 = r5.invoke(r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = hl.f.n(r6, r5)
            w2.o r7 = new w2.o
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.l.O(long, yt.a):java.lang.Object");
    }

    @Override // w1.a
    public final long l0(int i10, long j10, long j11) {
        if (!this.f30473c) {
            int i11 = m1.c.f27236e;
            return m1.c.f27233b;
        }
        if (dp.b.h1(i10, 1) && m1.c.e(j11) > s0.g.f34069a) {
            return t.g(s0.g.f34069a, ((Number) this.f30471a.invoke(Float.valueOf(m1.c.e(j11)))).floatValue());
        }
        int i12 = m1.c.f27236e;
        return m1.c.f27233b;
    }
}
