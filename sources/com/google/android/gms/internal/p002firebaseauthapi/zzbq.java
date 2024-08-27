package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbq implements zzbr {
    final /* synthetic */ zzlm zza;
    final /* synthetic */ zzkj zzb;

    public zzbq(zzlm zzlmVar, zzkj zzkjVar) {
        this.zza = zzlmVar;
        this.zzb = zzkjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final zzbm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzco(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final zzbm zzb() {
        zzlm zzlmVar = this.zza;
        return new zzco(zzlmVar, this.zzb, zzlmVar.zzj());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbr
    public final Set zze() {
        return this.zza.zzm();
    }
}
