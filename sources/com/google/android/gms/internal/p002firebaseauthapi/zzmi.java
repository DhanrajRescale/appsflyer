package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import jr.h;

/* loaded from: classes2.dex */
public final class zzmi {
    private Integer zza;
    private Integer zzb;
    private zzmj zzc;

    public /* synthetic */ zzmi(zzmh zzmhVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzmj.zzd;
    }

    public final zzmi zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzmi zzb(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(h.n("Invalid tag size for AesCmacParameters: ", i10));
    }

    public final zzmi zzc(zzmj zzmjVar) {
        this.zzc = zzmjVar;
        return this;
    }

    public final zzml zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzml(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    private zzmi() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }
}
