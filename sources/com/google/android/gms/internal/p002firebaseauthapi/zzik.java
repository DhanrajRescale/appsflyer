package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: classes2.dex */
final class zzik extends zzlg {
    public zzik(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final /* bridge */ /* synthetic */ Object zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzrd zzrdVar = (zzrd) zzahpVar;
        zzqx zzb = zzrdVar.zzb();
        zzrg zze = zzb.zze();
        int zzc = zzis.zzc(zze.zzf());
        byte[] zzq = zzrdVar.zzg().zzq();
        byte[] zzq2 = zzrdVar.zzh().zzq();
        ECParameterSpec zzi = zzut.zzi(zzc);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzq), new BigInteger(1, zzq2));
        zzjx.zzb(eCPoint, zzi.getCurve());
        return new zzuq((ECPublicKey) ((KeyFactory) zzvc.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zzi)), zze.zzd().zzq(), zzis.zzb(zze.zzg()), zzis.zzd(zzb.zzh()), new zzit(zzb.zza().zzd()));
    }
}
