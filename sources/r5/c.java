package r5;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import i5.j1;

/* loaded from: classes.dex */
public final class c implements u, t {

    /* renamed from: a, reason: collision with root package name */
    public final u f33093a;

    /* renamed from: b, reason: collision with root package name */
    public t f33094b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f33095c = new b[0];

    /* renamed from: d, reason: collision with root package name */
    public long f33096d;

    /* renamed from: e, reason: collision with root package name */
    public long f33097e;

    /* renamed from: f, reason: collision with root package name */
    public long f33098f;

    /* renamed from: g, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f33099g;

    public c(u uVar, boolean z10, long j10, long j11) {
        long j12;
        this.f33093a = uVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f33096d = j12;
        this.f33097e = j10;
        this.f33098f = j11;
    }

    @Override // r5.u
    public final void A(t tVar, long j10) {
        this.f33094b = tVar;
        this.f33093a.A(this, j10);
    }

    @Override // r5.u
    public final e1 D() {
        return this.f33093a.D();
    }

    @Override // r5.x0
    public final long G() {
        long G = this.f33093a.G();
        if (G != Long.MIN_VALUE) {
            long j10 = this.f33098f;
            if (j10 == Long.MIN_VALUE || G < j10) {
                return G;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // r5.x0
    public final void J(long j10) {
        this.f33093a.J(j10);
    }

    @Override // r5.t
    public final void a(u uVar) {
        if (this.f33099g != null) {
            return;
        }
        t tVar = this.f33094b;
        tVar.getClass();
        tVar.a(this);
    }

    @Override // r5.w0
    public final void b(x0 x0Var) {
        t tVar = this.f33094b;
        tVar.getClass();
        tVar.b(this);
    }

    public final boolean c() {
        return this.f33096d != -9223372036854775807L;
    }

    @Override // r5.u
    public final long g(long j10, j1 j1Var) {
        long j11;
        long j12 = this.f33097e;
        if (j10 == j12) {
            return j12;
        }
        long j13 = e5.x.j(j1Var.f19525a, 0L, j10 - j12);
        long j14 = j1Var.f19526b;
        long j15 = this.f33098f;
        if (j15 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j15 - j10;
        }
        long j16 = e5.x.j(j14, 0L, j11);
        if (j13 != j1Var.f19525a || j16 != j1Var.f19526b) {
            j1Var = new j1(j13, j16);
        }
        return this.f33093a.g(j10, j1Var);
    }

    @Override // r5.x0
    public final long i() {
        long i10 = this.f33093a.i();
        if (i10 != Long.MIN_VALUE) {
            long j10 = this.f33098f;
            if (j10 == Long.MIN_VALUE || i10 < j10) {
                return i10;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r1 > r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    @Override // r5.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(u5.s[] r14, boolean[] r15, r5.v0[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            r5.b[] r1 = new r5.b[r1]
            r0.f33095c = r1
            int r1 = r9.length
            r5.v0[] r10 = new r5.v0[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            r5.b[] r2 = r0.f33095c
            r3 = r9[r1]
            r5.b r3 = (r5.b) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            r5.v0 r12 = r3.f33087a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            r5.u r1 = r0.f33093a
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.o(r2, r3, r4, r5, r6)
            boolean r3 = r13.c()
            if (r3 == 0) goto L5d
            long r3 = r0.f33097e
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5d
            int r3 = r8.length
            r4 = r11
        L44:
            if (r4 >= r3) goto L5d
            r5 = r8[r4]
            if (r5 == 0) goto L5a
            b5.v r5 = r5.l()
            java.lang.String r6 = r5.f3652l
            java.lang.String r5 = r5.f3649i
            boolean r5 = b5.r0.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f33096d = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f33097e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f33098f
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7b
            goto L7d
        L7b:
            r3 = r11
            goto L7e
        L7d:
            r3 = 1
        L7e:
            yk.j.H0(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            r5.b[] r3 = r0.f33095c
            r3[r11] = r12
            goto L9e
        L8d:
            r5.b[] r4 = r0.f33095c
            r5 = r4[r11]
            if (r5 == 0) goto L97
            r5.v0 r5 = r5.f33087a
            if (r5 == r3) goto L9e
        L97:
            r5.b r5 = new r5.b
            r5.<init>(r13, r3)
            r4[r11] = r5
        L9e:
            r5.b[] r3 = r0.f33095c
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c.o(u5.s[], boolean[], r5.v0[], boolean[], long):long");
    }

    @Override // r5.u
    public final void p() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f33099g;
        if (clippingMediaSource$IllegalClippingException == null) {
            this.f33093a.p();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // r5.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long q(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f33096d = r0
            r5.b[] r0 = r5.f33095c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f33088b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            r5.u r0 = r5.f33093a
            long r0 = r0.q(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f33097e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f33098f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            yk.j.H0(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.c.q(long):long");
    }

    @Override // r5.u
    public final void r(long j10) {
        this.f33093a.r(j10);
    }

    @Override // r5.x0
    public final boolean s(long j10) {
        return this.f33093a.s(j10);
    }

    @Override // r5.x0
    public final boolean u() {
        return this.f33093a.u();
    }

    @Override // r5.u
    public final long w() {
        boolean z10;
        if (c()) {
            long j10 = this.f33096d;
            this.f33096d = -9223372036854775807L;
            long w10 = w();
            if (w10 != -9223372036854775807L) {
                return w10;
            }
            return j10;
        }
        long w11 = this.f33093a.w();
        if (w11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (w11 >= this.f33097e) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        long j11 = this.f33098f;
        if (j11 == Long.MIN_VALUE || w11 <= j11) {
            z11 = true;
        }
        yk.j.H0(z11);
        return w11;
    }
}
