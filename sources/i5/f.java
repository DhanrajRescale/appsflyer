package i5;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* loaded from: classes.dex */
public abstract class f implements c1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f19409b;

    /* renamed from: d, reason: collision with root package name */
    public h1 f19411d;

    /* renamed from: e, reason: collision with root package name */
    public int f19412e;

    /* renamed from: f, reason: collision with root package name */
    public j5.d0 f19413f;

    /* renamed from: g, reason: collision with root package name */
    public int f19414g;

    /* renamed from: h, reason: collision with root package name */
    public r5.v0 f19415h;

    /* renamed from: i, reason: collision with root package name */
    public b5.v[] f19416i;

    /* renamed from: j, reason: collision with root package name */
    public long f19417j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19419l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19420m;

    /* renamed from: n, reason: collision with root package name */
    public g1 f19421n;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19408a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final tr.e f19410c = new tr.e(10, (Object) null);

    /* renamed from: k, reason: collision with root package name */
    public long f19418k = Long.MIN_VALUE;

    public f(int i10) {
        this.f19409b = i10;
    }

    public static int e(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public static int h(int i10) {
        return i10 & 384;
    }

    public static int i(int i10) {
        return i10 & 64;
    }

    public /* bridge */ /* synthetic */ void A(float f10, float f11) {
    }

    public abstract int B(b5.v vVar);

    public int C() {
        return 0;
    }

    @Override // i5.c1
    public void c(int i10, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.ExoPlaybackException f(int r13, b5.v r14, java.lang.Exception r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f19420m
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f19420m = r3
            r3 = 0
            int r4 = r12.B(r14)     // Catch: java.lang.Throwable -> L16 androidx.media3.exoplayer.ExoPlaybackException -> L1b
            r4 = r4 & 7
            r1.f19420m = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f19420m = r3
            throw r2
        L1b:
            r1.f19420m = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.k()
            int r7 = r1.f19412e
            androidx.media3.exoplayer.ExoPlaybackException r11 = new androidx.media3.exoplayer.ExoPlaybackException
            r3 = 1
            if (r0 != 0) goto L2b
            r9 = r2
            goto L2c
        L2b:
            r9 = r4
        L2c:
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.f.f(int, b5.v, java.lang.Exception, boolean):androidx.media3.exoplayer.ExoPlaybackException");
    }

    public final ExoPlaybackException g(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, b5.v vVar) {
        return f(4002, vVar, mediaCodecUtil$DecoderQueryException, false);
    }

    public o0 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.f19418k == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o();

    public void p(boolean z10, boolean z11) {
    }

    public abstract void q(long j10, boolean z10);

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public abstract void v(b5.v[] vVarArr, long j10, long j11);

    public final int w(tr.e eVar, h5.f fVar, int i10) {
        r5.v0 v0Var = this.f19415h;
        v0Var.getClass();
        int f10 = v0Var.f(eVar, fVar, i10);
        if (f10 == -4) {
            if (fVar.g(4)) {
                this.f19418k = Long.MIN_VALUE;
                if (this.f19419l) {
                    return -4;
                }
                return -3;
            }
            long j10 = fVar.f18004f + this.f19417j;
            fVar.f18004f = j10;
            this.f19418k = Math.max(this.f19418k, j10);
        } else if (f10 == -5) {
            b5.v vVar = (b5.v) eVar.f36362c;
            vVar.getClass();
            long j11 = vVar.f3656p;
            if (j11 != Long.MAX_VALUE) {
                b5.u a10 = vVar.a();
                a10.f3604o = j11 + this.f19417j;
                eVar.f36362c = a10.a();
            }
        }
        return f10;
    }

    public abstract void x(long j10, long j11);

    public final void y(b5.v[] vVarArr, r5.v0 v0Var, long j10, long j11) {
        yk.j.H0(!this.f19419l);
        this.f19415h = v0Var;
        if (this.f19418k == Long.MIN_VALUE) {
            this.f19418k = j10;
        }
        this.f19416i = vVarArr;
        this.f19417j = j11;
        v(vVarArr, j10, j11);
    }

    public final void z() {
        boolean z10;
        if (this.f19414g == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        this.f19410c.m();
        s();
    }
}
