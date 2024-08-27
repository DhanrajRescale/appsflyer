package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzdf extends zzki {
    final /* synthetic */ zzdg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdg zzdgVar, Class cls) {
        super(cls);
        this.zza = zzdgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzow zzowVar = (zzow) zzahpVar;
        new zzdu();
        zzoz zzf = zzdt.zzf(zzowVar.zzd());
        zzahp zza = new zznc().zza().zza(zzowVar.zze());
        zzos zzb = zzot.zzb();
        zzb.zza(zzf);
        zzb.zzb((zzrq) zza);
        zzb.zzc(0);
        return (zzot) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzow.zzc(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzdg.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzdg.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzdg.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdg.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzow zzowVar = (zzow) zzahpVar;
        ((zzdt) new zzdu().zza()).zzd(zzowVar.zzd());
        new zznc().zza().zzd(zzowVar.zze());
        zzvu.zzb(zzowVar.zzd().zza());
    }
}
