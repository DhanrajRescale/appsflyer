package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzjy {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        jArr[1] = (j12 * j13) + j11;
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        jArr[2] = ((j14 + j14) * j15) + (jArr3[2] * j10) + (jArr2[2] * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        jArr[3] = (j14 * j16) + (j17 * j15) + (jArr3[3] * j10) + (jArr2[3] * j13);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        long j20 = (j14 * j18) + (j19 * j15);
        jArr[4] = j20 + j20 + (j17 * j16) + (jArr3[4] * j10) + (jArr2[4] * j13);
        long j21 = jArr3[4];
        long j22 = jArr2[4];
        jArr[5] = (j17 * j18) + (j19 * j16) + (j14 * j21) + (j22 * j15) + (jArr3[5] * j10) + (jArr2[5] * j13);
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        long j25 = (j19 * j18) + (j14 * j23) + (j24 * j15);
        jArr[6] = j25 + j25 + (j17 * j21) + (j22 * j16) + (jArr3[6] * j10) + (jArr2[6] * j13);
        long j26 = jArr3[6];
        long j27 = jArr2[6];
        jArr[7] = (j19 * j21) + (j22 * j18) + (j17 * j23) + (j24 * j16) + (j14 * j26) + (j27 * j15) + (jArr3[7] * j10) + (jArr2[7] * j13);
        long j28 = jArr3[7];
        long j29 = jArr2[7];
        long j30 = (j19 * j23) + (j24 * j18) + (j14 * j28) + (j29 * j15);
        jArr[8] = j30 + j30 + (j22 * j21) + (j17 * j26) + (j27 * j16) + (jArr3[8] * j10) + (jArr2[8] * j13);
        long j31 = jArr3[8];
        long j32 = jArr2[8];
        jArr[9] = (j22 * j23) + (j24 * j21) + (j19 * j26) + (j27 * j18) + (j17 * j28) + (j29 * j16) + (j14 * j31) + (j32 * j15) + (j10 * jArr3[9]) + (jArr2[9] * j13);
        long j33 = jArr3[9];
        long j34 = jArr2[9];
        long j35 = (j24 * j23) + (j19 * j28) + (j29 * j18) + (j14 * j33) + (j15 * j34);
        jArr[10] = j35 + j35 + (j22 * j26) + (j27 * j21) + (j17 * j31) + (j32 * j16);
        jArr[11] = (j24 * j26) + (j27 * j23) + (j22 * j28) + (j29 * j21) + (j19 * j31) + (j32 * j18) + (j17 * j33) + (j16 * j34);
        long j36 = (j24 * j28) + (j29 * j23) + (j19 * j33) + (j18 * j34);
        jArr[12] = j36 + j36 + (j27 * j26) + (j22 * j31) + (j32 * j21);
        jArr[13] = (j27 * j28) + (j29 * j26) + (j24 * j31) + (j32 * j23) + (j22 * j33) + (j21 * j34);
        long j37 = (j29 * j28) + (j24 * j33) + (j23 * j34);
        jArr[14] = j37 + j37 + (j27 * j31) + (j32 * j26);
        jArr[15] = (j29 * j31) + (j32 * j28) + (j27 * j33) + (j26 * j34);
        long j38 = (j28 * j34) + (j29 * j33);
        jArr[16] = j38 + j38 + (j32 * j31);
        jArr[17] = (j31 * j34) + (j32 * j33);
        jArr[18] = (j34 + j34) * j33;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j15 + j15 + j16;
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void zze(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j11 + j11 + j12;
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j15 + j15 + j16;
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j19 + j19 + j20;
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j23 + j23 + j24;
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j27 + j27 + j28;
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j31 + j31 + j32;
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j35 + j35 + j36;
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j39 + j39 + j40;
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j43 + j43 + j44;
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    public static void zzf(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        long j13 = (jArr2[2] * j11) + (j12 * j12);
        long j14 = jArr2[2];
        long j15 = (jArr2[3] * j11) + (j12 * j14);
        long j16 = jArr2[3];
        long j17 = (j14 * j14) + (j12 * 4 * j16);
        long j18 = jArr2[4];
        long j19 = (j14 * j16) + (j12 * j18) + (jArr2[5] * j11);
        long j20 = jArr2[6] * j11;
        long j21 = jArr2[5];
        long j22 = (j16 * j16) + (j14 * j18) + j20 + ((j12 + j12) * j21);
        long j23 = jArr2[6];
        long j24 = (j16 * j18) + (j14 * j21) + (j12 * j23) + (jArr2[7] * j11);
        long j25 = jArr2[8] * j11;
        long j26 = jArr2[7];
        long j27 = (j16 * j21) + (j12 * j26);
        long j28 = j27 + j27 + (j14 * j23) + j25;
        long j29 = j28 + j28;
        long j30 = jArr2[8];
        long j31 = (j18 * j21) + (j16 * j23) + (j14 * j26) + (j12 * j30) + (j11 * jArr2[9]);
        long j32 = jArr2[9];
        long j33 = (j12 * j32) + (j16 * j26);
        long j34 = j33 + j33 + (j21 * j21) + (j18 * j23) + (j14 * j30);
        long j35 = (j21 * j23) + (j18 * j26) + (j16 * j30) + (j14 * j32);
        long j36 = (j16 * j32) + (j21 * j26);
        long j37 = j36 + j36 + (j18 * j30);
        long j38 = (j23 * j26) + (j21 * j30) + (j18 * j32);
        long j39 = (j26 * j26) + (j23 * j30) + ((j21 + j21) * j32);
        long j40 = (j23 * j32) + (j26 * j30);
        zzc(new long[]{j10 * j10, (j11 + j11) * jArr2[1], j13 + j13, j15 + j15, j17 + ((j11 + j11) * jArr2[4]), j19 + j19, j22 + j22, j24 + j24, j29 + (j18 * j18), j31 + j31, j34 + j34, j35 + j35, j37 + j37 + (j23 * j23), j38 + j38, j39 + j39, j40 + j40, (j26 * 4 * j32) + (j30 * j30), (j30 + j30) * j32, (j32 + j32) * j32}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i10;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = copyOf[i12];
                int i13 = -((int) (((j10 >> 31) & j10) >> zzd[i12 & 1]));
                copyOf[i12] = j10 + (i13 << r14);
                i12++;
                copyOf[i12] = copyOf[i12] - i13;
            }
            long j11 = copyOf[9];
            copyOf[9] = j11 + (r6 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j11 >> 31) & j11) >> 25))) * 19);
            i11++;
        }
        long j12 = copyOf[0];
        copyOf[0] = j12 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j12 >> 31) & j12) >> 26)));
        int i14 = 0;
        for (i10 = 2; i14 < i10; i10 = 2) {
            int i15 = 0;
            while (i15 < 9) {
                long j13 = copyOf[i15];
                long j14 = j13 >> zzd[i15 & 1];
                copyOf[i15] = j13 & zzc[r14];
                i15++;
                copyOf[i15] = copyOf[i15] + ((int) j14);
            }
            i14++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = (((int) (r9 >> 25)) * 19) + copyOf[0];
        int i16 = ~((((int) r9) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) copyOf[i17]) ^ zzc[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 + i22)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i16);
        long j15 = 33554431 & i16;
        copyOf[1] = copyOf[1] - j15;
        for (int i23 = 2; i23 < 10; i23 += 2) {
            copyOf[i23] = copyOf[i23] - (67108863 & i16);
            int i24 = i23 + 1;
            copyOf[i24] = copyOf[i24] - j15;
        }
        for (int i25 = 0; i25 < 10; i25++) {
            copyOf[i25] = copyOf[i25] << zzb[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = 0; i26 < 10; i26++) {
            int i27 = zza[i26];
            long j16 = bArr[i27];
            long j17 = copyOf[i26];
            bArr[i27] = (byte) (j16 | (j17 & 255));
            bArr[i27 + 1] = (byte) (bArr[r5] | ((j17 >> 8) & 255));
            bArr[i27 + 2] = (byte) (bArr[r5] | ((j17 >> 16) & 255));
            bArr[i27 + 3] = (byte) (bArr[r4] | ((j17 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zza[i10];
            jArr[i10] = (((((bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8)) | ((bArr[i11 + 2] & 255) << 16)) | ((bArr[i11 + 3] & 255) << 24)) >> zzb[i10]) & zzc[i10 & 1];
        }
        return jArr;
    }
}
