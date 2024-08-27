package com.appsflyer.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFa1cSDK implements AFa1bSDK {

    @NotNull
    private Map<String, String> AFInAppEventType = new LinkedHashMap();

    @Override // com.appsflyer.internal.AFa1bSDK
    @NotNull
    public final Map<String, String> valueOf(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFInAppEventType.isEmpty()) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i10 = resources.getConfiguration().screenLayout & 15;
            this.AFInAppEventType.put("xdp", String.valueOf(displayMetrics.xdpi));
            this.AFInAppEventType.put("ydp", String.valueOf(displayMetrics.ydpi));
            this.AFInAppEventType.put("x_px", String.valueOf(displayMetrics.widthPixels));
            this.AFInAppEventType.put("y_px", String.valueOf(displayMetrics.heightPixels));
            this.AFInAppEventType.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            this.AFInAppEventType.put("size", String.valueOf(i10));
        }
        return this.AFInAppEventType;
    }
}
