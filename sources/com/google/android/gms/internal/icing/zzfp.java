package com.google.android.gms.internal.icing;

/* loaded from: classes2.dex */
final class zzfp extends zzfo {
    @Override // com.google.android.gms.internal.icing.zzfo
    public final int zzb(int i10, byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i12) {
            return 0;
        }
        while (i13 < i12) {
            int i14 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i14 < i12) {
                        if (b10 >= -62) {
                            i13 += 2;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    return b10;
                }
                if (b10 < -16) {
                    if (i14 >= i12 - 1) {
                        return zzfr.zze(bArr, i14, i12);
                    }
                    int i15 = i13 + 2;
                    byte b11 = bArr[i14];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i13 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (i14 >= i12 - 2) {
                    return zzfr.zze(bArr, i14, i12);
                }
                int i16 = i13 + 2;
                byte b12 = bArr[i14];
                if (b12 <= -65) {
                    if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                        int i17 = i13 + 3;
                        if (bArr[i16] <= -65) {
                            i13 += 4;
                            if (bArr[i17] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i13 = i14;
        }
        return 0;
    }
}
