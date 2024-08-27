package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzlh {
    private final Map zza;
    private final Map zzb;

    public zzlh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzlh zza(zzlf zzlfVar) throws GeneralSecurityException {
        zzlj zzljVar = new zzlj(zzlfVar.zzc(), zzlfVar.zzd(), null);
        if (this.zza.containsKey(zzljVar)) {
            zzlf zzlfVar2 = (zzlf) this.zza.get(zzljVar);
            if (!zzlfVar2.equals(zzlfVar) || !zzlfVar.equals(zzlfVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzljVar.toString()));
            }
        } else {
            this.zza.put(zzljVar, zzlfVar);
        }
        return this;
    }

    public final zzlh zzb(zzcm zzcmVar) throws GeneralSecurityException {
        if (zzcmVar != null) {
            Map map = this.zzb;
            Class zzb = zzcmVar.zzb();
            if (map.containsKey(zzb)) {
                zzcm zzcmVar2 = (zzcm) this.zzb.get(zzb);
                if (!zzcmVar2.equals(zzcmVar) || !zzcmVar.equals(zzcmVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
                }
            } else {
                this.zzb.put(zzb, zzcmVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public zzlh(zzll zzllVar) {
        this.zza = new HashMap(zzll.zzd(zzllVar));
        this.zzb = new HashMap(zzll.zze(zzllVar));
    }
}
