package com.google.android.gms.internal.measurement;

import android.util.Log;
import da.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l10, boolean z10) {
        super(zzhyVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder s7 = e.s("Invalid long value for ", this.zzb, ": ");
            s7.append((String) obj);
            Log.e("PhenotypeFlag", s7.toString());
            return null;
        }
    }
}
