package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFg1lSDK extends AFf1nSDK<Map<String, Object>> {
    private static final List<String> unregisterClient = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private Map<String, Object> afInfoLog;
    private String afWarnLog;
    private final AFh1wSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final AFd1qSDK f8494i;

    /* renamed from: v, reason: collision with root package name */
    private final AFd1sSDK f8495v;

    /* renamed from: w, reason: collision with root package name */
    private final AFe1ySDK f8496w;

    public AFg1lSDK(@NonNull AFd1kSDK aFd1kSDK) {
        super(AFf1zSDK.GCDSDK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, "GCD-FETCH");
        this.f8496w = aFd1kSDK.AFInAppEventParameterName();
        this.f8494i = aFd1kSDK.valueOf();
        this.force = aFd1kSDK.AFLogger();
        this.f8495v = aFd1kSDK.AFInAppEventType();
        this.AFInAppEventParameterName.add(AFf1zSDK.CONVERSION);
        this.AFInAppEventParameterName.add(AFf1zSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final void AFInAppEventType() {
        super.AFInAppEventType();
        Map<String, Object> map = this.afInfoLog;
        String str = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.valueOf(map);
        } else if (str != null && !str.isEmpty()) {
            AFg1kSDK.AFKeystoreWrapper(str);
        } else {
            AFg1kSDK.AFKeystoreWrapper("Unknown error");
        }
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<Map<String, Object>> AFKeystoreWrapper(@NonNull String str) {
        String str2;
        String AFKeystoreWrapper = AFb1vSDK.AFKeystoreWrapper(this.f8494i, this.f8495v.d());
        if (AFKeystoreWrapper != null && !AFKeystoreWrapper.trim().isEmpty()) {
            if (!unregisterClient.contains(AFKeystoreWrapper.toLowerCase(Locale.getDefault()))) {
                str2 = "-".concat(AFKeystoreWrapper);
                AFe1sSDK<Map<String, Object>> AFKeystoreWrapper2 = this.f8496w.AFKeystoreWrapper(str2, str);
                StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
                sb2.append(AFKeystoreWrapper2.AFInAppEventParameterName.values);
                AFb1mSDK.AFKeystoreWrapper(sb2.toString());
                return AFKeystoreWrapper2;
            }
            AFLogger.afWarnLog(String.format("[GCD] AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", AFKeystoreWrapper));
        }
        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        AFe1sSDK<Map<String, Object>> AFKeystoreWrapper22 = this.f8496w.AFKeystoreWrapper(str2, str);
        StringBuilder sb22 = new StringBuilder("[GCD-B01] URL: ");
        sb22.append(AFKeystoreWrapper22.AFInAppEventParameterName.values);
        AFb1mSDK.AFKeystoreWrapper(sb22.toString());
        return AFKeystoreWrapper22;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean valueOf() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1aSDK -> 0x006f, TryCatch #3 {AFe1aSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1aSDK -> 0x006f, TryCatch #3 {AFe1aSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[Catch: all -> 0x0069, Exception -> 0x006c, AFe1aSDK -> 0x006f, TryCatch #3 {AFe1aSDK -> 0x006f, Exception -> 0x006c, blocks: (B:11:0x0025, B:17:0x002f, B:23:0x003f, B:30:0x0052, B:37:0x0072, B:39:0x0086, B:41:0x00a0, B:43:0x00a6, B:44:0x00b1, B:46:0x00b7, B:48:0x00bd, B:49:0x00d3, B:50:0x00e4, B:52:0x0103, B:53:0x0108), top: B:10:0x0025, outer: #1 }] */
    @Override // com.appsflyer.internal.AFf1nSDK, com.appsflyer.internal.AFe1dSDK
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFe1bSDK AFKeystoreWrapper() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1lSDK.AFKeystoreWrapper():com.appsflyer.internal.AFe1bSDK");
    }
}
