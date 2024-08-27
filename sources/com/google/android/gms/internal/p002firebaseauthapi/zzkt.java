package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzkt {
    private static final zzkt zza = new zzkt();
    private final AtomicReference zzb = new AtomicReference(new zzlw(new zzlq(), null));

    public static zzkt zzb() {
        return zza;
    }

    public final zzbl zza(zzln zzlnVar, zzcr zzcrVar) throws GeneralSecurityException {
        if (!((zzlw) this.zzb.get()).zzf(zzlnVar)) {
            try {
                return new zzkl(zzlnVar, zzcrVar);
            } catch (GeneralSecurityException e10) {
                throw new zzlx("Creating a LegacyProtoKey failed", e10);
            }
        }
        return ((zzlw) this.zzb.get()).zza(zzlnVar, zzcrVar);
    }

    public final synchronized void zzc(zzkc zzkcVar) throws GeneralSecurityException {
        zzlq zzlqVar = new zzlq((zzlw) this.zzb.get());
        zzlqVar.zza(zzkcVar);
        this.zzb.set(new zzlw(zzlqVar, null));
    }

    public final synchronized void zzd(zzkg zzkgVar) throws GeneralSecurityException {
        zzlq zzlqVar = new zzlq((zzlw) this.zzb.get());
        zzlqVar.zzb(zzkgVar);
        this.zzb.set(new zzlw(zzlqVar, null));
    }

    public final synchronized void zze(zzkx zzkxVar) throws GeneralSecurityException {
        zzlq zzlqVar = new zzlq((zzlw) this.zzb.get());
        zzlqVar.zzc(zzkxVar);
        this.zzb.set(new zzlw(zzlqVar, null));
    }

    public final synchronized void zzf(zzlb zzlbVar) throws GeneralSecurityException {
        zzlq zzlqVar = new zzlq((zzlw) this.zzb.get());
        zzlqVar.zzd(zzlbVar);
        this.zzb.set(new zzlw(zzlqVar, null));
    }
}
