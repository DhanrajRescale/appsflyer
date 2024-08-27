package com.appsflyer.internal;

import com.appsflyer.internal.AFe1cSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFc1uSDK implements Runnable {
    private final Map<String, Object> AFInAppEventParameterName;

    @NotNull
    private final AFd1kSDK AFInAppEventType;

    @NotNull
    private final AFa1qSDK values;

    public AFc1uSDK(@NotNull AFd1kSDK aFd1kSDK, @NotNull AFa1qSDK aFa1qSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1qSDK, "");
        this.AFInAppEventType = aFd1kSDK;
        this.values = aFa1qSDK;
        this.AFInAppEventParameterName = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1lSDK aFf1lSDK;
        if (this.values.AFInAppEventType()) {
            AFf1cSDK aFf1cSDK = new AFf1cSDK(this.values, this.AFInAppEventType);
            aFf1cSDK.f8441i = this.AFInAppEventParameterName;
            aFf1lSDK = aFf1cSDK;
        } else {
            aFf1lSDK = new AFf1lSDK(this.values, this.AFInAppEventType);
        }
        AFe1cSDK afInfoLog = this.AFInAppEventType.afInfoLog();
        afInfoLog.valueOf.execute(new AFe1cSDK.AnonymousClass2(aFf1lSDK));
        if (aFf1lSDK.AFInAppEventType == AFf1zSDK.CONVERSION) {
            this.AFInAppEventType.afVerboseLog();
            if (AFe1gSDK.valueOf() && AFb1uSDK.AFKeystoreWrapper(this.AFInAppEventType.w().AFKeystoreWrapper)) {
                AFe1cSDK afInfoLog2 = this.AFInAppEventType.afInfoLog();
                afInfoLog2.valueOf.execute(new AFe1cSDK.AnonymousClass2(new AFf1qSDK(this.AFInAppEventType, "install")));
            }
        }
    }
}
