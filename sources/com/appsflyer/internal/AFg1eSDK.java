package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class AFg1eSDK extends AFe1dSDK<Void> {

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f8487d;

    /* renamed from: e, reason: collision with root package name */
    private final AFe1jSDK<String> f8488e;
    private final AFd1qSDK unregisterClient;

    public AFg1eSDK(AFf1cSDK aFf1cSDK, AFd1qSDK aFd1qSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, "GCD-CHECK");
        this.f8487d = aFf1cSDK.unregisterClient();
        this.f8488e = ((AFf1nSDK) aFf1cSDK).registerClient;
        this.unregisterClient = aFd1qSDK;
    }

    private Map<String, Object> e() {
        String AFKeystoreWrapper = this.unregisterClient.AFKeystoreWrapper("attributionId", (String) null);
        if (AFKeystoreWrapper == null) {
            return null;
        }
        try {
            new AFe1tSDK();
            return AFe1tSDK.values(AFKeystoreWrapper);
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final long AFInAppEventParameterName() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    @NonNull
    public final AFe1bSDK AFKeystoreWrapper() throws Exception {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.unregisterClient.valueOf("appsFlyerCount", 0))));
        long values = this.unregisterClient.values("appsflyerConversionDataCacheExpiration", 0L);
        if (values != 0 && System.currentTimeMillis() - values > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.unregisterClient.valueOf("sixtyDayConversionData", true);
            this.unregisterClient.AFInAppEventParameterName("attributionId", (String) null);
            this.unregisterClient.AFKeystoreWrapper("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> e10 = e();
        if (e10 != null) {
            try {
                if (!e10.containsKey("is_first_launch")) {
                    e10.put("is_first_launch", Boolean.FALSE);
                }
                AFg1kSDK.valueOf(e10);
            } catch (Exception e11) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e11.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e11);
            }
            return AFe1bSDK.SUCCESS;
        }
        try {
        } catch (Exception e12) {
            StringBuilder sb3 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb3.append(e12.getLocalizedMessage());
            AFLogger.afErrorLog(sb3.toString(), e12);
        }
        if (this.f8487d != null) {
            StringBuilder sb4 = new StringBuilder("Launch exception: ");
            sb4.append(this.f8487d.getMessage());
            AFg1kSDK.AFKeystoreWrapper(sb4.toString());
            return AFe1bSDK.SUCCESS;
        }
        AFe1jSDK<String> aFe1jSDK = this.f8488e;
        if (aFe1jSDK != null && !aFe1jSDK.isSuccessful()) {
            StringBuilder sb5 = new StringBuilder("Launch status code: ");
            sb5.append(this.f8488e.getStatusCode());
            AFg1kSDK.AFKeystoreWrapper(sb5.toString());
            return AFe1bSDK.SUCCESS;
        }
        return AFe1bSDK.FAILURE;
    }

    @Override // com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }
}
