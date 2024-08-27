package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class zzvq implements zzcd {
    private final zzoh zza;
    private final int zzb;

    public zzvq(zzoh zzohVar, int i10) throws GeneralSecurityException {
        this.zza = zzohVar;
        this.zzb = i10;
        if (i10 >= 10) {
            zzohVar.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (MessageDigest.isEqual(this.zza.zza(bArr2, this.zzb), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
