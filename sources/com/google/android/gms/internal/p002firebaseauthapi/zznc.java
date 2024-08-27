package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zznc extends zzkj {
    private static final zzlf zza = zzlf.zzb(new zzld() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmz
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzld
        public final Object zza(zzbl zzblVar) {
            return new zznw((zzmy) zzblVar);
        }
    }, zzmy.class, zzmr.class);

    public zznc() {
        super(zzrq.class, new zzna(zzcd.class));
    }

    public static void zzh(boolean z10) throws GeneralSecurityException {
        zzcq.zzi(new zznc(), true);
        int i10 = zznn.zza;
        zznn.zza(zzkt.zzb());
        zzks.zza().zze(zza);
    }

    public static final void zzi(zzrq zzrqVar) throws GeneralSecurityException {
        zzvu.zzc(zzrqVar.zza(), 0);
        if (zzrqVar.zzg().zzd() >= 16) {
            zzo(zzrqVar.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static /* bridge */ /* synthetic */ zzkh zzn(int i10, int i11, int i12, int i13) {
        zzrs zzb = zzrt.zzb();
        zzrv zzb2 = zzrw.zzb();
        zzb2.zzb(i12);
        zzb2.zza(i11);
        zzb.zzb((zzrw) zzb2.zzi());
        zzb.zza(i10);
        return new zzkh((zzrt) zzb.zzi(), i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzrw zzrwVar) throws GeneralSecurityException {
        if (zzrwVar.zza() >= 10) {
            int zzf = zzrwVar.zzf() - 2;
            if (zzf != 1) {
                if (zzf != 2) {
                    if (zzf != 3) {
                        if (zzf != 4) {
                            if (zzf == 5) {
                                if (zzrwVar.zza() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (zzrwVar.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (zzrwVar.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (zzrwVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (zzrwVar.zza() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zznb(this, zzrt.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzrq.zze(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzi((zzrq) zzahpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final int zzf() {
        return 2;
    }
}
