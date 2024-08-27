package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import in.juspay.hypersdk.analytics.LogConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFh1gSDK AFInAppEventParameterName;

    @NonNull
    public final AFh1iSDK AFInAppEventType;

    @NonNull
    public final String AFKeystoreWrapper;
    private final boolean valueOf;

    @NonNull
    public final String values;

    public AFi1zSDK(@NonNull String str) throws JSONException {
        AFh1iSDK aFh1iSDK;
        AFh1gSDK aFh1gSDK;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("ver");
                this.AFKeystoreWrapper = string;
                this.valueOf = jSONObject.optBoolean("test_mode");
                this.values = str;
                if (string.startsWith(LogConstants.DEFAULT_CHANNEL)) {
                    aFh1iSDK = AFh1iSDK.DEFAULT;
                } else {
                    aFh1iSDK = AFh1iSDK.CUSTOM;
                }
                this.AFInAppEventType = aFh1iSDK;
                JSONObject optJSONObject = jSONObject.optJSONObject("features");
                if (optJSONObject != null) {
                    aFh1gSDK = new AFh1gSDK(optJSONObject);
                } else {
                    aFh1gSDK = null;
                }
                this.AFInAppEventParameterName = aFh1gSDK;
                return;
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e10);
                throw new JSONException("Failed to parse remote configuration JSON");
            }
        }
        throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1zSDK.class != obj.getClass()) {
            return false;
        }
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        if (this.valueOf != aFi1zSDK.valueOf || !this.AFKeystoreWrapper.equals(aFi1zSDK.AFKeystoreWrapper)) {
            return false;
        }
        return this.values.equals(aFi1zSDK.values);
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode() + ((this.AFKeystoreWrapper.hashCode() + ((this.valueOf ? 1 : 0) * 31)) * 31);
        AFh1gSDK aFh1gSDK = this.AFInAppEventParameterName;
        if (aFh1gSDK != null) {
            return (hashCode * 31) + aFh1gSDK.hashCode();
        }
        return hashCode;
    }
}
