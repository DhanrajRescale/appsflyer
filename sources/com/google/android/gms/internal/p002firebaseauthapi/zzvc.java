package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzvc {
    public static final zzvc zza = new zzvc(new zzvd());
    public static final zzvc zzb = new zzvc(new zzvh());
    public static final zzvc zzc = new zzvc(new zzvj());
    public static final zzvc zzd = new zzvc(new zzvi());
    public static final zzvc zze = new zzvc(new zzve());
    public static final zzvc zzf = new zzvc(new zzvg());
    public static final zzvc zzg = new zzvc(new zzvf());
    private final zzvb zzh;

    public zzvc(zzvk zzvkVar) {
        if (zzhk.zzb()) {
            this.zzh = new zzva(zzvkVar, null);
        } else if (zzvt.zza()) {
            this.zzh = new zzuw(zzvkVar, null);
        } else {
            this.zzh = new zzuy(zzvkVar, null);
        }
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
