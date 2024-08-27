package bv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7326b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f7327c;

    /* renamed from: d, reason: collision with root package name */
    public int f7328d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7329e;

    /* renamed from: f, reason: collision with root package name */
    public long f7330f;

    public c0(l upstream) {
        int i10;
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f7325a = upstream;
        j h10 = upstream.h();
        this.f7326b = h10;
        f0 f0Var = h10.f7364a;
        this.f7327c = f0Var;
        if (f0Var != null) {
            i10 = f0Var.f7344b;
        } else {
            i10 = -1;
        }
        this.f7328d = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7329e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r3 == r5.f7344b) goto L15;
     */
    @Override // bv.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(bv.j r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.f7329e
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            bv.f0 r3 = r8.f7327c
            bv.j r4 = r8.f7326b
            if (r3 == 0) goto L31
            bv.f0 r5 = r4.f7364a
            if (r3 != r5) goto L25
            int r3 = r8.f7328d
            kotlin.jvm.internal.Intrinsics.c(r5)
            int r5 = r5.f7344b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f7330f
            r2 = 1
            long r0 = r0 + r2
            bv.l r2 = r8.f7325a
            boolean r0 = r2.F(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            bv.f0 r0 = r8.f7327c
            if (r0 != 0) goto L52
            bv.f0 r0 = r4.f7364a
            if (r0 == 0) goto L52
            r8.f7327c = r0
            int r0 = r0.f7344b
            r8.f7328d = r0
        L52:
            long r0 = r4.f7365b
            long r2 = r8.f7330f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            bv.j r2 = r8.f7326b
            long r3 = r8.f7330f
            r5 = r9
            r6 = r10
            r2.d(r3, r5, r6)
            long r0 = r8.f7330f
            long r0 = r0 + r10
            r8.f7330f = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = nn.d.j(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.c0.read(bv.j, long):long");
    }

    @Override // bv.k0
    public final n0 timeout() {
        return this.f7325a.timeout();
    }
}
