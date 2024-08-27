package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzim {

    @Deprecated
    static final zzty zza;

    @Deprecated
    static final zzty zzb;

    @Deprecated
    static final zzty zzc;

    static {
        new zzil();
        new zzij();
        zza = zzty.zzb();
        zzb = zzty.zzb();
        zzc = zzty.zzb();
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzio.zze();
        zziq.zzd();
        zzct.zza();
        if (zzhk.zzb()) {
            return;
        }
        zzcq.zzh(new zzij(), new zzil(), true);
        zzcq.zzh(new zzjg(), new zzji(), true);
    }
}
