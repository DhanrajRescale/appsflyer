package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1ySDK implements AFh1zSDK {
    private AFg1bSDK AFInAppEventParameterName;
    private AFg1hSDK AFInAppEventType;

    @NotNull
    private final AFd1kSDK AFKeystoreWrapper;
    private AFg1gSDK values;

    public AFh1ySDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFKeystoreWrapper = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventParameterName() {
        AFg1bSDK aFg1bSDK = this.AFInAppEventParameterName;
        if (aFg1bSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1bSDK);
            this.AFInAppEventParameterName = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFInAppEventType() {
        AFg1hSDK aFg1hSDK = this.AFInAppEventType;
        if (aFg1hSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.RD, "Releasing Proxy Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1hSDK);
            this.AFInAppEventType = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void AFKeystoreWrapper() {
        AFg1gSDK aFg1gSDK = this.values;
        if (aFg1gSDK != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1fSDK.v$default(aFLogger, AFg1aSDK.EXCEPTION_MANAGER, "Releasing Exception Manager Client", false, 4, null);
            aFLogger.unregisterClient(aFg1gSDK);
            this.values = null;
        }
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void registerClient() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new AFg1hSDK();
        }
        AFg1hSDK aFg1hSDK = this.AFInAppEventType;
        Intrinsics.c(aFg1hSDK);
        aFg1fSDKArr[0] = aFg1hSDK;
        aFLogger.registerClient(aFg1fSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void valueOf() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.values == null) {
            this.values = new AFg1gSDK(this.AFKeystoreWrapper);
        }
        AFg1gSDK aFg1gSDK = this.values;
        Intrinsics.c(aFg1gSDK);
        aFg1fSDKArr[0] = aFg1gSDK;
        aFLogger.registerClient(aFg1fSDKArr);
    }

    @Override // com.appsflyer.internal.AFh1zSDK
    public final void values() {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1fSDK[] aFg1fSDKArr = new AFg1fSDK[1];
        if (this.AFInAppEventParameterName == null) {
            this.AFInAppEventParameterName = new AFg1bSDK(this.AFKeystoreWrapper);
        }
        AFg1bSDK aFg1bSDK = this.AFInAppEventParameterName;
        Intrinsics.c(aFg1bSDK);
        aFg1fSDKArr[0] = aFg1bSDK;
        aFLogger.registerClient(aFg1fSDKArr);
    }
}
