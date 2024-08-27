package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zznv implements zzmr {
    private final zzmc zza;

    public zznv(zzmc zzmcVar) throws GeneralSecurityException {
        if (zzhj.zza(1)) {
            this.zza = zzmcVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
