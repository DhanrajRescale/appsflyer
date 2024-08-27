package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1cSDK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1vSDK {
    public String AFInAppEventParameterName;
    public Intent AFInAppEventType;

    @NonNull
    public List<List<String>> AFKeystoreWrapper = new ArrayList();

    @NonNull
    public final List<String> AFLogger = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final AFd1kSDK f8411e;
    public long registerClient;
    public String[] unregisterClient;
    public DeepLinkListener valueOf;
    public Map<String, String> values;

    public AFc1vSDK(@NonNull AFd1kSDK aFd1kSDK) {
        this.f8411e = aFd1kSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:0: B:42:0x0047->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean AFInAppEventType(android.content.Intent r10, android.content.Context r11, com.appsflyer.internal.AFc1oSDK r12) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1vSDK.AFInAppEventType(android.content.Intent, android.content.Context, com.appsflyer.internal.AFc1oSDK):boolean");
    }

    private Uri values(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e10);
                return null;
            }
        }
        return null;
    }

    public final void AFInAppEventParameterName(AFc1oSDK aFc1oSDK, Intent intent, Context context) {
        AFd1nSDK aFd1nSDK = (AFd1nSDK) this.f8411e;
        if (context != null) {
            aFd1nSDK.AFInAppEventParameterName.AFKeystoreWrapper = context.getApplicationContext();
        }
        if (!AFInAppEventType(intent, context, aFc1oSDK) && this.valueOf != null && this.f8411e.AFInAppEventType().AFKeystoreWrapper.valueOf("appsFlyerCount", 0) == 0 && !this.f8411e.valueOf().AFInAppEventType("ddl_sent")) {
            AFc1jSDK aFc1jSDK = new AFc1jSDK();
            AFe1cSDK afInfoLog = this.f8411e.afInfoLog();
            afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1kSDK(aFc1jSDK, this.f8411e)));
        }
        this.f8411e.valueOf().valueOf("ddl_sent", true);
    }

    public final void AFKeystoreWrapper(Context context, AFc1oSDK aFc1oSDK, Uri uri) {
        AFf1jSDK aFf1jSDK = new AFf1jSDK(context, aFc1oSDK, uri, this.AFLogger);
        AFe1cSDK afInfoLog = this.f8411e.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1jSDK));
        this.AFInAppEventType = null;
    }

    public final void AFKeystoreWrapper(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.valueOf != null) {
            try {
                try {
                    DeepLink values = DeepLink.values(map);
                    values.AFKeystoreWrapper.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(values, null);
                } catch (JSONException e10) {
                    AFLogger.INSTANCE.e(AFg1aSDK.DDL, "Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                values(deepLinkResult);
                return;
            } catch (Throwable th2) {
                values(new DeepLinkResult(null, null));
                throw th2;
            }
        }
        values(map);
    }

    public final void values(String str, DeepLinkResult.Error error) {
        if (this.valueOf != null) {
            AFLogger.INSTANCE.d(AFg1aSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            values(new DeepLinkResult(null, error));
        } else {
            AFKeystoreWrapper(str);
        }
    }

    public final void values(DeepLinkResult deepLinkResult) {
        if (this.valueOf != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1aSDK aFg1aSDK = AFg1aSDK.DDL;
            StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            aFLogger.d(aFg1aSDK, sb2.toString());
            try {
                this.valueOf.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
                return;
            }
        }
        AFLogger.INSTANCE.d(AFg1aSDK.DDL, "skipping, no callback registered");
    }

    private static void AFKeystoreWrapper(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }

    private static void values(Map<String, String> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFb1vSDK.AFKeystoreWrapper().AFInAppEventType;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
