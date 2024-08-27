package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import nn.d;

/* loaded from: classes2.dex */
public final class zzml extends zznq {
    private final int zza;
    private final int zzb;
    private final zzmj zzc;

    public /* synthetic */ zzml(int i10, int i11, zzmj zzmjVar, zzmk zzmkVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzmjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzml)) {
            return false;
        }
        zzml zzmlVar = (zzml) obj;
        if (zzmlVar.zza != this.zza || zzmlVar.zzb() != zzb() || zzmlVar.zzc != this.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzml.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        return d.m(sb2, i11, "-byte key)");
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzmj zzmjVar = this.zzc;
        if (zzmjVar == zzmj.zzd) {
            return this.zzb;
        }
        if (zzmjVar == zzmj.zza || zzmjVar == zzmj.zzb || zzmjVar == zzmj.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzmj zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzmj.zzd;
    }
}
