package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzer extends zzki {
    final /* synthetic */ zzes zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzes zzesVar, Class cls) {
        super(cls);
        this.zza = zzesVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzpq zzb = zzpr.zzb();
        byte[] zza = zzvs.zza(((zzpu) zzahpVar).zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzb(0);
        return (zzpr) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzpu.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzes.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzes.zzg(16, 3));
        hashMap.put("AES256_GCM", zzes.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzes.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzvu.zzb(((zzpu) zzahpVar).zza());
    }
}
