package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import nn.d;

/* loaded from: classes2.dex */
public final class zzlw {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzlw(zzlq zzlqVar, zzlv zzlvVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzlqVar.zza;
        this.zza = new HashMap(map);
        map2 = zzlqVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzlqVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzlqVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzbl zza(zzlp zzlpVar, zzcr zzcrVar) throws GeneralSecurityException {
        zzls zzlsVar = new zzls(zzlpVar.getClass(), zzlpVar.zzd(), null);
        if (this.zzb.containsKey(zzlsVar)) {
            return ((zzkc) this.zzb.get(zzlsVar)).zza(zzlpVar, zzcrVar);
        }
        throw new GeneralSecurityException(d.k("No Key Parser for requested key type ", zzlsVar.toString(), " available"));
    }

    public final boolean zzf(zzlp zzlpVar) {
        return this.zzb.containsKey(new zzls(zzlpVar.getClass(), zzlpVar.zzd(), null));
    }
}
