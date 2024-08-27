package ks;

import java.io.UnsupportedEncodingException;
import jr.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f23480a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23481b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23482c = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    public static void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArr3;
        int i14;
        int i15;
        if ((i13 & 16) == 16) {
            bArr3 = f23481b;
        } else if ((i13 & 32) == 32) {
            bArr3 = f23482c;
        } else {
            bArr3 = f23480a;
        }
        int i16 = 0;
        if (i11 > 0) {
            i14 = (bArr[i10] << 24) >>> 8;
        } else {
            i14 = 0;
        }
        if (i11 > 1) {
            i15 = (bArr[i10 + 1] << 24) >>> 16;
        } else {
            i15 = 0;
        }
        int i17 = i15 | i14;
        if (i11 > 2) {
            i16 = (bArr[i10 + 2] << 24) >>> 24;
        }
        int i18 = i17 | i16;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                bArr2[i12] = bArr3[i18 >>> 18];
                bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
                bArr2[i12 + 2] = bArr3[(i18 >>> 6) & 63];
                bArr2[i12 + 3] = bArr3[i18 & 63];
                return;
            }
            bArr2[i12] = bArr3[i18 >>> 18];
            bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i18 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return;
        }
        bArr2[i12] = bArr3[i18 >>> 18];
        bArr2[i12 + 1] = bArr3[(i18 >>> 12) & 63];
        bArr2[i12 + 2] = 61;
        bArr2[i12 + 3] = 61;
    }

    public static String b(byte[] bArr, int i10) {
        if (bArr != null) {
            if (i10 >= 0) {
                if (i10 <= bArr.length) {
                    int i11 = 4;
                    int i12 = (i10 / 3) * 4;
                    if (i10 % 3 <= 0) {
                        i11 = 0;
                    }
                    int i13 = i12 + i11;
                    byte[] bArr2 = new byte[i13];
                    int i14 = i10 - 2;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i14) {
                        a(bArr, i15, 3, bArr2, i16, 0);
                        i15 += 3;
                        i16 += 4;
                    }
                    if (i15 < i10) {
                        a(bArr, i15, i10 - i15, bArr2, i16, 0);
                        i16 += 4;
                    }
                    if (i16 <= i13 - 1) {
                        byte[] bArr3 = new byte[i16];
                        System.arraycopy(bArr2, 0, bArr3, 0, i16);
                        bArr2 = bArr3;
                    }
                    try {
                        return new String(bArr2, "US-ASCII");
                    } catch (UnsupportedEncodingException unused) {
                        return new String(bArr2);
                    }
                }
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i10), Integer.valueOf(bArr.length)));
            }
            throw new IllegalArgumentException(h.n("Cannot have length offset: ", i10));
        }
        throw new NullPointerException("Cannot serialize a null array.");
    }
}
