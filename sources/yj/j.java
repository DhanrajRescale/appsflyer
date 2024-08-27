package yj;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f41661c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int f41662d = 31;

    /* renamed from: a, reason: collision with root package name */
    public final byte f41663a;

    /* renamed from: b, reason: collision with root package name */
    public int f41664b;

    public j(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f41663a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException(jr.h.n("Cannot add invalid orientation: ", i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i10;
        int i11 = this.f41664b;
        if (i11 >= 2 && i11 <= (i10 = f41662d)) {
            read = i11 == i10 ? this.f41663a : f41661c[i11 - 2] & 255;
        } else {
            read = super.read();
        }
        if (read != -1) {
            this.f41664b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f41664b = (int) (this.f41664b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f41664b;
        int i14 = f41662d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f41663a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f41661c, this.f41664b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f41664b += i12;
        }
        return i12;
    }
}
