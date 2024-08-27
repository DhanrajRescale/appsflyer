package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzeb extends zzkj {
    public zzeb() {
        super(zzpi.class, new zzdz(zzbd.class));
    }

    public static /* bridge */ /* synthetic */ zzkh zzg(int i10, int i11, int i12) {
        zzpk zzb = zzpl.zzb();
        zzb.zza(i10);
        zzpn zzb2 = zzpo.zzb();
        zzb2.zza(16);
        zzb.zzb((zzpo) zzb2.zzi());
        return new zzkh((zzpl) zzb.zzi(), i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzea(this, zzpl.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzpi.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzpi zzpiVar = (zzpi) zzahpVar;
        zzvu.zzc(zzpiVar.zza(), 0);
        zzvu.zzb(zzpiVar.zzf().zzd());
        if (zzpiVar.zze().zza() != 12 && zzpiVar.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
