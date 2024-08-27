package com.google.android.gms.internal.p002firebaseauthapi;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzajd extends zzaje {
    public zzajd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzajf.zzb) {
            zzajf.zzD(obj, j10, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzajf.zzE(obj, j10, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void zzd(Object obj, long j10, byte b10) {
        if (zzajf.zzb) {
            zzajf.zzD(obj, j10, b10);
        } else {
            zzajf.zzE(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void zze(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final void zzf(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaje
    public final boolean zzg(Object obj, long j10) {
        if (zzajf.zzb) {
            return zzajf.zzt(obj, j10);
        }
        return zzajf.zzu(obj, j10);
    }
}
