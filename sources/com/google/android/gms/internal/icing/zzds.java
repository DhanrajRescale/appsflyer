package com.google.android.gms.internal.icing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzds {
    private static final zzds zza;
    private static final zzds zzb;

    static {
        zzdp zzdpVar = null;
        zza = new zzdq(zzdpVar);
        zzb = new zzdr(zzdpVar);
    }

    public /* synthetic */ zzds(zzdp zzdpVar) {
    }

    public static zzds zzc() {
        return zza;
    }

    public static zzds zzd() {
        return zzb;
    }

    public abstract void zza(Object obj, long j10);

    public abstract <L> void zzb(Object obj, Object obj2, long j10);
}
