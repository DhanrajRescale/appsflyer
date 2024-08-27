package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFd1gSDK {
    String AFInAppEventParameterName(@NotNull Throwable th2, @NotNull String str);

    @NotNull
    List<AFd1fSDK> AFInAppEventParameterName();

    void AFInAppEventType(int i10, int i11);

    boolean AFInAppEventType();

    boolean AFInAppEventType(@NotNull String... strArr);

    int values();
}
