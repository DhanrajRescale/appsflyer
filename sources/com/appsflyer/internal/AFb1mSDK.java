package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* loaded from: classes.dex */
public final class AFb1mSDK {
    private static String AFInAppEventParameterName;
    private static String AFKeystoreWrapper;

    public static void AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null) {
            valueOf(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().i().AFLogger);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventParameterName));
        }
    }

    public static void valueOf(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 != 0 && i10 != str.length() - 1) {
                sb2.append("*");
            } else {
                sb2.append(str.charAt(i10));
            }
        }
        AFInAppEventParameterName = sb2.toString();
    }
}
