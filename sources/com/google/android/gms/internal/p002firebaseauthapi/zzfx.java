package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzfx extends zzkj {
    public zzfx() {
        super(zzqj.class, new zzfv(zzbd.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzfw(this, zzqm.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzqj.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzqj zzqjVar = (zzqj) zzahpVar;
        zzvu.zzc(zzqjVar.zza(), 0);
        if (zzqjVar.zze().zzd() == 32) {
        } else {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
