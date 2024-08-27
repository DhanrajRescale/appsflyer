package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import nn.d;

/* loaded from: classes2.dex */
public final class zzeg extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzee zzd;

    public /* synthetic */ zzeg(int i10, int i11, int i12, zzee zzeeVar, zzef zzefVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzeeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzeg)) {
            return false;
        }
        zzeg zzegVar = (zzeg) obj;
        if (zzegVar.zza != this.zza || zzegVar.zzb != this.zzb || zzegVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzeg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte IV, 16-byte tag, and ");
        return d.m(sb2, i11, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final zzee zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zzd != zzee.zzc;
    }
}
