package pr;

import com.google.zxing.FormatException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31324b;

    public g(int i10) {
        this.f31324b = i10;
    }

    @Override // bl.j, kr.b
    public final mr.b e(String str, int i10, int i11, int i12, Map map) {
        switch (this.f31324b) {
            case 0:
                if (i10 == 8) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(jr.h.A(i10)));
            case 1:
                if (i10 == 7) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(jr.h.A(i10)));
            default:
                if (i10 == 16) {
                    return super.e(str, i10, i11, i12, map);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(jr.h.A(i10)));
        }
    }

    @Override // bl.j
    public final boolean[] x(String str) {
        switch (this.f31324b) {
            case 0:
                int length = str.length();
                if (length != 12) {
                    if (length == 13) {
                        try {
                            if (!i.f0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                } else {
                    try {
                        str = str + i.g0(str);
                    } catch (FormatException e10) {
                        throw new IllegalArgumentException(e10);
                    }
                }
                int i10 = f.f31322g[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int j10 = bl.j.j(zArr, 0, i.f31328b, true);
                for (int i11 = 1; i11 <= 6; i11++) {
                    int digit = Character.digit(str.charAt(i11), 10);
                    if (((i10 >> (6 - i11)) & 1) == 1) {
                        digit += 10;
                    }
                    j10 += bl.j.j(zArr, j10, i.f31332f[digit], false);
                }
                int j11 = bl.j.j(zArr, j10, i.f31329c, false) + j10;
                for (int i12 = 7; i12 <= 12; i12++) {
                    j11 += bl.j.j(zArr, j11, i.f31331e[Character.digit(str.charAt(i12), 10)], true);
                }
                bl.j.j(zArr, j11, i.f31328b, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 != 7) {
                    if (length2 == 8) {
                        try {
                            if (!i.f0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused2) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                } else {
                    try {
                        str = str + i.g0(str);
                    } catch (FormatException e11) {
                        throw new IllegalArgumentException(e11);
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int j12 = bl.j.j(zArr2, 0, i.f31328b, true);
                for (int i13 = 0; i13 <= 3; i13++) {
                    j12 += bl.j.j(zArr2, j12, i.f31331e[Character.digit(str.charAt(i13), 10)], false);
                }
                int j13 = bl.j.j(zArr2, j12, i.f31329c, false) + j12;
                for (int i14 = 4; i14 <= 7; i14++) {
                    j13 += bl.j.j(zArr2, j13, i.f31331e[Character.digit(str.charAt(i14), 10)], true);
                }
                bl.j.j(zArr2, j13, i.f31328b, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 != 7) {
                    if (length3 == 8) {
                        try {
                            if (!i.f0(str)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                        } catch (FormatException unused3) {
                            throw new IllegalArgumentException("Illegal contents");
                        }
                    } else {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                } else {
                    try {
                        str = str + i.g0(f.h0(str));
                    } catch (FormatException e12) {
                        throw new IllegalArgumentException(e12);
                    }
                }
                int digit2 = Character.digit(str.charAt(0), 10);
                if (digit2 != 0 && digit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i15 = f.f31323h[digit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int j14 = bl.j.j(zArr3, 0, i.f31328b, true);
                for (int i16 = 1; i16 <= 6; i16++) {
                    int digit3 = Character.digit(str.charAt(i16), 10);
                    if (((i15 >> (6 - i16)) & 1) == 1) {
                        digit3 += 10;
                    }
                    j14 += bl.j.j(zArr3, j14, i.f31332f[digit3], false);
                }
                bl.j.j(zArr3, j14, i.f31330d, false);
                return zArr3;
        }
    }
}
