package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzoe {
    private final zzbt zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzoe(zzbt zzbtVar, int i10, String str, String str2, zzod zzodVar) {
        this.zza = zzbtVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoe)) {
            return false;
        }
        zzoe zzoeVar = (zzoe) obj;
        if (this.zza != zzoeVar.zza || this.zzb != zzoeVar.zzb || !this.zzc.equals(zzoeVar.zzc) || !this.zzd.equals(zzoeVar.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
