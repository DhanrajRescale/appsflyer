package com.google.android.gms.internal.icing;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class zzax extends zzaw {
    final /* synthetic */ zzay zza;

    public zzax(zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // com.google.android.gms.internal.icing.zzaw, com.google.android.gms.internal.icing.zzat
    public final void zzc(Status status) {
        boolean z10;
        z10 = this.zza.zzc;
        if (z10) {
            Log.d("SearchAuth", "ClearTokenImpl success");
        }
        this.zza.setResult((zzay) status);
    }
}
