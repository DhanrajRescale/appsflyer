package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzel {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeh
        }, zzeg.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzei
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzej
        }, zzdy.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzek
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zzee zzeeVar;
                int i10 = zzel.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        zzpi zzd2 = zzpi.zzd(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zzd2.zza() == 0) {
                            zzed zzedVar = new zzed(null);
                            zzedVar.zzb(zzd2.zzf().zzd());
                            zzedVar.zza(zzd2.zze().zza());
                            zzedVar.zzc(16);
                            zztv zzc2 = ((zzln) zzlpVar).zzc();
                            zztv zztvVar = zztv.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzeeVar = zzee.zzc;
                                    }
                                }
                                zzeeVar = zzee.zzb;
                            } else {
                                zzeeVar = zzee.zza;
                            }
                            zzedVar.zzd(zzeeVar);
                            zzeg zze2 = zzedVar.zze();
                            zzdw zzdwVar = new zzdw(null);
                            zzdwVar.zzc(zze2);
                            zzdwVar.zzb(zzvy.zzb(zzd2.zzf().zzq(), zzcrVar));
                            zzdwVar.zza(((zzln) zzlpVar).zzf());
                            return zzdwVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
            }
        }, zzb2, zzln.class);
    }

    public static void zza(zzkt zzktVar) throws GeneralSecurityException {
        zzktVar.zzf(zzc);
        zzktVar.zze(zzd);
        zzktVar.zzd(zze);
        zzktVar.zzc(zzf);
    }
}
