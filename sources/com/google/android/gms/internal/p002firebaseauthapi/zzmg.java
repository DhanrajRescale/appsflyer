package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzmg extends zzkj {
    private static final zzlf zza = zzlf.zzb(new zzld() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmd
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzld
        public final Object zza(zzbl zzblVar) {
            return new zznv((zzmc) zzblVar);
        }
    }, zzmc.class, zzmr.class);

    public zzmg() {
        super(zzok.class, new zzme(zzcd.class));
    }

    public static void zzi(boolean z10) throws GeneralSecurityException {
        zzcq.zzi(new zzmg(), true);
        int i10 = zzmq.zza;
        zzmq.zza(zzkt.zzb());
        zzks.zza().zze(zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzoq zzoqVar) throws GeneralSecurityException {
        if (zzoqVar.zza() >= 10) {
            if (zzoqVar.zza() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i10) throws GeneralSecurityException {
        if (i10 == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzmf(this, zzon.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzok.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzok zzokVar = (zzok) zzahpVar;
        zzvu.zzc(zzokVar.zza(), 0);
        zzo(zzokVar.zzf().zzd());
        zzn(zzokVar.zze());
    }
}
