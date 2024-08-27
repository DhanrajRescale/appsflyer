package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzeu {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzev zzd;

    public /* synthetic */ zzeu(zzet zzetVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzev.zzc;
    }

    public final zzeu zza(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzeu zzb(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzeu zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzeu zzd(zzev zzevVar) {
        this.zzd = zzevVar;
        return this;
    }

    public final zzex zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzex(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzeu() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}
