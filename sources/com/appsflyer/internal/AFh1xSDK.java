package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFh1xSDK {
    public final String AFInAppEventParameterName;

    @NotNull
    public final String AFInAppEventType;
    public final Intent values;

    public AFh1xSDK(@NotNull Activity activity, @NotNull AFi1qSDK aFi1qSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1qSDK, "");
        this.values = activity.getIntent();
        this.AFInAppEventType = aFi1qSDK.valueOf(activity);
        this.AFInAppEventParameterName = aFi1qSDK.AFInAppEventParameterName(activity);
    }
}
