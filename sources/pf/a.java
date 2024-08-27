package pf;

import com.airbnb.deeplinkdispatch.MetadataMasks;
import com.google.android.gms.common.api.Api;
import jr.h;
import nn.d;
import v.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f31009a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31010b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, MetadataMasks.ComponentParamMask, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, MetadataMasks.ConfigurablePathSegmentMask, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f31010b;
        byte[] bArr2 = new byte[e.b(length, 3, 4, 2)];
        byte[] bArr3 = new byte[4];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            byte b10 = (byte) (bytes[i10] & Byte.MAX_VALUE);
            byte b11 = bArr[b10];
            if (b11 >= -5) {
                if (b11 >= -1) {
                    if (b10 == 61) {
                        int i13 = length - i10;
                        byte b12 = (byte) (bytes[length - 1] & Byte.MAX_VALUE);
                        if (i11 != 0 && i11 != 1) {
                            if ((i11 == 3 && i13 > 2) || (i11 == 4 && i13 > 1)) {
                                throw new Exception(h.n("padding byte '=' falsely signals end of encoded value at offset ", i10));
                            }
                            if (b12 != 61 && b12 != 10) {
                                throw new Exception("encoded value has invalid trailing byte");
                            }
                        } else {
                            throw new Exception(h.n("invalid padding byte '=' at byte offset ", i10));
                        }
                    } else {
                        int i14 = i11 + 1;
                        bArr3[i11] = b10;
                        if (i14 == 4) {
                            i12 += b(bArr3, bArr2, i12, bArr);
                            i11 = 0;
                        } else {
                            i11 = i14;
                        }
                    }
                }
                i10++;
            } else {
                throw new Exception(d.m(a3.a.n("Bad Base64 input character at ", i10, ": "), bytes[i10], "(decimal)"));
            }
        }
        if (i11 != 0) {
            if (i11 != 1) {
                bArr3[i11] = 61;
                i12 += b(bArr3, bArr2, i12, bArr);
            } else {
                throw new Exception("single trailing character at offset " + (length - 1));
            }
        }
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArr2, 0, bArr4, 0, i12);
        return bArr4;
    }

    public static int b(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 == 61) {
            int i11 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
            bArr2[i10] = (byte) (i11 >>> 16);
            bArr2[i10 + 1] = (byte) (i11 >>> 8);
            return 2;
        }
        int i12 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b11] << 24) >>> 24);
        bArr2[i10] = (byte) (i12 >> 16);
        bArr2[i10 + 1] = (byte) (i12 >> 8);
        bArr2[i10 + 2] = (byte) i12;
        return 3;
    }

    public static String c(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int length = bArr.length;
        byte[] bArr2 = f31009a;
        int i13 = ((length + 2) / 3) * 4;
        int i14 = (i13 / Api.BaseClientBuilder.API_PRIORITY_OTHER) + i13;
        byte[] bArr3 = new byte[i14];
        int i15 = length - 2;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i15) {
            int i19 = ((bArr[i16] << 24) >>> 8) | ((bArr[i16 + 1] << 24) >>> 16) | ((bArr[i16 + 2] << 24) >>> 24);
            bArr3[i17] = bArr2[i19 >>> 18];
            int i20 = i17 + 1;
            bArr3[i20] = bArr2[(i19 >>> 12) & 63];
            bArr3[i17 + 2] = bArr2[(i19 >>> 6) & 63];
            bArr3[i17 + 3] = bArr2[i19 & 63];
            i18 += 4;
            if (i18 == Integer.MAX_VALUE) {
                bArr3[i17 + 4] = 10;
                i18 = 0;
                i17 = i20;
            }
            i16 += 3;
            i17 += 4;
        }
        if (i16 < length) {
            int i21 = length - i16;
            if (i21 > 0) {
                i10 = (bArr[i16] << 24) >>> 8;
            } else {
                i10 = 0;
            }
            if (i21 > 1) {
                i11 = (bArr[i16 + 1] << 24) >>> 16;
            } else {
                i11 = 0;
            }
            int i22 = i10 | i11;
            if (i21 > 2) {
                i12 = (bArr[i16 + 2] << 24) >>> 24;
            } else {
                i12 = 0;
            }
            int i23 = i12 | i22;
            if (i21 != 1) {
                if (i21 != 2) {
                    if (i21 == 3) {
                        bArr3[i17] = bArr2[i23 >>> 18];
                        bArr3[i17 + 1] = bArr2[(i23 >>> 12) & 63];
                        bArr3[i17 + 2] = bArr2[(i23 >>> 6) & 63];
                        bArr3[i17 + 3] = bArr2[i23 & 63];
                    }
                } else {
                    bArr3[i17] = bArr2[i23 >>> 18];
                    bArr3[i17 + 1] = bArr2[(i23 >>> 12) & 63];
                    bArr3[i17 + 2] = bArr2[(i23 >>> 6) & 63];
                    bArr3[i17 + 3] = 61;
                }
            } else {
                bArr3[i17] = bArr2[i23 >>> 18];
                bArr3[i17 + 1] = bArr2[(i23 >>> 12) & 63];
                bArr3[i17 + 2] = 61;
                bArr3[i17 + 3] = 61;
            }
            if (i18 + 4 == Integer.MAX_VALUE) {
                bArr3[i17 + 4] = 10;
            }
        }
        return new String(bArr3, 0, i14);
    }
}
