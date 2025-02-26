package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzt extends zze {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzt(zzn zznVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzf
    public final void zza(Status status, int i10) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i10), this.zza);
    }
}
