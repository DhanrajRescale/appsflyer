package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import nn.d;
import v.e;

/* loaded from: classes2.dex */
final class zznt implements zzcm {
    private static final Logger zza = Logger.getLogger(zznt.class.getName());
    private static final byte[] zzb = {0};
    private static final zznt zzc = new zznt();

    public static void zze() throws GeneralSecurityException {
        zzcq.zzj(zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zza() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final Class zzb() {
        return zzcd.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcm
    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzclVar) throws GeneralSecurityException {
        Iterator it = zzclVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzch zzchVar : (List) it.next()) {
                if (zzchVar.zzb() instanceof zznp) {
                    zznp zznpVar = (zznp) zzchVar.zzb();
                    zzvx zzb2 = zzvx.zzb(zzchVar.zzg());
                    if (!zzb2.equals(zznpVar.zzb())) {
                        String valueOf = String.valueOf(zznpVar.zza());
                        String zzvxVar = zznpVar.zzb().toString();
                        throw new GeneralSecurityException(d.o(e.l("Mac Key with parameters ", valueOf, " has wrong output prefix (", zzvxVar, ") instead of ("), zzb2.toString(), ")"));
                    }
                }
            }
        }
        return new zzns(zzclVar, null);
    }
}
