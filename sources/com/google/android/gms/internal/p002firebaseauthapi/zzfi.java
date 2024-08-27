package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzfi extends zzki {
    final /* synthetic */ zzfj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfi(zzfj zzfjVar, Class cls) {
        super(cls);
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzpw zzb = zzpx.zzb();
        byte[] zza = zzvs.zza(((zzqa) zzahpVar).zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzb(0);
        return (zzpx) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzqa.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfj.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfj.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfj.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfj.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzvu.zzb(((zzqa) zzahpVar).zza());
    }
}
