package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFg1mSDK {
    Long AFInAppEventParameterName();

    long AFInAppEventType();

    void AFInAppEventType(@NotNull AFa1qSDK aFa1qSDK);

    void AFInAppEventType(@NotNull Map<String, Object> map);

    void AFInAppEventType(@NotNull Map<String, Object> map, boolean z10, @NotNull Function0<String> function0);

    void AFKeystoreWrapper(@NotNull AFa1qSDK aFa1qSDK);

    void valueOf(@NotNull AFa1qSDK aFa1qSDK);

    void valueOf(@NotNull Map<String, Object> map);

    void valueOf(@NotNull Map<String, Object> map, int i10, int i11);

    void values(@NotNull AFa1qSDK aFa1qSDK);

    void values(@NotNull Map<String, Object> map);
}
