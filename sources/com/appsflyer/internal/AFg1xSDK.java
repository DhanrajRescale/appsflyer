package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFg1xSDK {
    public long AFInAppEventParameterName;
    public long AFInAppEventType;
    public final AFd1qSDK AFKeystoreWrapper;
    public AFi1zSDK values = null;
    public AFi1zSDK valueOf = valueOf();

    public AFg1xSDK(AFd1qSDK aFd1qSDK) {
        this.AFKeystoreWrapper = aFd1qSDK;
        this.AFInAppEventType = aFd1qSDK.values("af_rc_timestamp", 0L);
        this.AFInAppEventParameterName = aFd1qSDK.values("af_rc_max_age", 0L);
    }

    private AFi1zSDK valueOf() {
        String AFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper("af_remote_config", (String) null);
        if (AFKeystoreWrapper == null) {
            AFLogger.INSTANCE.d(AFg1aSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFi1zSDK(new String(Base64.decode(AFKeystoreWrapper, 2), Charset.defaultCharset()));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1aSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e10, true);
            return null;
        }
    }
}
