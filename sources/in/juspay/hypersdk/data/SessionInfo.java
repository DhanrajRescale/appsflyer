package in.juspay.hypersdk.data;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.Constants;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.security.EncryptionHelper;
import in.juspay.hypersdk.utils.Utils;
import java.io.File;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r3.k;

/* loaded from: classes2.dex */
public class SessionInfo {
    private static final String LOG_TAG = "in.juspay.hypersdk.data.SessionInfo";

    @NonNull
    private final Context context;
    private DisplayMetrics displayMetrics;

    @NonNull
    private final JuspayServices juspayServices;
    private String sessionId;

    @NonNull
    private JSONObject sessionInfo = new JSONObject();

    @NonNull
    private JSONObject bundleParams = new JSONObject();

    @NonNull
    private final String androidId = generateId("juspay_android_id");

    @NonNull
    private final String deviceId = generateId("juspay_device_id");

    public SessionInfo(@NonNull JuspayServices juspayServices) {
        this.juspayServices = juspayServices;
        this.context = juspayServices.getContext().getApplicationContext();
    }

    private void addOrUpdateOrderId(String str) {
        JSONObject sessionData = getSessionData();
        if (sessionData.optString(PaymentConstants.ORDER_ID).equals(str) || str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return;
        }
        try {
            sessionData.put(PaymentConstants.ORDER_ID, str);
        } catch (JSONException unused) {
        }
    }

    private boolean devOptionsEnabled() {
        try {
            return Settings.Secure.getInt(this.context.getContentResolver(), "development_settings_enabled", 0) == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @NonNull
    private String generateId(String str) {
        Context context = this.juspayServices.getContext();
        String sdkName = this.juspayServices.getSdkInfo().getSdkName();
        String read = KeyValueStore.read(context, sdkName, str, null);
        if (read != null) {
            return read;
        }
        String uuid = UUID.randomUUID().toString();
        KeyValueStore.write(context, sdkName, str, uuid);
        return uuid;
    }

    private DisplayMetrics getDisplayMetrics() {
        try {
            if (this.displayMetrics == null) {
                this.displayMetrics = this.context.getResources().getDisplayMetrics();
            }
            return this.displayMetrics;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    private String getOrderIdFromPayload(JSONObject jSONObject, String str) {
        return jSONObject.has(PaymentConstants.ORDER_ID_CAMEL) ? jSONObject.optString(PaymentConstants.ORDER_ID_CAMEL) : jSONObject.has(PaymentConstants.ORDER_ID) ? jSONObject.optString(PaymentConstants.ORDER_ID) : str;
    }

    private String getScreenPpi() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.xdpi);
        }
        return null;
    }

    private int getVersionCode() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private String getVersionName() {
        try {
            return this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static boolean isRooted() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void addOrderIdInSessionData(JSONObject jSONObject) {
        String orderIdFromPayload;
        JSONObject jSONObject2;
        JSONObject optJSONObject = jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
        if (optJSONObject != null) {
            try {
                if (optJSONObject.has(PaymentConstants.SIGNATURE_PAYLOAD_CAMEL)) {
                    jSONObject2 = new JSONObject(optJSONObject.optString(PaymentConstants.SIGNATURE_PAYLOAD_CAMEL, "{}"));
                } else {
                    if (!optJSONObject.has(PaymentConstants.ORDER_DETAILS_CAMEL)) {
                        orderIdFromPayload = getOrderIdFromPayload(optJSONObject, HttpUrl.FRAGMENT_ENCODE_SET);
                        addOrUpdateOrderId(orderIdFromPayload);
                    }
                    jSONObject2 = new JSONObject(optJSONObject.optString(PaymentConstants.ORDER_DETAILS_CAMEL, "{}"));
                }
                orderIdFromPayload = getOrderIdFromPayload(jSONObject2, optJSONObject.optString(PaymentConstants.ORDER_ID_CAMEL));
                addOrUpdateOrderId(orderIdFromPayload);
            } catch (JSONException unused) {
            }
        }
    }

    public void createSessionDataMap() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put("device_id", getDeviceId());
            jSONObject.put("android_id", EncryptionHelper.getSHA256Hash(getAndroidId()));
            jSONObject.put("os", LogSubCategory.LifeCycle.ANDROID);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("android_api_level", String.valueOf(Build.VERSION.SDK_INT));
            jSONObject.put("locale", Locale.getDefault().getDisplayLanguage());
            jSONObject.put("app_name", this.context.getApplicationInfo().loadLabel(this.context.getPackageManager()));
            jSONObject.put("app_version", getVersionName());
            jSONObject.put("app_version_code", getVersionCode());
            String clientId = getClientId();
            if (!Objects.equals(clientId, HttpUrl.FRAGMENT_ENCODE_SET)) {
                jSONObject.put(PaymentConstants.CLIENT_ID, clientId);
            }
            String merchantId = getMerchantId();
            if (!Objects.equals(merchantId, HttpUrl.FRAGMENT_ENCODE_SET)) {
                jSONObject.put(PaymentConstants.MERCHANT_ID, merchantId);
            }
            jSONObject.put("dir_name", this.context.getApplicationInfo().sourceDir);
            jSONObject.put("package_name", this.context.getApplicationInfo().packageName);
            jSONObject.put("network_info", getNetworkInfo());
            jSONObject.put("network_type", String.valueOf(getNetworkType()));
            jSONObject.put("ip_address", Utils.getIPAddress(this.juspayServices));
            jSONObject.put("is_rooted", String.valueOf(isRooted()));
            jSONObject.put("is_dev_enabled", String.valueOf(devOptionsEnabled()));
            jSONObject.put("app_debuggable", JuspayCoreLib.isAppDebuggable());
            jSONObject.put("sdk_debuggable", this.juspayServices.getSdkInfo().isSdkDebuggable());
            jSONObject.put("screen_width", getScreenWidth());
            jSONObject.put("screen_height", getScreenHeight());
            jSONObject.put("screen_ppi", getScreenPpi());
            jSONObject.put("geocode", HttpUrl.FRAGMENT_ENCODE_SET);
            jSONObject.put("location", HttpUrl.FRAGMENT_ENCODE_SET);
            jSONObject.put("capability", HttpUrl.FRAGMENT_ENCODE_SET);
            updateSessionData(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public String get(String str, String str2) {
        return this.sessionInfo.optString(str, str2);
    }

    @NonNull
    public String getAndroidId() {
        return this.androidId;
    }

    public String getAppName() {
        String optString = this.sessionInfo.optString("app_name");
        return !optString.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? optString : getClientId();
    }

    @NonNull
    public JSONObject getBundleParams() {
        return this.bundleParams;
    }

    @NonNull
    public String getClientId() {
        JSONObject optJSONObject;
        return (!this.bundleParams.has(PaymentConstants.PAYLOAD) || (optJSONObject = this.bundleParams.optJSONObject(PaymentConstants.PAYLOAD)) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : optJSONObject.has(PaymentConstants.CLIENT_ID_CAMEL) ? optJSONObject.optString(PaymentConstants.CLIENT_ID_CAMEL) : optJSONObject.has(PaymentConstants.CLIENT_ID) ? optJSONObject.optString(PaymentConstants.CLIENT_ID) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @NonNull
    public String getDeviceId() {
        return this.deviceId;
    }

    @NonNull
    public String getMerchantId() {
        JSONObject optJSONObject;
        if (!this.bundleParams.has(PaymentConstants.PAYLOAD) || (optJSONObject = this.bundleParams.optJSONObject(PaymentConstants.PAYLOAD)) == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            if (optJSONObject.has(PaymentConstants.SIGNATURE_PAYLOAD_CAMEL)) {
                JSONObject jSONObject = new JSONObject(optJSONObject.optString(PaymentConstants.SIGNATURE_PAYLOAD_CAMEL, "{}"));
                if (jSONObject.has(PaymentConstants.MERCHANT_ID_CAMEL)) {
                    return jSONObject.optString(PaymentConstants.MERCHANT_ID_CAMEL);
                }
                if (jSONObject.has(PaymentConstants.MERCHANT_ID)) {
                    return jSONObject.optString(PaymentConstants.MERCHANT_ID);
                }
            }
        } catch (Exception unused) {
        }
        return optJSONObject.has(PaymentConstants.MERCHANT_ID_CAMEL) ? optJSONObject.optString(PaymentConstants.MERCHANT_ID_CAMEL) : optJSONObject.has(PaymentConstants.MERCHANT_ID) ? optJSONObject.optString(PaymentConstants.MERCHANT_ID) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String getNetworkInfo() {
        NetworkInfo networkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity");
            if (connectivityManager != null && (networkInfo = connectivityManager.getNetworkInfo(1)) != null) {
                if (networkInfo.isConnected()) {
                    return "wifi";
                }
            }
            return "cellular";
        } catch (Exception unused) {
            return null;
        }
    }

    public String getNetworkName() {
        int networkType = getNetworkType();
        if ("wifi".equals(getNetworkInfo())) {
            return "WIFI";
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
            default:
                return "OTHER";
        }
    }

    public int getNetworkType() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService("phone");
            if (k.checkSelfPermission(this.context, "android.permission.READ_PHONE_STATE") == 0 && telephonyManager != null) {
                return telephonyManager.getNetworkType();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @NonNull
    public String getOrderId() {
        JSONObject sessionData = getSessionData();
        return sessionData.has(PaymentConstants.ORDER_ID) ? sessionData.optString(PaymentConstants.ORDER_ID) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public String getPackageName() {
        return this.context.getPackageName();
    }

    public String getScreenHeight() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.heightPixels);
        }
        return null;
    }

    public String getScreenSizeDensity() {
        try {
            DisplayMetrics displayMetrics = getDisplayMetrics();
            if (displayMetrics == null) {
                throw new Exception("display metrics null");
            }
            float f10 = displayMetrics.density;
            return (this.context.getResources().getConfiguration().screenLayout & 15) + "-" + f10;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getScreenWidth() {
        DisplayMetrics displayMetrics = getDisplayMetrics();
        if (displayMetrics != null) {
            return String.valueOf(displayMetrics.widthPixels);
        }
        return null;
    }

    @NonNull
    public JSONObject getSessionData() {
        JSONObject optJSONObject = this.sessionInfo.optJSONObject("sessionData");
        return optJSONObject != null ? optJSONObject : new JSONObject();
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public boolean isVerifyAssetsEnabled() {
        return this.sessionInfo.optBoolean(Constants.VERIFY_ASSETS, true);
    }

    public void logDeviceIdentifiers() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", getDeviceId());
            jSONObject.put("android_id", getAndroidId());
            this.juspayServices.getSdkTracker().trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.IDENTIFIERS, jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void logSessionInfo() {
        try {
            this.juspayServices.getSdkTracker().trackContext(LogSubCategory.Context.DEVICE, "info", "session_info", this.sessionInfo);
        } catch (Exception e10) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, "session_info", "Exception while logging ", e10);
        }
    }

    public void removeAttribute(String str) {
        this.sessionInfo.remove(str);
    }

    public void resetSession() {
        this.sessionId = null;
        this.sessionInfo = new JSONObject();
        this.bundleParams = new JSONObject();
    }

    public void set(String str, String str2) {
        try {
            this.sessionInfo.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public void setBundleParams(JSONObject jSONObject) {
        try {
            JSONArray names = this.bundleParams.names();
            if (names != null) {
                for (int i10 = 0; i10 < names.length(); i10++) {
                    this.bundleParams.remove(names.getString(i10));
                }
            }
            JSONArray names2 = jSONObject.names();
            if (names2 != null) {
                for (int i11 = 0; i11 < names2.length(); i11++) {
                    String string = names2.getString(i11);
                    this.bundleParams.put(string, jSONObject.get(string));
                }
            }
            set("bundleParams", this.bundleParams.toString());
        } catch (JSONException unused) {
        }
    }

    public void setSessionId() {
        this.sessionId = UUID.randomUUID().toString();
        JuspayLogger.d(LOG_TAG, "Session ID: " + this.sessionId);
    }

    public String tryGetClientId() {
        String clientId = getClientId();
        if (clientId.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return clientId;
    }

    public String tryGetMerchantId() {
        String merchantId = getMerchantId();
        if (merchantId.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return merchantId;
    }

    public void updateSessionData(JSONObject jSONObject) {
        this.sessionInfo.remove("sessionData");
        try {
            this.sessionInfo.put("sessionData", jSONObject);
        } catch (JSONException e10) {
            this.juspayServices.sdkDebug(LOG_TAG, "Unable to update sessionInfo: " + e10);
        }
    }
}
