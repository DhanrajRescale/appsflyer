package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzib {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;
    private static final Map zzg;
    private static final Map zzh;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhx
        }, zzhw.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhy
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhz
        }, zzho.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzia
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                return zzib.zza((zzln) zzlpVar, zzcrVar);
            }
        }, zzb2, zzln.class);
        HashMap hashMap = new HashMap();
        zzhu zzhuVar = zzhu.zzc;
        zztv zztvVar = zztv.RAW;
        hashMap.put(zzhuVar, zztvVar);
        zzhu zzhuVar2 = zzhu.zza;
        zztv zztvVar2 = zztv.TINK;
        hashMap.put(zzhuVar2, zztvVar2);
        zzhu zzhuVar3 = zzhu.zzb;
        zztv zztvVar3 = zztv.CRUNCHY;
        hashMap.put(zzhuVar3, zztvVar3);
        zzg = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zztv.class);
        enumMap.put((EnumMap) zztvVar, (zztv) zzhuVar);
        enumMap.put((EnumMap) zztvVar2, (zztv) zzhuVar2);
        enumMap.put((EnumMap) zztvVar3, (zztv) zzhuVar3);
        enumMap.put((EnumMap) zztv.LEGACY, (zztv) zzhuVar3);
        zzh = Collections.unmodifiableMap(enumMap);
    }

    public static /* synthetic */ zzho zza(zzln zzlnVar, zzcr zzcrVar) {
        if (zzlnVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzqd zzd2 = zzqd.zzd(zzlnVar.zze(), zzafx.zza());
                if (zzd2.zza() == 0) {
                    zzht zzhtVar = new zzht(null);
                    zzhtVar.zza(zzd2.zze().zzd());
                    zztv zzc2 = zzlnVar.zzc();
                    Map map = zzh;
                    if (map.containsKey(zzc2)) {
                        zzhtVar.zzb((zzhu) map.get(zzc2));
                        zzhw zzc3 = zzhtVar.zzc();
                        zzhm zzhmVar = new zzhm(null);
                        zzhmVar.zzc(zzc3);
                        zzhmVar.zzb(zzvy.zzb(zzd2.zze().zzq(), zzcrVar));
                        zzhmVar.zza(zzlnVar.zzf());
                        return zzhmVar.zzd();
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzags unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
    }

    public static void zzb(zzkt zzktVar) throws GeneralSecurityException {
        zzktVar.zzf(zzc);
        zzktVar.zze(zzd);
        zzktVar.zzd(zze);
        zzktVar.zzc(zzf);
    }
}
