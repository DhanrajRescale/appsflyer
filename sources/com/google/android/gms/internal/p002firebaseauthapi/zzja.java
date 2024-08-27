package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzja implements zzbk {
    private final zzsk zza;
    private final zzjb zzb;
    private final zzix zzc;
    private final zziw zzd;

    private zzja(zzsk zzskVar, zzjb zzjbVar, zziw zziwVar, zzix zzixVar) {
        this.zza = zzskVar;
        this.zzb = zzjbVar;
        this.zzd = zziwVar;
        this.zzc = zzixVar;
    }

    public static zzja zza(zzsk zzskVar) throws GeneralSecurityException {
        if (!zzskVar.zzg().zzp()) {
            zzse zzb = zzskVar.zzb();
            return new zzja(zzskVar, zzjd.zzb(zzb), zzjd.zzc(zzb), zzjd.zza(zzb));
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
