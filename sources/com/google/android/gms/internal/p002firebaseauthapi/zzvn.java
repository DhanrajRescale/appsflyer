package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzvn implements zzoh {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzvn(byte[] bArr) throws GeneralSecurityException {
        zzvu.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zzb2 = zznu.zzb(zzb.doFinal(new byte[16]));
        this.zzb = zzb2;
        this.zzc = zznu.zzb(zzb2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzhj.zza(1)) {
            return (Cipher) zzvc.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzoh
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] zzc;
        if (i10 <= 16) {
            Cipher zzb = zzb();
            zzb.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            if (max * 16 == length) {
                zzc = zzum.zzd(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                zzc = zzum.zzc(zznu.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            }
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = zzb.doFinal(zzum.zzd(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzum.zzc(zzc, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
