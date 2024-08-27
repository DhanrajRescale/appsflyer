package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbp implements zzbr {
    final /* synthetic */ zzkj zza;

    public zzbp(zzkj zzkjVar) {
        this.zza = zzkjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final zzbm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbo(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final zzbm zzb() {
        zzkj zzkjVar = this.zza;
        return new zzbo(zzkjVar, zzkjVar.zzj());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Set zze() {
        return this.zza.zzm();
    }
}
