package jv;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21736a;

    public x(Map map) {
        this.f21736a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (z zVar : map.keySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : ((Map) map.get(zVar)).entrySet()) {
                Object value = entry.getValue();
                Object value2 = entry.getValue();
                Object key = entry.getKey();
                c2.p pVar = y.f21737c;
                hashMap2.put(value, new AbstractMap.SimpleImmutableEntry(value2, key));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, y.f21737c);
            hashMap.put(zVar, arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, y.f21737c);
    }
}
