package bv;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public final class e0 implements l {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f7340a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7341b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7342c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, bv.j] */
    public e0(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f7340a = source;
        this.f7341b = new Object();
    }

    @Override // bv.l
    public final String B(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        k0 k0Var = this.f7340a;
        j jVar = this.f7341b;
        jVar.s(k0Var);
        return jVar.B(charset);
    }

    @Override // bv.l
    public final m E() {
        k0 k0Var = this.f7340a;
        j jVar = this.f7341b;
        jVar.s(k0Var);
        return jVar.e(jVar.f7365b);
    }

    @Override // bv.l
    public final boolean F(long j10) {
        j jVar;
        if (j10 >= 0) {
            if (!(!this.f7342c)) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                jVar = this.f7341b;
                if (jVar.f7365b >= j10) {
                    return true;
                }
            } while (this.f7340a.read(jVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
    }

    @Override // bv.l
    public final void G(j sink, long j10) {
        j jVar = this.f7341b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            W(j10);
            jVar.G(sink, j10);
        } catch (EOFException e10) {
            sink.s(jVar);
            throw e10;
        }
    }

    @Override // bv.l
    public final String K() {
        return w(Long.MAX_VALUE);
    }

    @Override // bv.l
    public final int L() {
        W(4L);
        return this.f7341b.L();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // bv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(bv.a0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.f7342c
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            bv.j r0 = r7.f7341b
            int r2 = cv.a.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            bv.m[] r8 = r8.f7320b
            r8 = r8[r2]
            int r8 = r8.d()
            long r3 = (long) r8
            r0.skip(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            bv.k0 r2 = r7.f7340a
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.e0.M(bv.a0):int");
    }

    @Override // bv.l
    public final short O() {
        W(2L);
        return this.f7341b.O();
    }

    @Override // bv.l
    public final long P(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!this.f7342c) {
            long j10 = 0;
            while (true) {
                j jVar = this.f7341b;
                long l10 = jVar.l(j10, targetBytes);
                if (l10 == -1) {
                    long j11 = jVar.f7365b;
                    if (this.f7340a.read(jVar, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                } else {
                    return l10;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // bv.l
    public final long Q() {
        W(8L);
        return this.f7341b.Q();
    }

    @Override // bv.l
    public final boolean T(long j10, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int d10 = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f7342c) {
            if (d10 >= 0 && bytes.d() >= d10) {
                for (int i10 = 0; i10 < d10; i10++) {
                    long j11 = i10;
                    if (F(1 + j11) && this.f7341b.f(j11) == bytes.i(i10)) {
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.l
    public final long V(k sink) {
        j jVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (true) {
            k0 k0Var = this.f7340a;
            jVar = this.f7341b;
            if (k0Var.read(jVar, 8192L) == -1) {
                break;
            }
            long c10 = jVar.c();
            if (c10 > 0) {
                j10 += c10;
                sink.write(jVar, c10);
            }
        }
        long j11 = jVar.f7365b;
        if (j11 > 0) {
            long j12 = j10 + j11;
            sink.write(jVar, j11);
            return j12;
        }
        return j10;
    }

    @Override // bv.l
    public final void W(long j10) {
        if (F(j10)) {
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // bv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z() {
        /*
            r6 = this;
            r0 = 1
            r6.W(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.F(r2)
            bv.j r3 = r6.f7341b
            if (r2 == 0) goto L57
            long r4 = (long) r0
            byte r2 = r3.f(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L57
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r3)
            r3 = 16
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L57:
            long r0 = r3.Z()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.e0.Z():long");
    }

    public final long a(byte b10, long j10, long j11) {
        if (!this.f7342c) {
            long j12 = 0;
            if (0 <= j11) {
                while (j12 < j11) {
                    long g10 = this.f7341b.g(b10, j12, j11);
                    if (g10 != -1) {
                        return g10;
                    }
                    j jVar = this.f7341b;
                    long j13 = jVar.f7365b;
                    if (j13 >= j11 || this.f7340a.read(jVar, 8192L) == -1) {
                        return -1L;
                    }
                    j12 = Math.max(j12, j13);
                }
                return -1L;
            }
            throw new IllegalArgumentException(nn.d.j("fromIndex=0 toIndex=", j11).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.l
    public final i a0() {
        return new i(this, 1);
    }

    public final String b(long j10) {
        W(j10);
        j jVar = this.f7341b;
        jVar.getClass();
        return jVar.z(j10, Charsets.UTF_8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f7342c) {
            this.f7342c = true;
            this.f7340a.close();
            this.f7341b.a();
        }
    }

    @Override // bv.l
    public final m e(long j10) {
        W(j10);
        return this.f7341b.e(j10);
    }

    @Override // bv.l
    public final j h() {
        return this.f7341b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7342c;
    }

    @Override // bv.l
    public final byte[] o() {
        k0 k0Var = this.f7340a;
        j jVar = this.f7341b;
        jVar.s(k0Var);
        return jVar.x(jVar.f7365b);
    }

    @Override // bv.l
    public final boolean p() {
        if (!this.f7342c) {
            j jVar = this.f7341b;
            if (jVar.p() && this.f7340a.read(jVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.l
    public final e0 peek() {
        return hl.f.v(new c0(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        j jVar = this.f7341b;
        if (jVar.f7365b == 0 && this.f7340a.read(jVar, 8192L) == -1) {
            return -1;
        }
        return jVar.read(sink);
    }

    @Override // bv.l
    public final byte readByte() {
        W(1L);
        return this.f7341b.readByte();
    }

    @Override // bv.l
    public final void readFully(byte[] sink) {
        j jVar = this.f7341b;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            W(sink.length);
            jVar.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                long j10 = jVar.f7365b;
                if (j10 > 0) {
                    int read = jVar.read(sink, i10, (int) j10);
                    if (read != -1) {
                        i10 += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e10;
                }
            }
        }
    }

    @Override // bv.l
    public final int readInt() {
        W(4L);
        return this.f7341b.readInt();
    }

    @Override // bv.l
    public final long readLong() {
        W(8L);
        return this.f7341b.readLong();
    }

    @Override // bv.l
    public final short readShort() {
        W(2L);
        return this.f7341b.readShort();
    }

    @Override // bv.l
    public final void skip(long j10) {
        if (!this.f7342c) {
            while (j10 > 0) {
                j jVar = this.f7341b;
                if (jVar.f7365b == 0 && this.f7340a.read(jVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j10, jVar.f7365b);
                jVar.skip(min);
                j10 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bv.k0
    public final n0 timeout() {
        return this.f7340a.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f7340a + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // bv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            r11 = this;
            r0 = 1
            r11.W(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.F(r6)
            bv.j r9 = r11.f7341b
            if (r8 == 0) goto L4f
            byte r8 = r9.f(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L4f
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f:
            long r0 = r9.u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.e0.u():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, bv.j] */
    @Override // bv.l
    public final String w(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            long a10 = a((byte) 10, 0L, j11);
            j jVar = this.f7341b;
            if (a10 != -1) {
                return cv.a.b(jVar, a10);
            }
            if (j11 < Long.MAX_VALUE && F(j11) && jVar.f(j11 - 1) == 13 && F(1 + j11) && jVar.f(j11) == 10) {
                return cv.a.b(jVar, j11);
            }
            ?? obj = new Object();
            jVar.d(0L, obj, Math.min(32, jVar.f7365b));
            throw new EOFException("\\n not found: limit=" + Math.min(jVar.f7365b, j10) + " content=" + obj.e(obj.f7365b).e() + (char) 8230);
        }
        throw new IllegalArgumentException(nn.d.j("limit < 0: ", j10).toString());
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f7342c)) {
            throw new IllegalStateException("closed".toString());
        }
        j jVar = this.f7341b;
        if (jVar.f7365b == 0 && this.f7340a.read(jVar, 8192L) == -1) {
            return -1L;
        }
        return jVar.read(sink, Math.min(j10, jVar.f7365b));
    }
}
