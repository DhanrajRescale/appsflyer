package vt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class p0 extends o0 {
    public static Map d() {
        j0 j0Var = j0.f38323a;
        Intrinsics.d(j0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return j0Var;
    }

    public static Object e(Object obj, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Object obj2 = hashMap.get(obj);
        if (obj2 == null && !hashMap.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static HashMap f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(o0.a(pairs.length));
        i(hashMap, pairs);
        return hashMap;
    }

    public static Map g(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length > 0) {
            LinkedHashMap destination = new LinkedHashMap(o0.a(pairs.length));
            Intrinsics.checkNotNullParameter(pairs, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            i(destination, pairs);
            return destination;
        }
        return d();
    }

    public static LinkedHashMap h(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(pairs.length));
        i(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final void i(HashMap hashMap, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            hashMap.put(pair.f23353a, pair.f23354b);
        }
    }

    public static Map j(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(o0.a(arrayList.size()));
                l(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            return o0.b((Pair) arrayList.get(0));
        }
        return d();
    }

    public static Map k(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return m(map);
            }
            return o0.c(map);
        }
        return d();
    }

    public static final void l(ArrayList pairs, LinkedHashMap destination) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(destination, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            destination.put(pair.f23353a, pair.f23354b);
        }
    }

    public static LinkedHashMap m(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
