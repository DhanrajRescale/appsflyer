package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface AFd1kSDK {
    @NonNull
    AFe1ySDK AFInAppEventParameterName();

    @NonNull
    AFd1sSDK AFInAppEventType();

    @NonNull
    ScheduledExecutorService AFKeystoreWrapper();

    @NonNull
    AFh1wSDK AFLogger();

    @NonNull
    AFh1zSDK AFLogger$LogLevel();

    @NonNull
    AFi1qSDK AFPurchaseDetails();

    @NonNull
    AFc1iSDK afDebugLog();

    @NonNull
    AFb1tSDK afErrorLog();

    @NonNull
    AFd1xSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFe1cSDK afInfoLog();

    @NonNull
    AFh1cSDK afLogForce();

    @NonNull
    AFc1vSDK afRDLog();

    @NonNull
    AFe1gSDK afVerboseLog();

    @NonNull
    AFi1sSDK afWarnLog();

    @NonNull
    AFi1cSDK d();

    @NonNull
    AFg1mSDK e();

    @NonNull
    AFi1aSDK force();

    @NonNull
    AFd1jSDK getCurrency();

    @NonNull
    AFd1pSDK getLevel();

    @NonNull
    AFc1kSDK getPurchaseToken();

    @NonNull
    AFg1tSDK getPurchaseType();

    @NonNull
    AFg1wSDK i();

    @NonNull
    AFf1bSDK registerClient();

    @NonNull
    PurchaseHandler unregisterClient();

    @NonNull
    AFb1bSDK v();

    @NonNull
    AFd1qSDK valueOf();

    @NonNull
    ExecutorService values();

    @NonNull
    AFd1lSDK w();
}
