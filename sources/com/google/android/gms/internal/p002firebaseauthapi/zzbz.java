package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzbz {
    private final zzsz zza;

    private zzbz(zzsz zzszVar) {
        this.zza = zzszVar;
    }

    public static zzbz zze() {
        return new zzbz(zztc.zzc());
    }

    public static zzbz zzf(zzby zzbyVar) {
        return new zzbz((zzsz) zzbyVar.zzc().zzu());
    }

    private final synchronized int zzg() {
        int zza;
        zza = zzly.zza();
        while (zzj(zza)) {
            zza = zzly.zza();
        }
        return zza;
    }

    private final synchronized zztb zzh(zzsp zzspVar, zztv zztvVar) throws GeneralSecurityException {
        zzta zzc;
        int zzg = zzg();
        if (zztvVar != zztv.UNKNOWN_PREFIX) {
            zzc = zztb.zzc();
            zzc.zza(zzspVar);
            zzc.zzb(zzg);
            zzc.zzd(3);
            zzc.zzc(zztvVar);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zztb) zzc.zzi();
    }

    private final synchronized zztb zzi(zzsu zzsuVar) throws GeneralSecurityException {
        return zzh(zzcq.zzb(zzsuVar), zzsuVar.zzd());
    }

    private final synchronized boolean zzj(int i10) {
        Iterator it = this.zza.zze().iterator();
        while (it.hasNext()) {
            if (((zztb) it.next()).zza() == i10) {
                return true;
            }
        }
        return false;
    }

    public final synchronized int zza(zzsu zzsuVar, boolean z10) throws GeneralSecurityException {
        zztb zzi;
        zzi = zzi(zzsuVar);
        this.zza.zzb(zzi);
        return zzi.zza();
    }

    public final synchronized zzby zzb() throws GeneralSecurityException {
        return zzby.zza((zztc) this.zza.zzi());
    }

    public final synchronized zzbz zzc(zzbu zzbuVar) throws GeneralSecurityException {
        zza(zzbuVar.zza(), false);
        return this;
    }

    public final synchronized zzbz zzd(int i10) throws GeneralSecurityException {
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zztb zzd = this.zza.zzd(i11);
            if (zzd.zza() == i10) {
                if (zzd.zzk() == 3) {
                    this.zza.zzc(i10);
                } else {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }
}
