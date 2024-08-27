package bv;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public byte f7391a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f7392b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f7393c;

    /* renamed from: d, reason: collision with root package name */
    public final v f7394d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f7395e;

    public u(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        e0 e0Var = new e0(source);
        this.f7392b = e0Var;
        Inflater inflater = new Inflater(true);
        this.f7393c = inflater;
        this.f7394d = new v(e0Var, inflater);
        this.f7395e = new CRC32();
    }

    public static void a(int i10, int i11, String str) {
        if (i11 == i10) {
            return;
        }
        StringBuilder r10 = da.e.r(str, ": actual 0x");
        r10.append(kotlin.text.w.H(b.e(i11)));
        r10.append(" != expected 0x");
        r10.append(kotlin.text.w.H(b.e(i10)));
        throw new IOException(r10.toString());
    }

    public final void b(long j10, j jVar, long j11) {
        f0 f0Var = jVar.f7364a;
        Intrinsics.c(f0Var);
        while (true) {
            int i10 = f0Var.f7345c;
            int i11 = f0Var.f7344b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            f0Var = f0Var.f7348f;
            Intrinsics.c(f0Var);
        }
        while (j11 > 0) {
            int min = (int) Math.min(f0Var.f7345c - r5, j11);
            this.f7395e.update(f0Var.f7343a, (int) (f0Var.f7344b + j10), min);
            j11 -= min;
            f0Var = f0Var.f7348f;
            Intrinsics.c(f0Var);
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7394d.close();
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        e0 e0Var;
        boolean z10;
        long j11;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 >= 0) {
            if (j10 == 0) {
                return 0L;
            }
            byte b10 = this.f7391a;
            CRC32 crc32 = this.f7395e;
            e0 e0Var2 = this.f7392b;
            if (b10 == 0) {
                e0Var2.W(10L);
                j jVar = e0Var2.f7341b;
                byte f10 = jVar.f(3L);
                if (((f10 >> 1) & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b(0L, e0Var2.f7341b, 10L);
                }
                a(8075, e0Var2.readShort(), "ID1ID2");
                e0Var2.skip(8L);
                if (((f10 >> 2) & 1) == 1) {
                    e0Var2.W(2L);
                    if (z10) {
                        b(0L, e0Var2.f7341b, 2L);
                    }
                    long O = jVar.O() & 65535;
                    e0Var2.W(O);
                    if (z10) {
                        b(0L, e0Var2.f7341b, O);
                        j11 = O;
                    } else {
                        j11 = O;
                    }
                    e0Var2.skip(j11);
                }
                if (((f10 >> 3) & 1) == 1) {
                    long a10 = e0Var2.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 != -1) {
                        if (z10) {
                            e0Var = e0Var2;
                            b(0L, e0Var2.f7341b, a10 + 1);
                        } else {
                            e0Var = e0Var2;
                        }
                        e0Var.skip(a10 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    e0Var = e0Var2;
                }
                if (((f10 >> 4) & 1) == 1) {
                    long a11 = e0Var.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a11 != -1) {
                        if (z10) {
                            b(0L, e0Var.f7341b, a11 + 1);
                        }
                        e0Var.skip(a11 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z10) {
                    a(e0Var.O(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f7391a = (byte) 1;
            } else {
                e0Var = e0Var2;
            }
            if (this.f7391a == 1) {
                long j12 = sink.f7365b;
                long read = this.f7394d.read(sink, j10);
                if (read != -1) {
                    b(j12, sink, read);
                    return read;
                }
                this.f7391a = (byte) 2;
            }
            if (this.f7391a == 2) {
                a(e0Var.L(), (int) crc32.getValue(), "CRC");
                a(e0Var.L(), (int) this.f7393c.getBytesWritten(), "ISIZE");
                this.f7391a = (byte) 3;
                if (e0Var.p()) {
                    return -1L;
                }
                throw new IOException("gzip finished without exhausting source");
            }
            return -1L;
        }
        throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
    }

    @Override // bv.k0
    /* renamed from: timeout */
    public final n0 getTimeout() {
        return this.f7392b.f7340a.getTimeout();
    }
}
