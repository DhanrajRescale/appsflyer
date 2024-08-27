package hk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class v extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public volatile byte[] f18569a;

    /* renamed from: b, reason: collision with root package name */
    public int f18570b;

    /* renamed from: c, reason: collision with root package name */
    public int f18571c;

    /* renamed from: d, reason: collision with root package name */
    public int f18572d;

    /* renamed from: e, reason: collision with root package name */
    public int f18573e;

    /* renamed from: f, reason: collision with root package name */
    public final bk.h f18574f;

    public v(InputStream inputStream, bk.h hVar) {
        super(inputStream);
        this.f18572d = -1;
        this.f18574f = hVar;
        this.f18569a = (byte[]) hVar.c(65536, byte[].class);
    }

    public static void b() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f18572d;
        if (i10 != -1) {
            int i11 = this.f18573e - i10;
            int i12 = this.f18571c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f18570b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f18574f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f18569a = bArr2;
                    this.f18574f.g(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f18573e - this.f18572d;
                this.f18573e = i13;
                this.f18572d = 0;
                this.f18570b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f18573e;
                if (read > 0) {
                    i14 += read;
                }
                this.f18570b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f18572d = -1;
            this.f18573e = 0;
            this.f18570b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f18569a != null && inputStream != null) {
        } else {
            b();
            throw null;
        }
        return (this.f18570b - this.f18573e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f18569a != null) {
            this.f18574f.g(this.f18569a);
            this.f18569a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f18571c = Math.max(this.f18571c, i10);
        this.f18572d = this.f18573e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f18569a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f18573e >= this.f18570b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f18569a && (bArr = this.f18569a) == null) {
                b();
                throw null;
            }
            int i10 = this.f18570b;
            int i11 = this.f18573e;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f18573e = i11 + 1;
            return bArr[i11] & 255;
        }
        b();
        throw null;
    }

    public final synchronized void release() {
        if (this.f18569a != null) {
            this.f18574f.g(this.f18569a);
            this.f18569a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f18569a != null) {
            int i10 = this.f18572d;
            if (-1 != i10) {
                this.f18573e = i10;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.f18573e + " markLimit: " + this.f18571c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f18569a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f18570b;
                int i11 = this.f18573e;
                if (i10 - i11 >= j10) {
                    this.f18573e = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f18573e = i10;
                if (this.f18572d != -1 && j10 <= this.f18571c) {
                    if (a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f18570b;
                    int i13 = this.f18573e;
                    if (i12 - i13 >= j10 - j11) {
                        this.f18573e = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f18573e = i12;
                    return j12;
                }
                return j11 + inputStream.skip(j10 - j11);
            }
            b();
            throw null;
        }
        b();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f18569a;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i14 = this.f18573e;
        int i15 = this.f18570b;
        if (i14 < i15) {
            int i16 = i15 - i14;
            if (i16 >= i11) {
                i16 = i11;
            }
            System.arraycopy(bArr2, i14, bArr, i10, i16);
            this.f18573e += i16;
            if (i16 == i11 || inputStream.available() == 0) {
                return i16;
            }
            i10 += i16;
            i12 = i11 - i16;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f18572d == -1 && i12 >= bArr2.length) {
                i13 = inputStream.read(bArr, i10, i12);
                if (i13 == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f18569a && (bArr2 = this.f18569a) == null) {
                    b();
                    throw null;
                }
                int i17 = this.f18570b;
                int i18 = this.f18573e;
                i13 = i17 - i18;
                if (i13 >= i12) {
                    i13 = i12;
                }
                System.arraycopy(bArr2, i18, bArr, i10, i13);
                this.f18573e += i13;
            }
            i12 -= i13;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += i13;
        }
    }
}
