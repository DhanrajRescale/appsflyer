package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzma {
    private zzml zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzma(zzlz zzlzVar) {
    }

    public final zzma zza(zzvy zzvyVar) throws GeneralSecurityException {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzma zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzma zzc(zzml zzmlVar) {
        this.zza = zzmlVar;
        return this;
    }

    public final zzmc zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzml zzmlVar = this.zza;
        if (zzmlVar != null && (zzvyVar = this.zzb) != null) {
            if (zzmlVar.zza() == zzvyVar.zza()) {
                if (zzmlVar.zzd() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzd() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzc() == zzmj.zzd) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzc() != zzmj.zzc && this.zza.zzc() != zzmj.zzb) {
                    if (this.zza.zzc() == zzmj.zza) {
                        zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                    }
                } else {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzmc(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzma() {
    }
}
