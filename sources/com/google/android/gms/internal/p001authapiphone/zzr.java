package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* loaded from: classes2.dex */
final class zzr extends Api.AbstractClientBuilder<zzv, Api.ApiOptions.NoOptions> {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ zzv buildClient(Context context, Looper looper, ClientSettings clientSettings, Api.ApiOptions.NoOptions noOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzv(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
