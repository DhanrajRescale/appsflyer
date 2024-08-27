package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzuw implements zzvb {
    private final zzvk zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzvb
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzvc.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
