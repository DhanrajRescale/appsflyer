package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzhm {
    private zzhw zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzhm(zzhl zzhlVar) {
    }

    public final zzhm zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhm zzb(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzhm zzc(zzhw zzhwVar) {
        this.zza = zzhwVar;
        return this;
    }

    public final zzho zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzhw zzhwVar = this.zza;
        if (zzhwVar != null && (zzvyVar = this.zzb) != null) {
            if (zzhwVar.zza() == zzvyVar.zza()) {
                if (zzhwVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzhu.zzc) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzhu.zzb) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzhu.zza) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzho(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new IllegalArgumentException("Cannot build without parameters and/or key material");
    }

    private zzhm() {
    }
}
