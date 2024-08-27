package o5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.airbnb.deeplinkdispatch.MetadataMasks;
import e5.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k5.i0;
import r5.v0;

/* loaded from: classes.dex */
public abstract class p extends i5.f {
    public static final byte[] V0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, MetadataMasks.ConfigurablePathSegmentMask, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public b5.v A;
    public boolean A0;
    public b5.v B;
    public boolean B0;
    public n5.i C;
    public boolean C0;
    public n5.i D;
    public boolean D0;
    public MediaCrypto E;
    public int E0;
    public boolean F;
    public int F0;
    public final long G;
    public int G0;
    public float H;
    public boolean H0;
    public float I;
    public boolean I0;
    public k J;
    public boolean J0;
    public long K0;
    public long L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public ExoPlaybackException Q0;
    public i5.g R0;
    public o S0;
    public long T0;
    public boolean U0;
    public b5.v X;
    public MediaFormat Y;
    public boolean Z;

    /* renamed from: e0, reason: collision with root package name */
    public float f29643e0;

    /* renamed from: f0, reason: collision with root package name */
    public ArrayDeque f29644f0;

    /* renamed from: g0, reason: collision with root package name */
    public MediaCodecRenderer$DecoderInitializationException f29645g0;

    /* renamed from: h0, reason: collision with root package name */
    public m f29646h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f29647i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f29648j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f29649k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f29650l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f29651m0;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public final j f29652o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f29653o0;

    /* renamed from: p, reason: collision with root package name */
    public final q f29654p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f29655p0;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29656q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f29657q0;

    /* renamed from: r, reason: collision with root package name */
    public final float f29658r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f29659r0;

    /* renamed from: s, reason: collision with root package name */
    public final h5.f f29660s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f29661s0;

    /* renamed from: t, reason: collision with root package name */
    public final h5.f f29662t;

    /* renamed from: t0, reason: collision with root package name */
    public h f29663t0;

    /* renamed from: u, reason: collision with root package name */
    public final h5.f f29664u;

    /* renamed from: u0, reason: collision with root package name */
    public long f29665u0;

    /* renamed from: v, reason: collision with root package name */
    public final g f29666v;

    /* renamed from: v0, reason: collision with root package name */
    public int f29667v0;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f29668w;

    /* renamed from: w0, reason: collision with root package name */
    public int f29669w0;

    /* renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f29670x;

    /* renamed from: x0, reason: collision with root package name */
    public ByteBuffer f29671x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayDeque f29672y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f29673y0;

    /* renamed from: z, reason: collision with root package name */
    public final i0 f29674z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f29675z0;

    /* JADX WARN: Type inference failed for: r4v4, types: [h5.f, o5.g] */
    /* JADX WARN: Type inference failed for: r4v6, types: [k5.i0, java.lang.Object] */
    public p(int i10, yq.b bVar, q qVar, float f10) {
        super(i10);
        this.f29652o = bVar;
        this.f29654p = qVar;
        this.f29656q = false;
        this.f29658r = f10;
        this.f29660s = new h5.f(0);
        this.f29662t = new h5.f(0);
        this.f29664u = new h5.f(2);
        ?? fVar = new h5.f(2);
        fVar.f29621l = 32;
        this.f29666v = fVar;
        this.f29668w = new ArrayList();
        this.f29670x = new MediaCodec.BufferInfo();
        this.H = 1.0f;
        this.I = 1.0f;
        this.G = -9223372036854775807L;
        this.f29672y = new ArrayDeque();
        n0(o.f29639d);
        fVar.k(0);
        fVar.f18002d.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f22123a = c5.c.f7956a;
        obj.f22125c = 0;
        obj.f22124b = 2;
        this.f29674z = obj;
        this.f29643e0 = -1.0f;
        this.f29647i0 = 0;
        this.E0 = 0;
        this.f29667v0 = -1;
        this.f29669w0 = -1;
        this.f29665u0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        this.F0 = 0;
        this.G0 = 0;
    }

    @Override // i5.f
    public void A(float f10, float f11) {
        this.H = f10;
        this.I = f11;
        r0(this.X);
    }

    @Override // i5.f
    public final int B(b5.v vVar) {
        try {
            return q0(this.f29654p, vVar);
        } catch (MediaCodecUtil$DecoderQueryException e10) {
            throw g(e10, vVar);
        }
    }

    @Override // i5.f
    public final int C() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00a0, code lost:
    
        r9 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0281 A[LOOP:0: B:26:0x0090->B:91:0x0281, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D(long r24, long r26) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p.D(long, long):boolean");
    }

    public abstract i5.h E(m mVar, b5.v vVar, b5.v vVar2);

    public MediaCodecDecoderException F(IllegalStateException illegalStateException, m mVar) {
        return new MediaCodecDecoderException(illegalStateException, mVar);
    }

    public final void G() {
        this.C0 = false;
        this.f29666v.i();
        this.f29664u.i();
        this.B0 = false;
        this.A0 = false;
        i0 i0Var = this.f29674z;
        i0Var.getClass();
        i0Var.f22123a = c5.c.f7956a;
        i0Var.f22125c = 0;
        i0Var.f22124b = 2;
    }

    public final boolean H() {
        if (this.H0) {
            this.F0 = 1;
            if (!this.f29649k0 && !this.f29651m0) {
                this.G0 = 2;
            } else {
                this.G0 = 3;
                return false;
            }
        } else {
            s0();
        }
        return true;
    }

    public final boolean I(long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        MediaCodec.BufferInfo bufferInfo;
        boolean g02;
        boolean z13;
        int f10;
        boolean z14;
        boolean z15;
        if (this.f29669w0 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f29670x;
        if (!z10) {
            if (this.n0 && this.I0) {
                try {
                    f10 = this.J.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.N0) {
                        i0();
                    }
                    return false;
                }
            } else {
                f10 = this.J.f(bufferInfo2);
            }
            if (f10 < 0) {
                if (f10 == -2) {
                    this.J0 = true;
                    MediaFormat b10 = this.J.b();
                    if (this.f29647i0 != 0 && b10.getInteger("width") == 32 && b10.getInteger("height") == 32) {
                        this.f29659r0 = true;
                    } else {
                        if (this.f29655p0) {
                            b10.setInteger("channel-count", 1);
                        }
                        this.Y = b10;
                        this.Z = true;
                    }
                    return true;
                }
                if (this.f29661s0 && (this.M0 || this.F0 == 2)) {
                    f0();
                }
                return false;
            }
            if (this.f29659r0) {
                this.f29659r0 = false;
                this.J.h(f10, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            }
            this.f29669w0 = f10;
            ByteBuffer l10 = this.J.l(f10);
            this.f29671x0 = l10;
            if (l10 != null) {
                l10.position(bufferInfo2.offset);
                this.f29671x0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f29653o0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.K0;
                if (j12 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f29668w;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((Long) arrayList.get(i10)).longValue() == j13) {
                        arrayList.remove(i10);
                        z14 = true;
                        break;
                    }
                    i10++;
                } else {
                    z14 = false;
                    break;
                }
            }
            this.f29673y0 = z14;
            long j14 = this.L0;
            long j15 = bufferInfo2.presentationTimeUs;
            if (j14 == j15) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f29675z0 = z15;
            t0(j15);
        }
        if (this.n0 && this.I0) {
            try {
                z11 = true;
                z12 = false;
                try {
                    g02 = g0(j10, j11, this.J, this.f29671x0, this.f29669w0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f29673y0, this.f29675z0, this.B);
                    bufferInfo = bufferInfo2;
                } catch (IllegalStateException unused2) {
                    f0();
                    if (this.N0) {
                        i0();
                    }
                    return z12;
                }
            } catch (IllegalStateException unused3) {
                z12 = false;
            }
        } else {
            z11 = true;
            z12 = false;
            bufferInfo = bufferInfo2;
            g02 = g0(j10, j11, this.J, this.f29671x0, this.f29669w0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f29673y0, this.f29675z0, this.B);
        }
        if (g02) {
            b0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z13 = z11;
            } else {
                z13 = z12;
            }
            this.f29669w0 = -1;
            this.f29671x0 = null;
            if (!z13) {
                return z11;
            }
            f0();
        }
        return z12;
    }

    public final boolean J() {
        boolean z10;
        h5.d dVar;
        k kVar = this.J;
        if (kVar == null || this.F0 == 2 || this.M0) {
            return false;
        }
        int i10 = this.f29667v0;
        h5.f fVar = this.f29662t;
        if (i10 < 0) {
            int e10 = kVar.e();
            this.f29667v0 = e10;
            if (e10 < 0) {
                return false;
            }
            fVar.f18002d = this.J.j(e10);
            fVar.i();
        }
        if (this.F0 == 1) {
            if (!this.f29661s0) {
                this.I0 = true;
                this.J.g(this.f29667v0, 0, 4, 0L);
                this.f29667v0 = -1;
                fVar.f18002d = null;
            }
            this.F0 = 2;
            return false;
        }
        if (this.f29657q0) {
            this.f29657q0 = false;
            fVar.f18002d.put(V0);
            this.J.g(this.f29667v0, 38, 0, 0L);
            this.f29667v0 = -1;
            fVar.f18002d = null;
            this.H0 = true;
            return true;
        }
        if (this.E0 == 1) {
            for (int i11 = 0; i11 < this.X.f3654n.size(); i11++) {
                fVar.f18002d.put((byte[]) this.X.f3654n.get(i11));
            }
            this.E0 = 2;
        }
        int position = fVar.f18002d.position();
        tr.e eVar = this.f19410c;
        eVar.m();
        try {
            int w10 = w(eVar, fVar, 0);
            if (l() || fVar.g(536870912)) {
                this.L0 = this.K0;
            }
            if (w10 == -3) {
                return false;
            }
            if (w10 == -5) {
                if (this.E0 == 2) {
                    fVar.i();
                    this.E0 = 1;
                }
                Y(eVar);
                return true;
            }
            if (fVar.g(4)) {
                if (this.E0 == 2) {
                    fVar.i();
                    this.E0 = 1;
                }
                this.M0 = true;
                if (!this.H0) {
                    f0();
                    return false;
                }
                try {
                    if (!this.f29661s0) {
                        this.I0 = true;
                        this.J.g(this.f29667v0, 0, 4, 0L);
                        this.f29667v0 = -1;
                        fVar.f18002d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e11) {
                    throw f(x.p(e11.getErrorCode()), this.A, e11, false);
                }
            }
            if (!this.H0 && !fVar.g(1)) {
                fVar.i();
                if (this.E0 == 2) {
                    this.E0 = 1;
                }
                return true;
            }
            boolean g10 = fVar.g(1073741824);
            h5.d dVar2 = fVar.f18001c;
            if (g10) {
                if (position == 0) {
                    dVar2.getClass();
                } else {
                    if (dVar2.f17994d == null) {
                        int[] iArr = new int[1];
                        dVar2.f17994d = iArr;
                        dVar2.f17999i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = dVar2.f17994d;
                    iArr2[0] = iArr2[0] + position;
                }
            }
            if (this.f29648j0 && !g10) {
                ByteBuffer byteBuffer = fVar.f18002d;
                byte[] bArr = f5.g.f15954a;
                int position2 = byteBuffer.position();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int i14 = i12 + 1;
                    if (i14 < position2) {
                        int i15 = byteBuffer.get(i12) & 255;
                        if (i13 == 3) {
                            if (i15 == 1 && (byteBuffer.get(i14) & 31) == 7) {
                                ByteBuffer duplicate = byteBuffer.duplicate();
                                duplicate.position(i12 - 3);
                                duplicate.limit(position2);
                                byteBuffer.position(0);
                                byteBuffer.put(duplicate);
                                break;
                            }
                        } else if (i15 == 0) {
                            i13++;
                        }
                        if (i15 != 0) {
                            i13 = 0;
                        }
                        i12 = i14;
                    } else {
                        byteBuffer.clear();
                        break;
                    }
                }
                if (fVar.f18002d.position() == 0) {
                    return true;
                }
                this.f29648j0 = false;
            }
            long j10 = fVar.f18004f;
            h hVar = this.f29663t0;
            if (hVar != null) {
                b5.v vVar = this.A;
                if (hVar.f29623b == 0) {
                    hVar.f29622a = j10;
                }
                if (!hVar.f29624c) {
                    ByteBuffer byteBuffer2 = fVar.f18002d;
                    byteBuffer2.getClass();
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 4; i16 < i18; i18 = 4) {
                        i17 = (i17 << 8) | (byteBuffer2.get(i16) & 255);
                        i16++;
                    }
                    int g11 = z5.a.g(i17);
                    if (g11 == -1) {
                        hVar.f29624c = true;
                        hVar.f29623b = 0L;
                        hVar.f29622a = fVar.f18004f;
                        e5.m.f("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j10 = fVar.f18004f;
                    } else {
                        z10 = g10;
                        j10 = Math.max(0L, ((hVar.f29623b - 529) * 1000000) / vVar.f3666z) + hVar.f29622a;
                        hVar.f29623b += g11;
                        long j11 = this.K0;
                        h hVar2 = this.f29663t0;
                        b5.v vVar2 = this.A;
                        hVar2.getClass();
                        dVar = dVar2;
                        this.K0 = Math.max(j11, Math.max(0L, ((hVar2.f29623b - 529) * 1000000) / vVar2.f3666z) + hVar2.f29622a);
                    }
                }
                z10 = g10;
                long j112 = this.K0;
                h hVar22 = this.f29663t0;
                b5.v vVar22 = this.A;
                hVar22.getClass();
                dVar = dVar2;
                this.K0 = Math.max(j112, Math.max(0L, ((hVar22.f29623b - 529) * 1000000) / vVar22.f3666z) + hVar22.f29622a);
            } else {
                z10 = g10;
                dVar = dVar2;
            }
            if (fVar.g(Integer.MIN_VALUE)) {
                this.f29668w.add(Long.valueOf(j10));
            }
            if (this.O0) {
                ArrayDeque arrayDeque = this.f29672y;
                if (!arrayDeque.isEmpty()) {
                    ((o) arrayDeque.peekLast()).f29642c.a(j10, this.A);
                } else {
                    this.S0.f29642c.a(j10, this.A);
                }
                this.O0 = false;
            }
            this.K0 = Math.max(this.K0, j10);
            fVar.l();
            if (fVar.g(268435456)) {
                R(fVar);
            }
            d0(fVar);
            try {
                if (z10) {
                    this.J.n(this.f29667v0, dVar, j10);
                } else {
                    this.J.g(this.f29667v0, fVar.f18002d.limit(), 0, j10);
                }
                this.f29667v0 = -1;
                fVar.f18002d = null;
                this.H0 = true;
                this.E0 = 0;
                this.R0.f19436c++;
                return true;
            } catch (MediaCodec.CryptoException e12) {
                throw f(x.p(e12.getErrorCode()), this.A, e12, false);
            }
        } catch (DecoderInputBuffer$InsufficientCapacityException e13) {
            V(e13);
            h0(0);
            K();
            return true;
        }
    }

    public final void K() {
        try {
            this.J.flush();
        } finally {
            k0();
        }
    }

    public final boolean L() {
        boolean z10;
        if (this.J == null) {
            return false;
        }
        int i10 = this.G0;
        if (i10 != 3 && !this.f29649k0 && ((!this.f29650l0 || this.J0) && (!this.f29651m0 || !this.I0))) {
            if (i10 == 2) {
                int i11 = x.f15050a;
                if (i11 >= 23) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yk.j.H0(z10);
                if (i11 >= 23) {
                    try {
                        s0();
                    } catch (ExoPlaybackException e10) {
                        e5.m.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                        i0();
                        return true;
                    }
                }
            }
            K();
            return false;
        }
        i0();
        return true;
    }

    public final List M(boolean z10) {
        b5.v vVar = this.A;
        q qVar = this.f29654p;
        ArrayList P = P(qVar, vVar, z10);
        if (P.isEmpty() && z10) {
            P = P(qVar, this.A, false);
            if (!P.isEmpty()) {
                e5.m.f("MediaCodecRenderer", "Drm session requires secure decoder for " + this.A.f3652l + ", but no secure decoder available. Trying to proceed with " + P + ".");
            }
        }
        return P;
    }

    public boolean N() {
        return false;
    }

    public abstract float O(float f10, b5.v[] vVarArr);

    public abstract ArrayList P(q qVar, b5.v vVar, boolean z10);

    public abstract i Q(m mVar, b5.v vVar, MediaCrypto mediaCrypto, float f10);

    public void R(h5.f fVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x03e4, code lost:
    
        if ("stvm8".equals(r5) == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03f4, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0383 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x046f  */
    /* JADX WARN: Type inference failed for: r0v11, types: [o5.h, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(o5.m r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instructions count: 1297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p.S(o5.m, android.media.MediaCrypto):void");
    }

    public final void T() {
        b5.v vVar;
        boolean z10;
        boolean z11;
        if (this.J == null && !this.A0 && (vVar = this.A) != null) {
            if (this.D == null && p0(vVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b5.v vVar2 = this.A;
                G();
                String str = vVar2.f3652l;
                boolean equals = "audio/mp4a-latm".equals(str);
                g gVar = this.f29666v;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    gVar.getClass();
                    gVar.f29621l = 1;
                } else {
                    gVar.getClass();
                    gVar.f29621l = 32;
                }
                this.A0 = true;
                return;
            }
            m0(this.D);
            String str2 = this.A.f3652l;
            n5.i iVar = this.C;
            if (iVar != null) {
                h5.b g10 = iVar.g();
                if (this.E == null) {
                    if (g10 == null) {
                        if (this.C.f() == null) {
                            return;
                        }
                    } else if (g10 instanceof n5.x) {
                        n5.x xVar = (n5.x) g10;
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(xVar.f28324a, xVar.f28325b);
                            this.E = mediaCrypto;
                            if (!xVar.f28326c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.F = z11;
                        } catch (MediaCryptoException e10) {
                            throw f(6006, this.A, e10, false);
                        }
                    }
                }
                if (n5.x.f28323d && (g10 instanceof n5.x)) {
                    int state = this.C.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        DrmSession$DrmSessionException f10 = this.C.f();
                        f10.getClass();
                        throw f(f10.f2087a, this.A, f10, false);
                    }
                }
            }
            try {
                U(this.E, this.F);
            } catch (MediaCodecRenderer$DecoderInitializationException e11) {
                throw f(4001, this.A, e11, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(android.media.MediaCrypto r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p.U(android.media.MediaCrypto, boolean):void");
    }

    public abstract void V(Exception exc);

    public abstract void W(String str, long j10, long j11);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x012f, code lost:
    
        if (H() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        if (r14 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        if (H() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010f, code lost:
    
        if (r5.f3658r == r6.f3658r) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x011d, code lost:
    
        if (H() == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i5.h Y(tr.e r14) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p.Y(tr.e):i5.h");
    }

    public abstract void Z(b5.v vVar, MediaFormat mediaFormat);

    public void a0() {
    }

    public void b0(long j10) {
        this.T0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.f29672y;
            if (!arrayDeque.isEmpty() && j10 >= ((o) arrayDeque.peek()).f29640a) {
                n0((o) arrayDeque.poll());
                c0();
            } else {
                return;
            }
        }
    }

    public abstract void c0();

    public abstract void d0(h5.f fVar);

    public void e0(b5.v vVar) {
    }

    public final void f0() {
        int i10 = this.G0;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.N0 = true;
                    j0();
                    return;
                } else {
                    i0();
                    T();
                    return;
                }
            }
            K();
            s0();
            return;
        }
        K();
    }

    public abstract boolean g0(long j10, long j11, k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b5.v vVar);

    public final boolean h0(int i10) {
        tr.e eVar = this.f19410c;
        eVar.m();
        h5.f fVar = this.f29660s;
        fVar.i();
        int w10 = w(eVar, fVar, i10 | 4);
        if (w10 == -5) {
            Y(eVar);
            return true;
        }
        if (w10 == -4 && fVar.g(4)) {
            this.M0 = true;
            f0();
            return false;
        }
        return false;
    }

    public final void i0() {
        try {
            k kVar = this.J;
            if (kVar != null) {
                kVar.release();
                this.R0.f19435b++;
                X(this.f29646h0.f29630a);
            }
            this.J = null;
            try {
                MediaCrypto mediaCrypto = this.E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.J = null;
            try {
                MediaCrypto mediaCrypto2 = this.E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void j0() {
    }

    public void k0() {
        this.f29667v0 = -1;
        this.f29662t.f18002d = null;
        this.f29669w0 = -1;
        this.f29671x0 = null;
        this.f29665u0 = -9223372036854775807L;
        this.I0 = false;
        this.H0 = false;
        this.f29657q0 = false;
        this.f29659r0 = false;
        this.f29673y0 = false;
        this.f29675z0 = false;
        this.f29668w.clear();
        this.K0 = -9223372036854775807L;
        this.L0 = -9223372036854775807L;
        this.T0 = -9223372036854775807L;
        h hVar = this.f29663t0;
        if (hVar != null) {
            hVar.f29622a = 0L;
            hVar.f29623b = 0L;
            hVar.f29624c = false;
        }
        this.F0 = 0;
        this.G0 = 0;
        this.E0 = this.D0 ? 1 : 0;
    }

    public final void l0() {
        k0();
        this.Q0 = null;
        this.f29663t0 = null;
        this.f29644f0 = null;
        this.f29646h0 = null;
        this.X = null;
        this.Y = null;
        this.Z = false;
        this.J0 = false;
        this.f29643e0 = -1.0f;
        this.f29647i0 = 0;
        this.f29648j0 = false;
        this.f29649k0 = false;
        this.f29650l0 = false;
        this.f29651m0 = false;
        this.n0 = false;
        this.f29653o0 = false;
        this.f29655p0 = false;
        this.f29661s0 = false;
        this.D0 = false;
        this.E0 = 0;
        this.F = false;
    }

    public final void m0(n5.i iVar) {
        n5.i iVar2 = this.C;
        if (iVar2 != iVar) {
            if (iVar != null) {
                iVar.a(null);
            }
            if (iVar2 != null) {
                iVar2.c(null);
            }
        }
        this.C = iVar;
    }

    @Override // i5.f
    public boolean n() {
        boolean d10;
        if (this.A != null) {
            if (l()) {
                d10 = this.f19419l;
            } else {
                v0 v0Var = this.f19415h;
                v0Var.getClass();
                d10 = v0Var.d();
            }
            if (d10 || this.f29669w0 >= 0 || (this.f29665u0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f29665u0)) {
                return true;
            }
        }
        return false;
    }

    public final void n0(o oVar) {
        this.S0 = oVar;
        if (oVar.f29641b != -9223372036854775807L) {
            this.U0 = true;
            a0();
        }
    }

    @Override // i5.f
    public void o() {
        this.A = null;
        n0(o.f29639d);
        this.f29672y.clear();
        L();
    }

    public boolean o0(m mVar) {
        return true;
    }

    public boolean p0(b5.v vVar) {
        return false;
    }

    @Override // i5.f
    public void q(long j10, boolean z10) {
        int i10;
        this.M0 = false;
        this.N0 = false;
        this.P0 = false;
        if (this.A0) {
            this.f29666v.i();
            this.f29664u.i();
            this.B0 = false;
            i0 i0Var = this.f29674z;
            i0Var.getClass();
            i0Var.f22123a = c5.c.f7956a;
            i0Var.f22125c = 0;
            i0Var.f22124b = 2;
        } else if (L()) {
            T();
        }
        e.j jVar = this.S0.f29642c;
        synchronized (jVar) {
            i10 = jVar.f14633b;
        }
        if (i10 > 0) {
            this.O0 = true;
        }
        this.S0.f29642c.b();
        this.f29672y.clear();
    }

    public abstract int q0(q qVar, b5.v vVar);

    public final boolean r0(b5.v vVar) {
        if (x.f15050a >= 23 && this.J != null && this.G0 != 3 && this.f19414g != 0) {
            float f10 = this.I;
            b5.v[] vVarArr = this.f19416i;
            vVarArr.getClass();
            float O = O(f10, vVarArr);
            float f11 = this.f29643e0;
            if (f11 == O) {
                return true;
            }
            if (O == -1.0f) {
                if (this.H0) {
                    this.F0 = 1;
                    this.G0 = 3;
                    return false;
                }
                i0();
                T();
                return false;
            }
            if (f11 == -1.0f && O <= this.f29658r) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", O);
            this.J.c(bundle);
            this.f29643e0 = O;
        }
        return true;
    }

    public final void s0() {
        h5.b g10 = this.D.g();
        if (g10 instanceof n5.x) {
            try {
                this.E.setMediaDrmSession(((n5.x) g10).f28325b);
            } catch (MediaCryptoException e10) {
                throw f(6006, this.A, e10, false);
            }
        }
        m0(this.D);
        this.F0 = 0;
        this.G0 = 0;
    }

    public final void t0(long j10) {
        Object i10;
        Object obj;
        e.j jVar = this.S0.f29642c;
        synchronized (jVar) {
            i10 = jVar.i(j10, true);
        }
        b5.v vVar = (b5.v) i10;
        if (vVar == null && this.U0 && this.Y != null) {
            e.j jVar2 = this.S0.f29642c;
            synchronized (jVar2) {
                if (jVar2.f14633b == 0) {
                    obj = null;
                } else {
                    obj = jVar2.j();
                }
            }
            vVar = (b5.v) obj;
        }
        if (vVar != null) {
            this.B = vVar;
        } else if (!this.Z || this.B == null) {
            return;
        }
        Z(this.B, this.Y);
        this.Z = false;
        this.U0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r2 >= r7) goto L13;
     */
    @Override // i5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(b5.v[] r6, long r7, long r9) {
        /*
            r5 = this;
            o5.o r6 = r5.S0
            long r6 = r6.f29641b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L16
            o5.o r6 = new o5.o
            r6.<init>(r0, r9)
            r5.n0(r6)
            goto L4c
        L16:
            java.util.ArrayDeque r6 = r5.f29672y
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L42
            long r7 = r5.K0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L2e
            long r2 = r5.T0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L42
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L42
        L2e:
            o5.o r6 = new o5.o
            r6.<init>(r0, r9)
            r5.n0(r6)
            o5.o r6 = r5.S0
            long r6 = r6.f29641b
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L4c
            r5.c0()
            goto L4c
        L42:
            o5.o r7 = new o5.o
            long r0 = r5.K0
            r7.<init>(r0, r9)
            r6.add(r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.p.v(b5.v[], long, long):void");
    }

    @Override // i5.f
    public void x(long j10, long j11) {
        boolean z10 = false;
        if (this.P0) {
            this.P0 = false;
            f0();
        }
        ExoPlaybackException exoPlaybackException = this.Q0;
        if (exoPlaybackException == null) {
            try {
                if (this.N0) {
                    j0();
                    return;
                }
                if (this.A == null && !h0(2)) {
                    return;
                }
                T();
                if (this.A0) {
                    e5.a.a("bypassRender");
                    do {
                    } while (D(j10, j11));
                    e5.a.i();
                } else if (this.J != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    e5.a.a("drainAndFeed");
                    while (I(j10, j11)) {
                        long j12 = this.G;
                        if (j12 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j12) {
                            break;
                        }
                    }
                    while (J()) {
                        long j13 = this.G;
                        if (j13 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= j13) {
                            break;
                        }
                    }
                    e5.a.i();
                } else {
                    i5.g gVar = this.R0;
                    int i10 = gVar.f19437d;
                    v0 v0Var = this.f19415h;
                    v0Var.getClass();
                    gVar.f19437d = i10 + v0Var.e(j10 - this.f19417j);
                    h0(1);
                }
                synchronized (this.R0) {
                }
                return;
            } catch (IllegalStateException e10) {
                int i11 = x.f15050a;
                if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e10;
                    }
                }
                V(e10);
                if (i11 >= 21 && (e10 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e10).isRecoverable()) {
                    z10 = true;
                }
                if (z10) {
                    i0();
                }
                throw f(4003, this.A, F(e10, this.f29646h0), z10);
            }
        }
        this.Q0 = null;
        throw exoPlaybackException;
    }
}
