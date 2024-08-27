package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfo extends zzcw {
    private final int zza;
    private final zzfm zzb;

    public /* synthetic */ zzfo(int i10, zzfm zzfmVar, zzfn zzfnVar) {
        this.zza = i10;
        this.zzb = zzfmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfo)) {
            return false;
        }
        zzfo zzfoVar = (zzfo) obj;
        if (zzfoVar.zza != this.zza || zzfoVar.zzb != this.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzfo.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final zzfm zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zzb != zzfm.zzc;
    }
}
