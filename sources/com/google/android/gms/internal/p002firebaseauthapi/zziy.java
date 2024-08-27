package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zziy {
    private static final byte[] zza = new byte[0];
    private final zzix zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zziy(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzix zzixVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzixVar;
    }

    public static zziy zzb(byte[] bArr, byte[] bArr2, zzjb zzjbVar, zziw zziwVar, zzix zzixVar, byte[] bArr3) throws GeneralSecurityException {
        byte[] zzb = zzjj.zzb(zzjbVar.zzb(), zziwVar.zzc(), zzixVar.zzb());
        byte[] bArr4 = zzjj.zzl;
        byte[] bArr5 = zza;
        byte[] zzb2 = zzum.zzb(zzjj.zza, zziwVar.zze(bArr4, bArr5, "psk_id_hash", zzb), zziwVar.zze(bArr4, bArr3, "info_hash", zzb));
        byte[] zze = zziwVar.zze(bArr2, bArr5, "secret", zzb);
        byte[] zzd = zziwVar.zzd(zze, zzb2, "key", zzb, zzixVar.zza());
        byte[] zzd2 = zziwVar.zzd(zze, zzb2, "base_nonce", zzb, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zziy(bArr, zzd, zzd2, bigInteger.shiftLeft(96).subtract(bigInteger), zzixVar);
    }

    private final synchronized byte[] zzc() throws GeneralSecurityException {
        byte[] zzc;
        try {
            byte[] bArr = this.zze;
            BigInteger bigInteger = this.zzg;
            if (bigInteger.signum() != -1) {
                byte[] byteArray = bigInteger.toByteArray();
                int length = byteArray.length;
                if (length != 12) {
                    if (length <= 13) {
                        if (length == 13) {
                            if (byteArray[0] == 0) {
                                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                            } else {
                                throw new GeneralSecurityException("integer too large");
                            }
                        } else {
                            byte[] bArr2 = new byte[12];
                            System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                            byteArray = bArr2;
                        }
                    } else {
                        throw new GeneralSecurityException("integer too large");
                    }
                }
                zzc = zzum.zzc(bArr, byteArray);
                if (this.zzg.compareTo(this.zzc) < 0) {
                    this.zzg = this.zzg.add(BigInteger.ONE);
                } else {
                    throw new GeneralSecurityException("message limit reached");
                }
            } else {
                throw new IllegalArgumentException("integer must be nonnegative");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzc;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzc(), bArr, bArr2);
    }
}
