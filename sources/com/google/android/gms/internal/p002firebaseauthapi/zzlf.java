package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class zzlf {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzlf(Class cls, Class cls2, zzle zzleVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzlf zzb(zzld zzldVar, Class cls, Class cls2) {
        return new zzlc(cls, cls2, zzldVar);
    }

    public abstract Object zza(zzbl zzblVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
