package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFi1hSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class AFi1aSDK {
    public final AFd1kSDK AFInAppEventParameterName;
    public final List<AFi1hSDK> AFKeystoreWrapper = new ArrayList();

    public AFi1aSDK(AFd1kSDK aFd1kSDK) {
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void valueOf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(Runnable runnable) {
        AFj1rSDK.values(this.AFInAppEventParameterName.AFKeystoreWrapper(), new m(this, runnable, 0), 0L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void AFInAppEventParameterName(AFi1hSDK aFi1hSDK) {
        this.AFKeystoreWrapper.add(aFi1hSDK);
    }

    public final Runnable AFInAppEventType(AFi1lSDK aFi1lSDK, Runnable runnable) {
        return new androidx.fragment.app.e(11, this, aFi1lSDK, runnable);
    }

    @NonNull
    public final synchronized AFi1hSDK[] AFKeystoreWrapper() {
        return (AFi1hSDK[]) this.AFKeystoreWrapper.toArray(new AFi1hSDK[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Runnable runnable) {
        AFi1jSDK aFi1jSDK = new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.INSTAGRAM, runnable, new l(0));
        AFInAppEventParameterName(aFi1jSDK);
        aFi1jSDK.values(this.AFInAppEventParameterName.w().AFKeystoreWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        try {
            if (AFKeystoreWrapper(new AFh1oSDK())) {
                runnable.run();
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }

    public final AFi1lSDK valueOf(Runnable runnable) {
        return new AFi1lSDK(new m(this, runnable, 1), this.AFInAppEventParameterName.values(), this.AFInAppEventParameterName.AFInAppEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void values(AFi1lSDK aFi1lSDK, Runnable runnable) {
        AFd1qSDK valueOf = this.AFInAppEventParameterName.valueOf();
        int valueOf2 = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        boolean AFInAppEventType = valueOf.AFInAppEventType(AppsFlyerProperties.NEW_REFERRER_SENT);
        boolean z10 = aFi1lSDK.unregisterClient == AFi1hSDK.AFa1ySDK.NOT_STARTED;
        if (valueOf2 == 1) {
            if (z10 || AFInAppEventType) {
                runnable.run();
            }
        }
    }

    public final void AFInAppEventParameterName(Runnable runnable) {
        AFInAppEventParameterName(new AFi1jSDK(this.AFInAppEventParameterName.AFInAppEventType(), this.AFInAppEventParameterName.values(), AFi1fSDK.FACEBOOK, runnable, new m(this, runnable, 2)));
    }

    public final boolean AFKeystoreWrapper(AFa1qSDK aFa1qSDK) {
        int valueOf = this.AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0);
        return (!this.AFInAppEventParameterName.valueOf().AFInAppEventType(AppsFlyerProperties.NEW_REFERRER_SENT) && valueOf == 1) || (valueOf == 1 && !(aFa1qSDK instanceof AFh1oSDK));
    }

    public final boolean values() {
        return this.AFInAppEventParameterName.AFInAppEventType().AFInAppEventParameterName("AF_PREINSTALL_DISABLED");
    }
}
