package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdb {
    private zzdm zza = null;
    private zzvy zzb = null;
    private zzvy zzc = null;
    private Integer zzd = null;

    public /* synthetic */ zzdb(zzda zzdaVar) {
    }

    public final zzdb zza(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzdb zzb(zzvy zzvyVar) {
        this.zzc = zzvyVar;
        return this;
    }

    public final zzdb zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzdb zzd(zzdm zzdmVar) {
        this.zza = zzdmVar;
        return this;
    }

    public final zzdd zze() throws GeneralSecurityException {
        zzvx zzb;
        zzdm zzdmVar = this.zza;
        if (zzdmVar != null) {
            zzvy zzvyVar = this.zzb;
            if (zzvyVar != null && this.zzc != null) {
                if (zzdmVar.zza() == zzvyVar.zza()) {
                    if (zzdmVar.zzb() == this.zzc.zza()) {
                        if (this.zza.zzd() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zzd() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzc() == zzdk.zzc) {
                            zzb = zzvx.zzb(new byte[0]);
                        } else if (this.zza.zzc() == zzdk.zzb) {
                            zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                        } else if (this.zza.zzc() == zzdk.zza) {
                            zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                        }
                        return new zzdd(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    private zzdb() {
    }
}
