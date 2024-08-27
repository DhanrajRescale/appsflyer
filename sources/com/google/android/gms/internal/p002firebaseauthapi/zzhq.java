package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jr.h;

/* loaded from: classes2.dex */
final class zzhq extends zzki {
    final /* synthetic */ zzhr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhq(zzhr zzhrVar, Class cls) {
        super(cls);
        this.zza = zzhrVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzqc zzb = zzqd.zzb();
        byte[] zza = zzvs.zza(((zzqg) zzahpVar).zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzb(0);
        return (zzqd) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzqg.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzqf zzb = zzqg.zzb();
        zzb.zza(64);
        hashMap.put("AES256_SIV", new zzkh((zzqg) zzb.zzi(), 1));
        zzqf zzb2 = zzqg.zzb();
        zzb2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzkh((zzqg) zzb2.zzi(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzqg zzqgVar = (zzqg) zzahpVar;
        if (zzqgVar.zza() == 64) {
        } else {
            throw new InvalidAlgorithmParameterException(h.o("invalid key size: ", zzqgVar.zza(), ". Valid keys must have 64 bytes."));
        }
    }
}
