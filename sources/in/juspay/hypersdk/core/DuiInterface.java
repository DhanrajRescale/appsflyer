package in.juspay.hypersdk.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieSyncManager;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.annotation.NonNull;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.CallbackInvoker;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hyper.core.ResultAwaitingDuiHook;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.SessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.safe.JuspayWebView;
import in.juspay.hypersdk.services.RemoteAssetService;
import in.juspay.hypersdk.ui.HyperPaymentsCallback;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersmshandler.JuspayDuiHook;
import in.juspay.hypersmshandler.OnResultHook;
import in.juspay.hypersmshandler.SmsEventInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DuiInterface extends HyperJsInterface implements CallbackInvoker {
    private static final String LOG_TAG = "DuiInterface";
    protected Activity activity;

    @NonNull
    protected Map<String, String> callBackMapper;
    private ViewGroup container;

    @NonNull
    private final Context context;
    private Godel godelManager;
    private int lastFocusedEditView;

    @NonNull
    protected Map<String, Object> listenerMap;

    @NonNull
    private final ArrayList<Integer> merchantViewIds;

    @NonNull
    private final RemoteAssetService remoteAssetService;

    @NonNull
    private final SdkTracker sdkTracker;

    @NonNull
    protected final SessionInfo sessionInfo;

    /* renamed from: in.juspay.hypersdk.core.DuiInterface$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements SmsEventInterface {
        public AnonymousClass1() {
        }

        @Override // in.juspay.hypersmshandler.SmsEventInterface
        public void onActivityResultEvent(@NonNull String str) {
            DuiInterface duiInterface = DuiInterface.this;
            duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_CONSENT), str);
        }

        @Override // in.juspay.hypersmshandler.SmsEventInterface
        public void onSentReceiverEvent(int i10) {
            StringBuilder sb2;
            String str;
            String sb3;
            if (DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS) != null) {
                String str2 = "window.callUICallback(\"" + DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS);
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    sb3 = jr.h.r(str2, "\", \"Unable to Send SMS\", \"837\")");
                                    DuiInterface.this.invokeFnInDUIWebview(sb3);
                                } else {
                                    Toast.makeText(DuiInterface.this.context, "SMS NO SERVICE", 0).show();
                                    sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    str = "\", \"No service\", \"838\")";
                                }
                            } else {
                                Toast.makeText(DuiInterface.this.context, "SMS NULL PDU", 0).show();
                                sb2 = new StringBuilder();
                                sb2.append(str2);
                                str = "\", \"Null PDU\", \"839\")";
                            }
                        } else {
                            Toast.makeText(DuiInterface.this.context, "SMS RADIO OFF", 0).show();
                            sb2 = new StringBuilder();
                            sb2.append(str2);
                            str = "\", \"Radio off\", \"840\")";
                        }
                    } else {
                        Toast.makeText(DuiInterface.this.context, "SMS GENERIC FAILURE", 0).show();
                        sb2 = new StringBuilder();
                        sb2.append(str2);
                        str = "\", \"Generic failure\", \"837\")";
                    }
                } else {
                    Toast.makeText(DuiInterface.this.context, "SMS SENT", 0).show();
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    str = "\", \"SUCCESS\")";
                }
                sb2.append(str);
                sb3 = sb2.toString();
                DuiInterface.this.invokeFnInDUIWebview(sb3);
            }
        }

        @Override // in.juspay.hypersmshandler.SmsEventInterface
        public void onSmsConsentEvent(@NonNull Intent intent, int i10, Bundle bundle) {
            DuiInterface.this.juspayServices.startActivityForResult(intent, i10, bundle);
            DuiInterface.this.invokeFnInDUIWebview("onSMSConsentShown", "{ }");
        }

        @Override // in.juspay.hypersmshandler.SmsEventInterface
        public void onSmsReceiverEvent(@NonNull String str) {
            DuiInterface duiInterface = DuiInterface.this;
            duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_RECEIVE), str);
        }

        @Override // in.juspay.hypersmshandler.SmsEventInterface
        public void onSmsRetrieverEvent(@NonNull SmsEventInterface.RetrieverEvents retrieverEvents, @NonNull String str) {
            DuiInterface duiInterface;
            Map<String, String> map;
            StringBuilder sb2;
            SmsEventInterface.RetrieverEvents retrieverEvents2;
            int i10 = AnonymousClass3.$SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[retrieverEvents.ordinal()];
            if (i10 == 1) {
                duiInterface = DuiInterface.this;
                map = duiInterface.callBackMapper;
                sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                retrieverEvents2 = SmsEventInterface.RetrieverEvents.ON_ATTACH;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return;
                    }
                    DuiInterface duiInterface2 = DuiInterface.this;
                    Map<String, String> map2 = duiInterface2.callBackMapper;
                    StringBuilder sb3 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    SmsEventInterface.RetrieverEvents retrieverEvents3 = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
                    sb3.append(retrieverEvents3);
                    duiInterface2.invokeCallbackInDUIWebview(map2.get(sb3.toString()), str);
                    if ("TIMEOUT".equals(str)) {
                        return;
                    }
                    DuiInterface.this.callBackMapper.put(PaymentConstants.SMS_RETRIEVER + retrieverEvents3, null);
                    return;
                }
                duiInterface = DuiInterface.this;
                map = duiInterface.callBackMapper;
                sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                retrieverEvents2 = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
            }
            sb2.append(retrieverEvents2);
            duiInterface.invokeCallbackInDUIWebview(map.get(sb2.toString()), str);
        }
    }

    /* renamed from: in.juspay.hypersdk.core.DuiInterface$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements JuspayResponseHandler {
        final /* synthetic */ String val$cb;
        final /* synthetic */ SdkTracker val$sdkTracker;

        public AnonymousClass2(String str, SdkTracker sdkTracker) {
            r2 = str;
            r3 = sdkTracker;
        }

        @Override // in.juspay.hypersdk.data.JuspayResponseHandler
        public void onError(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", "onError");
                try {
                    jSONObject.put(PaymentConstants.PAYLOAD, new JSONObject(str));
                } catch (Exception unused) {
                    jSONObject.put(PaymentConstants.PAYLOAD, str);
                }
                DuiInterface.this.invokeCallbackInDUIWebview(r2, jSONObject.toString());
            } catch (Exception e10) {
                r3.trackAndLogException(DuiInterface.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e10);
            }
        }

        @Override // in.juspay.hypersdk.data.JuspayResponseHandler
        public void onResponse(Bundle bundle) {
            onResponse(Utils.toJSON(bundle).toString());
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        @Override // in.juspay.hypersdk.data.JuspayResponseHandler
        public void onResponse(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", "onResponse");
                try {
                    jSONObject.put(PaymentConstants.PAYLOAD, new JSONObject(str));
                } catch (Exception unused) {
                    jSONObject.put(PaymentConstants.PAYLOAD, str);
                }
                DuiInterface.this.invokeCallbackInDUIWebview(r2, jSONObject.toString());
            } catch (Exception e10) {
                r3.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e10);
            }
        }
    }

    /* renamed from: in.juspay.hypersdk.core.DuiInterface$3 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;

        static {
            int[] iArr = new int[SmsEventInterface.RetrieverEvents.values().length];
            $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents = iArr;
            try {
                iArr[SmsEventInterface.RetrieverEvents.ON_ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[SmsEventInterface.RetrieverEvents.ON_EXECUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[SmsEventInterface.RetrieverEvents.ON_RECEIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DuiInterface(@NonNull JuspayServices juspayServices) {
        super(juspayServices);
        this.merchantViewIds = new ArrayList<>();
        this.lastFocusedEditView = -1;
        this.context = juspayServices.getContext();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.sessionInfo = juspayServices.getSessionInfo();
        this.remoteAssetService = juspayServices.getRemoteAssetService();
        this.listenerMap = new HashMap();
        this.callBackMapper = new HashMap();
    }

    public /* synthetic */ void lambda$attachMerchantView$1(int i10, String str) {
        ViewGroup viewGroup;
        try {
            Activity activity = this.activity;
            ViewGroup viewGroup2 = activity != null ? (ViewGroup) activity.findViewById(i10) : null;
            if (viewGroup2 == null && (viewGroup = this.container) != null) {
                viewGroup2 = (ViewGroup) viewGroup.findViewById(i10);
            }
            HyperPaymentsCallback hyperCallback = this.juspayServices.getHyperCallback();
            if (viewGroup2 == null || hyperCallback == null) {
                return;
            }
            this.merchantViewIds.add(Integer.valueOf(i10));
            View merchantView = hyperCallback.getMerchantView(viewGroup2, MerchantViewType.valueOf(str));
            if (merchantView != null) {
                viewGroup2.addView(merchantView);
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while attaching merchant view", e10);
        }
    }

    public /* synthetic */ void lambda$clearMerchantViews$0(Activity activity) {
        Iterator<Integer> it = this.merchantViewIds.iterator();
        while (it.hasNext()) {
            View findViewById = activity.findViewById(it.next().intValue());
            if (findViewById instanceof ViewGroup) {
                ((ViewGroup) findViewById).removeAllViews();
            }
        }
    }

    public static /* synthetic */ void lambda$loadUrl$6(String str, JuspayWebView juspayWebView, String str2) {
        if (str != null) {
            juspayWebView.postUrl(str2, str.getBytes());
        } else {
            juspayWebView.loadUrl(str2);
        }
    }

    public /* synthetic */ void lambda$onDuiReady$2() {
        if (this.godelManager != null) {
            return;
        }
        Godel godel = new Godel(this.juspayServices);
        this.godelManager = godel;
        godel.setupAllowedDeeplinkPackages();
        this.godelManager.onDuiReady();
    }

    public /* synthetic */ void lambda$requestKeyboardHide$9() {
        SdkTracker sdkTracker;
        String str;
        String str2;
        try {
            Activity activity = this.activity;
            if (activity != null) {
                View currentFocus = activity.getCurrentFocus();
                if (currentFocus == null) {
                    currentFocus = this.activity.getWindow().getDecorView();
                }
                InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
                if (inputMethodManager == null || currentFocus.getRootView() == null) {
                    sdkTracker = this.sdkTracker;
                    str = "error";
                    str2 = "failed";
                } else {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getRootView().getWindowToken(), 0);
                    sdkTracker = this.sdkTracker;
                    str = "info";
                    str2 = "success";
                }
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, str, Labels.System.KEYBOARD, "hidden", str2);
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.KEYBOARD, "Hide Keyboard Exception", e10);
        }
    }

    public /* synthetic */ void lambda$requestKeyboardShow$7(String str) {
        try {
            if (this.activity != null) {
                int parseInt = Integer.parseInt(str);
                InputMethodManager inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
                View findViewById = this.activity.findViewById(parseInt);
                int i10 = this.lastFocusedEditView;
                View findViewById2 = i10 != -1 ? this.activity.findViewById(i10) : null;
                if (inputMethodManager != null && findViewById != null) {
                    if (findViewById2 != null && this.lastFocusedEditView != parseInt) {
                        findViewById2.clearFocus();
                    }
                    findViewById.requestFocus();
                    inputMethodManager.showSoftInput(findViewById, 1);
                }
                if (parseInt != this.lastFocusedEditView) {
                    this.lastFocusedEditView = Integer.parseInt(str);
                }
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.KEYBOARD, "Show Keyboard Exception", e10);
        }
    }

    public /* synthetic */ void lambda$runInJuspayBrowser$3(String str, SdkTracker sdkTracker) {
        Activity activity = this.activity;
        if (activity != null) {
            try {
                View findViewById = activity.findViewById(Integer.parseInt(str));
                if (this.juspayServices.getHyperCallback() != null) {
                    this.juspayServices.getHyperCallback().onStartWaitingDialogCreated(findViewById);
                }
            } catch (Exception e10) {
                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while trying to find a view", e10);
            }
        }
    }

    public /* synthetic */ void lambda$runInJuspayBrowser$4(String str, String str2, SdkTracker sdkTracker) {
        try {
            if (this.juspayServices.getHyperCallback() != null) {
                this.juspayServices.getHyperCallback().onEvent(new JSONObject(str), new JuspayResponseHandler() { // from class: in.juspay.hypersdk.core.DuiInterface.2
                    final /* synthetic */ String val$cb;
                    final /* synthetic */ SdkTracker val$sdkTracker;

                    public AnonymousClass2(String str22, SdkTracker sdkTracker2) {
                        r2 = str22;
                        r3 = sdkTracker2;
                    }

                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onError(String str3) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "onError");
                            try {
                                jSONObject.put(PaymentConstants.PAYLOAD, new JSONObject(str3));
                            } catch (Exception unused) {
                                jSONObject.put(PaymentConstants.PAYLOAD, str3);
                            }
                            DuiInterface.this.invokeCallbackInDUIWebview(r2, jSONObject.toString());
                        } catch (Exception e10) {
                            r3.trackAndLogException(DuiInterface.LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e10);
                        }
                    }

                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onResponse(Bundle bundle) {
                        onResponse(Utils.toJSON(bundle).toString());
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                    }

                    @Override // in.juspay.hypersdk.data.JuspayResponseHandler
                    public void onResponse(String str3) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "onResponse");
                            try {
                                jSONObject.put(PaymentConstants.PAYLOAD, new JSONObject(str3));
                            } catch (Exception unused) {
                                jSONObject.put(PaymentConstants.PAYLOAD, str3);
                            }
                            DuiInterface.this.invokeCallbackInDUIWebview(r2, jSONObject.toString());
                        } catch (Exception e10) {
                            r3.trackException(LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception while manipulating JSON", e10);
                        }
                    }
                });
            }
        } catch (Exception e10) {
            sdkTracker2.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "Exception in onEvent handler", e10);
        }
    }

    public /* synthetic */ void lambda$runInJuspayWebView$5(String str, JuspayWebView juspayWebView) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2056769213:
                if (str.equals("requestPhoneKeyboardShow")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1576267742:
                if (str.equals("requestNumericKeyboardShow")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1326530834:
                if (str.equals("requestPasswordKeyboardShow")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1241591313:
                if (str.equals("goBack")) {
                    c10 = 3;
                    break;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c10 = 4;
                    break;
                }
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1275285273:
                if (str.equals("loadFirstPage")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                juspayWebView.requestPhoneKeyboardShow();
                return;
            case 1:
                juspayWebView.requestNumericKeyboardShow();
                return;
            case 2:
                juspayWebView.requestPasswordKeyboardShow();
                return;
            case 3:
                juspayWebView.goBack();
                return;
            case 4:
                PaymentUtils.refreshPage(juspayWebView);
                return;
            case 5:
                juspayWebView.goForward();
                return;
            case 6:
                Godel godel = this.godelManager;
                if (godel != null) {
                    godel.loadPage();
                    return;
                }
                return;
            default:
                this.juspayServices.getSdkTracker().trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.RUN_IN_JUSPAY_WEBVIEW, "missing", str);
                return;
        }
    }

    public /* synthetic */ void lambda$suppressKeyboard$8() {
        Activity activity = this.activity;
        if (activity != null) {
            activity.getWindow().setSoftInputMode(3);
        }
    }

    private void trackWebViewEvent(String str) {
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", str, "message", "Received event from web view.");
    }

    @JavascriptInterface
    public void addDataToSharedPrefs(String str, String str2) {
        KeyValueStore.write(this.juspayServices, str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @JavascriptInterface
    public void attach(String str, String str2, String str3) {
        char c10;
        JuspayDuiHook createSmsReceiverForConsent;
        Map<String, String> map;
        if (!isHookSupported(str)) {
            JuspayLogger.e(LOG_TAG, "Unsupported hook: " + str);
            return;
        }
        try {
            detach(new String[]{str});
            switch (str.hashCode()) {
                case -1102737597:
                    if (str.equals(PaymentConstants.NETWORK_STATUS)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1031869708:
                    if (str.equals(PaymentConstants.SMS_CONSENT)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -901079619:
                    if (str.equals(PaymentConstants.SMS_RECEIVE)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -74735600:
                    if (str.equals(PaymentConstants.SMS_RETRIEVER)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1205336831:
                    if (str.equals(PaymentConstants.DELIVER_SMS)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2031367170:
                    if (str.equals(PaymentConstants.SEND_SMS)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                createSmsReceiverForConsent = this.juspayServices.getSmsServices().createSmsReceiverForConsent();
            } else if (c10 == 1) {
                createSmsReceiverForConsent = this.juspayServices.getSmsServices().createSMSReceiver();
            } else if (c10 == 2) {
                createSmsReceiverForConsent = PaymentUtils.getConnectivityReceiver(this.juspayServices);
            } else if (c10 == 3) {
                createSmsReceiverForConsent = this.juspayServices.getSmsServices().createSendSMSReceiver();
            } else if (c10 == 4) {
                createSmsReceiverForConsent = this.juspayServices.getSmsServices().createDeliveredSMSReceiver();
            } else if (c10 != 5) {
                this.juspayServices.sdkDebug(LOG_TAG, "Unknown Hook: ".concat(str));
                createSmsReceiverForConsent = null;
            } else {
                createSmsReceiverForConsent = this.juspayServices.getSmsServices().createSmsRetriever();
            }
            if (createSmsReceiverForConsent == null || this.activity == null) {
                this.juspayServices.sdkDebug(LOG_TAG, "Nothing to attach");
                return;
            }
            this.listenerMap.put(str, createSmsReceiverForConsent);
            if (PaymentConstants.SMS_RETRIEVER.equals(str)) {
                map = this.callBackMapper;
                str = str + SmsEventInterface.RetrieverEvents.ON_ATTACH;
            } else {
                map = this.callBackMapper;
            }
            map.put(str, str3);
            createSmsReceiverForConsent.attach(this.activity);
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while retrieving arguments", e10);
        }
    }

    @JavascriptInterface
    public void attachMerchantView(int i10, String str) {
        if (this.juspayServices.getHyperCallback() != null) {
            ExecutorManager.runOnMainThread(new m(this, i10, str));
        }
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    @JavascriptInterface
    public String checkPermission(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : strArr) {
                jSONObject.put(str.replace("android.permission.", HttpUrl.FRAGMENT_ENCODE_SET), Utils.checkIfGranted(this.juspayServices, str));
            }
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.READ_SMS_PERMISSION, "Error while inserting in json", e10);
        }
        return jSONObject.toString();
    }

    @JavascriptInterface
    public String checkReadSMSPermission() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("android.permission.READ_SMS".replace("android.permission.", HttpUrl.FRAGMENT_ENCODE_SET), Utils.checkIfGranted(this.juspayServices, "android.permission.READ_SMS"));
            jSONObject.put("android.permission.RECEIVE_SMS".replace("android.permission.", HttpUrl.FRAGMENT_ENCODE_SET), Utils.checkIfGranted(this.juspayServices, "android.permission.RECEIVE_SMS"));
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.READ_SMS_PERMISSION, "Error while inserting in json", e10);
        }
        return jSONObject.toString();
    }

    public void clearMerchantViews(Activity activity) {
        if (activity == null) {
            return;
        }
        ExecutorManager.runOnMainThread(new i(3, this, activity));
    }

    @JavascriptInterface
    public void closeBrowser(String str) {
        reset();
    }

    @JavascriptInterface
    public void detach(String[] strArr) {
        JuspayDuiHook juspayDuiHook;
        for (String str : strArr) {
            if (this.listenerMap.containsKey(str) && this.activity != null) {
                if ((this.listenerMap.get(str) instanceof JuspayDuiHook) && (juspayDuiHook = (JuspayDuiHook) this.listenerMap.get(str)) != null) {
                    juspayDuiHook.detach(this.activity);
                }
                this.listenerMap.remove(str);
            }
        }
    }

    @JavascriptInterface
    public void doHandShake(String str, String str2) {
        try {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, "dui_interface_do_handshake", "Doing handshake with following parameters: " + str);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("packageName");
            String string2 = jSONObject.getString("className");
            int i10 = jSONObject.getInt("code");
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(PaymentConstants.PAYLOAD));
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject2.getString(next));
            }
            MPINUtil.communicate(string, string2, i10, bundle, this.juspayServices, str2);
        } catch (Exception e10) {
            MPINUtil.reportBindFailure(-1, this.juspayServices, str2);
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception at doHandShake", e10);
        }
    }

    @JavascriptInterface
    public String execute(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (!this.listenerMap.containsKey(str) || this.activity == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            JuspayDuiHook juspayDuiHook = (JuspayDuiHook) this.listenerMap.get(str);
            if (juspayDuiHook == null) {
                return "__failed";
            }
            if (PaymentConstants.SMS_RETRIEVER.equals(str)) {
                if ("getOtp".equals(str2)) {
                    this.callBackMapper.put(PaymentConstants.SMS_RETRIEVER + SmsEventInterface.RetrieverEvents.ON_RECEIVE, str4);
                } else if ("cancel".equals(str2)) {
                    this.callBackMapper.put(PaymentConstants.SMS_RETRIEVER + SmsEventInterface.RetrieverEvents.ON_RECEIVE, null);
                }
            }
            return juspayDuiHook.execute(this.activity, str2, jSONObject);
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while executing " + str2 + " with args " + str3, e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @JavascriptInterface
    public String fetchFromInbox(String str) {
        return this.juspayServices.getSmsServices().fetchSms(str, "inbox", null);
    }

    @JavascriptInterface
    public void fetchSMS(String str, String str2, String str3, String str4) {
        invokeCallbackInDUIWebview(str4, this.juspayServices.getSmsServices().fetchSms(str, str2, str3));
    }

    @JavascriptInterface
    public String findViewType(String str) {
        Activity activity;
        try {
            View findViewById = this.juspayServices.getContainer() != null ? this.juspayServices.getContainer().findViewById(Integer.parseInt(str)) : null;
            if (findViewById == null && (activity = this.activity) != null) {
                findViewById = activity.findViewById(Integer.parseInt(str));
            }
            return findViewById != null ? findViewById.getClass().getName() : HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @JavascriptInterface
    public String getClipboardItems() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @JavascriptInterface
    public String getConfigVariables() {
        try {
            return PaymentUtils.getConfigVariableDeclarations(this.juspayServices.getContext(), this.juspayServices.getSessionInfo());
        } catch (JSONException e10) {
            JuspayLogger.e(LOG_TAG, HttpUrl.FRAGMENT_ENCODE_SET, e10);
            return "var clientId = null;var juspayDeviceId = null;var juspayAndroidId = null;var godelRemotesVersion = null;var godelVersion = null;var buildVersion = null;var os_version = null;";
        }
    }

    @JavascriptInterface
    public String getDataFromSharedPrefs(String str, String str2) {
        return KeyValueStore.read(this.juspayServices, str, str2);
    }

    @JavascriptInterface
    public String getIndexBundleHash(String str) {
        String replace = str.replace(".zip", ".jsa");
        try {
            return this.remoteAssetService.getMetadata(replace.substring(replace.lastIndexOf("/") + 1).replace(".zip", ".jsa")).getString(PaymentConstants.ATTR_HASH_IN_DISK);
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "exception during IndexBundleHash", e10);
            return null;
        }
    }

    @JavascriptInterface
    public String getKeysInSharedPrefs() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = KeyValueStore.getAll(this.juspayServices).keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray.toString();
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.SHARED_PREF, "Exception while getting all keys from shared prefs", e10);
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    @JavascriptInterface
    public String getNetworkType() {
        return this.sessionInfo.getNetworkInfo();
    }

    @JavascriptInterface
    public String getPackageInfo(String str) {
        try {
            PackageInfo packageInfo = this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packageName", packageInfo.packageName);
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", packageInfo.versionCode);
            return jSONObject.toString();
        } catch (Exception e10) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.DEBUG, Labels.System.JBRIDGE, "Exception at getPackageInfo", e10);
            return "{}";
        }
    }

    @JavascriptInterface
    public String getPaymentDetails() {
        return this.juspayServices.getPaymentSessionInfo().getPaymentDetails().toString();
    }

    @JavascriptInterface
    public float getPixels() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    @JavascriptInterface
    public int getResourceIdentifier(String str, String str2) {
        try {
            return this.context.getResources().getIdentifier(str, str2, this.context.getPackageName());
        } catch (Exception unused) {
            return 0;
        }
    }

    @JavascriptInterface
    public String getSessionAttribute(String str) {
        return getSessionAttribute(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @JavascriptInterface
    public String getSessionDetails() {
        return this.juspayServices.getPaymentSessionInfo().getSessionDetails().toString();
    }

    @Override // in.juspay.hypersdk.core.JsInterface
    @JavascriptInterface
    public String getSessionInfo() {
        this.juspayServices.getPaymentSessionInfo().createSessionDataMap();
        return this.sessionInfo.getSessionData().toString();
    }

    public SmsEventInterface getSmsEventInterface() {
        return new SmsEventInterface() { // from class: in.juspay.hypersdk.core.DuiInterface.1
            public AnonymousClass1() {
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onActivityResultEvent(@NonNull String str) {
                DuiInterface duiInterface = DuiInterface.this;
                duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_CONSENT), str);
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSentReceiverEvent(int i10) {
                StringBuilder sb2;
                String str;
                String sb3;
                if (DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS) != null) {
                    String str2 = "window.callUICallback(\"" + DuiInterface.this.callBackMapper.get(PaymentConstants.SEND_SMS);
                    if (i10 != -1) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        sb3 = jr.h.r(str2, "\", \"Unable to Send SMS\", \"837\")");
                                        DuiInterface.this.invokeFnInDUIWebview(sb3);
                                    } else {
                                        Toast.makeText(DuiInterface.this.context, "SMS NO SERVICE", 0).show();
                                        sb2 = new StringBuilder();
                                        sb2.append(str2);
                                        str = "\", \"No service\", \"838\")";
                                    }
                                } else {
                                    Toast.makeText(DuiInterface.this.context, "SMS NULL PDU", 0).show();
                                    sb2 = new StringBuilder();
                                    sb2.append(str2);
                                    str = "\", \"Null PDU\", \"839\")";
                                }
                            } else {
                                Toast.makeText(DuiInterface.this.context, "SMS RADIO OFF", 0).show();
                                sb2 = new StringBuilder();
                                sb2.append(str2);
                                str = "\", \"Radio off\", \"840\")";
                            }
                        } else {
                            Toast.makeText(DuiInterface.this.context, "SMS GENERIC FAILURE", 0).show();
                            sb2 = new StringBuilder();
                            sb2.append(str2);
                            str = "\", \"Generic failure\", \"837\")";
                        }
                    } else {
                        Toast.makeText(DuiInterface.this.context, "SMS SENT", 0).show();
                        sb2 = new StringBuilder();
                        sb2.append(str2);
                        str = "\", \"SUCCESS\")";
                    }
                    sb2.append(str);
                    sb3 = sb2.toString();
                    DuiInterface.this.invokeFnInDUIWebview(sb3);
                }
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsConsentEvent(@NonNull Intent intent, int i10, Bundle bundle) {
                DuiInterface.this.juspayServices.startActivityForResult(intent, i10, bundle);
                DuiInterface.this.invokeFnInDUIWebview("onSMSConsentShown", "{ }");
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsReceiverEvent(@NonNull String str) {
                DuiInterface duiInterface = DuiInterface.this;
                duiInterface.invokeCallbackInDUIWebview(duiInterface.callBackMapper.get(PaymentConstants.SMS_RECEIVE), str);
            }

            @Override // in.juspay.hypersmshandler.SmsEventInterface
            public void onSmsRetrieverEvent(@NonNull SmsEventInterface.RetrieverEvents retrieverEvents, @NonNull String str) {
                DuiInterface duiInterface;
                Map<String, String> map;
                StringBuilder sb2;
                SmsEventInterface.RetrieverEvents retrieverEvents2;
                int i10 = AnonymousClass3.$SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents[retrieverEvents.ordinal()];
                if (i10 == 1) {
                    duiInterface = DuiInterface.this;
                    map = duiInterface.callBackMapper;
                    sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    retrieverEvents2 = SmsEventInterface.RetrieverEvents.ON_ATTACH;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        DuiInterface duiInterface2 = DuiInterface.this;
                        Map<String, String> map2 = duiInterface2.callBackMapper;
                        StringBuilder sb3 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                        SmsEventInterface.RetrieverEvents retrieverEvents3 = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
                        sb3.append(retrieverEvents3);
                        duiInterface2.invokeCallbackInDUIWebview(map2.get(sb3.toString()), str);
                        if ("TIMEOUT".equals(str)) {
                            return;
                        }
                        DuiInterface.this.callBackMapper.put(PaymentConstants.SMS_RETRIEVER + retrieverEvents3, null);
                        return;
                    }
                    duiInterface = DuiInterface.this;
                    map = duiInterface.callBackMapper;
                    sb2 = new StringBuilder(PaymentConstants.SMS_RETRIEVER);
                    retrieverEvents2 = SmsEventInterface.RetrieverEvents.ON_RECEIVE;
                }
                sb2.append(retrieverEvents2);
                duiInterface.invokeCallbackInDUIWebview(map.get(sb2.toString()), str);
            }
        };
    }

    @JavascriptInterface
    public void invokeCallbackInACSWebview(String str, String str2) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("window.__PROXY_FN['%s'](atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @Override // in.juspay.hyper.core.CallbackInvoker
    @JavascriptInterface
    public void invokeCallbackInDUIWebview(String str, String str2) {
        this.juspayServices.getDynamicUI().addJsToWebView(String.format("window.callUICallback('%s',atob('%s'));", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @JavascriptInterface
    public void invokeCustomFnInDUIWebview(String str) {
        this.juspayServices.getDynamicUI().addJsToWebView(str);
    }

    @Override // in.juspay.hyper.core.CallbackInvoker
    @JavascriptInterface
    public void invokeFnInDUIWebview(String str) {
        invokeCustomFnInDUIWebview(str);
    }

    @JavascriptInterface
    public void invokeInACSWebview(String str, String str2) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("javascript:window.onAcsFunctionCalled('%s',atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @JavascriptInterface
    public String isAppInstalled(String str) {
        try {
            this.juspayServices.getContext().getPackageManager().getPackageInfo(str, 128);
            return "true";
        } catch (PackageManager.NameNotFoundException unused) {
            return "false";
        }
    }

    @JavascriptInterface
    public String isDeviceSecure() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.context.getSystemService("keyguard");
            return keyguardManager != null ? keyguardManager.isDeviceSecure() ? "SECURE" : "NOT_SECURE" : "UNKNOWN";
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while checking KeyguardManager.isDeviceSecure()", e10);
            return "UNKNOWN";
        }
    }

    @JavascriptInterface
    public boolean isHookSupported(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1102737597:
                if (str.equals(PaymentConstants.NETWORK_STATUS)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1031869708:
                if (str.equals(PaymentConstants.SMS_CONSENT)) {
                    c10 = 1;
                    break;
                }
                break;
            case -901079619:
                if (str.equals(PaymentConstants.SMS_RECEIVE)) {
                    c10 = 2;
                    break;
                }
                break;
            case -74735600:
                if (str.equals(PaymentConstants.SMS_RETRIEVER)) {
                    c10 = 3;
                    break;
                }
                break;
            case 1205336831:
                if (str.equals(PaymentConstants.DELIVER_SMS)) {
                    c10 = 4;
                    break;
                }
                break;
            case 2031367170:
                if (str.equals(PaymentConstants.SEND_SMS)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    @JavascriptInterface
    public boolean isOnline() {
        NetworkInfo activeNetworkInfo;
        Activity activity = this.activity;
        ConnectivityManager connectivityManager = activity != null ? (ConnectivityManager) activity.getSystemService("connectivity") : null;
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @JavascriptInterface
    public void loadUrl(String str, String str2) {
        Godel godel = this.godelManager;
        if (godel == null || str == null) {
            return;
        }
        ExecutorManager.runOnMainThread(new p(str2, godel.getJuspayWebView(), str));
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        String str;
        SdkTracker sdkTracker;
        String name;
        String str2;
        for (Object obj : this.listenerMap.values()) {
            if ((obj instanceof ResultAwaitingDuiHook) && ((ResultAwaitingDuiHook) obj).onActivityResult(i10, i11, intent)) {
                sdkTracker = this.sdkTracker;
                name = obj.getClass().getName();
                str2 = "Result consumed by ResultAwaitingDuiHook ";
            } else if ((obj instanceof OnResultHook) && ((OnResultHook) obj).onActivityResult(i10, i11, intent)) {
                sdkTracker = this.sdkTracker;
                name = obj.getClass().getName();
                str2 = "Result consumed by OnResultHook ";
            }
            sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, str2.concat(name));
            return;
        }
        if (intent != null) {
            JSONObject json = Utils.toJSON(intent.getExtras());
            String encodeToString = Base64.encodeToString(json.toString().getBytes(), 2);
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, "Passing data to micro-app. Data is " + json);
            StringBuilder q10 = da.e.q("window.onActivityResult('", i10, "', '", i11, "', atob('");
            q10.append(encodeToString);
            q10.append("'))");
            str = q10.toString();
        } else {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.JBRIDGE, Labels.Android.ON_ACTIVITY_RESULT, "Got empty data in onActivityResult. Passing callback to micro-app.");
            str = "window.onActivityResult('" + i10 + "', '" + i11 + "', '{}')";
        }
        invokeFnInDUIWebview(str);
    }

    @JavascriptInterface
    public void onDuiReady() {
        ExecutorManager.runOnMainThread(new o(this, 1));
    }

    @Override // in.juspay.hypersdk.core.HyperJsInterface
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            Object obj = this.listenerMap.get(PaymentConstants.REQUEST_PERMISSION_PREFIX + i10);
            if (obj instanceof String) {
                JSONObject jSONObject = new JSONObject();
                for (int i11 = 0; i11 < strArr.length; i11++) {
                    jSONObject.put(strArr[i11].replace("android.permission.", HttpUrl.FRAGMENT_ENCODE_SET), iArr[i11] == 0);
                }
                invokeCallbackInDUIWebview((String) obj, jSONObject.toString());
                return;
            }
            if (!(obj instanceof Handler.Callback)) {
                JuspayLogger.e(LOG_TAG, "callback instance not understandable");
                return;
            }
            Message obtain = Message.obtain();
            obtain.obj = iArr;
            ((Handler.Callback) obj).handleMessage(obtain);
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.ON_REQUEST_PERMISSION_RESULT, "Error while inserting in json", e10);
        }
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2) {
        if (URLUtil.isValidUrl(str2)) {
            onWebViewReady(str, str2, null);
        } else {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ON_WEBVIEW_READY, "valid_url", Boolean.FALSE);
        }
    }

    @JavascriptInterface
    public void onWebViewReleased() {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.onDuiReleased();
            this.godelManager = null;
        }
    }

    @JavascriptInterface
    public void openAppWithExplicitIntent(String str, String str2, String str3, int i10, int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("data", str3);
            Intent intent = new Intent();
            if (i11 >= 0) {
                intent.setFlags(i11);
            }
            intent.putExtras(bundle);
            intent.setComponent(new ComponentName(str, str2));
            this.juspayServices.startActivityForResult(intent, Math.max(i10, -1), null);
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "on method openAppWithExplicitIntent: ", e10);
        }
    }

    @JavascriptInterface
    public void refreshPage() {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        PaymentUtils.refreshPage(godel.getJuspayWebView());
    }

    @JavascriptInterface
    public void requestKeyboardHide() {
        ExecutorManager.runOnMainThread(new o(this, 0));
    }

    @JavascriptInterface
    public void requestKeyboardShow() {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        JuspayWebView juspayWebView = godel.getJuspayWebView();
        InputMethodManager inputMethodManager = (InputMethodManager) this.context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(juspayWebView, 1);
        }
    }

    public void requestPermission(String[] strArr, String str, Handler.Callback callback) {
        this.juspayServices.requestPermission(strArr, Integer.parseInt(str));
        this.listenerMap.put(PaymentConstants.REQUEST_PERMISSION_PREFIX + str, callback);
    }

    @JavascriptInterface
    public void requestSMSPermission(String str) {
        requestPermission(new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"}, String.valueOf(7), str);
    }

    public void reset() {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : this.listenerMap.keySet()) {
                if (this.listenerMap.get(str) instanceof JuspayDuiHook) {
                    arrayList.add(str);
                }
            }
            detach((String[]) arrayList.toArray(new String[0]));
            Godel godel = this.godelManager;
            if (godel != null) {
                godel.onDuiReleased();
                this.godelManager = null;
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Exception while removing Dui Hooks", e10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0058. Please report as an issue. */
    @JavascriptInterface
    public void runInJuspayBrowser(String str, String str2, String str3) {
        String str4;
        Runnable eVar;
        JSONObject jSONObject;
        JSONObject bundleParameters;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1895485031:
                if (str.equals("onHtmlReady")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1881018714:
                if (str.equals("onBundleLoaded")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1349867671:
                if (str.equals("onError")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1349761029:
                if (str.equals("onEvent")) {
                    c10 = 3;
                    break;
                }
                break;
            case -245602922:
                if (str.equals("onStartWaitingDialogCreated")) {
                    c10 = 4;
                    break;
                }
                break;
            case 137650334:
                if (str.equals("onScriptError")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                trackWebViewEvent(Labels.HyperSdk.ON_HTML_READY);
                this.juspayServices.getDynamicUI().setWebViewActive();
                return;
            case 1:
                str4 = "loaded";
                updateLoaded(str2, str4);
                return;
            case 2:
                str4 = "not_loaded";
                updateLoaded(str2, str4);
                return;
            case 3:
                if (!this.juspayServices.isPrefetch()) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException e10) {
                        sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "error while dealing with json onEvent", e10);
                    }
                    if (jSONObject.optString("event", HttpUrl.FRAGMENT_ENCODE_SET).equals("onJOSReady")) {
                        trackWebViewEvent(Labels.HyperSdk.ON_JOS_READY);
                        if (this.juspayServices.getBundleParameters() != null) {
                            JuspayServices juspayServices = this.juspayServices;
                            juspayServices.onMerchantEvent(Labels.HyperSdk.INITIATE, juspayServices.getBundleParameters());
                            return;
                        }
                        return;
                    }
                    if (jSONObject.optString(LogCategory.ACTION, HttpUrl.FRAGMENT_ENCODE_SET).equals("DUI_READY")) {
                        trackWebViewEvent(Labels.HyperSdk.DUI_READY);
                    }
                    eVar = new e(this, str2, str3, sdkTracker, 4);
                    ExecutorManager.runOnMainThread(eVar);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    if (Objects.equals(jSONObject2.optString("event"), "prefetch_result")) {
                        JuspayServices juspayServices2 = this.juspayServices;
                        Objects.requireNonNull(juspayServices2);
                        ExecutorManager.runOnMainThread(new n(juspayServices2, 0));
                    }
                    if (jSONObject2.getString("event").equals("onJOSReady") && (bundleParameters = this.juspayServices.getBundleParameters()) != null) {
                        invokeCustomFnInDUIWebview(String.format("window.onMerchantEvent('%s',atob('%s'));", Labels.HyperSdk.PREFETCH, Base64.encodeToString(bundleParameters.toString().getBytes(), 2)));
                        return;
                    }
                    return;
                } catch (JSONException e11) {
                    sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, a3.a.f("error while dealing with json onEvent ", str2), e11);
                    return;
                }
            case 4:
                eVar = new p(this, str2, sdkTracker, 1);
                ExecutorManager.runOnMainThread(eVar);
                return;
            case 5:
                try {
                    JSONObject jSONObject3 = new JSONObject(str2);
                    sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "error", Labels.HyperSdk.ON_SCRIPT_ERROR, "message", String.format("Failed to load script for app: '%s', due to error: %s", jSONObject3.optString("app", HttpUrl.FRAGMENT_ENCODE_SET), jSONObject3.optString("serializedError", HttpUrl.FRAGMENT_ENCODE_SET)));
                    return;
                } catch (JSONException e12) {
                    sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "error while dealing with json onEvent", e12);
                    return;
                }
            default:
                sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.HyperSdk.RUN_IN_JUSPAY_BROWSER, "missing", str);
                return;
        }
    }

    @JavascriptInterface
    public void runInJuspayWebView(String str) {
        Godel godel = this.godelManager;
        if (godel == null) {
            return;
        }
        ExecutorManager.runOnMainThread(new p(this, str, godel.getJuspayWebView(), 3));
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @JavascriptInterface
    public void setCardBrand(String str) {
        this.juspayServices.getPaymentSessionInfo().setPaymentDetails("card_brand", str);
    }

    @JavascriptInterface
    public void setConfig(String str) {
        if (this.godelManager == null) {
            return;
        }
        try {
            this.godelManager.setConfig(new JSONObject(str));
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.JBRIDGE, "Error while capturing config json", e10);
        }
    }

    public void setContainer(ViewGroup viewGroup) {
        this.container = viewGroup;
    }

    @JavascriptInterface
    public void setIsRupaySupportedAdded(boolean z10) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.setIsRupaySupportedAdded(z10);
        }
    }

    @JavascriptInterface
    public void setSessionDetails(String str, String str2) {
        this.juspayServices.getPaymentSessionInfo().addToSessionDetails(str, str2);
    }

    @JavascriptInterface
    public void setSessionInfo() {
    }

    @JavascriptInterface
    public String shouldShowRequestPermissionRationale(String str) {
        try {
            Activity activity = this.activity;
            if (activity != null) {
                return String.valueOf(activity.shouldShowRequestPermissionRationale(str));
            }
            return null;
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.PERMISSION, "Exception while checking shouldShowRequestPermissionRationale", e10);
            return null;
        }
    }

    @JavascriptInterface
    public void storeCookies() {
        CookieSyncManager.getInstance().sync();
    }

    @JavascriptInterface
    public void suppressKeyboard() {
        ExecutorManager.runOnMainThread(new o(this, 2));
    }

    @JavascriptInterface
    public void updateLoaded(String str, String str2) {
        Exception exc;
        SdkTracker sdkTracker = this.juspayServices.getSdkTracker();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("fileName")) {
                str3 = jSONObject.getString("fileName");
            }
            String str4 = str3;
            try {
                JSONObject jSONObject2 = new JSONObject(getDataFromSharedPrefs(PaymentConstants.JP_HASH_AND_STATUS, "{}"));
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject2.has(str4)) {
                    jSONObject3 = jSONObject2.getJSONObject(str4);
                } else {
                    sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.CRITICAL, Labels.HyperSdk.AUTO_FALLBACK, "loaded", "hash doesn't have a filename");
                }
                jSONObject3.put("status", str2);
                jSONObject2.put(str4, jSONObject3);
                addDataToSharedPrefs(PaymentConstants.JP_HASH_AND_STATUS, jSONObject2.toString());
                JuspayLogger.d(LOG_TAG, "udpateLoaded: ");
            } catch (Exception e10) {
                str3 = str4;
                exc = e10;
                sdkTracker.trackAndLogException(LOG_TAG, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.HyperSdk.AUTO_FALLBACK, a3.a.f("Exception while updating the loaded status for file ", str3), exc);
            }
        } catch (Exception e11) {
            exc = e11;
        }
    }

    @JavascriptInterface
    public void invokeFnInDUIWebview(String str, String str2) {
        this.juspayServices.getDynamicUI().addJsToWebView(String.format("window[\"onEvent'\"]('%s',atob('%s'))", str, Base64.encodeToString(str2.getBytes(), 2)));
    }

    @JavascriptInterface
    public void invokeInACSWebview(String str, String str2, String str3) {
        if (this.godelManager == null) {
            return;
        }
        this.godelManager.getJuspayWebView().addJsToWebView(String.format("javascript:window.onAcsFunctionCalled('%s',atob('%s'),'%s')", str, Base64.encodeToString(str2.getBytes(), 2), str3));
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2, String str3) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.onBrowserReady(this.activity, str2, str3, str);
        }
    }

    @JavascriptInterface
    public void requestKeyboardShow(String str) {
        ExecutorManager.runOnMainThread(new i(2, this, str));
    }

    @JavascriptInterface
    public void requestPermission(String[] strArr, String str, String str2) {
        this.juspayServices.requestPermission(strArr, Integer.parseInt(str));
        this.listenerMap.put(PaymentConstants.REQUEST_PERMISSION_PREFIX + str, str2);
    }

    @JavascriptInterface
    public void runInJuspayWebView(String str, String str2) {
    }

    @JavascriptInterface
    public void invokeFnInDUIWebview(String str, String str2, String str3) {
        Godel godel = this.godelManager;
        if (godel != null) {
            godel.getAcsInterface().invoke(str, str2, str3);
        }
    }

    @JavascriptInterface
    public void onWebViewReady(String str, String str2, String str3, String str4) {
        if (str4.equalsIgnoreCase("base64")) {
            try {
                byte[] decode = Base64.decode(str3, 2);
                Godel godel = this.godelManager;
                if (godel != null) {
                    godel.onBrowserReady(this.activity, str2, new String(decode), "text/html", "UTF-8", null, str);
                    return;
                }
                return;
            } catch (Exception e10) {
                this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.ON_WEBVIEW_READY, "Exception while trying to decode content", e10);
                return;
            }
        }
        Godel godel2 = this.godelManager;
        if (godel2 != null) {
            godel2.onBrowserReady(this.activity, str2, str3, "text/html", "UTF-8", null, str);
        }
    }
}
