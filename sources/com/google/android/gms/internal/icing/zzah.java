package com.google.android.gms.internal.icing;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
/* loaded from: classes2.dex */
final class zzah implements AppIndexApi.ActionResult {
    private final zzal zza;
    private final PendingResult<Status> zzb;
    private final Action zzc;

    public zzah(zzal zzalVar, PendingResult<Status> pendingResult, Action action) {
        this.zza = zzalVar;
        this.zzb = pendingResult;
        this.zzc = action;
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi.ActionResult
    public final PendingResult<Status> end(GoogleApiClient googleApiClient) {
        String packageName = googleApiClient.getContext().getPackageName();
        return this.zza.zza(googleApiClient, zzaf.zza(this.zzc, System.currentTimeMillis(), packageName, 2));
    }

    @Override // com.google.android.gms.appindexing.AppIndexApi.ActionResult
    public final PendingResult<Status> getPendingResult() {
        return this.zzb;
    }
}
