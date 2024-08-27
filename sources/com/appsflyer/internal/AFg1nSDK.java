package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.AFe1cSDK;
import com.google.firebase.messaging.FirebaseMessagingService;

/* loaded from: classes.dex */
public final class AFg1nSDK {
    public static String valueOf;
    public final AFd1qSDK values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(AFb1vSDK.valueOf);
        valueOf = sb2.toString();
    }

    public AFg1nSDK(@NonNull Context context) {
        this.values = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName(context);
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            String str = FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1aSDK.UNINSTALL, "An error occurred while trying to verify manifest declarations: ", th2);
        }
        if (!AFb1uSDK.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
            return false;
        }
        return true;
    }

    public static boolean valueOf(@NonNull AFd1qSDK aFd1qSDK) {
        return aFd1qSDK.AFInAppEventType("sentRegisterRequestToAF");
    }

    public static void values(String str) {
        AFd1kSDK AFInAppEventParameterName = AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName();
        AFf1dSDK aFf1dSDK = new AFf1dSDK(str, AFInAppEventParameterName);
        AFe1cSDK afInfoLog = AFInAppEventParameterName.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1dSDK));
    }

    public final AFg1oSDK valueOf() {
        String string;
        String string2;
        String AFKeystoreWrapper = this.values.AFKeystoreWrapper("afUninstallToken", (String) null);
        long values = this.values.values("afUninstallToken_received_time", 0L);
        boolean AFInAppEventType = this.values.AFInAppEventType("afUninstallToken_queued");
        this.values.valueOf("afUninstallToken_queued", false);
        if (AFKeystoreWrapper == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            AFKeystoreWrapper = string2.split(",")[r0.length - 1];
        }
        if (values == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string.split(",");
            if (split.length >= 2) {
                try {
                    values = Long.parseLong(split[split.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (AFKeystoreWrapper != null) {
            return new AFg1oSDK(AFKeystoreWrapper, values, AFInAppEventType);
        }
        return null;
    }
}
