package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzic {
    public static final String zza;

    @Deprecated
    static final zzty zzb;

    @Deprecated
    static final zzty zzc;

    static {
        new zzhr();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzty.zzb();
        zzc = zzty.zzb();
        try {
            zzig.zze();
            if (zzhk.zzb()) {
                return;
            }
            zzcq.zzi(new zzhr(), true);
            int i10 = zzib.zza;
            zzib.zzb(zzkt.zzb());
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
