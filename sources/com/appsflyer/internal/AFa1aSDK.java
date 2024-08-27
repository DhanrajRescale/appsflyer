package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1aSDK implements Runnable {
    final String AFInAppEventParameterName;
    private final String AFInAppEventType;
    private final WeakReference<Context> AFKeystoreWrapper;
    private final Map<String, String> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final String f8389d;

    /* renamed from: e, reason: collision with root package name */
    private final AFd1sSDK f8390e;
    private final String unregisterClient;
    final String valueOf;
    final String values;

    public AFa1aSDK(Context context, String str, AFd1sSDK aFd1sSDK, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.AFKeystoreWrapper = new WeakReference<>(context);
        this.AFInAppEventType = str;
        this.f8389d = str2;
        this.valueOf = str4;
        this.AFInAppEventParameterName = str5;
        this.values = str6;
        this.AFLogger = map;
        this.unregisterClient = str3;
        this.f8390e = aFd1sSDK;
    }

    public static void AFInAppEventParameterName(boolean z10, String str, String str2, String str3, String str4) {
        if (AFb1vSDK.AFKeystoreWrapper != null) {
            StringBuilder l10 = v.e.l("Validate callback parameters: ", str, " ", str2, " ");
            l10.append(str3);
            AFLogger.afDebugLog(l10.toString());
            if (z10) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFb1vSDK.AFKeystoreWrapper.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFb1vSDK.AFKeystoreWrapper;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static AFf1lSDK values(Context context, @NonNull AFh1kSDK aFh1kSDK) {
        AFb1vSDK.AFKeystoreWrapper().valueOf(context);
        AFd1kSDK AFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        aFh1kSDK.AFInAppEventType(AFInAppEventParameterName.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0));
        AFf1lSDK aFf1lSDK = new AFf1lSDK(aFh1kSDK, AFInAppEventParameterName);
        AFe1cSDK afInfoLog = AFInAppEventParameterName.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1lSDK));
        return aFf1lSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFb1zSDK aFb1zSDK;
        String str = this.AFInAppEventType;
        if (str == null || str.length() == 0 || AppsFlyerLib.getInstance().isStopped()) {
            return;
        }
        try {
            Context context = this.AFKeystoreWrapper.get();
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.f8389d);
            hashMap.put("sig-data", this.valueOf);
            hashMap.put(PaymentConstants.SIGNATURE, this.unregisterClient);
            Object hashMap2 = new HashMap(hashMap);
            Object obj = this.AFLogger;
            String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().valueOf().AFKeystoreWrapper("referrer", HttpUrl.FRAGMENT_ENCODE_SET);
            AFh1lSDK aFh1lSDK = new AFh1lSDK();
            aFh1lSDK.unregisterClient = AFKeystoreWrapper;
            AFb1vSDK AFKeystoreWrapper2 = AFb1vSDK.AFKeystoreWrapper();
            Map<String, Object> AFKeystoreWrapper3 = AFKeystoreWrapper2.AFKeystoreWrapper(aFh1lSDK);
            AFKeystoreWrapper3.put("price", this.AFInAppEventParameterName);
            AFKeystoreWrapper3.put("currency", this.values);
            AFKeystoreWrapper3.put("receipt_data", hashMap2);
            if (obj != null) {
                AFKeystoreWrapper3.put("extra_prms", obj);
            }
            AFKeystoreWrapper3.putAll(AFKeystoreWrapper2.AFInAppEventParameterName().i().AFInAppEventParameterName());
            aFh1lSDK.valueOf((Map<String, ?>) AFKeystoreWrapper3);
            aFh1lSDK.valueOf(new AFj1xSDK(this.f8390e).AFInAppEventParameterName(aFh1lSDK));
            values(context, aFh1lSDK);
            hashMap.put("dev_key", this.AFInAppEventType);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            AFh1uSDK aFh1uSDK = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().AFInAppEventType().AFInAppEventType.AFLogger;
            String str2 = null;
            if (aFh1uSDK != null) {
                aFb1zSDK = new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient);
            } else {
                aFb1zSDK = null;
            }
            if (aFb1zSDK != null) {
                str2 = aFb1zSDK.AFInAppEventParameterName;
            }
            if (str2 != null) {
                hashMap.put("advertiserId", str2);
            }
            AFh1nSDK aFh1nSDK = (AFh1nSDK) new AFh1nSDK().valueOf(hashMap);
            aFh1nSDK.valueOf(new AFj1xSDK(this.f8390e).AFInAppEventParameterName(aFh1nSDK));
            final AFf1lSDK values = values(context, aFh1nSDK);
            aFh1nSDK.values = new AppsFlyerRequestListener() { // from class: com.appsflyer.internal.AFa1aSDK.3
                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onError(int i10, @NonNull String str3) {
                    ResponseNetwork responseNetwork;
                    if (i10 == 50 && (responseNetwork = ((AFf1nSDK) values).registerClient) != null) {
                        str3 = responseNetwork.toString();
                    }
                    AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                    AFa1aSDK.AFInAppEventParameterName(false, aFa1aSDK.valueOf, aFa1aSDK.AFInAppEventParameterName, aFa1aSDK.values, str3);
                }

                @Override // com.appsflyer.attribution.AppsFlyerRequestListener
                public final void onSuccess() {
                    try {
                        JSONObject jSONObject = new JSONObject((String) ((AFf1nSDK) values).registerClient.getBody());
                        AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                        boolean optBoolean = jSONObject.optBoolean("result");
                        AFa1aSDK aFa1aSDK = AFa1aSDK.this;
                        AFa1aSDK.AFInAppEventParameterName(optBoolean, aFa1aSDK.valueOf, aFa1aSDK.AFInAppEventParameterName, aFa1aSDK.values, jSONObject.toString());
                    } catch (Exception e10) {
                        AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e10)), e10);
                        AFa1aSDK aFa1aSDK2 = AFa1aSDK.this;
                        AFa1aSDK.AFInAppEventParameterName(false, aFa1aSDK2.valueOf, aFa1aSDK2.AFInAppEventParameterName, aFa1aSDK2.values, e10.getMessage());
                    }
                }
            };
        } catch (Throwable th2) {
            if (AFb1vSDK.AFKeystoreWrapper != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", th2);
                AFInAppEventParameterName(false, this.valueOf, this.AFInAppEventParameterName, this.values, th2.getMessage());
            }
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
    }
}
