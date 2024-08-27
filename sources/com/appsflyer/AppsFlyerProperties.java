package com.appsflyer;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1qSDK;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_STORE_FROM_API = "api_store_value";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_NETWORK_DATA = "disableCollectNetworkData";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String ENABLE_TCF_DATA_COLLECTION = "enableTCFDataCollection";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String ONELINK_VERSION = "onelinkVersion";
    public static final String USER_EMAILS = "userEmails";
    public static AppsFlyerProperties instance;
    public String AFInAppEventParameterName;
    public boolean AFInAppEventType;
    private final Map<String, Object> AFKeystoreWrapper = new HashMap();
    private boolean valueOf = false;

    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);

        private final int AFKeystoreWrapper;

        EmailsCryptType(int i10) {
            this.AFKeystoreWrapper = i10;
        }

        public final int getValue() {
            return this.AFKeystoreWrapper;
        }
    }

    public static AppsFlyerProperties getInstance() {
        if (instance == null) {
            instance = new AppsFlyerProperties();
        }
        return instance;
    }

    private boolean valueOf() {
        return this.valueOf;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }

    public boolean getBoolean(String str, boolean z10) {
        String string = getString(str);
        if (string == null) {
            return z10;
        }
        return Boolean.parseBoolean(string);
    }

    public int getInt(String str, int i10) {
        String string = getString(str);
        if (string == null) {
            return i10;
        }
        return Integer.parseInt(string);
    }

    public int getLogLevel() {
        return getInt("logLevel", AFLogger.LogLevel.NONE.getLevel());
    }

    public long getLong(String str, long j10) {
        String string = getString(str);
        if (string == null) {
            return j10;
        }
        return Long.parseLong(string);
    }

    public String getReferrer(AFd1qSDK aFd1qSDK) {
        String str = this.AFInAppEventParameterName;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        return aFd1qSDK.AFKeystoreWrapper("referrer", (String) null);
    }

    public synchronized String getString(String str) {
        return (String) this.AFKeystoreWrapper.get(str);
    }

    public boolean isEnableLog() {
        if (getLogLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            return true;
        }
        return false;
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(AFd1qSDK aFd1qSDK) {
        try {
            if (valueOf()) {
                return;
            }
            String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("savedProperties", (String) null);
            if (AFKeystoreWrapper != null) {
                AFLogger.afDebugLog("Loading properties..");
                try {
                    JSONObject jSONObject = new JSONObject(AFKeystoreWrapper);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (this.AFKeystoreWrapper.get(next) == null) {
                            this.AFKeystoreWrapper.put(next, jSONObject.getString(next));
                        }
                    }
                    String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                    for (int i10 = 0; i10 < 5; i10++) {
                        this.AFKeystoreWrapper.remove(strArr[i10]);
                    }
                    saveProperties(aFd1qSDK);
                    this.valueOf = true;
                } catch (JSONException e10) {
                    AFLogger.afErrorLog("Failed loading properties", e10);
                }
                StringBuilder sb2 = new StringBuilder("Done loading properties: ");
                sb2.append(this.valueOf);
                AFLogger.afDebugLog(sb2.toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(String str) {
        this.AFKeystoreWrapper.remove(str);
    }

    public synchronized void saveProperties(AFd1qSDK aFd1qSDK) {
        this.AFKeystoreWrapper.remove("AppsFlyerKey");
        aFd1qSDK.AFInAppEventParameterName("savedProperties", new JSONObject(this.AFKeystoreWrapper).toString());
    }

    public synchronized void set(String str, String str2) {
        this.AFKeystoreWrapper.put(str, str2);
    }

    public synchronized void setCustomData(String str) {
        this.AFKeystoreWrapper.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.AFKeystoreWrapper.put(USER_EMAILS, str);
    }

    public synchronized void set(String str, String[] strArr) {
        this.AFKeystoreWrapper.put(str, strArr);
    }

    public synchronized void set(String str, int i10) {
        this.AFKeystoreWrapper.put(str, Integer.toString(i10));
    }

    public synchronized void set(String str, long j10) {
        this.AFKeystoreWrapper.put(str, Long.toString(j10));
    }

    public synchronized void set(String str, boolean z10) {
        this.AFKeystoreWrapper.put(str, Boolean.toString(z10));
    }
}
