package com.google.android.recaptcha.internal;

import java.io.IOException;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzen {
    public static int zza(byte[] bArr, int i10, zzem zzemVar) throws zzgy {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzj) {
                if (i11 == 0) {
                    zzemVar.zzc = zzez.zzb;
                    return zzj;
                }
                zzemVar.zzc = zzez.zzm(bArr, zzj, i11);
                return zzj + i11;
            }
            throw zzgy.zzj();
        }
        throw zzgy.zzf();
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzil zzilVar, byte[] bArr, int i10, int i11, int i12, zzem zzemVar) throws IOException {
        Object zze = zzilVar.zze();
        int zzn = zzn(zze, zzilVar, bArr, i10, i11, i12, zzemVar);
        zzilVar.zzf(zze);
        zzemVar.zzc = zze;
        return zzn;
    }

    public static int zzd(zzil zzilVar, byte[] bArr, int i10, int i11, zzem zzemVar) throws IOException {
        Object zze = zzilVar.zze();
        int zzo = zzo(zze, zzilVar, bArr, i10, i11, zzemVar);
        zzilVar.zzf(zze);
        zzemVar.zzc = zze;
        return zzo;
    }

    public static int zze(zzil zzilVar, int i10, byte[] bArr, int i11, int i12, zzgv zzgvVar, zzem zzemVar) throws IOException {
        int zzd = zzd(zzilVar, bArr, i11, i12, zzemVar);
        zzgvVar.add(zzemVar.zzc);
        while (zzd < i12) {
            int zzj = zzj(bArr, zzd, zzemVar);
            if (i10 != zzemVar.zza) {
                break;
            }
            zzd = zzd(zzilVar, bArr, zzj, i12, zzemVar);
            zzgvVar.add(zzemVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzgv zzgvVar, zzem zzemVar) throws IOException {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzemVar);
            zzgpVar.zzg(zzemVar.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzgy.zzj();
    }

    public static int zzg(byte[] bArr, int i10, zzem zzemVar) throws zzgy {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzemVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
                return zzj;
            }
            zzemVar.zzc = new String(bArr, zzj, i11, zzgw.zzb);
            return zzj + i11;
        }
        throw zzgy.zzf();
    }

    public static int zzh(byte[] bArr, int i10, zzem zzemVar) throws zzgy {
        int zzj = zzj(bArr, i10, zzemVar);
        int i11 = zzemVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzemVar.zzc = HttpUrl.FRAGMENT_ENCODE_SET;
                return zzj;
            }
            zzemVar.zzc = zzju.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
        throw zzgy.zzf();
    }

    public static int zzi(int i10, byte[] bArr, int i11, int i12, zzjg zzjgVar, zzem zzemVar) throws zzgy {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzjgVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzgy.zzc();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzjg zzf = zzjg.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzj = zzj(bArr, i11, zzemVar);
                            int i16 = zzemVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzi = zzi(i15, bArr, zzj, i12, zzf, zzemVar);
                                i15 = i16;
                                i11 = zzi;
                            } else {
                                i11 = zzj;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzjgVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzgy.zzg();
                    }
                    int zzj2 = zzj(bArr, i11, zzemVar);
                    int i17 = zzemVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzj2) {
                            if (i17 == 0) {
                                zzjgVar.zzj(i10, zzez.zzb);
                            } else {
                                zzjgVar.zzj(i10, zzez.zzm(bArr, zzj2, i17));
                            }
                            return zzj2 + i17;
                        }
                        throw zzgy.zzj();
                    }
                    throw zzgy.zzf();
                }
                zzjgVar.zzj(i10, Long.valueOf(zzq(bArr, i11)));
                return i11 + 8;
            }
            int zzm = zzm(bArr, i11, zzemVar);
            zzjgVar.zzj(i10, Long.valueOf(zzemVar.zzb));
            return zzm;
        }
        throw zzgy.zzc();
    }

    public static int zzj(byte[] bArr, int i10, zzem zzemVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzemVar.zza = b10;
            return i11;
        }
        return zzk(b10, bArr, i11, zzemVar);
    }

    public static int zzk(int i10, byte[] bArr, int i11, zzem zzemVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzemVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzemVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzemVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzemVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzemVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzl(int i10, byte[] bArr, int i11, int i12, zzgv zzgvVar, zzem zzemVar) {
        zzgp zzgpVar = (zzgp) zzgvVar;
        int zzj = zzj(bArr, i11, zzemVar);
        zzgpVar.zzg(zzemVar.zza);
        while (zzj < i12) {
            int zzj2 = zzj(bArr, zzj, zzemVar);
            if (i10 != zzemVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzemVar);
            zzgpVar.zzg(zzemVar.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i10, zzem zzemVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzemVar.zzb = j10;
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
        zzemVar.zzb = j11;
        return i12;
    }

    public static int zzn(Object obj, zzil zzilVar, byte[] bArr, int i10, int i11, int i12, zzem zzemVar) throws IOException {
        int zzc = ((zzib) zzilVar).zzc(obj, bArr, i10, i11, i12, zzemVar);
        zzemVar.zzc = obj;
        return zzc;
    }

    public static int zzo(Object obj, zzil zzilVar, byte[] bArr, int i10, int i11, zzem zzemVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzk(i13, bArr, i12, zzemVar);
            i13 = zzemVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzilVar.zzi(obj, bArr, i14, i15, zzemVar);
            zzemVar.zzc = obj;
            return i15;
        }
        throw zzgy.zzj();
    }

    public static int zzp(int i10, byte[] bArr, int i11, int i12, zzem zzemVar) throws zzgy {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                return i11 + 4;
                            }
                            throw zzgy.zzc();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        int i15 = 0;
                        while (i11 < i12) {
                            i11 = zzj(bArr, i11, zzemVar);
                            i15 = zzemVar.zza;
                            if (i15 == i14) {
                                break;
                            }
                            i11 = zzp(i15, bArr, i11, i12, zzemVar);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            return i11;
                        }
                        throw zzgy.zzg();
                    }
                    return zzj(bArr, i11, zzemVar) + zzemVar.zza;
                }
                return i11 + 8;
            }
            return zzm(bArr, i11, zzemVar);
        }
        throw zzgy.zzc();
    }

    public static long zzq(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
