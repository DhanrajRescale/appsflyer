package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes2.dex */
final class zaf<R extends Result> extends BasePendingResult<R> {
    private final R zae;

    public zaf(R r10) {
        super(Looper.getMainLooper());
        this.zae = r10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.zae.getStatus().getStatusCode()) {
            return this.zae;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
