package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfc {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
        }, zzex.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfa
        }, zzep.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zzev zzevVar;
                int i10 = zzfc.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        zzpr zzd2 = zzpr.zzd(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zzd2.zza() == 0) {
                            zzeu zzeuVar = new zzeu(null);
                            zzeuVar.zzb(zzd2.zze().zzd());
                            zzeuVar.zza(12);
                            zzeuVar.zzc(16);
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
                                        zzevVar = zzev.zzc;
                                    }
                                }
                                zzevVar = zzev.zzb;
                            } else {
                                zzevVar = zzev.zza;
                            }
                            zzeuVar.zzd(zzevVar);
                            zzex zze2 = zzeuVar.zze();
                            zzen zzenVar = new zzen(null);
                            zzenVar.zzc(zze2);
                            zzenVar.zzb(zzvy.zzb(zzd2.zze().zzq(), zzcrVar));
                            zzenVar.zza(((zzln) zzlpVar).zzf());
                            return zzenVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags unused) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
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
