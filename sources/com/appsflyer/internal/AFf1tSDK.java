package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import vt.p0;

/* loaded from: classes.dex */
public abstract class AFf1tSDK extends AFf1nSDK<String> {

    @NotNull
    private final AFd1sSDK afInfoLog;

    @NotNull
    private final Map<String, Object> force;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFg1tSDK f8471i;

    @NotNull
    private final AFf1zSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFg1mSDK f8472v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFd1qSDK f8473w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1tSDK(@NotNull AFf1zSDK aFf1zSDK, @NotNull AFf1zSDK[] aFf1zSDKArr, @NotNull AFd1kSDK aFd1kSDK, String str, @NotNull Map<String, ? extends Object> map) {
        super(aFf1zSDK, aFf1zSDKArr, aFd1kSDK, null);
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.unregisterClient = aFf1zSDK;
        this.force = map;
        AFd1sSDK AFInAppEventType = aFd1kSDK.AFInAppEventType();
        Intrinsics.checkNotNullExpressionValue(AFInAppEventType, "");
        this.afInfoLog = AFInAppEventType;
        AFd1qSDK valueOf = aFd1kSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(valueOf, "");
        this.f8473w = valueOf;
        AFg1mSDK e10 = aFd1kSDK.e();
        Intrinsics.checkNotNullExpressionValue(e10, "");
        this.f8472v = e10;
        AFg1tSDK purchaseType = aFd1kSDK.getPurchaseType();
        Intrinsics.checkNotNullExpressionValue(purchaseType, "");
        this.f8471i = purchaseType;
    }

    public String AFInAppEventType(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AFe1sSDK<String> AFKeystoreWrapper(@NotNull String str) {
        AFe1nSDK aFe1nSDK;
        String AFInAppEventParameterName;
        Intrinsics.checkNotNullParameter(str, "");
        Map<String, Object> m10 = p0.m(this.force);
        String values = values(m10);
        String AFInAppEventType = AFInAppEventType(m10);
        Map<String, Object> m11 = p0.m(m10);
        AFInAppEventType(m11, values);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String AFKeystoreWrapper = this.afInfoLog.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null && !w.C(AFKeystoreWrapper)) {
            linkedHashMap.put("advertising_id", AFKeystoreWrapper);
        }
        AFb1zSDK AFInAppEventType2 = AFb1rSDK.AFInAppEventType(this.afInfoLog.valueOf.AFKeystoreWrapper);
        String str2 = null;
        String str3 = AFInAppEventType2 != null ? AFInAppEventType2.AFInAppEventParameterName : null;
        if (str3 != null && !w.C(str3)) {
            linkedHashMap.put("oaid", str3);
        }
        AFb1zSDK AFInAppEventParameterName2 = AFb1rSDK.AFInAppEventParameterName(this.afInfoLog.valueOf.AFKeystoreWrapper.getContentResolver());
        String str4 = AFInAppEventParameterName2 != null ? AFInAppEventParameterName2.AFInAppEventParameterName : null;
        if (str4 != null && !w.C(str4)) {
            linkedHashMap.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) && (AFInAppEventParameterName = ((AFf1nSDK) this).f8459d.AFInAppEventParameterName(this.f8473w)) != null && !w.C(AFInAppEventParameterName)) {
            linkedHashMap.put("imei", AFInAppEventParameterName);
        }
        AFd1sSDK aFd1sSDK = this.afInfoLog;
        String valueOf = AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper);
        if (valueOf == null) {
            valueOf = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        linkedHashMap.put("appsflyer_id", valueOf);
        linkedHashMap.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        linkedHashMap.put("sdk_version", "6.14.0");
        if (AFInAppEventType != null && !w.C(AFInAppEventType)) {
            linkedHashMap.put("sdk_connector_version", AFInAppEventType);
        }
        m11.put("device_data", linkedHashMap);
        this.f8471i.values(m11, this.unregisterClient);
        AFe1sSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(m11, str, values);
        if (AFKeystoreWrapper2 != null && (aFe1nSDK = AFKeystoreWrapper2.AFInAppEventParameterName) != null) {
            str2 = aFe1nSDK.values;
        }
        if (str2 != null) {
            String jSONObject = new JSONObject(m11).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(toString());
            sb2.append(": preparing data: ");
            sb2.append(jSONObject);
            AFb1mSDK.AFKeystoreWrapper(sb2.toString());
            ((AFf1nSDK) this).f8460e.valueOf(str2, jSONObject);
        }
        return AFKeystoreWrapper2;
    }

    public abstract AFe1sSDK<String> AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str, String str2);

    @Override // com.appsflyer.internal.AFf1nSDK
    public final AppsFlyerRequestListener e() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1nSDK
    public final boolean i() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    public String values(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return null;
    }

    public void AFInAppEventType(@NotNull Map<String, Object> map, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        map.put("app_id", this.afInfoLog.valueOf.AFKeystoreWrapper.getPackageName());
        String AFInAppEventParameterName = AFd1sSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            map.put("cuid", AFInAppEventParameterName);
        }
        Context context = this.afInfoLog.valueOf.AFKeystoreWrapper;
        map.put("app_version_name", AFb1uSDK.AFInAppEventType(context, context.getPackageName()));
        if (registerClient()) {
            map.put("event_timestamp", Long.valueOf(this.f8472v.AFInAppEventType()));
        }
        if (str != null) {
            map.put("billing_lib_version", str);
        }
    }
}
