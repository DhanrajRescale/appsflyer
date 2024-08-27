package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzir {
    public static final zzsu zza;
    public static final zzsu zzb;
    public static final zzsu zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zzsu zzsuVar = zzcv.zza;
        zztv zztvVar = zztv.TINK;
        zza = zza(4, 5, 3, zzsuVar, zztvVar, bArr);
        zzb = zza(4, 5, 4, zzsuVar, zztv.RAW, bArr);
        zzc = zza(4, 5, 3, zzcv.zze, zztvVar, bArr);
    }

    public static zzsu zza(int i10, int i11, int i12, zzsu zzsuVar, zztv zztvVar, byte[] bArr) {
        zzqt zza2 = zzqu.zza();
        zzrf zza3 = zzrg.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzaff.zzn(bArr, 0, 0));
        zzrg zzrgVar = (zzrg) zza3.zzi();
        zzqq zza4 = zzqr.zza();
        zza4.zza(zzsuVar);
        zzqr zzqrVar = (zzqr) zza4.zzi();
        zzqw zzb2 = zzqx.zzb();
        zzb2.zzb(zzrgVar);
        zzb2.zza(zzqrVar);
        zzb2.zzc(i12);
        zza2.zza((zzqx) zzb2.zzi());
        zzqu zzquVar = (zzqu) zza2.zzi();
        zzst zza5 = zzsu.zza();
        new zzij();
        zza5.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza5.zza(zztvVar);
        zza5.zzc(zzquVar.zzo());
        return (zzsu) zza5.zzi();
    }
}
