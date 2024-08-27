package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import v.e;

/* loaded from: classes2.dex */
public final class zzni extends zznq {
    private final int zza;
    private final int zzb;
    private final zzng zzc;
    private final zznf zzd;

    public /* synthetic */ zzni(int i10, int i11, zzng zzngVar, zznf zznfVar, zznh zznhVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzngVar;
        this.zzd = zznfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzni)) {
            return false;
        }
        zzni zzniVar = (zzni) obj;
        if (zzniVar.zza != this.zza || zzniVar.zzb() != zzb() || zzniVar.zzc != this.zzc || zzniVar.zzd != this.zzd) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzni.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        StringBuilder l10 = e.l("HMAC Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        l10.append(i10);
        l10.append("-byte tags, and ");
        l10.append(i11);
        l10.append("-byte key)");
        return l10.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzng zzngVar = this.zzc;
        if (zzngVar == zzng.zzd) {
            return this.zzb;
        }
        if (zzngVar == zzng.zza || zzngVar == zzng.zzb || zzngVar == zzng.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzng zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzng.zzd;
    }
}
