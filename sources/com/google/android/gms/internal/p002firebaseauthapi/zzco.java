package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzco extends zzbo implements zzcn {
    private final zzlm zza;
    private final zzkj zzb;

    public zzco(zzlm zzlmVar, zzkj zzkjVar, Class cls) {
        super(zzlmVar, cls);
        this.zza = zzlmVar;
        this.zzb = zzkjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcn
    public final zzsp zzf(zzaff zzaffVar) throws GeneralSecurityException {
        try {
            zzahp zzc = this.zza.zzc(zzaffVar);
            this.zza.zze(zzc);
            zzahp zzg = this.zza.zzg(zzc);
            this.zzb.zze(zzg);
            zzsm zza = zzsp.zza();
            zza.zzb(this.zzb.zzd());
            zza.zzc(zzg.zzo());
            zza.zza(this.zzb.zzb());
            return (zzsp) zza.zzi();
        } catch (zzags e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
