package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzge {
    public static final /* synthetic */ int zza = 0;
    private static final zzvx zzb;
    private static final zzlb zzc;
    private static final zzkx zzd;
    private static final zzkg zze;
    private static final zzkc zzf;

    static {
        zzvx zzb2 = zzly.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzlb.zza(new zzkz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzga
        }, zzfz.class, zzlo.class);
        zzd = zzkx.zza(new zzkv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgb
        }, zzb2, zzlo.class);
        zze = zzkg.zza(new zzke() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgc
        }, zzfu.class, zzln.class);
        zzf = zzkc.zzb(new zzka() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzka
            public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) {
                zzfy zzfyVar;
                int i10 = zzge.zza;
                if (((zzln) zzlpVar).zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        zzqj zzd2 = zzqj.zzd(((zzln) zzlpVar).zze(), zzafx.zza());
                        if (zzd2.zza() == 0) {
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
                                        zzfyVar = zzfy.zzc;
                                    }
                                }
                                zzfyVar = zzfy.zzb;
                            } else {
                                zzfyVar = zzfy.zza;
                            }
                            return zzfu.zza(zzfyVar, zzvy.zzb(zzd2.zze().zzq(), zzcrVar), ((zzln) zzlpVar).zzf());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzags unused) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
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
