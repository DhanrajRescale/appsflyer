package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1pSDK implements AFg1vSDK {

    @NotNull
    private final Context AFInAppEventType;

    @NotNull
    private final AppsFlyerProperties values;

    public AFg1pSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFInAppEventType = context;
        this.values = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final AFg1qSDK valueOf() {
        String string;
        if (!Boolean.parseBoolean(this.values.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.AFInAppEventType);
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i10 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", HttpUrl.FRAGMENT_ENCODE_SET)) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1qSDK(i12, i10, i11, i13, str);
        } catch (Exception e10) {
            AFg1fSDK.e$default(AFLogger.INSTANCE, AFg1aSDK.DMA, "TCF data collection exception", e10, false, false, false, false, 120, null);
            return null;
        }
    }
}
