package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes2.dex */
public final class zzfj extends zzkj {
    public zzfj() {
        super(zzpx.class, new zzfh(zzbd.class));
    }

    public static void zzg(boolean z10) throws GeneralSecurityException {
        if (zzi()) {
            zzcq.zzi(new zzfj(), true);
            int i10 = zzft.zza;
            zzft.zza(zzkt.zzb());
        }
    }

    public static /* bridge */ /* synthetic */ zzkh zzh(int i10, int i11) {
        zzpz zzb = zzqa.zzb();
        zzb.zza(i10);
        return new zzkh((zzqa) zzb.zzi(), i11);
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzfi(this, zzqa.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzpx.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzpx zzpxVar = (zzpx) zzahpVar;
        zzvu.zzc(zzpxVar.zza(), 0);
        zzvu.zzb(zzpxVar.zze().zzd());
    }
}
