package com.google.android.gms.internal.icing;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzfl extends zzfm {
    public zzfl(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final void zza(Object obj, long j10, byte b10) {
        if (zzfn.zzb) {
            zzfn.zzD(obj, j10, b10);
        } else {
            zzfn.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final boolean zzb(Object obj, long j10) {
        if (zzfn.zzb) {
            return zzfn.zzv(obj, j10);
        }
        return zzfn.zzw(obj, j10);
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzfn.zzb) {
            zzfn.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzfn.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(zzk(obj, j10));
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final void zze(Object obj, long j10, float f10) {
        zzl(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(zzm(obj, j10));
    }

    @Override // com.google.android.gms.internal.icing.zzfm
    public final void zzg(Object obj, long j10, double d10) {
        zzn(obj, j10, Double.doubleToLongBits(d10));
    }
}
