package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import jr.h;
import nn.d;

/* loaded from: classes2.dex */
public final class zzgm extends zzcu {
    private final zzgr zza;
    private final zzvy zzb;
    private final zzvx zzc;
    private final Integer zzd;

    private zzgm(zzgr zzgrVar, zzvy zzvyVar, zzvx zzvxVar, Integer num) {
        this.zza = zzgrVar;
        this.zzb = zzvyVar;
        this.zzc = zzvxVar;
        this.zzd = num;
    }

    public static zzgm zza(zzgq zzgqVar, zzvy zzvyVar, Integer num) throws GeneralSecurityException {
        zzvx zzb;
        zzgq zzgqVar2 = zzgq.zzc;
        if (zzgqVar != zzgqVar2 && num == null) {
            throw new GeneralSecurityException(d.k("For given Variant ", zzgqVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgqVar == zzgqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzvyVar.zza() == 32) {
            zzgr zzb2 = zzgr.zzb(zzgqVar);
            if (zzb2.zza() == zzgqVar2) {
                zzb = zzvx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzgq.zzb) {
                zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzgq.zza) {
                zzb = zzvx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzgm(zzb2, zzvyVar, zzb, num);
        }
        throw new GeneralSecurityException(h.n("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzvyVar.zza()));
    }
}
