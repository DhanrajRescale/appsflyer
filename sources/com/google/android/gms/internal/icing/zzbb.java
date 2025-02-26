package com.google.android.gms.internal.icing;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuthApi;

/* loaded from: classes2.dex */
final class zzbb implements SearchAuthApi.GoogleNowAuthResult {
    private final Status zza;
    private final GoogleNowAuthState zzb;

    public zzbb(Status status, GoogleNowAuthState googleNowAuthState) {
        this.zza = status;
        this.zzb = googleNowAuthState;
    }

    @Override // com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult
    public final GoogleNowAuthState getGoogleNowAuthState() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
