package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import fr.d;
import ir.b;
import ir.c;
import ir.f;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jr.i;
import jr.l;
import jr.q;
import pp.g;
import vq.w;
import vq.x;
import yq.a;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, c> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final w cache;
    private final Executor executor;
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private mq.c firebaseRemoteConfigProvider;
    private static final a logger = a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(w.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        pp.a aVar = (pp.a) g.d().b(pp.a.class);
        if (aVar != null) {
            return aVar.f31259a;
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private c getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            c cVar = this.allRcConfigMap.get(str);
            if (((q) cVar).f21655b == 2) {
                logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((q) cVar).d(), str);
                return cVar;
            }
            return null;
        }
        return null;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.c());
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        b bVar = this.firebaseRemoteConfig;
        bVar.b().onSuccessTask(bVar.f20500c, new ir.a(bVar)).addOnSuccessListener(this.executor, new x(this)).addOnFailureListener(this.executor, new x(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.c());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public d getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new d();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d(Boolean.valueOf(((q) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new d();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public d getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new d();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d(Double.valueOf(((q) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new d();
    }

    public d getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new d();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new d(Long.valueOf(((q) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                q qVar = (q) remoteConfigValue;
                if (!qVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                }
            }
        }
        return new d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        Object obj;
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    obj = Boolean.valueOf(((q) remoteConfigValue).a());
                } else if (t10 instanceof Double) {
                    obj = Double.valueOf(((q) remoteConfigValue).b());
                } else {
                    if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                        if (t10 instanceof String) {
                            obj = ((q) remoteConfigValue).d();
                        } else {
                            T t11 = (T) ((q) remoteConfigValue).d();
                            try {
                                logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                                return t11;
                            } catch (IllegalArgumentException unused) {
                                t10 = t11;
                                q qVar = (q) remoteConfigValue;
                                if (!qVar.d().isEmpty()) {
                                    logger.b("Could not parse value: '%s' for key: '%s'.", qVar.d(), str);
                                    return t10;
                                }
                                return t10;
                            }
                        }
                    }
                    obj = Long.valueOf(((q) remoteConfigValue).c());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t10;
        }
    }

    public d getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new d();
        }
        c remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new d(((q) remoteConfigValue).d());
        }
        return new d();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        mq.c cVar;
        f fVar;
        if (this.firebaseRemoteConfig == null && (cVar = this.firebaseRemoteConfigProvider) != null && (fVar = (f) cVar.get()) != null) {
            this.firebaseRemoteConfig = fVar.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mn.f] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, jr.p] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, jr.p] */
    public boolean isLastFetchFailed() {
        int i10;
        b bVar = this.firebaseRemoteConfig;
        if (bVar == null) {
            return true;
        }
        l lVar = bVar.f20506i;
        synchronized (lVar.f21627b) {
            try {
                long j10 = lVar.f21626a.getLong("last_fetch_time_in_millis", -1L);
                i10 = lVar.f21626a.getInt("last_fetch_status", 0);
                int[] iArr = i.f21606k;
                long j11 = lVar.f21626a.getLong("fetch_timeout_in_seconds", 60L);
                if (j11 >= FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                    long j12 = lVar.f21626a.getLong("minimum_fetch_interval_in_seconds", i.f21605j);
                    if (j12 >= FETCH_NEVER_HAPPENED_TIMESTAMP_MS) {
                        ?? obj = new Object();
                        obj.f27852a = j11;
                        obj.f27853b = j12;
                        ?? obj2 = new Object();
                        obj2.f21652b = i10;
                        obj2.f21651a = j10;
                        obj2.f21653c = obj;
                        ?? obj3 = new Object();
                        obj3.f21651a = j10;
                        obj3.f21652b = i10;
                        obj3.f21653c = obj;
                    } else {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j12 + " is an invalid argument");
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
                }
            } finally {
            }
        }
        if (i10 == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(mq.c cVar) {
        this.firebaseRemoteConfigProvider = cVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, c> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        vq.d a02 = vq.d.a0();
        ConcurrentHashMap<String, c> concurrentHashMap = this.allRcConfigMap;
        a02.getClass();
        c cVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (cVar != null) {
            try {
                this.cache.g("com.google.firebase.perf.ExperimentTTID", ((q) cVar).a());
                return;
            } catch (Exception unused) {
                logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.a("ExperimentTTID remote config flag does not exist.");
    }

    @VisibleForTesting
    public RemoteConfigManager(w wVar, Executor executor, b bVar, long j10, long j11) {
        ConcurrentHashMap<String, c> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = wVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.c());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
