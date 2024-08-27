package bv;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public final class j implements l, k, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public f0 f7364a;

    /* renamed from: b, reason: collision with root package name */
    public long f7365b;

    @Override // bv.l
    public final String B(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return z(this.f7365b, charset);
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k C(byte[] bArr, int i10, int i11) {
        X(bArr, i10, i11);
        return this;
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k D(long j10) {
        d0(j10);
        return this;
    }

    @Override // bv.l
    public final m E() {
        return e(this.f7365b);
    }

    @Override // bv.l
    public final boolean F(long j10) {
        return this.f7365b >= j10;
    }

    @Override // bv.l
    public final void G(j sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f7365b;
        if (j11 >= j10) {
            sink.write(this, j10);
        } else {
            sink.write(this, j11);
            throw new EOFException();
        }
    }

    public final String H() {
        return z(this.f7365b, Charsets.UTF_8);
    }

    public final int I() {
        int i10;
        int i11;
        int i12;
        if (this.f7365b != 0) {
            byte f10 = f(0L);
            if ((f10 & 128) == 0) {
                i10 = f10 & Byte.MAX_VALUE;
                i12 = 0;
                i11 = 1;
            } else if ((f10 & 224) == 192) {
                i10 = f10 & 31;
                i11 = 2;
                i12 = 128;
            } else if ((f10 & 240) == 224) {
                i10 = f10 & 15;
                i11 = 3;
                i12 = 2048;
            } else if ((f10 & 248) == 240) {
                i10 = f10 & 7;
                i11 = 4;
                i12 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i11;
            if (this.f7365b >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte f11 = f(j11);
                    if ((f11 & 192) == 128) {
                        i10 = (i10 << 6) | (f11 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if ((55296 <= i10 && i10 < 57344) || i10 < i12) {
                    return 65533;
                }
                return i10;
            }
            StringBuilder n10 = a3.a.n("size < ", i11, ": ");
            n10.append(this.f7365b);
            n10.append(" (to read code point prefixed 0x");
            n10.append(b.d(f10));
            n10.append(')');
            throw new EOFException(n10.toString());
        }
        throw new EOFException();
    }

    public final m J(int i10) {
        if (i10 == 0) {
            return m.f7367d;
        }
        b.b(this.f7365b, 0L, i10);
        f0 f0Var = this.f7364a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.c(f0Var);
            int i14 = f0Var.f7345c;
            int i15 = f0Var.f7344b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                f0Var = f0Var.f7348f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        f0 f0Var2 = this.f7364a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.c(f0Var2);
            bArr[i16] = f0Var2.f7343a;
            i11 += f0Var2.f7345c - f0Var2.f7344b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = f0Var2.f7344b;
            f0Var2.f7346d = true;
            i16++;
            f0Var2 = f0Var2.f7348f;
        }
        return new h0(bArr, iArr);
    }

    @Override // bv.l
    public final String K() {
        return w(Long.MAX_VALUE);
    }

    @Override // bv.l
    public final int L() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // bv.l
    public final int M(a0 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int c10 = cv.a.c(this, options, false);
        if (c10 == -1) {
            return -1;
        }
        skip(options.f7320b[c10].d());
        return c10;
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k N(byte[] bArr) {
        U(bArr);
        return this;
    }

    @Override // bv.l
    public final short O() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // bv.l
    public final long P(m targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return l(0L, targetBytes);
    }

    @Override // bv.l
    public final long Q() {
        long readLong = readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    public final f0 R(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            f0 f0Var = this.f7364a;
            if (f0Var == null) {
                f0 b10 = g0.b();
                this.f7364a = b10;
                b10.f7349g = b10;
                b10.f7348f = b10;
                return b10;
            }
            f0 f0Var2 = f0Var.f7349g;
            Intrinsics.c(f0Var2);
            if (f0Var2.f7345c + i10 <= 8192 && f0Var2.f7347e) {
                return f0Var2;
            }
            f0 b11 = g0.b();
            f0Var2.b(b11);
            return b11;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void S(m byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    @Override // bv.l
    public final boolean T(long j10, m bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int d10 = bytes.d();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || d10 < 0 || this.f7365b - j10 < d10 || bytes.d() < d10) {
            return false;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            if (f(i10 + j10) != bytes.i(i10)) {
                return false;
            }
        }
        return true;
    }

    public final void U(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        X(source, 0, source.length);
    }

    @Override // bv.l
    public final long V(k sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.f7365b;
        if (j10 > 0) {
            sink.write(this, j10);
        }
        return j10;
    }

    @Override // bv.l
    public final void W(long j10) {
        if (this.f7365b >= j10) {
        } else {
            throw new EOFException();
        }
    }

    public final void X(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            f0 R = R(1);
            int min = Math.min(i12 - i10, 8192 - R.f7345c);
            int i13 = i10 + min;
            vt.t.d(source, R.f7345c, R.f7343a, i10, i13);
            R.f7345c += min;
            i10 = i13;
        }
        this.f7365b += j10;
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k Y(long j10) {
        c0(j10);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, bv.j] */
    @Override // bv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long Z() {
        /*
            r13 = this;
            long r0 = r13.f7365b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            bv.f0 r6 = r13.f7364a
            kotlin.jvm.internal.Intrinsics.c(r6)
            int r7 = r6.f7344b
            int r8 = r6.f7345c
        L14:
            if (r7 >= r8) goto L79
            byte[] r9 = r6.f7343a
            r9 = r9[r7]
            r10 = 48
            if (r9 < r10) goto L25
            r10 = 57
            if (r9 > r10) goto L25
            int r10 = r9 + (-48)
            goto L3a
        L25:
            r10 = 97
            if (r9 < r10) goto L30
            r10 = 102(0x66, float:1.43E-43)
            if (r9 > r10) goto L30
            int r10 = r9 + (-87)
            goto L3a
        L30:
            r10 = 65
            if (r9 < r10) goto L65
            r10 = 70
            if (r9 > r10) goto L65
            int r10 = r9 + (-55)
        L3a:
            r11 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r11 = r11 & r4
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 != 0) goto L4a
            r9 = 4
            long r4 = r4 << r9
            long r9 = (long) r10
            long r4 = r4 | r9
            int r7 = r7 + 1
            int r0 = r0 + 1
            goto L14
        L4a:
            bv.j r0 = new bv.j
            r0.<init>()
            r0.d0(r4)
            r0.b0(r9)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.H()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = bv.b.d(r9)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L79:
            if (r7 != r8) goto L85
            bv.f0 r7 = r6.a()
            r13.f7364a = r7
            bv.g0.a(r6)
            goto L87
        L85:
            r6.f7344b = r7
        L87:
            if (r1 != 0) goto L8d
            bv.f0 r6 = r13.f7364a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r13.f7365b
            long r6 = (long) r0
            long r1 = r1 - r6
            r13.f7365b = r1
            return r4
        L94:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.j.Z():long");
    }

    public final void a() {
        skip(this.f7365b);
    }

    @Override // bv.l
    public final i a0() {
        return new i(this, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bv.j] */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        ?? obj = new Object();
        if (this.f7365b != 0) {
            f0 f0Var = this.f7364a;
            Intrinsics.c(f0Var);
            f0 c10 = f0Var.c();
            obj.f7364a = c10;
            c10.f7349g = c10;
            c10.f7348f = c10;
            for (f0 f0Var2 = f0Var.f7348f; f0Var2 != f0Var; f0Var2 = f0Var2.f7348f) {
                f0 f0Var3 = c10.f7349g;
                Intrinsics.c(f0Var3);
                Intrinsics.c(f0Var2);
                f0Var3.b(f0Var2.c());
            }
            obj.f7365b = this.f7365b;
        }
        return obj;
    }

    public final void b0(int i10) {
        f0 R = R(1);
        int i11 = R.f7345c;
        R.f7345c = i11 + 1;
        R.f7343a[i11] = (byte) i10;
        this.f7365b++;
    }

    public final long c() {
        long j10 = this.f7365b;
        if (j10 == 0) {
            return 0L;
        }
        f0 f0Var = this.f7364a;
        Intrinsics.c(f0Var);
        f0 f0Var2 = f0Var.f7349g;
        Intrinsics.c(f0Var2);
        if (f0Var2.f7345c < 8192 && f0Var2.f7347e) {
            j10 -= r3 - f0Var2.f7344b;
        }
        return j10;
    }

    public final void c0(long j10) {
        boolean z10;
        byte[] bArr;
        if (j10 == 0) {
            b0(48);
            return;
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                j0("-9223372036854775808");
                return;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 < 100) {
                    if (j10 >= 10) {
                        i10 = 2;
                    }
                } else if (j10 < 1000) {
                    i10 = 3;
                } else {
                    i10 = 4;
                }
            } else if (j10 < 1000000) {
                if (j10 < 100000) {
                    i10 = 5;
                } else {
                    i10 = 6;
                }
            } else if (j10 < 10000000) {
                i10 = 7;
            } else {
                i10 = 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j10 < 1000000000) {
                    i10 = 9;
                } else {
                    i10 = 10;
                }
            } else if (j10 < 100000000000L) {
                i10 = 11;
            } else {
                i10 = 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else if (j10 < 100000000000000L) {
                i10 = 14;
            } else {
                i10 = 15;
            }
        } else if (j10 < 100000000000000000L) {
            if (j10 < 10000000000000000L) {
                i10 = 16;
            } else {
                i10 = 17;
            }
        } else if (j10 < 1000000000000000000L) {
            i10 = 18;
        } else {
            i10 = 19;
        }
        if (z10) {
            i10++;
        }
        f0 R = R(i10);
        int i11 = R.f7345c + i10;
        while (true) {
            bArr = R.f7343a;
            if (j10 == 0) {
                break;
            }
            long j11 = 10;
            i11--;
            bArr[i11] = cv.a.f13079a[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        R.f7345c += i10;
        this.f7365b += i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, bv.i0
    public final void close() {
    }

    public final void d(long j10, j out, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        b.b(this.f7365b, j10, j11);
        if (j11 != 0) {
            out.f7365b += j11;
            f0 f0Var = this.f7364a;
            while (true) {
                Intrinsics.c(f0Var);
                long j12 = f0Var.f7345c - f0Var.f7344b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                f0Var = f0Var.f7348f;
            }
            while (j11 > 0) {
                Intrinsics.c(f0Var);
                f0 c10 = f0Var.c();
                int i10 = c10.f7344b + ((int) j10);
                c10.f7344b = i10;
                c10.f7345c = Math.min(i10 + ((int) j11), c10.f7345c);
                f0 f0Var2 = out.f7364a;
                if (f0Var2 == null) {
                    c10.f7349g = c10;
                    c10.f7348f = c10;
                    out.f7364a = c10;
                } else {
                    f0 f0Var3 = f0Var2.f7349g;
                    Intrinsics.c(f0Var3);
                    f0Var3.b(c10);
                }
                j11 -= c10.f7345c - c10.f7344b;
                f0Var = f0Var.f7348f;
                j10 = 0;
            }
        }
    }

    public final void d0(long j10) {
        if (j10 == 0) {
            b0(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
        f0 R = R(i10);
        int i11 = R.f7345c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            R.f7343a[i12] = cv.a.f13079a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        R.f7345c += i10;
        this.f7365b += i10;
    }

    @Override // bv.l
    public final m e(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.f7365b >= j10) {
                if (j10 >= 4096) {
                    m J = J((int) j10);
                    skip(j10);
                    return J;
                }
                return new m(x(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(nn.d.j("byteCount: ", j10).toString());
    }

    public final void e0(int i10) {
        f0 R = R(4);
        int i11 = R.f7345c;
        byte[] bArr = R.f7343a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        R.f7345c = i11 + 4;
        this.f7365b += 4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                long j10 = this.f7365b;
                j jVar = (j) obj;
                if (j10 == jVar.f7365b) {
                    if (j10 != 0) {
                        f0 f0Var = this.f7364a;
                        Intrinsics.c(f0Var);
                        f0 f0Var2 = jVar.f7364a;
                        Intrinsics.c(f0Var2);
                        int i10 = f0Var.f7344b;
                        int i11 = f0Var2.f7344b;
                        long j11 = 0;
                        while (j11 < this.f7365b) {
                            long min = Math.min(f0Var.f7345c - i10, f0Var2.f7345c - i11);
                            long j12 = 0;
                            while (j12 < min) {
                                int i12 = i10 + 1;
                                byte b10 = f0Var.f7343a[i10];
                                int i13 = i11 + 1;
                                if (b10 == f0Var2.f7343a[i11]) {
                                    j12++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == f0Var.f7345c) {
                                f0 f0Var3 = f0Var.f7348f;
                                Intrinsics.c(f0Var3);
                                i10 = f0Var3.f7344b;
                                f0Var = f0Var3;
                            }
                            if (i11 == f0Var2.f7345c) {
                                f0Var2 = f0Var2.f7348f;
                                Intrinsics.c(f0Var2);
                                i11 = f0Var2.f7344b;
                            }
                            j11 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte f(long j10) {
        b.b(this.f7365b, j10, 1L);
        f0 f0Var = this.f7364a;
        if (f0Var != null) {
            long j11 = this.f7365b;
            if (j11 - j10 < j10) {
                while (j11 > j10) {
                    f0Var = f0Var.f7349g;
                    Intrinsics.c(f0Var);
                    j11 -= f0Var.f7345c - f0Var.f7344b;
                }
                return f0Var.f7343a[(int) ((f0Var.f7344b + j10) - j11)];
            }
            long j12 = 0;
            while (true) {
                int i10 = f0Var.f7345c;
                int i11 = f0Var.f7344b;
                long j13 = (i10 - i11) + j12;
                if (j13 <= j10) {
                    f0Var = f0Var.f7348f;
                    Intrinsics.c(f0Var);
                    j12 = j13;
                } else {
                    return f0Var.f7343a[(int) ((i11 + j10) - j12)];
                }
            }
        } else {
            Intrinsics.c(null);
            throw null;
        }
    }

    public final void f0(long j10) {
        f0 R = R(8);
        int i10 = R.f7345c;
        byte[] bArr = R.f7343a;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        R.f7345c = i10 + 8;
        this.f7365b += 8;
    }

    @Override // bv.k, bv.i0, java.io.Flushable
    public final void flush() {
    }

    public final long g(byte b10, long j10, long j11) {
        f0 f0Var;
        long j12 = 0;
        if (0 <= j10 && j10 <= j11) {
            long j13 = this.f7365b;
            if (j11 > j13) {
                j11 = j13;
            }
            if (j10 == j11 || (f0Var = this.f7364a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    f0Var = f0Var.f7349g;
                    Intrinsics.c(f0Var);
                    j13 -= f0Var.f7345c - f0Var.f7344b;
                }
                while (j13 < j11) {
                    int min = (int) Math.min(f0Var.f7345c, (f0Var.f7344b + j11) - j13);
                    for (int i10 = (int) ((f0Var.f7344b + j10) - j13); i10 < min; i10++) {
                        if (f0Var.f7343a[i10] == b10) {
                            return (i10 - f0Var.f7344b) + j13;
                        }
                    }
                    j13 += f0Var.f7345c - f0Var.f7344b;
                    f0Var = f0Var.f7348f;
                    Intrinsics.c(f0Var);
                    j10 = j13;
                }
                return -1L;
            }
            while (true) {
                long j14 = (f0Var.f7345c - f0Var.f7344b) + j12;
                if (j14 > j10) {
                    break;
                }
                f0Var = f0Var.f7348f;
                Intrinsics.c(f0Var);
                j12 = j14;
            }
            while (j12 < j11) {
                int min2 = (int) Math.min(f0Var.f7345c, (f0Var.f7344b + j11) - j12);
                for (int i11 = (int) ((f0Var.f7344b + j10) - j12); i11 < min2; i11++) {
                    if (f0Var.f7343a[i11] == b10) {
                        return (i11 - f0Var.f7344b) + j12;
                    }
                }
                j12 += f0Var.f7345c - f0Var.f7344b;
                f0Var = f0Var.f7348f;
                Intrinsics.c(f0Var);
                j10 = j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f7365b + " fromIndex=" + j10 + " toIndex=" + j11).toString());
    }

    public final void g0(int i10) {
        f0 R = R(2);
        int i11 = R.f7345c;
        byte[] bArr = R.f7343a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        R.f7345c = i11 + 2;
        this.f7365b += 2;
    }

    @Override // bv.l
    public final j h() {
        return this;
    }

    public final void h0(String string, int i10, int i11, Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= string.length()) {
                    if (Intrinsics.a(charset, Charsets.UTF_8)) {
                        i0(i10, i11, string);
                        return;
                    }
                    String substring = string.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    X(bytes, 0, bytes.length);
                    return;
                }
                StringBuilder n10 = a3.a.n("endIndex > string.length: ", i11, " > ");
                n10.append(string.length());
                throw new IllegalArgumentException(n10.toString().toString());
            }
            throw new IllegalArgumentException(da.e.m("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(jr.h.n("beginIndex < 0: ", i10).toString());
    }

    public final int hashCode() {
        f0 f0Var = this.f7364a;
        if (f0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = f0Var.f7345c;
            for (int i12 = f0Var.f7344b; i12 < i11; i12++) {
                i10 = (i10 * 31) + f0Var.f7343a[i12];
            }
            f0Var = f0Var.f7348f;
            Intrinsics.c(f0Var);
        } while (f0Var != this.f7364a);
        return i10;
    }

    @Override // bv.k
    public final k i() {
        return this;
    }

    public final void i0(int i10, int i11, String string) {
        char charAt;
        char c10;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 >= 0) {
            if (i11 >= i10) {
                if (i11 <= string.length()) {
                    while (i10 < i11) {
                        char charAt2 = string.charAt(i10);
                        if (charAt2 < 128) {
                            f0 R = R(1);
                            int i12 = R.f7345c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = R.f7343a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = R.f7345c;
                            int i15 = (i12 + i10) - i14;
                            R.f7345c = i14 + i15;
                            this.f7365b += i15;
                        } else {
                            if (charAt2 < 2048) {
                                f0 R2 = R(2);
                                int i16 = R2.f7345c;
                                byte[] bArr2 = R2.f7343a;
                                bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                R2.f7345c = i16 + 2;
                                this.f7365b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c10 = string.charAt(i17);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c10 && c10 < 57344) {
                                    int i18 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + 65536;
                                    f0 R3 = R(4);
                                    int i19 = R3.f7345c;
                                    byte[] bArr3 = R3.f7343a;
                                    bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                    bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                    bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                    bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                    R3.f7345c = i19 + 4;
                                    this.f7365b += 4;
                                    i10 += 2;
                                } else {
                                    b0(63);
                                    i10 = i17;
                                }
                            } else {
                                f0 R4 = R(3);
                                int i20 = R4.f7345c;
                                byte[] bArr4 = R4.f7343a;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                R4.f7345c = i20 + 3;
                                this.f7365b += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder n10 = a3.a.n("endIndex > string.length: ", i11, " > ");
                n10.append(string.length());
                throw new IllegalArgumentException(n10.toString().toString());
            }
            throw new IllegalArgumentException(da.e.m("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(jr.h.n("beginIndex < 0: ", i10).toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j(long j10, m bytes) {
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.d() > 0) {
            long j12 = 0;
            if (j11 >= 0) {
                f0 f0Var = this.f7364a;
                if (f0Var != null) {
                    long j13 = this.f7365b;
                    if (j13 - j11 < j11) {
                        while (j13 > j11) {
                            f0Var = f0Var.f7349g;
                            Intrinsics.c(f0Var);
                            j13 -= f0Var.f7345c - f0Var.f7344b;
                        }
                        byte[] h10 = bytes.h();
                        byte b10 = h10[0];
                        int d10 = bytes.d();
                        long j14 = (this.f7365b - d10) + 1;
                        while (j13 < j14) {
                            int min = (int) Math.min(f0Var.f7345c, (f0Var.f7344b + j14) - j13);
                            for (int i10 = (int) ((f0Var.f7344b + j11) - j13); i10 < min; i10++) {
                                if (f0Var.f7343a[i10] == b10 && cv.a.a(f0Var, i10 + 1, h10, d10)) {
                                    return (i10 - f0Var.f7344b) + j13;
                                }
                            }
                            j13 += f0Var.f7345c - f0Var.f7344b;
                            f0Var = f0Var.f7348f;
                            Intrinsics.c(f0Var);
                            j11 = j13;
                        }
                    } else {
                        while (true) {
                            long j15 = (f0Var.f7345c - f0Var.f7344b) + j12;
                            if (j15 > j11) {
                                break;
                            }
                            f0Var = f0Var.f7348f;
                            Intrinsics.c(f0Var);
                            j12 = j15;
                        }
                        byte[] h11 = bytes.h();
                        byte b11 = h11[0];
                        int d11 = bytes.d();
                        long j16 = (this.f7365b - d11) + 1;
                        while (j12 < j16) {
                            int min2 = (int) Math.min(f0Var.f7345c, (f0Var.f7344b + j16) - j12);
                            for (int i11 = (int) ((f0Var.f7344b + j11) - j12); i11 < min2; i11++) {
                                if (f0Var.f7343a[i11] == b11 && cv.a.a(f0Var, i11 + 1, h11, d11)) {
                                    return (i11 - f0Var.f7344b) + j12;
                                }
                            }
                            j12 += f0Var.f7345c - f0Var.f7344b;
                            f0Var = f0Var.f7348f;
                            Intrinsics.c(f0Var);
                            j11 = j12;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(nn.d.j("fromIndex < 0: ", j11).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final void j0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        i0(0, string.length(), string);
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k k(int i10) {
        g0(i10);
        return this;
    }

    public final void k0(int i10) {
        if (i10 < 128) {
            b0(i10);
            return;
        }
        if (i10 < 2048) {
            f0 R = R(2);
            int i11 = R.f7345c;
            byte[] bArr = R.f7343a;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            R.f7345c = i11 + 2;
            this.f7365b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            b0(63);
            return;
        }
        if (i10 < 65536) {
            f0 R2 = R(3);
            int i12 = R2.f7345c;
            byte[] bArr2 = R2.f7343a;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            R2.f7345c = i12 + 3;
            this.f7365b += 3;
            return;
        }
        if (i10 <= 1114111) {
            f0 R3 = R(4);
            int i13 = R3.f7345c;
            byte[] bArr3 = R3.f7343a;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            R3.f7345c = i13 + 4;
            this.f7365b += 4;
            return;
        }
        throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.e(i10)));
    }

    public final long l(long j10, m targetBytes) {
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j11 = 0;
        if (j10 >= 0) {
            f0 f0Var = this.f7364a;
            if (f0Var == null) {
                return -1L;
            }
            long j12 = this.f7365b;
            if (j12 - j10 < j10) {
                while (j12 > j10) {
                    f0Var = f0Var.f7349g;
                    Intrinsics.c(f0Var);
                    j12 -= f0Var.f7345c - f0Var.f7344b;
                }
                if (targetBytes.d() == 2) {
                    byte i14 = targetBytes.i(0);
                    byte i15 = targetBytes.i(1);
                    while (j12 < this.f7365b) {
                        i12 = (int) ((f0Var.f7344b + j10) - j12);
                        int i16 = f0Var.f7345c;
                        while (i12 < i16) {
                            byte b10 = f0Var.f7343a[i12];
                            if (b10 != i14 && b10 != i15) {
                                i12++;
                            } else {
                                i13 = f0Var.f7344b;
                            }
                        }
                        j12 += f0Var.f7345c - f0Var.f7344b;
                        f0Var = f0Var.f7348f;
                        Intrinsics.c(f0Var);
                        j10 = j12;
                    }
                    return -1L;
                }
                byte[] h10 = targetBytes.h();
                while (j12 < this.f7365b) {
                    i12 = (int) ((f0Var.f7344b + j10) - j12);
                    int i17 = f0Var.f7345c;
                    while (i12 < i17) {
                        byte b11 = f0Var.f7343a[i12];
                        for (byte b12 : h10) {
                            if (b11 == b12) {
                                i13 = f0Var.f7344b;
                            }
                        }
                        i12++;
                    }
                    j12 += f0Var.f7345c - f0Var.f7344b;
                    f0Var = f0Var.f7348f;
                    Intrinsics.c(f0Var);
                    j10 = j12;
                }
                return -1L;
                return (i12 - i13) + j12;
            }
            while (true) {
                long j13 = (f0Var.f7345c - f0Var.f7344b) + j11;
                if (j13 > j10) {
                    break;
                }
                f0Var = f0Var.f7348f;
                Intrinsics.c(f0Var);
                j11 = j13;
            }
            if (targetBytes.d() == 2) {
                byte i18 = targetBytes.i(0);
                byte i19 = targetBytes.i(1);
                while (j11 < this.f7365b) {
                    i10 = (int) ((f0Var.f7344b + j10) - j11);
                    int i20 = f0Var.f7345c;
                    while (i10 < i20) {
                        byte b13 = f0Var.f7343a[i10];
                        if (b13 != i18 && b13 != i19) {
                            i10++;
                        } else {
                            i11 = f0Var.f7344b;
                        }
                    }
                    j11 += f0Var.f7345c - f0Var.f7344b;
                    f0Var = f0Var.f7348f;
                    Intrinsics.c(f0Var);
                    j10 = j11;
                }
                return -1L;
            }
            byte[] h11 = targetBytes.h();
            while (j11 < this.f7365b) {
                i10 = (int) ((f0Var.f7344b + j10) - j11);
                int i21 = f0Var.f7345c;
                while (i10 < i21) {
                    byte b14 = f0Var.f7343a[i10];
                    for (byte b15 : h11) {
                        if (b14 == b15) {
                            i11 = f0Var.f7344b;
                        }
                    }
                    i10++;
                }
                j11 += f0Var.f7345c - f0Var.f7344b;
                f0Var = f0Var.f7348f;
                Intrinsics.c(f0Var);
                j10 = j11;
            }
            return -1L;
            return (i10 - i11) + j11;
        }
        throw new IllegalArgumentException(nn.d.j("fromIndex < 0: ", j10).toString());
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k m(int i10) {
        e0(i10);
        return this;
    }

    public final h n(h unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        byte[] bArr = cv.a.f13079a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        if (unsafeCursor == b.f7322a) {
            unsafeCursor = new h();
        }
        if (unsafeCursor.f7353a == null) {
            unsafeCursor.f7353a = this;
            unsafeCursor.f7354b = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // bv.l
    public final byte[] o() {
        return x(this.f7365b);
    }

    @Override // bv.l
    public final boolean p() {
        return this.f7365b == 0;
    }

    @Override // bv.l
    public final e0 peek() {
        return hl.f.v(new c0(this));
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k q(m mVar) {
        S(mVar);
        return this;
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k r(int i10) {
        b0(i10);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        f0 f0Var = this.f7364a;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), f0Var.f7345c - f0Var.f7344b);
        sink.put(f0Var.f7343a, f0Var.f7344b, min);
        int i10 = f0Var.f7344b + min;
        f0Var.f7344b = i10;
        this.f7365b -= min;
        if (i10 == f0Var.f7345c) {
            this.f7364a = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }

    @Override // bv.l
    public final byte readByte() {
        if (this.f7365b != 0) {
            f0 f0Var = this.f7364a;
            Intrinsics.c(f0Var);
            int i10 = f0Var.f7344b;
            int i11 = f0Var.f7345c;
            int i12 = i10 + 1;
            byte b10 = f0Var.f7343a[i10];
            this.f7365b--;
            if (i12 == i11) {
                this.f7364a = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f7344b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // bv.l
    public final void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int read = read(sink, i10, sink.length - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // bv.l
    public final int readInt() {
        if (this.f7365b >= 4) {
            f0 f0Var = this.f7364a;
            Intrinsics.c(f0Var);
            int i10 = f0Var.f7344b;
            int i11 = f0Var.f7345c;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = f0Var.f7343a;
            int i12 = i10 + 3;
            int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
            int i14 = i10 + 4;
            int i15 = i13 | (bArr[i12] & 255);
            this.f7365b -= 4;
            if (i14 == i11) {
                this.f7364a = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f7344b = i14;
            }
            return i15;
        }
        throw new EOFException();
    }

    @Override // bv.l
    public final long readLong() {
        if (this.f7365b >= 8) {
            f0 f0Var = this.f7364a;
            Intrinsics.c(f0Var);
            int i10 = f0Var.f7344b;
            int i11 = f0Var.f7345c;
            if (i11 - i10 < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = f0Var.f7343a;
            int i12 = i10 + 7;
            long j10 = ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j11 = j10 | (bArr[i12] & 255);
            this.f7365b -= 8;
            if (i13 == i11) {
                this.f7364a = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f7344b = i13;
            }
            return j11;
        }
        throw new EOFException();
    }

    @Override // bv.l
    public final short readShort() {
        if (this.f7365b >= 2) {
            f0 f0Var = this.f7364a;
            Intrinsics.c(f0Var);
            int i10 = f0Var.f7344b;
            int i11 = f0Var.f7345c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i12 = i10 + 1;
            byte[] bArr = f0Var.f7343a;
            int i13 = (bArr[i10] & 255) << 8;
            int i14 = i10 + 2;
            int i15 = (bArr[i12] & 255) | i13;
            this.f7365b -= 2;
            if (i14 == i11) {
                this.f7364a = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f7344b = i14;
            }
            return (short) i15;
        }
        throw new EOFException();
    }

    @Override // bv.k
    public final long s(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j10 += read;
            } else {
                return j10;
            }
        }
    }

    @Override // bv.l
    public final void skip(long j10) {
        while (j10 > 0) {
            f0 f0Var = this.f7364a;
            if (f0Var != null) {
                int min = (int) Math.min(j10, f0Var.f7345c - f0Var.f7344b);
                long j11 = min;
                this.f7365b -= j11;
                j10 -= j11;
                int i10 = f0Var.f7344b + min;
                f0Var.f7344b = i10;
                if (i10 == f0Var.f7345c) {
                    this.f7364a = f0Var.a();
                    g0.a(f0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // bv.k
    public final k t() {
        return this;
    }

    @Override // bv.k0
    public final n0 timeout() {
        return n0.NONE;
    }

    public final String toString() {
        long j10 = this.f7365b;
        if (j10 <= 2147483647L) {
            return J((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7365b).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        r1 = new java.lang.Object();
        r1.c0(r8);
        r1.b0(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.H()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, bv.j] */
    @Override // bv.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long u() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bv.j.u():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, bv.j] */
    @Override // bv.l
    public final String w(long j10) {
        if (j10 >= 0) {
            long j11 = Long.MAX_VALUE;
            if (j10 != Long.MAX_VALUE) {
                j11 = j10 + 1;
            }
            long g10 = g((byte) 10, 0L, j11);
            if (g10 != -1) {
                return cv.a.b(this, g10);
            }
            if (j11 < this.f7365b && f(j11 - 1) == 13 && f(j11) == 10) {
                return cv.a.b(this, j11);
            }
            ?? obj = new Object();
            d(0L, obj, Math.min(32, this.f7365b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f7365b, j10) + " content=" + obj.e(obj.f7365b).e() + (char) 8230);
        }
        throw new IllegalArgumentException(nn.d.j("limit < 0: ", j10).toString());
    }

    @Override // bv.i0
    public final void write(j source, long j10) {
        f0 b10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            b.b(source.f7365b, 0L, j10);
            while (j10 > 0) {
                f0 f0Var = source.f7364a;
                Intrinsics.c(f0Var);
                int i10 = f0Var.f7345c;
                f0 f0Var2 = source.f7364a;
                Intrinsics.c(f0Var2);
                long j11 = i10 - f0Var2.f7344b;
                int i11 = 0;
                if (j10 < j11) {
                    f0 f0Var3 = this.f7364a;
                    f0 f0Var4 = f0Var3 != null ? f0Var3.f7349g : null;
                    if (f0Var4 != null && f0Var4.f7347e) {
                        if ((f0Var4.f7345c + j10) - (f0Var4.f7346d ? 0 : f0Var4.f7344b) <= 8192) {
                            f0 f0Var5 = source.f7364a;
                            Intrinsics.c(f0Var5);
                            f0Var5.d(f0Var4, (int) j10);
                            source.f7365b -= j10;
                            this.f7365b += j10;
                            return;
                        }
                    }
                    f0 f0Var6 = source.f7364a;
                    Intrinsics.c(f0Var6);
                    int i12 = (int) j10;
                    if (i12 > 0 && i12 <= f0Var6.f7345c - f0Var6.f7344b) {
                        if (i12 >= 1024) {
                            b10 = f0Var6.c();
                        } else {
                            b10 = g0.b();
                            int i13 = f0Var6.f7344b;
                            vt.t.d(f0Var6.f7343a, 0, b10.f7343a, i13, i13 + i12);
                        }
                        b10.f7345c = b10.f7344b + i12;
                        f0Var6.f7344b += i12;
                        f0 f0Var7 = f0Var6.f7349g;
                        Intrinsics.c(f0Var7);
                        f0Var7.b(b10);
                        source.f7364a = b10;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                f0 f0Var8 = source.f7364a;
                Intrinsics.c(f0Var8);
                long j12 = f0Var8.f7345c - f0Var8.f7344b;
                source.f7364a = f0Var8.a();
                f0 f0Var9 = this.f7364a;
                if (f0Var9 == null) {
                    this.f7364a = f0Var8;
                    f0Var8.f7349g = f0Var8;
                    f0Var8.f7348f = f0Var8;
                } else {
                    f0 f0Var10 = f0Var9.f7349g;
                    Intrinsics.c(f0Var10);
                    f0Var10.b(f0Var8);
                    f0 f0Var11 = f0Var8.f7349g;
                    if (f0Var11 != f0Var8) {
                        Intrinsics.c(f0Var11);
                        if (f0Var11.f7347e) {
                            int i14 = f0Var8.f7345c - f0Var8.f7344b;
                            f0 f0Var12 = f0Var8.f7349g;
                            Intrinsics.c(f0Var12);
                            int i15 = 8192 - f0Var12.f7345c;
                            f0 f0Var13 = f0Var8.f7349g;
                            Intrinsics.c(f0Var13);
                            if (!f0Var13.f7346d) {
                                f0 f0Var14 = f0Var8.f7349g;
                                Intrinsics.c(f0Var14);
                                i11 = f0Var14.f7344b;
                            }
                            if (i14 <= i15 + i11) {
                                f0 f0Var15 = f0Var8.f7349g;
                                Intrinsics.c(f0Var15);
                                f0Var8.d(f0Var15, i14);
                                f0Var8.a();
                                g0.a(f0Var8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f7365b -= j12;
                this.f7365b += j12;
                j10 -= j12;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final byte[] x(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.f7365b >= j10) {
                byte[] bArr = new byte[(int) j10];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(nn.d.j("byteCount: ", j10).toString());
    }

    @Override // bv.k
    public final /* bridge */ /* synthetic */ k y(String str) {
        j0(str);
        return this;
    }

    public final String z(long j10, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 >= 0 && j10 <= 2147483647L) {
            if (this.f7365b >= j10) {
                if (j10 == 0) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                f0 f0Var = this.f7364a;
                Intrinsics.c(f0Var);
                int i10 = f0Var.f7344b;
                if (i10 + j10 > f0Var.f7345c) {
                    return new String(x(j10), charset);
                }
                int i11 = (int) j10;
                String str = new String(f0Var.f7343a, i10, i11, charset);
                int i12 = f0Var.f7344b + i11;
                f0Var.f7344b = i12;
                this.f7365b -= j10;
                if (i12 == f0Var.f7345c) {
                    this.f7364a = f0Var.a();
                    g0.a(f0Var);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(nn.d.j("byteCount: ", j10).toString());
    }

    public final int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b.b(sink.length, i10, i11);
        f0 f0Var = this.f7364a;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(i11, f0Var.f7345c - f0Var.f7344b);
        int i12 = f0Var.f7344b;
        vt.t.d(f0Var.f7343a, i10, sink, i12, i12 + min);
        int i13 = f0Var.f7344b + min;
        f0Var.f7344b = i13;
        this.f7365b -= min;
        if (i13 == f0Var.f7345c) {
            this.f7364a = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }

    @Override // bv.k0
    public final long read(j sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(nn.d.j("byteCount < 0: ", j10).toString());
        }
        long j11 = this.f7365b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.write(this, j10);
        return j10;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            f0 R = R(1);
            int min = Math.min(i10, 8192 - R.f7345c);
            source.get(R.f7343a, R.f7345c, min);
            i10 -= min;
            R.f7345c += min;
        }
        this.f7365b += remaining;
        return remaining;
    }
}
