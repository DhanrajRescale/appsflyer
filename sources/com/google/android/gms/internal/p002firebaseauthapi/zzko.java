package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzko {
    public static final zzoa zza = new zzkn(null);

    public static zzog zza(zzcl zzclVar) {
        zzbt zzbtVar;
        zzoc zzocVar = new zzoc();
        zzocVar.zzb(zzclVar.zzb());
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzch zzchVar : (List) it.next()) {
                int zzh = zzchVar.zzh() - 2;
                if (zzh != 1) {
                    if (zzh != 2) {
                        if (zzh == 3) {
                            zzbtVar = zzbt.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzbtVar = zzbt.zzb;
                    }
                } else {
                    zzbtVar = zzbt.zza;
                }
                int zza2 = zzchVar.zza();
                String zzf = zzchVar.zzf();
                if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                    zzf = zzf.substring(34);
                }
                zzocVar.zza(zzbtVar, zza2, zzf, zzchVar.zzc().name());
            }
        }
        if (zzclVar.zza() != null) {
            zzocVar.zzc(zzclVar.zza().zza());
        }
        try {
            return zzocVar.zzd();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
