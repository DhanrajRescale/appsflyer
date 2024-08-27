package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jr.h;
import nn.d;

/* loaded from: classes2.dex */
public final class zzfu extends zzcu {
    private final zzfz zza;
    private final zzvy zzb;
    private final zzvx zzc;
    private final Integer zzd;

    private zzfu(zzfz zzfzVar, zzvy zzvyVar, zzvx zzvxVar, Integer num) {
        this.zza = zzfzVar;
        this.zzb = zzvyVar;
        this.zzc = zzvxVar;
        this.zzd = num;
    }

    public static zzfu zza(zzfy zzfyVar, zzvy zzvyVar, Integer num) throws GeneralSecurityException {
        zzvx zzb;
        zzfy zzfyVar2 = zzfy.zzc;
        if (zzfyVar != zzfyVar2 && num == null) {
            throw new GeneralSecurityException(d.k("For given Variant ", zzfyVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzfyVar == zzfyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzvyVar.zza() == 32) {
            zzfz zzb2 = zzfz.zzb(zzfyVar);
            if (zzb2.zza() == zzfyVar2) {
                zzb = zzvx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzfy.zzb) {
                zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzfy.zza) {
                zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzfu(zzb2, zzvyVar, zzb, num);
        }
        throw new GeneralSecurityException(h.n("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzvyVar.zza()));
    }
}
