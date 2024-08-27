package o6;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.airbnb.deeplinkdispatch.MetadataMasks;
import e5.x;
import eb.f;
import f5.g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;
import yk.j;
import z5.b0;
import z5.c0;
import z5.l;
import z5.p;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f29720c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, MetadataMasks.ConfigurablePathSegmentMask, 45, 45, 62, MetadataMasks.ConfigurablePathSegmentMask, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f29721d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f29722e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f29723f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f29724g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f29725h0;
    public long A;
    public long B;
    public f C;
    public f D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* renamed from: a, reason: collision with root package name */
    public final b f29726a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f29727a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f29728b;

    /* renamed from: b0, reason: collision with root package name */
    public r f29729b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f29730c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f29731d;

    /* renamed from: e, reason: collision with root package name */
    public final e5.p f29732e;

    /* renamed from: f, reason: collision with root package name */
    public final e5.p f29733f;

    /* renamed from: g, reason: collision with root package name */
    public final e5.p f29734g;

    /* renamed from: h, reason: collision with root package name */
    public final e5.p f29735h;

    /* renamed from: i, reason: collision with root package name */
    public final e5.p f29736i;

    /* renamed from: j, reason: collision with root package name */
    public final e5.p f29737j;

    /* renamed from: k, reason: collision with root package name */
    public final e5.p f29738k;

    /* renamed from: l, reason: collision with root package name */
    public final e5.p f29739l;

    /* renamed from: m, reason: collision with root package name */
    public final e5.p f29740m;

    /* renamed from: n, reason: collision with root package name */
    public final e5.p f29741n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f29742o;

    /* renamed from: p, reason: collision with root package name */
    public long f29743p;

    /* renamed from: q, reason: collision with root package name */
    public long f29744q;

    /* renamed from: r, reason: collision with root package name */
    public long f29745r;

    /* renamed from: s, reason: collision with root package name */
    public long f29746s;

    /* renamed from: t, reason: collision with root package name */
    public long f29747t;

    /* renamed from: u, reason: collision with root package name */
    public c f29748u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29749v;

    /* renamed from: w, reason: collision with root package name */
    public int f29750w;

    /* renamed from: x, reason: collision with root package name */
    public long f29751x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29752y;

    /* renamed from: z, reason: collision with root package name */
    public long f29753z;

    static {
        int i10 = x.f15050a;
        f29721d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(kp.e.f23433c);
        f29722e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, MetadataMasks.ConfigurablePathSegmentMask, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f29723f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, MetadataMasks.ConfigurablePathSegmentMask, 45, 45, 62, MetadataMasks.ConfigurablePathSegmentMask, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f29724g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        da.e.v(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        da.e.v(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f29725h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        boolean z10;
        b bVar = new b();
        this.f29744q = -1L;
        this.f29745r = -9223372036854775807L;
        this.f29746s = -9223372036854775807L;
        this.f29747t = -9223372036854775807L;
        this.f29753z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f29726a = bVar;
        bVar.f29690d = new t9.c(this);
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29731d = z10;
        this.f29728b = new e();
        this.f29730c = new SparseArray();
        this.f29734g = new e5.p(4);
        this.f29735h = new e5.p(ByteBuffer.allocate(4).putInt(-1).array());
        this.f29736i = new e5.p(4);
        this.f29732e = new e5.p(g.f15954a);
        this.f29733f = new e5.p(4);
        this.f29737j = new e5.p();
        this.f29738k = new e5.p();
        this.f29739l = new e5.p(8);
        this.f29740m = new e5.p();
        this.f29741n = new e5.p();
        this.L = new int[1];
    }

    public static byte[] h(long j10, long j11, String str) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.E0(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = x.f15050a;
        return format.getBytes(kp.e.f23433c);
    }

    public final void a(int i10) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a Cues", null);
    }

    public final void b(int i10) {
        if (this.f29748u != null) {
            return;
        }
        throw ParserException.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(o6.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d.c(o6.c, long, int, int, int):void");
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f29729b0 = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b4, code lost:
    
        throw androidx.media3.common.ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0842, code lost:
    
        if (r6.o() == r10.getLeastSignificantBits()) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0b42, code lost:
    
        r5 = true;
        r0 = r0;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0cea, code lost:
    
        if (r5 == false) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0cec, code lost:
    
        r1 = r34.getPosition();
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cf4, code lost:
    
        if (r3.f29752y == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d02, code lost:
    
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0d06, code lost:
    
        if (r3.f29749v == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d08, code lost:
    
        r0 = r3.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d0e, code lost:
    
        if (r0 == (-1)) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d10, code lost:
    
        r6.f27810a = r0;
        r3.A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0d38, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0d39, code lost:
    
        if (r5 != false) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0d3b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0d42, code lost:
    
        if (r0 >= r3.f29730c.size()) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0d44, code lost:
    
        r1 = (o6.c) r3.f29730c.valueAt(r0);
        r1.X.getClass();
        r2 = r1.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0d53, code lost:
    
        if (r2 == null) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0d55, code lost:
    
        r2.a(r1.X, r1.f29703j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0d5c, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x0d5f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0d61, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0cf6, code lost:
    
        r3.A = r1;
        r35.f27810a = r3.f29753z;
        r3.f29752y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0d00, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0d18, code lost:
    
        r3 = r33;
        r6 = r35;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:118:0x0379. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x053a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a75  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x089e  */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, o6.c] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v40, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v28, types: [o6.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [z5.q] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r34, mj.b r35) {
        /*
            Method dump skipped, instructions count: 4206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.d.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f29726a;
        bVar.f29691e = 0;
        bVar.f29688b.clear();
        e eVar = bVar.f29689c;
        eVar.f29756b = 0;
        eVar.f29757c = 0;
        e eVar2 = this.f29728b;
        eVar2.f29756b = 0;
        eVar2.f29757c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f29730c;
            if (i10 < sparseArray.size()) {
                c0 c0Var = ((c) sparseArray.valueAt(i10)).T;
                if (c0Var != null) {
                    c0Var.f42054b = false;
                    c0Var.f42055c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        f fVar = new f(3);
        l lVar = (l) qVar;
        long j10 = lVar.f42105c;
        long j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j10 != -1 && j10 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j11 = j10;
        }
        int i10 = (int) j11;
        lVar.b(((e5.p) fVar.f15309b).f15036a, 0, 4, false);
        fVar.f15308a = 4;
        for (long v10 = ((e5.p) fVar.f15309b).v(); v10 != 440786851; v10 = ((v10 << 8) & (-256)) | (((e5.p) fVar.f15309b).f15036a[0] & 255)) {
            int i11 = fVar.f15308a + 1;
            fVar.f15308a = i11;
            if (i11 == i10) {
                return false;
            }
            lVar.b(((e5.p) fVar.f15309b).f15036a, 0, 1, false);
        }
        long v11 = fVar.v(lVar);
        long j12 = fVar.f15308a;
        if (v11 == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + v11 >= j10) {
            return false;
        }
        while (true) {
            long j13 = fVar.f15308a;
            long j14 = j12 + v11;
            if (j13 < j14) {
                if (fVar.v(lVar) == Long.MIN_VALUE) {
                    return false;
                }
                long v12 = fVar.v(lVar);
                if (v12 < 0 || v12 > 2147483647L) {
                    return false;
                }
                if (v12 != 0) {
                    int i12 = (int) v12;
                    lVar.k(i12, false);
                    fVar.f15308a += i12;
                }
            } else {
                if (j13 != j14) {
                    return false;
                }
                return true;
            }
        }
    }

    public final void i(q qVar, int i10) {
        e5.p pVar = this.f29734g;
        if (pVar.f15038c >= i10) {
            return;
        }
        byte[] bArr = pVar.f15036a;
        if (bArr.length < i10) {
            pVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = pVar.f15036a;
        int i11 = pVar.f15038c;
        qVar.readFully(bArr2, i11, i10 - i11);
        pVar.E(i10);
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f29727a0 = false;
        this.f29737j.C(0);
    }

    public final long k(long j10) {
        long j11 = this.f29745r;
        if (j11 != -9223372036854775807L) {
            return x.L(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(q qVar, c cVar, int i10, boolean z10) {
        int a10;
        int a11;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f29695b)) {
            m(qVar, f29720c0, i10);
            int i12 = this.T;
            j();
            return i12;
        }
        if ("S_TEXT/ASS".equals(cVar.f29695b)) {
            m(qVar, f29722e0, i10);
            int i13 = this.T;
            j();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f29695b)) {
            m(qVar, f29723f0, i10);
            int i14 = this.T;
            j();
            return i14;
        }
        b0 b0Var = cVar.X;
        boolean z12 = this.V;
        boolean z13 = true;
        e5.p pVar = this.f29737j;
        if (!z12) {
            boolean z14 = cVar.f29701h;
            e5.p pVar2 = this.f29734g;
            if (z14) {
                this.O &= -1073741825;
                int i15 = 128;
                if (!this.W) {
                    qVar.readFully(pVar2.f15036a, 0, 1);
                    this.S++;
                    byte b10 = pVar2.f15036a[0];
                    if ((b10 & 128) != 128) {
                        this.Z = b10;
                        this.W = true;
                    } else {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    if ((b11 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.O |= 1073741824;
                    if (!this.f29727a0) {
                        e5.p pVar3 = this.f29739l;
                        qVar.readFully(pVar3.f15036a, 0, 8);
                        this.S += 8;
                        this.f29727a0 = true;
                        byte[] bArr = pVar2.f15036a;
                        if (!z11) {
                            i15 = 0;
                        }
                        bArr[0] = (byte) (i15 | 8);
                        pVar2.F(0);
                        b0Var.c(1, pVar2);
                        this.T++;
                        pVar3.F(0);
                        b0Var.c(8, pVar3);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            qVar.readFully(pVar2.f15036a, 0, 1);
                            this.S++;
                            pVar2.F(0);
                            this.Y = pVar2.u();
                            this.X = true;
                        }
                        int i16 = this.Y * 4;
                        pVar2.C(i16);
                        qVar.readFully(pVar2.f15036a, 0, i16);
                        this.S += i16;
                        short s7 = (short) ((this.Y / 2) + 1);
                        int i17 = (s7 * 6) + 2;
                        ByteBuffer byteBuffer = this.f29742o;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f29742o = ByteBuffer.allocate(i17);
                        }
                        this.f29742o.position(0);
                        this.f29742o.putShort(s7);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i18 >= i11) {
                                break;
                            }
                            int x10 = pVar2.x();
                            if (i18 % 2 == 0) {
                                this.f29742o.putShort((short) (x10 - i19));
                            } else {
                                this.f29742o.putInt(x10 - i19);
                            }
                            i18++;
                            i19 = x10;
                        }
                        int i20 = (i10 - this.S) - i19;
                        if (i11 % 2 == 1) {
                            this.f29742o.putInt(i20);
                        } else {
                            this.f29742o.putShort((short) i20);
                            this.f29742o.putInt(0);
                        }
                        byte[] array = this.f29742o.array();
                        e5.p pVar4 = this.f29740m;
                        pVar4.D(i17, array);
                        b0Var.c(i17, pVar4);
                        this.T += i17;
                    }
                }
            } else {
                byte[] bArr2 = cVar.f29702i;
                if (bArr2 != null) {
                    pVar.D(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(cVar.f29695b) ? cVar.f29699f > 0 : z10) {
                this.O |= 268435456;
                this.f29741n.C(0);
                int i21 = (pVar.f15038c + i10) - this.S;
                pVar2.C(4);
                byte[] bArr3 = pVar2.f15036a;
                bArr3[0] = (byte) ((i21 >> 24) & 255);
                bArr3[1] = (byte) ((i21 >> 16) & 255);
                bArr3[2] = (byte) ((i21 >> 8) & 255);
                bArr3[3] = (byte) (i21 & 255);
                b0Var.c(4, pVar2);
                this.T += 4;
            }
            this.V = true;
        }
        int i22 = i10 + pVar.f15038c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f29695b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f29695b)) {
            if (cVar.T != null) {
                if (pVar.f15038c != 0) {
                    z13 = false;
                }
                j.H0(z13);
                cVar.T.c(qVar);
            }
            while (true) {
                int i23 = this.S;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int a12 = pVar.a();
                if (a12 > 0) {
                    a11 = Math.min(i24, a12);
                    b0Var.c(a11, pVar);
                } else {
                    a11 = b0Var.a(qVar, i24, false);
                }
                this.S += a11;
                this.T += a11;
            }
        } else {
            e5.p pVar5 = this.f29733f;
            byte[] bArr4 = pVar5.f15036a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i25 = cVar.Y;
            int i26 = 4 - i25;
            while (this.S < i22) {
                int i27 = this.U;
                if (i27 == 0) {
                    int min = Math.min(i25, pVar.a());
                    qVar.readFully(bArr4, i26 + min, i25 - min);
                    if (min > 0) {
                        pVar.e(bArr4, i26, min);
                    }
                    this.S += i25;
                    pVar5.F(0);
                    this.U = pVar5.x();
                    e5.p pVar6 = this.f29732e;
                    pVar6.F(0);
                    b0Var.c(4, pVar6);
                    this.T += 4;
                } else {
                    int a13 = pVar.a();
                    if (a13 > 0) {
                        a10 = Math.min(i27, a13);
                        b0Var.c(a10, pVar);
                    } else {
                        a10 = b0Var.a(qVar, i27, false);
                    }
                    this.S += a10;
                    this.T += a10;
                    this.U -= a10;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f29695b)) {
            e5.p pVar7 = this.f29735h;
            pVar7.F(0);
            b0Var.c(4, pVar7);
            this.T += 4;
        }
        int i28 = this.T;
        j();
        return i28;
    }

    public final void m(q qVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        e5.p pVar = this.f29738k;
        byte[] bArr2 = pVar.f15036a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            pVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        qVar.readFully(pVar.f15036a, bArr.length, i10);
        pVar.F(0);
        pVar.E(length);
    }

    @Override // z5.p
    public final void release() {
    }
}
