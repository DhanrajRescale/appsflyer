package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes2.dex */
public class BaseImplementation {

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface ResultHolder<R> {
        @KeepForSdk
        void setFailedResult(@NonNull Status status);

        @KeepForSdk
        void setResult(@NonNull R r10);
    }

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static abstract class ApiMethodImpl<R extends Result, A extends Api.AnyClient> extends BasePendingResult<R> implements ResultHolder<R> {

        @KeepForSdk
        private final Api<?> mApi;

        @KeepForSdk
        private final Api.AnyClientKey<A> mClientKey;

        @KeepForSdk
        @Deprecated
        public ApiMethodImpl(@NonNull Api.AnyClientKey<A> anyClientKey, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            this.mClientKey = (Api.AnyClientKey) Preconditions.checkNotNull(anyClientKey);
            this.mApi = null;
        }

        @KeepForSdk
        private void setFailedResult(@NonNull RemoteException remoteException) {
            setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        @KeepForSdk
        public abstract void doExecute(@NonNull A a10) throws RemoteException;

        @KeepForSdk
        public final Api<?> getApi() {
            return this.mApi;
        }

        @NonNull
        @KeepForSdk
        public final Api.AnyClientKey<A> getClientKey() {
            return this.mClientKey;
        }

        @KeepForSdk
        public void onSetFailedResult(@NonNull R r10) {
        }

        @KeepForSdk
        public final void run(@NonNull A a10) throws DeadObjectException {
            try {
                doExecute(a10);
            } catch (DeadObjectException e10) {
                setFailedResult(e10);
                throw e10;
            } catch (RemoteException e11) {
                setFailedResult(e11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public /* bridge */ /* synthetic */ void setResult(@NonNull Object obj) {
            super.setResult((ApiMethodImpl<R, A>) obj);
        }

        @KeepForSdk
        public ApiMethodImpl(@NonNull Api<?> api, @NonNull GoogleApiClient googleApiClient) {
            super((GoogleApiClient) Preconditions.checkNotNull(googleApiClient, "GoogleApiClient must not be null"));
            Preconditions.checkNotNull(api, "Api must not be null");
            this.mClientKey = (Api.AnyClientKey<A>) api.zab();
            this.mApi = api;
        }

        @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
        @KeepForSdk
        public final void setFailedResult(@NonNull Status status) {
            Preconditions.checkArgument(!status.isSuccess(), "Failed result must not be success");
            R createFailedResult = createFailedResult(status);
            setResult((ApiMethodImpl<R, A>) createFailedResult);
            onSetFailedResult(createFailedResult);
        }

        @KeepForSdk
        public ApiMethodImpl(@NonNull BasePendingResult.CallbackHandler<R> callbackHandler) {
            super(callbackHandler);
            this.mClientKey = new Api.AnyClientKey<>();
            this.mApi = null;
        }
    }
}
