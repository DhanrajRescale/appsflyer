package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdw {
    private zzeg zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzdw(zzdv zzdvVar) {
    }

    public final zzdw zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzdw zzb(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzdw zzc(zzeg zzegVar) {
        this.zza = zzegVar;
        return this;
    }

    public final zzdy zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzeg zzegVar = this.zza;
        if (zzegVar != null && (zzvyVar = this.zzb) != null) {
            if (zzegVar.zza() == zzvyVar.zza()) {
                if (zzegVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzee.zzc) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzee.zzb) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzee.zza) {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzdy(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzdw() {
    }
}
