package r5;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final v5.e f33285a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33286b;

    /* renamed from: c, reason: collision with root package name */
    public final e5.p f33287c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f33288d;

    /* renamed from: e, reason: collision with root package name */
    public q0 f33289e;

    /* renamed from: f, reason: collision with root package name */
    public q0 f33290f;

    /* renamed from: g, reason: collision with root package name */
    public long f33291g;

    public r0(v5.e eVar) {
        this.f33285a = eVar;
        int i10 = eVar.f37706b;
        this.f33286b = i10;
        this.f33287c = new e5.p(32);
        q0 q0Var = new q0(i10, 0L);
        this.f33288d = q0Var;
        this.f33289e = q0Var;
        this.f33290f = q0Var;
    }

    public static q0 d(q0 q0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= q0Var.f33274b) {
            q0Var = q0Var.f33276d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (q0Var.f33274b - j10));
            v5.a aVar = q0Var.f33275c;
            byteBuffer.put(aVar.f37697a, ((int) (j10 - q0Var.f33273a)) + aVar.f37698b, min);
            i10 -= min;
            j10 += min;
            if (j10 == q0Var.f33274b) {
                q0Var = q0Var.f33276d;
            }
        }
        return q0Var;
    }

    public static q0 e(q0 q0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= q0Var.f33274b) {
            q0Var = q0Var.f33276d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (q0Var.f33274b - j10));
            v5.a aVar = q0Var.f33275c;
            System.arraycopy(aVar.f37697a, ((int) (j10 - q0Var.f33273a)) + aVar.f37698b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == q0Var.f33274b) {
                q0Var = q0Var.f33276d;
            }
        }
        return q0Var;
    }

    public static q0 f(q0 q0Var, h5.f fVar, jr.p pVar, e5.p pVar2) {
        boolean z10;
        if (fVar.g(1073741824)) {
            long j10 = pVar.f21651a;
            int i10 = 1;
            pVar2.C(1);
            q0 e10 = e(q0Var, j10, pVar2.f15036a, 1);
            long j11 = j10 + 1;
            byte b10 = pVar2.f15036a[0];
            if ((b10 & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = b10 & Byte.MAX_VALUE;
            h5.d dVar = fVar.f18001c;
            byte[] bArr = dVar.f17991a;
            if (bArr == null) {
                dVar.f17991a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            q0Var = e(e10, j11, dVar.f17991a, i11);
            long j12 = j11 + i11;
            if (z10) {
                pVar2.C(2);
                q0Var = e(q0Var, j12, pVar2.f15036a, 2);
                j12 += 2;
                i10 = pVar2.z();
            }
            int[] iArr = dVar.f17994d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.f17995e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                pVar2.C(i12);
                q0Var = e(q0Var, j12, pVar2.f15036a, i12);
                j12 += i12;
                pVar2.F(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = pVar2.z();
                    iArr2[i13] = pVar2.x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = pVar.f21652b - ((int) (j12 - pVar.f21651a));
            }
            z5.a0 a0Var = (z5.a0) pVar.f21653c;
            int i14 = e5.x.f15050a;
            byte[] bArr2 = a0Var.f42034b;
            byte[] bArr3 = dVar.f17991a;
            dVar.f17996f = i10;
            dVar.f17994d = iArr;
            dVar.f17995e = iArr2;
            dVar.f17992b = bArr2;
            dVar.f17991a = bArr3;
            int i15 = a0Var.f42033a;
            dVar.f17993c = i15;
            int i16 = a0Var.f42035c;
            dVar.f17997g = i16;
            int i17 = a0Var.f42036d;
            dVar.f17998h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.f17999i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (e5.x.f15050a >= 24) {
                h5.c cVar = dVar.f18000j;
                cVar.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = cVar.f17990b;
                pattern.set(i16, i17);
                cVar.f17989a.setPattern(pattern);
            }
            long j13 = pVar.f21651a;
            int i18 = (int) (j12 - j13);
            pVar.f21651a = j13 + i18;
            pVar.f21652b -= i18;
        }
        if (fVar.g(268435456)) {
            pVar2.C(4);
            q0 e11 = e(q0Var, pVar.f21651a, pVar2.f15036a, 4);
            int x10 = pVar2.x();
            pVar.f21651a += 4;
            pVar.f21652b -= 4;
            fVar.k(x10);
            q0 d10 = d(e11, pVar.f21651a, fVar.f18002d, x10);
            pVar.f21651a += x10;
            int i19 = pVar.f21652b - x10;
            pVar.f21652b = i19;
            ByteBuffer byteBuffer = fVar.f18005g;
            if (byteBuffer != null && byteBuffer.capacity() >= i19) {
                fVar.f18005g.clear();
            } else {
                fVar.f18005g = ByteBuffer.allocate(i19);
            }
            return d(d10, pVar.f21651a, fVar.f18005g, pVar.f21652b);
        }
        fVar.k(pVar.f21652b);
        return d(q0Var, pVar.f21651a, fVar.f18002d, pVar.f21652b);
    }

    public final void a(q0 q0Var) {
        if (q0Var.f33275c == null) {
            return;
        }
        v5.e eVar = this.f33285a;
        synchronized (eVar) {
            q0 q0Var2 = q0Var;
            while (q0Var2 != null) {
                try {
                    v5.a[] aVarArr = eVar.f37710f;
                    int i10 = eVar.f37709e;
                    eVar.f37709e = i10 + 1;
                    v5.a aVar = q0Var2.f33275c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    eVar.f37708d--;
                    q0Var2 = q0Var2.f33276d;
                    if (q0Var2 == null || q0Var2.f33275c == null) {
                        q0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            eVar.notifyAll();
        }
        q0Var.f33275c = null;
        q0Var.f33276d = null;
    }

    public final void b(long j10) {
        q0 q0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            q0Var = this.f33288d;
            if (j10 < q0Var.f33274b) {
                break;
            }
            v5.e eVar = this.f33285a;
            v5.a aVar = q0Var.f33275c;
            synchronized (eVar) {
                v5.a[] aVarArr = eVar.f37710f;
                int i10 = eVar.f37709e;
                eVar.f37709e = i10 + 1;
                aVarArr[i10] = aVar;
                eVar.f37708d--;
                eVar.notifyAll();
            }
            q0 q0Var2 = this.f33288d;
            q0Var2.f33275c = null;
            q0 q0Var3 = q0Var2.f33276d;
            q0Var2.f33276d = null;
            this.f33288d = q0Var3;
        }
        if (this.f33289e.f33273a < q0Var.f33273a) {
            this.f33289e = q0Var;
        }
    }

    public final int c(int i10) {
        v5.a aVar;
        q0 q0Var = this.f33290f;
        if (q0Var.f33275c == null) {
            v5.e eVar = this.f33285a;
            synchronized (eVar) {
                try {
                    int i11 = eVar.f37708d + 1;
                    eVar.f37708d = i11;
                    int i12 = eVar.f37709e;
                    if (i12 > 0) {
                        v5.a[] aVarArr = eVar.f37710f;
                        int i13 = i12 - 1;
                        eVar.f37709e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        eVar.f37710f[eVar.f37709e] = null;
                    } else {
                        v5.a aVar2 = new v5.a(new byte[eVar.f37706b], 0);
                        v5.a[] aVarArr2 = eVar.f37710f;
                        if (i11 > aVarArr2.length) {
                            eVar.f37710f = (v5.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            q0 q0Var2 = new q0(this.f33286b, this.f33290f.f33274b);
            q0Var.f33275c = aVar;
            q0Var.f33276d = q0Var2;
        }
        return Math.min(i10, (int) (this.f33290f.f33274b - this.f33291g));
    }
}
