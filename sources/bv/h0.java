package bv;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h0 extends m {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f7360e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f7361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(byte[][] segments, int[] directory) {
        super(m.f7367d.f7368a);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f7360e = segments;
        this.f7361f = directory;
    }

    private final Object writeReplace() {
        return t();
    }

    @Override // bv.m
    public final String a() {
        return t().a();
    }

    @Override // bv.m
    public final m c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f7360e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f7361f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(bArr[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        Intrinsics.c(digest);
        return new m(digest);
    }

    @Override // bv.m
    public final int d() {
        return this.f7361f[this.f7360e.length - 1];
    }

    @Override // bv.m
    public final String e() {
        return t().e();
    }

    @Override // bv.m
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (mVar.d() == d() && l(0, mVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // bv.m
    public final int f(int i10, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().f(i10, other);
    }

    @Override // bv.m
    public final byte[] h() {
        return s();
    }

    @Override // bv.m
    public final int hashCode() {
        int i10 = this.f7369b;
        if (i10 == 0) {
            byte[][] bArr = this.f7360e;
            int length = bArr.length;
            int i11 = 0;
            int i12 = 1;
            int i13 = 0;
            while (i11 < length) {
                int[] iArr = this.f7361f;
                int i14 = iArr[length + i11];
                int i15 = iArr[i11];
                byte[] bArr2 = bArr[i11];
                int i16 = (i15 - i13) + i14;
                while (i14 < i16) {
                    i12 = (i12 * 31) + bArr2[i14];
                    i14++;
                }
                i11++;
                i13 = i15;
            }
            this.f7369b = i12;
            return i12;
        }
        return i10;
    }

    @Override // bv.m
    public final byte i(int i10) {
        int i11;
        byte[][] bArr = this.f7360e;
        int length = bArr.length - 1;
        int[] iArr = this.f7361f;
        b.b(iArr[length], i10, 1L);
        int K0 = el.l.K0(this, i10);
        if (K0 == 0) {
            i11 = 0;
        } else {
            i11 = iArr[K0 - 1];
        }
        return bArr[K0][(i10 - i11) + iArr[bArr.length + K0]];
    }

    @Override // bv.m
    public final int j(int i10, byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return t().j(i10, other);
    }

    @Override // bv.m
    public final boolean l(int i10, m other, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > d() - i11) {
            return false;
        }
        int i13 = i11 + i10;
        int K0 = el.l.K0(this, i10);
        int i14 = 0;
        while (i10 < i13) {
            int[] iArr = this.f7361f;
            if (K0 == 0) {
                i12 = 0;
            } else {
                i12 = iArr[K0 - 1];
            }
            int i15 = iArr[K0] - i12;
            byte[][] bArr = this.f7360e;
            int i16 = iArr[bArr.length + K0];
            int min = Math.min(i13, i15 + i12) - i10;
            if (!other.m(i14, bArr[K0], (i10 - i12) + i16, min)) {
                return false;
            }
            i14 += min;
            i10 += min;
            K0++;
        }
        return true;
    }

    @Override // bv.m
    public final boolean m(int i10, byte[] other, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > d() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int K0 = el.l.K0(this, i10);
        while (i10 < i14) {
            int[] iArr = this.f7361f;
            if (K0 == 0) {
                i13 = 0;
            } else {
                i13 = iArr[K0 - 1];
            }
            int i15 = iArr[K0] - i13;
            byte[][] bArr = this.f7360e;
            int i16 = iArr[bArr.length + K0];
            int min = Math.min(i14, i15 + i13) - i10;
            if (!b.a(bArr[K0], (i10 - i13) + i16, other, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            K0++;
        }
        return true;
    }

    @Override // bv.m
    public final m n(int i10, int i11) {
        int c10 = b.c(this, i11);
        if (i10 >= 0) {
            if (c10 <= d()) {
                int i12 = c10 - i10;
                if (i12 >= 0) {
                    if (i10 == 0 && c10 == d()) {
                        return this;
                    }
                    if (i10 == c10) {
                        return m.f7367d;
                    }
                    int K0 = el.l.K0(this, i10);
                    int K02 = el.l.K0(this, c10 - 1);
                    byte[][] bArr = this.f7360e;
                    byte[][] bArr2 = (byte[][]) vt.t.j(K0, K02 + 1, bArr);
                    int[] iArr = new int[bArr2.length * 2];
                    int i13 = 0;
                    int[] iArr2 = this.f7361f;
                    if (K0 <= K02) {
                        int i14 = K0;
                        int i15 = 0;
                        while (true) {
                            iArr[i15] = Math.min(iArr2[i14] - i10, i12);
                            int i16 = i15 + 1;
                            iArr[i15 + bArr2.length] = iArr2[bArr.length + i14];
                            if (i14 == K02) {
                                break;
                            }
                            i14++;
                            i15 = i16;
                        }
                    }
                    if (K0 != 0) {
                        i13 = iArr2[K0 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i10 - i13) + iArr[length];
                    return new h0(bArr2, iArr);
                }
                throw new IllegalArgumentException(da.e.m("endIndex=", c10, " < beginIndex=", i10).toString());
            }
            StringBuilder n10 = a3.a.n("endIndex=", c10, " > length(");
            n10.append(d());
            n10.append(')');
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(jr.h.o("beginIndex=", i10, " < 0").toString());
    }

    @Override // bv.m
    public final m p() {
        return t().p();
    }

    @Override // bv.m
    public final void r(j buffer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int K0 = el.l.K0(this, 0);
        int i12 = 0;
        while (i12 < i10) {
            int[] iArr = this.f7361f;
            if (K0 == 0) {
                i11 = 0;
            } else {
                i11 = iArr[K0 - 1];
            }
            int i13 = iArr[K0] - i11;
            byte[][] bArr = this.f7360e;
            int i14 = iArr[bArr.length + K0];
            int min = Math.min(i10, i13 + i11) - i12;
            int i15 = (i12 - i11) + i14;
            f0 f0Var = new f0(bArr[K0], i15, i15 + min, true, false);
            f0 f0Var2 = buffer.f7364a;
            if (f0Var2 == null) {
                f0Var.f7349g = f0Var;
                f0Var.f7348f = f0Var;
                buffer.f7364a = f0Var;
            } else {
                f0 f0Var3 = f0Var2.f7349g;
                Intrinsics.c(f0Var3);
                f0Var3.b(f0Var);
            }
            i12 += min;
            K0++;
        }
        buffer.f7365b += i10;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f7360e;
        int length = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f7361f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            vt.t.d(bArr2[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public final m t() {
        return new m(s());
    }

    @Override // bv.m
    public final String toString() {
        return t().toString();
    }
}
