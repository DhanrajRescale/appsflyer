package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zaj {
    private static volatile Executor zaa;
    private final ClientSettings zab;
    private final Set<Scope> zac;
    private final Account zad;

    @VisibleForTesting
    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Handler handler, int i10, @NonNull ClientSettings clientSettings) {
        super(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i10, null, null);
        this.zab = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }

    private final Set<Scope> zaa(@NonNull Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zab;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    @NonNull
    @KeepForSdk
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.Api.Client
    @NonNull
    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.emptySet();
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> validateScopes(@NonNull Set<Scope> set) {
        return set;
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i10, clientSettings, null, null);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull ClientSettings clientSettings, @NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i10, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull ClientSettings clientSettings, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i10, clientSettings, (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    @VisibleForTesting
    public GmsClient(@NonNull Context context, @NonNull Looper looper, @NonNull GmsClientSupervisor gmsClientSupervisor, @NonNull GoogleApiAvailability googleApiAvailability, int i10, @NonNull ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i10, connectionCallbacks == null ? null : new zah(connectionCallbacks), onConnectionFailedListener == null ? null : new zai(onConnectionFailedListener), clientSettings.zac());
        this.zab = clientSettings;
        this.zad = clientSettings.getAccount();
        this.zac = zaa(clientSettings.getAllRequestedScopes());
    }
}
