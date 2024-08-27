package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzjg extends zzlm {
    public zzjg() {
        super(zzsh.class, zzsk.class, new zzje(zzbj.class));
    }

    public static /* bridge */ /* synthetic */ zzkh zzh(int i10, int i11, int i12, int i13) {
        zzsd zza = zzse.zza();
        zza.zzc(i10);
        zza.zzb(i11);
        zza.zza(i12);
        zzse zzseVar = (zzse) zza.zzi();
        zzsa zza2 = zzsb.zza();
        zza2.zza(zzseVar);
        return new zzkh((zzsb) zza2.zzi(), i13);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzjf(this, zzsb.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzsh.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzsh zzshVar = (zzsh) zzahpVar;
        if (!zzshVar.zzf().zzp()) {
            if (zzshVar.zzk()) {
                zzvu.zzc(zzshVar.zza(), 0);
                zzjj.zza(zzshVar.zze().zzb());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlm
    public final /* synthetic */ zzahp zzg(zzahp zzahpVar) throws GeneralSecurityException {
        return ((zzsh) zzahpVar).zze();
    }
}
