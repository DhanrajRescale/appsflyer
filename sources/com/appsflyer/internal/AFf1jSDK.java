package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFf1jSDK extends AFe1dSDK<Map<String, Object>> {
    private static final int unregisterClient = (int) TimeUnit.SECONDS.toMillis(2);
    private final AFc1oSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f8451d;

    /* renamed from: e, reason: collision with root package name */
    private final Uri f8452e;
    private final List<String> force;
    private final Context registerClient;

    public AFf1jSDK(@NonNull Context context, @NonNull AFc1oSDK aFc1oSDK, @NonNull Uri uri, @NonNull List<String> list) {
        super(AFf1zSDK.RESOLVE_ESP, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "ResolveEsp");
        this.registerClient = context;
        this.AFLogger = aFc1oSDK;
        this.f8452e = uri;
        this.force = list;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 60000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @NonNull
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        Integer num = null;
        if (!AFInAppEventParameterName(this.f8452e.toString())) {
            AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, this.f8452e, null);
            return AFe1bSDK.SUCCESS;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String obj = this.f8452e.toString();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        String str = null;
        while (i10 < 5) {
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(Uri.parse(obj));
            String str2 = (String) AFKeystoreWrapper.get("res");
            Integer num2 = (Integer) AFKeystoreWrapper.get("status");
            String str3 = (String) AFKeystoreWrapper.get("error");
            if (str2 == null || !AFInAppEventParameterName(str2)) {
                str = str3;
                obj = str2;
                num = num2;
                break;
            }
            if (i10 < 4) {
                arrayList.add(str2);
            }
            i10++;
            str = str3;
            obj = str2;
            num = num2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("res", obj != null ? obj : HttpUrl.FRAGMENT_ENCODE_SET);
        hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
        if (str != null) {
            hashMap.put("error", str);
        }
        if (!arrayList.isEmpty()) {
            hashMap.put("redirects", arrayList);
        }
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        synchronized (this.AFLogger) {
            this.AFLogger.AFKeystoreWrapper("af_deeplink_r", hashMap);
            this.AFLogger.AFKeystoreWrapper("af_deeplink", this.f8452e.toString());
        }
        AFb1vSDK.AFKeystoreWrapper().AFKeystoreWrapper(this.registerClient, this.AFLogger, obj != null ? Uri.parse(obj) : this.f8452e, this.f8452e);
        this.f8451d = hashMap;
        return AFe1bSDK.SUCCESS;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    private boolean AFInAppEventParameterName(String str) {
        if (str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder s7 = da.e.s("Validate if link ", str, " belongs to ESP domains: ");
        s7.append(this.force);
        AFLogger.afRDLog(s7.toString());
        try {
            return this.force.contains(new URL(str).getHost());
        } catch (MalformedURLException e10) {
            AFLogger.afErrorLogForExcManagerOnly("MalformedURLException ESP link", e10);
            return false;
        }
    }

    private static Map<String, Object> AFKeystoreWrapper(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
            sb2.append(uri.toString());
            AFLogger.afDebugLog(sb2.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
            httpURLConnection.setInstanceFollowRedirects(false);
            int i10 = unregisterClient;
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection.setRequestProperty("af-esp", "6.14.0");
            int responseCode = httpURLConnection.getResponseCode();
            hashMap.put("status", Integer.valueOf(responseCode));
            if (300 <= responseCode && responseCode <= 305) {
                hashMap.put("res", httpURLConnection.getHeaderField("Location"));
            }
            httpURLConnection.disconnect();
            AFLogger.afDebugLog("ESP deeplink resolving is finished");
        } catch (Throwable th2) {
            hashMap.put("error", th2.getLocalizedMessage());
            AFLogger.afErrorLog(th2.getMessage(), th2);
        }
        return hashMap;
    }
}
