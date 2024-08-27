package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzmw {
    private zzni zza = null;
    private zzvy zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzmw(zzmv zzmvVar) {
    }

    public final zzmw zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzmw zzb(zzvy zzvyVar) {
        this.zzb = zzvyVar;
        return this;
    }

    public final zzmw zzc(zzni zzniVar) {
        this.zza = zzniVar;
        return this;
    }

    public final zzmy zzd() throws GeneralSecurityException {
        zzvy zzvyVar;
        zzvx zzb;
        zzni zzniVar = this.zza;
        if (zzniVar != null && (zzvyVar = this.zzb) != null) {
            if (zzniVar.zza() == zzvyVar.zza()) {
                if (zzniVar.zzd() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzd() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzc() == zzng.zzd) {
                    zzb = zzvx.zzb(new byte[0]);
                } else if (this.zza.zzc() != zzng.zzc && this.zza.zzc() != zzng.zzb) {
                    if (this.zza.zzc() == zzng.zza) {
                        zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                    }
                } else {
                    zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzmy(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzmw() {
    }
}
