package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes2.dex */
public final class zzuq implements zzbk {
    private final zzus zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzuo zzd;

    public zzuq(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, zzuo zzuoVar) throws GeneralSecurityException {
        zzjx.zzb(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzus(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzuoVar;
    }
}
