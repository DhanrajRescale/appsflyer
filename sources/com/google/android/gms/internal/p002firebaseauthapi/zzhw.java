package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzhw extends zzie {
    private final int zza;
    private final zzhu zzb;

    public /* synthetic */ zzhw(int i10, zzhu zzhuVar, zzhv zzhvVar) {
        this.zza = i10;
        this.zzb = zzhuVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhw)) {
            return false;
        }
        zzhw zzhwVar = (zzhw) obj;
        if (zzhwVar.zza != this.zza || zzhwVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzhw.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhu zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzhu.zzc;
    }
}
