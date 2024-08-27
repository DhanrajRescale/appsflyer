package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1tSDK implements AFj1uSDK {
    @Override // com.appsflyer.internal.AFj1uSDK
    @NotNull
    public final String AFInAppEventParameterName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, AppsFlyerLib.getInstance().getHostPrefix(), AFb1vSDK.AFKeystoreWrapper().getHostName());
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
