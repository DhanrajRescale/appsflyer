package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzmq {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmm
        }, zzml.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmn
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmo
        }, zzmc.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzmp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zzmj zzmjVar;
                int i10 = zzmq.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zzok zzd2 = zzok.zzd(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zzd2.zza() == 0) {
                            zzmi zzmiVar = new zzmi(null);
                            zzmiVar.zza(zzd2.zzf().zzd());
                            zzmiVar.zzb(zzd2.zze().zza());
                            zztv zzc2 = ((zzln) zzlpVar).zzc();
                            zztv zztvVar = zztv.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            zzmjVar = zzmj.zzb;
                                        } else {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzmjVar = zzmj.zzd;
                                    }
                                } else {
                                    zzmjVar = zzmj.zzc;
                                }
                            } else {
                                zzmjVar = zzmj.zza;
                            }
                            zzmiVar.zzc(zzmjVar);
                            zzml zzd3 = zzmiVar.zzd();
                            zzma zzmaVar = new zzma(null);
                            zzmaVar.zzc(zzd3);
                            zzmaVar.zza(zzvy.zzb(zzd2.zzf().zzq(), zzcrVar));
                            zzmaVar.zzb(((zzln) zzlpVar).zzf());
                            return zzmaVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
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
