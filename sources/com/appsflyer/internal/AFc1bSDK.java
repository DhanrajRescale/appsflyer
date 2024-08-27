package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.appsflyer.internal.AFj1ySDK;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFc1bSDK {
    public static Uri AFInAppEventType(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1ySDK aFj1ySDK = new AFj1ySDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", HttpUrl.FRAGMENT_ENCODE_SET);
        Uri uri = (Uri) ((Parcelable) aFj1ySDK.AFInAppEventParameterName(new AFj1ySDK.AnonymousClass1("android.intent.extra.REFERRER"), "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String AFInAppEventParameterName = aFj1ySDK.AFInAppEventParameterName("android.intent.extra.REFERRER_NAME");
        if (AFInAppEventParameterName == null) {
            return null;
        }
        return Uri.parse(AFInAppEventParameterName);
    }
}
