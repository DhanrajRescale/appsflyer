package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzit implements zzuo {
    private final String zza;
    private final int zzb;
    private zzpr zzc;
    private zzot zzd;
    private int zze;
    private zzqd zzf;

    public zzit(zzsu zzsuVar) throws GeneralSecurityException {
        String zzf = zzsuVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzct.zzb)) {
            try {
                zzpu zzd = zzpu.zzd(zzsuVar.zze(), zzafx.zza());
                this.zzc = (zzpr) zzcq.zzc(zzsuVar);
                this.zzb = zzd.zza();
                return;
            } catch (zzags e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        }
        if (zzf.equals(zzct.zza)) {
            try {
                zzow zzc = zzow.zzc(zzsuVar.zze(), zzafx.zza());
                this.zzd = (zzot) zzcq.zzc(zzsuVar);
                this.zze = zzc.zzd().zza();
                this.zzb = this.zze + zzc.zze().zza();
                return;
            } catch (zzags e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        }
        if (zzf.equals(zzic.zza)) {
            try {
                zzqg zzd2 = zzqg.zzd(zzsuVar.zze(), zzafx.zza());
                this.zzf = (zzqd) zzcq.zzc(zzsuVar);
                this.zzb = zzd2.zza();
                return;
            } catch (zzags e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuo
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuo
    public final zzjo zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == this.zzb) {
            if (this.zza.equals(zzct.zzb)) {
                zzpq zzb = zzpr.zzb();
                zzb.zzh(this.zzc);
                zzb.zza(zzaff.zzn(bArr, 0, this.zzb));
                return new zzjo((zzbd) zzcq.zzf(this.zza, (zzpr) zzb.zzi(), zzbd.class));
            }
            if (this.zza.equals(zzct.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                zzoy zzb2 = zzoz.zzb();
                zzb2.zzh(this.zzd.zze());
                zzaff zzaffVar = zzaff.zzb;
                zzb2.zza(zzaff.zzn(copyOfRange, 0, copyOfRange.length));
                zzoz zzozVar = (zzoz) zzb2.zzi();
                zzrp zzb3 = zzrq.zzb();
                zzb3.zzh(this.zzd.zzf());
                zzb3.zza(zzaff.zzn(copyOfRange2, 0, copyOfRange2.length));
                zzrq zzrqVar = (zzrq) zzb3.zzi();
                zzos zzb4 = zzot.zzb();
                zzb4.zzc(this.zzd.zza());
                zzb4.zza(zzozVar);
                zzb4.zzb(zzrqVar);
                return new zzjo((zzbd) zzcq.zzf(this.zza, (zzot) zzb4.zzi(), zzbd.class));
            }
            if (this.zza.equals(zzic.zza)) {
                zzqc zzb5 = zzqd.zzb();
                zzb5.zzh(this.zzf);
                zzb5.zza(zzaff.zzn(bArr, 0, this.zzb));
                return new zzjo((zzbi) zzcq.zzf(this.zza, (zzqd) zzb5.zzi(), zzbi.class));
            }
            throw new GeneralSecurityException("unknown DEM key type");
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
