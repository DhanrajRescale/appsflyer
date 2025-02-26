package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzz extends zzk {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzz(zzu zzuVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzl
    public final void zza(Status status) {
        TaskUtil.setResultOrApiException(status, this.zza);
    }
}
