package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1bSDK extends AFg1fSDK {
    private final boolean AFInAppEventParameterName;

    @NotNull
    private final AFd1kSDK valueOf;

    public AFg1bSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.valueOf = aFd1kSDK;
        this.AFInAppEventParameterName = true;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void d(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.valueOf.v().AFKeystoreWrapper("D", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z13) {
            this.valueOf.v().AFKeystoreWrapper("E", values(str, aFg1aSDK));
        }
        if (z13) {
            this.valueOf.v().values(th2);
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void force(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.v().AFKeystoreWrapper("F", values(str, aFg1aSDK));
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final boolean getShouldExtendMsg() {
        return this.AFInAppEventParameterName;
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void i(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.valueOf.v().AFKeystoreWrapper("I", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void v(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.valueOf.v().AFKeystoreWrapper("V", values(str, aFg1aSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1fSDK
    public final void w(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.valueOf.v().AFKeystoreWrapper("W", values(str, aFg1aSDK));
        }
    }
}
