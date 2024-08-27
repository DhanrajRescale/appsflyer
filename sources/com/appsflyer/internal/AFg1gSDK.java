package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1gSDK extends AFg1fSDK {

    @NotNull
    private final AFd1kSDK AFInAppEventParameterName;

    public AFg1gSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFInAppEventParameterName = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z12) {
            if (w.C(str)) {
                str = "missing label";
            }
            this.AFInAppEventParameterName.getCurrency().values(th2, withTag$SDK_prodRelease(str, aFg1aSDK));
        }
    }
}
