package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
final class zzna extends zzlg {
    public zzna(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlg
    public final /* bridge */ /* synthetic */ Object zza(zzahp zzahpVar) throws GeneralSecurityException {
        zzrq zzrqVar = (zzrq) zzahpVar;
        int zzf = zzrqVar.zzf().zzf();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzrqVar.zzg().zzq(), "HMAC");
        int zza = zzrqVar.zzf().zza();
        int i10 = zzf - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new zzvq(new zzvp("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzvq(new zzvp("HMACSHA512", secretKeySpec), zza);
                }
                return new zzvq(new zzvp("HMACSHA256", secretKeySpec), zza);
            }
            return new zzvq(new zzvp("HMACSHA384", secretKeySpec), zza);
        }
        return new zzvq(new zzvp("HMACSHA1", secretKeySpec), zza);
    }
}
