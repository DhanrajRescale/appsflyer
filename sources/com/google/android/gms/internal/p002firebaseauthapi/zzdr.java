package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdr {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdn
        }, zzdm.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdo
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
        }, zzdd.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdq
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zzdj zzdjVar;
                zzdk zzdkVar;
                int i10 = zzdr.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        zzot zzd2 = zzot.zzd(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zzd2.zza() == 0) {
                            zzdi zzdiVar = new zzdi(null);
                            zzdiVar.zza(zzd2.zze().zzg().zzd());
                            zzdiVar.zzc(zzd2.zzf().zzg().zzd());
                            zzdiVar.zzd(zzd2.zze().zzf().zza());
                            zzdiVar.zze(zzd2.zzf().zzf().zza());
                            int zzf2 = zzd2.zzf().zzf().zzf();
                            zztv zztvVar = zztv.UNKNOWN_PREFIX;
                            int i11 = zzf2 - 2;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        if (i11 != 4) {
                                            if (i11 == 5) {
                                                zzdjVar = zzdj.zzb;
                                            } else {
                                                throw new GeneralSecurityException("Unable to parse HashType: " + zzrn.zza(zzf2));
                                            }
                                        } else {
                                            zzdjVar = zzdj.zze;
                                        }
                                    } else {
                                        zzdjVar = zzdj.zzc;
                                    }
                                } else {
                                    zzdjVar = zzdj.zzd;
                                }
                            } else {
                                zzdjVar = zzdj.zza;
                            }
                            zzdiVar.zzb(zzdjVar);
                            zztv zzc2 = ((zzln) zzlpVar).zzc();
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzdkVar = zzdk.zzc;
                                    }
                                }
                                zzdkVar = zzdk.zzb;
                            } else {
                                zzdkVar = zzdk.zza;
                            }
                            zzdiVar.zzf(zzdkVar);
                            zzdm zzg = zzdiVar.zzg();
                            zzdb zzdbVar = new zzdb(null);
                            zzdbVar.zzd(zzg);
                            zzdbVar.zza(zzvy.zzb(zzd2.zze().zzg().zzq(), zzcrVar));
                            zzdbVar.zzb(zzvy.zzb(zzd2.zzf().zzg().zzq(), zzcrVar));
                            zzdbVar.zzc(((zzln) zzlpVar).zzf());
                            return zzdbVar.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
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
