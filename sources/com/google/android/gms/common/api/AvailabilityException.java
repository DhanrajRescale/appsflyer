package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import t.c;
import t.f;

/* loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    private final f zaa;

    public AvailabilityException(@NonNull f fVar) {
        this.zaa = fVar;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 58);
        sb2.append("The given API (");
        sb2.append(zab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((c) this.zaa.keySet()).iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z10 &= !connectionResult.isSuccess();
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb2.append(zab);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z10 = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zab).length() + 58);
        sb2.append("The given API (");
        sb2.append(zab);
        sb2.append(") was not part of the availability request.");
        Preconditions.checkArgument(z10, sb2.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
