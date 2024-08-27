package rk;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f33935c;

    /* renamed from: a, reason: collision with root package name */
    public InputStream f33936a;

    /* renamed from: b, reason: collision with root package name */
    public IOException f33937b;

    static {
        char[] cArr = k.f33950a;
        f33935c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f33936a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33936a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f33936a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f33936a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f33936a.read(bArr);
        } catch (IOException e10) {
            this.f33937b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f33936a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        try {
            return this.f33936a.skip(j10);
        } catch (IOException e10) {
            this.f33937b = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f33936a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f33937b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f33936a.read();
        } catch (IOException e10) {
            this.f33937b = e10;
            return -1;
        }
    }
}
