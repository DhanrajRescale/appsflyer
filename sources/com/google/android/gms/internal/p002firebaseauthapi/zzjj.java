package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzjj {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 16);
    public static final byte[] zzd = zzc(2, 17);
    public static final byte[] zze = zzc(2, 18);
    public static final byte[] zzf = zzc(2, 1);
    public static final byte[] zzg = zzc(2, 2);
    public static final byte[] zzh = zzc(2, 3);
    public static final byte[] zzi = zzc(2, 1);
    public static final byte[] zzj = zzc(2, 2);
    public static final byte[] zzk = zzc(2, 3);
    public static final byte[] zzl = new byte[0];
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        Charset charset = zzly.zza;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    public static void zza(zzse zzseVar) throws GeneralSecurityException {
        if (zzseVar.zzf() != 2 && zzseVar.zzf() != 1) {
            String str = "UNRECOGNIZED";
            if (zzseVar.zze() != 2 && zzseVar.zze() != 1) {
                if (zzseVar.zzd() != 2 && zzseVar.zzd() != 1) {
                    return;
                }
                int zzd2 = zzseVar.zzd();
                if (zzd2 != 2) {
                    if (zzd2 != 3) {
                        if (zzd2 != 4) {
                            if (zzd2 == 5) {
                                str = "CHACHA20_POLY1305";
                            }
                        } else {
                            str = "AES_256_GCM";
                        }
                    } else {
                        str = "AES_128_GCM";
                    }
                } else {
                    str = "AEAD_UNKNOWN";
                }
                throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
            }
            int zze2 = zzseVar.zze();
            if (zze2 != 2) {
                if (zze2 != 3) {
                    if (zze2 != 4) {
                        if (zze2 == 5) {
                            str = "HKDF_SHA512";
                        }
                    } else {
                        str = "HKDF_SHA384";
                    }
                } else {
                    str = "HKDF_SHA256";
                }
            } else {
                str = "KDF_UNKNOWN";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        throw new GeneralSecurityException("Invalid KEM param: ".concat(zzry.zza(zzseVar.zzf())));
    }

    public static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzum.zzb(zzn, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzum.zzb(zzm, bArr);
    }

    public static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzum.zzb(zzo, bArr2, str.getBytes(zzly.zza), bArr);
    }

    public static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        return zzum.zzb(zzc(2, i10), zzo, bArr2, str.getBytes(zzly.zza), bArr);
    }

    public static int zzg(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 == 3) {
                return 2;
            }
            if (i11 == 4) {
                return 3;
            }
            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
        }
        return 1;
    }
}
