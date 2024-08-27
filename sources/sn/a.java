package sn;

import android.util.SparseArray;
import gn.c;
import java.util.HashMap;
import jr.h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f34721a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f34722b;

    static {
        HashMap hashMap = new HashMap();
        f34722b = hashMap;
        hashMap.put(c.f17525a, 0);
        hashMap.put(c.f17526b, 1);
        hashMap.put(c.f17527c, 2);
        for (c cVar : hashMap.keySet()) {
            f34721a.append(((Integer) f34722b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f34722b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i10) {
        c cVar = (c) f34721a.get(i10);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(h.n("Unknown Priority for value ", i10));
    }
}
