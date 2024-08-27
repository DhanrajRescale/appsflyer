package br;

import fr.i;
import gr.p;
import gr.r;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f7277a;

    /* renamed from: b, reason: collision with root package name */
    public final zq.g f7278b;

    /* renamed from: c, reason: collision with root package name */
    public final i f7279c;

    /* renamed from: e, reason: collision with root package name */
    public long f7281e;

    /* renamed from: d, reason: collision with root package name */
    public long f7280d = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f7282f = -1;

    public a(InputStream inputStream, zq.g gVar, i iVar) {
        this.f7279c = iVar;
        this.f7277a = inputStream;
        this.f7278b = gVar;
        this.f7281e = ((r) gVar.f42811d.f11975b).R();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.f7277a.available();
        } catch (IOException e10) {
            long a10 = this.f7279c.a();
            zq.g gVar = this.f7278b;
            gVar.k(a10);
            h.c(gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zq.g gVar = this.f7278b;
        i iVar = this.f7279c;
        long a10 = iVar.a();
        if (this.f7282f == -1) {
            this.f7282f = a10;
        }
        try {
            this.f7277a.close();
            long j10 = this.f7280d;
            if (j10 != -1) {
                gVar.j(j10);
            }
            long j11 = this.f7281e;
            if (j11 != -1) {
                p pVar = gVar.f42811d;
                pVar.i();
                r.C((r) pVar.f11975b, j11);
            }
            gVar.k(this.f7282f);
            gVar.b();
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f7277a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f7277a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        i iVar = this.f7279c;
        zq.g gVar = this.f7278b;
        try {
            int read = this.f7277a.read();
            long a10 = iVar.a();
            if (this.f7281e == -1) {
                this.f7281e = a10;
            }
            if (read == -1 && this.f7282f == -1) {
                this.f7282f = a10;
                gVar.k(a10);
                gVar.b();
            } else {
                long j10 = this.f7280d + 1;
                this.f7280d = j10;
                gVar.j(j10);
            }
            return read;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.f7277a.reset();
        } catch (IOException e10) {
            long a10 = this.f7279c.a();
            zq.g gVar = this.f7278b;
            gVar.k(a10);
            h.c(gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        i iVar = this.f7279c;
        zq.g gVar = this.f7278b;
        try {
            long skip = this.f7277a.skip(j10);
            long a10 = iVar.a();
            if (this.f7281e == -1) {
                this.f7281e = a10;
            }
            if (skip == -1 && this.f7282f == -1) {
                this.f7282f = a10;
                gVar.k(a10);
            } else {
                long j11 = this.f7280d + skip;
                this.f7280d = j11;
                gVar.j(j11);
            }
            return skip;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        i iVar = this.f7279c;
        zq.g gVar = this.f7278b;
        try {
            int read = this.f7277a.read(bArr, i10, i11);
            long a10 = iVar.a();
            if (this.f7281e == -1) {
                this.f7281e = a10;
            }
            if (read == -1 && this.f7282f == -1) {
                this.f7282f = a10;
                gVar.k(a10);
                gVar.b();
            } else {
                long j10 = this.f7280d + read;
                this.f7280d = j10;
                gVar.j(j10);
            }
            return read;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        i iVar = this.f7279c;
        zq.g gVar = this.f7278b;
        try {
            int read = this.f7277a.read(bArr);
            long a10 = iVar.a();
            if (this.f7281e == -1) {
                this.f7281e = a10;
            }
            if (read == -1 && this.f7282f == -1) {
                this.f7282f = a10;
                gVar.k(a10);
                gVar.b();
            } else {
                long j10 = this.f7280d + read;
                this.f7280d = j10;
                gVar.j(j10);
            }
            return read;
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }
}
