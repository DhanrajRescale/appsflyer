package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import vt.l0;
import vt.z;

/* loaded from: classes.dex */
public final class AFj1sSDK {
    private static final List<Object> AFInAppEventType(JSONArray jSONArray) {
        IntRange k10 = kotlin.ranges.d.k(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(z.k(k10));
        Iterator<Integer> it = k10.iterator();
        while (((nu.f) it).f29173c) {
            Object obj = jSONArray.get(((l0) it).b());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(values(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> values(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        Sequence b10 = pu.m.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : b10) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, values(obj2));
        }
        return linkedHashMap;
    }

    private static final Object values(Object obj) {
        if (obj instanceof JSONArray) {
            return AFInAppEventType((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return values((JSONObject) obj);
        }
        if (Intrinsics.a(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
