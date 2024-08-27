package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zznb extends zzki {
    final /* synthetic */ zznc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznb(zznc zzncVar, Class cls) {
        super(cls);
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzrt zzrtVar = (zzrt) zzahpVar;
        zzrp zzb = zzrq.zzb();
        zzb.zzc(0);
        zzb.zzb(zzrtVar.zzf());
        byte[] zza = zzvs.zza(zzrtVar.zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        return (zzrq) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzrt.zze(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zznc.zzn(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zznc.zzn(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zznc.zzn(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zznc.zzn(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zznc.zzn(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zznc.zzn(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zznc.zzn(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zznc.zzn(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zznc.zzn(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zznc.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzrt zzrtVar = (zzrt) zzahpVar;
        if (zzrtVar.zza() >= 16) {
            zznc.zzo(zzrtVar.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
