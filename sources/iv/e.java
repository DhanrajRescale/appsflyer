package iv;

import el.l;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import lv.k;
import lv.n;

/* loaded from: classes2.dex */
public abstract class e implements Comparable {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    public static e a(k kVar) {
        l.D0(kVar, "temporal");
        e eVar = (e) kVar.b(n.f25447b);
        if (eVar == null) {
            return f.f20561a;
        }
        return eVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((e) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            ((e) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
