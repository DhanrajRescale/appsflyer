package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFj1hSDK {

    /* renamed from: e, reason: collision with root package name */
    private static byte[] f8510e = new byte[256];
    static final byte[] AFKeystoreWrapper = new byte[256];
    static final int[] AFInAppEventType = new int[256];
    static final int[] valueOf = new int[256];
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] values = new int[256];
    private static int[] unregisterClient = new int[10];

    static {
        int i10;
        byte b10;
        byte[] bArr;
        int i11;
        byte b11 = 1;
        byte b12 = 1;
        do {
            int i12 = (b11 << 1) ^ b11;
            if ((b11 & 128) != 0) {
                i10 = 27;
            } else {
                i10 = 0;
            }
            b11 = (byte) (i10 ^ i12);
            byte b13 = (byte) (b12 ^ (b12 << 1));
            byte b14 = (byte) (b13 ^ (b13 << 2));
            byte b15 = (byte) (b14 ^ (b14 << 4));
            if ((b15 & 128) != 0) {
                b10 = 9;
            } else {
                b10 = 0;
            }
            b12 = (byte) (b15 ^ b10);
            bArr = f8510e;
            i11 = b11 & 255;
            int i13 = b12 & 255;
            bArr[i11] = (byte) (((((b12 ^ 99) ^ ((i13 << 1) | (i13 >> 7))) ^ ((i13 << 2) | (i13 >> 6))) ^ ((i13 << 3) | (i13 >> 5))) ^ ((i13 >> 4) | (i13 << 4)));
        } while (i11 != 1);
        bArr[0] = 99;
        for (int i14 = 0; i14 < 256; i14++) {
            int i15 = f8510e[i14] & 255;
            AFKeystoreWrapper[i15] = (byte) i14;
            int i16 = i14 << 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            int i17 = i16 << 1;
            if (i17 >= 256) {
                i17 ^= 283;
            }
            int i18 = i17 << 1;
            if (i18 >= 256) {
                i18 ^= 283;
            }
            int i19 = i18 ^ i14;
            int i20 = ((i16 ^ (i17 ^ i18)) << 24) | (i19 << 16) | ((i19 ^ i17) << 8) | (i19 ^ i16);
            AFInAppEventType[i15] = i20;
            valueOf[i15] = (i20 >>> 8) | (i20 << 24);
            AFInAppEventParameterName[i15] = (i20 >>> 16) | (i20 << 16);
            values[i15] = (i20 << 8) | (i20 >>> 24);
        }
        unregisterClient[0] = 16777216;
        int i21 = 1;
        for (int i22 = 1; i22 < 10; i22++) {
            i21 <<= 1;
            if (i21 >= 256) {
                i21 ^= 283;
            }
            unregisterClient[i22] = i21 << 24;
        }
    }

    public static byte[][] AFInAppEventType(int i10) {
        byte[][] bArr = new byte[4];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 >>> (i11 << 3);
            byte[] bArr2 = new byte[4];
            bArr2[0] = (byte) (i12 & 3);
            bArr2[1] = (byte) ((i12 >> 2) & 3);
            bArr2[2] = (byte) ((i12 >> 4) & 3);
            bArr2[3] = (byte) ((i12 >> 6) & 3);
            bArr[i11] = bArr2;
        }
        return bArr;
    }

    public static int[] values(byte[] bArr, int i10) throws IllegalArgumentException {
        int i11 = i10;
        if (bArr.length == 16) {
            int i12 = 4;
            int i13 = (i11 + 1) * 4;
            int[] iArr = new int[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < 4; i15++) {
                int i16 = i14 + 3;
                int i17 = ((bArr[i14 + 1] & 255) << 16) | (bArr[i14] << 24) | ((bArr[i14 + 2] & 255) << 8);
                i14 += 4;
                iArr[i15] = i17 | (bArr[i16] & 255);
            }
            int i18 = 4;
            int i19 = 0;
            int i20 = 0;
            while (i18 < i13) {
                int i21 = iArr[i18 - 1];
                if (i19 == 0) {
                    byte[] bArr2 = f8510e;
                    i21 = ((bArr2[i21 >>> 24] & 255) | (((bArr2[(i21 >>> 16) & 255] << 24) | ((bArr2[(i21 >>> 8) & 255] & 255) << 16)) | ((bArr2[i21 & 255] & 255) << 8))) ^ unregisterClient[i20];
                    i19 = 4;
                    i20++;
                }
                iArr[i18] = i21 ^ iArr[i18 - 4];
                i18++;
                i19--;
            }
            if (bArr.length == 16) {
                int[] iArr2 = new int[i13];
                int i22 = i11 * 4;
                iArr2[0] = iArr[i22];
                int i23 = 1;
                iArr2[1] = iArr[i22 + 1];
                iArr2[2] = iArr[i22 + 2];
                iArr2[3] = iArr[i22 + 3];
                int i24 = i22 - 4;
                while (i23 < i11) {
                    int i25 = iArr[i24];
                    int[] iArr3 = AFInAppEventType;
                    byte[] bArr3 = f8510e;
                    int i26 = iArr3[bArr3[i25 >>> 24] & 255];
                    int[] iArr4 = valueOf;
                    int i27 = i26 ^ iArr4[bArr3[(i25 >>> 16) & 255] & 255];
                    int[] iArr5 = AFInAppEventParameterName;
                    int i28 = i27 ^ iArr5[bArr3[(i25 >>> 8) & 255] & 255];
                    int[] iArr6 = values;
                    iArr2[i12] = iArr6[bArr3[i25 & 255] & 255] ^ i28;
                    int i29 = iArr[i24 + 1];
                    iArr2[i12 + 1] = ((iArr4[bArr3[(i29 >>> 16) & 255] & 255] ^ iArr3[bArr3[i29 >>> 24] & 255]) ^ iArr5[bArr3[(i29 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i29 & 255] & 255];
                    int i30 = iArr[i24 + 2];
                    int i31 = i12 + 3;
                    iArr2[i12 + 2] = iArr6[bArr3[i30 & 255] & 255] ^ ((iArr3[bArr3[i30 >>> 24] & 255] ^ iArr4[bArr3[(i30 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i30 >>> 8) & 255] & 255]);
                    int i32 = iArr[i24 + 3];
                    i12 += 4;
                    iArr2[i31] = iArr6[bArr3[i32 & 255] & 255] ^ ((iArr3[bArr3[i32 >>> 24] & 255] ^ iArr4[bArr3[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i32 >>> 8) & 255] & 255]);
                    i24 -= 4;
                    i23++;
                    i11 = i10;
                }
                iArr2[i12] = iArr[i24];
                iArr2[i12 + 1] = iArr[i24 + 1];
                iArr2[i12 + 2] = iArr[i24 + 2];
                iArr2[i12 + 3] = iArr[i24 + 3];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
