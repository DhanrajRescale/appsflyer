package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzjd {
    public static zzix zza(zzse zzseVar) throws GeneralSecurityException {
        if (zzseVar.zzd() == 3) {
            return new zziu(16);
        }
        if (zzseVar.zzd() == 4) {
            return new zziu(32);
        }
        if (zzseVar.zzd() == 5) {
            return new zziv();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzjb zzb(zzse zzseVar) throws GeneralSecurityException {
        if (zzseVar.zzf() == 3) {
            return new zzjm(new zziw("HmacSha256"));
        }
        if (zzseVar.zzf() == 4) {
            return zzjk.zzc(1);
        }
        if (zzseVar.zzf() == 5) {
            return zzjk.zzc(2);
        }
        if (zzseVar.zzf() == 6) {
            return zzjk.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static zziw zzc(zzse zzseVar) {
        if (zzseVar.zze() == 3) {
            return new zziw("HmacSha256");
        }
        if (zzseVar.zze() == 4) {
            return new zziw("HmacSha384");
        }
        if (zzseVar.zze() == 5) {
            return new zziw("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
