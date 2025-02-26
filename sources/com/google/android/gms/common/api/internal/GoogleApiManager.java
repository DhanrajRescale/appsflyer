package com.google.android.gms.common.api.internal;

import a3.a;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import t.g;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiManager implements Handler.Callback {

    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    private static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    private static final Object zac = new Object();
    private static GoogleApiManager zad;
    private TelemetryData zai;
    private TelemetryLoggingClient zaj;
    private final Context zak;
    private final GoogleApiAvailability zal;
    private final com.google.android.gms.common.internal.zal zam;

    @NotOnlyInitialized
    private final Handler zat;
    private volatile boolean zau;
    private long zae = 5000;
    private long zaf = 120000;
    private long zag = 10000;
    private boolean zah = false;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    private final Map<ApiKey<?>, zabq<?>> zap = new ConcurrentHashMap(5, 0.75f, 1);
    private zaae zaq = null;
    private final Set<ApiKey<?>> zar = new g();
    private final Set<ApiKey<?>> zas = new g();

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zau = true;
        this.zak = context;
        com.google.android.gms.internal.base.zaq zaqVar = new com.google.android.gms.internal.base.zaq(looper, this);
        this.zat = zaqVar;
        this.zal = googleApiAvailability;
        this.zam = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zac) {
            try {
                GoogleApiManager googleApiManager = zad;
                if (googleApiManager != null) {
                    googleApiManager.zao.incrementAndGet();
                    Handler handler = googleApiManager.zat;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zaH(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String zab2 = apiKey.zab();
        String valueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, a.k(new StringBuilder(String.valueOf(zab2).length() + 63 + valueOf.length()), "API: ", zab2, " is not available on this device. Connection failed with: ", valueOf));
    }

    private final zabq<?> zaI(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zabq<?> zabqVar = this.zap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.zap.put(apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.zas.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    private final TelemetryLoggingClient zaJ() {
        if (this.zaj == null) {
            this.zaj = TelemetryLogging.getClient(this.zak);
        }
        return this.zaj;
    }

    private final void zaK() {
        TelemetryData telemetryData = this.zai;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || zaF()) {
                zaJ().log(telemetryData);
            }
            this.zai = null;
        }
    }

    private final <T> void zaL(TaskCompletionSource<T> taskCompletionSource, int i10, GoogleApi googleApi) {
        zacd zaa2;
        if (i10 != 0 && (zaa2 = zacd.zaa(this, i10, googleApi.getApiKey())) != null) {
            Task<T> task = taskCompletionSource.getTask();
            final Handler handler = this.zat;
            handler.getClass();
            task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, zaa2);
        }
    }

    @NonNull
    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            Preconditions.checkNotNull(zad, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zad;
        }
        return googleApiManager;
    }

    @NonNull
    public static GoogleApiManager zam(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zac) {
            try {
                if (zad == null) {
                    zad = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
                }
                googleApiManager = zad;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return googleApiManager;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        ApiKey apiKey;
        ApiKey apiKey2;
        ApiKey apiKey3;
        ApiKey apiKey4;
        int i10 = message.what;
        long j10 = 300000;
        zabq<?> zabqVar = null;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.zag = j10;
                this.zat.removeMessages(12);
                for (ApiKey<?> apiKey5 : this.zap.keySet()) {
                    Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, apiKey5), this.zag);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                Iterator<ApiKey<?>> it = zalVar.zab().iterator();
                while (true) {
                    if (it.hasNext()) {
                        ApiKey<?> next = it.next();
                        zabq<?> zabqVar2 = this.zap.get(next);
                        if (zabqVar2 == null) {
                            zalVar.zac(next, new ConnectionResult(13), null);
                        } else if (zabqVar2.zay()) {
                            zalVar.zac(next, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                        } else {
                            ConnectionResult zad2 = zabqVar2.zad();
                            if (zad2 != null) {
                                zalVar.zac(next, zad2, null);
                            } else {
                                zabqVar2.zat(zalVar);
                                zabqVar2.zao();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (zabq<?> zabqVar3 : this.zap.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVar4 = this.zap.get(zachVar.zac.getApiKey());
                if (zabqVar4 == null) {
                    zabqVar4 = zaI(zachVar.zac);
                }
                if (zabqVar4.zaz() && this.zao.get() != zachVar.zab) {
                    zachVar.zaa.zad(zaa);
                    zabqVar4.zav();
                } else {
                    zabqVar4.zap(zachVar.zaa);
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zabq<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zabq<?> next2 = it2.next();
                        if (next2.zab() == i11) {
                            zabqVar = next2;
                        }
                    }
                }
                if (zabqVar != null) {
                    if (connectionResult.getErrorCode() == 13) {
                        String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                        String errorMessage = connectionResult.getErrorMessage();
                        zabq.zai(zabqVar, new Status(17, a.k(new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length()), "Error resolution was canceled by the user, original error message: ", errorString, ": ", errorMessage)));
                    } else {
                        zabq.zai(zabqVar, zaH(zabq.zag(zabqVar), connectionResult));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i11);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabl(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zag = 300000L;
                    }
                }
                return true;
            case 7:
                zaI((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zau();
                }
                return true;
            case 10:
                Iterator<ApiKey<?>> it3 = this.zas.iterator();
                while (it3.hasNext()) {
                    zabq<?> remove = this.zap.remove(it3.next());
                    if (remove != null) {
                        remove.zav();
                    }
                }
                this.zas.clear();
                return true;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaw();
                }
                return true;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaA();
                }
                return true;
            case 14:
                zaaf zaafVar = (zaaf) message.obj;
                ApiKey<?> zaa2 = zaafVar.zaa();
                if (!this.zap.containsKey(zaa2)) {
                    zaafVar.zab().setResult(Boolean.FALSE);
                } else {
                    zaafVar.zab().setResult(Boolean.valueOf(zabq.zax(this.zap.get(zaa2), false)));
                }
                return true;
            case 15:
                zabs zabsVar = (zabs) message.obj;
                Map<ApiKey<?>, zabq<?>> map = this.zap;
                apiKey = zabsVar.zaa;
                if (map.containsKey(apiKey)) {
                    Map<ApiKey<?>, zabq<?>> map2 = this.zap;
                    apiKey2 = zabsVar.zaa;
                    zabq.zal(map2.get(apiKey2), zabsVar);
                }
                return true;
            case 16:
                zabs zabsVar2 = (zabs) message.obj;
                Map<ApiKey<?>, zabq<?>> map3 = this.zap;
                apiKey3 = zabsVar2.zaa;
                if (map3.containsKey(apiKey3)) {
                    Map<ApiKey<?>, zabq<?>> map4 = this.zap;
                    apiKey4 = zabsVar2.zaa;
                    zabq.zam(map4.get(apiKey4), zabsVar2);
                }
                return true;
            case 17:
                zaK();
                return true;
            case 18:
                zace zaceVar = (zace) message.obj;
                if (zaceVar.zac == 0) {
                    zaJ().log(new TelemetryData(zaceVar.zab, Arrays.asList(zaceVar.zaa)));
                } else {
                    TelemetryData telemetryData = this.zai;
                    if (telemetryData != null) {
                        List<MethodInvocation> zab2 = telemetryData.zab();
                        if (telemetryData.zaa() == zaceVar.zab && (zab2 == null || zab2.size() < zaceVar.zad)) {
                            this.zai.zac(zaceVar.zaa);
                        } else {
                            this.zat.removeMessages(17);
                            zaK();
                        }
                    }
                    if (this.zai == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zaceVar.zaa);
                        this.zai = new TelemetryData(zaceVar.zab, arrayList);
                        Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zaceVar.zac);
                    }
                }
                return true;
            case 19:
                this.zah = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i10);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final void zaA() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void zaB(@NonNull GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    public final void zaC(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zaq != zaaeVar) {
                    this.zaq = zaaeVar;
                    this.zar.clear();
                }
                this.zar.addAll(zaaeVar.zaa());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zaD(@NonNull zaae zaaeVar) {
        synchronized (zac) {
            try {
                if (this.zaq == zaaeVar) {
                    this.zaq = null;
                    this.zar.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zaF() {
        if (this.zah) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zam.zaa(this.zak, 203400000);
        if (zaa2 != -1 && zaa2 != 0) {
            return false;
        }
        return true;
    }

    public final boolean zaG(ConnectionResult connectionResult, int i10) {
        return this.zal.zah(this.zak, connectionResult, i10);
    }

    public final int zaa() {
        return this.zan.getAndIncrement();
    }

    public final zabq zak(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    @NonNull
    public final Task<Map<ApiKey<?>, String>> zao(@NonNull Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    public final Task<Boolean> zap(@NonNull GoogleApi<?> googleApi) {
        zaaf zaafVar = new zaaf(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaafVar));
        return zaafVar.zab().getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Void> zaq(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zach(zafVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zar(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zaL(taskCompletionSource, i10, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zach(zahVar, this.zao.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void zaw(@NonNull GoogleApi<O> googleApi, int i10, @NonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i10, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zaeVar, this.zao.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zax(@NonNull GoogleApi<O> googleApi, int i10, @NonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        zaL(taskCompletionSource, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i10, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zach(zagVar, this.zao.get(), googleApi)));
    }

    public final void zay(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zace(methodInvocation, i10, j10, i11)));
    }

    public final void zaz(@NonNull ConnectionResult connectionResult, int i10) {
        if (!zaG(connectionResult, i10)) {
            Handler handler = this.zat;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
        }
    }
}
