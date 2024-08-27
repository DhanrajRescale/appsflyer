package x5;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import b5.p1;
import b5.r0;
import com.google.android.gms.common.Scopes;
import d2.b0;
import e5.x;
import h.m0;
import i5.d0;
import i5.h1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import lp.h0;
import lp.j1;
import lp.l0;
import lp.o0;
import r5.v0;

/* loaded from: classes.dex */
public final class g extends o5.p {
    public static final int[] E1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean F1;
    public static boolean G1;
    public boolean A1;
    public int B1;
    public d C1;
    public m D1;
    public final Context W0;
    public final s X0;
    public final e Y0;
    public final f Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final long f39986a1;

    /* renamed from: b1, reason: collision with root package name */
    public final int f39987b1;

    /* renamed from: c1, reason: collision with root package name */
    public final boolean f39988c1;

    /* renamed from: d1, reason: collision with root package name */
    public ck.i f39989d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f39990e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f39991f1;

    /* renamed from: g1, reason: collision with root package name */
    public Surface f39992g1;

    /* renamed from: h1, reason: collision with root package name */
    public i f39993h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f39994i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f39995j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f39996k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f39997l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f39998m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f39999n1;

    /* renamed from: o1, reason: collision with root package name */
    public long f40000o1;

    /* renamed from: p1, reason: collision with root package name */
    public long f40001p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f40002q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f40003r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f40004s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f40005t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f40006u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f40007v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f40008w1;

    /* renamed from: x1, reason: collision with root package name */
    public long f40009x1;

    /* renamed from: y1, reason: collision with root package name */
    public p1 f40010y1;

    /* renamed from: z1, reason: collision with root package name */
    public p1 f40011z1;

    public g(Context context, yq.b bVar, o5.q qVar, Handler handler, d0 d0Var) {
        super(2, bVar, qVar, 30.0f);
        this.f39986a1 = 5000L;
        this.f39987b1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.W0 = applicationContext;
        s sVar = new s(applicationContext);
        this.X0 = sVar;
        this.Y0 = new e(handler, d0Var);
        this.Z0 = new f(sVar, this);
        this.f39988c1 = "NVIDIA".equals(x.f15052c);
        this.f40000o1 = -9223372036854775807L;
        this.f39995j1 = 1;
        this.f40010y1 = p1.f3567e;
        this.B1 = 0;
        this.f40011z1 = null;
    }

    public static boolean v0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            try {
                if (!F1) {
                    G1 = w0();
                    F1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return G1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089b. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w0() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.w0():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r4.equals("video/hevc") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int x0(b5.v r10, o5.m r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.g.x0(b5.v, o5.m):int");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [lp.h0, lp.k0] */
    public static List y0(Context context, o5.q qVar, b5.v vVar, boolean z10, boolean z11) {
        List p10;
        List p11;
        String str = vVar.f3652l;
        if (str == null) {
            l0 l0Var = o0.f25025b;
            return j1.f24998e;
        }
        if (x.f15050a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            String b10 = o5.u.b(vVar);
            if (b10 == null) {
                l0 l0Var2 = o0.f25025b;
                p11 = j1.f24998e;
            } else {
                p11 = qVar.p(b10, z10, z11);
            }
            if (!p11.isEmpty()) {
                return p11;
            }
        }
        Pattern pattern = o5.u.f29679a;
        List p12 = qVar.p(vVar.f3652l, z10, z11);
        String b11 = o5.u.b(vVar);
        if (b11 == null) {
            l0 l0Var3 = o0.f25025b;
            p10 = j1.f24998e;
        } else {
            p10 = qVar.p(b11, z10, z11);
        }
        l0 l0Var4 = o0.f25025b;
        ?? h0Var = new h0();
        h0Var.c0(p12);
        h0Var.c0(p10);
        return h0Var.e0();
    }

    public static int z0(b5.v vVar, o5.m mVar) {
        if (vVar.f3653m != -1) {
            List list = vVar.f3654n;
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += ((byte[]) list.get(i11)).length;
            }
            return vVar.f3653m + i10;
        }
        return x0(vVar, mVar);
    }

    @Override // o5.p, i5.f
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        s sVar = this.X0;
        sVar.f40049i = f10;
        sVar.f40053m = 0L;
        sVar.f40056p = -1L;
        sVar.f40054n = -1L;
        sVar.e(false);
    }

    public final void A0() {
        if (this.f40002q1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f40001p1;
            int i10 = this.f40002q1;
            e eVar = this.Y0;
            Handler handler = (Handler) eVar.f39980a;
            if (handler != null) {
                handler.post(new t(eVar, i10, j10));
            }
            this.f40002q1 = 0;
            this.f40001p1 = elapsedRealtime;
        }
    }

    public final void B0() {
        this.f39998m1 = true;
        if (!this.f39996k1) {
            this.f39996k1 = true;
            Surface surface = this.f39992g1;
            e eVar = this.Y0;
            Handler handler = (Handler) eVar.f39980a;
            if (handler != null) {
                handler.post(new u(eVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f39994i1 = true;
        }
    }

    public final void C0(p1 p1Var) {
        if (!p1Var.equals(p1.f3567e) && !p1Var.equals(this.f40011z1)) {
            this.f40011z1 = p1Var;
            this.Y0.a(p1Var);
        }
    }

    public final void D0(o5.k kVar, int i10) {
        e5.a.a("releaseOutputBuffer");
        kVar.h(i10, true);
        e5.a.i();
        this.R0.f19438e++;
        this.f40003r1 = 0;
        this.Z0.getClass();
        this.f40006u1 = SystemClock.elapsedRealtime() * 1000;
        C0(this.f40010y1);
        B0();
    }

    @Override // o5.p
    public final i5.h E(o5.m mVar, b5.v vVar, b5.v vVar2) {
        int i10;
        i5.h b10 = mVar.b(vVar, vVar2);
        ck.i iVar = this.f39989d1;
        int i11 = iVar.f8201a;
        int i12 = vVar2.f3657q;
        int i13 = b10.f19485e;
        if (i12 > i11 || vVar2.f3658r > iVar.f8202b) {
            i13 |= 256;
        }
        if (z0(vVar2, mVar) > this.f39989d1.f8203c) {
            i13 |= 64;
        }
        int i14 = i13;
        String str = mVar.f29630a;
        if (i14 != 0) {
            i10 = 0;
        } else {
            i10 = b10.f19484d;
        }
        return new i5.h(str, vVar, vVar2, i10, i14);
    }

    public final void E0(o5.k kVar, int i10, long j10) {
        e5.a.a("releaseOutputBuffer");
        kVar.d(i10, j10);
        e5.a.i();
        this.R0.f19438e++;
        this.f40003r1 = 0;
        this.Z0.getClass();
        this.f40006u1 = SystemClock.elapsedRealtime() * 1000;
        C0(this.f40010y1);
        B0();
    }

    @Override // o5.p
    public final MediaCodecDecoderException F(IllegalStateException illegalStateException, o5.m mVar) {
        Surface surface = this.f39992g1;
        MediaCodecDecoderException mediaCodecDecoderException = new MediaCodecDecoderException(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecDecoderException;
    }

    public final boolean F0(long j10, long j11) {
        boolean z10;
        boolean z11;
        if (this.f19414g == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f39998m1 ? this.f39996k1 : !z10 && !this.f39997l1) {
            z11 = false;
        } else {
            z11 = true;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f40006u1;
        if (this.f40000o1 != -9223372036854775807L || j10 < this.S0.f29641b) {
            return false;
        }
        if (!z11 && (!z10 || j11 >= -30000 || elapsedRealtime <= 100000)) {
            return false;
        }
        return true;
    }

    public final boolean G0(o5.m mVar) {
        if (x.f15050a >= 23 && !this.A1 && !v0(mVar.f29630a) && (!mVar.f29635f || i.b(this.W0))) {
            return true;
        }
        return false;
    }

    public final void H0(o5.k kVar, int i10) {
        e5.a.a("skipVideoBuffer");
        kVar.h(i10, false);
        e5.a.i();
        this.R0.f19439f++;
    }

    public final void I0(int i10, int i11) {
        i5.g gVar = this.R0;
        gVar.f19441h += i10;
        int i12 = i10 + i11;
        gVar.f19440g += i12;
        this.f40002q1 += i12;
        int i13 = this.f40003r1 + i12;
        this.f40003r1 = i13;
        gVar.f19442i = Math.max(i13, gVar.f19442i);
        int i14 = this.f39987b1;
        if (i14 > 0 && this.f40002q1 >= i14) {
            A0();
        }
    }

    public final void J0(long j10) {
        i5.g gVar = this.R0;
        gVar.f19444k += j10;
        gVar.f19445l++;
        this.f40007v1 += j10;
        this.f40008w1++;
    }

    @Override // o5.p
    public final boolean N() {
        if (this.A1 && x.f15050a < 23) {
            return true;
        }
        return false;
    }

    @Override // o5.p
    public final float O(float f10, b5.v[] vVarArr) {
        float f11 = -1.0f;
        for (b5.v vVar : vVarArr) {
            float f12 = vVar.f3659s;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // o5.p
    public final ArrayList P(o5.q qVar, b5.v vVar, boolean z10) {
        List y02 = y0(this.W0, qVar, vVar, z10, this.A1);
        Pattern pattern = o5.u.f29679a;
        ArrayList arrayList = new ArrayList(y02);
        Collections.sort(arrayList, new b0(new b3.t(vVar, 12), 1));
        return arrayList;
    }

    @Override // o5.p
    public final o5.i Q(o5.m mVar, b5.v vVar, MediaCrypto mediaCrypto, float f10) {
        int i10;
        b5.n nVar;
        int i11;
        ck.i iVar;
        boolean z10;
        int i12;
        int i13;
        Point point;
        float f11;
        int i14;
        int i15;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i16;
        char c10;
        boolean z11;
        int i17;
        boolean z12;
        Pair d10;
        int x02;
        i iVar2 = this.f39993h1;
        if (iVar2 != null && iVar2.f40019a != mVar.f29635f) {
            if (this.f39992g1 == iVar2) {
                this.f39992g1 = null;
            }
            iVar2.release();
            this.f39993h1 = null;
        }
        String str = mVar.f29632c;
        b5.v[] vVarArr = this.f19416i;
        vVarArr.getClass();
        int i18 = vVar.f3657q;
        int z02 = z0(vVar, mVar);
        int length = vVarArr.length;
        float f12 = vVar.f3659s;
        int i19 = vVar.f3657q;
        b5.n nVar2 = vVar.f3664x;
        int i20 = vVar.f3658r;
        if (length == 1) {
            if (z02 != -1 && (x02 = x0(vVar, mVar)) != -1) {
                z02 = Math.min((int) (z02 * 1.5f), x02);
            }
            iVar = new ck.i(i18, i20, z02);
            i10 = i19;
            nVar = nVar2;
            i11 = i20;
        } else {
            int length2 = vVarArr.length;
            int i21 = i20;
            int i22 = 0;
            boolean z13 = false;
            while (i22 < length2) {
                b5.v vVar2 = vVarArr[i22];
                b5.v[] vVarArr2 = vVarArr;
                if (nVar2 != null && vVar2.f3664x == null) {
                    b5.u a10 = vVar2.a();
                    a10.f3612w = nVar2;
                    vVar2 = new b5.v(a10);
                }
                if (mVar.b(vVar, vVar2).f19484d != 0) {
                    int i23 = vVar2.f3658r;
                    i16 = length2;
                    int i24 = vVar2.f3657q;
                    c10 = 65535;
                    if (i24 != -1 && i23 != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    z13 |= z11;
                    i18 = Math.max(i18, i24);
                    i21 = Math.max(i21, i23);
                    z02 = Math.max(z02, z0(vVar2, mVar));
                } else {
                    i16 = length2;
                    c10 = 65535;
                }
                i22++;
                vVarArr = vVarArr2;
                length2 = i16;
            }
            if (z13) {
                e5.m.f("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i18 + "x" + i21);
                if (i20 > i19) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i12 = i20;
                } else {
                    i12 = i19;
                }
                if (z10) {
                    i13 = i19;
                    nVar = nVar2;
                } else {
                    nVar = nVar2;
                    i13 = i20;
                }
                float f13 = i13 / i12;
                int[] iArr = E1;
                i10 = i19;
                i11 = i20;
                int i25 = 0;
                while (i25 < 9) {
                    int i26 = iArr[i25];
                    int[] iArr2 = iArr;
                    int i27 = (int) (i26 * f13);
                    if (i26 <= i12 || i27 <= i13) {
                        break;
                    }
                    int i28 = i12;
                    int i29 = i13;
                    if (x.f15050a >= 21) {
                        if (z10) {
                            i15 = i27;
                        } else {
                            i15 = i26;
                        }
                        if (!z10) {
                            i26 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f29633d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f11 = f13;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f11 = f13;
                            point2 = new Point(x.g(i15, widthAlignment) * widthAlignment, x.g(i26, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (mVar.f(point2.x, point2.y, f12)) {
                            point = point3;
                            break;
                        }
                        i25++;
                        iArr = iArr2;
                        i12 = i28;
                        i13 = i29;
                        f13 = f11;
                    } else {
                        f11 = f13;
                        try {
                            int g10 = x.g(i26, 16) * 16;
                            int g11 = x.g(i27, 16) * 16;
                            if (g10 * g11 <= o5.u.i()) {
                                if (z10) {
                                    i14 = g11;
                                } else {
                                    i14 = g10;
                                }
                                if (!z10) {
                                    g10 = g11;
                                }
                                point = new Point(i14, g10);
                            } else {
                                i25++;
                                iArr = iArr2;
                                i12 = i28;
                                i13 = i29;
                                f13 = f11;
                            }
                        } catch (MediaCodecUtil$DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i18 = Math.max(i18, point.x);
                    i21 = Math.max(i21, point.y);
                    b5.u a11 = vVar.a();
                    a11.f3605p = i18;
                    a11.f3606q = i21;
                    z02 = Math.max(z02, x0(new b5.v(a11), mVar));
                    e5.m.f("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i18 + "x" + i21);
                }
            } else {
                i10 = i19;
                nVar = nVar2;
                i11 = i20;
            }
            iVar = new ck.i(i18, i21, z02);
        }
        this.f39989d1 = iVar;
        if (this.A1) {
            i17 = this.B1;
        } else {
            i17 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i11);
        vl.b.h0(mediaFormat, vVar.f3654n);
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        vl.b.H(mediaFormat, "rotation-degrees", vVar.f3660t);
        if (nVar != null) {
            b5.n nVar3 = nVar;
            vl.b.H(mediaFormat, "color-transfer", nVar3.f3497c);
            vl.b.H(mediaFormat, "color-standard", nVar3.f3495a);
            vl.b.H(mediaFormat, "color-range", nVar3.f3496b);
            byte[] bArr = nVar3.f3498d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vVar.f3652l) && (d10 = o5.u.d(vVar)) != null) {
            vl.b.H(mediaFormat, Scopes.PROFILE, ((Integer) d10.first).intValue());
        }
        mediaFormat.setInteger("max-width", iVar.f8201a);
        mediaFormat.setInteger("max-height", iVar.f8202b);
        vl.b.H(mediaFormat, "max-input-size", iVar.f8203c);
        if (x.f15050a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f39988c1) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (this.f39992g1 == null) {
            if (G0(mVar)) {
                if (this.f39993h1 == null) {
                    this.f39993h1 = i.c(this.W0, mVar.f29635f);
                }
                this.f39992g1 = this.f39993h1;
            } else {
                throw new IllegalStateException();
            }
        }
        this.Z0.getClass();
        return new o5.i(mVar, mediaFormat, vVar, this.f39992g1, mediaCrypto);
    }

    @Override // o5.p
    public final void R(h5.f fVar) {
        if (!this.f39991f1) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f18005g;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b10 = byteBuffer.get();
            short s7 = byteBuffer.getShort();
            short s10 = byteBuffer.getShort();
            byte b11 = byteBuffer.get();
            byte b12 = byteBuffer.get();
            byteBuffer.position(0);
            if (b10 == -75 && s7 == 60 && s10 == 1 && b11 == 4) {
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    o5.k kVar = this.J;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    kVar.c(bundle);
                }
            }
        }
    }

    @Override // o5.p
    public final void V(Exception exc) {
        e5.m.d("MediaCodecVideoRenderer", "Video codec error", exc);
        e eVar = this.Y0;
        Handler handler = (Handler) eVar.f39980a;
        if (handler != null) {
            handler.post(new m0(15, eVar, exc));
        }
    }

    @Override // o5.p
    public final void W(String str, long j10, long j11) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        e eVar = this.Y0;
        Handler handler = (Handler) eVar.f39980a;
        if (handler != null) {
            handler.post(new k5.k(eVar, str, j10, j11, 1));
        }
        this.f39990e1 = v0(str);
        o5.m mVar = this.f29646h0;
        mVar.getClass();
        boolean z10 = false;
        if (x.f15050a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f29631b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f29633d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i10].profile == 16384) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f39991f1 = z10;
        int i11 = x.f15050a;
        if (i11 >= 23 && this.A1) {
            o5.k kVar = this.J;
            kVar.getClass();
            this.C1 = new d(this, kVar);
        }
        Context context = this.Z0.f39982a.W0;
        if (i11 >= 29) {
            int i12 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    @Override // o5.p
    public final void X(String str) {
        e eVar = this.Y0;
        Handler handler = (Handler) eVar.f39980a;
        if (handler != null) {
            handler.post(new m0(17, eVar, str));
        }
    }

    @Override // o5.p
    public final i5.h Y(tr.e eVar) {
        i5.h Y = super.Y(eVar);
        b5.v vVar = (b5.v) eVar.f36362c;
        e eVar2 = this.Y0;
        Handler handler = (Handler) eVar2.f39980a;
        if (handler != null) {
            handler.post(new androidx.fragment.app.e(9, eVar2, vVar, Y));
        }
        return Y;
    }

    @Override // o5.p
    public final void Z(b5.v vVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        o5.k kVar = this.J;
        if (kVar != null) {
            kVar.i(this.f39995j1);
        }
        boolean z11 = true;
        if (this.A1) {
            i11 = vVar.f3657q;
            i10 = vVar.f3658r;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f10 = vVar.f3661u;
        if (x.f15050a < 21) {
            z11 = false;
        }
        f fVar = this.Z0;
        int i13 = vVar.f3660t;
        if (z11) {
            if (i13 != 90 && i13 != 270) {
                i13 = 0;
            } else {
                f10 = 1.0f / f10;
                i13 = 0;
                int i14 = i10;
                i10 = i11;
                i11 = i14;
            }
        } else {
            fVar.getClass();
        }
        this.f40010y1 = new p1(f10, i11, i10, i13);
        float f11 = vVar.f3659s;
        s sVar = this.X0;
        sVar.f40046f = f11;
        b bVar = sVar.f40041a;
        bVar.f39973a.c();
        bVar.f39974b.c();
        bVar.f39975c = false;
        bVar.f39976d = -9223372036854775807L;
        bVar.f39977e = 0;
        sVar.d();
        fVar.getClass();
    }

    @Override // o5.p
    public final void b0(long j10) {
        super.b0(j10);
        if (!this.A1) {
            this.f40004s1--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.view.Surface] */
    @Override // i5.f, i5.c1
    public final void c(int i10, Object obj) {
        i iVar;
        i iVar2;
        long j10;
        Surface surface;
        s sVar = this.X0;
        f fVar = this.Z0;
        if (i10 != 1) {
            if (i10 != 7) {
                if (i10 != 10) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 13) {
                                if (i10 == 14) {
                                    obj.getClass();
                                    e5.q qVar = (e5.q) obj;
                                    if (qVar.f15040a != 0 && qVar.f15041b != 0 && (surface = this.f39992g1) != null) {
                                        Pair pair = fVar.f39984c;
                                        if (pair == null || !((Surface) pair.first).equals(surface) || !((e5.q) fVar.f39984c.second).equals(qVar)) {
                                            fVar.f39984c = Pair.create(surface, qVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            CopyOnWriteArrayList copyOnWriteArrayList = fVar.f39983b;
                            if (copyOnWriteArrayList == null) {
                                fVar.f39983b = new CopyOnWriteArrayList(list);
                                return;
                            } else {
                                copyOnWriteArrayList.clear();
                                fVar.f39983b.addAll(list);
                                return;
                            }
                        }
                        int intValue = ((Integer) obj).intValue();
                        if (sVar.f40050j != intValue) {
                            sVar.f40050j = intValue;
                            sVar.e(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f39995j1 = intValue2;
                    o5.k kVar = this.J;
                    if (kVar != null) {
                        kVar.i(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.B1 != intValue3) {
                    this.B1 = intValue3;
                    if (this.A1) {
                        i0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.D1 = (m) obj;
            return;
        }
        if (obj instanceof Surface) {
            iVar = (Surface) obj;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            i iVar3 = this.f39993h1;
            if (iVar3 != null) {
                iVar = iVar3;
            } else {
                o5.m mVar = this.f29646h0;
                if (mVar != null && G0(mVar)) {
                    iVar = i.c(this.W0, mVar.f29635f);
                    this.f39993h1 = iVar;
                }
            }
        }
        Surface surface2 = this.f39992g1;
        e eVar = this.Y0;
        if (surface2 != iVar) {
            this.f39992g1 = iVar;
            sVar.getClass();
            if (iVar instanceof i) {
                iVar2 = null;
            } else {
                iVar2 = iVar;
            }
            if (sVar.f40045e != iVar2) {
                sVar.b();
                sVar.f40045e = iVar2;
                sVar.e(true);
            }
            this.f39994i1 = false;
            int i11 = this.f19414g;
            o5.k kVar2 = this.J;
            if (kVar2 != null) {
                fVar.getClass();
                if (x.f15050a >= 23 && iVar != null && !this.f39990e1) {
                    kVar2.k(iVar);
                } else {
                    i0();
                    T();
                }
            }
            if (iVar != null && iVar != this.f39993h1) {
                p1 p1Var = this.f40011z1;
                if (p1Var != null) {
                    eVar.a(p1Var);
                }
                u0();
                if (i11 == 2) {
                    long j11 = this.f39986a1;
                    if (j11 > 0) {
                        j10 = SystemClock.elapsedRealtime() + j11;
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    this.f40000o1 = j10;
                }
                fVar.getClass();
                return;
            }
            this.f40011z1 = null;
            u0();
            fVar.getClass();
            return;
        }
        if (iVar != null && iVar != this.f39993h1) {
            p1 p1Var2 = this.f40011z1;
            if (p1Var2 != null) {
                eVar.a(p1Var2);
            }
            if (this.f39994i1) {
                Surface surface3 = this.f39992g1;
                Handler handler = (Handler) eVar.f39980a;
                if (handler != null) {
                    handler.post(new u(eVar, surface3, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // o5.p
    public final void c0() {
        u0();
    }

    @Override // o5.p
    public final void d0(h5.f fVar) {
        boolean z10 = this.A1;
        if (!z10) {
            this.f40004s1++;
        }
        if (x.f15050a < 23 && z10) {
            long j10 = fVar.f18004f;
            t0(j10);
            C0(this.f40010y1);
            this.R0.f19438e++;
            B0();
            b0(j10);
        }
    }

    @Override // o5.p
    public final void e0(b5.v vVar) {
        int i10;
        f fVar = this.Z0;
        fVar.getClass();
        long j10 = this.S0.f29641b;
        if (fVar.f39985d) {
            if (fVar.f39983b == null) {
                fVar.f39985d = false;
                return;
            }
            x.l(null);
            fVar.getClass();
            b5.n nVar = vVar.f3664x;
            g gVar = fVar.f39982a;
            gVar.getClass();
            try {
                if (nVar != null) {
                    int i11 = nVar.f3497c;
                    if (i11 == 7 || i11 == 6) {
                        if (i11 == 7) {
                            Pair.create(nVar, new b5.n(nVar.f3495a, nVar.f3498d, nVar.f3496b, 6));
                        } else {
                            Pair.create(nVar, nVar);
                        }
                        if (x.f15050a >= 21 && (i10 = vVar.f3660t) != 0) {
                            vl.b.b0();
                            Object newInstance = vl.b.f38171a.newInstance(new Object[0]);
                            vl.b.f38172b.invoke(newInstance, Float.valueOf(i10));
                            Object invoke = vl.b.f38173c.invoke(newInstance, new Object[0]);
                            invoke.getClass();
                            nn.d.t(invoke);
                            throw null;
                        }
                        vl.b.b0();
                        Object invoke2 = vl.b.f38175e.invoke(vl.b.f38174d.newInstance(new Object[0]), new Object[0]);
                        invoke2.getClass();
                        nn.d.t(invoke2);
                        throw null;
                    }
                } else {
                    b5.n nVar2 = b5.n.f3489f;
                }
                if (x.f15050a >= 21) {
                }
                vl.b.b0();
                Object invoke22 = vl.b.f38175e.invoke(vl.b.f38174d.newInstance(new Object[0]), new Object[0]);
                invoke22.getClass();
                nn.d.t(invoke22);
                throw null;
            } catch (Exception e10) {
                throw gVar.f(7000, vVar, e10, false);
            }
            b5.n nVar3 = b5.n.f3489f;
            Pair.create(nVar3, nVar3);
        }
    }

    @Override // o5.p
    public final boolean g0(long j10, long j11, o5.k kVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, b5.v vVar) {
        boolean z12;
        boolean z13;
        long j13;
        kVar.getClass();
        if (this.f39999n1 == -9223372036854775807L) {
            this.f39999n1 = j10;
        }
        long j14 = this.f40005t1;
        f fVar = this.Z0;
        s sVar = this.X0;
        if (j12 != j14) {
            fVar.getClass();
            sVar.c(j12);
            this.f40005t1 = j12;
        }
        long j15 = j12 - this.S0.f29641b;
        if (z10 && !z11) {
            H0(kVar, i10);
            return true;
        }
        if (this.f19414g == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j16 = (long) ((j12 - j10) / this.H);
        if (z12) {
            j16 -= elapsedRealtime - j11;
        }
        if (this.f39992g1 == this.f39993h1) {
            if (j16 >= -30000) {
                return false;
            }
            H0(kVar, i10);
            J0(j16);
            return true;
        }
        if (F0(j10, j16)) {
            fVar.getClass();
            fVar.getClass();
            long nanoTime = System.nanoTime();
            m mVar = this.D1;
            if (mVar != null) {
                mVar.d(j15, nanoTime, vVar, this.Y);
            }
            if (x.f15050a >= 21) {
                E0(kVar, i10, nanoTime);
            } else {
                D0(kVar, i10);
            }
            J0(j16);
            return true;
        }
        if (!z12 || j10 == this.f39999n1) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long a10 = sVar.a((j16 * 1000) + nanoTime2);
        fVar.getClass();
        long j17 = (a10 - nanoTime2) / 1000;
        if (this.f40000o1 != -9223372036854775807L) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (j17 < -500000 && !z11) {
            v0 v0Var = this.f19415h;
            v0Var.getClass();
            j13 = j15;
            int e10 = v0Var.e(j10 - this.f19417j);
            if (e10 != 0) {
                if (z13) {
                    i5.g gVar = this.R0;
                    gVar.f19437d += e10;
                    gVar.f19439f += this.f40004s1;
                } else {
                    this.R0.f19443j++;
                    I0(e10, this.f40004s1);
                }
                if (L()) {
                    T();
                    return false;
                }
                return false;
            }
        } else {
            j13 = j15;
        }
        if (j17 < -30000 && !z11) {
            if (z13) {
                H0(kVar, i10);
            } else {
                e5.a.a("dropVideoBuffer");
                kVar.h(i10, false);
                e5.a.i();
                I0(0, 1);
            }
            J0(j17);
            return true;
        }
        if (x.f15050a >= 21) {
            if (j17 < 50000) {
                if (a10 == this.f40009x1) {
                    H0(kVar, i10);
                } else {
                    m mVar2 = this.D1;
                    if (mVar2 != null) {
                        mVar2.d(j13, a10, vVar, this.Y);
                    }
                    E0(kVar, i10, a10);
                }
                J0(j17);
                this.f40009x1 = a10;
                return true;
            }
        } else if (j17 < 30000) {
            if (j17 > 11000) {
                try {
                    Thread.sleep((j17 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            m mVar3 = this.D1;
            if (mVar3 != null) {
                mVar3.d(j13, a10, vVar, this.Y);
            }
            D0(kVar, i10);
            J0(j17);
            return true;
        }
        return false;
    }

    @Override // i5.f
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // o5.p
    public final void k0() {
        super.k0();
        this.f40004s1 = 0;
    }

    @Override // i5.f
    public final boolean m() {
        boolean z10 = this.N0;
        this.Z0.getClass();
        return z10;
    }

    @Override // o5.p, i5.f
    public final boolean n() {
        i iVar;
        if (super.n()) {
            this.Z0.getClass();
            if (this.f39996k1 || (((iVar = this.f39993h1) != null && this.f39992g1 == iVar) || this.J == null || this.A1)) {
                this.f40000o1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f40000o1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f40000o1) {
            return true;
        }
        this.f40000o1 = -9223372036854775807L;
        return false;
    }

    @Override // o5.p, i5.f
    public final void o() {
        e eVar = this.Y0;
        this.f40011z1 = null;
        u0();
        this.f39994i1 = false;
        this.C1 = null;
        int i10 = 1;
        try {
            super.o();
            i5.g gVar = this.R0;
            eVar.getClass();
            synchronized (gVar) {
            }
            Handler handler = (Handler) eVar.f39980a;
            if (handler != null) {
                handler.post(new v(eVar, gVar, i10));
            }
            eVar.a(p1.f3567e);
        } catch (Throwable th2) {
            i5.g gVar2 = this.R0;
            eVar.getClass();
            synchronized (gVar2) {
                Handler handler2 = (Handler) eVar.f39980a;
                if (handler2 != null) {
                    handler2.post(new v(eVar, gVar2, i10));
                }
                eVar.a(p1.f3567e);
                throw th2;
            }
        }
    }

    @Override // o5.p
    public final boolean o0(o5.m mVar) {
        if (this.f39992g1 == null && !G0(mVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [i5.g, java.lang.Object] */
    @Override // i5.f
    public final void p(boolean z10, boolean z11) {
        boolean z12;
        this.R0 = new Object();
        h1 h1Var = this.f19411d;
        h1Var.getClass();
        int i10 = 0;
        boolean z13 = h1Var.f19488a;
        if (z13 && this.B1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        yk.j.H0(z12);
        if (this.A1 != z13) {
            this.A1 = z13;
            i0();
        }
        i5.g gVar = this.R0;
        e eVar = this.Y0;
        Handler handler = (Handler) eVar.f39980a;
        if (handler != null) {
            handler.post(new v(eVar, gVar, i10));
        }
        this.f39997l1 = z11;
        this.f39998m1 = false;
    }

    @Override // o5.p, i5.f
    public final void q(long j10, boolean z10) {
        super.q(j10, z10);
        this.Z0.getClass();
        u0();
        s sVar = this.X0;
        sVar.f40053m = 0L;
        sVar.f40056p = -1L;
        sVar.f40054n = -1L;
        long j11 = -9223372036854775807L;
        this.f40005t1 = -9223372036854775807L;
        this.f39999n1 = -9223372036854775807L;
        this.f40003r1 = 0;
        if (z10) {
            long j12 = this.f39986a1;
            if (j12 > 0) {
                j11 = SystemClock.elapsedRealtime() + j12;
            }
            this.f40000o1 = j11;
            return;
        }
        this.f40000o1 = -9223372036854775807L;
    }

    @Override // o5.p
    public final int q0(o5.q qVar, b5.v vVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (!r0.l(vVar.f3652l)) {
            return i5.f.e(0, 0, 0);
        }
        int i15 = 1;
        if (vVar.f3655o != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Context context = this.W0;
        List y02 = y0(context, qVar, vVar, z10, false);
        if (z10 && y02.isEmpty()) {
            y02 = y0(context, qVar, vVar, false, false);
        }
        if (y02.isEmpty()) {
            return i5.f.e(1, 0, 0);
        }
        int i16 = vVar.G;
        if (i16 != 0 && i16 != 2) {
            return i5.f.e(2, 0, 0);
        }
        o5.m mVar = (o5.m) y02.get(0);
        boolean d10 = mVar.d(vVar);
        if (!d10) {
            for (int i17 = 1; i17 < y02.size(); i17++) {
                o5.m mVar2 = (o5.m) y02.get(i17);
                if (mVar2.d(vVar)) {
                    z11 = false;
                    d10 = true;
                    mVar = mVar2;
                    break;
                }
            }
        }
        z11 = true;
        if (d10) {
            i10 = 4;
        } else {
            i10 = 3;
        }
        if (mVar.e(vVar)) {
            i11 = 16;
        } else {
            i11 = 8;
        }
        if (mVar.f29636g) {
            i12 = 64;
        } else {
            i12 = 0;
        }
        if (z11) {
            i13 = 128;
        } else {
            i13 = 0;
        }
        if (x.f15050a >= 26 && "video/dolby-vision".equals(vVar.f3652l) && !c.a(context)) {
            i13 = 256;
        }
        if (d10) {
            List y03 = y0(context, qVar, vVar, z10, true);
            if (!y03.isEmpty()) {
                Pattern pattern = o5.u.f29679a;
                ArrayList arrayList = new ArrayList(y03);
                Collections.sort(arrayList, new b0(new b3.t(vVar, 12), i15));
                o5.m mVar3 = (o5.m) arrayList.get(0);
                if (mVar3.d(vVar) && mVar3.e(vVar)) {
                    i14 = 32;
                }
            }
        }
        return i10 | i11 | i14 | i12 | i13;
    }

    @Override // i5.f
    public final void s() {
        f fVar = this.Z0;
        try {
            try {
                G();
                i0();
                n5.i iVar = this.D;
                if (iVar != null) {
                    iVar.c(null);
                }
                this.D = null;
            } catch (Throwable th2) {
                n5.i iVar2 = this.D;
                if (iVar2 != null) {
                    iVar2.c(null);
                }
                this.D = null;
                throw th2;
            }
        } finally {
            fVar.getClass();
            i iVar3 = this.f39993h1;
            if (iVar3 != null) {
                if (this.f39992g1 == iVar3) {
                    this.f39992g1 = null;
                }
                iVar3.release();
                this.f39993h1 = null;
            }
        }
    }

    @Override // i5.f
    public final void t() {
        this.f40002q1 = 0;
        this.f40001p1 = SystemClock.elapsedRealtime();
        this.f40006u1 = SystemClock.elapsedRealtime() * 1000;
        this.f40007v1 = 0L;
        this.f40008w1 = 0;
        s sVar = this.X0;
        sVar.f40044d = true;
        sVar.f40053m = 0L;
        sVar.f40056p = -1L;
        sVar.f40054n = -1L;
        o oVar = sVar.f40042b;
        if (oVar != null) {
            r rVar = sVar.f40043c;
            rVar.getClass();
            rVar.f40038b.sendEmptyMessage(1);
            oVar.a(new b3.t(sVar, 14));
        }
        sVar.e(false);
    }

    @Override // i5.f
    public final void u() {
        this.f40000o1 = -9223372036854775807L;
        A0();
        int i10 = this.f40008w1;
        if (i10 != 0) {
            long j10 = this.f40007v1;
            e eVar = this.Y0;
            Handler handler = (Handler) eVar.f39980a;
            if (handler != null) {
                handler.post(new t(eVar, j10, i10));
            }
            this.f40007v1 = 0L;
            this.f40008w1 = 0;
        }
        s sVar = this.X0;
        sVar.f40044d = false;
        o oVar = sVar.f40042b;
        if (oVar != null) {
            oVar.b();
            r rVar = sVar.f40043c;
            rVar.getClass();
            rVar.f40038b.sendEmptyMessage(2);
        }
        sVar.b();
    }

    public final void u0() {
        o5.k kVar;
        this.f39996k1 = false;
        if (x.f15050a >= 23 && this.A1 && (kVar = this.J) != null) {
            this.C1 = new d(this, kVar);
        }
    }

    @Override // o5.p, i5.f
    public final void x(long j10, long j11) {
        super.x(j10, j11);
        this.Z0.getClass();
    }
}
