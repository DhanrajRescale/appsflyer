package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1sSDK {
    public static JSONObject valueOf(String str) {
        JSONObject values = AFa1oSDK.values(str);
        if (values != null) {
            try {
                if (values.has("ol_id")) {
                    String optString = values.optString("ol_scheme", null);
                    String optString2 = values.optString("ol_domain", null);
                    String optString3 = values.optString("ol_ver", null);
                    if (optString != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                    }
                    if (optString2 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                    }
                    if (optString3 != null) {
                        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_VERSION, optString3);
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Error in handleResponse: ");
                sb2.append(th2.getMessage());
                AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), th2);
                AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().v().AFKeystoreWrapper();
                AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().v().AFInAppEventType();
            }
        }
        return values;
    }
}
