package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1wSDK {

    @NotNull
    public final String AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final String values;

    public AFi1wSDK(@NotNull String str, String str2, String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFInAppEventParameterName = str;
        this.values = str2;
        this.AFKeystoreWrapper = str3;
        this.valueOf = z10;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
