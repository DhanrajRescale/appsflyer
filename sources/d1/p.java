package d1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import vt.p0;
import vt.y;

/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f13285a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13286b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13287c;

    public p(Map map, Function1 function1) {
        LinkedHashMap linkedHashMap;
        this.f13285a = function1;
        if (map != null) {
            linkedHashMap = p0.m(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.f13286b = linkedHashMap;
        this.f13287c = new LinkedHashMap();
    }

    @Override // d1.n
    public final boolean a(Object obj) {
        return ((Boolean) this.f13285a.invoke(obj)).booleanValue();
    }

    @Override // d1.n
    public final Map b() {
        LinkedHashMap m10 = p0.m(this.f13286b);
        for (Map.Entry entry : this.f13287c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object mo2invoke = ((Function0) list.get(0)).mo2invoke();
                if (mo2invoke == null) {
                    continue;
                } else if (a(mo2invoke)) {
                    m10.put(str, y.c(mo2invoke));
                } else {
                    throw new IllegalStateException("item can't be saved".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object mo2invoke2 = ((Function0) list.get(i10)).mo2invoke();
                    if (mo2invoke2 != null && !a(mo2invoke2)) {
                        throw new IllegalStateException("item can't be saved".toString());
                    }
                    arrayList.add(mo2invoke2);
                }
                m10.put(str, arrayList);
            }
        }
        return m10;
    }

    @Override // d1.n
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f13286b;
        List list = (List) linkedHashMap.remove(str);
        if (list != null && (!list.isEmpty())) {
            if (list.size() > 1) {
                linkedHashMap.put(str, list.subList(1, list.size()));
            }
            return list.get(0);
        }
        return null;
    }

    @Override // d1.n
    public final m d(String str, Function0 function0) {
        int length = str.length() - 1;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!CharsKt.b(str.charAt(i10))) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            LinkedHashMap linkedHashMap = this.f13287c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(function0);
            return new o(this, str, function0);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
