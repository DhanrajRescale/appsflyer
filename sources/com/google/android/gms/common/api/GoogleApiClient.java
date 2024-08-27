package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.j0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import v.e;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public abstract class GoogleApiClient {

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set<GoogleApiClient> zaa = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes2.dex */
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            try {
                String concat = String.valueOf(str).concat("  ");
                int i10 = 0;
                for (GoogleApiClient googleApiClient : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i10);
                    googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    public abstract ConnectionResult blockingConnect();

    @NonNull
    public abstract ConnectionResult blockingConnect(long j10, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i10) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr);

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t10) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t10) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    @NonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l10) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull j0 j0Var);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class Builder {
        private Account zaa;
        private final Set<Scope> zab;
        private final Set<Scope> zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map<Api<?>, com.google.android.gms.common.internal.zab> zah;
        private final Context zai;
        private final Map<Api<?>, Api.ApiOptions> zaj;
        private LifecycleActivity zak;
        private int zal;
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> zap;
        private final ArrayList<ConnectionCallbacks> zaq;
        private final ArrayList<OnConnectionFailedListener> zar;

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab>, t.j0] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.api.Api$ApiOptions>, t.j0] */
        @KeepForSdk
        public Builder(@NonNull Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new t.j0();
            this.zaj = new t.j0();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList<>();
            this.zar = new ArrayList<>();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final <O extends Api.ApiOptions> void zab(Api<O> api, O o10, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o10));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @NonNull
        public Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o10, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            zab(api, o10, scopeArr);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @NonNull
        public Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        /* JADX WARN: Type inference failed for: r11v0, types: [t.j0, java.util.Map] */
        /* JADX WARN: Type inference failed for: r14v0, types: [t.j0, java.util.Map, t.f] */
        @NonNull
        public GoogleApiClient build() {
            boolean z10;
            Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings zaa = zaa();
            Map<Api<?>, com.google.android.gms.common.internal.zab> zad = zaa.zad();
            ?? j0Var = new t.j0();
            ?? j0Var2 = new t.j0();
            ArrayList arrayList = new ArrayList();
            boolean z11 = false;
            Api<?> api = null;
            boolean z12 = false;
            for (Api<?> api2 : this.zaj.keySet()) {
                Api.ApiOptions apiOptions = this.zaj.get(api2);
                if (zad.get(api2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j0Var.put(api2, Boolean.valueOf(z10));
                zat zatVar = new zat(api2, z10);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client buildClient = abstractClientBuilder.buildClient(this.zai, this.zan, zaa, (ClientSettings) apiOptions, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                j0Var2.put(api2.zab(), buildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    if (apiOptions != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (buildClient.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String zad2 = api2.zad();
                        String zad3 = api.zad();
                        throw new IllegalStateException(e.j(new StringBuilder(String.valueOf(zad2).length() + 21 + String.valueOf(zad3).length()), zad2, " cannot be used with ", zad3));
                    }
                }
            }
            if (api != null) {
                if (!z12) {
                    if (this.zaa == null) {
                        z11 = true;
                    }
                    Preconditions.checkState(z11, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                    Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
                } else {
                    String zad4 = api.zad();
                    throw new IllegalStateException(e.j(new StringBuilder(String.valueOf(zad4).length() + 82), "With using ", zad4, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, zaa, this.zao, this.zap, j0Var, this.zaq, this.zar, j0Var2, this.zal, zabe.zad(j0Var2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull j0 j0Var, int i10, OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) j0Var);
            Preconditions.checkArgument(i10 >= 0, "clientId must be non-negative");
            this.zal = i10;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            Account account;
            if (str == null) {
                account = null;
            } else {
                account = new Account(str, "com.google");
            }
            this.zaa = account;
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int i10) {
            this.zad = i10;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @NonNull
        @VisibleForTesting
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map<Api<?>, Api.ApiOptions> map = this.zaj;
            Api<SignInOptions> api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        @NonNull
        public Builder enableAutoManage(@NonNull j0 j0Var, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(j0Var, 0, onConnectionFailedListener);
            return this;
        }

        @NonNull
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o10) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o10);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @KeepForSdk
        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
