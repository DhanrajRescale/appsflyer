package com.google.android.gms.internal.measurement;

import android.util.Log;
import da.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d10, boolean z10) {
        super(zzhyVar, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder s7 = e.s("Invalid double value for ", this.zzb, ": ");
            s7.append((String) obj);
            Log.e("PhenotypeFlag", s7.toString());
            return null;
        }
    }
}
