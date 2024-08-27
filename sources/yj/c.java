package yj;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f41654a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f41655b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.h f41656c;

    /* renamed from: d, reason: collision with root package name */
    public int f41657d;

    public c(FileOutputStream fileOutputStream, bk.h hVar) {
        this.f41654a = fileOutputStream;
        this.f41656c = hVar;
        this.f41655b = (byte[]) hVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f41654a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f41655b;
            if (bArr != null) {
                this.f41656c.g(bArr);
                this.f41655b = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.f41657d;
        OutputStream outputStream = this.f41654a;
        if (i10 > 0) {
            outputStream.write(this.f41655b, 0, i10);
            this.f41657d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f41655b;
        int i11 = this.f41657d;
        int i12 = i11 + 1;
        this.f41657d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f41654a.write(bArr, 0, i12);
        this.f41657d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f41657d;
            OutputStream outputStream = this.f41654a;
            if (i15 == 0 && i13 >= this.f41655b.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f41655b.length - i15);
            System.arraycopy(bArr, i14, this.f41655b, this.f41657d, min);
            int i16 = this.f41657d + min;
            this.f41657d = i16;
            i12 += min;
            byte[] bArr2 = this.f41655b;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f41657d = 0;
            }
        } while (i12 < i11);
    }
}
