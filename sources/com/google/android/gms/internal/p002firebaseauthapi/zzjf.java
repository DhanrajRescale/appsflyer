package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzjf extends zzki {
    final /* synthetic */ zzjg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjf(zzjg zzjgVar, Class cls) {
        super(cls);
        this.zza = zzjgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* bridge */ /* synthetic */ zzahp zza(zzahp zzahpVar) throws GeneralSecurityException {
        byte[] zza;
        byte[] zzb;
        zzsb zzsbVar = (zzsb) zzahpVar;
        int zzf = zzsbVar.zzd().zzf() - 2;
        if (zzf != 1) {
            if (zzf != 2 && zzf != 3 && zzf != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int zzg = zzjj.zzg(zzsbVar.zzd().zzf());
            KeyPair zzc = zzut.zzc(zzut.zzi(zzg));
            ECPoint w10 = ((ECPublicKey) zzc.getPublic()).getW();
            EllipticCurve curve = zzut.zzi(zzg).getCurve();
            zzjx.zzb(w10, curve);
            int zza2 = zzut.zza(curve);
            int i10 = zza2 + zza2 + 1;
            zzb = new byte[i10];
            byte[] zza3 = zzjv.zza(w10.getAffineX());
            byte[] zza4 = zzjv.zza(w10.getAffineY());
            int length = zza4.length;
            System.arraycopy(zza4, 0, zzb, i10 - length, length);
            int length2 = zza3.length;
            System.arraycopy(zza3, 0, zzb, (zza2 + 1) - length2, length2);
            zzb[0] = 4;
            zza = ((ECPrivateKey) zzc.getPrivate()).getS().toByteArray();
        } else {
            zza = zzvs.zza(32);
            zza[0] = (byte) (zza[0] | 7);
            int i11 = zza[31] & 63;
            zza[31] = (byte) i11;
            zza[31] = (byte) (i11 | 128);
            zzb = zzvv.zzb(zza);
        }
        zzsj zzc2 = zzsk.zzc();
        zzc2.zzc(0);
        zzc2.zza(zzsbVar.zzd());
        zzc2.zzb(zzaff.zzn(zzb, 0, zzb.length));
        zzsk zzskVar = (zzsk) zzc2.zzi();
        zzsg zzb2 = zzsh.zzb();
        zzb2.zzc(0);
        zzb2.zzb(zzskVar);
        zzb2.zza(zzaff.zzn(zza, 0, zza.length));
        return (zzsh) zzb2.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ zzahp zzb(zzaff zzaffVar) throws zzags {
        return zzsb.zzc(zzaffVar, zzafx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzjg.zzh(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzjg.zzh(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzjg.zzh(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzjg.zzh(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzjg.zzh(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzjg.zzh(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzjg.zzh(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzjg.zzh(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzjg.zzh(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzjg.zzh(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzjg.zzh(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzjg.zzh(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzjg.zzh(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzjg.zzh(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzjg.zzh(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzjg.zzh(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzjg.zzh(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzjg.zzh(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzki
    public final /* synthetic */ void zzd(zzahp zzahpVar) throws GeneralSecurityException {
        zzjj.zza(((zzsb) zzahpVar).zzd());
    }
}
