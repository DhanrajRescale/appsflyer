package in.juspay.hypersdk.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import in.juspay.hyper.core.BridgeComponents;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JsCallback;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.mystique.Callback;
import in.juspay.hypersdk.mystique.DUIWebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class DynamicUI implements JsCallback {
    private Activity activity;

    @NonNull
    private final AndroidInterface androidInterface;

    @NonNull
    private Context appContext;

    @NonNull
    private final String baseContent;

    @NonNull
    private final BridgeComponents bridgeComponents;
    private WebView browser;

    @NonNull
    private final Callback callback;
    private FrameLayout container;

    @NonNull
    private HashMap<String, ViewGroup> fragments;

    @NonNull
    private final InflateView inflateView;

    @NonNull
    final Map<String, Object> jsInterfaces;

    @NonNull
    private final DuiLogger mLogger;

    @NonNull
    private final Renderer renderer;

    @NonNull
    private final Map<String, Object> screenMap;

    @NonNull
    private final HashMap<String, JSONArray> storedFunctions;

    @NonNull
    private final AtomicReference<WebViewState> webViewState;
    private Exception webViewCrashException = null;

    @NonNull
    private final HashMap<String, Object> globalState = new HashMap<>();
    private boolean isInitiated = false;

    /* renamed from: in.juspay.hypersdk.core.DynamicUI$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends WebChromeClient {
        public AnonymousClass1() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }
    }

    /* renamed from: in.juspay.hypersdk.core.DynamicUI$2 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersdk$core$WebViewState;

        static {
            int[] iArr = new int[WebViewState.values().length];
            $SwitchMap$in$juspay$hypersdk$core$WebViewState = iArr;
            try {
                iArr[WebViewState.Broken.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Null.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Created.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$in$juspay$hypersdk$core$WebViewState[WebViewState.Active.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DynamicUI(@NonNull Context context, @NonNull DuiLogger duiLogger, @NonNull Callback callback, @NonNull BridgeComponents bridgeComponents, String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        this.jsInterfaces = hashMap;
        this.mLogger = duiLogger;
        this.callback = callback;
        this.bridgeComponents = bridgeComponents;
        this.webViewState = new AtomicReference<>(WebViewState.Null);
        this.storedFunctions = new HashMap<>();
        if (context instanceof Activity) {
            this.activity = (Activity) context;
        }
        this.appContext = context.getApplicationContext();
        this.screenMap = new HashMap();
        this.fragments = new HashMap<>();
        AndroidInterface androidInterface = new AndroidInterface(this);
        this.androidInterface = androidInterface;
        this.renderer = new Renderer(this);
        this.inflateView = new InflateJSON(this);
        this.baseContent = str == null ? "<html>\n<head>\n    <title>Hyper OS</title>\n</head>\n<body>\n</body>\n<script type=\"text/javascript\">\nwindow.bootLoad = function(){\n    window.DUIGatekeeper = JBridge;\n    var headID = document.getElementsByTagName(\"head\")[0];\n    var newScript = document.createElement('script');\n    newScript.type = 'text/javascript';\n    newScript.id = 'boot_loader';\n    var bundleLoadStart = Date.now();\n    var logViaTracker = function() {\n       var bundleLoadEnd = Date.now();\n       window.__osStart = Date.now();\n       var loadLatency = bundleLoadEnd - bundleLoadStart;\n       var obj = {};\n       obj[\"os_bundle_load\"] = {\"bundle_load_start\":bundleLoadStart,\"bundle_load_end\":bundleLoadEnd,\"bundle_load_latency\":loadLatency};\n       window.__osBundleLoadLogLine = obj;\n    }\n    window.onerror = function (message, src, lno, cno, err) {\n       console.log('ERROR WHILE LOADING SCRIPT');\n       const errorObj = {};\n       errorObj.message = typeof message === 'string' ? message : '';\n       errorObj.source = typeof src === 'string' ? src : '';\n       errorObj.lineNo = typeof lno === 'number' ? lno : -1;\n       errorObj.columnNo = typeof cno === 'number' ? cno : -1;\n       if (typeof err === 'object') {\n           errorObj.stackTrace = typeof err.stack === 'string' ? err.stack : '';\n       }\n       window.scriptError = errorObj;\n       var args = JSON.stringify({ app: \"in.juspay.hyperos\", serializedError: JSON.stringify(errorObj)});\n       JBridge.runInJuspayBrowser(\"onScriptError\", args, \"\");\n    };\n    var loadBundle = function () {\n       newScript.innerHTML = JBridge.loadFileInDUI('v1-boot_loader.jsa');\n       headID.appendChild(newScript);\n       logViaTracker();\n    }\n    loadBundle();\n    setTimeout(function () {\n       if (typeof window.onMerchantEvent !== 'function') {\n           loadBundle();\n           var retryObj = {'retry_tried': 'true'};\n           try {\n               window.Analytics._trackLifeCycle('hypersdk')('info')('bundle_load_retry')(retryObj)();\n           } catch (e) {}\n       }\n    }, 1000);\n}\nJBridge.runInJuspayBrowser(\"onHtmlReady\", \"{}\", \"\");\n </script>\n</html>" : str;
        hashMap.put("Android", androidInterface);
        hashMap.putAll(map);
        ExecutorManager.runOnMainThread(new q(this, 1));
    }

    @SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
    public void createWebView() {
        try {
            this.webViewState.set(WebViewState.Created);
            this.browser = new WebView(this.appContext);
            setupWebView();
            this.browser.getSettings().setJavaScriptEnabled(true);
            for (Map.Entry<String, Object> entry : this.jsInterfaces.entrySet()) {
                this.browser.addJavascriptInterface(entry.getValue(), entry.getKey());
            }
            loadBaseHtml();
            this.callback.webViewLoaded(null);
        } catch (Exception e10) {
            this.webViewState.set(WebViewState.Broken);
            this.webViewCrashException = e10;
            this.callback.webViewLoaded(e10);
        }
    }

    private String getStringStackTrace(Object obj) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : ((Exception) obj).getStackTrace()) {
            sb2.append(stackTraceElement.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public /* synthetic */ void lambda$addJavascriptInterface$1(Object obj, String str) {
        WebView webView = this.browser;
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
        this.jsInterfaces.put(str, obj);
    }

    public /* synthetic */ void lambda$addJsToWebView$0(String str) {
        Callback callback;
        StringBuilder sb2;
        try {
            WebView webView = this.browser;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            } else {
                logError("browser null, call start first");
            }
        } catch (Exception e10) {
            e = e10;
            logError("Exception :" + getStringStackTrace(e));
            callback = this.callback;
            sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
            sb2.append(getStringStackTrace(e));
            callback.onError("addJsToWebView", sb2.toString());
        } catch (OutOfMemoryError e11) {
            e = e11;
            logError("OutOfMemoryError :" + getStringStackTrace(e));
            callback = this.callback;
            sb2 = new StringBuilder(HttpUrl.FRAGMENT_ENCODE_SET);
            sb2.append(getStringStackTrace(e));
            callback.onError("addJsToWebView", sb2.toString());
        }
    }

    private void loadBaseHtml() {
        ExecutorManager.runOnMainThread(new q(this, 2));
    }

    public void loadData() {
        WebView webView = this.browser;
        if (webView != null) {
            webView.loadDataWithBaseURL(null, this.baseContent, "text/html", "utf-8", null);
        }
    }

    private void logError(String str) {
        this.mLogger.e("DynamicUI", str);
    }

    private void setupWebView() {
        WebView webView;
        WebChromeClient anonymousClass1;
        if (this.browser != null) {
            if (this.appContext.getResources().getBoolean(R.bool.godel_debuggable)) {
                webView = this.browser;
                anonymousClass1 = new WebChromeClient();
            } else {
                webView = this.browser;
                anonymousClass1 = new WebChromeClient() { // from class: in.juspay.hypersdk.core.DynamicUI.1
                    public AnonymousClass1() {
                    }

                    @Override // android.webkit.WebChromeClient
                    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                        return true;
                    }
                };
            }
            webView.setWebChromeClient(anonymousClass1);
            this.browser.setWebViewClient(new DUIWebViewClient());
        }
    }

    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void addJavascriptInterface(Object obj, String str) {
        ExecutorManager.runOnMainThread(new p(0, this, obj, str));
    }

    @Override // in.juspay.hyper.core.JsCallback
    public void addJsToWebView(String str) {
        ExecutorManager.runOnMainThread(new i(1, this, str));
    }

    public String addToContainerList(@NonNull ViewGroup viewGroup) {
        String uuid = UUID.randomUUID().toString();
        this.fragments.put(uuid, viewGroup);
        return uuid;
    }

    public void addToScreenMap(String str, Object obj) {
        this.screenMap.put(str, obj);
    }

    public String encodeUtfAndWrapDecode(String str, String str2) {
        try {
            return String.format("decodeURIComponent('%s')", URLEncoder.encode(str, "UTF-8").replace("+", "%20"));
        } catch (UnsupportedEncodingException unused) {
            JuspayLogger.e(str2, "Failed to encode using URLEncoder");
            return String.format("atob('%s')", Base64.encodeToString(str.getBytes(), 2));
        }
    }

    public Activity getActivity() {
        return this.activity;
    }

    @Keep
    public HashMap<String, JSONArray> getAllFunctions() {
        return this.storedFunctions;
    }

    @Keep
    public HashMap<String, Object> getAllGlobalState() {
        return this.globalState;
    }

    @NonNull
    public AndroidInterface getAndroidInterface() {
        return this.androidInterface;
    }

    @NonNull
    public Context getAppContext() {
        return this.appContext;
    }

    @NonNull
    public BridgeComponents getBridgeComponents() {
        return this.bridgeComponents;
    }

    public ViewGroup getContainer(String str) {
        return str == null ? this.container : this.fragments.get(str);
    }

    public Callback getErrorCallback() {
        return this.callback;
    }

    public JSONArray getFunction(String str) {
        return this.storedFunctions.get(str);
    }

    public Object getGlobalState(String str) {
        return this.globalState.get(str);
    }

    @NonNull
    public InflateView getInflateView() {
        return this.inflateView;
    }

    public DuiLogger getLogger() {
        return this.mLogger;
    }

    @NonNull
    public Renderer getRenderer() {
        return this.renderer;
    }

    public String getState() {
        return this.androidInterface.getState();
    }

    public Object getViewFromScreenName(String str) {
        if (this.screenMap.containsKey(str)) {
            return this.screenMap.get(str);
        }
        return null;
    }

    public Exception getWebViewCrashException() {
        return this.webViewCrashException;
    }

    public boolean initiate() {
        this.isInitiated = true;
        int i10 = AnonymousClass2.$SwitchMap$in$juspay$hypersdk$core$WebViewState[this.webViewState.get().ordinal()];
        if (i10 == 2) {
            ExecutorManager.runOnMainThread(new q(this, 0));
        } else if (i10 != 3) {
            if (i10 != 4) {
                return false;
            }
            addJsToWebView("window.bootLoad()");
            return true;
        }
        return true;
    }

    @Keep
    public void putFunction(String str, JSONArray jSONArray) {
        this.storedFunctions.put(str, jSONArray);
    }

    public void resetActivity() {
        this.activity = null;
        getInflateView().resetState();
    }

    public void setActivity(@NonNull Activity activity) {
        if (this.activity != activity) {
            this.fragments = new HashMap<>();
            getInflateView().resetState();
        }
        this.activity = activity;
        this.appContext = activity.getApplicationContext();
    }

    public void setContainer(FrameLayout frameLayout) {
        this.container = frameLayout;
        if (frameLayout == null || !frameLayout.isHardwareAccelerated()) {
            return;
        }
        this.container.setLayerType(2, null);
    }

    public void setGlobalState(String str, Object obj) {
        this.globalState.put(str, obj);
    }

    public void setState(String str) {
        this.androidInterface.setState(str);
    }

    public void setWebViewActive() {
        if (this.isInitiated) {
            addJsToWebView("window.bootLoad()");
        }
        this.webViewState.set(WebViewState.Active);
    }

    public void terminate() {
        if (this.browser == null) {
            logError("Browser is not present");
            return;
        }
        this.isInitiated = false;
        this.webViewState.set(WebViewState.Null);
        this.browser.loadDataWithBaseURL("http://juspay.in", "<html></html>", "text/html", "utf-8", null);
        this.browser.stopLoading();
        this.browser.destroy();
        this.browser = null;
    }
}
