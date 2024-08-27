package com.google.android.gms.internal.measurement;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.Serializable;
import nn.d;

/* loaded from: classes2.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = d.k("<supplier that returned ", String.valueOf(this.zzc), UrlTreeKt.configurablePathSegmentSuffix);
        } else {
            obj = this.zza;
        }
        return d.k("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object zza = this.zza.zza();
                        this.zzc = zza;
                        this.zzb = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
