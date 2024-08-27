package in.juspay.hypersdk.core;

import android.app.ActivityManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniser;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.Tracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class SdkTracker implements TrackerInterface, Tracker {
    private static final String LOG_TAG = "SdkTracker";
    private static final int MAX_LOG_SIZE = 22528;
    private static final Queue<JSONObject> bootLogs = new ConcurrentLinkedQueue();

    @NonNull
    private String godelBuildVersion;

    @NonNull
    private String godelVersion;

    @NonNull
    private String hyperSdkVersion;

    @NonNull
    private final JuspayServices juspayServices;
    private AtomicInteger serialNumberCounter = new AtomicInteger(1);
    private final JSONObject logProperties = new JSONObject();
    private final HashSet<String> labelsToDrop = new HashSet<>();

    public SdkTracker(@NonNull JuspayServices juspayServices) {
        this.hyperSdkVersion = HttpUrl.FRAGMENT_ENCODE_SET;
        this.godelVersion = HttpUrl.FRAGMENT_ENCODE_SET;
        this.godelBuildVersion = HttpUrl.FRAGMENT_ENCODE_SET;
        this.juspayServices = juspayServices;
        try {
            this.hyperSdkVersion = IntegrationUtils.getSdkVersion(juspayServices.getContext());
            this.godelVersion = IntegrationUtils.getGodelVersion(juspayServices.getContext());
            this.godelBuildVersion = IntegrationUtils.getGodelBuildVersion(juspayServices.getContext());
        } catch (Exception unused) {
        }
        ExecutorManager.runOnSdkTrackerPool(new com.appsflyer.internal.l(19));
    }

    public static void addToBootLogs(String str) {
        ExecutorManager.runOnSdkTrackerPool(new t(str, 1));
    }

    @NonNull
    private static JSONObject cloneJSON(@NonNull JSONObject jSONObject) {
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        JSONObject jSONObject2 = new JSONObject();
        for (int i10 = 0; i10 < names.length(); i10++) {
            String str = (String) names.opt(i10);
            Object opt = jSONObject.opt(str);
            if (opt instanceof JSONObject) {
                opt = cloneJSON((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = cloneJSONArray((JSONArray) opt);
            }
            jSONObject2.put(str, opt);
        }
        return jSONObject2;
    }

    @NonNull
    private static JSONArray cloneJSONArray(@NonNull JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object opt = jSONArray.opt(i10);
            if (opt instanceof JSONObject) {
                opt = cloneJSON((JSONObject) opt);
            } else if (opt instanceof JSONArray) {
                opt = cloneJSONArray((JSONArray) opt);
            }
            jSONArray2.put(opt);
        }
        return jSONArray2;
    }

    private static Object cloneObject(Object obj) {
        try {
            return obj instanceof JSONObject ? cloneJSON((JSONObject) obj) : obj instanceof JSONArray ? cloneJSONArray((JSONArray) obj) : obj;
        } catch (Exception unused) {
            return obj;
        }
    }

    @NonNull
    private JSONObject createApiExceptionLog(String str, String str2, String str3, Long l10, Long l11, Object obj, String str4, String str5, String str6, Throwable th2, JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray names;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("url", str4);
            jSONObject3.put("start_time", l10);
            jSONObject3.put("end_time", l11);
            jSONObject3.put(PaymentConstants.PAYLOAD, obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject3.put("method", str5);
            jSONObject3.put("message", str6 + ". " + th2.getLocalizedMessage());
            jSONObject3.put("stacktrace", formatThrowable(th2));
            jSONObject2.put("category", str);
            jSONObject2.put("subcategory", str2);
            jSONObject2.put("level", "exception");
            jSONObject2.put("label", str3 + "_" + Utils.getLogLevelFromThrowable(th2));
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject3);
            jSONObject2.put("at", System.currentTimeMillis());
            jSONObject2.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
            jSONObject2.put("channels", jSONArray);
            if (jSONObject != null && (names = jSONObject.names()) != null) {
                for (int i10 = 0; i10 < names.length(); i10++) {
                    String string = names.getString(i10);
                    jSONObject2.put(string, jSONObject.getString(string));
                }
            }
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding API exception log: ", e10);
        }
        return jSONObject2;
    }

    @NonNull
    private static JSONObject createApiLog(String str, String str2, String str3, Integer num, String str4, Long l10, Long l11, Object obj, Object obj2, String str5) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str4);
            jSONObject2.put("status_code", num);
            jSONObject2.put("start_time", l10);
            jSONObject2.put("end_time", l11);
            jSONObject2.put(PaymentConstants.PAYLOAD, obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject2.put("response", cloneObject(obj2));
            jSONObject2.put("method", str5);
            jSONObject.put("category", LogCategory.API_CALL);
            jSONObject.put("subcategory", str);
            jSONObject.put("level", str2);
            jSONObject.put("label", str3);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e10);
        }
        return jSONObject;
    }

    @NonNull
    private static JSONObject createExceptionLog(String str, String str2, String str3, String str4, Throwable th2) {
        return createExceptionLog(str, str2, str3, str4, th2, false);
    }

    private static JSONObject createLog(String str, String str2, String str3, String str4, String str5, Object obj) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(str5, obj == null ? JSONObject.NULL : cloneObject(obj));
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", str3);
            jSONObject.put("label", str4);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e10);
        }
        return jSONObject;
    }

    @NonNull
    private static JSONObject createLogWithValue(String str, String str2, String str3, String str4, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", str3);
            jSONObject.put("label", str4);
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, cloneObject(obj));
            jSONObject.put("at", System.currentTimeMillis());
            jSONObject.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e10);
        }
        return jSONObject;
    }

    @NonNull
    private static String formatThrowable(Throwable th2) {
        StringBuilder sb2 = new StringBuilder(getStackTraceAsString(th2));
        while (true) {
            th2 = th2.getCause();
            if (th2 == null) {
                return sb2.toString();
            }
            sb2.append("\nCaused by ");
            sb2.append(getStackTraceAsString(th2));
        }
    }

    @NonNull
    private static String getStackTraceAsString(@NonNull Throwable th2) {
        StringBuilder sb2 = new StringBuilder(th2.toString());
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\n\tat ");
            sb2.append(stackTraceElement.toString());
        }
        return sb2.toString();
    }

    public /* synthetic */ void lambda$addLogToPersistedQueue$14(JSONObject jSONObject) {
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            LogPusher.addLogsToPersistedQueue(jSONObject);
        }
        if (this.juspayServices.getLogSessioniserExp() != null) {
            LogPusherExp.addLogsToPersistedQueue(jSONObject);
        }
    }

    public static /* synthetic */ void lambda$addToBootLogs$1(String str) {
        JuspayLogger.log(LOG_TAG, "DEBUG", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("at")) {
                jSONObject.put("at", System.currentTimeMillis());
            }
            bootLogs.add(jSONObject);
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "addToBootLogs", e10);
        }
    }

    public static /* synthetic */ void lambda$new$0() {
        ExecutorManager.setTrackerThreadId(Thread.currentThread().getId());
    }

    public /* synthetic */ void lambda$setEndPointSandbox$18(Boolean bool) {
        if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
            LogPusher.setEndPointSandbox(bool);
        }
        if (this.juspayServices.getLogSessioniserExp() != null) {
            LogPusherExp.setEndPointSandbox(bool);
        }
    }

    public /* synthetic */ void lambda$track$17(JSONObject jSONObject) {
        try {
            if (shouldDropLog(jSONObject.optString("label", HttpUrl.FRAGMENT_ENCODE_SET))) {
                return;
            }
            jSONObject.put("at", System.currentTimeMillis());
            trackParsed(jSONObject);
        } catch (JSONException e10) {
            trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while parsing the JSON", e10);
        }
    }

    public /* synthetic */ void lambda$trackAction$8(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createLog = createLog(LogCategory.ACTION, str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createLog);
        } else {
            bootLogs.add(createLog);
        }
    }

    public /* synthetic */ void lambda$trackAndLogApiException$16(String str, String str2, Throwable th2, String str3, String str4, String str5, Long l10, Long l11, Object obj, String str6, String str7, JSONArray jSONArray, JSONObject jSONObject) {
        JuspayLogger.e(str, str2, th2);
        if (shouldDropLog(str3)) {
            return;
        }
        trackPhoneState();
        JSONObject createApiExceptionLog = createApiExceptionLog(str4, str5, str3, l10, l11, obj, str6, str7, str2, th2, jSONArray, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createApiExceptionLog);
        } else {
            bootLogs.add(createApiExceptionLog);
        }
    }

    public static /* synthetic */ void lambda$trackAndLogBootException$5(String str, String str2, Throwable th2, String str3, String str4, String str5) {
        JuspayLogger.e(str, str2, th2);
        bootLogs.add(createExceptionLog(str3, str4, str5, str2, th2));
    }

    public /* synthetic */ void lambda$trackAndLogException$15(String str, String str2, String str3, Throwable th2, String str4, String str5) {
        if (shouldDropLog(str)) {
            return;
        }
        JuspayLogger.e(str2, str3, th2);
        trackPhoneState();
        JSONObject createExceptionLog = createExceptionLog(str4, str5, str, str3, th2);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createExceptionLog);
        } else {
            bootLogs.add(createExceptionLog);
        }
    }

    public /* synthetic */ void lambda$trackApiCalls$10(String str, String str2, String str3, Integer num, String str4, Long l10, Long l11, Object obj, Object obj2, String str5, JSONArray jSONArray, JSONObject jSONObject) {
        JSONObject createApiLog = createApiLog(str, str2, str3, num, str4, l10, l11, obj, obj2, str5, jSONArray, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createApiLog);
        } else {
            bootLogs.add(createApiLog);
        }
    }

    public /* synthetic */ void lambda$trackApiCalls$9(String str, String str2, String str3, Integer num, String str4, Long l10, Long l11, Object obj, Object obj2, String str5) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createApiLog = createApiLog(str2, str3, str, num, str4, l10, l11, obj, obj2, str5);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createApiLog);
        } else {
            bootLogs.add(createApiLog);
        }
    }

    public static /* synthetic */ void lambda$trackBootAction$3(String str, String str2, String str3, String str4, Object obj) {
        bootLogs.add(createLog(LogCategory.ACTION, str, str2, str3, str4, obj));
    }

    public static /* synthetic */ void lambda$trackBootException$4(String str, String str2, String str3, String str4, Throwable th2) {
        bootLogs.add(createExceptionLog(str, str2, str3, str4, th2));
    }

    public static /* synthetic */ void lambda$trackBootLifecycle$2(String str, String str2, String str3, String str4, Object obj) {
        bootLogs.add(createLog(LogCategory.LIFECYCLE, str, str2, str3, str4, obj));
    }

    public /* synthetic */ void lambda$trackContext$11(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createLog = createLog(LogCategory.CONTEXT, str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createLog);
        } else {
            bootLogs.add(createLog);
        }
    }

    public /* synthetic */ void lambda$trackContext$12(String str, String str2, String str3, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createLogWithValue = createLogWithValue(LogCategory.CONTEXT, str2, str3, str, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createLogWithValue);
        } else {
            bootLogs.add(createLogWithValue);
        }
    }

    public /* synthetic */ void lambda$trackException$13(String str, String str2, String str3, String str4, Throwable th2) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createExceptionLog = createExceptionLog(str2, str3, str, str4, th2);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createExceptionLog);
        } else {
            bootLogs.add(createExceptionLog);
        }
    }

    public /* synthetic */ void lambda$trackLifecycle$6(String str, String str2, String str3, String str4, Object obj) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createLog = createLog(LogCategory.LIFECYCLE, str2, str3, str, str4, obj);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createLog);
        } else {
            bootLogs.add(createLog);
        }
    }

    public /* synthetic */ void lambda$trackLifecycle$7(String str, String str2, String str3, JSONObject jSONObject) {
        if (shouldDropLog(str)) {
            return;
        }
        JSONObject createLogWithValue = createLogWithValue(LogCategory.LIFECYCLE, str2, str3, str, jSONObject);
        if (this.juspayServices.getSessionInfo().getSessionId() != null) {
            trackParsed(createLogWithValue);
        } else {
            bootLogs.add(createLogWithValue);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void processBootLogs() {
        /*
            r7 = this;
        L0:
            java.util.Queue<org.json.JSONObject> r0 = in.juspay.hypersdk.core.SdkTracker.bootLogs
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6e
            java.lang.Object r0 = r0.poll()
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L0
            java.lang.String r1 = "label"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)     // Catch: java.lang.Exception -> L3f
            boolean r1 = r7.shouldDropLog(r1)     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L1f
            goto L0
        L1f:
            r7.signLog(r0)     // Catch: java.lang.Exception -> L3f
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.getWorkingLogger()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "json-array"
            boolean r1 = java.util.Objects.equals(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L42
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.getWorkingLogger()     // Catch: java.lang.Exception -> L3f
            java.lang.String r2 = "both"
            boolean r1 = java.util.Objects.equals(r1, r2)     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L4f
            goto L42
        L3f:
            r0 = move-exception
            r6 = r0
            goto L61
        L42:
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L3f
            in.juspay.hypersdk.data.SessionInfo r1 = r1.getSessionInfo()     // Catch: java.lang.Exception -> L3f
            java.lang.String r1 = r1.getSessionId()     // Catch: java.lang.Exception -> L3f
            in.juspay.hypersdk.analytics.LogSessioniser.addLogLine(r1, r0)     // Catch: java.lang.Exception -> L3f
        L4f:
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L3f
            in.juspay.hypersdk.analytics.LogSessioniserExp r1 = r1.getLogSessioniserExp()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L0
            in.juspay.hypersdk.core.JuspayServices r1 = r7.juspayServices     // Catch: java.lang.Exception -> L3f
            in.juspay.hypersdk.analytics.LogSessioniserExp r1 = r1.getLogSessioniserExp()     // Catch: java.lang.Exception -> L3f
            r1.addLogLine(r0)     // Catch: java.lang.Exception -> L3f
            goto L0
        L61:
            java.lang.String r2 = "action"
            java.lang.String r3 = "system"
            java.lang.String r4 = "log_pusher"
            java.lang.String r5 = "Exception while signing log line"
            r1 = r7
            r1.trackException(r2, r3, r4, r5, r6)
            goto L0
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.SdkTracker.processBootLogs():void");
    }

    private boolean shouldDropLog(String str) {
        return this.labelsToDrop.contains(str);
    }

    private void signLog(@NonNull JSONObject jSONObject) {
        SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
        if (!jSONObject.has("session_id")) {
            jSONObject.put("session_id", sessionInfo.getSessionId());
        }
        String clientId = sessionInfo.getClientId();
        if (!jSONObject.has(PaymentConstants.CLIENT_ID) && !clientId.isEmpty()) {
            String[] split = clientId.split("_", 2);
            if (split.length > 0) {
                jSONObject.put(PaymentConstants.CLIENT_ID, split[0].toLowerCase());
            }
        }
        String merchantId = sessionInfo.getMerchantId();
        if (!merchantId.isEmpty() && !jSONObject.has(PaymentConstants.MERCHANT_ID)) {
            jSONObject.put(PaymentConstants.MERCHANT_ID, merchantId);
        }
        String orderId = sessionInfo.getOrderId();
        if (!orderId.isEmpty() && !jSONObject.has(PaymentConstants.ORDER_ID)) {
            jSONObject.put(PaymentConstants.ORDER_ID, orderId);
        }
        if (!jSONObject.has("package_name")) {
            jSONObject.put("package_name", sessionInfo.getPackageName());
        }
        if (!jSONObject.has("log_version")) {
            jSONObject.put("log_version", PaymentConstants.LOG_VERSION);
        }
        jSONObject.put("sn", this.serialNumberCounter.getAndIncrement());
        if (!jSONObject.has("hyper_sdk_version")) {
            jSONObject.put("hyper_sdk_version", this.hyperSdkVersion);
        }
        if (!jSONObject.has(PaymentConstants.GODEL_VERSION)) {
            jSONObject.put(PaymentConstants.GODEL_VERSION, this.godelVersion);
        }
        if (!jSONObject.has(PaymentConstants.GODEL_BUILD_VERSION)) {
            jSONObject.put(PaymentConstants.GODEL_BUILD_VERSION, this.godelBuildVersion);
        }
        Iterator<String> keys = this.logProperties.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, this.logProperties.optString(next));
        }
    }

    public static void trackAndLogBootException(String str, String str2, String str3, String str4, String str5, Throwable th2) {
        ExecutorManager.runOnSdkTrackerPool(new p0(str, str5, th2, str2, str3, str4));
    }

    public static void trackBootAction(String str, String str2, String str3, String str4, Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new q0(str, str2, str3, str4, obj, 1));
    }

    public static void trackBootException(String str, String str2, String str3, String str4, Throwable th2) {
        ExecutorManager.runOnSdkTrackerPool(new a(str, str2, str3, str4, th2));
    }

    public static void trackBootLifecycle(String str, String str2, String str3, String str4, Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new q0(str, str2, str3, str4, obj, 0));
    }

    private void trackParsed(JSONObject jSONObject) {
        try {
            if (!LogConstants.shouldPush) {
                bootLogs.clear();
                return;
            }
            truncateLog(jSONObject);
            signLog(jSONObject);
            if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
                LogSessioniser.addLogLine(this.juspayServices.getSessionInfo().getSessionId(), jSONObject);
            }
            if (this.juspayServices.getLogSessioniserExp() != null) {
                this.juspayServices.getLogSessioniserExp().addLogLine(jSONObject);
            }
            processBootLogs();
        } catch (Exception e10) {
            trackException(LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.LOG_PUSHER, "Exception while signing log line", e10);
        }
    }

    private void trackPhoneState() {
        try {
            JSONObject jSONObject = new JSONObject();
            SessionInfo sessionInfo = this.juspayServices.getSessionInfo();
            ActivityManager.MemoryInfo memoryInfo = Utils.getMemoryInfo(this.juspayServices.getContext());
            if (memoryInfo != null) {
                jSONObject.put("available_memory", memoryInfo.availMem);
                jSONObject.put("threshold_memory", memoryInfo.threshold);
                jSONObject.put("total_memory", memoryInfo.totalMem);
            }
            jSONObject.put("network_info", sessionInfo.getNetworkInfo());
            jSONObject.put("network_type", String.valueOf(sessionInfo.getNetworkType()));
            jSONObject.put("ip_address", Utils.getIPAddress(this.juspayServices));
            trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.PHONE_STATE, jSONObject);
        } catch (Exception unused) {
        }
    }

    private void truncateLog(@NonNull JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > MAX_LOG_SIZE) {
                    jSONObject.put(next, str.substring(0, MAX_LOG_SIZE));
                }
            } else if (obj instanceof JSONObject) {
                truncateLog((JSONObject) obj);
            }
        }
    }

    public void addLogProperties(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = LogConstants.logProperties;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                int indexOf = string.indexOf(36);
                int indexOf2 = string.indexOf(123);
                int lastIndexOf = string.lastIndexOf(125);
                if (indexOf != -1 && indexOf2 != -1 && lastIndexOf != -1 && indexOf2 - indexOf == 1 && indexOf2 < lastIndexOf) {
                    String substring = string.substring(indexOf2 + 1, lastIndexOf);
                    if (jSONObject.has(substring)) {
                        this.logProperties.put(next, string.replace("${" + substring + UrlTreeKt.componentParamSuffix, jSONObject.optString(substring)));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public void addLogToPersistedQueue(JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new t0(this, jSONObject, 1));
    }

    @NonNull
    public JSONObject getExceptionLog(String str, String str2, String str3, String str4, Throwable th2) {
        JSONObject createExceptionLog = createExceptionLog(str, str2, str3, str4, th2, true);
        try {
            signLog(createExceptionLog);
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "getExceptionLog failed", e10);
        }
        return createExceptionLog;
    }

    public void resetSerialNumber() {
        this.serialNumberCounter = new AtomicInteger(1);
    }

    public void setEndPointSandbox(Boolean bool) {
        ExecutorManager.runOnLogSessioniserThread(new i(9, this, bool));
    }

    public void setLabelsToDrop(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("labelsToDrop");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.labelsToDrop.add(jSONArray.getString(i10));
            }
        } catch (Exception unused) {
        }
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public void track(JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new t0(this, jSONObject, 0));
    }

    @Override // in.juspay.hyper.core.TrackerInterface, in.juspay.hypersmshandler.Tracker
    public void trackAction(@NonNull String str, @NonNull String str2, @NonNull String str3, String str4, @NonNull Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new o0(this, str3, str, str2, str4, obj, 2));
    }

    public void trackAndLogApiException(final String str, final String str2, final String str3, final String str4, final Long l10, final Long l11, final Object obj, final String str5, final String str6, final String str7, final Throwable th2, final JSONArray jSONArray, final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.v0
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.this.lambda$trackAndLogApiException$16(str, str7, th2, str4, str2, str3, l10, l11, obj, str5, str6, jSONArray, jSONObject);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface, in.juspay.hypersmshandler.Tracker
    public void trackAndLogException(@NonNull final String str, @NonNull final String str2, @NonNull final String str3, @NonNull final String str4, @NonNull final String str5, @NonNull final Throwable th2) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.u0
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.this.lambda$trackAndLogException$15(str4, str, str5, th2, str2, str3);
            }
        });
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public void trackApiCalls(final String str, final String str2, final String str3, final Integer num, final String str4, final Long l10, final Long l11, final Object obj, final Object obj2, final String str5) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.s0
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.this.lambda$trackApiCalls$9(str3, str, str2, num, str4, l10, l11, obj, obj2, str5);
            }
        });
    }

    public void trackContext(String str, String str2, String str3, Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new a(this, str3, str, str2, obj, 4));
    }

    public void trackException(String str, String str2, String str3, String str4, Throwable th2) {
        ExecutorManager.runOnSdkTrackerPool(new p0(this, str3, str, str2, str4, th2));
    }

    @Override // in.juspay.hyper.core.TrackerInterface
    public void trackLifecycle(String str, String str2, String str3, String str4, Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new o0(this, str3, str, str2, str4, obj, 0));
    }

    @NonNull
    private static JSONObject createApiLog(String str, String str2, String str3, Integer num, String str4, Long l10, Long l11, Object obj, Object obj2, String str5, JSONArray jSONArray, JSONObject jSONObject) {
        JSONArray names;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("url", str4);
            jSONObject3.put("status_code", num);
            jSONObject3.put("start_time", l10);
            jSONObject3.put("end_time", l11);
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject3.put(PaymentConstants.PAYLOAD, obj);
            jSONObject3.put("response", obj2);
            jSONObject3.put("method", str5);
            jSONObject2.put("category", LogCategory.API_CALL);
            jSONObject2.put("subcategory", str);
            jSONObject2.put("level", str2);
            jSONObject2.put("label", str3);
            jSONObject2.put("channels", jSONArray);
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject3);
            jSONObject2.put("at", System.currentTimeMillis());
            jSONObject2.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
            if (jSONObject != null && (names = jSONObject.names()) != null) {
                for (int i10 = 0; i10 < names.length(); i10++) {
                    String string = names.getString(i10);
                    jSONObject2.put(string, jSONObject.getString(string));
                }
            }
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding boot log: ", e10);
        }
        return jSONObject2;
    }

    @NonNull
    private static JSONObject createExceptionLog(String str, String str2, String str3, String str4, @NonNull Throwable th2, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("message", str4 + ". " + th2.getLocalizedMessage());
            jSONObject2.put("stacktrace", z10 ? formatThrowable(th2) : Log.getStackTraceString(th2));
            jSONObject.put("category", str);
            jSONObject.put("subcategory", str2);
            jSONObject.put("level", "exception");
            jSONObject.put("label", str3 + "_" + Utils.getLogLevelFromThrowable(th2));
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, jSONObject2);
            jSONObject.put(PaymentConstants.SERVICE, PaymentConstants.Category.SDK);
            jSONObject.put("at", System.currentTimeMillis());
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, "Error while adding log: ", e10);
        }
        return jSONObject;
    }

    public void trackApiCalls(final String str, final String str2, final String str3, final Integer num, final String str4, final Long l10, final Long l11, final Object obj, final Object obj2, final String str5, final JSONArray jSONArray, final JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new Runnable() { // from class: in.juspay.hypersdk.core.r0
            @Override // java.lang.Runnable
            public final void run() {
                SdkTracker.this.lambda$trackApiCalls$10(str, str2, str3, num, str4, l10, l11, obj, obj2, str5, jSONArray, jSONObject);
            }
        });
    }

    public void trackContext(String str, String str2, String str3, String str4, Object obj) {
        ExecutorManager.runOnSdkTrackerPool(new o0(this, str3, str, str2, str4, obj, 1));
    }

    public void trackLifecycle(String str, String str2, String str3, JSONObject jSONObject) {
        ExecutorManager.runOnSdkTrackerPool(new a(this, str3, str, str2, jSONObject, 2));
    }
}
