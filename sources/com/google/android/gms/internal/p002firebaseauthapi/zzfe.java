package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzfe {
    private zzfo zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzfe(zzfd zzfdVar) {
    }

    public final zzfe zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzfe zzb(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzfe zzc(zzfo zzfoVar) {
        this.zza = zzfoVar;
        return this;
    }

    public final zzfg zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzfo zzfoVar = this.zza;
        if (zzfoVar != null && (zzvyVar = this.zzb) != null) {
            if (zzfoVar.zza() == zzvyVar.zza()) {
                if (zzfoVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzfm.zzc) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzfm.zzb) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzfm.zza) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzfg(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzfe() {
    }
}
