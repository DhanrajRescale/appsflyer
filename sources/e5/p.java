package e5;

import java.nio.charset.Charset;
import java.util.Arrays;
import lp.v0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f15033d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f15034e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f15035f = v0.p(5, kp.e.f23431a, kp.e.f23433c, kp.e.f23436f, kp.e.f23434d, kp.e.f23435e);

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15036a;

    /* renamed from: b, reason: collision with root package name */
    public int f15037b;

    /* renamed from: c, reason: collision with root package name */
    public int f15038c;

    public p() {
        this.f15036a = x.f15055f;
    }

    public final long A() {
        int i10;
        int i11;
        long j10 = this.f15036a[this.f15037b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.f15036a[this.f15037b + i10] & 192) == 128) {
                    j10 = (j10 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(nn.d.j("Invalid UTF-8 sequence continuation byte: ", j10));
                }
            }
            this.f15037b += i11;
            return j10;
        }
        throw new NumberFormatException(nn.d.j("Invalid UTF-8 sequence first byte: ", j10));
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f15036a;
            int i10 = this.f15037b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f15037b = i10 + 3;
                return kp.e.f23433c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f15036a;
            int i11 = this.f15037b;
            byte b10 = bArr2[i11];
            if (b10 == -2 && bArr2[i11 + 1] == -1) {
                this.f15037b = i11 + 2;
                return kp.e.f23434d;
            }
            if (b10 == -1 && bArr2[i11 + 1] == -2) {
                this.f15037b = i11 + 2;
                return kp.e.f23435e;
            }
            return null;
        }
        return null;
    }

    public final void C(int i10) {
        byte[] bArr = this.f15036a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        D(i10, bArr);
    }

    public final void D(int i10, byte[] bArr) {
        this.f15036a = bArr;
        this.f15038c = i10;
        this.f15037b = 0;
    }

    public final void E(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f15036a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.f15038c = i10;
    }

    public final void F(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f15038c) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.E0(z10);
        this.f15037b = i10;
    }

    public final void G(int i10) {
        F(this.f15037b + i10);
    }

    public final int a() {
        return this.f15038c - this.f15037b;
    }

    public final void b(int i10) {
        byte[] bArr = this.f15036a;
        if (i10 > bArr.length) {
            this.f15036a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char c(Charset charset) {
        yk.j.F0(f15035f.contains(charset), "Unsupported charset: " + charset);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z10;
        byte b10;
        int i10;
        byte b11;
        byte b12;
        boolean z11 = false;
        if ((charset.equals(kp.e.f23433c) || charset.equals(kp.e.f23431a)) && a() >= 1) {
            long j10 = this.f15036a[this.f15037b] & 255;
            char c10 = (char) j10;
            if (c10 == j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            dp.b.R0(j10, z10, "Out of range: %s");
            b10 = (byte) c10;
            i10 = 1;
        } else {
            i10 = 2;
            if ((charset.equals(kp.e.f23436f) || charset.equals(kp.e.f23434d)) && a() >= 2) {
                byte[] bArr = this.f15036a;
                int i11 = this.f15037b;
                b11 = bArr[i11];
                b12 = bArr[i11 + 1];
            } else {
                if (!charset.equals(kp.e.f23435e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f15036a;
                int i12 = this.f15037b;
                b11 = bArr2[i12 + 1];
                b12 = bArr2[i12];
            }
            b10 = (byte) ((char) ((b12 & 255) | (b11 << 8)));
        }
        long j11 = b10;
        char c11 = (char) j11;
        if (c11 == j11) {
            z11 = true;
        }
        dp.b.R0(j11, z11, "Out of range: %s");
        return (c11 << 16) + i10;
    }

    public final void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f15036a, this.f15037b, bArr, i10, i11);
        this.f15037b += i11;
    }

    public final char f(Charset charset, char[] cArr) {
        int d10 = d(charset);
        if (d10 != 0) {
            char c10 = (char) (d10 >> 16);
            for (char c11 : cArr) {
                if (c11 == c10) {
                    this.f15037b += d10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    return c10;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f15037b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final String h(Charset charset) {
        int i10;
        yk.j.F0(f15035f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = kp.e.f23431a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (!charset.equals(kp.e.f23433c) && !charset.equals(charset2)) {
            if (!charset.equals(kp.e.f23436f) && !charset.equals(kp.e.f23435e) && !charset.equals(kp.e.f23434d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f15037b;
        while (true) {
            int i12 = this.f15038c;
            if (i11 < i12 - (i10 - 1)) {
                if (charset.equals(kp.e.f23433c) || charset.equals(kp.e.f23431a)) {
                    byte b10 = this.f15036a[i11];
                    int i13 = x.f15050a;
                    if (b10 != 10) {
                        if (b10 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (charset.equals(kp.e.f23436f) || charset.equals(kp.e.f23434d)) {
                    byte[] bArr = this.f15036a;
                    if (bArr[i11] == 0) {
                        byte b11 = bArr[i11 + 1];
                        int i14 = x.f15050a;
                        if (b11 != 10) {
                            if (b11 == 13) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (charset.equals(kp.e.f23435e)) {
                    byte[] bArr2 = this.f15036a;
                    if (bArr2[i11 + 1] == 0) {
                        byte b12 = bArr2[i11];
                        int i15 = x.f15050a;
                        if (b12 == 10 || b12 == 13) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String s7 = s(i11 - this.f15037b, charset);
        if (this.f15037b == this.f15038c) {
            return s7;
        }
        if (f(charset, f15033d) == '\r') {
            f(charset, f15034e);
        }
        return s7;
    }

    public final int i() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 16);
        this.f15037b = i10 + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public final long j() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 7;
        long j10 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        this.f15037b = i10 + 8;
        return ((bArr[i11] & 255) << 56) | j10;
    }

    public final short k() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f15037b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public final long l() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 3;
        long j10 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        this.f15037b = i10 + 4;
        return ((bArr[i11] & 255) << 24) | j10;
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(jr.h.n("Top bit not zero: ", i10));
    }

    public final int n() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f15037b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 7;
        long j10 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
        this.f15037b = i10 + 8;
        return (bArr[i11] & 255) | j10;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f15037b;
        while (i10 < this.f15038c && this.f15036a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f15036a;
        int i11 = this.f15037b;
        int i12 = x.f15050a;
        String str = new String(bArr, i11, i10 - i11, kp.e.f23433c);
        this.f15037b = i10;
        if (i10 < this.f15038c) {
            this.f15037b = i10 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        int i11;
        if (i10 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i12 = this.f15037b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f15038c && this.f15036a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.f15036a;
        int i14 = x.f15050a;
        String str = new String(bArr, i12, i11, kp.e.f23433c);
        this.f15037b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f15037b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public final String s(int i10, Charset charset) {
        String str = new String(this.f15036a, this.f15037b, i10, charset);
        this.f15037b += i10;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        this.f15037b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final long v() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 3;
        long j10 = ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
        this.f15037b = i10 + 4;
        return (bArr[i11] & 255) | j10;
    }

    public final int w() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
        this.f15037b = i10 + 3;
        return (bArr[i11] & 255) | i12;
    }

    public final int x() {
        int g10 = g();
        if (g10 >= 0) {
            return g10;
        }
        throw new IllegalStateException(jr.h.n("Top bit not zero: ", g10));
    }

    public final long y() {
        long o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(nn.d.j("Top bit not zero: ", o10));
    }

    public final int z() {
        byte[] bArr = this.f15036a;
        int i10 = this.f15037b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f15037b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public p(int i10) {
        this.f15036a = new byte[i10];
        this.f15038c = i10;
    }

    public p(byte[] bArr) {
        this.f15036a = bArr;
        this.f15038c = bArr.length;
    }

    public p(byte[] bArr, int i10) {
        this.f15036a = bArr;
        this.f15038c = i10;
    }
}
