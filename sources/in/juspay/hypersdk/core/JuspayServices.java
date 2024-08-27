package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.d1;
import androidx.fragment.app.p1;
import in.juspay.hyper.bridge.BridgeList;
import in.juspay.hyper.bridge.HyperBridge;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.FileProviderInterface;
import in.juspay.hyper.core.FragmentHooks;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.TrackerInterface;
import in.juspay.hyperapay.APayBridge;
import in.juspay.hyperapayupi.APayUPIBridge;
import in.juspay.hypergpay.GPayBridge;
import in.juspay.hypergpayintl.GPayIntlBridge;
import in.juspay.hypernfc.NfcBridge;
import in.juspay.hyperpaypal.PaypalBridge;
import in.juspay.hyperpayu.PayUBridge;
import in.juspay.hyperqr.QrBridge;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.analytics.LogPusher;
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.data.SdkInfo;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.lifecycle.ActivityResultHolder;
import in.juspay.hypersdk.lifecycle.EventListener;
import in.juspay.hypersdk.lifecycle.FragmentEvent;
import in.juspay.hypersdk.lifecycle.HyperActivityLaunchDelegate;
import in.juspay.hypersdk.lifecycle.HyperFragment;
import in.juspay.hypersdk.lifecycle.HyperIntentSenderDelegate;
import in.juspay.hypersdk.lifecycle.HyperRequestPermissionDelegate;
import in.juspay.hypersdk.lifecycle.RequestPermissionResult;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.services.SdkConfigService;
import in.juspay.hypersdk.ui.ActivityLaunchDelegate;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.ui.IntentSenderDelegate;
import in.juspay.hypersdk.ui.RequestPermissionDelegate;
import in.juspay.hypersdk.utils.IntegrationUtils;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersimpl.SimplBridge;
import in.juspay.hypersmshandler.SmsComponents;
import in.juspay.hypersmshandler.SmsEventInterface;
import in.juspay.hypersmshandler.SmsServices;
import in.juspay.hypersmshandler.Tracker;
import in.juspay.hypertrident.TridentBridge;
import in.juspay.hyperupi.UPIBridge;
import in.juspay.mobility.app.MobilityAppBridge;
import in.juspay.mobility.customer.MobilityCustomerBridge;
import in.juspay.mobility.driver.MobilityDriverBridge;
import in.juspay.services.TenantParams;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JuspayServices implements FragmentHooks {
    private static final String fragmentTag = "JuspayServiceFragment";
    private androidx.fragment.app.j0 activity;

    @NonNull
    private ActivityLaunchDelegate activityLaunchDelegate;

    @NonNull
    private final BridgeComponents bridgeComponents;

    @NonNull
    private final String buildId;
    private JSONObject bundleParameters;
    private FrameLayout container;

    @NonNull
    private final Context context;

    @NonNull
    private final DynamicUI dynamicUI;

    @NonNull
    private final FileProviderService fileProviderService;

    @NonNull
    private final List<FragmentEvent> fragmentEvents;
    private HyperPaymentsCallback hyperCallback;

    @NonNull
    private IntentSenderDelegate intentSenderDelegate;

    @NonNull
    private final JBridge jBridge;
    private JSONObject lastProcessPayload;
    private LogSessioniserExp logSessioniserExp;
    private String merchantClientId;

    @NonNull
    private final PaymentSessionInfo paymentSessionInfo;

    @NonNull
    private final RemoteAssetService remoteAssetService;

    @NonNull
    private RequestPermissionDelegate requestPermissionDelegate;

    @NonNull
    private final SdkConfigService sdkConfigService;

    @NonNull
    private final SdkInfo sdkInfo;

    @NonNull
    private final SdkTracker sdkTracker;

    @NonNull
    private final SessionInfo sessionInfo;

    @NonNull
    private final SmsServices smsServices;
    private final TenantParams tenantParams;
    private JuspayWebViewConfigurationCallback webViewConfigurationCallback;
    Runnable webViewCrashCallback;

    @NonNull
    private String workingLogger;
    private final String LOG_TAG = getClass().getSimpleName();

    @NonNull
    private final BridgeList bridgeList = new BridgeList();
    HyperFragment fragment = null;
    private boolean paused = false;
    private boolean isPrefetch = false;
    private boolean isWebViewAvailable = true;
    SmsComponents smsComponents = new SmsComponents() { // from class: in.juspay.hypersdk.core.JuspayServices.4
        public AnonymousClass4() {
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public Context getContext() {
            return JuspayServices.this.context;
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public SmsEventInterface getSmsEventInterface() {
            return JuspayServices.this.jBridge.getSmsEventInterface();
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public Tracker getTracker() {
            return JuspayServices.this.sdkTracker;
        }
    };

    /* renamed from: in.juspay.hypersdk.core.JuspayServices$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Callback {
        public AnonymousClass1() {
        }

        @Override // in.juspay.hypersdk.mystique.Callback
        public void onError(String str, String str2) {
            JuspayLogger.e("DynamicUI", String.format("%s %s", str, str2));
            JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str.toLowerCase(), str2);
        }

        @Override // in.juspay.hypersdk.mystique.Callback
        public void onException(String str, String str2, Throwable th2) {
            JuspayLogger.e("DynamicUI", String.format("%s %s", str, str2));
            JuspayServices.this.sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.DUI, Labels.HyperSdk.MYSTIQUE, str2, th2);
        }

        @Override // in.juspay.hypersdk.mystique.Callback
        public void webViewLoaded(Exception exc) {
            Runnable runnable;
            if (exc != null && (runnable = JuspayServices.this.webViewCrashCallback) != null) {
                runnable.run();
            }
            JuspayServices.this.webViewCrashCallback = null;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.JuspayServices$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements DuiLogger {
        public AnonymousClass2() {
        }

        @Override // in.juspay.hypersdk.core.DuiLogger
        public void d(String str, String str2) {
        }

        @Override // in.juspay.hypersdk.core.DuiLogger
        public void e(String str, String str2) {
            JuspayLogger.e(str, str2);
            JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str.toLowerCase(), str2);
        }

        @Override // in.juspay.hypersdk.core.DuiLogger
        public void i(String str, String str2) {
        }
    }

    /* renamed from: in.juspay.hypersdk.core.JuspayServices$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements BridgeComponents {
        public AnonymousClass3() {
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        public Activity getActivity() {
            return JuspayServices.this.activity;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public CallbackInvoker getCallbackInvoker() {
            return JuspayServices.this.jBridge;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        public String getClientId() {
            try {
                return JuspayServices.this.getSessionInfo().getClientId();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public Context getContext() {
            return JuspayServices.this.context;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public FileProviderInterface getFileProviderInterface() {
            return JuspayServices.this.fileProviderService;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public FragmentHooks getFragmentHooks() {
            return JuspayServices.this;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public JsCallback getJsCallback() {
            return JuspayServices.this.dynamicUI;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public JSONObject getSdkConfig() {
            return JuspayServices.this.sdkConfigService.getSdkConfig();
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public String getSdkName() {
            return JuspayServices.this.sdkInfo.getSdkName();
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public TrackerInterface getTrackerInterface() {
            return JuspayServices.this.sdkTracker;
        }

        @Override // in.juspay.hyper.core.BridgeComponents
        @NonNull
        public JBridge getReceiverInterface() {
            return JuspayServices.this.jBridge;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.JuspayServices$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements SmsComponents {
        public AnonymousClass4() {
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public Context getContext() {
            return JuspayServices.this.context;
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public SmsEventInterface getSmsEventInterface() {
            return JuspayServices.this.jBridge.getSmsEventInterface();
        }

        @Override // in.juspay.hypersmshandler.SmsComponents
        @NonNull
        public Tracker getTracker() {
            return JuspayServices.this.sdkTracker;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.JuspayServices$5 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent;

        static {
            int[] iArr = new int[FragmentEvent.values().length];
            $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent = iArr;
            try {
                iArr[FragmentEvent.onPause.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onResume.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[FragmentEvent.onAttach.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public JuspayServices(@NonNull Context context, TenantParams tenantParams) {
        this.workingLogger = "json-array";
        this.tenantParams = tenantParams;
        this.sdkInfo = IntegrationUtils.getSdkInfo(context);
        this.context = context.getApplicationContext();
        this.buildId = "jus_" + IntegrationUtils.getSdkVersion(context, "_") + "_" + IntegrationUtils.getAssetAarVersion(context);
        AnonymousClass1 anonymousClass1 = new Callback() { // from class: in.juspay.hypersdk.core.JuspayServices.1
            public AnonymousClass1() {
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void onError(String str, String str2) {
                JuspayLogger.e("DynamicUI", String.format("%s %s", str, str2));
                JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str.toLowerCase(), str2);
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void onException(String str, String str2, Throwable th2) {
                JuspayLogger.e("DynamicUI", String.format("%s %s", str, str2));
                JuspayServices.this.sdkTracker.trackException(LogCategory.ACTION, LogSubCategory.Action.DUI, Labels.HyperSdk.MYSTIQUE, str2, th2);
            }

            @Override // in.juspay.hypersdk.mystique.Callback
            public void webViewLoaded(Exception exc) {
                Runnable runnable;
                if (exc != null && (runnable = JuspayServices.this.webViewCrashCallback) != null) {
                    runnable.run();
                }
                JuspayServices.this.webViewCrashCallback = null;
            }
        };
        AnonymousClass2 anonymousClass2 = new DuiLogger() { // from class: in.juspay.hypersdk.core.JuspayServices.2
            public AnonymousClass2() {
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void d(String str, String str2) {
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void e(String str, String str2) {
                JuspayLogger.e(str, str2);
                JuspayServices.this.sdkTracker.trackAction(LogSubCategory.Action.DUI, "error", Labels.HyperSdk.MYSTIQUE, str.toLowerCase(), str2);
            }

            @Override // in.juspay.hypersdk.core.DuiLogger
            public void i(String str, String str2) {
            }
        };
        SdkTracker sdkTracker = new SdkTracker(this);
        this.sdkTracker = sdkTracker;
        SdkConfigService sdkConfigService = new SdkConfigService(this);
        this.sdkConfigService = sdkConfigService;
        this.sessionInfo = new SessionInfo(this);
        this.fileProviderService = new FileProviderService(this);
        this.remoteAssetService = new RemoteAssetService(this);
        this.jBridge = new JBridge(this);
        this.activityLaunchDelegate = new HyperActivityLaunchDelegate(this);
        this.intentSenderDelegate = new HyperIntentSenderDelegate(this);
        this.requestPermissionDelegate = new HyperRequestPermissionDelegate(this);
        sdkConfigService.renewConfig(context);
        BridgeComponents createBridgeComponents = createBridgeComponents();
        this.bridgeComponents = createBridgeComponents;
        this.dynamicUI = new DynamicUI(context, anonymousClass2, anonymousClass1, createBridgeComponents, tenantParams != null ? tenantParams.getBaseContent() : null, getJavaScriptInterfaces());
        this.paymentSessionInfo = new PaymentSessionInfo(this);
        logMemoryInfo(sdkTracker, context);
        logEncryptionSupport(sdkTracker, context);
        this.fragmentEvents = Arrays.asList(FragmentEvent.values());
        this.smsServices = new SmsServices(this.smsComponents);
        JSONObject optJSONObject = sdkConfigService.getSdkConfig().optJSONObject("logsConfig");
        if (optJSONObject != null) {
            ExecutorManager.runOnBackgroundThread(new j0(this, optJSONObject, 1));
            String optString = optJSONObject.optString("workingLogger", "json-array");
            this.workingLogger = optString;
            if (Objects.equals(optString, "byte-d-json") || Objects.equals(this.workingLogger, "both")) {
                this.logSessioniserExp = new LogSessioniserExp();
            }
        }
    }

    private void addFragment(@NonNull androidx.fragment.app.j0 j0Var) {
        ExecutorManager.runOnMainThread(new i(6, this, j0Var));
    }

    private void commitFragmentTransaction(p1 p1Var) {
        if (useCommit()) {
            ((androidx.fragment.app.a) p1Var).h(true);
            return;
        }
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) p1Var;
        aVar.d();
        aVar.f1584q.y(aVar, true);
    }

    @NonNull
    private BridgeComponents createBridgeComponents() {
        return new BridgeComponents() { // from class: in.juspay.hypersdk.core.JuspayServices.3
            public AnonymousClass3() {
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public Activity getActivity() {
                return JuspayServices.this.activity;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public CallbackInvoker getCallbackInvoker() {
                return JuspayServices.this.jBridge;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            public String getClientId() {
                try {
                    return JuspayServices.this.getSessionInfo().getClientId();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public Context getContext() {
                return JuspayServices.this.context;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public FileProviderInterface getFileProviderInterface() {
                return JuspayServices.this.fileProviderService;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public FragmentHooks getFragmentHooks() {
                return JuspayServices.this;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public JsCallback getJsCallback() {
                return JuspayServices.this.dynamicUI;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public JSONObject getSdkConfig() {
                return JuspayServices.this.sdkConfigService.getSdkConfig();
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public String getSdkName() {
                return JuspayServices.this.sdkInfo.getSdkName();
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public TrackerInterface getTrackerInterface() {
                return JuspayServices.this.sdkTracker;
            }

            @Override // in.juspay.hyper.core.BridgeComponents
            @NonNull
            public JBridge getReceiverInterface() {
                return JuspayServices.this.jBridge;
            }
        };
    }

    private FrameLayout createSubLayout(Activity activity) {
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(0);
        return frameLayout;
    }

    private static void deleteFiles(Context context) {
        try {
            File[] listFiles = new File(String.valueOf(context.getCacheDir())).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String name = file.getName();
                    if (name.startsWith(LogConstants.PERSISTENT_LOGS_FILE) || name.startsWith(LogConstants.LOGS_FILE) || name.startsWith(LogConstants.TEMP_LOGS_FILE)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void firstTimeSetup() {
        String sdkName = this.sdkInfo.getSdkName();
        if (KeyValueStore.read(this.context, sdkName, PaymentConstants.BUILD_ID, "__failed").equals(this.buildId)) {
            return;
        }
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.FIRST_TIME_SETUP, "started", null);
        KeyValueStore.write(this.context, sdkName, PaymentConstants.BUILD_ID, this.buildId);
        KeyValueStore.remove(this.context, sdkName, "asset_metadata.json");
        File dir = this.context.getDir("juspay", 0);
        if (dir.exists()) {
            Utils.deleteRecursive(dir);
        }
        try {
            new File(this.context.getCacheDir(), "juspay-logs-queue.dat").delete();
            new File(this.context.getCacheDir(), "temp-logs-queue.dat").delete();
            new File(this.context.getCacheDir(), "juspay-pre-logs-queue.dat").delete();
            deleteFiles(this.context);
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.FIRST_TIME_SETUP, "completed", null);
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.FIRST_TIME_SETUP, "Exception while fetching meta-data for manifest.json file", e10);
        }
    }

    private String getBootloaderEndpoint(JSONObject jSONObject) {
        String str;
        String str2;
        TenantParams tenantParams = this.tenantParams;
        if (tenantParams != null) {
            return tenantParams.getBootLoaderEndpoint();
        }
        str = "common";
        if (jSONObject == null || !jSONObject.optBoolean(PaymentConstants.BETA_ASSETS, false)) {
            String str3 = this.merchantClientId;
            str = str3 != null ? str3.toLowerCase().split("_")[0] : "common";
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = "sandbox.";
        }
        return String.format(Constants.BOOTLOADER_REMOTE_ASSET_PATH_FORMAT, str2, str);
    }

    private Map<String, Object> getJavaScriptInterfaces() {
        HashMap hashMap = new HashMap();
        hashMap.put("JBridge", this.jBridge);
        hashMap.put(this.bridgeList.getInterfaceName(), this.bridgeList);
        if (PaymentUtils.isClassAvailable("in.juspay.hyperupi.UPIBridge")) {
            this.bridgeList.addHyperBridge(new UPIBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperapayupi.APayUPIBridge")) {
            this.bridgeList.addHyperBridge(new APayUPIBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypersimpl.SimplBridge")) {
            this.bridgeList.addHyperBridge(new SimplBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypergpayintl.GPayIntlBridge")) {
            this.bridgeList.addHyperBridge(new GPayIntlBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperapay.APayBridge")) {
            this.bridgeList.addHyperBridge(new APayBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperpaypal.PaypalBridge")) {
            this.bridgeList.addHyperBridge(new PaypalBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperqr.QrBridge")) {
            this.bridgeList.addHyperBridge(new QrBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypernfc.NfcBridge")) {
            this.bridgeList.addHyperBridge(new NfcBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypergpay.GPayBridge")) {
            this.bridgeList.addHyperBridge(new GPayBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hyperpayu.PayUBridge")) {
            this.bridgeList.addHyperBridge(new PayUBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.hypertrident.TridentBridge")) {
            this.bridgeList.addHyperBridge(new TridentBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.customer.MobilityCustomerBridge")) {
            this.bridgeList.addHyperBridge(new MobilityCustomerBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.driver.MobilityDriverBridge")) {
            this.bridgeList.addHyperBridge(new MobilityDriverBridge(this.bridgeComponents));
        }
        if (PaymentUtils.isClassAvailable("in.juspay.mobility.app.MobilityAppBridge")) {
            this.bridgeList.addHyperBridge(new MobilityAppBridge(this.bridgeComponents));
        }
        try {
            TenantParams tenantParams = this.tenantParams;
            if (tenantParams != null) {
                Iterator<Class<? extends HyperBridge>> it = tenantParams.getBridgeClasses().iterator();
                while (it.hasNext()) {
                    for (Constructor<?> constructor : it.next().getConstructors()) {
                        if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0].equals(BridgeComponents.class)) {
                            this.bridgeList.addHyperBridge((HyperBridge) constructor.newInstance(this.bridgeComponents));
                        }
                    }
                }
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.ADD_BRIDGE, "Exception while trying to add tenant bridge", e10);
        }
        hashMap.putAll(this.bridgeList.getBridgeList());
        return hashMap;
    }

    private void insetUpdated(WindowInsets windowInsets) {
        androidx.fragment.app.j0 j0Var = this.activity;
        if (j0Var == null) {
            return;
        }
        float f10 = j0Var.getResources().getDisplayMetrics().density;
        this.dynamicUI.addJsToWebView("window.insetUpdated(" + (windowInsets.getSystemWindowInsetTop() / f10) + "," + (windowInsets.getSystemWindowInsetRight() / f10) + "," + (windowInsets.getSystemWindowInsetBottom() / f10) + "," + (windowInsets.getSystemWindowInsetLeft() / f10) + "," + (windowInsets.getStableInsetTop() / f10) + "," + (windowInsets.getStableInsetRight() / f10) + "," + (windowInsets.getStableInsetBottom() / f10) + "," + (windowInsets.getStableInsetLeft() / f10) + ",)");
    }

    public /* synthetic */ void lambda$addFragment$6(FragmentEvent fragmentEvent, String str) {
        int i10 = AnonymousClass5.$SwitchMap$in$juspay$hypersdk$lifecycle$FragmentEvent[fragmentEvent.ordinal()];
        if (i10 == 1) {
            this.paused = true;
        } else if (i10 == 2) {
            this.paused = false;
        } else if (i10 == 3) {
            ActivityLaunchDelegate activityLaunchDelegate = this.activityLaunchDelegate;
            if (activityLaunchDelegate instanceof HyperActivityLaunchDelegate) {
                ((HyperActivityLaunchDelegate) activityLaunchDelegate).fragmentAttached();
            }
            RequestPermissionDelegate requestPermissionDelegate = this.requestPermissionDelegate;
            if (requestPermissionDelegate instanceof HyperRequestPermissionDelegate) {
                ((HyperRequestPermissionDelegate) requestPermissionDelegate).fragmentAttached();
            }
            IntentSenderDelegate intentSenderDelegate = this.intentSenderDelegate;
            if (intentSenderDelegate instanceof HyperIntentSenderDelegate) {
                ((HyperIntentSenderDelegate) intentSenderDelegate).fragmentAttached();
            }
        }
        this.jBridge.invokeFnInDUIWebview(fragmentEvent.toString(), str);
    }

    public void lambda$addFragment$7(androidx.fragment.app.j0 j0Var) {
        try {
            this.fragment = new HyperFragment();
            d1 supportFragmentManager = j0Var.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(0, this.fragment, fragmentTag, 1);
            commitFragmentTransaction(aVar);
            for (final FragmentEvent fragmentEvent : this.fragmentEvents) {
                this.fragment.registerForEvent(fragmentEvent, new EventListener() { // from class: in.juspay.hypersdk.core.l0
                    @Override // in.juspay.hypersdk.lifecycle.EventListener
                    public final void onEvent(String str) {
                        JuspayServices.this.lambda$addFragment$6(fragmentEvent, str);
                    }
                });
            }
            this.fragment.registerOnActivityResult(new ActivityResultHolder() { // from class: in.juspay.hypersdk.core.m0
                @Override // in.juspay.hypersdk.lifecycle.ActivityResultHolder
                public final void onActivityResult(int i10, int i11, Intent intent) {
                    JuspayServices.this.onActivityResult(i10, i11, intent);
                }
            });
            this.fragment.registerOnRequestPermissionResult(new RequestPermissionResult() { // from class: in.juspay.hypersdk.core.n0
                @Override // in.juspay.hypersdk.lifecycle.RequestPermissionResult
                public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                    JuspayServices.this.onRequestPermissionsResult(i10, strArr, iArr);
                }
            });
        } catch (Exception e10) {
            this.sdkTracker.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.FRAGMENT_OPERATION, "Exception while committing fragment", e10);
        }
    }

    public /* synthetic */ void lambda$logEncryptionSupport$1(JSONObject jSONObject, SdkTracker sdkTracker) {
        try {
            if (KeyValueStore.read(this, "isHardwareBacked", null) == null) {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("juspay", 3).build());
                PrivateKey privateKey = keyPairGenerator.generateKeyPair().getPrivate();
                KeyInfo keyInfo = (KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class);
                jSONObject.put("isHardwareBacked", keyInfo.isInsideSecureHardware());
                KeyValueStore.write(this, "isHardwareBacked", keyInfo.isInsideSecureHardware() + HttpUrl.FRAGMENT_ENCODE_SET);
                sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.PHONE_STATE, jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void lambda$new$0(JSONObject jSONObject) {
        this.sdkTracker.setLabelsToDrop(jSONObject);
    }

    public /* synthetic */ WindowInsets lambda$process$3(View view, WindowInsets windowInsets) {
        view.onApplyWindowInsets(windowInsets);
        insetUpdated(windowInsets);
        return windowInsets;
    }

    public /* synthetic */ void lambda$process$4(androidx.fragment.app.j0 j0Var, ViewGroup viewGroup) {
        FrameLayout frameLayout;
        if (this.activity != j0Var || ((frameLayout = this.container) != null && frameLayout.getParent() != viewGroup)) {
            this.jBridge.clearMerchantViews(this.activity);
            this.jBridge.clearMerchantViews(j0Var);
        }
        if (j0Var != this.activity) {
            removeFragment();
            addFragment(j0Var);
            this.activity = j0Var;
            this.jBridge.setActivity(j0Var);
            this.dynamicUI.setActivity(j0Var);
        }
        FrameLayout frameLayout2 = this.container;
        if (frameLayout2 == null || frameLayout2.getParent() != viewGroup) {
            FrameLayout createSubLayout = createSubLayout(j0Var);
            viewGroup.addView(createSubLayout);
            FrameLayout frameLayout3 = this.container;
            if (frameLayout3 != null) {
                ViewParent parent = frameLayout3.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.container);
                }
            }
            this.dynamicUI.setContainer(createSubLayout);
            viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: in.juspay.hypersdk.core.k0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$process$3;
                    lambda$process$3 = JuspayServices.this.lambda$process$3(view, windowInsets);
                    return lambda$process$3;
                }
            });
            this.container = createSubLayout;
            this.jBridge.setContainer(viewGroup);
            this.dynamicUI.setContainer(createSubLayout);
        }
    }

    public void lambda$removeFragment$8() {
        HyperFragment hyperFragment;
        if (this.activity != null && (hyperFragment = this.fragment) != null && hyperFragment.isAdded()) {
            try {
                d1 supportFragmentManager = this.activity.getSupportFragmentManager();
                if (!supportFragmentManager.I && supportFragmentManager.C(fragmentTag) != null) {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.l(this.fragment);
                    commitFragmentTransaction(aVar);
                }
            } catch (Exception e10) {
                this.sdkTracker.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.FRAGMENT_OPERATION, "Exception while removing fragment", e10);
            }
        }
        this.fragment = null;
    }

    public /* synthetic */ void lambda$reset$5() {
        this.jBridge.clearMerchantViews(this.activity);
        removeFragment();
        this.activity = null;
        this.jBridge.setActivity(null);
        this.dynamicUI.resetActivity();
        resetBridges();
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.container);
            }
        }
        this.container = null;
        this.dynamicUI.setContainer(null);
    }

    public /* synthetic */ void lambda$setBundleParameter$2(JSONObject jSONObject) {
        if (Objects.equals(this.workingLogger, "json-array") || Objects.equals(this.workingLogger, "both")) {
            LogPusher.setLogHeaderValues(jSONObject, LogConstants.DEFAULT_CHANNEL);
        }
        if (this.logSessioniserExp != null) {
            LogPusherExp.setLogHeaderValues(jSONObject, LogConstants.DEFAULT_CHANNEL);
        }
    }

    private void logMemoryInfo(SdkTracker sdkTracker, Context context) {
        ActivityManager.MemoryInfo memoryInfo = Utils.getMemoryInfo(context);
        if (memoryInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("available_memory", memoryInfo.availMem);
            jSONObject.put("threshold_memory", memoryInfo.threshold);
            jSONObject.put("total_memory", memoryInfo.totalMem);
            sdkTracker.trackContext(LogSubCategory.Context.DEVICE, "info", Labels.Device.MEMORY, "memory_info", jSONObject);
        } catch (Exception e10) {
            sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, "session_info", "Exception while logging memory_info", e10);
        }
    }

    private void prefetchBootLoaderFile(JSONObject jSONObject) {
        this.remoteAssetService.renewFile(this.context, getBootloaderEndpoint(jSONObject), null, "v1-boot_loader.zip", System.currentTimeMillis());
    }

    private void removeFragment() {
        ExecutorManager.runOnMainThread(new n(this, 2));
    }

    private void resetBridges() {
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    private void setLastProcessPayload(@NonNull JSONObject jSONObject) {
        this.lastProcessPayload = jSONObject;
    }

    private boolean useCommit() {
        if (this.merchantClientId == null) {
            return true;
        }
        return !Utils.optJSONObject(this.sdkConfigService.getSdkConfig(), "useCommitNowClientIds").optString(this.merchantClientId.toLowerCase().split("_")[0]).equals("true");
    }

    public void addJsToWebView(String str) {
        this.dynamicUI.addJsToWebView(str);
    }

    public Activity getActivity() {
        return this.activity;
    }

    public JSONObject getBundleParameters() {
        return this.bundleParameters;
    }

    public FrameLayout getContainer() {
        return this.container;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    @NonNull
    public DynamicUI getDynamicUI() {
        return this.dynamicUI;
    }

    @NonNull
    public FileProviderService getFileProviderService() {
        return this.fileProviderService;
    }

    public HyperFragment getFragment() {
        return this.fragment;
    }

    public HyperPaymentsCallback getHyperCallback() {
        return this.hyperCallback;
    }

    @NonNull
    public JBridge getJBridge() {
        return this.jBridge;
    }

    public Map<String, HyperBridge> getJBridgeList() {
        return this.bridgeList.getBridgeList();
    }

    public JSONObject getLastProcessPayload() {
        return this.lastProcessPayload;
    }

    public LogSessioniserExp getLogSessioniserExp() {
        return this.logSessioniserExp;
    }

    @NonNull
    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    @NonNull
    public RemoteAssetService getRemoteAssetService() {
        return this.remoteAssetService;
    }

    @NonNull
    public SdkConfigService getSdkConfigService() {
        return this.sdkConfigService;
    }

    @NonNull
    public final SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    @NonNull
    public SdkTracker getSdkTracker() {
        return this.sdkTracker;
    }

    @NonNull
    public SessionInfo getSessionInfo() {
        return this.sessionInfo;
    }

    @NonNull
    public SmsServices getSmsServices() {
        return this.smsServices;
    }

    public JuspayWebViewConfigurationCallback getWebViewConfigurationCallback() {
        return this.webViewConfigurationCallback;
    }

    @NonNull
    public String getWorkingLogger() {
        return this.workingLogger;
    }

    public void initiate(Runnable runnable) {
        firstTimeSetup();
        prefetchBootLoaderFile(this.bundleParameters);
        if (this.dynamicUI.initiate()) {
            this.webViewCrashCallback = runnable;
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.JUSPAY_SERVICES, "url_loaded", "base.html");
        } else {
            if (this.dynamicUI.getWebViewCrashException() != null) {
                this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.ANDROID, Labels.Android.WEBVIEW, "WebView creation failed", this.dynamicUI.getWebViewCrashException());
            }
            this.isWebViewAvailable = false;
            runnable.run();
        }
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPrefetch() {
        return this.isPrefetch;
    }

    public boolean isWebViewAvailable() {
        return this.isWebViewAvailable;
    }

    public void logEncryptionSupport(SdkTracker sdkTracker, Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                jSONObject.put("isStrongBoxBacked", context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore"));
            }
        } catch (Exception e10) {
            sdkDebug(this.LOG_TAG, Arrays.toString(e10.getStackTrace()));
        }
        ExecutorManager.runOnBackgroundThread(new p(6, this, jSONObject, sdkTracker));
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", "RESULT_OK");
            if (intent != null && intent.getExtras() != null) {
                this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", Utils.toJSON(intent.getExtras()));
            }
        } else if (i11 == 0) {
            this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.Android.ON_ACTIVITY_RESULT, "result_code", "RESULT_CANCELLED");
        }
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i10, i11, intent)) {
                return;
            }
        }
        this.jBridge.onActivityResult(i10, i11, intent);
    }

    public void onBackPressed() {
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.ANDROID, "info", Labels.Android.BACK_PRESSED, "class", "juspayServices");
        this.jBridge.requestKeyboardHide();
        this.jBridge.invokeFnInDUIWebview("onBackPressed", "{\"shouldShowBackPressDialog\":true}");
    }

    public void onMerchantEvent(String str, @NonNull JSONObject jSONObject) {
        if (str.equals(Labels.HyperSdk.PROCESS)) {
            setLastProcessPayload(jSONObject);
        }
        this.jBridge.invokeCustomFnInDUIWebview(String.format("window.onMerchantEvent('%s',%s);", str, this.dynamicUI.encodeUtfAndWrapDecode(jSONObject.toString(), this.LOG_TAG)));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        SdkTracker sdkTracker = this.sdkTracker;
        StringBuilder n10 = a3.a.n("requestCode = [", i10, "],permissions = [");
        n10.append(Arrays.toString(strArr));
        n10.append("], grantResults = [");
        n10.append(Arrays.toString(iArr));
        n10.append("]");
        sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.ON_REQUEST_PERMISSION_RESULT, "data", n10.toString());
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            if (it.next().onRequestPermissionResult(i10, strArr, iArr)) {
                return;
            }
        }
        this.jBridge.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void process(@NonNull androidx.fragment.app.j0 j0Var, @NonNull ViewGroup viewGroup) {
        FrameLayout frameLayout;
        this.smsServices.createSMSConsent();
        if (j0Var == this.activity && (frameLayout = this.container) != null && viewGroup == frameLayout.getParent()) {
            return;
        }
        ExecutorManager.runOnMainThread(new p(7, this, j0Var, viewGroup));
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void requestPermission(String[] strArr, int i10) {
        this.requestPermissionDelegate.requestPermission(strArr, i10);
    }

    public void reset() {
        ExecutorManager.runOnMainThread(new n(this, 1));
    }

    public void sdkDebug(String str, String str2) {
        if (this.sdkInfo.isSdkDebuggable()) {
            JuspayLogger.d(str, str2);
        }
    }

    public void setActivityLaunchDelegate(@NonNull ActivityLaunchDelegate activityLaunchDelegate) {
        this.activityLaunchDelegate = activityLaunchDelegate;
    }

    public void setBundleParameter(@NonNull JSONObject jSONObject) {
        try {
            jSONObject.put(PaymentConstants.SDK_NAME, this.sdkInfo.getSdkName());
            jSONObject.put(PaymentConstants.SDK_VERSION, this.sdkInfo.getSdkVersion());
            this.bundleParameters = jSONObject;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.PAYLOAD);
            this.sdkTracker.setEndPointSandbox(Boolean.valueOf(jSONObject2.has(PaymentConstants.ENV) ? jSONObject2.getString(PaymentConstants.ENV).equalsIgnoreCase(PaymentConstants.ENVIRONMENT.SANDBOX) : false));
            if (jSONObject2.has(PaymentConstants.CLIENT_ID_CAMEL)) {
                this.merchantClientId = jSONObject2.getString(PaymentConstants.CLIENT_ID_CAMEL);
            }
            setUpMerchantFragments(jSONObject2);
            this.sessionInfo.setBundleParams(jSONObject);
            this.sessionInfo.createSessionDataMap();
            this.sessionInfo.logDeviceIdentifiers();
            JSONObject sessionData = this.sessionInfo.getSessionData();
            sessionData.put(PaymentConstants.MERCHANT_ID, this.sessionInfo.getMerchantId());
            sessionData.put(PaymentConstants.CLIENT_ID, this.sessionInfo.getClientId().split("_")[0].toLowerCase());
            sessionData.put("session_id", this.sessionInfo.getSessionId());
            this.sessionInfo.logSessionInfo();
            ExecutorManager.runOnLogSessioniserThread(new j0(this, sessionData, 0));
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(this.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.SET_BUNDLE_PARAMS, "Exception while setting bundle parameter", e10);
        }
    }

    public void setHyperCallback(@NonNull HyperPaymentsCallback hyperPaymentsCallback) {
        this.hyperCallback = hyperPaymentsCallback;
    }

    public void setIntentSenderDelegate(@NonNull IntentSenderDelegate intentSenderDelegate) {
        this.intentSenderDelegate = intentSenderDelegate;
    }

    public void setPrefetch(boolean z10) {
        this.isPrefetch = z10;
    }

    public void setRequestPermissionDelegate(@NonNull RequestPermissionDelegate requestPermissionDelegate) {
        this.requestPermissionDelegate = requestPermissionDelegate;
    }

    public void setUpMerchantFragments(JSONObject jSONObject) {
        if (!jSONObject.has(PaymentConstants.FRAGMENT_VIEW_GROUPS) || this.activity == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(PaymentConstants.FRAGMENT_VIEW_GROUPS);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject2.opt(next);
                if (opt instanceof ViewGroup) {
                    FrameLayout createSubLayout = createSubLayout(this.activity);
                    ((ViewGroup) opt).addView(createSubLayout);
                    jSONObject2.put(next, this.dynamicUI.addToContainerList(createSubLayout));
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void setWebViewConfigurationCallback(JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback) {
        this.webViewConfigurationCallback = juspayWebViewConfigurationCallback;
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        this.activityLaunchDelegate.startActivityForResult(intent, i10, bundle);
    }

    @Override // in.juspay.hyper.core.FragmentHooks
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        this.intentSenderDelegate.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void terminate() {
        MPINUtil.closeAllConnections(getContext());
        this.jBridge.reset();
        Iterator<HyperBridge> it = this.bridgeList.getBridgeList().values().iterator();
        while (it.hasNext()) {
            it.next().terminate();
        }
        ActivityLaunchDelegate activityLaunchDelegate = this.activityLaunchDelegate;
        if (activityLaunchDelegate instanceof HyperActivityLaunchDelegate) {
            ((HyperActivityLaunchDelegate) activityLaunchDelegate).clearQueue();
        }
        IntentSenderDelegate intentSenderDelegate = this.intentSenderDelegate;
        if (intentSenderDelegate instanceof HyperIntentSenderDelegate) {
            ((HyperIntentSenderDelegate) intentSenderDelegate).clearQueue();
        }
        RequestPermissionDelegate requestPermissionDelegate = this.requestPermissionDelegate;
        if (requestPermissionDelegate instanceof HyperRequestPermissionDelegate) {
            ((HyperRequestPermissionDelegate) requestPermissionDelegate).clearQueue();
        }
        this.dynamicUI.terminate();
        this.smsServices.unregisterSmsConsent();
    }

    public void onMerchantEvent(@NonNull JSONObject jSONObject) {
        onMerchantEvent(LogConstants.DEFAULT_CHANNEL, jSONObject);
    }
}
