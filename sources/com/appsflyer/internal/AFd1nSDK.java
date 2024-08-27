package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFd1nSDK implements AFd1kSDK {
    private static final int AFKeystoreWrapper = (int) TimeUnit.SECONDS.toMillis(30);
    public final AFd1lSDK AFInAppEventParameterName = new AFd1lSDK();
    private ExecutorService AFInAppEventType;
    private PurchaseHandler AFLogger;
    private AFc1iSDK AFLogger$LogLevel;
    private AFc1vSDK AFPurchaseDetails;
    private AFd1iSDK afDebugLog;
    private AFe1gSDK afErrorLog;
    private AFh1cSDK afErrorLogForExcManagerOnly;
    private AFg1mSDK afInfoLog;
    private AFd1vSDK afLogForce;
    private AFi1sSDK afRDLog;
    private AFg1wSDK afVerboseLog;
    private AFb1tSDK afWarnLog;
    private AFg1rSDK component4;
    private AFd1pSDK component5;

    /* renamed from: d, reason: collision with root package name */
    private AFf1bSDK f8417d;

    /* renamed from: e, reason: collision with root package name */
    private AFh1wSDK f8418e;
    private AFb1bSDK force;
    private AFi1qSDK getCurrency;
    private AFd1xSDK getLevel;
    private AFa1bSDK getPrice;
    private AFh1zSDK getProductId;
    private AFg1tSDK getPurchaseToken;
    private AFc1kSDK getPurchaseType;

    /* renamed from: i, reason: collision with root package name */
    private AFi1aSDK f8419i;
    private AFd1sSDK registerClient;
    private AFe1xSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private AFe1cSDK f8420v;
    private ExecutorService valueOf;
    private ScheduledExecutorService values;

    /* renamed from: w, reason: collision with root package name */
    private AFi1cSDK f8421w;

    /* loaded from: classes.dex */
    public static class AFa1zSDK implements ThreadFactory {
        private static final AtomicInteger valueOf = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1zSDK() {
            valueOf.incrementAndGet();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            int i10 = valueOf.get();
            int incrementAndGet = this.AFInAppEventParameterName.incrementAndGet();
            StringBuilder sb2 = new StringBuilder("queue-");
            sb2.append(i10);
            sb2.append("-");
            sb2.append(incrementAndGet);
            return new Thread(runnable, sb2.toString());
        }
    }

    @NonNull
    private synchronized AFg1rSDK component1() {
        try {
            if (this.component4 == null) {
                this.component4 = new AFg1rSDK(w(), AFInAppEventType());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.component4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    /* renamed from: component4, reason: merged with bridge method [inline-methods] */
    public synchronized AFd1iSDK getCurrency() {
        try {
            if (this.afDebugLog == null) {
                this.afDebugLog = new AFd1iSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afDebugLog;
    }

    @NonNull
    private synchronized AFe1xSDK getPrice() {
        try {
            if (this.unregisterClient == null) {
                this.unregisterClient = new AFe1xSDK(new AFe1qSDK(AFKeystoreWrapper), values());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.unregisterClient;
    }

    @NonNull
    private synchronized ExecutorService getProductId() {
        try {
            if (this.AFInAppEventType == null) {
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
                this.AFInAppEventType = newSingleThreadExecutor;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFe1ySDK AFInAppEventParameterName() {
        return new AFe1ySDK(getPrice(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog());
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFd1sSDK AFInAppEventType() {
        try {
            if (this.registerClient == null) {
                AFd1lSDK w10 = w();
                Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
                if (context != null) {
                    AFd1tSDK aFd1tSDK = new AFd1tSDK(AFb1vSDK.AFKeystoreWrapper(context));
                    if (this.component5 == null) {
                        this.component5 = new AFd1pSDK();
                    }
                    this.registerClient = new AFd1sSDK(w10, aFd1tSDK, this.component5);
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized ScheduledExecutorService AFKeystoreWrapper() {
        try {
            if (this.values == null) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(2);
                Intrinsics.checkNotNullExpressionValue(newScheduledThreadPool, "");
                this.values = newScheduledThreadPool;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.values;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFh1wSDK AFLogger() {
        try {
            if (this.f8418e == null) {
                this.f8418e = new AFh1wSDK(valueOf());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8418e;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFh1zSDK AFLogger$LogLevel() {
        if (this.getProductId == null) {
            this.getProductId = new AFh1ySDK(this);
        }
        return this.getProductId;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1qSDK AFPurchaseDetails() {
        if (this.getCurrency == null) {
            this.getCurrency = new AFi1pSDK();
        }
        return this.getCurrency;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFc1iSDK afDebugLog() {
        try {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFd1zSDK(w());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger$LogLevel;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFb1tSDK afErrorLog() {
        try {
            if (this.afWarnLog == null) {
                this.afWarnLog = new AFb1iSDK(w());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afWarnLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1xSDK afErrorLogForExcManagerOnly() {
        if (this.getLevel == null) {
            ExecutorService productId = getProductId();
            ScheduledExecutorService AFKeystoreWrapper2 = AFKeystoreWrapper();
            AFc1vSDK afRDLog = afRDLog();
            if (this.getCurrency == null) {
                this.getCurrency = new AFi1pSDK();
            }
            this.getLevel = new AFd1uSDK(productId, AFKeystoreWrapper2, afRDLog, this.getCurrency);
        }
        return this.getLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFe1cSDK afInfoLog() {
        try {
            if (this.f8420v == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() { // from class: com.appsflyer.internal.AFd1nSDK.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
                    /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1zSDK());
                threadPoolExecutor.setRejectedExecutionHandler(new Object());
                this.f8420v = new AFe1cSDK(threadPoolExecutor);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8420v;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFh1cSDK afLogForce() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                this.afErrorLogForExcManagerOnly = new AFh1cSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFc1vSDK afRDLog() {
        try {
            if (this.AFPurchaseDetails == null) {
                this.AFPurchaseDetails = new AFc1vSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFPurchaseDetails;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFe1gSDK afVerboseLog() {
        try {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFe1gSDK(AFInAppEventType(), valueOf());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1sSDK afWarnLog() {
        if (this.afRDLog == null) {
            this.afRDLog = new AFi1tSDK();
        }
        return this.afRDLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFi1cSDK d() {
        if (this.f8421w == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                this.f8421w = new AFj1vSDK(context, getProductId());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.f8421w;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFg1mSDK e() {
        if (this.afInfoLog == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                if (this.afRDLog == null) {
                    this.afRDLog = new AFi1tSDK();
                }
                AFi1sSDK aFi1sSDK = this.afRDLog;
                if (this.afLogForce == null) {
                    this.afLogForce = new AFa1tSDK();
                }
                AFd1vSDK aFd1vSDK = this.afLogForce;
                if (this.f8421w == null) {
                    Context context2 = this.AFInAppEventParameterName.AFKeystoreWrapper;
                    if (context2 != null) {
                        this.f8421w = new AFj1vSDK(context2, getProductId());
                    } else {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                }
                AFi1cSDK aFi1cSDK = this.f8421w;
                if (this.getPrice == null) {
                    this.getPrice = new AFa1cSDK();
                }
                AFa1bSDK aFa1bSDK = this.getPrice;
                AFh1wSDK AFLogger = AFLogger();
                AFd1qSDK valueOf = valueOf();
                AFd1sSDK AFInAppEventType = AFInAppEventType();
                if (this.afErrorLogForExcManagerOnly == null) {
                    Context context3 = this.AFInAppEventParameterName.AFKeystoreWrapper;
                    if (context3 != null) {
                        this.afErrorLogForExcManagerOnly = new AFh1cSDK(context3);
                    } else {
                        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                    }
                }
                AFh1cSDK aFh1cSDK = this.afErrorLogForExcManagerOnly;
                AFg1wSDK i10 = i();
                AFb1hSDK aFb1hSDK = new AFb1hSDK();
                AFd1lSDK w10 = w();
                AFg1rSDK component1 = component1();
                if (this.component5 == null) {
                    this.component5 = new AFd1pSDK();
                }
                this.afInfoLog = new AFg1jSDK(context, aFi1sSDK, aFd1vSDK, aFi1cSDK, aFa1bSDK, AFLogger, valueOf, AFInAppEventType, aFh1cSDK, i10, aFb1hSDK, w10, component1, this.component5);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afInfoLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFi1aSDK force() {
        try {
            if (this.f8419i == null) {
                this.f8419i = new AFi1aSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8419i;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1pSDK getLevel() {
        if (this.component5 == null) {
            this.component5 = new AFd1pSDK();
        }
        return this.component5;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFc1kSDK getPurchaseToken() {
        if (this.getPurchaseType == null) {
            this.getPurchaseType = new AFc1hSDK(valueOf());
        }
        return this.getPurchaseType;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFg1tSDK getPurchaseType() {
        if (this.getPurchaseToken == null) {
            Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
            if (context != null) {
                AFg1pSDK aFg1pSDK = new AFg1pSDK(context, AppsFlyerProperties.getInstance());
                if (this.component5 == null) {
                    this.component5 = new AFd1pSDK();
                }
                this.getPurchaseToken = new AFg1sSDK(aFg1pSDK, this.component5, AppsFlyerProperties.getInstance());
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.getPurchaseToken;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFg1wSDK i() {
        try {
            if (this.afVerboseLog == null) {
                this.afVerboseLog = new AFg1wSDK(w(), new AFg1uSDK());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.afVerboseLog;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFf1bSDK registerClient() {
        try {
            if (this.f8417d == null) {
                AFg1xSDK aFg1xSDK = new AFg1xSDK(valueOf());
                this.f8417d = new AFf1bSDK(new AFg1ySDK(), AFInAppEventType(), i(), aFg1xSDK, new AFe1ySDK(getPrice(), AFInAppEventType(), AppsFlyerProperties.getInstance(), afVerboseLog()), new AFg1zSDK(AFInAppEventType(), aFg1xSDK), afInfoLog());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8417d;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized PurchaseHandler unregisterClient() {
        try {
            if (this.AFLogger == null) {
                this.AFLogger = new PurchaseHandler(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.AFLogger;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFb1bSDK v() {
        try {
            if (this.force == null) {
                this.force = new AFb1gSDK(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.force;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final AFd1qSDK valueOf() {
        Context context = this.AFInAppEventParameterName.AFKeystoreWrapper;
        if (context != null) {
            return new AFd1tSDK(AFb1vSDK.AFKeystoreWrapper(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized ExecutorService values() {
        try {
            if (this.valueOf == null) {
                this.valueOf = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.valueOf;
    }

    @Override // com.appsflyer.internal.AFd1kSDK
    @NonNull
    public final synchronized AFd1lSDK w() {
        return this.AFInAppEventParameterName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventType(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e10) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e10);
            Thread.currentThread().interrupt();
        }
    }
}
