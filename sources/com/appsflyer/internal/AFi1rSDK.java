package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public abstract class AFi1rSDK extends AFi1hSDK {
    private AFd1sSDK valueOf;

    public AFi1rSDK(String str, String str2, AFd1sSDK aFd1sSDK, Runnable runnable) {
        super(str, str2, runnable);
        this.valueOf = aFd1sSDK;
    }

    public final boolean valueOf() {
        if (this.valueOf.AFKeystoreWrapper.valueOf("appsFlyerCount", 0) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}
