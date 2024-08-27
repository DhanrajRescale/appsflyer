package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class AFg1wSDK {

    @NonNull
    public final AFg1uSDK AFInAppEventParameterName;
    Map<String, Object> AFInAppEventType;

    @NonNull
    public final AFd1lSDK AFKeystoreWrapper;
    public volatile String AFLogger;
    public volatile String unregisterClient;
    public long valueOf;
    public boolean values = false;
    public volatile boolean registerClient = false;

    public AFg1wSDK(@NonNull AFd1lSDK aFd1lSDK, @NonNull AFg1uSDK aFg1uSDK) {
        this.AFKeystoreWrapper = aFd1lSDK;
        this.AFInAppEventParameterName = aFg1uSDK;
    }

    private boolean AFInAppEventType() {
        Map<String, Object> map = this.AFInAppEventType;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    public final String AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        String str;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFKeystoreWrapper = aFd1qSDK.AFKeystoreWrapper("imeiCached", (String) null);
        if (z10 && AFc1tSDK.values(this.unregisterClient)) {
            Context context = this.AFKeystoreWrapper.AFKeystoreWrapper;
            if (context != null && AFKeystoreWrapper(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e10) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e10.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e10);
                } catch (Exception e11) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11);
                }
                if (str == null) {
                    if (AFKeystoreWrapper != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFKeystoreWrapper));
                    } else {
                        AFKeystoreWrapper = null;
                    }
                    str = AFKeystoreWrapper;
                }
            }
            str = null;
        } else {
            if (this.unregisterClient != null) {
                str = this.unregisterClient;
            }
            str = null;
        }
        if (!AFc1tSDK.values(str)) {
            aFd1qSDK.AFInAppEventParameterName("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final boolean AFKeystoreWrapper() {
        return this.registerClient;
    }

    public final boolean valueOf() {
        return this.values && !AFInAppEventType();
    }

    public final void values() {
        this.AFInAppEventType.put("ttr", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFInAppEventType.put("lvl_timestamp", Long.valueOf(this.valueOf));
    }

    private static boolean AFKeystoreWrapper(Context context) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        AFb1vSDK.AFKeystoreWrapper();
        return !AFb1vSDK.values(context);
    }

    public final Map<String, Object> valueOf(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.AFKeystoreWrapper.AFKeystoreWrapper};
                Map<Integer, Object> map2 = AFc1fSDK.afDebugLog;
                Object obj = map2.get(1237996881);
                if (obj == null) {
                    obj = ((Class) AFc1fSDK.valueOf(KeyEvent.getDeadChar(0, 0) + 37, 125 - Color.red(0), (char) ((-1) - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0', 0)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(1237996881, obj);
                }
                return (Map) ((Constructor) obj).newInstance(objArr);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th3);
            return new HashMap();
        }
    }

    @NonNull
    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventType()) {
            hashMap.put("lvl", this.AFInAppEventType);
        } else if (this.values) {
            this.AFInAppEventType = new HashMap();
            values();
            this.AFInAppEventType.put("error", "pending LVL response");
            hashMap.put("lvl", this.AFInAppEventType);
        }
        return hashMap;
    }
}
