package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzks {
    private static final zzks zza = new zzks();
    private final AtomicReference zzb = new AtomicReference(new zzll(new zzlh(), null));

    public static zzks zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzll) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzbl zzblVar, Class cls) throws GeneralSecurityException {
        return ((zzll) this.zzb.get()).zzb(zzblVar, cls);
    }

    public final Object zzd(zzcl zzclVar, Class cls) throws GeneralSecurityException {
        return ((zzll) this.zzb.get()).zzc(zzclVar, cls);
    }

    public final synchronized void zze(zzlf zzlfVar) throws GeneralSecurityException {
        zzlh zzlhVar = new zzlh((zzll) this.zzb.get());
        zzlhVar.zza(zzlfVar);
        this.zzb.set(new zzll(zzlhVar, null));
    }

    public final synchronized void zzf(zzcm zzcmVar) throws GeneralSecurityException {
        zzlh zzlhVar = new zzlh((zzll) this.zzb.get());
        zzlhVar.zzb(zzcmVar);
        this.zzb.set(new zzll(zzlhVar, null));
    }
}
