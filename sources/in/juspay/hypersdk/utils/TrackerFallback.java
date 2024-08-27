package in.juspay.hypersdk.utils;

import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import r5.z;

/* loaded from: classes2.dex */
public class TrackerFallback {
    private int count;
    private boolean enableTrackerFallback;
    private NetUtils netUtils;
    private List<String> requiredKeysList;

    public TrackerFallback(JSONObject jSONObject) {
        this.count = 3;
        if (jSONObject == null || !jSONObject.has("enableTrackerFallback")) {
            return;
        }
        try {
            this.netUtils = new NetUtils(0, 0);
            this.enableTrackerFallback = jSONObject.optBoolean("enableTrackerFallback", true);
            this.count = jSONObject.optInt("trackerFallbackAttempts", 3);
            this.requiredKeysList = Arrays.asList(LogCategory.ACTION, PaymentConstants.ORDER_ID_CAMEL, PaymentConstants.CLIENT_ID_CAMEL, PaymentConstants.MERCHANT_ID_CAMEL, "customerId", "os", "os_version", "app_version", "requestId");
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(TrackerFallback trackerFallback, JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        trackerFallback.lambda$log$0(juspayServices, jSONObject, logType);
    }

    private HashMap<String, String> getQueryParams(JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        String optString;
        String optString2;
        ArrayList arrayList = new ArrayList();
        LogType logType2 = LogType.PROCESS_END;
        if (logType == logType2) {
            arrayList.add("errorMessage");
            arrayList.add("errorCode");
        }
        if (logType == LogType.INITIATE_RESULT || logType == logType2) {
            arrayList.add(PaymentConstants.CLIENT_ID);
            arrayList.add(PaymentConstants.MERCHANT_ID);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
        JSONObject sessionData = juspayServices.getSessionInfo().getSessionData();
        HashMap<String, String> hashMap = new HashMap<>();
        List<String> list = this.requiredKeysList;
        if (list != null) {
            for (String str : list) {
                if (optJSONObject != null && optJSONObject.has(str)) {
                    optString2 = optJSONObject.optString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                } else if (sessionData.has(str)) {
                    optString2 = sessionData.optString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                } else if (jSONObject.has(str)) {
                    optString2 = jSONObject.optString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                }
                hashMap.put(str, optString2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (optJSONObject != null && optJSONObject.has(str2)) {
                optString = optJSONObject.optString(str2, HttpUrl.FRAGMENT_ENCODE_SET);
            } else if (jSONObject.has(str2)) {
                optString = jSONObject.optString(str2, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            hashMap.put(str2, optString);
        }
        hashMap.put("sessionId", juspayServices.getSessionInfo().getSessionId());
        hashMap.put("logtype", logType.name());
        return hashMap;
    }

    public /* synthetic */ void lambda$log$0(JuspayServices juspayServices, JSONObject jSONObject, LogType logType) {
        try {
            if (!this.enableTrackerFallback || this.netUtils == null) {
                return;
            }
            for (int i10 = 0; i10 < this.count; i10++) {
                if (this.netUtils.doGet("https://assets.juspay.in/a.html", new HashMap(), getQueryParams(juspayServices, jSONObject, logType), new JSONObject()).getResponseCode() == 200) {
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public void log(JSONObject jSONObject, JuspayServices juspayServices, LogType logType) {
        ExecutorManager.runOnBackgroundThread(new z(this, juspayServices, jSONObject, logType, 3));
    }
}
