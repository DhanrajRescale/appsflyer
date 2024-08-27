package com.appsflyer.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1fSDK {
    public final long AFInAppEventParameterName;
    public final int AFInAppEventType;
    public final String AFKeystoreWrapper;
    public final int valueOf;

    public AFh1fSDK(String str, int i10, int i11, long j10) {
        this.AFKeystoreWrapper = str;
        this.valueOf = i10;
        this.AFInAppEventType = i11;
        this.AFInAppEventParameterName = j10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFh1fSDK.class == obj.getClass()) {
            AFh1fSDK aFh1fSDK = (AFh1fSDK) obj;
            if (this.valueOf == aFh1fSDK.valueOf && this.AFInAppEventType == aFh1fSDK.AFInAppEventType && this.AFInAppEventParameterName == aFh1fSDK.AFInAppEventParameterName && (str = this.AFKeystoreWrapper) != null && str.equals(aFh1fSDK.AFKeystoreWrapper)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.AFKeystoreWrapper;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return (((((i10 * 31) + this.valueOf) * 31) + this.AFInAppEventType) * 31) + ((int) this.AFInAppEventParameterName);
    }

    public final String valueOf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_ver", this.AFKeystoreWrapper);
            jSONObject.put("min", this.valueOf);
            jSONObject.put("expire", this.AFInAppEventType);
            jSONObject.put("ttl", this.AFInAppEventParameterName);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
