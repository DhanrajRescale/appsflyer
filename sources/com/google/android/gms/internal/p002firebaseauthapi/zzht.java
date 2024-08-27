package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzht {
    private Integer zza;
    private zzhu zzb;

    public /* synthetic */ zzht(zzhs zzhsVar) {
        this.zza = null;
        this.zzb = zzhu.zzc;
    }

    public final zzht zza(int i10) throws GeneralSecurityException {
        if (i10 != 32 && i10 != 48 && i10 != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzht zzb(zzhu zzhuVar) {
        this.zzb = zzhuVar;
        return this;
    }

    public final zzhw zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzhw(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzht() {
        this.zza = null;
        throw null;
    }
}
