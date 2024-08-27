package vj;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f38137a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f38138b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f38139c;

    /* renamed from: d, reason: collision with root package name */
    public int f38140d;

    /* renamed from: e, reason: collision with root package name */
    public int f38141e;

    public g(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(h.f38142a)) {
                this.f38137a = fileInputStream;
                this.f38138b = charset;
                this.f38139c = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() {
        int i10;
        synchronized (this.f38137a) {
            try {
                byte[] bArr = this.f38139c;
                if (bArr != null) {
                    if (this.f38140d >= this.f38141e) {
                        int read = this.f38137a.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.f38140d = 0;
                            this.f38141e = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i11 = this.f38140d; i11 != this.f38141e; i11++) {
                        byte[] bArr2 = this.f38139c;
                        if (bArr2[i11] == 10) {
                            int i12 = this.f38140d;
                            if (i11 != i12) {
                                i10 = i11 - 1;
                                if (bArr2[i10] == 13) {
                                    String str = new String(bArr2, i12, i10 - i12, this.f38138b.name());
                                    this.f38140d = i11 + 1;
                                    return str;
                                }
                            }
                            i10 = i11;
                            String str2 = new String(bArr2, i12, i10 - i12, this.f38138b.name());
                            this.f38140d = i11 + 1;
                            return str2;
                        }
                    }
                    f fVar = new f(this, (this.f38141e - this.f38140d) + 80);
                    while (true) {
                        byte[] bArr3 = this.f38139c;
                        int i13 = this.f38140d;
                        fVar.write(bArr3, i13, this.f38141e - i13);
                        this.f38141e = -1;
                        byte[] bArr4 = this.f38139c;
                        int read2 = this.f38137a.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.f38140d = 0;
                            this.f38141e = read2;
                            for (int i14 = 0; i14 != this.f38141e; i14++) {
                                byte[] bArr5 = this.f38139c;
                                if (bArr5[i14] == 10) {
                                    int i15 = this.f38140d;
                                    if (i14 != i15) {
                                        fVar.write(bArr5, i15, i14 - i15);
                                    }
                                    this.f38140d = i14 + 1;
                                    return fVar.toString();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f38137a) {
            try {
                if (this.f38139c != null) {
                    this.f38139c = null;
                    this.f38137a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
