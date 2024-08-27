package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaet {
    public static int zza(byte[] bArr, int i10, zzaes zzaesVar) throws zzags {
        int zzj = zzj(bArr, i10, zzaesVar);
        int i11 = zzaesVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzaesVar.zzc = zzaff.zzb;
                    return zzj;
                }
                zzaesVar.zzc = zzaff.zzn(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzags.zzj();
        }
        throw zzags.zzf();
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzaib zzaibVar, byte[] bArr, int i10, int i11, int i12, zzaes zzaesVar) throws IOException {
        Object zze = zzaibVar.zze();
        int zzn = zzn(zze, zzaibVar, bArr, i10, i11, i12, zzaesVar);
        zzaibVar.zzf(zze);
        zzaesVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzaib zzaibVar, byte[] bArr, int i10, int i11, zzaes zzaesVar) throws IOException {
        Object zze = zzaibVar.zze();
        int zzo = zzo(zze, zzaibVar, bArr, i10, i11, zzaesVar);
        zzaibVar.zzf(zze);
        zzaesVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzaib zzaibVar, int i10, byte[] bArr, int i11, int i12, zzagp zzagpVar, zzaes zzaesVar) throws IOException {
        int zzd = zzd(zzaibVar, bArr, i11, i12, zzaesVar);
        zzagpVar.add(zzaesVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzaesVar);
            if (i10 != zzaesVar.zza) {
                break;
            }
            zzd = zzd(zzaibVar, bArr, zzj, i12, zzaesVar);
            zzagpVar.add(zzaesVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzagp zzagpVar, zzaes zzaesVar) throws IOException {
        zzagl zzaglVar = (zzagl) zzagpVar;
        int zzj = zzj(bArr, i10, zzaesVar);
        int i11 = zzaesVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzaesVar);
            zzaglVar.zzf(zzaesVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzags.zzj();
    }

    public static int zzg(byte[] bArr, int i10, zzaes zzaesVar) throws zzags {
        int zzj = zzj(bArr, i10, zzaesVar);
        int i11 = zzaesVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzaesVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
                return zzj;
            }
            zzaesVar.zzc = new String(bArr, zzj, i11, zzagq.zzb);
            return zzj + i11;
        }
        throw zzags.zzf();
    }

    public static int zzh(byte[] bArr, int i10, zzaes zzaesVar) throws zzags {
        int zzj = zzj(bArr, i10, zzaesVar);
        int i11 = zzaesVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzaesVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
                return zzj;
            }
            zzaesVar.zzc = zzajk.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzags.zzf();
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzaiw zzaiwVar, zzaes zzaesVar) throws zzags {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzaiwVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzags.zzc();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzaiw zzf = zzaiw.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzj = zzj(bArr, i11, zzaesVar);
                            int i16 = zzaesVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzi = zzi(i15, bArr, zzj, i12, zzf, zzaesVar);
                                i15 = i16;
                                i11 = zzi;
                            } else {
                                i11 = zzj;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzaiwVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzags.zzg();
                    }
                    int zzj2 = zzj(bArr, i11, zzaesVar);
                    int i17 = zzaesVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzj2) {
                            if (i17 == 0) {
                                zzaiwVar.zzj(i10, zzaff.zzb);
                            } else {
                                zzaiwVar.zzj(i10, zzaff.zzn(bArr, zzj2, i17));
                            }
                            return zzj2 + i17;
                        }
                        throw zzags.zzj();
                    }
                    throw zzags.zzf();
                }
                zzaiwVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            }
            int zzm = zzm(bArr, i11, zzaesVar);
            zzaiwVar.zzj(i10, Long.valueOf(zzaesVar.zzb));
            return zzm;
        }
        throw zzags.zzc();
    }

    public static int zzj(byte[] bArr, int i10, zzaes zzaesVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzaesVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzaesVar);
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzaes zzaesVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzaesVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzaesVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzaesVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzaesVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzaesVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzagp zzagpVar, zzaes zzaesVar) {
        zzagl zzaglVar = (zzagl) zzagpVar;
        int zzj = zzj(bArr, i11, zzaesVar);
        zzaglVar.zzf(zzaesVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzaesVar);
            if (i10 != zzaesVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzaesVar);
            zzaglVar.zzf(zzaesVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i10, zzaes zzaesVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzaesVar.zzb = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzaesVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzaib zzaibVar, byte[] bArr, int i10, int i11, int i12, zzaes zzaesVar) throws IOException {
        int zzc = ((zzahs) zzaibVar).zzc(obj, bArr, i10, i11, i12, zzaesVar);
        zzaesVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzaib zzaibVar, byte[] bArr, int i10, int i11, zzaes zzaesVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzaesVar);
            i13 = zzaesVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzaibVar.zzi(obj, bArr, i14, i15, zzaesVar);
            zzaesVar.zzc = obj;
            return i15;
        }
        throw zzags.zzj();
    }

    public static long zzp(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
