package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcs {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzth zza(zztc zztcVar) {
        zzte zza2 = zzth.zza();
        zza2.zzb(zztcVar.zzb());
        for (zztb zztbVar : zztcVar.zzh()) {
            zztf zzb = zztg.zzb();
            zzb.zzc(zztbVar.zzb().zzf());
            zzb.zzd(zztbVar.zzk());
            zzb.zzb(zztbVar.zze());
            zzb.zza(zztbVar.zza());
            zza2.zza((zztg) zzb.zzi());
        }
        return (zzth) zza2.zzi();
    }
}
