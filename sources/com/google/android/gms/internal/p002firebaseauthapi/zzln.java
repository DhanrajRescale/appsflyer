package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzln implements zzlp {
    private final String zza;
    private final zzvx zzb;
    private final zzaff zzc;
    private final zzso zzd;
    private final zztv zze;
    private final Integer zzf;

    private zzln(String str, zzaff zzaffVar, zzso zzsoVar, zztv zztvVar, Integer num) {
        this.zza = str;
        this.zzb = zzly.zzb(str);
        this.zzc = zzaffVar;
        this.zzd = zzsoVar;
        this.zze = zztvVar;
        this.zzf = num;
    }

    public static zzln zza(String str, zzaff zzaffVar, zzso zzsoVar, zztv zztvVar, Integer num) throws GeneralSecurityException {
        if (zztvVar == zztv.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzln(str, zzaffVar, zzsoVar, zztvVar, num);
    }

    public final zzso zzb() {
        return this.zzd;
    }

    public final zztv zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlp
    public final zzvx zzd() {
        return this.zzb;
    }

    public final zzaff zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
