package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.pm.PackageItemInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.UUID;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFd1sSDK {
    private static String values = "288";
    private Bundle AFInAppEventParameterName = null;
    public final AFd1pSDK AFInAppEventType;
    public final AFd1qSDK AFKeystoreWrapper;
    public final AFd1lSDK valueOf;

    public AFd1sSDK(AFd1lSDK aFd1lSDK, AFd1qSDK aFd1qSDK, AFd1pSDK aFd1pSDK) {
        this.valueOf = aFd1lSDK;
        this.AFKeystoreWrapper = aFd1qSDK;
        this.AFInAppEventType = aFd1pSDK;
    }

    public static String AFInAppEventParameterName() {
        return AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
    }

    @NonNull
    public static String AFInAppEventType() {
        return "6.14.0";
    }

    public static String registerClient() {
        StringBuilder sb2 = new StringBuilder("version: 6.14.0 (build ");
        sb2.append(values);
        sb2.append(")");
        return sb2.toString();
    }

    @NonNull
    public static String valueOf() {
        return UUID.randomUUID().toString();
    }

    public static String values() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public final String AFKeystoreWrapper() {
        AFh1uSDK aFh1uSDK = this.AFInAppEventType.AFLogger;
        AFb1zSDK aFb1zSDK = aFh1uSDK != null ? new AFb1zSDK(aFh1uSDK.values, aFh1uSDK.registerClient) : null;
        if (aFb1zSDK != null) {
            return aFb1zSDK.AFInAppEventParameterName;
        }
        return null;
    }

    public final String d() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = AFInAppEventType("CHANNEL");
        }
        if (string != null && string.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return null;
        }
        return string;
    }

    public final boolean unregisterClient() {
        if (!this.AFInAppEventType.valueOf()) {
            return true;
        }
        return false;
    }

    public final boolean AFInAppEventParameterName(String str) {
        String AFInAppEventType = AFInAppEventType(str);
        if (AFInAppEventType != null) {
            return Boolean.parseBoolean(AFInAppEventType);
        }
        return false;
    }

    public final String AFInAppEventType(String str) {
        Object obj;
        try {
            if (this.AFInAppEventParameterName == null) {
                this.AFInAppEventParameterName = ((PackageItemInfo) this.valueOf.AFKeystoreWrapper.getPackageManager().getApplicationInfo(this.valueOf.AFKeystoreWrapper.getPackageName(), 128)).metaData;
            }
            Bundle bundle = this.AFInAppEventParameterName;
            if (bundle == null || (obj = bundle.get(str)) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Could not load manifest metadata!");
            sb2.append(th2.getMessage());
            AFLogger.afErrorLog(sb2.toString(), th2);
            return null;
        }
    }

    @SuppressLint({"DiscouragedApi"})
    public final String AFKeystoreWrapper(String str) {
        try {
            int identifier = this.valueOf.AFKeystoreWrapper.getResources().getIdentifier(str, "string", this.valueOf.AFKeystoreWrapper.getPackageName());
            if (identifier != 0) {
                return this.valueOf.AFKeystoreWrapper.getString(identifier);
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            StringBuilder sb2 = new StringBuilder("Could not load string resource!");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }
}
