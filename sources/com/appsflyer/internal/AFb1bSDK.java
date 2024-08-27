package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFb1bSDK {
    void AFInAppEventParameterName();

    void AFInAppEventParameterName(@NotNull String str, @NotNull String... strArr);

    void AFInAppEventType();

    void AFKeystoreWrapper();

    void AFKeystoreWrapper(@NotNull String str, int i10, @NotNull String str2);

    void AFKeystoreWrapper(@NotNull String str, @NotNull String str2);

    boolean e();

    void valueOf();

    void valueOf(@NotNull String str, @NotNull String str2);

    void values(String str, PackageManager packageManager);

    void values(@NotNull Throwable th2);

    boolean values();
}
