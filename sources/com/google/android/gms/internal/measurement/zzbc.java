package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.p002firebaseauthapi.a;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.zzb(str);
                }
                zzap zzb = zzgVar.zzb((zzap) a.k(zzbl.OR, 2, list, 0));
                if (zzb.zzg().booleanValue()) {
                    return zzb;
                }
                return zzgVar.zzb((zzap) list.get(1));
            }
            return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) a.k(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
        }
        zzap zzb2 = zzgVar.zzb((zzap) a.k(zzbl.AND, 2, list, 0));
        if (!zzb2.zzg().booleanValue()) {
            return zzb2;
        }
        return zzgVar.zzb((zzap) list.get(1));
    }
}
