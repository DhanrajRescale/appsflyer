package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzmf extends zzki {
    public zzmf(zzmg zzmgVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzon zzonVar = (zzon) zzahpVar;
        zzoj zzb = zzok.zzb();
        zzb.zzc(0);
        byte[] zza = zzvs.zza(zzonVar.zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzb(zzonVar.zze());
        return (zzok) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzon.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzom zzb = zzon.zzb();
        zzb.zza(32);
        zzop zzb2 = zzoq.zzb();
        zzb2.zza(16);
        zzb.zzb((zzoq) zzb2.zzi());
        hashMap.put("AES_CMAC", new zzkh((zzon) zzb.zzi(), 1));
        zzom zzb3 = zzon.zzb();
        zzb3.zza(32);
        zzop zzb4 = zzoq.zzb();
        zzb4.zza(16);
        zzb3.zzb((zzoq) zzb4.zzi());
        hashMap.put("AES256_CMAC", new zzkh((zzon) zzb3.zzi(), 1));
        zzom zzb5 = zzon.zzb();
        zzb5.zza(32);
        zzop zzb6 = zzoq.zzb();
        zzb6.zza(16);
        zzb5.zzb((zzoq) zzb6.zzi());
        hashMap.put("AES256_CMAC_RAW", new zzkh((zzon) zzb5.zzi(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzon zzonVar = (zzon) zzahpVar;
        zzmg.zzn(zzonVar.zze());
        zzmg.zzo(zzonVar.zza());
    }
}
