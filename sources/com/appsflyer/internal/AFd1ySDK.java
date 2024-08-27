package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1ySDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final Executor AFInAppEventParameterName;

    @NotNull
    final AFd1xSDK.AFa1zSDK AFInAppEventType;

    @NotNull
    private final AFi1qSDK AFKeystoreWrapper;
    private boolean AFLogger;
    private boolean registerClient;

    @NotNull
    private final ScheduledExecutorService valueOf;

    @NotNull
    private final AFc1vSDK values;

    public AFd1ySDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1vSDK aFc1vSDK, @NotNull AFi1qSDK aFi1qSDK, @NotNull AFd1xSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.AFInAppEventParameterName = executor;
        this.valueOf = scheduledExecutorService;
        this.values = aFc1vSDK;
        this.AFKeystoreWrapper = aFi1qSDK;
        this.AFInAppEventType = aFa1zSDK;
    }

    public static final void AFInAppEventParameterName(AFd1ySDK aFd1ySDK, AFh1xSDK aFh1xSDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        if (!aFd1ySDK.AFLogger) {
            try {
                aFd1ySDK.AFInAppEventType.values(aFh1xSDK);
            } catch (Exception e10) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e10, true);
            }
        }
        aFd1ySDK.registerClient = false;
        aFd1ySDK.AFLogger = true;
    }

    public static final void AFInAppEventType(AFd1ySDK aFd1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        aFd1ySDK.registerClient = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFd1ySDK.valueOf;
            i iVar = new i(aFd1ySDK, 1);
            AFd1xSDK.Companion companion = AFd1xSDK.INSTANCE;
            scheduledExecutorService.schedule(iVar, AFd1xSDK.Companion.AFInAppEventParameterName(), TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th2);
        }
    }

    public static final void values(AFd1ySDK aFd1ySDK) {
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        if (aFd1ySDK.AFLogger && aFd1ySDK.registerClient) {
            aFd1ySDK.AFLogger = false;
            try {
                aFd1ySDK.AFInAppEventType.valueOf();
            } catch (Exception e10) {
                AFLogger.afErrorLog("Listener threw exception! ", e10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        Uri uri;
        Intrinsics.checkNotNullParameter(activity, "");
        AFc1vSDK aFc1vSDK = this.values;
        Intent intent = activity.getIntent();
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction())) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null && intent != aFc1vSDK.AFInAppEventType) {
            aFc1vSDK.AFInAppEventType = intent;
        }
        this.AFKeystoreWrapper.values(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventParameterName.execute(new i(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFInAppEventParameterName.execute(new h(0, this, new AFh1xSDK(activity, this.AFKeystoreWrapper)));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
