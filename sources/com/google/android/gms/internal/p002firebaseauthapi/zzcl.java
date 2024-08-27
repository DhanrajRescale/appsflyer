package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class zzcl {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzch zzc;
    private final Class zzd;
    private final zznz zze;

    public /* synthetic */ zzcl(ConcurrentMap concurrentMap, List list, zzch zzchVar, zznz zznzVar, Class cls, zzck zzckVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzchVar;
        this.zzd = cls;
        this.zze = zznzVar;
    }

    public final zzch zza() {
        return this.zzc;
    }

    public final zznz zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzcj(bArr, null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzf() {
        if (!this.zze.zza().isEmpty()) {
            return true;
        }
        return false;
    }
}
