package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.o0;

/* loaded from: classes.dex */
public final class AFg1sSDK implements AFg1tSDK {

    @NotNull
    private final AppsFlyerProperties AFInAppEventType;

    @NotNull
    private final AFd1pSDK AFKeystoreWrapper;

    @NotNull
    private final AFg1vSDK valueOf;

    public AFg1sSDK(@NotNull AFg1vSDK aFg1vSDK, @NotNull AFd1pSDK aFd1pSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        Intrinsics.checkNotNullParameter(aFd1pSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.valueOf = aFg1vSDK;
        this.AFKeystoreWrapper = aFd1pSDK;
        this.AFInAppEventType = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void values(@NotNull Map<String, Object> map, @NotNull AFf1zSDK aFf1zSDK) {
        boolean z10;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFf1zSDK, "");
        AFg1qSDK valueOf = this.valueOf.valueOf();
        AppsFlyerConsent appsFlyerConsent = this.AFKeystoreWrapper.f8422d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (appsFlyerConsent != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", Boolean.valueOf(appsFlyerConsent.isUserSubjectToGDPR()));
            Boolean hasConsentForDataUsage = appsFlyerConsent.getHasConsentForDataUsage();
            if (hasConsentForDataUsage != null) {
                linkedHashMap2.put("ad_user_data_enabled", Boolean.valueOf(hasConsentForDataUsage.booleanValue()));
            }
            Boolean hasConsentForAdsPersonalization = appsFlyerConsent.getHasConsentForAdsPersonalization();
            if (hasConsentForAdsPersonalization != null) {
                linkedHashMap2.put("ad_personalization_enabled", Boolean.valueOf(hasConsentForAdsPersonalization.booleanValue()));
            }
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (valueOf != null) {
            if (appsFlyerConsent != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(valueOf.AFKeystoreWrapper));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(valueOf.values));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(valueOf.valueOf));
            if (z10) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", HttpUrl.FRAGMENT_ENCODE_SET);
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(valueOf.AFInAppEventType));
                linkedHashMap3.put("tcstring", valueOf.AFInAppEventParameterName);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (aFf1zSDK == AFf1zSDK.CONVERSION && this.AFInAppEventType.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION) != null) {
            Map<String, Object> AFInAppEventParameterName = AFb1vSDK.AFInAppEventParameterName(map);
            Intrinsics.checkNotNullExpressionValue(AFInAppEventParameterName, "");
            AFInAppEventParameterName.put("api", o0.b(new Pair(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, this.AFInAppEventType.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))));
        }
    }
}
