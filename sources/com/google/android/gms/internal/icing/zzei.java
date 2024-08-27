package com.google.android.gms.internal.icing;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzei<T> implements zzep<T> {
    private final zzee zza;
    private final zzfd<?, ?> zzb;
    private final boolean zzc;
    private final zzcq<?> zzd;

    private zzei(zzfd<?, ?> zzfdVar, zzcq<?> zzcqVar, zzee zzeeVar) {
        this.zzb = zzfdVar;
        this.zzc = zzcqVar.zza(zzeeVar);
        this.zzd = zzcqVar;
        this.zza = zzeeVar;
    }

    public static <T> zzei<T> zzg(zzfd<?, ?> zzfdVar, zzcq<?> zzcqVar, zzee zzeeVar) {
        return new zzei<>(zzfdVar, zzcqVar, zzeeVar);
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final boolean zza(T t10, T t11) {
        if (!this.zzb.zzb(t10).equals(this.zzb.zzb(t11))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zzb(t10);
        this.zzd.zzb(t11);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final int zzb(T t10) {
        int hashCode = this.zzb.zzb(t10).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zzb(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zzc(T t10, T t11) {
        zzer.zzF(this.zzb, t10, t11);
        if (this.zzc) {
            zzer.zzE(this.zzd, t10, t11);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final int zzd(T t10) {
        zzfd<?, ?> zzfdVar = this.zzb;
        int zze = zzfdVar.zze(zzfdVar.zzb(t10));
        if (!this.zzc) {
            return zze;
        }
        this.zzd.zzb(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zze(T t10) {
        this.zzb.zzc(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final boolean zzf(T t10) {
        this.zzd.zzb(t10);
        throw null;
    }

    @Override // com.google.android.gms.internal.icing.zzep
    public final void zzi(T t10, zzcn zzcnVar) throws IOException {
        this.zzd.zzb(t10);
        throw null;
    }
}
