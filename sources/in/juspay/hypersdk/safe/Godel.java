package in.juspay.hypersdk.safe;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import bl.d;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.search.SearchAuth;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import da.e;
import in.juspay.hyper.constants.Labels;
import in.juspay.hyper.constants.LogCategory;
import in.juspay.hyper.constants.LogLevel;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.R;
import in.juspay.hypersdk.core.AcsInterface;
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.GodelJsInterface;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.JuspayWebViewConfigurationCallback;
import in.juspay.hypersdk.core.PaymentConstants;
import in.juspay.hypersdk.core.PaymentUtils;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.hypersdk.data.KeyValueStore;
import in.juspay.hypersdk.data.PaymentSessionInfo;
import in.juspay.hypersdk.safe.Godel;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.utils.Utils;
import in.juspay.hypersdk.utils.network.NetUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vl.a;

/* loaded from: classes2.dex */
public class Godel {
    private static final String GODEL = "Godel";
    private static final String LOG_TAG = "PaymentUtils";
    private static final long ON_EXCEPTION_GODEL_OFF_STICKINESS = 86400000;

    @NonNull
    private final AcsInterface acsInterface;

    @NonNull
    private final JSONObject bundleParameters;

    @NonNull
    private JSONObject config;

    @NonNull
    private final Context context;

    @NonNull
    private final DuiInterface duiInterface;

    @NonNull
    private final JuspayServices juspayServices;

    @NonNull
    private final JuspayWebChromeClient juspayWebChromeClient;

    @NonNull
    private final JuspayWebView juspayWebView;

    @NonNull
    private final JuspayWebViewClient juspayWebViewClient;
    private final JuspayWebViewConfigurationCallback juspayWebViewConfigurationCallback;

    @NonNull
    private final PaymentSessionInfo paymentSessionInfo;
    private final JSONObject processPayload;

    @NonNull
    private final SdkTracker sdkTracker;

    @NonNull
    private final List<String> allowedDeeplinkPackages = new ArrayList();
    public boolean isRupaySupportedAdded = false;

    public Godel(@NonNull JuspayServices juspayServices) {
        Context context = juspayServices.getContext();
        this.context = context;
        this.juspayServices = juspayServices;
        Activity activity = juspayServices.getActivity();
        JuspayWebView juspayWebView = new JuspayWebView(activity != null ? activity : context);
        this.juspayWebView = juspayWebView;
        this.juspayWebViewClient = new JuspayWebViewClient(this, juspayWebView);
        this.juspayWebChromeClient = new JuspayWebChromeClient(this);
        this.acsInterface = new AcsInterface(juspayServices);
        this.juspayWebViewConfigurationCallback = juspayServices.getWebViewConfigurationCallback();
        this.sdkTracker = juspayServices.getSdkTracker();
        this.duiInterface = juspayServices.getJBridge();
        this.paymentSessionInfo = juspayServices.getPaymentSessionInfo();
        this.bundleParameters = juspayServices.getSessionInfo().getBundleParams();
        this.processPayload = juspayServices.getLastProcessPayload();
        this.config = new JSONObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[Catch: Exception -> 0x00ae, LOOP:0: B:21:0x0089->B:23:0x008f, LOOP_END, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0001, B:5:0x0009, B:9:0x003d, B:11:0x0046, B:13:0x004c, B:15:0x005a, B:17:0x0060, B:19:0x0070, B:20:0x0078, B:21:0x0089, B:23:0x008f, B:25:0x009d, B:27:0x00a7, B:33:0x0013, B:35:0x001b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[Catch: Exception -> 0x00ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ae, blocks: (B:3:0x0001, B:5:0x0009, B:9:0x003d, B:11:0x0046, B:13:0x004c, B:15:0x005a, B:17:0x0060, B:19:0x0070, B:20:0x0078, B:21:0x0089, B:23:0x008f, B:25:0x009d, B:27:0x00a7, B:33:0x0013, B:35:0x001b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.webkit.WebResourceResponse addAcsToJSFile(@androidx.annotation.NonNull android.webkit.WebResourceRequest r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull org.json.JSONObject r12, @androidx.annotation.NonNull org.json.JSONObject r13) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "POST"
            boolean r1 = r10.equals(r1)     // Catch: java.lang.Exception -> Lae
            if (r1 == 0) goto L13
            javax.net.ssl.HttpsURLConnection r9 = r8.getPostRequestConnection(r13, r12, r9)     // Catch: java.lang.Exception -> Lae
            java.io.InputStream r10 = r8.getDataAcsFromPostRequest(r9, r11)     // Catch: java.lang.Exception -> Lae
            r7 = r10
            goto L3a
        L13:
            java.lang.String r11 = "GET"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.Exception -> Lae
            if (r10 == 0) goto Lae
            java.net.URL r10 = new java.net.URL     // Catch: java.lang.Exception -> Lae
            android.net.Uri r11 = r9.getUrl()     // Catch: java.lang.Exception -> Lae
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> Lae
            r10.<init>(r11)     // Catch: java.lang.Exception -> Lae
            java.net.URLConnection r10 = r10.openConnection()     // Catch: java.lang.Exception -> Lae
            java.lang.Object r10 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r10)     // Catch: java.lang.Exception -> Lae
            java.net.URLConnection r10 = (java.net.URLConnection) r10     // Catch: java.lang.Exception -> Lae
            javax.net.ssl.HttpsURLConnection r10 = (javax.net.ssl.HttpsURLConnection) r10     // Catch: java.lang.Exception -> Lae
            java.io.InputStream r9 = r8.getDataFromGetRequest(r10, r9)     // Catch: java.lang.Exception -> Lae
            r7 = r9
            r9 = r10
        L3a:
            if (r9 != 0) goto L3d
            return r0
        L3d:
            java.lang.String r10 = r9.getContentType()     // Catch: java.lang.Exception -> Lae
            r11 = -1
            r12 = 59
            if (r10 == 0) goto L57
            int r13 = r10.indexOf(r12)     // Catch: java.lang.Exception -> Lae
            if (r13 <= r11) goto L57
            int r13 = r10.indexOf(r12)     // Catch: java.lang.Exception -> Lae
            r1 = 0
            java.lang.String r13 = r10.substring(r1, r13)     // Catch: java.lang.Exception -> Lae
            r2 = r13
            goto L58
        L57:
            r2 = r10
        L58:
            if (r10 == 0) goto L77
            int r12 = r10.indexOf(r12)     // Catch: java.lang.Exception -> Lae
            if (r12 <= r11) goto L77
            java.lang.String r11 = "charset=([\\w-_]+)"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Exception -> Lae
            java.util.regex.Matcher r10 = r11.matcher(r10)     // Catch: java.lang.Exception -> Lae
            boolean r11 = r10.find()     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto L77
            r11 = 1
            java.lang.String r10 = r10.group(r11)     // Catch: java.lang.Exception -> Lae
            r3 = r10
            goto L78
        L77:
            r3 = r0
        L78:
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> Lae
            r6.<init>()     // Catch: java.lang.Exception -> Lae
            java.util.Map r10 = r9.getHeaderFields()     // Catch: java.lang.Exception -> Lae
            java.util.Set r10 = r10.keySet()     // Catch: java.lang.Exception -> Lae
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> Lae
        L89:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Exception -> Lae
            if (r11 == 0) goto L9d
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Exception -> Lae
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Exception -> Lae
            java.lang.String r12 = r9.getHeaderField(r11)     // Catch: java.lang.Exception -> Lae
            r6.put(r11, r12)     // Catch: java.lang.Exception -> Lae
            goto L89
        L9d:
            int r4 = r9.getResponseCode()     // Catch: java.lang.Exception -> Lae
            java.lang.String r5 = r9.getResponseMessage()     // Catch: java.lang.Exception -> Lae
            if (r7 == 0) goto Lae
            android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> Lae
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> Lae
            return r9
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.safe.Godel.addAcsToJSFile(android.webkit.WebResourceRequest, java.lang.String, java.lang.String, org.json.JSONObject, org.json.JSONObject):android.webkit.WebResourceResponse");
    }

    @NonNull
    private String getAcsScript() {
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        StringBuilder r10 = e.r("window.juspayContext = {}; juspayContext['web_lab_rules'] = " + getWebLabRules(), ", ");
        r10.append(fileProviderService.readFromFile(this.juspayServices.getContext(), PaymentConstants.ACS));
        return r10.toString();
    }

    private String getConnectionData(Reader reader, int i10) {
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[i10];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, read);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private InputStream getDataAcsFromPostRequest(HttpsURLConnection httpsURLConnection, @NonNull String str) {
        try {
            if (".html".matches(str)) {
                return handleHtmlFile(httpsURLConnection);
            }
            if (!".js".matches(str) && !".jsp".matches(str)) {
                return null;
            }
            return handleJsFile(httpsURLConnection);
        } catch (Exception unused) {
            return null;
        }
    }

    private InputStream getDataFromGetRequest(@NonNull HttpsURLConnection httpsURLConnection, @NonNull WebResourceRequest webResourceRequest) {
        try {
            for (String str : webResourceRequest.getRequestHeaders().keySet()) {
                httpsURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
            httpsURLConnection.setDoOutput(false);
            return new SequenceInputStream(new ByteArrayInputStream(String.format("window.addEventListener('load', function() { if(!window.GK) { %s } });", getAcsScript()).getBytes(StandardCharsets.UTF_8)), httpsURLConnection.getInputStream());
        } catch (Exception unused) {
            return null;
        }
    }

    private List<Pattern> getExcludeUrlsPatternList() {
        Exception exc;
        SdkTracker sdkTracker;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedList linkedList;
        LinkedList linkedList2 = null;
        try {
            linkedList = new LinkedList();
        } catch (JSONException e10) {
            exc = e10;
        } catch (Exception e11) {
            exc = e11;
        }
        try {
            JSONArray jSONArray = this.config.getJSONArray("exclude_url_patterns");
            if (!isNotNull(jSONArray)) {
                return linkedList;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                linkedList.add(Pattern.compile(jSONArray.get(i10).toString()));
            }
            return linkedList;
        } catch (JSONException e12) {
            exc = e12;
            linkedList2 = linkedList;
            sdkTracker = this.sdkTracker;
            str = LOG_TAG;
            str2 = LogCategory.ACTION;
            str3 = LogSubCategory.Action.SYSTEM;
            str4 = Labels.System.UTIL;
            str5 = "Json Exception while fetching excludeUrlPatterns from config";
            sdkTracker.trackAndLogException(str, str2, str3, str4, str5, exc);
            return linkedList2;
        } catch (Exception e13) {
            exc = e13;
            linkedList2 = linkedList;
            sdkTracker = this.sdkTracker;
            str = LOG_TAG;
            str2 = LogCategory.ACTION;
            str3 = LogSubCategory.Action.SYSTEM;
            str4 = Labels.System.UTIL;
            str5 = "Exception while compiling patterns in excludeUrlPatterns from config";
            sdkTracker.trackAndLogException(str, str2, str3, str4, str5, exc);
            return linkedList2;
        }
    }

    private HttpsURLConnection getPostRequestConnection(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull WebResourceRequest webResourceRequest) {
        try {
            String sessionAttribute = this.juspayServices.getJBridge().getSessionAttribute("iframe_form_data", "wait_for_me");
            JSONObject jSONObject3 = this.config.getJSONObject("waiting_time_postparams");
            int optInt = jSONObject3.optInt("interval", 50);
            for (int optInt2 = jSONObject3.optInt("total_time", CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT); sessionAttribute.equals("wait_for_me") && optInt2 > 0; optInt2 -= optInt) {
                TimeUnit.MILLISECONDS.sleep(optInt);
                sessionAttribute = this.juspayServices.getJBridge().getSessionAttribute("iframe_form_data", "wait_for_me");
            }
            if (sessionAttribute.equals("wait_for_me")) {
                return null;
            }
            this.juspayServices.getJBridge().setSessionAttribute("iframe_form_data", "wait_for_me");
            HashMap<String, String> map = toMap(sessionAttribute);
            NetUtils netUtils = new NetUtils(jSONObject.optInt("connection_timeout", SearchAuth.StatusCodes.AUTH_DISABLED), jSONObject.optInt("read_timeout", SearchAuth.StatusCodes.AUTH_DISABLED));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject2.getString(next));
            }
            return netUtils.postUrl(new URL(webResourceRequest.getUrl().toString()), hashMap, map, new JSONObject());
        } catch (Exception unused) {
            return null;
        }
    }

    private List<String> getRupaySpecificDomains() {
        Exception exc;
        SdkTracker sdkTracker;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList = null;
        try {
            JSONArray jSONArray = this.config.getJSONArray("rupay_specific_domains");
            this.juspayServices.sdkDebug(LOG_TAG, "printing urlArray" + jSONArray);
            if (!isNotNull(jSONArray)) {
                return null;
            }
            int length = jSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    arrayList2.add(jSONArray.get(i10).toString());
                } catch (JSONException e10) {
                    exc = e10;
                    arrayList = arrayList2;
                    sdkTracker = this.sdkTracker;
                    str = LOG_TAG;
                    str2 = LogCategory.ACTION;
                    str3 = LogSubCategory.Action.SYSTEM;
                    str4 = Labels.System.UTIL;
                    str5 = "Json Exception while fetching Rupay Urls from config";
                    sdkTracker.trackAndLogException(str, str2, str3, str4, str5, exc);
                    return arrayList;
                } catch (Exception e11) {
                    exc = e11;
                    arrayList = arrayList2;
                    sdkTracker = this.sdkTracker;
                    str = LOG_TAG;
                    str2 = LogCategory.ACTION;
                    str3 = LogSubCategory.Action.SYSTEM;
                    str4 = Labels.System.UTIL;
                    str5 = "Exception while getting rupay urls from config";
                    sdkTracker.trackAndLogException(str, str2, str3, str4, str5, exc);
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (JSONException e12) {
            exc = e12;
        } catch (Exception e13) {
            exc = e13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, java.lang.CharSequence, java.lang.String] */
    private InputStream handleHtmlFile(HttpsURLConnection httpsURLConnection) {
        String connectionData;
        BufferedReader bufferedReader;
        String str;
        if (httpsURLConnection == null) {
            return null;
        }
        try {
            ?? format = String.format("<script>{ %s } </script></body>", getAcsScript());
            String contentEncoding = httpsURLConnection.getContentEncoding();
            try {
                if (contentEncoding == null || !contentEncoding.equalsIgnoreCase("gzip")) {
                    if (contentEncoding != null && !contentEncoding.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                        str = 0;
                    }
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()), 8000);
                    try {
                        connectionData = getConnectionData(bufferedReader2, 8000);
                        bufferedReader = bufferedReader2;
                        bufferedReader.close();
                        str = connectionData;
                    } catch (Throwable th2) {
                        bufferedReader2.close();
                        throw th2;
                    }
                } else {
                    bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(httpsURLConnection.getInputStream()), StandardCharsets.UTF_8), 8000);
                    try {
                        connectionData = getConnectionData(bufferedReader, 8000);
                        bufferedReader.close();
                        str = connectionData;
                    } catch (Throwable th3) {
                        bufferedReader.close();
                        throw th3;
                    }
                }
                if (str != 0) {
                    return new ByteArrayInputStream(str.replace("</body>", (CharSequence) format).getBytes(StandardCharsets.UTF_8));
                }
                return null;
            } catch (Throwable th4) {
                format.addSuppressed(th4);
                throw format;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private InputStream handleJsFile(HttpsURLConnection httpsURLConnection) {
        if (httpsURLConnection == null) {
            return null;
        }
        try {
            return new SequenceInputStream(new ByteArrayInputStream(String.format("window.addEventListener('load', function() { if(!window.GK) { %s } });", getAcsScript()).getBytes(StandardCharsets.UTF_8)), httpsURLConnection.getInputStream());
        } catch (Exception unused) {
            return null;
        }
    }

    private void initializeJuspayWebView(@NonNull Context context) {
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "started", context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.juspayWebView.setId(R.id.juspay_browser_view);
        this.juspayWebView.setLayoutParams(layoutParams);
        this.juspayWebView.setHorizontalScrollBarEnabled(false);
        this.juspayWebView.setVerticalScrollBarEnabled(false);
        this.juspayWebView.addJavascriptInterface(this.acsInterface, "ACSGatekeeper");
        FileProviderService fileProviderService = this.juspayServices.getFileProviderService();
        this.paymentSessionInfo.setPaymentDetails(this.bundleParameters);
        fileProviderService.addToFileCacheWhiteList("acs.jsa");
        prepareWebView();
    }

    private boolean isAcsToBeAddedToResource(@NonNull URL url) {
        List<String> rupaySpecificDomains = getRupaySpecificDomains();
        if (rupaySpecificDomains == null) {
            return false;
        }
        Iterator<String> it = rupaySpecificDomains.iterator();
        while (it.hasNext()) {
            if (url.toString().toLowerCase().contains(it.next()) && url.getPath().toLowerCase().endsWith(".js") && !url.getPath().toLowerCase().endsWith(".jsp")) {
                return true;
            }
        }
        return false;
    }

    private boolean isClientWhitelistedForWebViewAccess(String str) {
        JSONArray optJSONArray = Utils.optJSONArray(Utils.optJSONObject(Utils.optJSONObject(this.juspayServices.getSdkConfigService().getSdkConfig(), "godelConfig"), "webViewAccess"), "whitelistedClientIds");
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            try {
                if (str.contains(optJSONArray.getString(i10))) {
                    return true;
                }
            } catch (JSONException e10) {
                this.sdkTracker.trackAndLogException(GODEL, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.GODEL_WEBVIEW_WHITELIST, "Failed to read whitelisted config", e10);
            }
        }
        return false;
    }

    private static boolean isNotNull(JSONArray jSONArray) {
        return (jSONArray == null || jSONArray == JSONObject.NULL) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBrowserReady$0(Activity activity, String str, String str2, String str3) {
        addWebView(activity, str);
        loadPage(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBrowserReady$1(Activity activity, String str, String str2, String str3, String str4, String str5, String str6) {
        addWebView(activity, str);
        this.juspayWebView.loadDataWithBaseURL(str2, str3, str4, str5, str6);
    }

    private boolean shouldDisableGodel(Context context) {
        long j10;
        if (context == null || !KeyValueStore.contains(this.juspayServices, "GODEL_EXCEPTION_OFF")) {
            return false;
        }
        long optLong = getConfig().optLong("ON_EXCEPTION_GODEL_OFF_STICKINESS", ON_EXCEPTION_GODEL_OFF_STICKINESS);
        try {
            j10 = System.currentTimeMillis() - Long.parseLong(KeyValueStore.read(this.juspayServices, "GODEL_EXCEPTION_OFF", String.valueOf(System.currentTimeMillis())));
        } catch (NumberFormatException e10) {
            long currentTimeMillis = System.currentTimeMillis();
            this.sdkTracker.trackAndLogException(GODEL, LogCategory.ACTION, LogSubCategory.Action.USER, Labels.User.SHOULD_DISABLE_GODEL, "Failed while parsing number", e10);
            j10 = currentTimeMillis;
        }
        this.sdkTracker.trackAction(LogSubCategory.Action.USER, "info", Labels.User.SHOULD_DISABLE_GODEL, "exception_info", KeyValueStore.read(this.juspayServices, "EXCEPTION_INFO", null));
        if (j10 <= optLong) {
            return true;
        }
        KeyValueStore.remove(this.juspayServices, "GODEL_EXCEPTION_OFF");
        KeyValueStore.remove(this.juspayServices, "EXCEPTION_OFF");
        return false;
    }

    private WebResourceResponse shouldExcludeResource(@NonNull String str) {
        String str2;
        Pattern compile = Pattern.compile(".*\\.(gif|jpg|jpeg|png)([;?].*)?$");
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        List<Pattern> excludeUrlsPatternList = getExcludeUrlsPatternList();
        if (excludeUrlsPatternList == null) {
            excludeUrlsPatternList = new ArrayList<>();
        }
        Iterator<Pattern> it = excludeUrlsPatternList.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                if (compile.matcher(str).matches()) {
                    str2 = "text/html";
                } else {
                    byteArray = "[blocked]".getBytes();
                    str2 = "text/plain";
                }
                return new WebResourceResponse(str2, "utf-8", new ByteArrayInputStream(byteArray));
            }
        }
        return null;
    }

    private HashMap<String, String> toMap(@NonNull String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            JuspayLogger.d(LOG_TAG, "Not a json string. Passing as such");
            return null;
        }
    }

    private void turnOffGodelIfNeeded() {
        if (shouldDisableGodel(this.context)) {
            this.paymentSessionInfo.setGodelDisabled(PaymentConstants.GodelOffReasons.ON_GODEL_EXCEPTION);
        }
        if (!PaymentUtils.hasTelephonyService(this.juspayServices)) {
            this.juspayServices.sdkDebug(GODEL, "No telephony service found.. disabling JB");
            this.paymentSessionInfo.setGodelDisabled(PaymentConstants.GodelOffReasons.TELEPHONY_NOT_FOUND);
        }
        PaymentUtils.switchOffGodelIfLowOnMemory(this, this.juspayServices, this.paymentSessionInfo);
    }

    public void addWebView(Activity activity, String str) {
        initializeJuspayWebView(this.context);
        FrameLayout frameLayout = this.juspayServices.getContainer() != null ? (FrameLayout) this.juspayServices.getContainer().findViewById(Integer.parseInt(str)) : null;
        if (frameLayout != null || activity == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "missing", "activity");
        } else {
            frameLayout = (FrameLayout) activity.findViewById(Integer.parseInt(str));
        }
        if (frameLayout == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "missing", "view");
            return;
        }
        if (this.juspayWebView.getParent() == frameLayout) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.ADD_WEBVIEW, "parent", "parent view is same as before");
            return;
        }
        turnOffGodelIfNeeded();
        ViewParent parent = this.juspayWebView.getParent();
        if (parent != null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, LogLevel.WARNING, Labels.System.ADD_WEBVIEW, "parent", "already present");
            if (!(parent instanceof ViewGroup)) {
                this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.ADD_WEBVIEW, "parent", "not a ViewGroup");
                return;
            }
            ((ViewGroup) parent).removeView(this.juspayWebView);
        }
        frameLayout.addView(this.juspayWebView, 0);
    }

    public void exit() {
        ExecutorManager.runOnMainThread(new d(this, 19));
    }

    @NonNull
    public AcsInterface getAcsInterface() {
        return this.acsInterface;
    }

    @NonNull
    public List<String> getAllowedDeeplinkPackages() {
        return this.allowedDeeplinkPackages;
    }

    @NonNull
    public JSONObject getConfig() {
        return this.config;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    @NonNull
    public DuiInterface getDuiInterface() {
        return this.duiInterface;
    }

    @NonNull
    public JuspayServices getJuspayServices() {
        return this.juspayServices;
    }

    @NonNull
    public JuspayWebView getJuspayWebView() {
        return this.juspayWebView;
    }

    @NonNull
    public PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public JSONObject getWebLabRules() {
        try {
            return this.config.getJSONObject("weblab");
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Unable to find weblab key in config", e10);
            return null;
        }
    }

    public boolean isDuiLoaded() {
        return true;
    }

    public void loadPage() {
        String str;
        String str2;
        if (this.bundleParameters.has("url")) {
            str = "file:///android_assets/juspay/acs_blank.html";
            str2 = null;
        } else {
            str = this.bundleParameters.optString("url");
            str2 = this.bundleParameters.optString(PaymentConstants.POST_DATA);
        }
        loadPage(str, str2);
    }

    public void onBrowserReady(Activity activity, String str, String str2, String str3) {
        ExecutorManager.runOnMainThread(new a(this, activity, str3, str, str2, 1));
    }

    public void onDuiReady() {
        this.paymentSessionInfo.setGodelManager(this);
        this.juspayServices.getJBridge().attach(PaymentConstants.NETWORK_STATUS, "{}", HttpUrl.FRAGMENT_ENCODE_SET);
        setupAllowedDeeplinkPackages();
        this.sdkTracker.trackLifecycle(LogSubCategory.LifeCycle.HYPER_SDK, "info", Labels.HyperSdk.ON_DUI_READY, "class", "HyperFragment");
    }

    public void onDuiReleased() {
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.ON_DUI_RELEASED, "exit_sdk", JSONObject.NULL);
        exit();
        this.paymentSessionInfo.setGodelManager(null);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void prepareWebView() {
        this.juspayWebView.getSettings().setJavaScriptEnabled(true);
        this.juspayWebView.getSettings().setDomStorageEnabled(true);
        JSONObject jSONObject = null;
        try {
            jSONObject = this.bundleParameters.getJSONObject(PaymentConstants.PAYLOAD);
            if (jSONObject.optBoolean("godel_receive_merchant_messages")) {
                this.juspayWebView.addJavascriptInterface(new GodelJsInterface(this.juspayServices), "GodelInterface");
            }
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(GODEL, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.INITIALISE_JUSPAY_WEBVIEW, "Initiate payload is missing", e10);
        }
        this.juspayWebView.setDefaultWebViewClient(this.juspayWebViewClient);
        this.juspayWebView.setDefaultWebChromeClient(this.juspayWebChromeClient);
        this.juspayWebView.getSettings().setAllowFileAccess(true);
        this.juspayWebView.getSettings().setCacheMode(-1);
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "enabling_third_party_cookies", Boolean.TRUE);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.juspayWebView, true);
        if (!this.juspayServices.getJBridge().execute(PaymentConstants.NETWORK_STATUS, HttpUrl.FRAGMENT_ENCODE_SET, "{}", HttpUrl.FRAGMENT_ENCODE_SET).equals(String.valueOf(true))) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "no_network", "Setting web view to load from cache if there is no network");
            this.juspayWebView.getSettings().setCacheMode(1);
        }
        if (this.bundleParameters.has("clearCookies") && this.bundleParameters.optBoolean("clearCookies")) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "clearing", "cookies");
            PaymentUtils.clearCookies(this.juspayServices);
        }
        if (jSONObject == null) {
            this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "error", Labels.System.INITIALISE_JUSPAY_WEBVIEW, "missing", "JuspayWebView");
            return;
        }
        String optString = jSONObject.optString(PaymentConstants.CLIENT_ID_CAMEL, HttpUrl.FRAGMENT_ENCODE_SET);
        if (this.juspayWebViewConfigurationCallback == null || !isClientWhitelistedForWebViewAccess(optString)) {
            return;
        }
        this.juspayWebViewConfigurationCallback.configureJuspayWebView(this.juspayWebView);
        this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.GODEL_WEBVIEW_WHITELIST, "configured", "JuspayWebView");
    }

    public void resetWebView() {
        JuspayWebView juspayWebView = this.juspayWebView;
        juspayWebView.setDefaultWebChromeClient(juspayWebView.getWebChromeClient());
        JuspayWebView juspayWebView2 = this.juspayWebView;
        juspayWebView2.setDefaultWebViewClient(juspayWebView2.getWebViewClient());
        this.juspayWebView.stopLoading();
        this.juspayWebView.removeJavascriptInterface("ACSGatekeeper");
        this.juspayWebView.clearHistory();
        this.juspayWebView.destroy();
        if (this.juspayWebView.getParent() != null) {
            ((ViewManager) this.juspayWebView.getParent()).removeView(this.juspayWebView);
        }
    }

    public void setConfig(@NonNull JSONObject jSONObject) {
        this.config = jSONObject;
    }

    public void setIsRupaySupportedAdded(boolean z10) {
        this.isRupaySupportedAdded = z10;
    }

    public void setupAllowedDeeplinkPackages() {
        JSONObject jSONObject = this.processPayload;
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(PaymentConstants.PAYLOAD) : null;
        if (optJSONObject == null) {
            return;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("allowedDeepLinkPackages");
        this.allowedDeeplinkPackages.clear();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                String optString = optJSONArray.optString(i10);
                if (optString != null) {
                    this.allowedDeeplinkPackages.add(optString);
                }
            }
        }
    }

    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest) {
        JSONArray optJSONArray;
        try {
            int i10 = 0;
            if (!this.juspayServices.getSessionInfo().get("inject_acs_into_iframes", "false").equals("true") || !webResourceRequest.getMethod().equals("GET")) {
                if (!webResourceRequest.getMethod().equals("POST") || (optJSONArray = this.config.optJSONArray("post_urls")) == null) {
                    return null;
                }
                while (i10 < optJSONArray.length()) {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                    if (Pattern.compile(jSONObject.getString("url")).matcher(webResourceRequest.getUrl().toString()).find()) {
                        return addAcsToJSFile(webResourceRequest, "POST", jSONObject.getString("file_type"), jSONObject.getJSONObject("headers"), jSONObject.getJSONObject("timeout"));
                    }
                    i10++;
                }
                return null;
            }
            JSONArray optJSONArray2 = this.config.optJSONArray("bank_js_urls_v2");
            if (optJSONArray2 == null) {
                JSONArray optJSONArray3 = this.config.optJSONArray("bank_js_urls");
                if (optJSONArray3 != null) {
                    while (i10 < optJSONArray3.length()) {
                        if (Pattern.compile(optJSONArray3.getString(i10)).matcher(webResourceRequest.getUrl().toString()).find()) {
                            return addAcsToJSFile(webResourceRequest, "GET", ".*\\.jsp?$", new JSONObject(), new JSONObject());
                        }
                        i10++;
                    }
                }
            } else {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    JSONArray jSONArray = optJSONArray2.getJSONArray(i11);
                    if (Pattern.compile(jSONArray.getString(0)).matcher(webResourceRequest.getUrl().toString()).find()) {
                        return addAcsToJSFile(webResourceRequest, "GET", jSONArray.getString(1), new JSONObject(), new JSONObject());
                    }
                }
            }
            return null;
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Exception while adding ACS to js file", e10);
            return null;
        }
    }

    public void loadPage(String str, String str2) {
        try {
            this.bundleParameters.put("url", str);
            this.bundleParameters.put(PaymentConstants.POST_DATA, str2);
        } catch (JSONException e10) {
            this.sdkTracker.trackAndLogException(GODEL, LogCategory.LIFECYCLE, LogSubCategory.LifeCycle.HYPER_SDK, Labels.System.LOAD_PAGE, "Failed to write to JSON bundle parameters", e10);
        }
        if (str2 != null) {
            this.juspayWebView.postUrl(str, str2.getBytes());
        } else {
            this.juspayWebView.loadUrl(str);
        }
    }

    public void onBrowserReady(final Activity activity, final String str, final String str2, final String str3, final String str4, final String str5, final String str6) {
        ExecutorManager.runOnMainThread(new Runnable() { // from class: zs.a
            @Override // java.lang.Runnable
            public final void run() {
                Godel.this.lambda$onBrowserReady$1(activity, str6, str, str2, str3, str4, str5);
            }
        });
    }

    public WebResourceResponse shouldInterceptRequest(@NonNull String str) {
        try {
            JuspayServices juspayServices = this.juspayServices;
            String str2 = LOG_TAG;
            juspayServices.sdkDebug(str2, String.format("Intercepted URL: %s", str));
            if (!URLUtil.isValidUrl(str) || !isAcsToBeAddedToResource(new URL(str)) || this.isRupaySupportedAdded) {
                WebResourceResponse shouldExcludeResource = shouldExcludeResource(str);
                if (shouldExcludeResource == null) {
                    return null;
                }
                this.sdkTracker.trackAction(LogSubCategory.Action.SYSTEM, "info", Labels.System.UTIL, "url_excluded", str);
                return shouldExcludeResource;
            }
            URL url = new URL(str);
            this.juspayServices.sdkDebug(str2, String.format("Intercepted URL and modified: %s", str));
            setIsRupaySupportedAdded(true);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(getAcsScript().getBytes(StandardCharsets.UTF_8));
            try {
                SequenceInputStream sequenceInputStream = new SequenceInputStream(byteArrayInputStream, FirebasePerfUrlConnection.openStream(url));
                try {
                    WebResourceResponse webResourceResponse = new WebResourceResponse("text/javascript", "utf-8", sequenceInputStream);
                    sequenceInputStream.close();
                    byteArrayInputStream.close();
                    return webResourceResponse;
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            this.sdkTracker.trackAndLogException(LOG_TAG, LogCategory.ACTION, LogSubCategory.Action.SYSTEM, Labels.System.UTIL, "Error while Caching Files", e10);
            return null;
        }
    }
}
