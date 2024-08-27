package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzii extends zzki {
    final /* synthetic */ zzij zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzii(zzij zzijVar, Class cls) {
        super(cls);
        this.zza = zzijVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzqu zzquVar = (zzqu) zzahpVar;
        KeyPair zzc = zzut.zzc(zzut.zzi(zzis.zzc(zzquVar.zzd().zze().zzf())));
        ECPublicKey eCPublicKey = (ECPublicKey) zzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzc.getPrivate();
        ECPoint w10 = eCPublicKey.getW();
        zzrc zzc2 = zzrd.zzc();
        zzc2.zzb(0);
        zzc2.zza(zzquVar.zzd());
        byte[] byteArray = w10.getAffineX().toByteArray();
        zzaff zzaffVar = zzaff.zzb;
        zzc2.zzc(zzaff.zzn(byteArray, 0, byteArray.length));
        byte[] byteArray2 = w10.getAffineY().toByteArray();
        zzc2.zzd(zzaff.zzn(byteArray2, 0, byteArray2.length));
        zzrd zzrdVar = (zzrd) zzc2.zzi();
        zzqz zzb = zzra.zzb();
        zzb.zzc(0);
        zzb.zzb(zzrdVar);
        byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
        zzb.zza(zzaff.zzn(byteArray3, 0, byteArray3.length));
        return (zzra) zzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzqu.zzc(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        zzbu zza = zzbv.zza("AES128_GCM");
        bArr = zzij.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzij.zzi(4, 5, 3, zza, bArr, 1));
        zzbu zza2 = zzbv.zza("AES128_GCM");
        bArr2 = zzij.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzij.zzi(4, 5, 3, zza2, bArr2, 3));
        zzbu zza3 = zzbv.zza("AES128_GCM");
        bArr3 = zzij.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzij.zzi(4, 5, 4, zza3, bArr3, 1));
        zzbu zza4 = zzbv.zza("AES128_GCM");
        bArr4 = zzij.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzij.zzi(4, 5, 4, zza4, bArr4, 3));
        zzbu zza5 = zzbv.zza("AES128_GCM");
        bArr5 = zzij.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzij.zzi(4, 5, 4, zza5, bArr5, 3));
        zzbu zza6 = zzbv.zza("AES128_CTR_HMAC_SHA256");
        bArr6 = zzij.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzij.zzi(4, 5, 3, zza6, bArr6, 1));
        zzbu zza7 = zzbv.zza("AES128_CTR_HMAC_SHA256");
        bArr7 = zzij.zza;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzij.zzi(4, 5, 3, zza7, bArr7, 3));
        zzbu zza8 = zzbv.zza("AES128_CTR_HMAC_SHA256");
        bArr8 = zzij.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzij.zzi(4, 5, 4, zza8, bArr8, 1));
        zzbu zza9 = zzbv.zza("AES128_CTR_HMAC_SHA256");
        bArr9 = zzij.zza;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzij.zzi(4, 5, 4, zza9, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzis.zza(((zzqu) zzahpVar).zzd());
    }
}
