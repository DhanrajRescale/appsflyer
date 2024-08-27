package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzen {
    private zzex zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzen(zzem zzemVar) {
    }

    public final zzen zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzen zzb(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzen zzc(zzex zzexVar) {
        this.zza = zzexVar;
        return this;
    }

    public final zzep zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzex zzexVar = this.zza;
        if (zzexVar != null && (zzvyVar = this.zzb) != null) {
            if (zzexVar.zza() == zzvyVar.zza()) {
                if (zzexVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzev.zzc) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzev.zzb) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzev.zza) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzep(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzen() {
    }
}
