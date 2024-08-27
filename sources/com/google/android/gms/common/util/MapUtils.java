package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes2.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb2, @NonNull HashMap<String, String> hashMap) {
        sb2.append(UrlTreeKt.componentParamPrefix);
        boolean z10 = true;
        for (String str : hashMap.keySet()) {
            if (!z10) {
                sb2.append(",");
            }
            String str2 = hashMap.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z10 = false;
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
    }
}
