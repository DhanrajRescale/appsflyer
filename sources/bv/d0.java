package bv;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f7334a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7335b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7336c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, bv.j] */
    public d0(i0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f7334a = sink;
        this.f7335b = new Object();
    }

    @Override // bv.k
    public final k C(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7336c) {
            this.f7335b.X(source, i10, i11);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k D(long j10) {
        if (!this.f7336c) {
            this.f7335b.d0(j10);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k N(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7336c) {
            this.f7335b.U(source);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k Y(long j10) {
        if (!this.f7336c) {
            this.f7335b.c0(j10);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i0 i0Var = this.f7334a;
        if (!this.f7336c) {
            try {
                j jVar = this.f7335b;
                long j10 = jVar.f7365b;
                if (j10 > 0) {
                    i0Var.write(jVar, j10);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                i0Var.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f7336c = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // bv.k, bv.i0, java.io.Flushable
    public final void flush() {
        if (!this.f7336c) {
            j jVar = this.f7335b;
            long j10 = jVar.f7365b;
            i0 i0Var = this.f7334a;
            if (j10 > 0) {
                i0Var.write(jVar, j10);
            }
            i0Var.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final j h() {
        return this.f7335b;
    }

    @Override // bv.k
    public final k i() {
        if (!this.f7336c) {
            j jVar = this.f7335b;
            long j10 = jVar.f7365b;
            if (j10 > 0) {
                this.f7334a.write(jVar, j10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7336c;
    }

    @Override // bv.k
    public final k k(int i10) {
        if (!this.f7336c) {
            this.f7335b.g0(i10);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k m(int i10) {
        if (!this.f7336c) {
            this.f7335b.e0(i10);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k q(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f7336c) {
            this.f7335b.S(byteString);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k r(int i10) {
        if (!this.f7336c) {
            this.f7335b.b0(i10);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final long s(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long read = ((e) source).read(this.f7335b, 8192L);
            if (read != -1) {
                j10 += read;
                t();
            } else {
                return j10;
            }
        }
    }

    @Override // bv.k
    public final k t() {
        if (!this.f7336c) {
            j jVar = this.f7335b;
            long c10 = jVar.c();
            if (c10 > 0) {
                this.f7334a.write(jVar, c10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.i0
    public final n0 timeout() {
        return this.f7334a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7334a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7336c) {
            int write = this.f7335b.write(source);
            t();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k
    public final k y(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f7336c) {
            this.f7335b.j0(string);
            t();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.i0
    public final void write(j source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f7336c) {
            this.f7335b.write(source, j10);
            t();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
