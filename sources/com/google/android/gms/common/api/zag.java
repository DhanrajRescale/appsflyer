package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class zag<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    public zag(GoogleApiClient googleApiClient, R r10) {
        super(googleApiClient);
        this.zae = r10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.zae;
    }
}
