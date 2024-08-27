package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzea extends zzki {
    final /* synthetic */ zzeb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzeb zzebVar, Class cls) {
        super(cls);
        this.zza = zzebVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzpl zzplVar = (zzpl) zzahpVar;
        zzph zzb = zzpi.zzb();
        byte[] zza = zzvs.zza(zzplVar.zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzb(zzplVar.zze());
        zzb.zzc(0);
        return (zzpi) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzpl.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzeb.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzeb.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzeb.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzeb.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzpl zzplVar = (zzpl) zzahpVar;
        zzvu.zzb(zzplVar.zza());
        if (zzplVar.zze().zza() != 12 && zzplVar.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
