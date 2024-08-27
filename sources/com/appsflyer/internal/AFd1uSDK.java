package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFd1xSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1uSDK implements AFd1xSDK {

    @NotNull
    private final ScheduledExecutorService AFInAppEventParameterName;

    @NotNull
    private final AFc1vSDK AFInAppEventType;
    private AFd1ySDK AFKeystoreWrapper;

    @NotNull
    private final AFi1qSDK valueOf;

    @NotNull
    private final Executor values;

    public AFd1uSDK(@NotNull Executor executor, @NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFc1vSDK aFc1vSDK, @NotNull AFi1qSDK aFi1qSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        this.values = executor;
        this.AFInAppEventParameterName = scheduledExecutorService;
        this.AFInAppEventType = aFc1vSDK;
        this.valueOf = aFi1qSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType(@NotNull Context context, @NotNull AFd1xSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFKeystoreWrapper != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFKeystoreWrapper);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.AFKeystoreWrapper = null;
        AFd1ySDK aFd1ySDK = new AFd1ySDK(this.values, this.AFInAppEventParameterName, this.AFInAppEventType, this.valueOf, aFa1zSDK);
        this.AFKeystoreWrapper = aFd1ySDK;
        if (context instanceof Activity) {
            aFd1ySDK.onActivityResumed((Activity) context);
        }
        Application AFInAppEventParameterName = AFb1uSDK.AFInAppEventParameterName(context);
        if (AFInAppEventParameterName != null) {
            AFInAppEventParameterName.registerActivityLifecycleCallbacks(this.AFKeystoreWrapper);
        }
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final boolean values() {
        return this.AFKeystoreWrapper != null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFInAppEventType() {
        AFd1xSDK.AFa1zSDK aFa1zSDK;
        AFd1ySDK aFd1ySDK = this.AFKeystoreWrapper;
        if (aFd1ySDK == null || (aFa1zSDK = aFd1ySDK.AFInAppEventType) == null) {
            return;
        }
        aFa1zSDK.valueOf();
    }
}
