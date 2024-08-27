package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzfl {
    private Integer zza;
    private zzfm zzb;

    public /* synthetic */ zzfl(zzfk zzfkVar) {
        this.zza = null;
        this.zzb = zzfm.zzc;
    }

    public final zzfl zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzfl zzb(zzfm zzfmVar) {
        this.zzb = zzfmVar;
        return this;
    }

    public final zzfo zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzfo(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzfl() {
        this.zza = null;
        throw null;
    }
}
