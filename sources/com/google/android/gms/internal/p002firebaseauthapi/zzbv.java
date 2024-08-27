package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzbv {
    public static zzbu zza(String str) throws GeneralSecurityException {
        zzbu zzbuVar = (zzbu) zzcq.zzg().get(str);
        if (zzbuVar != null) {
            return zzbuVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
