package com.google.android.gms.internal.measurement;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        int i10;
        zzh.zzh(this.zzd, 3, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzb = zzgVar.zzb((zzap) list.get(1));
        if (zzb instanceof zzao) {
            zzap zzb2 = zzgVar.zzb((zzap) list.get(2));
            if (zzb2 instanceof zzam) {
                zzam zzamVar = (zzam) zzb2;
                if (zzamVar.zzt("type")) {
                    String zzi2 = zzamVar.zzf("type").zzi();
                    if (zzamVar.zzt("priority")) {
                        i10 = zzh.zzb(zzamVar.zzf("priority").zzh().doubleValue());
                    } else {
                        i10 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    }
                    this.zza.zza(zzi, i10, (zzao) zzb, zzi2);
                    return zzap.zzf;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
