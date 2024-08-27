package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zznn {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zznj
        }, zzni.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zznk
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zznl
        }, zzmy.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zznm
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zznf zznfVar;
                zzng zzngVar;
                int i10 = zznn.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    try {
                        zzrq zze2 = zzrq.zze(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zze2.zza() == 0) {
                            zzne zzneVar = new zzne(null);
                            zzneVar.zzb(zze2.zzg().zzd());
                            zzneVar.zzc(zze2.zzf().zza());
                            int zzf2 = zze2.zzf().zzf();
                            zztv zztvVar = zztv.UNKNOWN_PREFIX;
                            int i11 = zzf2 - 2;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 != 4) {
                                            if (i11 == 5) {
                                                zznfVar = zznf.zzb;
                                            } else {
                                                throw new GeneralSecurityException("Unable to parse HashType: " + zzrn.zza(zzf2));
                                            }
                                        } else {
                                            zznfVar = zznf.zze;
                                        }
                                    } else {
                                        zznfVar = zznf.zzc;
                                    }
                                } else {
                                    zznfVar = zznf.zzd;
                                }
                            } else {
                                zznfVar = zznf.zza;
                            }
                            zzneVar.zza(zznfVar);
                            zztv zzc2 = ((zzln) zzlpVar).zzc();
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            zzngVar = zzng.zzb;
                                        } else {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzngVar = zzng.zzd;
                                    }
                                } else {
                                    zzngVar = zzng.zzc;
                                }
                            } else {
                                zzngVar = zzng.zza;
                            }
                            zzneVar.zzd(zzngVar);
                            zzni zze3 = zzneVar.zze();
                            zzmw zzmwVar = new zzmw(null);
                            zzmwVar.zzc(zze3);
                            zzmwVar.zzb(zzvy.zzb(zze2.zzg().zzq(), zzcrVar));
                            zzmwVar.zza(((zzln) zzlpVar).zzf());
                            return zzmwVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
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
