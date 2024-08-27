package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zznw implements zzmr {
    private final zzmy zza;

    public zznw(zzmy zzmyVar) throws GeneralSecurityException {
        if (zzhj.zza(2)) {
            this.zza = zzmyVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
