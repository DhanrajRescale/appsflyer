package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzex extends zzcw {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzev zzd;

    public /* synthetic */ zzex(int i10, int i11, int i12, zzev zzevVar, zzew zzewVar) {
        this.zza = i10;
        this.zzd = zzevVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzex)) {
            return false;
        }
        zzex zzexVar = (zzex) obj;
        if (zzexVar.zza != this.zza || zzexVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzex.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzev zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzev.zzc;
    }
}
