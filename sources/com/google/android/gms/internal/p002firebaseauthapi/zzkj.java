package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import nn.d;

/* loaded from: classes2.dex */
public abstract class zzkj {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzkj(Class cls, zzlg... zzlgVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            zzlg zzlgVar = zzlgVarArr[i10];
            if (!hashMap.containsKey(zzlgVar.zzb())) {
                hashMap.put(zzlgVar.zzb(), zzlgVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzlgVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzlgVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzki zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzso zzb();

    public abstract zzahp zzc(zzaff zzaffVar) throws zzags;

    public abstract String zzd();

    public abstract void zze(zzahp zzahpVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzj() {
        return this.zzc;
    }

    public final Class zzk() {
        return this.zza;
    }

    public final Object zzl(zzahp zzahpVar, Class cls) throws GeneralSecurityException {
        zzlg zzlgVar = (zzlg) this.zzb.get(cls);
        if (zzlgVar != null) {
            return zzlgVar.zza(zzahpVar);
        }
        throw new IllegalArgumentException(d.k("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzm() {
        return this.zzb.keySet();
    }
}
