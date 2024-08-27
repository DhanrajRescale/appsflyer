package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzdu extends zzkj {
    public zzdu() {
        super(zzoz.class, new zzds(zzvm.class));
    }

    public static final void zzh(zzoz zzozVar) throws GeneralSecurityException {
        zzvu.zzc(zzozVar.zza(), 0);
        zzvu.zzb(zzozVar.zzg().zzd());
        zzi(zzozVar.zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzi(zzpf zzpfVar) throws GeneralSecurityException {
        if (zzpfVar.zza() >= 12 && zzpfVar.zza() <= 16) {
        } else {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzdt(this, zzpc.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzoz.zze(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzh((zzoz) zzahpVar);
    }
}
