package g5;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final f f16553a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16554b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16556d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16557e = false;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16555c = new byte[1];

    public g(t tVar, i iVar) {
        this.f16553a = tVar;
        this.f16554b = iVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f16557e) {
            this.f16553a.close();
            this.f16557e = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f16555c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        yk.j.H0(!this.f16557e);
        boolean z10 = this.f16556d;
        f fVar = this.f16553a;
        if (!z10) {
            fVar.o(this.f16554b);
            this.f16556d = true;
        }
        int read = fVar.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
