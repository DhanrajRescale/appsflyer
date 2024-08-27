package com.google.android.gms.internal.icing;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@ShowFirstParty
@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzr {
    private final String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private final List<zzm> zze = new ArrayList();
    private String zzf;

    public zzr(String str) {
        this.zza = str;
    }

    public final zzr zza(String str) {
        this.zzb = "blob";
        return this;
    }

    public final zzr zzb(boolean z10) {
        this.zzc = true;
        return this;
    }

    public final zzr zzc(boolean z10) {
        this.zzd = true;
        return this;
    }

    public final zzr zzd(String str) {
        this.zzf = str;
        return this;
    }

    public final zzs zze() {
        String str = this.zza;
        String str2 = this.zzb;
        boolean z10 = this.zzc;
        boolean z11 = this.zzd;
        List<zzm> list = this.zze;
        return new zzs(str, str2, z10, 1, z11, null, (zzm[]) list.toArray(new zzm[list.size()]), this.zzf, null);
    }
}
