package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class AFd1wSDK {
    public final String[] AFInAppEventType;

    public AFd1wSDK(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            Pattern compile = Pattern.compile("[\\w]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null && compile.matcher(str).matches()) {
                    arrayList.add(str.toLowerCase(Locale.getDefault()));
                } else {
                    AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
                }
            }
            if (arrayList.contains("all")) {
                this.AFInAppEventType = new String[]{"all"};
                return;
            } else if (!arrayList.isEmpty()) {
                this.AFInAppEventType = (String[]) arrayList.toArray(new String[0]);
                return;
            } else {
                this.AFInAppEventType = null;
                return;
            }
        }
        this.AFInAppEventType = null;
    }
}
