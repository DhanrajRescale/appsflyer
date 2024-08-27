package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzfm {
    final Unsafe zza;

    public zzfm(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j10, byte b10);

    public abstract boolean zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract float zzd(Object obj, long j10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract double zzf(Object obj, long j10);

    public abstract void zzg(Object obj, long j10, double d10);

    public final long zzh(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final int zzi(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzj(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzk(Object obj, long j10) {
        return this.zza.getInt(obj, j10);
    }

    public final void zzl(Object obj, long j10, int i10) {
        this.zza.putInt(obj, j10, i10);
    }

    public final long zzm(Object obj, long j10) {
        return this.zza.getLong(obj, j10);
    }

    public final void zzn(Object obj, long j10, long j11) {
        this.zza.putLong(obj, j10, j11);
    }

    public final Object zzo(Object obj, long j10) {
        return this.zza.getObject(obj, j10);
    }

    public final void zzp(Object obj, long j10, Object obj2) {
        this.zza.putObject(obj, j10, obj2);
    }
}
