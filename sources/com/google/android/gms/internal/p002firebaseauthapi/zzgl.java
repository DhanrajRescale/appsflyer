package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgl extends zzkj {
    public zzgl() {
        super(zztq.class, new zzgj(zzbd.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzgk(this, zztt.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.REMOTE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zztq.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzvu.zzc(((zztq) zzahpVar).zza(), 0);
    }
}
