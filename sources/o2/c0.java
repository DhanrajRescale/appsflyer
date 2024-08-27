package o2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29458a;

    public c0(b0... b0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (b0VarArr.length <= 0) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    vt.d0.m(list, arrayList);
                } else {
                    throw new IllegalArgumentException(nn.d.n(da.e.s("'", str, "' must be unique. Actual [ ["), vt.g0.B(list, null, null, null, null, 63), ']').toString());
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f29458a = arrayList2;
            if (arrayList2.size() <= 0) {
                return;
            }
            a3.a.u(arrayList2.get(0));
            throw null;
        }
        b0 b0Var = b0VarArr[0];
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c0) && Intrinsics.a(this.f29458a, ((c0) obj).f29458a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29458a.hashCode();
    }
}
