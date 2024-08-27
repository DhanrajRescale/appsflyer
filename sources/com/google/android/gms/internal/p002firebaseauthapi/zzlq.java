package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzlq {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzlq() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzlq zza(zzkc zzkcVar) throws GeneralSecurityException {
        zzls zzlsVar = new zzls(zzkcVar.zzd(), zzkcVar.zzc(), null);
        if (this.zzb.containsKey(zzlsVar)) {
            zzkc zzkcVar2 = (zzkc) this.zzb.get(zzlsVar);
            if (!zzkcVar2.equals(zzkcVar) || !zzkcVar.equals(zzkcVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzlsVar.toString()));
            }
        } else {
            this.zzb.put(zzlsVar, zzkcVar);
        }
        return this;
    }

    public final zzlq zzb(zzkg zzkgVar) throws GeneralSecurityException {
        zzlu zzluVar = new zzlu(zzkgVar.zzb(), zzkgVar.zzc(), null);
        if (this.zza.containsKey(zzluVar)) {
            zzkg zzkgVar2 = (zzkg) this.zza.get(zzluVar);
            if (!zzkgVar2.equals(zzkgVar) || !zzkgVar.equals(zzkgVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzluVar.toString()));
            }
        } else {
            this.zza.put(zzluVar, zzkgVar);
        }
        return this;
    }

    public final zzlq zzc(zzkx zzkxVar) throws GeneralSecurityException {
        zzls zzlsVar = new zzls(zzkxVar.zzc(), zzkxVar.zzb(), null);
        if (this.zzd.containsKey(zzlsVar)) {
            zzkx zzkxVar2 = (zzkx) this.zzd.get(zzlsVar);
            if (!zzkxVar2.equals(zzkxVar) || !zzkxVar.equals(zzkxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzlsVar.toString()));
            }
        } else {
            this.zzd.put(zzlsVar, zzkxVar);
        }
        return this;
    }

    public final zzlq zzd(zzlb zzlbVar) throws GeneralSecurityException {
        zzlu zzluVar = new zzlu(zzlbVar.zzb(), zzlbVar.zzc(), null);
        if (this.zzc.containsKey(zzluVar)) {
            zzlb zzlbVar2 = (zzlb) this.zzc.get(zzluVar);
            if (!zzlbVar2.equals(zzlbVar) || !zzlbVar.equals(zzlbVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzluVar.toString()));
            }
        } else {
            this.zzc.put(zzluVar, zzlbVar);
        }
        return this;
    }

    public zzlq(zzlw zzlwVar) {
        this.zza = new HashMap(zzlw.zzc(zzlwVar));
        this.zzb = new HashMap(zzlw.zzb(zzlwVar));
        this.zzc = new HashMap(zzlw.zze(zzlwVar));
        this.zzd = new HashMap(zzlw.zzd(zzlwVar));
    }
}
