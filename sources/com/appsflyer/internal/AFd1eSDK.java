package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import vt.z;

/* loaded from: classes.dex */
public final class AFd1eSDK {
    @NotNull
    public static final JSONArray AFInAppEventType(@NotNull List<AFd1fSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(z.k(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFd1fSDK) it.next()).AFKeystoreWrapper());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean values(@NotNull HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "");
        if (httpURLConnection.getResponseCode() / 100 == 2) {
            return true;
        }
        return false;
    }
}
