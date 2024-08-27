package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zziz implements zzbj {
    private static final byte[] zza = new byte[0];
    private final zzjc zzb;
    private final zzjb zzc;
    private final zzix zzd;
    private final int zze;
    private final zziw zzf;

    private zziz(zzjc zzjcVar, zzjb zzjbVar, zziw zziwVar, zzix zzixVar, int i10) {
        this.zzb = zzjcVar;
        this.zzc = zzjbVar;
        this.zzf = zziwVar;
        this.zzd = zzixVar;
        this.zze = i10;
    }

    public static zziz zzb(zzsh zzshVar) throws GeneralSecurityException {
        int i10;
        zzjc zzc;
        if (zzshVar.zzk()) {
            if (zzshVar.zze().zzl()) {
                if (!zzshVar.zzf().zzp()) {
                    zzse zzb = zzshVar.zze().zzb();
                    zzjb zzb2 = zzjd.zzb(zzb);
                    zziw zzc2 = zzjd.zzc(zzb);
                    zzix zza2 = zzjd.zza(zzb);
                    int zzf = zzb.zzf();
                    int i11 = zzf - 2;
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    i10 = 133;
                                } else {
                                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzry.zza(zzf)));
                                }
                            } else {
                                i10 = 97;
                            }
                        } else {
                            i10 = 65;
                        }
                    } else {
                        i10 = 32;
                    }
                    int zzf2 = zzshVar.zze().zzb().zzf() - 2;
                    if (zzf2 != 1) {
                        if (zzf2 != 2 && zzf2 != 3 && zzf2 != 4) {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        zzc = zzjl.zzc(zzshVar.zzf().zzq(), zzshVar.zze().zzg().zzq(), zzjj.zzg(zzshVar.zze().zzb().zzf()));
                    } else {
                        zzc = zzjn.zzc(zzshVar.zzf().zzq());
                    }
                    return new zziz(zzc, zzb2, zzc2, zza2, i10);
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zze;
        if (length >= i10) {
            byte[] copyOf = Arrays.copyOf(bArr, i10);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zze, length);
            zzjc zzjcVar = this.zzb;
            zzjb zzjbVar = this.zzc;
            zziw zziwVar = this.zzf;
            zzix zzixVar = this.zzd;
            return zziy.zzb(copyOf, zzjbVar.zza(copyOf, zzjcVar), zzjbVar, zziwVar, zzixVar, new byte[0]).zza(copyOfRange, zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
