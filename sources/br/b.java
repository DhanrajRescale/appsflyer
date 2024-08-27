package br;

import fr.i;
import gr.p;
import gr.r;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f7283a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7284b;

    /* renamed from: c, reason: collision with root package name */
    public final zq.g f7285c;

    /* renamed from: d, reason: collision with root package name */
    public long f7286d = -1;

    public b(OutputStream outputStream, zq.g gVar, i iVar) {
        this.f7283a = outputStream;
        this.f7285c = gVar;
        this.f7284b = iVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10 = this.f7286d;
        zq.g gVar = this.f7285c;
        if (j10 != -1) {
            gVar.f(j10);
        }
        i iVar = this.f7284b;
        long a10 = iVar.a();
        p pVar = gVar.f42811d;
        pVar.i();
        r.B((r) pVar.f11975b, a10);
        try {
            this.f7283a.close();
        } catch (IOException e10) {
            a3.a.t(iVar, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.f7283a.flush();
        } catch (IOException e10) {
            long a10 = this.f7284b.a();
            zq.g gVar = this.f7285c;
            gVar.k(a10);
            h.c(gVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        zq.g gVar = this.f7285c;
        try {
            this.f7283a.write(i10);
            long j10 = this.f7286d + 1;
            this.f7286d = j10;
            gVar.f(j10);
        } catch (IOException e10) {
            a3.a.t(this.f7284b, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        zq.g gVar = this.f7285c;
        try {
            this.f7283a.write(bArr);
            long length = this.f7286d + bArr.length;
            this.f7286d = length;
            gVar.f(length);
        } catch (IOException e10) {
            a3.a.t(this.f7284b, gVar, gVar);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        zq.g gVar = this.f7285c;
        try {
            this.f7283a.write(bArr, i10, i11);
            long j10 = this.f7286d + i11;
            this.f7286d = j10;
            gVar.f(j10);
        } catch (IOException e10) {
            a3.a.t(this.f7284b, gVar, gVar);
            throw e10;
        }
    }
}
