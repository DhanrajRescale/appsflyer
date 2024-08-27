package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzgk extends zzki {
    final /* synthetic */ zzgl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgk(zzgl zzglVar, Class cls) {
        super(cls);
        this.zza = zzglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zztp zzb = zztq.zzb();
        zzb.zza((zztt) zzahpVar);
        zzb.zzb(0);
        return (zztq) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zztt.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zztt zzttVar = (zztt) zzahpVar;
        if (!zzttVar.zze().isEmpty() && zzttVar.zzf()) {
        } else {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
