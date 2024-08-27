package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzw {
    private zzi zza;
    private zzg zzd;
    private long zzb = -1;
    private int zzc = -1;
    private boolean zze = false;
    private int zzf = 0;

    public final zzw zza(zzi zziVar) {
        this.zza = zziVar;
        return this;
    }

    public final zzw zzb(long j10) {
        this.zzb = j10;
        return this;
    }

    public final zzw zzc(int i10) {
        this.zzc = i10;
        return this;
    }

    public final zzw zzd(zzg zzgVar) {
        this.zzd = zzgVar;
        return this;
    }

    public final zzw zze(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzw zzf(int i10) {
        this.zzf = i10;
        return this;
    }

    public final zzx zzg() {
        return new zzx(this.zza, this.zzb, this.zzc, null, this.zzd, this.zze, -1, this.zzf, null);
    }
}
