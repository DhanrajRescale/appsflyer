package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class zziw {
    private final String zza;

    public zziw(String str) {
        this.zza = str;
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        Mac mac = (Mac) zzvc.zzb.zza(this.zza);
        if (i10 <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i10];
            mac.init(new SecretKeySpec(bArr, this.zza));
            byte[] bArr4 = new byte[0];
            int i11 = 1;
            int i12 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i11);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i13 = i12 + length;
                if (i13 < i10) {
                    System.arraycopy(bArr4, 0, bArr3, i12, length);
                    i11++;
                    i12 = i13;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    private final byte[] zzg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) zzvc.zzb.zza(this.zza);
        if (bArr2 != null && bArr2.length != 0) {
            mac.init(new SecretKeySpec(bArr2, this.zza));
        } else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.zza));
        }
        return mac.doFinal(bArr);
    }

    public final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) throws GeneralSecurityException {
        return zzf(zzg(zzjj.zze("eae_prk", bArr2, bArr4), null), zzjj.zzf("shared_secret", bArr3, bArr4, i10), i10);
    }

    public final byte[] zzc() throws GeneralSecurityException {
        char c10;
        String str = this.zza;
        int hashCode = str.hashCode();
        if (hashCode != 984523022) {
            if (hashCode != 984524074) {
                if (hashCode == 984525777 && str.equals("HmacSha512")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("HmacSha384")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("HmacSha256")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return zzjj.zzh;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return zzjj.zzg;
        }
        return zzjj.zzf;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) throws GeneralSecurityException {
        return zzf(bArr, zzjj.zzf(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] zze(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zzg(zzjj.zze(str, bArr2, bArr3), bArr);
    }
}
