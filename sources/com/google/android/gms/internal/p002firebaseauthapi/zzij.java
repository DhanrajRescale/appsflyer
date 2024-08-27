package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzij extends zzlm {
    private static final byte[] zza = new byte[0];

    public zzij() {
        super(zzra.class, zzrd.class, new zzih(zzbj.class));
    }

    public static /* bridge */ /* synthetic */ zzkh zzi(int i10, int i11, int i12, zzbu zzbuVar, byte[] bArr, int i13) {
        zztv zztvVar;
        zzqt zza2 = zzqu.zza();
        zzrf zza3 = zzrg.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzaff.zzn(bArr, 0, 0));
        zzrg zzrgVar = (zzrg) zza3.zzi();
        zzst zza4 = zzsu.zza();
        zza4.zzb(zzbuVar.zzb());
        byte[] zzc = zzbuVar.zzc();
        zza4.zzc(zzaff.zzn(zzc, 0, zzc.length));
        int zzd = zzbuVar.zzd() - 1;
        if (zzd != 0) {
            if (zzd != 1) {
                if (zzd != 2) {
                    zztvVar = zztv.CRUNCHY;
                } else {
                    zztvVar = zztv.RAW;
                }
            } else {
                zztvVar = zztv.LEGACY;
            }
        } else {
            zztvVar = zztv.TINK;
        }
        zza4.zza(zztvVar);
        zzsu zzsuVar = (zzsu) zza4.zzi();
        zzqq zza5 = zzqr.zza();
        zza5.zza(zzsuVar);
        zzqr zzqrVar = (zzqr) zza5.zzi();
        zzqw zzb = zzqx.zzb();
        zzb.zzb(zzrgVar);
        zzb.zza(zzqrVar);
        zzb.zzc(i12);
        zza2.zza((zzqx) zzb.zzi());
        return new zzkh((zzqu) zza2.zzi(), i13);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzki zza() {
        return new zzii(this, zzqu.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final zzso zzb() {
        return zzso.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* synthetic */ zzahp zzc(zzaff zzaffVar) throws zzags {
        return zzra.zzd(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkj
    public final /* bridge */ /* synthetic */ void zze(zzahp zzahpVar) throws GeneralSecurityException {
        zzra zzraVar = (zzra) zzahpVar;
        if (!zzraVar.zzf().zzp()) {
            zzvu.zzc(zzraVar.zza(), 0);
            zzis.zza(zzraVar.zze().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlm
    public final /* synthetic */ zzahp zzg(zzahp zzahpVar) throws GeneralSecurityException {
        return ((zzra) zzahpVar).zze();
    }
}
