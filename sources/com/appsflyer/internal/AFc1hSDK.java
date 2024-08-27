package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public final class AFc1hSDK implements AFc1kSDK {

    @NotNull
    private final AFd1qSDK valueOf;

    public AFc1hSDK(@NotNull AFd1qSDK aFd1qSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        this.valueOf = aFd1qSDK;
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    @NotNull
    public final Map<String, Object> AFInAppEventParameterName() {
        if (this.valueOf.values("deeplink_data")) {
            try {
                String AFKeystoreWrapper = this.valueOf.AFKeystoreWrapper("deeplink_data", (String) null);
                if (AFKeystoreWrapper == null) {
                    return p0.d();
                }
                return AFj1sSDK.values(new JSONObject(AFKeystoreWrapper));
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th2, true, false);
            }
        }
        return p0.d();
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void AFInAppEventType() {
        this.valueOf.AFKeystoreWrapper("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFc1kSDK
    public final void values(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf.AFInAppEventParameterName("deeplink_data", new JSONObject(map).toString());
    }
}
