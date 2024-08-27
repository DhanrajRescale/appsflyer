package in.juspay.hypersdk.security;

import java.util.Arrays;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public class Base64Codec {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static int computeEncodedLength(int i10, boolean z10) {
        if (i10 == 0) {
            return 0;
        }
        if (!z10) {
            return (((i10 - 1) / 3) + 1) << 2;
        }
        int i11 = (i10 / 3) << 2;
        int i12 = i10 % 3;
        return i12 == 0 ? i11 : i11 + i12 + 1;
    }

    public static byte[] decode(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        byte[] bArr = new byte[(length * 6) >> 3];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bytes.length) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < 4 && i10 < length) {
                int i14 = i10 + 1;
                int decodeDigit = decodeDigit(bytes[i10]);
                if (decodeDigit >= 0) {
                    i13 |= decodeDigit << (18 - (i12 * 6));
                    i12++;
                }
                i10 = i14;
            }
            if (i12 >= 2) {
                int i15 = i11 + 1;
                bArr[i11] = (byte) (i13 >> 16);
                if (i12 >= 3) {
                    int i16 = i11 + 2;
                    bArr[i15] = (byte) (i13 >> 8);
                    if (i12 >= 4) {
                        i11 += 3;
                        bArr[i16] = (byte) i13;
                    } else {
                        i11 = i16;
                    }
                } else {
                    i11 = i15;
                }
            }
        }
        return Arrays.copyOf(bArr, i11);
    }

    public static int decodeDigit(byte b10) {
        int tpGT = tpGT(b10, 64) & tpLT(b10, 91);
        int tpGT2 = tpGT(b10, 96) & tpLT(b10, 123);
        int tpGT3 = tpGT(b10, 47) & tpLT(b10, 58);
        int tpEq = tpEq(b10, 45) | tpEq(b10, 43);
        int tpEq2 = tpEq(b10, 47) | tpEq(b10, 95);
        return tpSelect(tpGT3, b10 + 4, 0) | tpSelect(tpGT, b10 - 65, 0) | tpSelect(tpGT2, b10 - 71, 0) | tpSelect(tpEq, 62, 0) | tpSelect(tpEq2, 63, 0) | tpSelect(tpGT | tpGT2 | tpGT3 | tpEq | tpEq2, 0, -1);
    }

    public static byte encodeDigitBase64(int i10) {
        int tpLT = tpLT(i10, 26);
        int tpGT = tpGT(i10, 25) & tpLT(i10, 52);
        return (byte) (tpSelect(tpGT(i10, 51) & tpLT(i10, 62), i10 - 4, 0) | tpSelect(tpLT, i10 + 65, 0) | tpSelect(tpGT, i10 + 71, 0) | tpSelect(tpEq(i10, 62), 43, 0) | tpSelect(tpEq(i10, 63), 47, 0));
    }

    public static byte encodeDigitBase64URL(int i10) {
        int tpLT = tpLT(i10, 26);
        int tpGT = tpGT(i10, 25) & tpLT(i10, 52);
        return (byte) (tpSelect(tpGT(i10, 51) & tpLT(i10, 62), i10 - 4, 0) | tpSelect(tpLT, i10 + 65, 0) | tpSelect(tpGT, i10 + 71, 0) | tpSelect(tpEq(i10, 62), 45, 0) | tpSelect(tpEq(i10, 63), 95, 0));
    }

    public static String encodeToString(byte[] bArr, boolean z10) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i10 = (length / 3) * 3;
        int computeEncodedLength = computeEncodedLength(length, z10);
        byte[] bArr2 = new byte[computeEncodedLength];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            int i16 = i12 + 1;
            int i17 = (i15 >>> 18) & 63;
            if (z10) {
                bArr2[i12] = encodeDigitBase64URL(i17);
                bArr2[i16] = encodeDigitBase64URL((i15 >>> 12) & 63);
                int i18 = i12 + 3;
                bArr2[i12 + 2] = encodeDigitBase64URL((i15 >>> 6) & 63);
                i12 += 4;
                bArr2[i18] = encodeDigitBase64URL(i15 & 63);
            } else {
                bArr2[i12] = encodeDigitBase64(i17);
                bArr2[i16] = encodeDigitBase64((i15 >>> 12) & 63);
                int i19 = i12 + 3;
                bArr2[i12 + 2] = encodeDigitBase64((i15 >>> 6) & 63);
                i12 += 4;
                bArr2[i19] = encodeDigitBase64(i15 & 63);
            }
        }
        int i20 = length - i10;
        if (i20 > 0) {
            int i21 = ((bArr[i10] & 255) << 10) | (i20 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
            if (!z10) {
                bArr2[computeEncodedLength - 4] = encodeDigitBase64(i21 >> 12);
                bArr2[computeEncodedLength - 3] = encodeDigitBase64((i21 >>> 6) & 63);
                bArr2[computeEncodedLength - 2] = i20 == 2 ? encodeDigitBase64(i21 & 63) : (byte) 61;
                bArr2[computeEncodedLength - 1] = 61;
            } else if (i20 == 2) {
                bArr2[computeEncodedLength - 3] = encodeDigitBase64URL(i21 >> 12);
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL((i21 >>> 6) & 63);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL(i21 & 63);
            } else {
                bArr2[computeEncodedLength - 2] = encodeDigitBase64URL(i21 >> 12);
                bArr2[computeEncodedLength - 1] = encodeDigitBase64URL((i21 >>> 6) & 63);
            }
        }
        return new String(bArr2, "UTF-8");
    }

    public static int tpEq(int i10, int i11) {
        int i12 = i10 ^ i11;
        return ((~i12) & (i12 - 1)) >>> 63;
    }

    public static int tpGT(int i10, int i11) {
        return (int) ((i11 - i10) >>> 63);
    }

    public static int tpLT(int i10, int i11) {
        return (int) ((i10 - i11) >>> 63);
    }

    public static int tpSelect(int i10, int i11, int i12) {
        return ((i10 - 1) & (i12 ^ i11)) ^ i11;
    }
}
