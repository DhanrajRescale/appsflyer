package p8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30748a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f30749b = 1073741824;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30750c;

    public j(InputStream inputStream) {
        this.f30750c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f30748a) {
            case 0:
                return this.f30749b;
            default:
                return ((ByteBuffer) this.f30750c).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f30748a) {
            case 0:
                ((InputStream) this.f30750c).close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        switch (this.f30748a) {
            case 1:
                synchronized (this) {
                    this.f30749b = ((ByteBuffer) this.f30750c).position();
                }
                return;
            default:
                super.mark(i10);
                return;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        switch (this.f30748a) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        switch (this.f30748a) {
            case 0:
                int read = ((InputStream) this.f30750c).read(bArr);
                if (read == -1) {
                    this.f30749b = 0;
                }
                return read;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        switch (this.f30748a) {
            case 1:
                synchronized (this) {
                    int i10 = this.f30749b;
                    if (i10 != -1) {
                        ((ByteBuffer) this.f30750c).position(i10);
                    } else {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        int i10 = this.f30748a;
        Object obj = this.f30750c;
        switch (i10) {
            case 0:
                return ((InputStream) obj).skip(j10);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long min = Math.min(j10, available());
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
        }
    }

    public j(ByteBuffer byteBuffer) {
        this.f30750c = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i10 = this.f30748a;
        Object obj = this.f30750c;
        switch (i10) {
            case 0:
                int read = ((InputStream) obj).read();
                if (read == -1) {
                    this.f30749b = 0;
                }
                return read;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f30748a;
        Object obj = this.f30750c;
        switch (i12) {
            case 0:
                int read = ((InputStream) obj).read(bArr, i10, i11);
                if (read == -1) {
                    this.f30749b = 0;
                }
                return read;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int min = Math.min(i11, available());
                byteBuffer.get(bArr, i10, min);
                return min;
        }
    }
}
