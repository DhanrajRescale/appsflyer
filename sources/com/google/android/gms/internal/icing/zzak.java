package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes2.dex */
public final class zzak extends zzad<Status> {
    public zzak(BaseImplementation.ResultHolder<Status> resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.internal.icing.zzad, com.google.android.gms.internal.icing.zzac
    public final void zzb(Status status) {
        this.zza.setResult(status);
    }
}
