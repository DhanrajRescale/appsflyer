package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzno {

    @Deprecated
    static final zzty zza;

    @Deprecated
    static final zzty zzb;

    @Deprecated
    static final zzty zzc;

    static {
        new zznc();
        zzty zzb2 = zzty.zzb();
        zza = zzb2;
        zzb = zzb2;
        zzc = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zznt.zze();
        zzmu.zzd();
        zznc.zzh(true);
        if (zzhk.zzb()) {
            return;
        }
        zzmg.zzi(true);
    }
}
