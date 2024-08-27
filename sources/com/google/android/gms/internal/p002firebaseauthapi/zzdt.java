package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdt extends zzki {
    final /* synthetic */ zzdu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzdu zzduVar, Class cls) {
        super(cls);
        this.zza = zzduVar;
    }

    public static final zzoz zzf(zzpc zzpcVar) throws GeneralSecurityException {
        zzoy zzb = zzoz.zzb();
        zzb.zzb(zzpcVar.zzf());
        byte[] zza = zzvs.zza(zzpcVar.zza());
        zzb.zza(zzaff.zzn(zza, 0, zza.length));
        zzb.zzc(0);
        return (zzoz) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        return zzf((zzpc) zzahpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzpc.zze(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzpc zzpcVar) throws GeneralSecurityException {
        zzvu.zzb(zzpcVar.zza());
        zzdu zzduVar = this.zza;
        zzdu.zzi(zzpcVar.zzf());
    }
}
