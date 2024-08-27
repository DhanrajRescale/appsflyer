package z5;

import b5.l0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements q {

    /* renamed from: b, reason: collision with root package name */
    public final b5.o f42104b;

    /* renamed from: c, reason: collision with root package name */
    public final long f42105c;

    /* renamed from: d, reason: collision with root package name */
    public long f42106d;

    /* renamed from: f, reason: collision with root package name */
    public int f42108f;

    /* renamed from: g, reason: collision with root package name */
    public int f42109g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f42107e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f42103a = new byte[4096];

    static {
        l0.a("media3.extractor");
    }

    public l(g5.f fVar, long j10, long j11) {
        this.f42104b = fVar;
        this.f42106d = j10;
        this.f42105c = j11;
    }

    @Override // z5.q
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.f42109g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f42107e, 0, bArr, i10, min);
            r(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = q(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.f42106d += i13;
        }
        if (i13 == -1) {
            return false;
        }
        return true;
    }

    @Override // z5.q
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f42107e, this.f42108f - i11, bArr, i10, i11);
        return true;
    }

    @Override // z5.q
    public final long c() {
        return this.f42106d + this.f42108f;
    }

    @Override // z5.q
    public final void d(int i10) {
        k(i10, false);
    }

    @Override // z5.q
    public final int e(int i10) {
        int min = Math.min(this.f42109g, i10);
        r(min);
        if (min == 0) {
            byte[] bArr = this.f42103a;
            min = q(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f42106d += min;
        }
        return min;
    }

    @Override // z5.q
    public final long f() {
        return this.f42105c;
    }

    @Override // z5.q
    public final int g(byte[] bArr, int i10, int i11) {
        int min;
        p(i11);
        int i12 = this.f42109g;
        int i13 = this.f42108f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = q(this.f42107e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f42109g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f42107e, this.f42108f, bArr, i10, min);
        this.f42108f += min;
        return min;
    }

    @Override // z5.q
    public final long getPosition() {
        return this.f42106d;
    }

    @Override // z5.q
    public final void i() {
        this.f42108f = 0;
    }

    @Override // z5.q
    public final void j(int i10) {
        int min = Math.min(this.f42109g, i10);
        r(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = q(this.f42103a, -i11, Math.min(i10, this.f42103a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f42106d += i11;
        }
    }

    @Override // z5.q
    public final boolean k(int i10, boolean z10) {
        p(i10);
        int i11 = this.f42109g - this.f42108f;
        while (i11 < i10) {
            i11 = q(this.f42107e, this.f42108f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f42109g = this.f42108f + i11;
        }
        this.f42108f += i10;
        return true;
    }

    @Override // z5.q
    public final void n(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }

    public final void p(int i10) {
        int i11 = this.f42108f + i10;
        byte[] bArr = this.f42107e;
        if (i11 > bArr.length) {
            this.f42107e = Arrays.copyOf(this.f42107e, e5.x.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int q(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (!Thread.interrupted()) {
            int read = this.f42104b.read(bArr, i10 + i12, i11 - i12);
            if (read == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + read;
        }
        throw new InterruptedIOException();
    }

    public final void r(int i10) {
        byte[] bArr;
        int i11 = this.f42109g - i10;
        this.f42109g = i11;
        this.f42108f = 0;
        byte[] bArr2 = this.f42107e;
        if (i11 < bArr2.length - 524288) {
            bArr = new byte[65536 + i11];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.f42107e = bArr;
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f42109g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f42107e, 0, bArr, i10, min);
            r(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = q(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f42106d += i13;
        }
        return i13;
    }

    @Override // z5.q
    public final void readFully(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11, false);
    }
}
