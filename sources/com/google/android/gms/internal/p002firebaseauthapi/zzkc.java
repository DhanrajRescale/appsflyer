package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzkc {
    private final zzvx zza;
    private final Class zzb;

    public /* synthetic */ zzkc(zzvx zzvxVar, Class cls, zzkb zzkbVar) {
        this.zza = zzvxVar;
        this.zzb = cls;
    }

    public static zzkc zzb(zzka zzkaVar, zzvx zzvxVar, Class cls) {
        return new zzjz(zzvxVar, cls, zzkaVar);
    }

    public abstract zzbl zza(zzlp zzlpVar, zzcr zzcrVar) throws GeneralSecurityException;

    public final zzvx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
