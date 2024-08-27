package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import nn.d;

/* loaded from: classes2.dex */
public final class zzll {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzll(zzlh zzlhVar, zzlk zzlkVar) {
        Map map;
        Map map2;
        map = zzlhVar.zza;
        this.zza = new HashMap(map);
        map2 = zzlhVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzcm) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(d.k("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzbl zzblVar, Class cls) throws GeneralSecurityException {
        zzlj zzljVar = new zzlj(zzblVar.getClass(), cls, null);
        if (this.zza.containsKey(zzljVar)) {
            return ((zzlf) this.zza.get(zzljVar)).zza(zzblVar);
        }
        throw new GeneralSecurityException(d.k("No PrimitiveConstructor for ", zzljVar.toString(), " available"));
    }

    public final Object zzc(zzcl zzclVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzcm zzcmVar = (zzcm) this.zzb.get(cls);
            if (zzclVar.zzc().equals(zzcmVar.zza()) && zzcmVar.zza().equals(zzclVar.zzc())) {
                return zzcmVar.zzc(zzclVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
