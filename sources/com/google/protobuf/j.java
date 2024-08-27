package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class j extends e1 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f11929g = Logger.getLogger(j.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f11930h = r1.f11983e;

    /* renamed from: c, reason: collision with root package name */
    public ek.h0 f11931c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11933e;

    /* renamed from: f, reason: collision with root package name */
    public int f11934f;

    public j(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) >= 0) {
            this.f11932d = bArr;
            this.f11934f = 0;
            this.f11933e = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
    }

    public static int b(int i10) {
        return s(i10) + 1;
    }

    public static int c(int i10, h hVar) {
        int s7 = s(i10);
        int size = hVar.size();
        return u(size) + size + s7;
    }

    public static int d(int i10) {
        return s(i10) + 8;
    }

    public static int e(int i10, int i11) {
        return k(i11) + s(i10);
    }

    public static int f(int i10) {
        return s(i10) + 4;
    }

    public static int g(int i10) {
        return s(i10) + 8;
    }

    public static int h(int i10) {
        return s(i10) + 4;
    }

    public static int i(int i10, b bVar, z0 z0Var) {
        return bVar.h(z0Var) + (s(i10) * 2);
    }

    public static int j(int i10, int i11) {
        return k(i11) + s(i10);
    }

    public static int k(int i10) {
        if (i10 >= 0) {
            return u(i10);
        }
        return 10;
    }

    public static int l(int i10, long j10) {
        return w(j10) + s(i10);
    }

    public static int m(int i10) {
        return s(i10) + 4;
    }

    public static int n(int i10) {
        return s(i10) + 8;
    }

    public static int o(int i10, int i11) {
        return u((i11 >> 31) ^ (i11 << 1)) + s(i10);
    }

    public static int p(int i10, long j10) {
        return w((j10 >> 63) ^ (j10 << 1)) + s(i10);
    }

    public static int q(int i10, String str) {
        return r(str) + s(i10);
    }

    public static int r(String str) {
        int length;
        try {
            length = u1.b(str);
        } catch (t1 unused) {
            length = str.getBytes(z.f12003a).length;
        }
        return u(length) + length;
    }

    public static int s(int i10) {
        return u(i10 << 3);
    }

    public static int t(int i10, int i11) {
        return u(i11) + s(i10);
    }

    public static int u(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int v(int i10, long j10) {
        return w(j10) + s(i10);
    }

    public static int w(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void A(int i10, int i11) {
        G(i10, 5);
        B(i11);
    }

    public final void B(int i10) {
        try {
            byte[] bArr = this.f11932d;
            int i11 = this.f11934f;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f11934f = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), 1), e10);
        }
    }

    public final void C(int i10, long j10) {
        G(i10, 1);
        D(j10);
    }

    public final void D(long j10) {
        try {
            byte[] bArr = this.f11932d;
            int i10 = this.f11934f;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.f11934f = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), 1), e10);
        }
    }

    public final void E(int i10) {
        if (i10 >= 0) {
            H(i10);
        } else {
            J(i10);
        }
    }

    public final void F(String str) {
        int i10 = this.f11934f;
        try {
            int u10 = u(str.length() * 3);
            int u11 = u(str.length());
            int i11 = this.f11933e;
            byte[] bArr = this.f11932d;
            if (u11 == u10) {
                int i12 = i10 + u11;
                this.f11934f = i12;
                int b10 = u1.f11992a.b(str, bArr, i12, i11 - i12);
                this.f11934f = i10;
                H((b10 - i10) - u11);
                this.f11934f = b10;
            } else {
                H(u1.b(str));
                int i13 = this.f11934f;
                this.f11934f = u1.f11992a.b(str, bArr, i13, i11 - i13);
            }
        } catch (t1 e10) {
            this.f11934f = i10;
            f11929g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(z.f12003a);
            try {
                H(bytes.length);
                y(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new CodedOutputStream$OutOfSpaceException(e11);
            }
        } catch (IndexOutOfBoundsException e12) {
            throw new CodedOutputStream$OutOfSpaceException(e12);
        }
    }

    public final void G(int i10, int i11) {
        H((i10 << 3) | i11);
    }

    public final void H(int i10) {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f11932d;
            if (i11 == 0) {
                int i12 = this.f11934f;
                this.f11934f = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f11934f;
                    this.f11934f = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), 1), e10);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), 1), e10);
        }
    }

    public final void I(int i10, long j10) {
        G(i10, 0);
        J(j10);
    }

    public final void J(long j10) {
        boolean z10 = f11930h;
        int i10 = this.f11933e;
        byte[] bArr = this.f11932d;
        if (z10 && i10 - this.f11934f >= 10) {
            while ((j10 & (-128)) != 0) {
                int i11 = this.f11934f;
                this.f11934f = i11 + 1;
                r1.n(bArr, i11, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            int i12 = this.f11934f;
            this.f11934f = i12 + 1;
            r1.n(bArr, i12, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                int i13 = this.f11934f;
                this.f11934f = i13 + 1;
                bArr[i13] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(i10), 1), e10);
            }
        }
        int i14 = this.f11934f;
        this.f11934f = i14 + 1;
        bArr[i14] = (byte) j10;
    }

    public final void x(byte b10) {
        try {
            byte[] bArr = this.f11932d;
            int i10 = this.f11934f;
            this.f11934f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), 1), e10);
        }
    }

    public final void y(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f11932d, this.f11934f, i11);
            this.f11934f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11934f), Integer.valueOf(this.f11933e), Integer.valueOf(i11)), e10);
        }
    }

    public final void z(h hVar) {
        H(hVar.size());
        i iVar = (i) hVar;
        y(iVar.f11920c, iVar.k(), iVar.size());
    }
}
