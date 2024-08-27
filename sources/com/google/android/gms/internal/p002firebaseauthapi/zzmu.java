package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzmu implements zzcm {
    private static final zzmu zza = new zzmu();

    private zzmu() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzcq.zzj(zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zza() {
        return zzmr.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zzb() {
        return zzmr.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzclVar) throws GeneralSecurityException {
        if (zzclVar.zza() != null) {
            Iterator it = zzclVar.zzd().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    ((zzch) it2.next()).zzd();
                }
            }
            return new zzmt(zzclVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
