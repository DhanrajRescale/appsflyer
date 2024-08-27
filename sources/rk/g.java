package rk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f33942a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    public final long f33943b;

    /* renamed from: c, reason: collision with root package name */
    public long f33944c;

    public g(long j10) {
        this.f33943b = j10;
    }

    public final synchronized Object a(Object obj) {
        return this.f33942a.get(obj);
    }

    public int b(Object obj) {
        return 1;
    }

    public void c(Object obj, Object obj2) {
    }

    public final synchronized Object d(Object obj, Object obj2) {
        long b10 = b(obj2);
        if (b10 >= this.f33943b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f33944c += b10;
        }
        Object put = this.f33942a.put(obj, obj2);
        if (put != null) {
            this.f33944c -= b(put);
            if (!put.equals(obj2)) {
                c(obj, put);
            }
        }
        e(this.f33943b);
        return put;
    }

    public final synchronized void e(long j10) {
        while (this.f33944c > j10) {
            Iterator it = this.f33942a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f33944c -= b(value);
            Object key = entry.getKey();
            it.remove();
            c(key, value);
        }
    }
}
