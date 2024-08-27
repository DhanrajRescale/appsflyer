package y8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vt.p0;

/* loaded from: classes.dex */
public final class n implements Iterable, ju.a {

    /* renamed from: b, reason: collision with root package name */
    public static final n f41404b = new n(p0.d());

    /* renamed from: a, reason: collision with root package name */
    public final Map f41405a;

    public n(Map map) {
        this.f41405a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            if (Intrinsics.a(this.f41405a, ((n) obj).f41405a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41405a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f41405a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            a3.a.u(entry.getValue());
            arrayList.add(new Pair(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f41405a + ')';
    }
}
