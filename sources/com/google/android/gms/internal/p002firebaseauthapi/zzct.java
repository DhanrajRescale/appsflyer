package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzct {
    public static final String zza;
    public static final String zzb;

    @Deprecated
    static final zzty zzc;

    @Deprecated
    static final zzty zzd;

    @Deprecated
    static final zzty zze;

    static {
        new zzdg();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzes();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzfj();
        new zzeb();
        new zzgh();
        new zzgl();
        new zzfx();
        new zzgp();
        zzty zzb2 = zzty.zzb();
        zzc = zzb2;
        zzd = zzb2;
        zze = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzcz.zze();
        zzno.zza();
        zzcq.zzi(new zzdg(), true);
        int i10 = zzdr.zza;
        zzdr.zza(zzkt.zzb());
        zzcq.zzi(new zzes(), true);
        int i11 = zzfc.zza;
        zzfc.zza(zzkt.zzb());
        if (zzhk.zzb()) {
            return;
        }
        zzcq.zzi(new zzeb(), true);
        int i12 = zzel.zza;
        zzel.zza(zzkt.zzb());
        zzfj.zzg(true);
        zzcq.zzi(new zzfx(), true);
        int i13 = zzge.zza;
        zzge.zza(zzkt.zzb());
        zzcq.zzi(new zzgh(), true);
        zzcq.zzi(new zzgl(), true);
        zzcq.zzi(new zzgp(), true);
        int i14 = zzgw.zza;
        zzgw.zza(zzkt.zzb());
    }
}
