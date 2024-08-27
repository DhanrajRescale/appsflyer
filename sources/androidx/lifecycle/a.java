package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1874a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f1875b;

    public a(HashMap hashMap) {
        this.f1875b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            m mVar = (m) entry.getValue();
            List list = (List) this.f1874a.get(mVar);
            if (list == null) {
                list = new ArrayList();
                this.f1874a.put(mVar, list);
            }
            list.add((b) entry.getKey());
        }
    }

    public static void a(List list, t tVar, m mVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                bVar.getClass();
                try {
                    int i10 = bVar.f1879a;
                    Method method = bVar.f1880b;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                method.invoke(obj, tVar, mVar);
                            }
                        } else {
                            method.invoke(obj, tVar);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
