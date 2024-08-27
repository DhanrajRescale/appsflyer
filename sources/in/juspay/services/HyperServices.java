package in.juspay.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import androidx.activity.q;
import androidx.activity.w;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.fragment.app.j0;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayCoreLib;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.analytics.g;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.PrefetchServices;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.JuspayResponseHandlerDummyImpl;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k5.j;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r5.z;
import x5.u;

@Keep
/* loaded from: classes2.dex */
public class HyperServices {
    private static final String LOG_TAG = "HyperServices";
    private static final String REQUEST_ID = "requestId";
    protected j0 activity;

    @NonNull
    private final HashMap<WeakReference<j0>, String> activityIds;
    protected ViewGroup container;

    @NonNull
    private final Context context;
    private String currentActivityId;
    private HyperExceptionHandler hyperExceptionHandler;
    protected boolean jpConsumingBackPress;

    @NonNull
    private final JuspayServices juspayServices;
    protected HyperPaymentsCallback merchantCallback;

    @NonNull
    private final q onBackPressedCallback;
    private final Queue<Runnable> processWaitingQueue;
    private final AtomicReference<SDKState> sdkStateReference;

    @NonNull
    private final TrackerFallback trackerFallBack;

    /* renamed from: in.juspay.services.HyperServices$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends q {
        public AnonymousClass1(boolean z10) {
            super(z10);
        }

        @Override // androidx.activity.q
        public void handleOnBackPressed() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("triggered_on", "onBackPressedCallback.handleOnBackPressed()");
            } catch (Exception unused) {
            }
            HyperServices.this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, jSONObject);
            HyperServices.this.juspayServices.onBackPressed();
        }
    }

    /* renamed from: in.juspay.services.HyperServices$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends HyperPaymentsCallbackAdapter {
        public AnonymousClass2() {
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
        public WebViewClient createJuspaySafeWebViewClient() {
            return HyperServices.this.merchantCallback.createJuspaySafeWebViewClient();
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
        public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
            return HyperServices.this.merchantCallback.getMerchantView(viewGroup, merchantViewType);
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
        public void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
            if (HyperServices.this.handleOnEvent(jSONObject)) {
                HyperServices.this.merchantCallback.onEvent(jSONObject, juspayResponseHandler);
            }
        }

        @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
        public void onStartWaitingDialogCreated(View view) {
            HyperServices.this.merchantCallback.onStartWaitingDialogCreated(view);
        }
    }

    /* renamed from: in.juspay.services.HyperServices$3 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$services$SDKState;

        static {
            int[] iArr = new int[SDKState.values().length];
            $SwitchMap$in$juspay$services$SDKState = iArr;
            try {
                iArr[SDKState.INSTANTIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$services$SDKState[SDKState.INITIATE_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$services$SDKState[SDKState.INITIATE_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$services$SDKState[SDKState.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class HyperExceptionHandler implements Thread.UncaughtExceptionHandler {
        private static final String LOG_TAG = "UncaughtExceptionHandler";
        private WeakReference<HyperServices> hyperServices;
        private Thread.UncaughtExceptionHandler merchantHandler;

        public HyperExceptionHandler(HyperServices hyperServices) {
            this.hyperServices = new WeakReference<>(hyperServices);
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "created HyperExceptionHandler");
        }

        public void clearHyperExceptionHandler() {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.merchantHandler;
            if (uncaughtExceptionHandler == null || !(uncaughtExceptionHandler instanceof HyperExceptionHandler)) {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            this.hyperServices = new WeakReference<>(null);
            this.merchantHandler = null;
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "destroyed HyperExceptionHandler and registered merchant's exception handler as default");
        }

        public void setAsDefaultExceptionHandler() {
            this.merchantHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            SdkTracker.trackBootLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.EXCEPTION_HANDLER, "ExceptionHandler", "registered HyperExceptionHandler as default uncaught exception handler");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
            HyperServices hyperServices = this.hyperServices.get();
            if (hyperServices != null) {
                JuspayLogger.w(LOG_TAG, "sending crash to tracker");
                hyperServices.uncaughtException(th2);
            }
            if (this.merchantHandler != null) {
                JuspayLogger.w(LOG_TAG, "forwarding crash to merchant");
                this.merchantHandler.uncaughtException(thread, th2);
            } else {
                JuspayLogger.e(LOG_TAG, "merchant exception handler not found, exiting");
                System.exit(1);
            }
        }
    }

    @Keep
    @Deprecated
    public HyperServices(Activity activity) {
        this.processWaitingQueue = new LinkedList();
        throw new InstantiationException(d.k("Instantiating HyperServices with plain Activity", activity != null ? String.format(" (%s)", activity.getClass().getName()) : HttpUrl.FRAGMENT_ENCODE_SET, " is not allowed, please pass FragmentActivity"));
    }

    private void doProcess(@NonNull JSONObject jSONObject) {
        try {
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "started", jSONObject);
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.PROCESS_START);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.PAYLOAD);
            ViewGroup viewGroup = this.container;
            jSONObject2.put("merchant_root_view", viewGroup != null ? String.valueOf(viewGroup.getId()) : -1);
            j0 j0Var = this.activity;
            jSONObject2.put("merchant_keyboard_mode", j0Var != null ? j0Var.getWindow().getAttributes().softInputMode : -1);
            jSONObject2.put("processStartedTime", System.currentTimeMillis());
            jSONObject2.put("currentActivityId", this.currentActivityId);
            jSONObject.put(PaymentConstants.PAYLOAD, jSONObject2);
            this.juspayServices.setUpMerchantFragments(jSONObject2);
        } catch (JSONException unused) {
        }
        if (jSONObject.has(REQUEST_ID)) {
            ExecutorManager.runOnMainThread(new u(this, System.currentTimeMillis(), jSONObject));
        } else {
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "request_id_present", Boolean.FALSE);
        }
    }

    private String getIdForActivity(j0 j0Var) {
        for (Map.Entry<WeakReference<j0>, String> entry : this.activityIds.entrySet()) {
            if (entry.getKey().get() == j0Var) {
                return entry.getValue();
            }
        }
        String uuid = UUID.randomUUID().toString();
        this.activityIds.put(new WeakReference<>(j0Var), uuid);
        return uuid;
    }

    @Keep
    public static JSONObject getVersions(@NonNull Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PaymentConstants.SDK_VERSION, IntegrationUtils.getSdkVersion(context));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private void initiateNotCalled() {
        throw new IllegalStateException("initiate() must be called before calling process()");
    }

    private void initiateTerminated(JSONObject jSONObject) {
        notifyMerchant("JP_017", "process() called after terminate()", "process_result", jSONObject);
        logSafeEvents("error", Labels.HyperSdk.PROCESS, "interrupted", "process() called after terminate()");
    }

    public /* synthetic */ void lambda$doProcess$6(long j10, JSONObject jSONObject) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.PROCESS, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j10));
        this.juspayServices.onMerchantEvent(Labels.HyperSdk.PROCESS, jSONObject);
    }

    public /* synthetic */ void lambda$initiate$1(JSONObject jSONObject) {
        if (this.juspayServices.getLogSessioniserExp() != null) {
            this.juspayServices.getLogSessioniserExp().startLogSessioniser();
            shouldPushLogs(Labels.HyperSdk.INITIATE, jSONObject);
        }
    }

    public /* synthetic */ void lambda$initiate$2() {
        if (this.hyperExceptionHandler == null) {
            this.hyperExceptionHandler = new HyperExceptionHandler(this);
        }
        this.hyperExceptionHandler.setAsDefaultExceptionHandler();
    }

    public /* synthetic */ void lambda$initiate$3(long j10, JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.INITIATE, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j10));
        setupJuspayServices(jSONObject, hyperPaymentsCallback);
    }

    public /* synthetic */ void lambda$runProcessWaitQueue$4() {
        logSafeEvents("info", Labels.HyperSdk.PROCESS_WAIT_QUEUE, "pending_processes", Integer.valueOf(this.processWaitingQueue.size()));
        while (!this.processWaitingQueue.isEmpty()) {
            Runnable poll = this.processWaitingQueue.poll();
            if (poll != null) {
                poll.run();
            }
        }
    }

    public /* synthetic */ void lambda$setupJuspayServices$0(JSONObject jSONObject) {
        this.sdkStateReference.set(SDKState.INITIATE_COMPLETED);
        notifyMerchant("JP_020", "No web view is present in the device", "initiate_result", jSONObject);
    }

    public /* synthetic */ void lambda$terminate$7(long j10) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, LogLevel.DEBUG, Labels.HyperSdk.TERMINATE, "main_thread_handover", Long.valueOf(System.currentTimeMillis() - j10));
        try {
            this.juspayServices.terminate();
        } catch (Exception e10) {
            this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.TERMINATE, "Failed to remove the fragment", e10);
        }
        this.container = null;
        this.activity = null;
    }

    public /* synthetic */ void lambda$uncaughtException$8(Throwable th2) {
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        sdkTracker.addLogToPersistedQueue(sdkTracker.getExceptionLog(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.System.SDK_CRASHED, "SDK Crashed Uncaught exception handler", th2));
    }

    private void logSafeEvents(String str, String str2, String str3, Object obj) {
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, str, str2, str3, obj);
    }

    private void logSafeExceptions(String str, String str2, String str3, Throwable th2) {
        this.juspayServices.getSdkTracker().trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, str, str2, str3, th2);
    }

    private JSONObject notifyMerchant(@NonNull HyperPaymentsCallback hyperPaymentsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(REQUEST_ID, jSONObject.optString(REQUEST_ID, HttpUrl.FRAGMENT_ENCODE_SET));
            jSONObject2.put(PaymentConstants.SERVICE, jSONObject.optString(PaymentConstants.SERVICE, PaymentConstants.SERVICE));
            jSONObject2.put("error", true);
            jSONObject2.put("errorCode", str);
            jSONObject2.put("errorMessage", str2);
            jSONObject2.put("event", str3);
            jSONObject2.put(PaymentConstants.PAYLOAD, new JSONObject());
            hyperPaymentsCallback.onEvent(jSONObject2, new JuspayResponseHandlerDummyImpl());
        } catch (Exception e10) {
            SdkTracker.trackAndLogBootException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.HyperSdk.EXIT_SDK_ERROR, "Error while sending response to merchant", e10);
        }
        return jSONObject2;
    }

    private boolean objectMatch(Object obj, Object obj2) {
        if (Objects.equals(obj, null) || Objects.equals(obj2, null) || !obj.getClass().equals(obj2.getClass())) {
            return false;
        }
        if (!(obj2 instanceof JSONObject)) {
            return obj2 instanceof String ? obj2.equals(obj) : obj == obj2;
        }
        JSONObject jSONObject = (JSONObject) obj2;
        if (jSONObject.length() == 0) {
            return false;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!objectMatch(jSONObject2.opt(next), jSONObject.opt(next))) {
                return false;
            }
        }
        return true;
    }

    @Keep
    public static void preFetch(@NonNull Context context, @NonNull JSONObject jSONObject) {
        PrefetchServices.preFetch(context, jSONObject);
    }

    private void runProcessWaitQueue() {
        ExecutorManager.runOnBackgroundThread(new b(this, 1));
    }

    private void setupJuspayServices(@NonNull JSONObject jSONObject, @NonNull HyperPaymentsCallback hyperPaymentsCallback) {
        this.merchantCallback = hyperPaymentsCallback;
        modifyParams(jSONObject);
        this.juspayServices.setBundleParameter(jSONObject);
        this.juspayServices.setHyperCallback(new HyperPaymentsCallbackAdapter() { // from class: in.juspay.services.HyperServices.2
            public AnonymousClass2() {
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public WebViewClient createJuspaySafeWebViewClient() {
                return HyperServices.this.merchantCallback.createJuspaySafeWebViewClient();
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public View getMerchantView(ViewGroup viewGroup, MerchantViewType merchantViewType) {
                return HyperServices.this.merchantCallback.getMerchantView(viewGroup, merchantViewType);
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
            public void onEvent(JSONObject jSONObject2, JuspayResponseHandler juspayResponseHandler) {
                if (HyperServices.this.handleOnEvent(jSONObject2)) {
                    HyperServices.this.merchantCallback.onEvent(jSONObject2, juspayResponseHandler);
                }
            }

            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter, in.juspay.hypersdk.ui.HyperPaymentsCallback
            public void onStartWaitingDialogCreated(View view) {
                HyperServices.this.merchantCallback.onStartWaitingDialogCreated(view);
            }
        });
        this.juspayServices.initiate(new a(this, jSONObject, 1));
    }

    private void shouldPushLogs(String str, JSONObject jSONObject) {
        LogSessioniserExp logSessioniserExp = this.juspayServices.getLogSessioniserExp();
        if (logSessioniserExp != null) {
            try {
                JSONObject optJSONObject = this.juspayServices.getSdkConfigService().getSdkConfig().optJSONObject("logsConfig");
                if (optJSONObject == null || (str.equals(optJSONObject.optString("bufferLogsTill", str)) && shouldStopBuffer(optJSONObject, jSONObject))) {
                    logSessioniserExp.startPushing();
                }
            } catch (Exception unused) {
                logSessioniserExp.startPushing();
            }
        }
    }

    private boolean shouldStopBuffer(JSONObject jSONObject, JSONObject jSONObject2) {
        if (!jSONObject.has("dontStopBufferOn")) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("dontStopBufferOn");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (objectMatch(jSONObject2, jSONArray.get(i10))) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public void uncaughtException(Throwable th2) {
        ExecutorManager.runOnSdkTrackerPool(new g(2, this, th2));
    }

    public boolean checkAndStartInitiate(JSONObject jSONObject) {
        SDKState sDKState = this.sdkStateReference.get();
        SDKState sDKState2 = SDKState.INITIATE_STARTED;
        if (sDKState == sDKState2 || sDKState == SDKState.INITIATE_COMPLETED) {
            notifyMerchant("JP_017", "initiate() can only be called once without terminate()", "initiate_result", jSONObject);
            logSafeEvents("error", Labels.HyperSdk.INITIATE, "interrupted", "initiate() can only be called once without terminate()");
            return false;
        }
        this.sdkStateReference.set(sDKState2);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "started", "Started initiating the SDK");
        return true;
    }

    public boolean handleOnEvent(JSONObject jSONObject) {
        JSONObject optJSONObject;
        char c10;
        boolean z10;
        try {
            optJSONObject = jSONObject.optJSONObject(PaymentConstants.PAYLOAD);
            String optString = jSONObject.optString("event");
            int hashCode = optString.hashCode();
            c10 = 65535;
            if (hashCode != -1917311628) {
                if (hashCode == 731104317 && optString.equals(Labels.HyperSdk.JP_CONSUMING_BACK_PRESS)) {
                    z10 = false;
                }
                z10 = -1;
            } else {
                if (optString.equals("onJOSReady")) {
                    z10 = true;
                }
                z10 = -1;
            }
        } catch (Exception e10) {
            logSafeExceptions(LogSubCategory.LifeCycle.ANDROID, "on_event", "on_event_failed_during_evaluation", e10);
        }
        if (!z10) {
            if (optJSONObject == null) {
                this.jpConsumingBackPress = true;
            } else {
                this.jpConsumingBackPress = optJSONObject.getBoolean(Labels.HyperSdk.JP_CONSUMING_BACK_PRESS);
            }
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.JP_CONSUMING_BACK_PRESS, Labels.HyperSdk.JP_CONSUMING_BACK_PRESS, Boolean.valueOf(this.jpConsumingBackPress));
            this.onBackPressedCallback.setEnabled(this.jpConsumingBackPress);
            return false;
        }
        if (!z10) {
            try {
                String optString2 = jSONObject.optString("event", LogConstants.DEFAULT_CHANNEL);
                int hashCode2 = optString2.hashCode();
                if (hashCode2 != 24468461) {
                    if (hashCode2 == 1858061443 && optString2.equals("initiate_result")) {
                        c10 = 1;
                    }
                } else if (optString2.equals("process_result")) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    logSafeEvents("info", Labels.HyperSdk.PROCESS, "ended", jSONObject);
                    this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.PROCESS_END);
                } else if (c10 != 1) {
                    logSafeEvents("info", "on_event", PaymentConstants.PAYLOAD, jSONObject);
                } else {
                    this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.INITIATE_RESULT);
                    logSafeEvents("info", Labels.HyperSdk.INITIATE, "ended", jSONObject);
                }
            } catch (Exception unused) {
            }
            if (jSONObject.optString(LogCategory.ACTION, HttpUrl.FRAGMENT_ENCODE_SET).equals("DUI_READY")) {
                this.sdkStateReference.set(SDKState.INITIATE_COMPLETED);
                runProcessWaitQueue();
            }
            return true;
        }
        return false;
    }

    @Keep
    public void initiate(@NonNull j0 j0Var, @NonNull ViewGroup viewGroup, @NonNull JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        this.container = viewGroup;
        initiate(j0Var, jSONObject, hyperPaymentsCallback);
    }

    @Keep
    public boolean isInitialised() {
        SDKState sDKState = this.sdkStateReference.get();
        boolean z10 = sDKState == SDKState.INITIATE_STARTED || sDKState == SDKState.INITIATE_COMPLETED;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdkState", String.valueOf(sDKState));
            jSONObject.put("isInitialised", z10);
        } catch (JSONException unused) {
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "isInitialised()", jSONObject);
        return z10;
    }

    public void modifyParams(JSONObject jSONObject) {
        try {
            jSONObject.put("service_based", true);
            jSONObject.put("use_local_assets", this.context.getResources().getBoolean(R.bool.use_local_assets));
            jSONObject.getJSONObject(PaymentConstants.PAYLOAD).put("currentActivityId", this.currentActivityId);
        } catch (Exception e10) {
            JuspayLogger.e(LOG_TAG, "Failed to write to JSON", e10);
        }
    }

    @Keep
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.juspayServices.onActivityResult(i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i11, intent);
    }

    @Keep
    public boolean onBackPressed() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("consuming_backpress", this.jpConsumingBackPress);
            jSONObject.put("triggered_on", "HyperServices.onBackPressed()");
        } catch (Exception unused) {
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, jSONObject);
        if (!this.jpConsumingBackPress) {
            return false;
        }
        this.juspayServices.onBackPressed();
        return true;
    }

    @Keep
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.juspayServices.onRequestPermissionsResult(i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, strArr, iArr);
    }

    @Keep
    /* renamed from: process */
    public void lambda$process$5(@NonNull j0 j0Var, @NonNull ViewGroup viewGroup, @NonNull JSONObject jSONObject) {
        int i10 = AnonymousClass3.$SwitchMap$in$juspay$services$SDKState[this.sdkStateReference.get().ordinal()];
        if (i10 == 1) {
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "called_before_initiate", jSONObject);
            initiateNotCalled();
            return;
        }
        if (i10 == 2) {
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.PROCESS_QUEUED);
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "queued", jSONObject);
            this.processWaitingQueue.add(new z(this, j0Var, viewGroup, jSONObject, 4));
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            logSafeEvents("error", Labels.HyperSdk.PROCESS, "called_after_terminate", jSONObject);
            initiateTerminated(jSONObject);
            return;
        }
        logSafeEvents("info", Labels.HyperSdk.PROCESS, "called_and_started", jSONObject);
        if (!this.juspayServices.isWebViewAvailable()) {
            notifyMerchant("JP_020", "No web view is present in the device", "process_result", jSONObject);
            return;
        }
        if (j0Var != this.activity) {
            logSafeEvents("info", Labels.HyperSdk.PROCESS, "activity_changed", "true");
        }
        w onBackPressedDispatcher = j0Var.getOnBackPressedDispatcher();
        q onBackPressedCallback = this.onBackPressedCallback;
        onBackPressedDispatcher.getClass();
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        onBackPressedDispatcher.b(onBackPressedCallback);
        this.container = viewGroup;
        this.activity = j0Var;
        this.currentActivityId = getIdForActivity(j0Var);
        this.juspayServices.getSessionInfo().addOrderIdInSessionData(jSONObject);
        this.juspayServices.process(j0Var, this.container);
        if (this.juspayServices.getLogSessioniserExp() != null) {
            shouldPushLogs(Labels.HyperSdk.PROCESS, jSONObject);
        }
        doProcess(jSONObject);
    }

    @Keep
    public void resetActivity(j0 j0Var) {
        if (j0Var != this.activity) {
            return;
        }
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.TERMINATE, "resetActivity()", "called");
        this.juspayServices.reset();
        this.onBackPressedCallback.remove();
        this.activity = null;
        this.currentActivityId = null;
        this.container = null;
    }

    @Keep
    public void setActivityLaunchDelegate(@NonNull ActivityLaunchDelegate activityLaunchDelegate) {
        this.juspayServices.setActivityLaunchDelegate(activityLaunchDelegate);
    }

    @Keep
    public void setIntentSenderDelegate(@NonNull IntentSenderDelegate intentSenderDelegate) {
        this.juspayServices.setIntentSenderDelegate(intentSenderDelegate);
    }

    @Keep
    public void setRequestPermissionDelegate(@NonNull RequestPermissionDelegate requestPermissionDelegate) {
        this.juspayServices.setRequestPermissionDelegate(requestPermissionDelegate);
    }

    @Keep
    public void setWebViewConfigurationCallback(@NonNull JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.juspayServices.setWebViewConfigurationCallback(juspayWebViewConfigurationCallback);
    }

    @Keep
    public void terminate() {
        SdkTracker sdkTracker;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        SDKState sDKState = this.sdkStateReference.get();
        SDKState sDKState2 = SDKState.TERMINATED;
        if (sDKState == sDKState2) {
            sdkTracker = this.juspayServices.getSdkTracker();
            str = LogSubCategory.LifeCycle.HYPER_SDK;
            str2 = LogLevel.WARNING;
            str3 = Labels.HyperSdk.TERMINATE;
            str4 = "started";
            str5 = "Terminate called again, skipping";
        } else {
            if (sDKState != SDKState.INSTANTIATED) {
                this.sdkStateReference.set(sDKState2);
                this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.TERMINATE, "started", "Terminating the SDK");
                this.jpConsumingBackPress = false;
                HyperExceptionHandler hyperExceptionHandler = this.hyperExceptionHandler;
                if (hyperExceptionHandler != null) {
                    hyperExceptionHandler.clearHyperExceptionHandler();
                    this.hyperExceptionHandler = null;
                }
                resetActivity(this.activity);
                ExecutorManager.runOnMainThread(new j(this, 1, System.currentTimeMillis()));
                this.juspayServices.getSessionInfo().resetSession();
                if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
                    LogPusher.stopLogPusherOnTerminate();
                }
                if (this.juspayServices.getLogSessioniserExp() != null) {
                    this.juspayServices.getLogSessioniserExp().stopLogSessioniserOnTerminate();
                    return;
                }
                return;
            }
            sdkTracker = this.juspayServices.getSdkTracker();
            str = LogSubCategory.LifeCycle.HYPER_SDK;
            str2 = LogLevel.WARNING;
            str3 = Labels.HyperSdk.TERMINATE;
            str4 = "started";
            str5 = "Terminate called without initiate, skipping";
        }
        sdkTracker.trackLifecycle(str, str2, str3, str4, str5);
    }

    private void notifyMerchant(String str, String str2, String str3, JSONObject jSONObject) {
        HyperPaymentsCallback hyperPaymentsCallback = this.merchantCallback;
        if (hyperPaymentsCallback != null) {
            logSafeEvents("error", str3.equals("initiate_result") ? Labels.HyperSdk.INITIATE : Labels.HyperSdk.PROCESS, "ended", notifyMerchant(hyperPaymentsCallback, str, str2, str3, jSONObject));
        }
    }

    @Keep
    public void initiate(@NonNull j0 j0Var, @NonNull JSONObject jSONObject, HyperPaymentsCallback hyperPaymentsCallback) {
        if (this.activity != j0Var) {
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "activity_changed", "true");
        }
        this.activity = j0Var;
        this.currentActivityId = getIdForActivity(j0Var);
        initiate(jSONObject, hyperPaymentsCallback);
    }

    public void terminate(JSONObject jSONObject) {
        logSafeEvents("info", Labels.HyperSdk.TERMINATE_PROCESS, "request", jSONObject);
        this.juspayServices.onMerchantEvent(Labels.HyperSdk.TERMINATE, jSONObject);
    }

    @Keep
    public void initiate(@NonNull final JSONObject jSONObject, @NonNull final HyperPaymentsCallback hyperPaymentsCallback) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.PAYLOAD);
            jSONObject2.put("initiateStartedTime", System.currentTimeMillis());
            jSONObject.put(PaymentConstants.PAYLOAD, jSONObject2);
        } catch (JSONException unused) {
        }
        if (checkAndStartInitiate(jSONObject)) {
            this.trackerFallBack.log(jSONObject, this.juspayServices, LogType.INITIATE_START);
            this.juspayServices.getSdkTracker().resetSerialNumber();
            this.juspayServices.getSessionInfo().setSessionId();
            if (Objects.equals(this.juspayServices.getWorkingLogger(), "json-array") || Objects.equals(this.juspayServices.getWorkingLogger(), "both")) {
                LogPusher.startLogPusherTimer();
            }
            ExecutorManager.runOnLogSessioniserThread(new a(this, jSONObject, 0));
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "started", jSONObject);
            this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.INITIATE, "fragment_activity_used", String.valueOf(this.activity != null));
            ExecutorManager.runOnBackgroundThread(new b(this, 0));
            final long currentTimeMillis = System.currentTimeMillis();
            ExecutorManager.runOnMainThread(new Runnable() { // from class: in.juspay.services.c
                @Override // java.lang.Runnable
                public final void run() {
                    HyperServices.this.lambda$initiate$3(currentTimeMillis, jSONObject, hyperPaymentsCallback);
                }
            });
        }
    }

    @Keep
    public void process(@NonNull j0 j0Var, @NonNull JSONObject jSONObject) {
        lambda$process$5(j0Var, (ViewGroup) j0Var.getWindow().getDecorView().findViewById(android.R.id.content), jSONObject);
    }

    @Keep
    public void process(@NonNull JSONObject jSONObject) {
        SDKState sDKState = this.sdkStateReference.get();
        if (sDKState == SDKState.INSTANTIATED) {
            initiateNotCalled();
            return;
        }
        if (sDKState == SDKState.TERMINATED) {
            initiateTerminated(jSONObject);
            return;
        }
        j0 j0Var = this.activity;
        if (j0Var == null) {
            notifyMerchant("JP_003", "FragmentActivity needs to be send in process", "process_result", jSONObject);
            return;
        }
        ViewGroup viewGroup = this.container;
        if (viewGroup != null) {
            lambda$process$5(j0Var, viewGroup, jSONObject);
        } else {
            process(j0Var, jSONObject);
        }
    }

    @Keep
    public HyperServices(@NonNull Context context) {
        this(context, (TenantParams) null);
    }

    public HyperServices(@NonNull Context context, TenantParams tenantParams) {
        this.processWaitingQueue = new LinkedList();
        this.context = context;
        JuspayCoreLib.setApplicationContext(context.getApplicationContext());
        this.activityIds = new HashMap<>();
        this.jpConsumingBackPress = false;
        JuspayServices juspayServices = new JuspayServices(context, tenantParams);
        this.juspayServices = juspayServices;
        this.hyperExceptionHandler = new HyperExceptionHandler(this);
        this.sdkStateReference = new AtomicReference<>(SDKState.INSTANTIATED);
        this.trackerFallBack = new TrackerFallback(juspayServices.getSdkConfigService().getSdkConfig());
        this.onBackPressedCallback = new q(false) { // from class: in.juspay.services.HyperServices.1
            public AnonymousClass1(boolean z10) {
                super(z10);
            }

            @Override // androidx.activity.q
            public void handleOnBackPressed() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("triggered_on", "onBackPressedCallback.handleOnBackPressed()");
                } catch (Exception unused) {
                }
                HyperServices.this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, jSONObject);
                HyperServices.this.juspayServices.onBackPressed();
            }
        };
    }

    @Keep
    public HyperServices(@NonNull j0 j0Var) {
        this(j0Var, (ViewGroup) j0Var.getWindow().getDecorView().findViewById(android.R.id.content));
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.HYPER_SERVICE, "view_group", Boolean.FALSE);
    }

    @Keep
    public HyperServices(@NonNull j0 j0Var, @NonNull ViewGroup viewGroup) {
        this(j0Var.getApplicationContext());
        this.activity = j0Var;
        this.container = viewGroup;
        this.currentActivityId = getIdForActivity(j0Var);
        this.juspayServices.getSdkTracker().trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.HYPER_SERVICE, "sdk_create", "success");
    }
}
