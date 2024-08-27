package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1qSDK implements AFe1iSDK<AFc1pSDK> {
    @Override // com.appsflyer.internal.AFe1iSDK
    public final /* synthetic */ AFc1pSDK AFInAppEventType(String str) {
        JSONObject optJSONObject;
        DeepLink deepLink = null;
        if (str != null && str.length() != 0) {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("found", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_second_ping", true);
            if (optBoolean && (optJSONObject = jSONObject.optJSONObject("click_event")) != null) {
                deepLink = DeepLink.AFInAppEventParameterName(optJSONObject);
                deepLink.AFKeystoreWrapper.put("is_deferred", true);
            }
            return new AFc1pSDK(optBoolean2, deepLink);
        }
        return new AFc1pSDK(false, null, 3, null);
    }
}
