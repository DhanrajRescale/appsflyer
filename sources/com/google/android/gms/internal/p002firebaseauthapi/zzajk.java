package com.google.android.gms.internal.p002firebaseauthapi;

import com.airbnb.deeplinkdispatch.MetadataMasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajk {
    private static final zzajh zza;

    static {
        if (zzajf.zzx() && zzajf.zzy()) {
            int i10 = zzaer.zza;
        }
        zza = new zzaji();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    byte b11 = bArr[i10];
                    byte b12 = bArr[i10 + 1];
                    if (b10 <= -12 && b11 <= -65 && b12 <= -65) {
                        return ((b11 << 8) ^ b10) ^ (b12 << MetadataMasks.ComponentParamMask);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                byte b13 = bArr[i10];
                if (b10 <= -12 && b13 <= -65) {
                    return b10 ^ (b13 << 8);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzb(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zzajj(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i10, int i11) throws zzags {
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!zzajg.zzd(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = bArr[i10];
                if (zzajg.zzd(b11)) {
                    cArr[i14] = (char) b11;
                    i14++;
                    i10 = i15;
                    while (i10 < i12) {
                        byte b12 = bArr[i10];
                        if (zzajg.zzd(b12)) {
                            i10++;
                            cArr[i14] = (char) b12;
                            i14++;
                        }
                    }
                } else if (b11 < -32) {
                    if (i15 < i12) {
                        i10 += 2;
                        zzajg.zzc(b11, bArr[i15], cArr, i14);
                        i14++;
                    } else {
                        throw zzags.zzd();
                    }
                } else if (b11 < -16) {
                    if (i15 < i12 - 1) {
                        int i16 = i10 + 2;
                        i10 += 3;
                        zzajg.zzb(b11, bArr[i15], bArr[i16], cArr, i14);
                        i14++;
                    } else {
                        throw zzags.zzd();
                    }
                } else if (i15 < i12 - 2) {
                    byte b13 = bArr[i15];
                    int i17 = i10 + 3;
                    byte b14 = bArr[i10 + 2];
                    i10 += 4;
                    zzajg.zza(b11, b13, b14, bArr[i17], cArr, i14);
                    i14 += 2;
                } else {
                    throw zzags.zzd();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }
}
