package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1zSDK {
    public static boolean AFInAppEventType(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int valueOf = AFc1rSDK.valueOf(str);
        int valueOf2 = AFc1rSDK.valueOf(str2);
        Pair<Integer, Integer> values = AFe1vSDK.values(str2);
        Pair<Integer, Integer> valueOf3 = AFe1vSDK.valueOf(str2);
        if (valueOf2 != -1 && values == null) {
            if (valueOf2 == valueOf) {
                return true;
            }
            return false;
        }
        if (valueOf3 != null) {
            if (((Number) valueOf3.f23353a).intValue() <= valueOf && valueOf <= ((Number) valueOf3.f23354b).intValue()) {
                return true;
            }
            return false;
        }
        if (values != null && ((Number) values.f23353a).intValue() <= valueOf && valueOf <= ((Number) values.f23354b).intValue()) {
            return true;
        }
        return false;
    }
}
