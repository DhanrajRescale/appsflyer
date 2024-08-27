package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1pSDK implements AFi1qSDK {
    private String AFInAppEventParameterName;

    private static String AFInAppEventType(Activity activity) {
        Uri AFInAppEventType = AFc1bSDK.AFInAppEventType(activity != null ? activity.getIntent() : null);
        String obj = AFInAppEventType != null ? AFInAppEventType.toString() : null;
        if (obj == null) {
            obj = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AFInAppEventType(obj)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFInAppEventParameterName(Activity activity) {
        String str = this.AFInAppEventParameterName;
        this.AFInAppEventParameterName = null;
        if (str != null && str.length() != 0) {
            return str;
        }
        return AFInAppEventType(activity);
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    @NotNull
    public final String valueOf(Activity activity) {
        Uri uri;
        String str = null;
        if (activity != null && activity.getIntent() != null) {
            uri = activity.getReferrer();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.toString();
        }
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final void values(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.AFInAppEventParameterName;
        if (str == null || str.length() == 0) {
            this.AFInAppEventParameterName = AFInAppEventType(activity);
        }
    }

    private static boolean AFInAppEventType(String str) {
        return s.r(str, "android-app://", false);
    }
}
