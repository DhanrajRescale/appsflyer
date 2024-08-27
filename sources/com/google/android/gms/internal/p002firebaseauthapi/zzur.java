package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzur {
    private final ECPrivateKey zza;

    public zzur(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, int i11) throws GeneralSecurityException {
        byte[] zzf = zzut.zzf(this.zza, zzut.zzh(this.zza.getParams(), i11, bArr));
        int i12 = 1;
        byte[] zzb = zzum.zzb(bArr, zzf);
        Mac mac = (Mac) zzvc.zzb.zza(str);
        if (i10 <= mac.getMacLength() * 255) {
            if (bArr2 != null && bArr2.length != 0) {
                mac.init(new SecretKeySpec(bArr2, str));
            } else {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            }
            byte[] doFinal = mac.doFinal(zzb);
            byte[] bArr4 = new byte[i10];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i13 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update((byte[]) null);
                mac.update((byte) i12);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i14 = i13 + length;
                if (i14 < i10) {
                    System.arraycopy(bArr5, 0, bArr4, i13, length);
                    i12++;
                    i13 = i14;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i13, i10 - i13);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
