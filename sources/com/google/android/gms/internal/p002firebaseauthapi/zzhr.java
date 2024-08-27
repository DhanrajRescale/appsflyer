package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import jr.h;

/* loaded from: classes2.dex */
public final class zzhr extends zzkj {
    public zzhr() {
        super(zzqd.class, new zzhp(zzbi.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzhq(this, zzqg.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzqd.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzqd zzqdVar = (zzqd) zzahpVar;
        zzvu.zzc(zzqdVar.zza(), 0);
        if (zzqdVar.zze().zzd() == 64) {
        } else {
            throw new InvalidKeyException(h.o("invalid key size: ", zzqdVar.zze().zzd(), ". Valid keys must have 64 bytes."));
        }
    }
}
