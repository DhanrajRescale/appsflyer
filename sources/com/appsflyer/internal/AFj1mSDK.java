package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AFj1mSDK {
    public final WeakReference<Context> AFInAppEventType;
    public String AFKeystoreWrapper;

    public AFj1mSDK(@NonNull Context context) {
        this.AFInAppEventType = new WeakReference<>(context);
    }
}
