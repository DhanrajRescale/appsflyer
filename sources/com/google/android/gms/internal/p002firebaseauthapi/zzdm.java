package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import jr.h;
import v.e;

/* loaded from: classes2.dex */
public final class zzdm extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzdk zze;
    private final zzdj zzf;

    public /* synthetic */ zzdm(int i10, int i11, int i12, int i13, zzdk zzdkVar, zzdj zzdjVar, zzdl zzdlVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzdkVar;
        this.zzf = zzdjVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        if (zzdmVar.zza != this.zza || zzdmVar.zzb != this.zzb || zzdmVar.zzc != this.zzc || zzdmVar.zzd != this.zzd || zzdmVar.zze != this.zze || zzdmVar.zzf != this.zzf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzdm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(this.zzf);
        int i10 = this.zzc;
        int i11 = this.zzd;
        int i12 = this.zza;
        int i13 = this.zzb;
        StringBuilder l10 = e.l("AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2, ", ");
        h.v(l10, i10, "-byte IV, and ", i11, "-byte tags, and ");
        l10.append(i12);
        l10.append("-byte AES key, and ");
        l10.append(i13);
        l10.append("-byte HMAC key)");
        return l10.toString();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzdk zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return this.zze != zzdk.zzc;
    }
}
